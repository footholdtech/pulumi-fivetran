// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorConfigAdobeAnalyticsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorConfigAdobeAnalyticsConfigurationArgs Empty = new ConnectorConfigAdobeAnalyticsConfigurationArgs();

    @Import(name="calculatedMetrics")
    private @Nullable Output<List<String>> calculatedMetrics;

    public Optional<Output<List<String>>> calculatedMetrics() {
        return Optional.ofNullable(this.calculatedMetrics);
    }

    @Import(name="elements")
    private @Nullable Output<List<String>> elements;

    public Optional<Output<List<String>>> elements() {
        return Optional.ofNullable(this.elements);
    }

    @Import(name="metrics")
    private @Nullable Output<List<String>> metrics;

    public Optional<Output<List<String>>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    @Import(name="reportSuites")
    private @Nullable Output<List<String>> reportSuites;

    public Optional<Output<List<String>>> reportSuites() {
        return Optional.ofNullable(this.reportSuites);
    }

    @Import(name="segments")
    private @Nullable Output<List<String>> segments;

    public Optional<Output<List<String>>> segments() {
        return Optional.ofNullable(this.segments);
    }

    @Import(name="syncMode")
    private @Nullable Output<String> syncMode;

    public Optional<Output<String>> syncMode() {
        return Optional.ofNullable(this.syncMode);
    }

    @Import(name="table")
    private @Nullable Output<String> table;

    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private ConnectorConfigAdobeAnalyticsConfigurationArgs() {}

    private ConnectorConfigAdobeAnalyticsConfigurationArgs(ConnectorConfigAdobeAnalyticsConfigurationArgs $) {
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
    public static Builder builder(ConnectorConfigAdobeAnalyticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorConfigAdobeAnalyticsConfigurationArgs $;

        public Builder() {
            $ = new ConnectorConfigAdobeAnalyticsConfigurationArgs();
        }

        public Builder(ConnectorConfigAdobeAnalyticsConfigurationArgs defaults) {
            $ = new ConnectorConfigAdobeAnalyticsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder calculatedMetrics(@Nullable Output<List<String>> calculatedMetrics) {
            $.calculatedMetrics = calculatedMetrics;
            return this;
        }

        public Builder calculatedMetrics(List<String> calculatedMetrics) {
            return calculatedMetrics(Output.of(calculatedMetrics));
        }

        public Builder calculatedMetrics(String... calculatedMetrics) {
            return calculatedMetrics(List.of(calculatedMetrics));
        }

        public Builder elements(@Nullable Output<List<String>> elements) {
            $.elements = elements;
            return this;
        }

        public Builder elements(List<String> elements) {
            return elements(Output.of(elements));
        }

        public Builder elements(String... elements) {
            return elements(List.of(elements));
        }

        public Builder metrics(@Nullable Output<List<String>> metrics) {
            $.metrics = metrics;
            return this;
        }

        public Builder metrics(List<String> metrics) {
            return metrics(Output.of(metrics));
        }

        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }

        public Builder reportSuites(@Nullable Output<List<String>> reportSuites) {
            $.reportSuites = reportSuites;
            return this;
        }

        public Builder reportSuites(List<String> reportSuites) {
            return reportSuites(Output.of(reportSuites));
        }

        public Builder reportSuites(String... reportSuites) {
            return reportSuites(List.of(reportSuites));
        }

        public Builder segments(@Nullable Output<List<String>> segments) {
            $.segments = segments;
            return this;
        }

        public Builder segments(List<String> segments) {
            return segments(Output.of(segments));
        }

        public Builder segments(String... segments) {
            return segments(List.of(segments));
        }

        public Builder syncMode(@Nullable Output<String> syncMode) {
            $.syncMode = syncMode;
            return this;
        }

        public Builder syncMode(String syncMode) {
            return syncMode(Output.of(syncMode));
        }

        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        public Builder table(String table) {
            return table(Output.of(table));
        }

        public ConnectorConfigAdobeAnalyticsConfigurationArgs build() {
            return $;
        }
    }

}
