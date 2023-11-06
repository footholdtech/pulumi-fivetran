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
	"fmt"
	"path/filepath"

	"github.com/fivetran/terraform-provider-fivetran/fivetran"
	"github.com/footholdtech/pulumi-fivetran/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
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

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(fivetran.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "fivetran",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Fivetran",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "Footholdtech",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "github://api.github.com/footholdtech/pulumi-fivetran",
		Description:       "A Pulumi package for creating and managing Fivetran cloud resources.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords:   []string{"pulumi", "fivetran", "category/utility"},
		License:    "Apache-2.0",
		Homepage:   "https://www.pulumi.com",
		Repository: "https://github.com/footholdtech/pulumi-fivetran",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg: "fivetran",
		Config: map[string]*tfbridge.SchemaInfo{
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
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			// Map each resource in the Terraform provider to a Pulumi type. Two examples
			// are below - the single line form is the common case. The multi-line form is
			// needed only if you wish to override types or other default options.
			//
			// "aws_iam_role": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IamRole")}
			//
			// "aws_acm_certificate": {
			// 	Tok: tfbridge.MakeResource(mainPkg, mainMod, "Certificate"),
			// 	Fields: map[string]*tfbridge.SchemaInfo{
			// 		"tags": {Type: tfbridge.MakeType(mainPkg, "Tags")},
			// 	},
			// },
			"fivetran_user":                        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "User")},
			"fivetran_group":                       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Group")},
			"fivetran_group_users":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "GroupUsers")},
			"fivetran_destination":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Destination")},
			"fivetran_destination_certificates":    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "DestinationCertificates")},
			"fivetran_destination_fingerprints":    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "DestinationFingerprints")},
			"fivetran_connector":                   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Connector")},
			"fivetran_connector_certificates":      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ConnectorCertificates")},
			"fivetran_connector_fingerprints":      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ConnectorFingerprints")},
			"fivetran_connector_schedule":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ConnectorSchedule")},
			"fivetran_connector_schema_config":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ConnectorSchemaConfig")},
			"fivetran_dbt_transformation":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "DbtTransformation")},
			"fivetran_dbt_project":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "DbtProject")},
			"fivetran_webhook":                     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Webhook")},
			"fivetran_external_logging":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ExternalLogging")},
			"fivetran_team":       				    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Team")},
			"fivetran_team_connector_membership":   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TeamConnectorMembership")},
		    "fivetran_team_group_membership":       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TeamGroupMembership")},
			"fivetran_team_user_membership":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TeamUserMembership")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Map each resource in the Terraform provider to a Pulumi function. An example
			// is below.
			// "aws_ami": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAmi")},
			"fivetran_user":                            {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getUser")},
			"fivetran_users":                           {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getUsers")},
			"fivetran_group":                           {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getGroup")},
			"fivetran_groups":                          {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getGroups")},
			"fivetran_group_connectors":                {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getGroupConnectors")},
        "fivetran_group_users":                         {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getGroupUsers")},
			"fivetran_destination":                     {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDestination")},
			"fivetran_destination_certificates":        {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDestinationCertificates")},
			"fivetran_destination_fingerprints":        {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDestinationFingerprints")},
			"fivetran_connectors_metadata":             {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getConnectorsMetadata")},
			"fivetran_connector":                       {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getConnector")},
			"fivetran_connector_certificates":          {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getConnectorCertificates")},
			"fivetran_connector_fingerprints":          {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getConnectorFingerprints")},
			"fivetran_dbt_transformation":              {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDbtTransformation")},
			"fivetran_dbt_project":                     {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDbtProject")},
			"fivetran_dbt_projects":                    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDbtProjects")},
			"fivetran_dbt_models":                      {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDbtModels")},
			"fivetran_webhook":                         {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getWebhook")},
			"fivetran_webhooks":                        {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getWebhooks")},
			"fivetran_external_logging":    		    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getExternalLogging")},
			"fivetran_roles":              			    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getRoles")},
			"fivetran_metadata_schemas":    		    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getMetadataSchemas")},
			"fivetran_metadata_tables":    		    	{Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getMetadataTables")},
			"fivetran_metadata_columns":    	    	{Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getMetadataColumns")},
			"fivetran_team":         	                {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTeam")},
			"fivetran_teams":                           {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTeams")},
			"fivetran_team_connector_memberships":      { Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTeamConnectorMemberships") },
            "fivetran_team_group_memberships":          { Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTeamGroupMemberships") },
            "fivetran_team_user_memberships":           { Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTeamUserMemberships") },
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
