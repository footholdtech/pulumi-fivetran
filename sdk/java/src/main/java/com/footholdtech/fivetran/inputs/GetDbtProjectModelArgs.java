// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDbtProjectModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDbtProjectModelArgs Empty = new GetDbtProjectModelArgs();

    /**
     * The unique identifier for the dbt Model within the Fivetran system.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique identifier for the dbt Model within the Fivetran system.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The dbt Model name.
     * 
     */
    @Import(name="modelName", required=true)
    private Output<String> modelName;

    /**
     * @return The dbt Model name.
     * 
     */
    public Output<String> modelName() {
        return this.modelName;
    }

    /**
     * Boolean specifying whether the model is selected for execution.
     * 
     */
    @Import(name="scheduled", required=true)
    private Output<Boolean> scheduled;

    /**
     * @return Boolean specifying whether the model is selected for execution.
     * 
     */
    public Output<Boolean> scheduled() {
        return this.scheduled;
    }

    private GetDbtProjectModelArgs() {}

    private GetDbtProjectModelArgs(GetDbtProjectModelArgs $) {
        this.id = $.id;
        this.modelName = $.modelName;
        this.scheduled = $.scheduled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbtProjectModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbtProjectModelArgs $;

        public Builder() {
            $ = new GetDbtProjectModelArgs();
        }

        public Builder(GetDbtProjectModelArgs defaults) {
            $ = new GetDbtProjectModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier for the dbt Model within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier for the dbt Model within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param modelName The dbt Model name.
         * 
         * @return builder
         * 
         */
        public Builder modelName(Output<String> modelName) {
            $.modelName = modelName;
            return this;
        }

        /**
         * @param modelName The dbt Model name.
         * 
         * @return builder
         * 
         */
        public Builder modelName(String modelName) {
            return modelName(Output.of(modelName));
        }

        /**
         * @param scheduled Boolean specifying whether the model is selected for execution.
         * 
         * @return builder
         * 
         */
        public Builder scheduled(Output<Boolean> scheduled) {
            $.scheduled = scheduled;
            return this;
        }

        /**
         * @param scheduled Boolean specifying whether the model is selected for execution.
         * 
         * @return builder
         * 
         */
        public Builder scheduled(Boolean scheduled) {
            return scheduled(Output.of(scheduled));
        }

        public GetDbtProjectModelArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.modelName = Objects.requireNonNull($.modelName, "expected parameter 'modelName' to be non-null");
            $.scheduled = Objects.requireNonNull($.scheduled, "expected parameter 'scheduled' to be non-null");
            return $;
        }
    }

}