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
    /// <summary>
    /// The provider type for the fivetran package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [FivetranResourceType("pulumi:providers:fivetran")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        [Output("apiKey")]
        public Output<string?> ApiKey { get; private set; } = null!;

        [Output("apiSecret")]
        public Output<string?> ApiSecret { get; private set; } = null!;

        [Output("apiUrl")]
        public Output<string?> ApiUrl { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("fivetran", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/footholdtech/pulumi-fivetran",
                AdditionalSecretOutputs =
                {
                    "apiSecret",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }

        /// <summary>
        /// This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
        /// </summary>
        public global::Pulumi.Output<ProviderTerraformConfigResult> TerraformConfig()
            => global::Pulumi.Deployment.Instance.Call<ProviderTerraformConfigResult>("pulumi:providers:fivetran/terraformConfig", CallArgs.Empty, this);
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        [Input("apiSecret")]
        private Input<string>? _apiSecret;
        public Input<string>? ApiSecret
        {
            get => _apiSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        public ProviderArgs()
        {
            ApiKey = Utilities.GetEnv("FIVETRAN_APIKEY");
            ApiSecret = Utilities.GetEnv("FIVETRAN_APISECRET");
            ApiUrl = Utilities.GetEnv("FIVETRAN_APIURL");
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }

    /// <summary>
    /// The results of the <see cref="Provider.TerraformConfig"/> method.
    /// </summary>
    [OutputType]
    public sealed class ProviderTerraformConfigResult
    {
        public readonly ImmutableDictionary<string, object> Result;

        [OutputConstructor]
        private ProviderTerraformConfigResult(ImmutableDictionary<string, object> result)
        {
            Result = result;
        }
    }
}
