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
    public static class GetConnectionFingerprints
    {
        /// <summary>
        /// This data source returns a list of SSH fingerprints approved for specified connection.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var connectionFingerprints = Fivetran.GetConnectionFingerprints.Invoke(new()
        ///     {
        ///         Id = "connection_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetConnectionFingerprintsResult> InvokeAsync(GetConnectionFingerprintsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectionFingerprintsResult>("fivetran:index/getConnectionFingerprints:getConnectionFingerprints", args ?? new GetConnectionFingerprintsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a list of SSH fingerprints approved for specified connection.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var connectionFingerprints = Fivetran.GetConnectionFingerprints.Invoke(new()
        ///     {
        ///         Id = "connection_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetConnectionFingerprintsResult> Invoke(GetConnectionFingerprintsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionFingerprintsResult>("fivetran:index/getConnectionFingerprints:getConnectionFingerprints", args ?? new GetConnectionFingerprintsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a list of SSH fingerprints approved for specified connection.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var connectionFingerprints = Fivetran.GetConnectionFingerprints.Invoke(new()
        ///     {
        ///         Id = "connection_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetConnectionFingerprintsResult> Invoke(GetConnectionFingerprintsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionFingerprintsResult>("fivetran:index/getConnectionFingerprints:getConnectionFingerprints", args ?? new GetConnectionFingerprintsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectionFingerprintsArgs : global::Pulumi.InvokeArgs
    {
        [Input("fingerprints")]
        private List<Inputs.GetConnectionFingerprintsFingerprintArgs>? _fingerprints;
        public List<Inputs.GetConnectionFingerprintsFingerprintArgs> Fingerprints
        {
            get => _fingerprints ?? (_fingerprints = new List<Inputs.GetConnectionFingerprintsFingerprintArgs>());
            set => _fingerprints = value;
        }

        /// <summary>
        /// The unique identifier for the target connection within the Fivetran system.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetConnectionFingerprintsArgs()
        {
        }
        public static new GetConnectionFingerprintsArgs Empty => new GetConnectionFingerprintsArgs();
    }

    public sealed class GetConnectionFingerprintsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("fingerprints")]
        private InputList<Inputs.GetConnectionFingerprintsFingerprintInputArgs>? _fingerprints;
        public InputList<Inputs.GetConnectionFingerprintsFingerprintInputArgs> Fingerprints
        {
            get => _fingerprints ?? (_fingerprints = new InputList<Inputs.GetConnectionFingerprintsFingerprintInputArgs>());
            set => _fingerprints = value;
        }

        /// <summary>
        /// The unique identifier for the target connection within the Fivetran system.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetConnectionFingerprintsInvokeArgs()
        {
        }
        public static new GetConnectionFingerprintsInvokeArgs Empty => new GetConnectionFingerprintsInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectionFingerprintsResult
    {
        public readonly ImmutableArray<Outputs.GetConnectionFingerprintsFingerprintResult> Fingerprints;
        /// <summary>
        /// The unique identifier for the target connection within the Fivetran system.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetConnectionFingerprintsResult(
            ImmutableArray<Outputs.GetConnectionFingerprintsFingerprintResult> fingerprints,

            string id)
        {
            Fingerprints = fingerprints;
            Id = id;
        }
    }
}
