// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDbtModelsModel extends com.pulumi.resources.InvokeArgs {

    public static final GetDbtModelsModel Empty = new GetDbtModelsModel();

    /**
     * The unique identifier for the dbt Model within the Fivetran system.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique identifier for the dbt Model within the Fivetran system.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The dbt Model name.
     * 
     */
    @Import(name="modelName", required=true)
    private String modelName;

    /**
     * @return The dbt Model name.
     * 
     */
    public String modelName() {
        return this.modelName;
    }

    /**
     * Boolean specifying whether the model is selected for execution.
     * 
     */
    @Import(name="scheduled", required=true)
    private Boolean scheduled;

    /**
     * @return Boolean specifying whether the model is selected for execution.
     * 
     */
    public Boolean scheduled() {
        return this.scheduled;
    }

    private GetDbtModelsModel() {}

    private GetDbtModelsModel(GetDbtModelsModel $) {
        this.id = $.id;
        this.modelName = $.modelName;
        this.scheduled = $.scheduled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbtModelsModel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbtModelsModel $;

        public Builder() {
            $ = new GetDbtModelsModel();
        }

        public Builder(GetDbtModelsModel defaults) {
            $ = new GetDbtModelsModel(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier for the dbt Model within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param modelName The dbt Model name.
         * 
         * @return builder
         * 
         */
        public Builder modelName(String modelName) {
            $.modelName = modelName;
            return this;
        }

        /**
         * @param scheduled Boolean specifying whether the model is selected for execution.
         * 
         * @return builder
         * 
         */
        public Builder scheduled(Boolean scheduled) {
            $.scheduled = scheduled;
            return this;
        }

        public GetDbtModelsModel build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.modelName = Objects.requireNonNull($.modelName, "expected parameter 'modelName' to be non-null");
            $.scheduled = Objects.requireNonNull($.scheduled, "expected parameter 'scheduled' to be non-null");
            return $;
        }
    }

}