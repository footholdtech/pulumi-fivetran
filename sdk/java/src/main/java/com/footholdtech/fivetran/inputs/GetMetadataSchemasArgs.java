// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetMetadataSchemasMetadataSchemaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetadataSchemasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetadataSchemasArgs Empty = new GetMetadataSchemasArgs();

    /**
     * The unique schema identifier
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique schema identifier
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="metadataSchemas")
    private @Nullable Output<List<GetMetadataSchemasMetadataSchemaArgs>> metadataSchemas;

    public Optional<Output<List<GetMetadataSchemasMetadataSchemaArgs>>> metadataSchemas() {
        return Optional.ofNullable(this.metadataSchemas);
    }

    private GetMetadataSchemasArgs() {}

    private GetMetadataSchemasArgs(GetMetadataSchemasArgs $) {
        this.id = $.id;
        this.metadataSchemas = $.metadataSchemas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetadataSchemasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetadataSchemasArgs $;

        public Builder() {
            $ = new GetMetadataSchemasArgs();
        }

        public Builder(GetMetadataSchemasArgs defaults) {
            $ = new GetMetadataSchemasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique schema identifier
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique schema identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder metadataSchemas(@Nullable Output<List<GetMetadataSchemasMetadataSchemaArgs>> metadataSchemas) {
            $.metadataSchemas = metadataSchemas;
            return this;
        }

        public Builder metadataSchemas(List<GetMetadataSchemasMetadataSchemaArgs> metadataSchemas) {
            return metadataSchemas(Output.of(metadataSchemas));
        }

        public Builder metadataSchemas(GetMetadataSchemasMetadataSchemaArgs... metadataSchemas) {
            return metadataSchemas(List.of(metadataSchemas));
        }

        public GetMetadataSchemasArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
