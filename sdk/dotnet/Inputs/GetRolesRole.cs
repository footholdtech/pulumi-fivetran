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

    public sealed class GetRolesRoleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The role description
        /// </summary>
        [Input("description", required: true)]
        public string Description { get; set; } = null!;

        /// <summary>
        /// TypeBool
        /// </summary>
        [Input("isCustom", required: true)]
        public bool IsCustom { get; set; }

        /// <summary>
        /// The role name
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("scopes", required: true)]
        private List<string>? _scopes;

        /// <summary>
        /// Defines the list of resources the role manages. Supported values: ACCOUNT, DESTINATION, CONNECTOR, and TEAM
        /// </summary>
        public List<string> Scopes
        {
            get => _scopes ?? (_scopes = new List<string>());
            set => _scopes = value;
        }

        public GetRolesRoleArgs()
        {
        }
        public static new GetRolesRoleArgs Empty => new GetRolesRoleArgs();
    }
}