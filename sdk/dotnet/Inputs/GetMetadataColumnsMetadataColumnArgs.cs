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

    public sealed class GetMetadataColumnsMetadataColumnInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique column identifier
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The boolean specifying whether the column is a foreign key
        /// </summary>
        [Input("isForeignKey", required: true)]
        public Input<bool> IsForeignKey { get; set; } = null!;

        /// <summary>
        /// The boolean specifying whether the column is a primary key
        /// </summary>
        [Input("isPrimaryKey", required: true)]
        public Input<bool> IsPrimaryKey { get; set; } = null!;

        /// <summary>
        /// The column name in the destination
        /// </summary>
        [Input("nameInDestination", required: true)]
        public Input<string> NameInDestination { get; set; } = null!;

        /// <summary>
        /// The column name in the source
        /// </summary>
        [Input("nameInSource", required: true)]
        public Input<string> NameInSource { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the table associated with the column
        /// </summary>
        [Input("parentId", required: true)]
        public Input<string> ParentId { get; set; } = null!;

        /// <summary>
        /// The column type in the destination
        /// </summary>
        [Input("typeInDestination", required: true)]
        public Input<string> TypeInDestination { get; set; } = null!;

        /// <summary>
        /// The column type in the source
        /// </summary>
        [Input("typeInSource", required: true)]
        public Input<string> TypeInSource { get; set; } = null!;

        public GetMetadataColumnsMetadataColumnInputArgs()
        {
        }
        public static new GetMetadataColumnsMetadataColumnInputArgs Empty => new GetMetadataColumnsMetadataColumnInputArgs();
    }
}
