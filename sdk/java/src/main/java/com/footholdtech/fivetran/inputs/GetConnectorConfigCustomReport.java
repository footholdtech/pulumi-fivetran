// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetConnectorConfigCustomReport extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorConfigCustomReport Empty = new GetConnectorConfigCustomReport();

    @Import(name="aggregate", required=true)
    private String aggregate;

    public String aggregate() {
        return this.aggregate;
    }

    @Import(name="baseMetricsFields", required=true)
    private List<String> baseMetricsFields;

    public List<String> baseMetricsFields() {
        return this.baseMetricsFields;
    }

    @Import(name="breakdown", required=true)
    private String breakdown;

    public String breakdown() {
        return this.breakdown;
    }

    @Import(name="breakout", required=true)
    private String breakout;

    public String breakout() {
        return this.breakout;
    }

    @Import(name="conversionsReportIncluded", required=true)
    private String conversionsReportIncluded;

    public String conversionsReportIncluded() {
        return this.conversionsReportIncluded;
    }

    @Import(name="customEventsIncluded", required=true)
    private String customEventsIncluded;

    public String customEventsIncluded() {
        return this.customEventsIncluded;
    }

    @Import(name="dimension", required=true)
    private String dimension;

    public String dimension() {
        return this.dimension;
    }

    @Import(name="dimensions", required=true)
    private List<String> dimensions;

    public List<String> dimensions() {
        return this.dimensions;
    }

    @Import(name="eventNames", required=true)
    private List<String> eventNames;

    public List<String> eventNames() {
        return this.eventNames;
    }

    @Import(name="granularity", required=true)
    private String granularity;

    public String granularity() {
        return this.granularity;
    }

    @Import(name="level", required=true)
    private String level;

    public String level() {
        return this.level;
    }

    @Import(name="metrics", required=true)
    private List<String> metrics;

    public List<String> metrics() {
        return this.metrics;
    }

    @Import(name="reportFields", required=true)
    private List<String> reportFields;

    public List<String> reportFields() {
        return this.reportFields;
    }

    @Import(name="reportName", required=true)
    private String reportName;

    public String reportName() {
        return this.reportName;
    }

    @Import(name="reportType", required=true)
    private String reportType;

    public String reportType() {
        return this.reportType;
    }

    @Import(name="segmentation", required=true)
    private String segmentation;

    public String segmentation() {
        return this.segmentation;
    }

    @Import(name="skAdMetricsFields", required=true)
    private List<String> skAdMetricsFields;

    public List<String> skAdMetricsFields() {
        return this.skAdMetricsFields;
    }

    @Import(name="tableName", required=true)
    private String tableName;

    public String tableName() {
        return this.tableName;
    }

    private GetConnectorConfigCustomReport() {}

    private GetConnectorConfigCustomReport(GetConnectorConfigCustomReport $) {
        this.aggregate = $.aggregate;
        this.baseMetricsFields = $.baseMetricsFields;
        this.breakdown = $.breakdown;
        this.breakout = $.breakout;
        this.conversionsReportIncluded = $.conversionsReportIncluded;
        this.customEventsIncluded = $.customEventsIncluded;
        this.dimension = $.dimension;
        this.dimensions = $.dimensions;
        this.eventNames = $.eventNames;
        this.granularity = $.granularity;
        this.level = $.level;
        this.metrics = $.metrics;
        this.reportFields = $.reportFields;
        this.reportName = $.reportName;
        this.reportType = $.reportType;
        this.segmentation = $.segmentation;
        this.skAdMetricsFields = $.skAdMetricsFields;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorConfigCustomReport defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorConfigCustomReport $;

        public Builder() {
            $ = new GetConnectorConfigCustomReport();
        }

        public Builder(GetConnectorConfigCustomReport defaults) {
            $ = new GetConnectorConfigCustomReport(Objects.requireNonNull(defaults));
        }

        public Builder aggregate(String aggregate) {
            $.aggregate = aggregate;
            return this;
        }

        public Builder baseMetricsFields(List<String> baseMetricsFields) {
            $.baseMetricsFields = baseMetricsFields;
            return this;
        }

        public Builder baseMetricsFields(String... baseMetricsFields) {
            return baseMetricsFields(List.of(baseMetricsFields));
        }

        public Builder breakdown(String breakdown) {
            $.breakdown = breakdown;
            return this;
        }

        public Builder breakout(String breakout) {
            $.breakout = breakout;
            return this;
        }

        public Builder conversionsReportIncluded(String conversionsReportIncluded) {
            $.conversionsReportIncluded = conversionsReportIncluded;
            return this;
        }

        public Builder customEventsIncluded(String customEventsIncluded) {
            $.customEventsIncluded = customEventsIncluded;
            return this;
        }

        public Builder dimension(String dimension) {
            $.dimension = dimension;
            return this;
        }

        public Builder dimensions(List<String> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }

        public Builder eventNames(List<String> eventNames) {
            $.eventNames = eventNames;
            return this;
        }

        public Builder eventNames(String... eventNames) {
            return eventNames(List.of(eventNames));
        }

        public Builder granularity(String granularity) {
            $.granularity = granularity;
            return this;
        }

        public Builder level(String level) {
            $.level = level;
            return this;
        }

        public Builder metrics(List<String> metrics) {
            $.metrics = metrics;
            return this;
        }

        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }

        public Builder reportFields(List<String> reportFields) {
            $.reportFields = reportFields;
            return this;
        }

        public Builder reportFields(String... reportFields) {
            return reportFields(List.of(reportFields));
        }

        public Builder reportName(String reportName) {
            $.reportName = reportName;
            return this;
        }

        public Builder reportType(String reportType) {
            $.reportType = reportType;
            return this;
        }

        public Builder segmentation(String segmentation) {
            $.segmentation = segmentation;
            return this;
        }

        public Builder skAdMetricsFields(List<String> skAdMetricsFields) {
            $.skAdMetricsFields = skAdMetricsFields;
            return this;
        }

        public Builder skAdMetricsFields(String... skAdMetricsFields) {
            return skAdMetricsFields(List.of(skAdMetricsFields));
        }

        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        public GetConnectorConfigCustomReport build() {
            $.aggregate = Objects.requireNonNull($.aggregate, "expected parameter 'aggregate' to be non-null");
            $.baseMetricsFields = Objects.requireNonNull($.baseMetricsFields, "expected parameter 'baseMetricsFields' to be non-null");
            $.breakdown = Objects.requireNonNull($.breakdown, "expected parameter 'breakdown' to be non-null");
            $.breakout = Objects.requireNonNull($.breakout, "expected parameter 'breakout' to be non-null");
            $.conversionsReportIncluded = Objects.requireNonNull($.conversionsReportIncluded, "expected parameter 'conversionsReportIncluded' to be non-null");
            $.customEventsIncluded = Objects.requireNonNull($.customEventsIncluded, "expected parameter 'customEventsIncluded' to be non-null");
            $.dimension = Objects.requireNonNull($.dimension, "expected parameter 'dimension' to be non-null");
            $.dimensions = Objects.requireNonNull($.dimensions, "expected parameter 'dimensions' to be non-null");
            $.eventNames = Objects.requireNonNull($.eventNames, "expected parameter 'eventNames' to be non-null");
            $.granularity = Objects.requireNonNull($.granularity, "expected parameter 'granularity' to be non-null");
            $.level = Objects.requireNonNull($.level, "expected parameter 'level' to be non-null");
            $.metrics = Objects.requireNonNull($.metrics, "expected parameter 'metrics' to be non-null");
            $.reportFields = Objects.requireNonNull($.reportFields, "expected parameter 'reportFields' to be non-null");
            $.reportName = Objects.requireNonNull($.reportName, "expected parameter 'reportName' to be non-null");
            $.reportType = Objects.requireNonNull($.reportType, "expected parameter 'reportType' to be non-null");
            $.segmentation = Objects.requireNonNull($.segmentation, "expected parameter 'segmentation' to be non-null");
            $.skAdMetricsFields = Objects.requireNonNull($.skAdMetricsFields, "expected parameter 'skAdMetricsFields' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}