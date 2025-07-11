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

    public sealed class GroupUsersUserGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email address that the user has associated with their user profile.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// The unique identifier for the user within the account.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The group role that you would like to assign this new user to. Supported group roles: ‘Destination Administrator‘, ‘Destination Reviewer‘, ‘Destination Analyst‘, ‘Connector Creator‘, or a custom destination role
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public GroupUsersUserGetArgs()
        {
        }
        public static new GroupUsersUserGetArgs Empty => new GroupUsersUserGetArgs();
    }
}
