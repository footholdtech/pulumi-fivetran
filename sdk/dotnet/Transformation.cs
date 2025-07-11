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
    /// Resource is in ALPHA state.
    /// 
    /// This resource allows you to add, manage and delete transformation projects in your account.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// 1. To import an existing `fivetran_transformation` resource into your Terraform state, you need to get **Transformation ID** via API call `GET https://api.fivetran.com/v1/transformations` to retrieve available projects.
    /// 
    /// 2. Fetch transformation details for particular `transformation-id` using `GET https://api.fivetran.com/v1/transformations/{transformation-id}` to ensure that this is the transformation you want to import.
    /// 
    /// 3. Define an empty resource in your `.tf` configuration:
    /// 
    /// hcl
    /// 
    /// resource "fivetran_transformation" "my_imported_fivetran_transformation" {
    /// 
    /// }
    /// 
    /// 4. Run the `pulumi import` command:
    /// 
    /// ```sh
    /// $ pulumi import fivetran:index/transformation:Transformation my_imported_fivetran_transformation {Transformation ID}
    /// ```
    /// 
    /// 4. Use the `terraform state show` command to get the values from the state:
    /// 
    /// terraform state show 'fivetran_transformation.my_imported_fivetran_transformation'
    /// 
    /// 5. Copy the values and paste them to your `.tf` configuration.
    /// </summary>
    [FivetranResourceType("fivetran:index/transformation:Transformation")]
    public partial class Transformation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The timestamp of when the transformation was created in your account.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the User within the Fivetran system who created the transformation.
        /// </summary>
        [Output("createdById")]
        public Output<string> CreatedById { get; private set; } = null!;

        /// <summary>
        /// Identifiers of related models.
        /// </summary>
        [Output("outputModelNames")]
        public Output<ImmutableArray<string>> OutputModelNames { get; private set; } = null!;

        /// <summary>
        /// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
        /// </summary>
        [Output("paused")]
        public Output<bool> Paused { get; private set; } = null!;

        [Output("schedule")]
        public Output<Outputs.TransformationSchedule?> Schedule { get; private set; } = null!;

        /// <summary>
        /// Status of transformation Project (NOT_READY, READY, ERROR).
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("transformationConfig")]
        public Output<Outputs.TransformationTransformationConfig?> TransformationConfig { get; private set; } = null!;

        /// <summary>
        /// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Transformation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Transformation(string name, TransformationArgs? args = null, CustomResourceOptions? options = null)
            : base("fivetran:index/transformation:Transformation", name, args ?? new TransformationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Transformation(string name, Input<string> id, TransformationState? state = null, CustomResourceOptions? options = null)
            : base("fivetran:index/transformation:Transformation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Transformation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Transformation Get(string name, Input<string> id, TransformationState? state = null, CustomResourceOptions? options = null)
        {
            return new Transformation(name, id, state, options);
        }
    }

    public sealed class TransformationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        [Input("schedule")]
        public Input<Inputs.TransformationScheduleArgs>? Schedule { get; set; }

        [Input("transformationConfig")]
        public Input<Inputs.TransformationTransformationConfigArgs>? TransformationConfig { get; set; }

        /// <summary>
        /// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TransformationArgs()
        {
        }
        public static new TransformationArgs Empty => new TransformationArgs();
    }

    public sealed class TransformationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timestamp of when the transformation was created in your account.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The unique identifier for the User within the Fivetran system who created the transformation.
        /// </summary>
        [Input("createdById")]
        public Input<string>? CreatedById { get; set; }

        [Input("outputModelNames")]
        private InputList<string>? _outputModelNames;

        /// <summary>
        /// Identifiers of related models.
        /// </summary>
        public InputList<string> OutputModelNames
        {
            get => _outputModelNames ?? (_outputModelNames = new InputList<string>());
            set => _outputModelNames = value;
        }

        /// <summary>
        /// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        [Input("schedule")]
        public Input<Inputs.TransformationScheduleGetArgs>? Schedule { get; set; }

        /// <summary>
        /// Status of transformation Project (NOT_READY, READY, ERROR).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("transformationConfig")]
        public Input<Inputs.TransformationTransformationConfigGetArgs>? TransformationConfig { get; set; }

        /// <summary>
        /// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TransformationState()
        {
        }
        public static new TransformationState Empty => new TransformationState();
    }
}
