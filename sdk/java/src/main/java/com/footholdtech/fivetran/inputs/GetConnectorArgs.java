// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetConnectorConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorArgs Empty = new GetConnectorArgs();

    @Import(name="configs")
    private @Nullable Output<List<GetConnectorConfigArgs>> configs;

    public Optional<Output<List<GetConnectorConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private GetConnectorArgs() {}

    private GetConnectorArgs(GetConnectorArgs $) {
        this.configs = $.configs;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorArgs $;

        public Builder() {
            $ = new GetConnectorArgs();
        }

        public Builder(GetConnectorArgs defaults) {
            $ = new GetConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder configs(@Nullable Output<List<GetConnectorConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        public Builder configs(List<GetConnectorConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        public Builder configs(GetConnectorConfigArgs... configs) {
            return configs(List.of(configs));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetConnectorArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}