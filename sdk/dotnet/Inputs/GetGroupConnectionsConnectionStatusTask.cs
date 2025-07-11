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

    public sealed class GetGroupConnectionsConnectionStatusTaskArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Response status code
        /// </summary>
        [Input("code", required: true)]
        public string Code { get; set; } = null!;

        /// <summary>
        /// Response status text
        /// </summary>
        [Input("message", required: true)]
        public string Message { get; set; } = null!;

        public GetGroupConnectionsConnectionStatusTaskArgs()
        {
        }
        public static new GetGroupConnectionsConnectionStatusTaskArgs Empty => new GetGroupConnectionsConnectionStatusTaskArgs();
    }
}
