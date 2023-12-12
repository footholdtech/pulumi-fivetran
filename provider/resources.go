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
	"context"
	_ "embed"
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/fivetran/terraform-provider-fivetran/fivetran"
	"github.com/fivetran/terraform-provider-fivetran/fivetran/framework"
	"github.com/footholdtech/pulumi-fivetran/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "fivetran"
	// modules:
	mainMod = "index" // the fivetran module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

//go:embed cmd/pulumi-resource-fivetran/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// p := shimv2.NewProvider(fivetran.Provider())
	p := pfbridge.MuxShimWithPF(context.Background(),
		shimv2.NewProvider(fivetran.Provider()),
		framework.FivetranProvider(),
	)

	prov := tfbridge.ProviderInfo{
        P:              p,
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

        MetadataInfo:     tfbridge.NewProviderMetadata(metadata),
        Version:          version.Version,

		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg: "fivetran",
		Config: map[string]*tfbridge.SchemaInfo {
			// Add any required configuration here, or remove the example below if
			// no additional points are required.
			// "region": {
			// 	Type: tfbridge.MakeType("region", "Region"),
			// 	Default: &tfbridge.DefaultInfo{
			// 		EnvVars: []string{"AWS_REGION", "AWS_DEFAULT_REGION"},
			// 	},
			// },
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
		Resources: map[string]*tfbridge.ResourceInfo{
			"fivetran_connector":                   {Tok: makeResource(mainMod, "Connector")},
			"fivetran_connector_certificates":      {Tok: makeResource(mainMod, "ConnectorCertificates")},
			"fivetran_connector_fingerprints":      {Tok: makeResource(mainMod, "ConnectorFingerprints")},
			"fivetran_connector_schedule":          {Tok: makeResource(mainMod, "ConnectorSchedule")},
			"fivetran_connector_schema_config":     {Tok: makeResource(mainMod, "ConnectorSchemaConfig")},
			"fivetran_dbt_project":                 {Tok: makeResource(mainMod, "DbtProject")},
			"fivetran_dbt_transformation":          {Tok: makeResource(mainMod, "DbtTransformation")},
			"fivetran_destination":                 {Tok: makeResource(mainMod, "Destination")},
			"fivetran_destination_certificates":    {Tok: makeResource(mainMod, "DestinationCertificates")},
			"fivetran_destination_fingerprints":    {Tok: makeResource(mainMod, "DestinationFingerprints")},
			"fivetran_external_logging":            {Tok: makeResource(mainMod, "ExternalLogging")},
			"fivetran_group":                       {Tok: makeResource(mainMod, "Group")},
			"fivetran_group_users":                 {Tok: makeResource(mainMod, "GroupUsers")},
			"fivetran_team":       				    {Tok: makeResource(mainMod, "Team")},
			"fivetran_team_connector_membership":   {Tok: makeResource(mainMod, "TeamConnectorMembership")},
			"fivetran_team_user_membership":        {Tok: makeResource(mainMod, "TeamUserMembership")},
			"fivetran_user":                        {Tok: makeResource(mainMod, "User")},
			"fivetran_webhook":                     {Tok: makeResource(mainMod, "Webhook")},
		    "fivetran_team_group_membership":       {Tok: makeResource(mainMod, "TeamGroupMembership")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"fivetran_connector":                       {Tok: makeDataSource(mainMod, "getConnector")},
			"fivetran_connector_certificates":          {Tok: makeDataSource(mainMod, "getConnectorCertificates")},
			"fivetran_connector_fingerprints":          {Tok: makeDataSource(mainMod, "getConnectorFingerprints")},
			"fivetran_connectors_metadata":             {Tok: makeDataSource(mainMod, "getConnectorsMetadata")},
			"fivetran_dbt_models":                      {Tok: makeDataSource(mainMod, "getDbtModels")},
			"fivetran_dbt_project":                     {Tok: makeDataSource(mainMod, "getDbtProject")},
			"fivetran_dbt_projects":                    {Tok: makeDataSource(mainMod, "getDbtProjects")},
			"fivetran_dbt_transformation":              {Tok: makeDataSource(mainMod, "getDbtTransformation")},
			"fivetran_destination":                     {Tok: makeDataSource(mainMod, "getDestination")},
			"fivetran_destination_certificates":        {Tok: makeDataSource(mainMod, "getDestinationCertificates")},
			"fivetran_destination_fingerprints":        {Tok: makeDataSource(mainMod, "getDestinationFingerprints")},
			"fivetran_external_logging":    		    {Tok: makeDataSource(mainMod, "getExternalLogging")},
			"fivetran_group":                           {Tok: makeDataSource(mainMod, "getGroup")},
			"fivetran_group_connectors":                {Tok: makeDataSource(mainMod, "getGroupConnectors")},
			"fivetran_group_service_account":           {Tok: makeDataSource(mainMod, "getGroupServiceAccount")},
			"fivetran_group_ssh_key":                   {Tok: makeDataSource(mainMod, "getGroupSshKey")},
			"fivetran_groups":                          {Tok: makeDataSource(mainMod, "getGroups")},
			"fivetran_metadata_columns":    	    	{Tok: makeDataSource(mainMod, "getMetadataColumns")},
			"fivetran_metadata_schemas":    		    {Tok: makeDataSource(mainMod, "getMetadataSchemas")},
			"fivetran_metadata_tables":    		    	{Tok: makeDataSource(mainMod, "getMetadataTables")},
			"fivetran_roles":              			    {Tok: makeDataSource(mainMod, "getRoles")},
			"fivetran_team":         	                {Tok: makeDataSource(mainMod, "getTeam")},
			"fivetran_team_connector_memberships":      { Tok: makeDataSource(mainMod, "getTeamConnectorMemberships") },
			"fivetran_teams":                           {Tok: makeDataSource(mainMod, "getTeams")},
			"fivetran_user":                            {Tok: makeDataSource(mainMod, "getUser")},
			"fivetran_users":                           {Tok: makeDataSource(mainMod, "getUsers")},
			"fivetran_webhook":                         {Tok: makeDataSource(mainMod, "getWebhook")},
			"fivetran_webhooks":                        {Tok: makeDataSource(mainMod, "getWebhooks")},
            "fivetran_group_users":                     {Tok: makeDataSource(mainMod, "getGroupUsers")},
            "fivetran_team_group_memberships":          { Tok: makeDataSource(mainMod, "getTeamGroupMemberships") },
            "fivetran_team_user_memberships":           { Tok: makeDataSource(mainMod, "getTeamUserMemberships") },
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@footholdtech/fivetran",
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
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

	prov.SetAutonaming(255, "-")

	return prov
}
