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
    public sealed class GetMetadataSchemasMetadataSchemaResult
    {
        /// <summary>
        /// The unique schema identifier
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The schema name in the destination
        /// </summary>
        public readonly string NameInDestination;
        /// <summary>
        /// The schema name in the source
        /// </summary>
        public readonly string NameInSource;

        [OutputConstructor]
        private GetMetadataSchemasMetadataSchemaResult(
            string id,

            string nameInDestination,

            string nameInSource)
        {
            Id = id;
            NameInDestination = nameInDestination;
            NameInSource = nameInSource;
        }
    }
}