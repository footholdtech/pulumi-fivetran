// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorConfigCustomReport {
    private @Nullable String aggregate;
    private @Nullable List<String> baseMetricsFields;
    private @Nullable String breakdown;
    private @Nullable String breakout;
    private @Nullable String conversionsReportIncluded;
    private @Nullable String customEventsIncluded;
    private @Nullable String dimension;
    private @Nullable List<String> dimensions;
    private @Nullable List<String> eventNames;
    private @Nullable String granularity;
    private @Nullable String level;
    private @Nullable List<String> metrics;
    private @Nullable List<String> reportFields;
    private @Nullable String reportName;
    private @Nullable String reportType;
    private @Nullable String segmentation;
    private @Nullable List<String> skAdMetricsFields;
    private @Nullable String tableName;

    private ConnectorConfigCustomReport() {}
    public Optional<String> aggregate() {
        return Optional.ofNullable(this.aggregate);
    }
    public List<String> baseMetricsFields() {
        return this.baseMetricsFields == null ? List.of() : this.baseMetricsFields;
    }
    public Optional<String> breakdown() {
        return Optional.ofNullable(this.breakdown);
    }
    public Optional<String> breakout() {
        return Optional.ofNullable(this.breakout);
    }
    public Optional<String> conversionsReportIncluded() {
        return Optional.ofNullable(this.conversionsReportIncluded);
    }
    public Optional<String> customEventsIncluded() {
        return Optional.ofNullable(this.customEventsIncluded);
    }
    public Optional<String> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    public List<String> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    public List<String> eventNames() {
        return this.eventNames == null ? List.of() : this.eventNames;
    }
    public Optional<String> granularity() {
        return Optional.ofNullable(this.granularity);
    }
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    public List<String> metrics() {
        return this.metrics == null ? List.of() : this.metrics;
    }
    public List<String> reportFields() {
        return this.reportFields == null ? List.of() : this.reportFields;
    }
    public Optional<String> reportName() {
        return Optional.ofNullable(this.reportName);
    }
    public Optional<String> reportType() {
        return Optional.ofNullable(this.reportType);
    }
    public Optional<String> segmentation() {
        return Optional.ofNullable(this.segmentation);
    }
    public List<String> skAdMetricsFields() {
        return this.skAdMetricsFields == null ? List.of() : this.skAdMetricsFields;
    }
    public Optional<String> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorConfigCustomReport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregate;
        private @Nullable List<String> baseMetricsFields;
        private @Nullable String breakdown;
        private @Nullable String breakout;
        private @Nullable String conversionsReportIncluded;
        private @Nullable String customEventsIncluded;
        private @Nullable String dimension;
        private @Nullable List<String> dimensions;
        private @Nullable List<String> eventNames;
        private @Nullable String granularity;
        private @Nullable String level;
        private @Nullable List<String> metrics;
        private @Nullable List<String> reportFields;
        private @Nullable String reportName;
        private @Nullable String reportType;
        private @Nullable String segmentation;
        private @Nullable List<String> skAdMetricsFields;
        private @Nullable String tableName;
        public Builder() {}
        public Builder(ConnectorConfigCustomReport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregate = defaults.aggregate;
    	      this.baseMetricsFields = defaults.baseMetricsFields;
    	      this.breakdown = defaults.breakdown;
    	      this.breakout = defaults.breakout;
    	      this.conversionsReportIncluded = defaults.conversionsReportIncluded;
    	      this.customEventsIncluded = defaults.customEventsIncluded;
    	      this.dimension = defaults.dimension;
    	      this.dimensions = defaults.dimensions;
    	      this.eventNames = defaults.eventNames;
    	      this.granularity = defaults.granularity;
    	      this.level = defaults.level;
    	      this.metrics = defaults.metrics;
    	      this.reportFields = defaults.reportFields;
    	      this.reportName = defaults.reportName;
    	      this.reportType = defaults.reportType;
    	      this.segmentation = defaults.segmentation;
    	      this.skAdMetricsFields = defaults.skAdMetricsFields;
    	      this.tableName = defaults.tableName;
        }

        @CustomType.Setter
        public Builder aggregate(@Nullable String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        @CustomType.Setter
        public Builder baseMetricsFields(@Nullable List<String> baseMetricsFields) {
            this.baseMetricsFields = baseMetricsFields;
            return this;
        }
        public Builder baseMetricsFields(String... baseMetricsFields) {
            return baseMetricsFields(List.of(baseMetricsFields));
        }
        @CustomType.Setter
        public Builder breakdown(@Nullable String breakdown) {
            this.breakdown = breakdown;
            return this;
        }
        @CustomType.Setter
        public Builder breakout(@Nullable String breakout) {
            this.breakout = breakout;
            return this;
        }
        @CustomType.Setter
        public Builder conversionsReportIncluded(@Nullable String conversionsReportIncluded) {
            this.conversionsReportIncluded = conversionsReportIncluded;
            return this;
        }
        @CustomType.Setter
        public Builder customEventsIncluded(@Nullable String customEventsIncluded) {
            this.customEventsIncluded = customEventsIncluded;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(@Nullable String dimension) {
            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder dimensions(@Nullable List<String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder eventNames(@Nullable List<String> eventNames) {
            this.eventNames = eventNames;
            return this;
        }
        public Builder eventNames(String... eventNames) {
            return eventNames(List.of(eventNames));
        }
        @CustomType.Setter
        public Builder granularity(@Nullable String granularity) {
            this.granularity = granularity;
            return this;
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder metrics(@Nullable List<String> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }
        @CustomType.Setter
        public Builder reportFields(@Nullable List<String> reportFields) {
            this.reportFields = reportFields;
            return this;
        }
        public Builder reportFields(String... reportFields) {
            return reportFields(List.of(reportFields));
        }
        @CustomType.Setter
        public Builder reportName(@Nullable String reportName) {
            this.reportName = reportName;
            return this;
        }
        @CustomType.Setter
        public Builder reportType(@Nullable String reportType) {
            this.reportType = reportType;
            return this;
        }
        @CustomType.Setter
        public Builder segmentation(@Nullable String segmentation) {
            this.segmentation = segmentation;
            return this;
        }
        @CustomType.Setter
        public Builder skAdMetricsFields(@Nullable List<String> skAdMetricsFields) {
            this.skAdMetricsFields = skAdMetricsFields;
            return this;
        }
        public Builder skAdMetricsFields(String... skAdMetricsFields) {
            return skAdMetricsFields(List.of(skAdMetricsFields));
        }
        @CustomType.Setter
        public Builder tableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }
        public ConnectorConfigCustomReport build() {
            final var o = new ConnectorConfigCustomReport();
            o.aggregate = aggregate;
            o.baseMetricsFields = baseMetricsFields;
            o.breakdown = breakdown;
            o.breakout = breakout;
            o.conversionsReportIncluded = conversionsReportIncluded;
            o.customEventsIncluded = customEventsIncluded;
            o.dimension = dimension;
            o.dimensions = dimensions;
            o.eventNames = eventNames;
            o.granularity = granularity;
            o.level = level;
            o.metrics = metrics;
            o.reportFields = reportFields;
            o.reportName = reportName;
            o.reportType = reportType;
            o.segmentation = segmentation;
            o.skAdMetricsFields = skAdMetricsFields;
            o.tableName = tableName;
            return o;
        }
    }
}
