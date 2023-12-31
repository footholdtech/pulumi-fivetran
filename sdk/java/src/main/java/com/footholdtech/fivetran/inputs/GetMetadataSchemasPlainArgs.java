// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetMetadataSchemasMetadataSchema;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetadataSchemasPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetadataSchemasPlainArgs Empty = new GetMetadataSchemasPlainArgs();

    /**
     * The unique schema identifier
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique schema identifier
     * 
     */
    public String id() {
        return this.id;
    }

    @Import(name="metadataSchemas")
    private @Nullable List<GetMetadataSchemasMetadataSchema> metadataSchemas;

    public Optional<List<GetMetadataSchemasMetadataSchema>> metadataSchemas() {
        return Optional.ofNullable(this.metadataSchemas);
    }

    private GetMetadataSchemasPlainArgs() {}

    private GetMetadataSchemasPlainArgs(GetMetadataSchemasPlainArgs $) {
        this.id = $.id;
        this.metadataSchemas = $.metadataSchemas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetadataSchemasPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetadataSchemasPlainArgs $;

        public Builder() {
            $ = new GetMetadataSchemasPlainArgs();
        }

        public Builder(GetMetadataSchemasPlainArgs defaults) {
            $ = new GetMetadataSchemasPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique schema identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder metadataSchemas(@Nullable List<GetMetadataSchemasMetadataSchema> metadataSchemas) {
            $.metadataSchemas = metadataSchemas;
            return this;
        }

        public Builder metadataSchemas(GetMetadataSchemasMetadataSchema... metadataSchemas) {
            return metadataSchemas(List.of(metadataSchemas));
        }

        public GetMetadataSchemasPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
