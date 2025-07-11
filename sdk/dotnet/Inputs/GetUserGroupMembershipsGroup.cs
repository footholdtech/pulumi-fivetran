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

    public sealed class GetUserGroupMembershipsGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The date and time the membership was created
        /// </summary>
        [Input("createdAt", required: true)]
        public string CreatedAt { get; set; } = null!;

        /// <summary>
        /// The group unique identifier
        /// </summary>
        [Input("groupId", required: true)]
        public string GroupId { get; set; } = null!;

        /// <summary>
        /// The user's role that links the user and the group
        /// </summary>
        [Input("role", required: true)]
        public string Role { get; set; } = null!;

        public GetUserGroupMembershipsGroupArgs()
        {
        }
        public static new GetUserGroupMembershipsGroupArgs Empty => new GetUserGroupMembershipsGroupArgs();
    }
}
