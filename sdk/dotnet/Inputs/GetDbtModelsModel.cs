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

    public sealed class GetDbtModelsModelArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier for the dbt Model within the Fivetran system.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The dbt Model name.
        /// </summary>
        [Input("modelName", required: true)]
        public string ModelName { get; set; } = null!;

        /// <summary>
        /// Boolean specifying whether the model is selected for execution in the dashboard.
        /// </summary>
        [Input("scheduled", required: true)]
        public bool Scheduled { get; set; }

        public GetDbtModelsModelArgs()
        {
        }
        public static new GetDbtModelsModelArgs Empty => new GetDbtModelsModelArgs();
    }
}
