// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetExternalLoggingConfig;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalLoggingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalLoggingPlainArgs Empty = new GetExternalLoggingPlainArgs();

    @Import(name="configs")
    private @Nullable List<GetExternalLoggingConfig> configs;

    public Optional<List<GetExternalLoggingConfig>> configs() {
        return Optional.ofNullable(this.configs);
    }

    /**
     * The unique identifier for the log service within the Fivetran system.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique identifier for the log service within the Fivetran system.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Specifies whether the setup tests should be run automatically. The default value is TRUE.
     * 
     */
    @Import(name="runSetupTests")
    private @Nullable Boolean runSetupTests;

    /**
     * @return Specifies whether the setup tests should be run automatically. The default value is TRUE.
     * 
     */
    public Optional<Boolean> runSetupTests() {
        return Optional.ofNullable(this.runSetupTests);
    }

    private GetExternalLoggingPlainArgs() {}

    private GetExternalLoggingPlainArgs(GetExternalLoggingPlainArgs $) {
        this.configs = $.configs;
        this.id = $.id;
        this.runSetupTests = $.runSetupTests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalLoggingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalLoggingPlainArgs $;

        public Builder() {
            $ = new GetExternalLoggingPlainArgs();
        }

        public Builder(GetExternalLoggingPlainArgs defaults) {
            $ = new GetExternalLoggingPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configs(@Nullable List<GetExternalLoggingConfig> configs) {
            $.configs = configs;
            return this;
        }

        public Builder configs(GetExternalLoggingConfig... configs) {
            return configs(List.of(configs));
        }

        /**
         * @param id The unique identifier for the log service within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param runSetupTests Specifies whether the setup tests should be run automatically. The default value is TRUE.
         * 
         * @return builder
         * 
         */
        public Builder runSetupTests(@Nullable Boolean runSetupTests) {
            $.runSetupTests = runSetupTests;
            return this;
        }

        public GetExternalLoggingPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
