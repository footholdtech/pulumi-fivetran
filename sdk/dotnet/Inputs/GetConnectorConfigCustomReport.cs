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

    public sealed class GetConnectorConfigCustomReportArgs : global::Pulumi.InvokeArgs
    {
        [Input("aggregate", required: true)]
        public string Aggregate { get; set; } = null!;

        [Input("baseMetricsFields", required: true)]
        private List<string>? _baseMetricsFields;
        public List<string> BaseMetricsFields
        {
            get => _baseMetricsFields ?? (_baseMetricsFields = new List<string>());
            set => _baseMetricsFields = value;
        }

        [Input("breakdown", required: true)]
        public string Breakdown { get; set; } = null!;

        [Input("breakout", required: true)]
        public string Breakout { get; set; } = null!;

        [Input("conversionsReportIncluded", required: true)]
        public string ConversionsReportIncluded { get; set; } = null!;

        [Input("customEventsIncluded", required: true)]
        public string CustomEventsIncluded { get; set; } = null!;

        [Input("dimension", required: true)]
        public string Dimension { get; set; } = null!;

        [Input("dimensions", required: true)]
        private List<string>? _dimensions;
        public List<string> Dimensions
        {
            get => _dimensions ?? (_dimensions = new List<string>());
            set => _dimensions = value;
        }

        [Input("eventNames", required: true)]
        private List<string>? _eventNames;
        public List<string> EventNames
        {
            get => _eventNames ?? (_eventNames = new List<string>());
            set => _eventNames = value;
        }

        [Input("granularity", required: true)]
        public string Granularity { get; set; } = null!;

        [Input("level", required: true)]
        public string Level { get; set; } = null!;

        [Input("metrics", required: true)]
        private List<string>? _metrics;
        public List<string> Metrics
        {
            get => _metrics ?? (_metrics = new List<string>());
            set => _metrics = value;
        }

        [Input("reportFields", required: true)]
        private List<string>? _reportFields;
        public List<string> ReportFields
        {
            get => _reportFields ?? (_reportFields = new List<string>());
            set => _reportFields = value;
        }

        [Input("reportName", required: true)]
        public string ReportName { get; set; } = null!;

        [Input("reportType", required: true)]
        public string ReportType { get; set; } = null!;

        [Input("segmentation", required: true)]
        public string Segmentation { get; set; } = null!;

        [Input("skAdMetricsFields", required: true)]
        private List<string>? _skAdMetricsFields;
        public List<string> SkAdMetricsFields
        {
            get => _skAdMetricsFields ?? (_skAdMetricsFields = new List<string>());
            set => _skAdMetricsFields = value;
        }

        [Input("tableName", required: true)]
        public string TableName { get; set; } = null!;

        public GetConnectorConfigCustomReportArgs()
        {
        }
        public static new GetConnectorConfigCustomReportArgs Empty => new GetConnectorConfigCustomReportArgs();
    }
}
