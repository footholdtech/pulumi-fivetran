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

    public sealed class GetConnectionFingerprintsFingerprintArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Hash of the fingerprint.
        /// </summary>
        [Input("hash", required: true)]
        public string Hash { get; set; } = null!;

        /// <summary>
        /// The SSH public key.
        /// </summary>
        [Input("publicKey", required: true)]
        public string PublicKey { get; set; } = null!;

        /// <summary>
        /// User name who validated the fingerprint.
        /// </summary>
        [Input("validatedBy", required: true)]
        public string ValidatedBy { get; set; } = null!;

        /// <summary>
        /// The date when fingerprint was approved.
        /// </summary>
        [Input("validatedDate", required: true)]
        public string ValidatedDate { get; set; } = null!;

        public GetConnectionFingerprintsFingerprintArgs()
        {
        }
        public static new GetConnectionFingerprintsFingerprintArgs Empty => new GetConnectionFingerprintsFingerprintArgs();
    }
}
