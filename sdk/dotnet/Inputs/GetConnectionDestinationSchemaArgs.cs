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

    public sealed class GetConnectionDestinationSchemaInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The connector schema name in destination. Has to be unique within the group (destination). Required for connector creation.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The connector schema prefix has to be unique within the group (destination). Each replicated schema is prefixed with the provided value. Required for connector creation.
        /// </summary>
        [Input("prefix", required: true)]
        public Input<string> Prefix { get; set; } = null!;

        /// <summary>
        /// The table name unique within the schema to which connector will sync the data. Required for connector creation.
        /// </summary>
        [Input("table", required: true)]
        public Input<string> Table { get; set; } = null!;

        /// <summary>
        /// Table group name.
        /// </summary>
        [Input("tableGroupName", required: true)]
        public Input<string> TableGroupName { get; set; } = null!;

        public GetConnectionDestinationSchemaInputArgs()
        {
        }
        public static new GetConnectionDestinationSchemaInputArgs Empty => new GetConnectionDestinationSchemaInputArgs();
    }
}
