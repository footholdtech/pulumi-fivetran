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

    public sealed class GetUserGroupMembershipsGroupInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time the membership was created
        /// </summary>
        [Input("createdAt", required: true)]
        public Input<string> CreatedAt { get; set; } = null!;

        /// <summary>
        /// The group unique identifier
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The user's role that links the user and the group
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public GetUserGroupMembershipsGroupInputArgs()
        {
        }
        public static new GetUserGroupMembershipsGroupInputArgs Empty => new GetUserGroupMembershipsGroupInputArgs();
    }
}