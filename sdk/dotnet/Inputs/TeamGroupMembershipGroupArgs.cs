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

    public sealed class TeamGroupMembershipGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time the membership was created
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The group unique identifier
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The team's role that links the team and the group
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public TeamGroupMembershipGroupArgs()
        {
        }
        public static new TeamGroupMembershipGroupArgs Empty => new TeamGroupMembershipGroupArgs();
    }
}