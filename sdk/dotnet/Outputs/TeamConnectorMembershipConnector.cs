// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran.Outputs
{

    [OutputType]
    public sealed class TeamConnectorMembershipConnector
    {
        /// <summary>
        /// The connector unique identifier
        /// </summary>
        public readonly string ConnectorId;
        /// <summary>
        /// The date and time the membership was created
        /// </summary>
        public readonly string? CreatedAt;
        /// <summary>
        /// The team's role that links the team and the connector
        /// </summary>
        public readonly string Role;

        [OutputConstructor]
        private TeamConnectorMembershipConnector(
            string connectorId,

            string? createdAt,

            string role)
        {
            ConnectorId = connectorId;
            CreatedAt = createdAt;
            Role = role;
        }
    }
}