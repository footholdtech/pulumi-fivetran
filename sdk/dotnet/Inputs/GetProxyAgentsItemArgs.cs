// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran.Inputs
{

    public sealed class GetProxyAgentsItemInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The actor who created the proxy agent.
        /// </summary>
        [Input("createdBy", required: true)]
        public Input<string> CreatedBy { get; set; } = null!;

        /// <summary>
        /// Proxy agent name.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Data processing location. This is where Fivetran will operate and run computation on data.
        /// </summary>
        [Input("groupRegion", required: true)]
        public Input<string> GroupRegion { get; set; } = null!;

        /// <summary>
        /// The unique identifier for the proxy within your account.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The timestamp of the time the proxy agent was created in your account.
        /// </summary>
        [Input("registredAt", required: true)]
        public Input<string> RegistredAt { get; set; } = null!;

        /// <summary>
        /// The salt.
        /// </summary>
        [Input("salt", required: true)]
        public Input<string> Salt { get; set; } = null!;

        /// <summary>
        /// The auth token.
        /// </summary>
        [Input("token", required: true)]
        public Input<string> Token { get; set; } = null!;

        public GetProxyAgentsItemInputArgs()
        {
        }
        public static new GetProxyAgentsItemInputArgs Empty => new GetProxyAgentsItemInputArgs();
    }
}