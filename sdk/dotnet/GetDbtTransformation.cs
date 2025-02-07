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
    public static class GetDbtTransformation
    {
        /// <summary>
        /// This data source returns a dbt Transformation object.
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
        ///     var transformation = Fivetran.GetDbtTransformation.Invoke(new()
        ///     {
        ///         Id = "transformation_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDbtTransformationResult> InvokeAsync(GetDbtTransformationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDbtTransformationResult>("fivetran:index/getDbtTransformation:getDbtTransformation", args ?? new GetDbtTransformationArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a dbt Transformation object.
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
        ///     var transformation = Fivetran.GetDbtTransformation.Invoke(new()
        ///     {
        ///         Id = "transformation_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDbtTransformationResult> Invoke(GetDbtTransformationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbtTransformationResult>("fivetran:index/getDbtTransformation:getDbtTransformation", args ?? new GetDbtTransformationInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a dbt Transformation object.
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
        ///     var transformation = Fivetran.GetDbtTransformation.Invoke(new()
        ///     {
        ///         Id = "transformation_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDbtTransformationResult> Invoke(GetDbtTransformationInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbtTransformationResult>("fivetran:index/getDbtTransformation:getDbtTransformation", args ?? new GetDbtTransformationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDbtTransformationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier for the dbt Transformation within the Fivetran system.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("schedule")]
        public Inputs.GetDbtTransformationScheduleArgs? Schedule { get; set; }

        public GetDbtTransformationArgs()
        {
        }
        public static new GetDbtTransformationArgs Empty => new GetDbtTransformationArgs();
    }

    public sealed class GetDbtTransformationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier for the dbt Transformation within the Fivetran system.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("schedule")]
        public Input<Inputs.GetDbtTransformationScheduleInputArgs>? Schedule { get; set; }

        public GetDbtTransformationInvokeArgs()
        {
        }
        public static new GetDbtTransformationInvokeArgs Empty => new GetDbtTransformationInvokeArgs();
    }


    [OutputType]
    public sealed class GetDbtTransformationResult
    {
        /// <summary>
        /// Identifiers of related connectors.
        /// </summary>
        public readonly ImmutableArray<string> ConnectorIds;
        /// <summary>
        /// The timestamp of the dbt Transformation creation.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The unique identifier for the dbt Model within the Fivetran system.
        /// </summary>
        public readonly string DbtModelId;
        /// <summary>
        /// Target dbt Model name.
        /// </summary>
        public readonly string DbtModelName;
        /// <summary>
        /// The unique identifier for the dbt Project within the Fivetran system.
        /// </summary>
        public readonly string DbtProjectId;
        /// <summary>
        /// The unique identifier for the dbt Transformation within the Fivetran system.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifiers of related models.
        /// </summary>
        public readonly ImmutableArray<string> ModelIds;
        /// <summary>
        /// The dbt Model name.
        /// </summary>
        public readonly string OutputModelName;
        /// <summary>
        /// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
        /// </summary>
        public readonly bool Paused;
        /// <summary>
        /// The field indicating whether the tests have been configured for dbt Transformation. By default, the value is false.
        /// </summary>
        public readonly bool RunTests;
        public readonly Outputs.GetDbtTransformationScheduleResult? Schedule;

        [OutputConstructor]
        private GetDbtTransformationResult(
            ImmutableArray<string> connectorIds,

            string createdAt,

            string dbtModelId,

            string dbtModelName,

            string dbtProjectId,

            string id,

            ImmutableArray<string> modelIds,

            string outputModelName,

            bool paused,

            bool runTests,

            Outputs.GetDbtTransformationScheduleResult? schedule)
        {
            ConnectorIds = connectorIds;
            CreatedAt = createdAt;
            DbtModelId = dbtModelId;
            DbtModelName = dbtModelName;
            DbtProjectId = dbtProjectId;
            Id = id;
            ModelIds = modelIds;
            OutputModelName = outputModelName;
            Paused = paused;
            RunTests = runTests;
            Schedule = schedule;
        }
    }
}
