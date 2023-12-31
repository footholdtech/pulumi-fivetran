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

    public sealed class GetWebhooksWebhookArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Boolean, if set to true, webhooks are immediately sent in response to events
        /// </summary>
        [Input("active", required: true)]
        public bool Active { get; set; }

        /// <summary>
        /// The webhook creation timestamp
        /// </summary>
        [Input("createdAt", required: true)]
        public string CreatedAt { get; set; } = null!;

        /// <summary>
        /// The ID of the user who created the webhook.
        /// </summary>
        [Input("createdBy", required: true)]
        public string CreatedBy { get; set; } = null!;

        [Input("events", required: true)]
        private List<string>? _events;

        /// <summary>
        /// The array of event types
        /// </summary>
        public List<string> Events
        {
            get => _events ?? (_events = new List<string>());
            set => _events = value;
        }

        /// <summary>
        /// The group ID
        /// </summary>
        [Input("groupId", required: true)]
        public string GroupId { get; set; } = null!;

        /// <summary>
        /// The webhook ID
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// Specifies whether the setup tests should be run
        /// </summary>
        [Input("runTests")]
        public bool? RunTests { get; set; }

        /// <summary>
        /// The secret string used for payload signing and masked in the response.
        /// </summary>
        [Input("secret", required: true)]
        public string Secret { get; set; } = null!;

        /// <summary>
        /// The webhook type (group, account)
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        /// <summary>
        /// Your webhooks URL endpoint for your application
        /// </summary>
        [Input("url", required: true)]
        public string Url { get; set; } = null!;

        public GetWebhooksWebhookArgs()
        {
        }
        public static new GetWebhooksWebhookArgs Empty => new GetWebhooksWebhookArgs();
    }
}
