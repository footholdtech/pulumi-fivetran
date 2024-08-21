// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package fivetran

import (
	// Allow embedding files
	_ "embed"
	"fmt"
	"path/filepath"

	"github.com/fivetran/terraform-provider-fivetran/fivetran/framework"
	"github.com/footholdtech/pulumi-fivetran/provider/pkg/version"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "fivetran"
	// modules:
	mainMod = "index" // the fivetran module
)

type ComputeID = info.ComputeID

func delegateIDField(field resource.PropertyKey) ComputeID {
	return tfbridge.DelegateIDField(field, mainPkg, mainMod)
}

//go:embed cmd/pulumi-resource-fivetran/bridge-metadata.json
var metadata []byte

func Provider() tfbridge.ProviderInfo {
	prov := tfbridge.ProviderInfo{
        P:              pf.ShimProvider(framework.FivetranProvider()),
        Name:           "fivetran",
        Description:    "A Pulumi package for creating and managing Fivetran resources.",
        Keywords:       []string{"pulumi", "fivetran"},
        License:        "Apache-2.0",
        Homepage:       "https://pulumi.io",
        Repository:     "https://github.com/footholdtech/pulumi-fivetran",
        Publisher:      "Foothold Technology",

        // PluginDownloadURL is an optional URL used to download the Provider
        // for use in Pulumi programs
        // e.g https://github.com/org/pulumi-provider-name/releases/
        PluginDownloadURL: "github://api.github.com/footholdtech/pulumi-fivetran",

		MetadataInfo: tfbridge.NewProviderMetadata(metadata),

        Version:          version.Version,

		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg: "fivetran",
		Config: map[string]*tfbridge.SchemaInfo {
			"api_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"FIVETRAN_APIKEY"},
				},
			},
			"api_secret": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"FIVETRAN_APISECRET"},
				},
			},
			"api_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"FIVETRAN_APIURL"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo {
			"fivetran_user_connector_membership":   {
			    ComputeID: delegateIDField(resource.PropertyKey("key")),
			},
			"fivetran_user_group_membership":       {
                ComputeID: delegateIDField(resource.PropertyKey("key")),
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@footholdtech/fivetran",
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "footholdtech_fivetran",
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/footholdtech/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Footholdtech",
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "com.footholdtech",
		},
	}

    prov.MustComputeTokens(tokens.SingleModule("xyz_", mainMod,
		    tokens.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}
