// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran.Inputs
{

    public sealed class GetDestinationsDestinationInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Shift my UTC offset with daylight savings time (US Only)
        /// </summary>
        [Input("daylightSavingTimeEnabled", required: true)]
        public Input<bool> DaylightSavingTimeEnabled { get; set; } = null!;

        /// <summary>
        /// The unique identifier for the Group within the Fivetran system.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The hybrid deployment agent ID that refers to the controller created for the group the connection belongs to. If the value is specified, the system will try to associate the connection with an existing agent.
        /// </summary>
        [Input("hybridDeploymentAgentId", required: true)]
        public Input<string> HybridDeploymentAgentId { get; set; } = null!;

        /// <summary>
        /// The unique identifier for the destination within the Fivetran system.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Possible values: Directly, SshTunnel, ProxyAgent.
        /// </summary>
        [Input("networkingMethod", required: true)]
        public Input<string> NetworkingMethod { get; set; } = null!;

        /// <summary>
        /// The private link ID.
        /// </summary>
        [Input("privateLinkId", required: true)]
        public Input<string> PrivateLinkId { get; set; } = null!;

        /// <summary>
        /// Data processing location. This is where Fivetran will operate and run computation on data.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The destination type id within the Fivetran system.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        /// <summary>
        /// Destination setup status.
        /// </summary>
        [Input("setupStatus", required: true)]
        public Input<string> SetupStatus { get; set; } = null!;

        /// <summary>
        /// Determines the time zone for the Fivetran sync schedule.
        /// </summary>
        [Input("timeZoneOffset", required: true)]
        public Input<string> TimeZoneOffset { get; set; } = null!;

        public GetDestinationsDestinationInputArgs()
        {
        }
        public static new GetDestinationsDestinationInputArgs Empty => new GetDestinationsDestinationInputArgs();
    }
}
