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
    public sealed class GetMetadataColumnsMetadataColumnResult
    {
        /// <summary>
        /// The unique column identifier
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The boolean specifying whether the column is a foreign key
        /// </summary>
        public readonly bool IsForeignKey;
        /// <summary>
        /// The boolean specifying whether the column is a primary key
        /// </summary>
        public readonly bool IsPrimaryKey;
        /// <summary>
        /// The column name in the destination
        /// </summary>
        public readonly string NameInDestination;
        /// <summary>
        /// The column name in the source
        /// </summary>
        public readonly string NameInSource;
        /// <summary>
        /// The unique identifier of the table associated with the column
        /// </summary>
        public readonly string ParentId;
        /// <summary>
        /// The column type in the destination
        /// </summary>
        public readonly string TypeInDestination;
        /// <summary>
        /// The column type in the source
        /// </summary>
        public readonly string TypeInSource;

        [OutputConstructor]
        private GetMetadataColumnsMetadataColumnResult(
            string id,

            bool isForeignKey,

            bool isPrimaryKey,

            string nameInDestination,

            string nameInSource,

            string parentId,

            string typeInDestination,

            string typeInSource)
        {
            Id = id;
            IsForeignKey = isForeignKey;
            IsPrimaryKey = isPrimaryKey;
            NameInDestination = nameInDestination;
            NameInSource = nameInSource;
            ParentId = parentId;
            TypeInDestination = typeInDestination;
            TypeInSource = typeInSource;
        }
    }
}
