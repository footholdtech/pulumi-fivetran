// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetMetadataTablesMetadataTableArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetadataTablesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetadataTablesArgs Empty = new GetMetadataTablesArgs();

    /**
     * The unique table identifier
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique table identifier
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="metadataTables")
    private @Nullable Output<List<GetMetadataTablesMetadataTableArgs>> metadataTables;

    public Optional<Output<List<GetMetadataTablesMetadataTableArgs>>> metadataTables() {
        return Optional.ofNullable(this.metadataTables);
    }

    private GetMetadataTablesArgs() {}

    private GetMetadataTablesArgs(GetMetadataTablesArgs $) {
        this.id = $.id;
        this.metadataTables = $.metadataTables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetadataTablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetadataTablesArgs $;

        public Builder() {
            $ = new GetMetadataTablesArgs();
        }

        public Builder(GetMetadataTablesArgs defaults) {
            $ = new GetMetadataTablesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique table identifier
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique table identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder metadataTables(@Nullable Output<List<GetMetadataTablesMetadataTableArgs>> metadataTables) {
            $.metadataTables = metadataTables;
            return this;
        }

        public Builder metadataTables(List<GetMetadataTablesMetadataTableArgs> metadataTables) {
            return metadataTables(Output.of(metadataTables));
        }

        public Builder metadataTables(GetMetadataTablesMetadataTableArgs... metadataTables) {
            return metadataTables(List.of(metadataTables));
        }

        public GetMetadataTablesArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}