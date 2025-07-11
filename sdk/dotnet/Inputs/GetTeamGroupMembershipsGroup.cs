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

    public sealed class GetTeamGroupMembershipsGroupArgs : global::Pulumi.InvokeArgs
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
        /// The team's role that links the team and the group
        /// </summary>
        [Input("role", required: true)]
        public string Role { get; set; } = null!;

        public GetTeamGroupMembershipsGroupArgs()
        {
        }
        public static new GetTeamGroupMembershipsGroupArgs Empty => new GetTeamGroupMembershipsGroupArgs();
    }
}
