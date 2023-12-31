// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetDestinationConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDestinationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDestinationArgs Empty = new GetDestinationArgs();

    @Import(name="configs")
    private @Nullable Output<List<GetDestinationConfigArgs>> configs;

    public Optional<Output<List<GetDestinationConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    /**
     * The unique identifier for the destination within the Fivetran system
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique identifier for the destination within the Fivetran system
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetDestinationArgs() {}

    private GetDestinationArgs(GetDestinationArgs $) {
        this.configs = $.configs;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDestinationArgs $;

        public Builder() {
            $ = new GetDestinationArgs();
        }

        public Builder(GetDestinationArgs defaults) {
            $ = new GetDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder configs(@Nullable Output<List<GetDestinationConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        public Builder configs(List<GetDestinationConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        public Builder configs(GetDestinationConfigArgs... configs) {
            return configs(List.of(configs));
        }

        /**
         * @param id The unique identifier for the destination within the Fivetran system
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier for the destination within the Fivetran system
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetDestinationArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
