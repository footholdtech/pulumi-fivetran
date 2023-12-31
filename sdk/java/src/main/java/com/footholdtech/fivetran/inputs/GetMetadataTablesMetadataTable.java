// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMetadataTablesMetadataTable extends com.pulumi.resources.InvokeArgs {

    public static final GetMetadataTablesMetadataTable Empty = new GetMetadataTablesMetadataTable();

    /**
     * The unique table identifier
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique table identifier
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The table name in the destination
     * 
     */
    @Import(name="nameInDestination", required=true)
    private String nameInDestination;

    /**
     * @return The table name in the destination
     * 
     */
    public String nameInDestination() {
        return this.nameInDestination;
    }

    /**
     * The table name in the source
     * 
     */
    @Import(name="nameInSource", required=true)
    private String nameInSource;

    /**
     * @return The table name in the source
     * 
     */
    public String nameInSource() {
        return this.nameInSource;
    }

    /**
     * The unique identifier of the schema associated with the table
     * 
     */
    @Import(name="parentId", required=true)
    private String parentId;

    /**
     * @return The unique identifier of the schema associated with the table
     * 
     */
    public String parentId() {
        return this.parentId;
    }

    private GetMetadataTablesMetadataTable() {}

    private GetMetadataTablesMetadataTable(GetMetadataTablesMetadataTable $) {
        this.id = $.id;
        this.nameInDestination = $.nameInDestination;
        this.nameInSource = $.nameInSource;
        this.parentId = $.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetadataTablesMetadataTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetadataTablesMetadataTable $;

        public Builder() {
            $ = new GetMetadataTablesMetadataTable();
        }

        public Builder(GetMetadataTablesMetadataTable defaults) {
            $ = new GetMetadataTablesMetadataTable(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique table identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param nameInDestination The table name in the destination
         * 
         * @return builder
         * 
         */
        public Builder nameInDestination(String nameInDestination) {
            $.nameInDestination = nameInDestination;
            return this;
        }

        /**
         * @param nameInSource The table name in the source
         * 
         * @return builder
         * 
         */
        public Builder nameInSource(String nameInSource) {
            $.nameInSource = nameInSource;
            return this;
        }

        /**
         * @param parentId The unique identifier of the schema associated with the table
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            $.parentId = parentId;
            return this;
        }

        public GetMetadataTablesMetadataTable build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.nameInDestination = Objects.requireNonNull($.nameInDestination, "expected parameter 'nameInDestination' to be non-null");
            $.nameInSource = Objects.requireNonNull($.nameInSource, "expected parameter 'nameInSource' to be non-null");
            $.parentId = Objects.requireNonNull($.parentId, "expected parameter 'parentId' to be non-null");
            return $;
        }
    }

}
