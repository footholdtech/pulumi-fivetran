// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran
{
    [FivetranResourceType("fivetran:index/destinationCertificates:DestinationCertificates")]
    public partial class DestinationCertificates : global::Pulumi.CustomResource
    {
        [Output("certificates")]
        public Output<ImmutableArray<Outputs.DestinationCertificatesCertificate>> Certificates { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the target destination within the Fivetran system.
        /// </summary>
        [Output("destinationId")]
        public Output<string> DestinationId { get; private set; } = null!;


        /// <summary>
        /// Create a DestinationCertificates resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DestinationCertificates(string name, DestinationCertificatesArgs args, CustomResourceOptions? options = null)
            : base("fivetran:index/destinationCertificates:DestinationCertificates", name, args ?? new DestinationCertificatesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DestinationCertificates(string name, Input<string> id, DestinationCertificatesState? state = null, CustomResourceOptions? options = null)
            : base("fivetran:index/destinationCertificates:DestinationCertificates", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/footholdtech/pulumi-fivetran",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DestinationCertificates resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DestinationCertificates Get(string name, Input<string> id, DestinationCertificatesState? state = null, CustomResourceOptions? options = null)
        {
            return new DestinationCertificates(name, id, state, options);
        }
    }

    public sealed class DestinationCertificatesArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificates")]
        private InputList<Inputs.DestinationCertificatesCertificateArgs>? _certificates;
        public InputList<Inputs.DestinationCertificatesCertificateArgs> Certificates
        {
            get => _certificates ?? (_certificates = new InputList<Inputs.DestinationCertificatesCertificateArgs>());
            set => _certificates = value;
        }

        /// <summary>
        /// The unique identifier for the target destination within the Fivetran system.
        /// </summary>
        [Input("destinationId", required: true)]
        public Input<string> DestinationId { get; set; } = null!;

        public DestinationCertificatesArgs()
        {
        }
        public static new DestinationCertificatesArgs Empty => new DestinationCertificatesArgs();
    }

    public sealed class DestinationCertificatesState : global::Pulumi.ResourceArgs
    {
        [Input("certificates")]
        private InputList<Inputs.DestinationCertificatesCertificateGetArgs>? _certificates;
        public InputList<Inputs.DestinationCertificatesCertificateGetArgs> Certificates
        {
            get => _certificates ?? (_certificates = new InputList<Inputs.DestinationCertificatesCertificateGetArgs>());
            set => _certificates = value;
        }

        /// <summary>
        /// The unique identifier for the target destination within the Fivetran system.
        /// </summary>
        [Input("destinationId")]
        public Input<string>? DestinationId { get; set; }

        public DestinationCertificatesState()
        {
        }
        public static new DestinationCertificatesState Empty => new DestinationCertificatesState();
    }
}
