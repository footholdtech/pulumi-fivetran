// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorSchemaConfigSchemaTableColumn {
    /**
     * @return The boolean value specifying whether the sync for the schema into the destination is enabled.
     * 
     */
    private @Nullable String enabled;
    /**
     * @return The boolean value specifying whether a column should be hashed
     * 
     */
    private @Nullable String hashed;
    /**
     * @return The schema name within your destination in accordance with Fivetran conventional rules.
     * 
     */
    private String name;

    private ConnectorSchemaConfigSchemaTableColumn() {}
    /**
     * @return The boolean value specifying whether the sync for the schema into the destination is enabled.
     * 
     */
    public Optional<String> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The boolean value specifying whether a column should be hashed
     * 
     */
    public Optional<String> hashed() {
        return Optional.ofNullable(this.hashed);
    }
    /**
     * @return The schema name within your destination in accordance with Fivetran conventional rules.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorSchemaConfigSchemaTableColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String enabled;
        private @Nullable String hashed;
        private String name;
        public Builder() {}
        public Builder(ConnectorSchemaConfigSchemaTableColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.hashed = defaults.hashed;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder hashed(@Nullable String hashed) {
            this.hashed = hashed;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ConnectorSchemaConfigSchemaTableColumn build() {
            final var o = new ConnectorSchemaConfigSchemaTableColumn();
            o.enabled = enabled;
            o.hashed = hashed;
            o.name = name;
            return o;
        }
    }
}
