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

    public sealed class GetDestinationCertificatesCertificateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Hash of the fingerprint.
        /// </summary>
        [Input("hash", required: true)]
        public string Hash { get; set; } = null!;

        /// <summary>
        /// Certificate name.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Certificate public key.
        /// </summary>
        [Input("publicKey", required: true)]
        public string PublicKey { get; set; } = null!;

        /// <summary>
        /// Certificate sha1.
        /// </summary>
        [Input("sha1", required: true)]
        public string Sha1 { get; set; } = null!;

        /// <summary>
        /// Certificate sha256.
        /// </summary>
        [Input("sha256", required: true)]
        public string Sha256 { get; set; } = null!;

        /// <summary>
        /// Certificate type.
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        /// <summary>
        /// User name who validated the certificate.
        /// </summary>
        [Input("validatedBy", required: true)]
        public string ValidatedBy { get; set; } = null!;

        /// <summary>
        /// The date when the certificate was approved.
        /// </summary>
        [Input("validatedDate", required: true)]
        public string ValidatedDate { get; set; } = null!;

        public GetDestinationCertificatesCertificateArgs()
        {
        }
        public static new GetDestinationCertificatesCertificateArgs Empty => new GetDestinationCertificatesCertificateArgs();
    }
}