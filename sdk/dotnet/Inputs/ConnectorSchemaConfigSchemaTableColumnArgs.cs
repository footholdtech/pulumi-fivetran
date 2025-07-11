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

    public sealed class ConnectorSchemaConfigSchemaTableColumnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The boolean value specifying whether the sync of the column into the destination is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The boolean value specifying whether a column should be hashed.
        /// </summary>
        [Input("hashed")]
        public Input<bool>? Hashed { get; set; }

        [Input("isPrimaryKey")]
        public Input<bool>? IsPrimaryKey { get; set; }

        /// <summary>
        /// The column name within your destination in accordance with Fivetran conventional rules.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ConnectorSchemaConfigSchemaTableColumnArgs()
        {
        }
        public static new ConnectorSchemaConfigSchemaTableColumnArgs Empty => new ConnectorSchemaConfigSchemaTableColumnArgs();
    }
}
