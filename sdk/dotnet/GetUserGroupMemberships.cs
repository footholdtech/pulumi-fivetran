// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran
{
    public static class GetUserGroupMemberships
    {
        /// <summary>
        /// This data source returns a list of group memberships for user.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var teamGroupMemberships = Fivetran.GetUserGroupMemberships.Invoke(new()
        ///     {
        ///         UserId = "user_id",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetUserGroupMembershipsResult> InvokeAsync(GetUserGroupMembershipsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserGroupMembershipsResult>("fivetran:index/getUserGroupMemberships:getUserGroupMemberships", args ?? new GetUserGroupMembershipsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a list of group memberships for user.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var teamGroupMemberships = Fivetran.GetUserGroupMemberships.Invoke(new()
        ///     {
        ///         UserId = "user_id",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetUserGroupMembershipsResult> Invoke(GetUserGroupMembershipsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserGroupMembershipsResult>("fivetran:index/getUserGroupMemberships:getUserGroupMemberships", args ?? new GetUserGroupMembershipsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserGroupMembershipsArgs : global::Pulumi.InvokeArgs
    {
        [Input("groups")]
        private List<Inputs.GetUserGroupMembershipsGroupArgs>? _groups;
        public List<Inputs.GetUserGroupMembershipsGroupArgs> Groups
        {
            get => _groups ?? (_groups = new List<Inputs.GetUserGroupMembershipsGroupArgs>());
            set => _groups = value;
        }

        /// <summary>
        /// The unique identifier for the user within your account.
        /// </summary>
        [Input("userId", required: true)]
        public string UserId { get; set; } = null!;

        public GetUserGroupMembershipsArgs()
        {
        }
        public static new GetUserGroupMembershipsArgs Empty => new GetUserGroupMembershipsArgs();
    }

    public sealed class GetUserGroupMembershipsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("groups")]
        private InputList<Inputs.GetUserGroupMembershipsGroupInputArgs>? _groups;
        public InputList<Inputs.GetUserGroupMembershipsGroupInputArgs> Groups
        {
            get => _groups ?? (_groups = new InputList<Inputs.GetUserGroupMembershipsGroupInputArgs>());
            set => _groups = value;
        }

        /// <summary>
        /// The unique identifier for the user within your account.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public GetUserGroupMembershipsInvokeArgs()
        {
        }
        public static new GetUserGroupMembershipsInvokeArgs Empty => new GetUserGroupMembershipsInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserGroupMembershipsResult
    {
        public readonly ImmutableArray<Outputs.GetUserGroupMembershipsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The unique identifier for the user within your account.
        /// </summary>
        public readonly string UserId;

        [OutputConstructor]
        private GetUserGroupMembershipsResult(
            ImmutableArray<Outputs.GetUserGroupMembershipsGroupResult> groups,

            string id,

            string userId)
        {
            Groups = groups;
            Id = id;
            UserId = userId;
        }
    }
}