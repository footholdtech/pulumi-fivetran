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

    public sealed class GetConnectorConfigCustomPayloadArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Field usage depends on `service` value: 
        /// 	- Service `aws_lambda`: Payload Key
        /// 	- Service `azure_function`: Payload Key
        /// 	- Service `google_cloud_function`: Payload Key
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        /// <summary>
        /// Field usage depends on `service` value: 
        /// 	- Service `aws_lambda`: Payload Value
        /// 	- Service `azure_function`: Payload Value
        /// 	- Service `google_cloud_function`: Payload Value
        /// </summary>
        [Input("value", required: true)]
        public string Value { get; set; } = null!;

        public GetConnectorConfigCustomPayloadArgs()
        {
        }
        public static new GetConnectorConfigCustomPayloadArgs Empty => new GetConnectorConfigCustomPayloadArgs();
    }
}
