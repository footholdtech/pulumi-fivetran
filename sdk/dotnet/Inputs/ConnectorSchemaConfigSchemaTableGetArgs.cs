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

    public sealed class ConnectorSchemaConfigSchemaTableGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("columns")]
        private InputList<Inputs.ConnectorSchemaConfigSchemaTableColumnGetArgs>? _columns;
        public InputList<Inputs.ConnectorSchemaConfigSchemaTableColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.ConnectorSchemaConfigSchemaTableColumnGetArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// The boolean value specifying whether the sync of table into the destination is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The table name within your destination in accordance with Fivetran conventional rules.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// This field appears in the response if the connector supports switching sync modes for tables.
        /// </summary>
        [Input("syncMode")]
        public Input<string>? SyncMode { get; set; }

        public ConnectorSchemaConfigSchemaTableGetArgs()
        {
        }
        public static new ConnectorSchemaConfigSchemaTableGetArgs Empty => new ConnectorSchemaConfigSchemaTableGetArgs();
    }
}
