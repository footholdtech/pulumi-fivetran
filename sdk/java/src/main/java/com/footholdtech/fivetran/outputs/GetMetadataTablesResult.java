// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.footholdtech.fivetran.outputs.GetMetadataTablesMetadataTable;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMetadataTablesResult {
    /**
     * @return The unique identifier for the connector within the Fivetran system. Data-source will represent a set of tables of connector.
     * 
     */
    private String id;
    private List<GetMetadataTablesMetadataTable> metadataTables;

    private GetMetadataTablesResult() {}
    /**
     * @return The unique identifier for the connector within the Fivetran system. Data-source will represent a set of tables of connector.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetMetadataTablesMetadataTable> metadataTables() {
        return this.metadataTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataTablesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetMetadataTablesMetadataTable> metadataTables;
        public Builder() {}
        public Builder(GetMetadataTablesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.metadataTables = defaults.metadataTables;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder metadataTables(List<GetMetadataTablesMetadataTable> metadataTables) {
            this.metadataTables = Objects.requireNonNull(metadataTables);
            return this;
        }
        public Builder metadataTables(GetMetadataTablesMetadataTable... metadataTables) {
            return metadataTables(List.of(metadataTables));
        }
        public GetMetadataTablesResult build() {
            final var o = new GetMetadataTablesResult();
            o.id = id;
            o.metadataTables = metadataTables;
            return o;
        }
    }
}
