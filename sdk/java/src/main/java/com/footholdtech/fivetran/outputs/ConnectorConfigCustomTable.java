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
public final class ConnectorConfigCustomTable {
    private @Nullable List<String> actionBreakdowns;
    private @Nullable String actionReportTime;
    private @Nullable String aggregation;
    private @Nullable List<String> breakdowns;
    private @Nullable String clickAttributionWindow;
    private @Nullable String configType;
    private @Nullable List<String> fields;
    private @Nullable String level;
    private @Nullable String prebuiltReportName;
    private @Nullable String tableName;
    private @Nullable String useUnifiedAttributionSetting;
    private @Nullable String viewAttributionWindow;

    private ConnectorConfigCustomTable() {}
    public List<String> actionBreakdowns() {
        return this.actionBreakdowns == null ? List.of() : this.actionBreakdowns;
    }
    public Optional<String> actionReportTime() {
        return Optional.ofNullable(this.actionReportTime);
    }
    public Optional<String> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    public List<String> breakdowns() {
        return this.breakdowns == null ? List.of() : this.breakdowns;
    }
    public Optional<String> clickAttributionWindow() {
        return Optional.ofNullable(this.clickAttributionWindow);
    }
    public Optional<String> configType() {
        return Optional.ofNullable(this.configType);
    }
    public List<String> fields() {
        return this.fields == null ? List.of() : this.fields;
    }
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    public Optional<String> prebuiltReportName() {
        return Optional.ofNullable(this.prebuiltReportName);
    }
    public Optional<String> tableName() {
        return Optional.ofNullable(this.tableName);
    }
    public Optional<String> useUnifiedAttributionSetting() {
        return Optional.ofNullable(this.useUnifiedAttributionSetting);
    }
    public Optional<String> viewAttributionWindow() {
        return Optional.ofNullable(this.viewAttributionWindow);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorConfigCustomTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> actionBreakdowns;
        private @Nullable String actionReportTime;
        private @Nullable String aggregation;
        private @Nullable List<String> breakdowns;
        private @Nullable String clickAttributionWindow;
        private @Nullable String configType;
        private @Nullable List<String> fields;
        private @Nullable String level;
        private @Nullable String prebuiltReportName;
        private @Nullable String tableName;
        private @Nullable String useUnifiedAttributionSetting;
        private @Nullable String viewAttributionWindow;
        public Builder() {}
        public Builder(ConnectorConfigCustomTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionBreakdowns = defaults.actionBreakdowns;
    	      this.actionReportTime = defaults.actionReportTime;
    	      this.aggregation = defaults.aggregation;
    	      this.breakdowns = defaults.breakdowns;
    	      this.clickAttributionWindow = defaults.clickAttributionWindow;
    	      this.configType = defaults.configType;
    	      this.fields = defaults.fields;
    	      this.level = defaults.level;
    	      this.prebuiltReportName = defaults.prebuiltReportName;
    	      this.tableName = defaults.tableName;
    	      this.useUnifiedAttributionSetting = defaults.useUnifiedAttributionSetting;
    	      this.viewAttributionWindow = defaults.viewAttributionWindow;
        }

        @CustomType.Setter
        public Builder actionBreakdowns(@Nullable List<String> actionBreakdowns) {
            this.actionBreakdowns = actionBreakdowns;
            return this;
        }
        public Builder actionBreakdowns(String... actionBreakdowns) {
            return actionBreakdowns(List.of(actionBreakdowns));
        }
        @CustomType.Setter
        public Builder actionReportTime(@Nullable String actionReportTime) {
            this.actionReportTime = actionReportTime;
            return this;
        }
        @CustomType.Setter
        public Builder aggregation(@Nullable String aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder breakdowns(@Nullable List<String> breakdowns) {
            this.breakdowns = breakdowns;
            return this;
        }
        public Builder breakdowns(String... breakdowns) {
            return breakdowns(List.of(breakdowns));
        }
        @CustomType.Setter
        public Builder clickAttributionWindow(@Nullable String clickAttributionWindow) {
            this.clickAttributionWindow = clickAttributionWindow;
            return this;
        }
        @CustomType.Setter
        public Builder configType(@Nullable String configType) {
            this.configType = configType;
            return this;
        }
        @CustomType.Setter
        public Builder fields(@Nullable List<String> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder prebuiltReportName(@Nullable String prebuiltReportName) {
            this.prebuiltReportName = prebuiltReportName;
            return this;
        }
        @CustomType.Setter
        public Builder tableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }
        @CustomType.Setter
        public Builder useUnifiedAttributionSetting(@Nullable String useUnifiedAttributionSetting) {
            this.useUnifiedAttributionSetting = useUnifiedAttributionSetting;
            return this;
        }
        @CustomType.Setter
        public Builder viewAttributionWindow(@Nullable String viewAttributionWindow) {
            this.viewAttributionWindow = viewAttributionWindow;
            return this;
        }
        public ConnectorConfigCustomTable build() {
            final var o = new ConnectorConfigCustomTable();
            o.actionBreakdowns = actionBreakdowns;
            o.actionReportTime = actionReportTime;
            o.aggregation = aggregation;
            o.breakdowns = breakdowns;
            o.clickAttributionWindow = clickAttributionWindow;
            o.configType = configType;
            o.fields = fields;
            o.level = level;
            o.prebuiltReportName = prebuiltReportName;
            o.tableName = tableName;
            o.useUnifiedAttributionSetting = useUnifiedAttributionSetting;
            o.viewAttributionWindow = viewAttributionWindow;
            return o;
        }
    }
}