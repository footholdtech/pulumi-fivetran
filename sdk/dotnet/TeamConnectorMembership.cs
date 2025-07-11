// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran
{
    /// <summary>
    /// This resource allows you to create, update, and delete connector membership for teams
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Fivetran = Footholdtech.Fivetran;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testTeamConnectorMembership = new Fivetran.TeamConnectorMembership("test_team_connector_membership", new()
    ///     {
    ///         TeamId = "test_team",
    ///         Connectors = new[]
    ///         {
    ///             new Fivetran.Inputs.TeamConnectorMembershipConnectorArgs
    ///             {
    ///                 ConnectorId = "test_connector",
    ///                 Role = "Connector Administrator",
    ///                 CreatedAt = "2020-05-25T15:26:47.306509Z",
    ///             },
    ///             new Fivetran.Inputs.TeamConnectorMembershipConnectorArgs
    ///             {
    ///                 ConnectorId = "test_connector",
    ///                 Role = "Connector Administrator",
    ///                 CreatedAt = "2020-05-25T15:26:47.306509Z",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// 1. To import an existing `fivetran_team_connector_membership` resource into your Terraform state, you need to get `team_id` and `connector_id`
    /// 
    /// You can retrieve all teams using the [fivetran_teams data source](/docs/data-sources/teams).
    /// 
    /// 2. Define an empty resource in your `.tf` configuration:
    /// 
    /// hcl
    /// 
    /// resource "fivetran_team_connector_membership" "my_imported_fivetran_team_connector_membership" {
    /// 
    /// }
    /// 
    /// 3. Run the `pulumi import` command:
    /// 
    /// ```sh
    /// $ pulumi import fivetran:index/teamConnectorMembership:TeamConnectorMembership my_imported_fivetran_team_connector_membership {team_id}
    /// ```
    /// 
    /// 4. Use the `terraform state show` command to get the values from the state:
    /// 
    /// terraform state show 'fivetran_team_connector_membership.my_imported_fivetran_team_connector_membership'
    /// 
    /// 5. Copy the values and paste them to your `.tf` configuration.
    /// </summary>
    [FivetranResourceType("fivetran:index/teamConnectorMembership:TeamConnectorMembership")]
    public partial class TeamConnectorMembership : global::Pulumi.CustomResource
    {
        [Output("connectors")]
        public Output<ImmutableArray<Outputs.TeamConnectorMembershipConnector>> Connectors { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the team within your account.
        /// </summary>
        [Output("teamId")]
        public Output<string> TeamId { get; private set; } = null!;


        /// <summary>
        /// Create a TeamConnectorMembership resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TeamConnectorMembership(string name, TeamConnectorMembershipArgs args, CustomResourceOptions? options = null)
            : base("fivetran:index/teamConnectorMembership:TeamConnectorMembership", name, args ?? new TeamConnectorMembershipArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TeamConnectorMembership(string name, Input<string> id, TeamConnectorMembershipState? state = null, CustomResourceOptions? options = null)
            : base("fivetran:index/teamConnectorMembership:TeamConnectorMembership", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/footholdtech/pulumi-fivetran",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TeamConnectorMembership resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TeamConnectorMembership Get(string name, Input<string> id, TeamConnectorMembershipState? state = null, CustomResourceOptions? options = null)
        {
            return new TeamConnectorMembership(name, id, state, options);
        }
    }

    public sealed class TeamConnectorMembershipArgs : global::Pulumi.ResourceArgs
    {
        [Input("connectors")]
        private InputList<Inputs.TeamConnectorMembershipConnectorArgs>? _connectors;
        public InputList<Inputs.TeamConnectorMembershipConnectorArgs> Connectors
        {
            get => _connectors ?? (_connectors = new InputList<Inputs.TeamConnectorMembershipConnectorArgs>());
            set => _connectors = value;
        }

        /// <summary>
        /// The unique identifier for the team within your account.
        /// </summary>
        [Input("teamId", required: true)]
        public Input<string> TeamId { get; set; } = null!;

        public TeamConnectorMembershipArgs()
        {
        }
        public static new TeamConnectorMembershipArgs Empty => new TeamConnectorMembershipArgs();
    }

    public sealed class TeamConnectorMembershipState : global::Pulumi.ResourceArgs
    {
        [Input("connectors")]
        private InputList<Inputs.TeamConnectorMembershipConnectorGetArgs>? _connectors;
        public InputList<Inputs.TeamConnectorMembershipConnectorGetArgs> Connectors
        {
            get => _connectors ?? (_connectors = new InputList<Inputs.TeamConnectorMembershipConnectorGetArgs>());
            set => _connectors = value;
        }

        /// <summary>
        /// The unique identifier for the team within your account.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public TeamConnectorMembershipState()
        {
        }
        public static new TeamConnectorMembershipState Empty => new TeamConnectorMembershipState();
    }
}
