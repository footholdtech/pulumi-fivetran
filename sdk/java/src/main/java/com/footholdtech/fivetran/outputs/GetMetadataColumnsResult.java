// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.footholdtech.fivetran.outputs.GetMetadataColumnsMetadataColumn;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMetadataColumnsResult {
    /**
     * @return The unique identifier for the connector within the Fivetran system. Data-source will represent a set of columns of connector.
     * 
     */
    private String id;
    private List<GetMetadataColumnsMetadataColumn> metadataColumns;

    private GetMetadataColumnsResult() {}
    /**
     * @return The unique identifier for the connector within the Fivetran system. Data-source will represent a set of columns of connector.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetMetadataColumnsMetadataColumn> metadataColumns() {
        return this.metadataColumns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataColumnsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetMetadataColumnsMetadataColumn> metadataColumns;
        public Builder() {}
        public Builder(GetMetadataColumnsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.metadataColumns = defaults.metadataColumns;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder metadataColumns(List<GetMetadataColumnsMetadataColumn> metadataColumns) {
            this.metadataColumns = Objects.requireNonNull(metadataColumns);
            return this;
        }
        public Builder metadataColumns(GetMetadataColumnsMetadataColumn... metadataColumns) {
            return metadataColumns(List.of(metadataColumns));
        }
        public GetMetadataColumnsResult build() {
            final var o = new GetMetadataColumnsResult();
            o.id = id;
            o.metadataColumns = metadataColumns;
            return o;
        }
    }
}
