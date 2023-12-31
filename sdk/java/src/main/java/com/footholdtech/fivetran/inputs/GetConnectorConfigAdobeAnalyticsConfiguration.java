// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetConnectorConfigAdobeAnalyticsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorConfigAdobeAnalyticsConfiguration Empty = new GetConnectorConfigAdobeAnalyticsConfiguration();

    @Import(name="calculatedMetrics", required=true)
    private List<String> calculatedMetrics;

    public List<String> calculatedMetrics() {
        return this.calculatedMetrics;
    }

    @Import(name="elements", required=true)
    private List<String> elements;

    public List<String> elements() {
        return this.elements;
    }

    @Import(name="metrics", required=true)
    private List<String> metrics;

    public List<String> metrics() {
        return this.metrics;
    }

    @Import(name="reportSuites", required=true)
    private List<String> reportSuites;

    public List<String> reportSuites() {
        return this.reportSuites;
    }

    @Import(name="segments", required=true)
    private List<String> segments;

    public List<String> segments() {
        return this.segments;
    }

    @Import(name="syncMode", required=true)
    private String syncMode;

    public String syncMode() {
        return this.syncMode;
    }

    @Import(name="table", required=true)
    private String table;

    public String table() {
        return this.table;
    }

    private GetConnectorConfigAdobeAnalyticsConfiguration() {}

    private GetConnectorConfigAdobeAnalyticsConfiguration(GetConnectorConfigAdobeAnalyticsConfiguration $) {
        this.calculatedMetrics = $.calculatedMetrics;
        this.elements = $.elements;
        this.metrics = $.metrics;
        this.reportSuites = $.reportSuites;
        this.segments = $.segments;
        this.syncMode = $.syncMode;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorConfigAdobeAnalyticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorConfigAdobeAnalyticsConfiguration $;

        public Builder() {
            $ = new GetConnectorConfigAdobeAnalyticsConfiguration();
        }

        public Builder(GetConnectorConfigAdobeAnalyticsConfiguration defaults) {
            $ = new GetConnectorConfigAdobeAnalyticsConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder calculatedMetrics(List<String> calculatedMetrics) {
            $.calculatedMetrics = calculatedMetrics;
            return this;
        }

        public Builder calculatedMetrics(String... calculatedMetrics) {
            return calculatedMetrics(List.of(calculatedMetrics));
        }

        public Builder elements(List<String> elements) {
            $.elements = elements;
            return this;
        }

        public Builder elements(String... elements) {
            return elements(List.of(elements));
        }

        public Builder metrics(List<String> metrics) {
            $.metrics = metrics;
            return this;
        }

        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }

        public Builder reportSuites(List<String> reportSuites) {
            $.reportSuites = reportSuites;
            return this;
        }

        public Builder reportSuites(String... reportSuites) {
            return reportSuites(List.of(reportSuites));
        }

        public Builder segments(List<String> segments) {
            $.segments = segments;
            return this;
        }

        public Builder segments(String... segments) {
            return segments(List.of(segments));
        }

        public Builder syncMode(String syncMode) {
            $.syncMode = syncMode;
            return this;
        }

        public Builder table(String table) {
            $.table = table;
            return this;
        }

        public GetConnectorConfigAdobeAnalyticsConfiguration build() {
            $.calculatedMetrics = Objects.requireNonNull($.calculatedMetrics, "expected parameter 'calculatedMetrics' to be non-null");
            $.elements = Objects.requireNonNull($.elements, "expected parameter 'elements' to be non-null");
            $.metrics = Objects.requireNonNull($.metrics, "expected parameter 'metrics' to be non-null");
            $.reportSuites = Objects.requireNonNull($.reportSuites, "expected parameter 'reportSuites' to be non-null");
            $.segments = Objects.requireNonNull($.segments, "expected parameter 'segments' to be non-null");
            $.syncMode = Objects.requireNonNull($.syncMode, "expected parameter 'syncMode' to be non-null");
            $.table = Objects.requireNonNull($.table, "expected parameter 'table' to be non-null");
            return $;
        }
    }

}
