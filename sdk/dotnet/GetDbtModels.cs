// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran
{
    public static class GetDbtModels
    {
        /// <summary>
        /// This data source returns a list of all dbt Models available for specified dbt Project id.
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
        ///     var myModels = Fivetran.GetDbtModels.Invoke(new()
        ///     {
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDbtModelsResult> InvokeAsync(GetDbtModelsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDbtModelsResult>("fivetran:index/getDbtModels:getDbtModels", args ?? new GetDbtModelsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a list of all dbt Models available for specified dbt Project id.
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
        ///     var myModels = Fivetran.GetDbtModels.Invoke(new()
        ///     {
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDbtModelsResult> Invoke(GetDbtModelsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbtModelsResult>("fivetran:index/getDbtModels:getDbtModels", args ?? new GetDbtModelsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a list of all dbt Models available for specified dbt Project id.
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
        ///     var myModels = Fivetran.GetDbtModels.Invoke(new()
        ///     {
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDbtModelsResult> Invoke(GetDbtModelsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbtModelsResult>("fivetran:index/getDbtModels:getDbtModels", args ?? new GetDbtModelsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDbtModelsArgs : global::Pulumi.InvokeArgs
    {
        [Input("models")]
        private List<Inputs.GetDbtModelsModelArgs>? _models;
        public List<Inputs.GetDbtModelsModelArgs> Models
        {
            get => _models ?? (_models = new List<Inputs.GetDbtModelsModelArgs>());
            set => _models = value;
        }

        /// <summary>
        /// The unique identifier for the dbt Project within the Fivetran system.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetDbtModelsArgs()
        {
        }
        public static new GetDbtModelsArgs Empty => new GetDbtModelsArgs();
    }

    public sealed class GetDbtModelsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("models")]
        private InputList<Inputs.GetDbtModelsModelInputArgs>? _models;
        public InputList<Inputs.GetDbtModelsModelInputArgs> Models
        {
            get => _models ?? (_models = new InputList<Inputs.GetDbtModelsModelInputArgs>());
            set => _models = value;
        }

        /// <summary>
        /// The unique identifier for the dbt Project within the Fivetran system.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetDbtModelsInvokeArgs()
        {
        }
        public static new GetDbtModelsInvokeArgs Empty => new GetDbtModelsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDbtModelsResult
    {
        /// <summary>
        /// The ID of this datasource (equals to `project_id`).
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetDbtModelsModelResult> Models;
        /// <summary>
        /// The unique identifier for the dbt Project within the Fivetran system.
        /// </summary>
        public readonly string ProjectId;

        [OutputConstructor]
        private GetDbtModelsResult(
            string id,

            ImmutableArray<Outputs.GetDbtModelsModelResult> models,

            string projectId)
        {
            Id = id;
            Models = models;
            ProjectId = projectId;
        }
    }
}
