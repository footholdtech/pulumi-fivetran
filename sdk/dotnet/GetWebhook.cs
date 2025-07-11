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
    public static class GetWebhook
    {
        /// <summary>
        /// This data source returns a webhook object.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var webhook = Fivetran.GetWebhook.Invoke(new()
        ///     {
        ///         Id = "webhook_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetWebhookResult> InvokeAsync(GetWebhookArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWebhookResult>("fivetran:index/getWebhook:getWebhook", args ?? new GetWebhookArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a webhook object.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var webhook = Fivetran.GetWebhook.Invoke(new()
        ///     {
        ///         Id = "webhook_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWebhookResult> Invoke(GetWebhookInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWebhookResult>("fivetran:index/getWebhook:getWebhook", args ?? new GetWebhookInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a webhook object.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var webhook = Fivetran.GetWebhook.Invoke(new()
        ///     {
        ///         Id = "webhook_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWebhookResult> Invoke(GetWebhookInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWebhookResult>("fivetran:index/getWebhook:getWebhook", args ?? new GetWebhookInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWebhookArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The webhook ID
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetWebhookArgs()
        {
        }
        public static new GetWebhookArgs Empty => new GetWebhookArgs();
    }

    public sealed class GetWebhookInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The webhook ID
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetWebhookInvokeArgs()
        {
        }
        public static new GetWebhookInvokeArgs Empty => new GetWebhookInvokeArgs();
    }


    [OutputType]
    public sealed class GetWebhookResult
    {
        /// <summary>
        /// Boolean, if set to true, webhooks are immediately sent in response to events
        /// </summary>
        public readonly bool Active;
        /// <summary>
        /// The webhook creation timestamp
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The ID of the user who created the webhook.
        /// </summary>
        public readonly string CreatedBy;
        /// <summary>
        /// The array of event types
        /// </summary>
        public readonly ImmutableArray<string> Events;
        /// <summary>
        /// The group ID
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// The webhook ID
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Specifies whether the setup tests should be run
        /// </summary>
        public readonly bool RunTests;
        /// <summary>
        /// The secret string used for payload signing and masked in the response.
        /// </summary>
        public readonly string Secret;
        /// <summary>
        /// The webhook type (group, account)
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Your webhooks URL endpoint for your application
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetWebhookResult(
            bool active,

            string createdAt,

            string createdBy,

            ImmutableArray<string> events,

            string groupId,

            string id,

            bool runTests,

            string secret,

            string type,

            string url)
        {
            Active = active;
            CreatedAt = createdAt;
            CreatedBy = createdBy;
            Events = events;
            GroupId = groupId;
            Id = id;
            RunTests = runTests;
            Secret = secret;
            Type = type;
            Url = url;
        }
    }
}
