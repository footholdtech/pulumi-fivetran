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

    public sealed class ConnectorSchemaConfigSchemasTablesArgs : global::Pulumi.ResourceArgs
    {
        [Input("columns")]
        private InputMap<Inputs.ConnectorSchemaConfigSchemasTablesColumnsArgs>? _columns;

        /// <summary>
        /// Map of table configurations.
        /// </summary>
        public InputMap<Inputs.ConnectorSchemaConfigSchemasTablesColumnsArgs> Columns
        {
            get => _columns ?? (_columns = new InputMap<Inputs.ConnectorSchemaConfigSchemasTablesColumnsArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// The boolean value specifying whether the sync for the table into the destination is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// This field appears in the response if the connector supports switching sync modes for tables.
        /// </summary>
        [Input("syncMode")]
        public Input<string>? SyncMode { get; set; }

        public ConnectorSchemaConfigSchemasTablesArgs()
        {
        }
        public static new ConnectorSchemaConfigSchemasTablesArgs Empty => new ConnectorSchemaConfigSchemasTablesArgs();
    }
}
