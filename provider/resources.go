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
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
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

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(field string) tokens.Type {
    return tfbridge.MakeResource(mainPkg, mainMod, field)
}

func makeDataSource(field string) tokens.ModuleMember {
    return tfbridge.MakeDataSource(mainPkg, mainMod, field)
}

type ComputeID = info.ComputeID

func delegateIDField(field resource.PropertyKey) ComputeID {
	return tfbridge.DelegateIDField(field, mainPkg, mainMod)
}

//go:embed cmd/pulumi-resource-fivetran/bridge-metadata.json
var bridgeMetadata []byte

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

        MetadataInfo:     tfbridge.NewProviderMetadata(bridgeMetadata),
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
			"fivetran_connector":                   {Tok: makeResource("Connector")},
			"fivetran_connector_certificates":      {Tok: makeResource("ConnectorCertificates")},
			"fivetran_connector_fingerprints":      {Tok: makeResource("ConnectorFingerprints")},
			"fivetran_connector_schedule":          {Tok: makeResource("ConnectorSchedule")},
			"fivetran_connector_schema_config":     {Tok: makeResource("ConnectorSchemaConfig")},
			"fivetran_dbt_project":                 {Tok: makeResource("DbtProject")},
			"fivetran_dbt_transformation":          {Tok: makeResource("DbtTransformation")},
			"fivetran_destination":                 {Tok: makeResource("Destination")},
			"fivetran_destination_certificates":    {Tok: makeResource("DestinationCertificates")},
			"fivetran_destination_fingerprints":    {Tok: makeResource("DestinationFingerprints")},
			"fivetran_external_logging":            {Tok: makeResource("ExternalLogging")},
			"fivetran_group":                       {Tok: makeResource("Group")},
			"fivetran_group_users":                 {Tok: makeResource("GroupUsers")},
			"fivetran_team":       				    {Tok: makeResource("Team")},
			"fivetran_team_connector_membership":   {Tok: makeResource("TeamConnectorMembership")},
			"fivetran_team_user_membership":        {Tok: makeResource("TeamUserMembership")},
			"fivetran_user":                        {Tok: makeResource("User")},
			"fivetran_user_connector_membership":   {
			    Tok: makeResource("UserConnectorMembership"),
			    ComputeID: delegateIDField(resource.PropertyKey("key")),
			},
			"fivetran_user_group_membership":       {
			    Tok: makeResource("UserGroupMembership"),
                ComputeID: delegateIDField(resource.PropertyKey("key")),
			},
			"fivetran_webhook":                     {Tok: makeResource("Webhook")},
		    "fivetran_team_group_membership":       {Tok: makeResource("TeamGroupMembership")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"fivetran_connector":                       {Tok: makeDataSource("getConnector")},
			"fivetran_connector_certificates":          {Tok: makeDataSource("getConnectorCertificates")},
			"fivetran_connector_fingerprints":          {Tok: makeDataSource("getConnectorFingerprints")},
			"fivetran_connectors_metadata":             {Tok: makeDataSource("getConnectorsMetadata")},
			"fivetran_dbt_models":                      {Tok: makeDataSource("getDbtModels")},
			"fivetran_dbt_project":                     {Tok: makeDataSource("getDbtProject")},
			"fivetran_dbt_projects":                    {Tok: makeDataSource("getDbtProjects")},
			"fivetran_dbt_transformation":              {Tok: makeDataSource("getDbtTransformation")},
			"fivetran_destination":                     {Tok: makeDataSource("getDestination")},
			"fivetran_destination_certificates":        {Tok: makeDataSource("getDestinationCertificates")},
			"fivetran_destination_fingerprints":        {Tok: makeDataSource("getDestinationFingerprints")},
			"fivetran_external_logging":    		    {Tok: makeDataSource("getExternalLogging")},
			"fivetran_group":                           {Tok: makeDataSource("getGroup")},
			"fivetran_group_connectors":                {Tok: makeDataSource("getGroupConnectors")},
			"fivetran_group_service_account":           {Tok: makeDataSource("getGroupServiceAccount")},
			"fivetran_group_ssh_key":                   {Tok: makeDataSource("getGroupSshKey")},
			"fivetran_groups":                          {Tok: makeDataSource("getGroups")},
			"fivetran_roles":              			    {Tok: makeDataSource("getRoles")},
			"fivetran_team":         	                {Tok: makeDataSource("getTeam")},
			"fivetran_team_connector_memberships":      {Tok: makeDataSource("getTeamConnectorMemberships")},
			"fivetran_teams":                           {Tok: makeDataSource("getTeams")},
			"fivetran_user":                            {Tok: makeDataSource("getUser")},
			"fivetran_users":                           {Tok: makeDataSource("getUsers")},
			"fivetran_webhook":                         {Tok: makeDataSource("getWebhook")},
			"fivetran_webhooks":                        {Tok: makeDataSource("getWebhooks")},
            "fivetran_group_users":                     {Tok: makeDataSource("getGroupUsers")},
            "fivetran_team_group_memberships":          {Tok: makeDataSource("getTeamGroupMemberships")},
            "fivetran_team_user_memberships":           {Tok: makeDataSource("getTeamUserMemberships")},
            "fivetran_user_connector_memberships":      {Tok: makeDataSource("getUserConnectorMemberships")},
            "fivetran_user_group_memberships":          {Tok: makeDataSource("getUserGroupMemberships")},
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
