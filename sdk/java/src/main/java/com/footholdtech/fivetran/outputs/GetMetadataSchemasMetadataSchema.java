// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMetadataSchemasMetadataSchema {
    /**
     * @return The unique schema identifier
     * 
     */
    private String id;
    /**
     * @return The schema name in the destination
     * 
     */
    private String nameInDestination;
    /**
     * @return The schema name in the source
     * 
     */
    private String nameInSource;

    private GetMetadataSchemasMetadataSchema() {}
    /**
     * @return The unique schema identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The schema name in the destination
     * 
     */
    public String nameInDestination() {
        return this.nameInDestination;
    }
    /**
     * @return The schema name in the source
     * 
     */
    public String nameInSource() {
        return this.nameInSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataSchemasMetadataSchema defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String nameInDestination;
        private String nameInSource;
        public Builder() {}
        public Builder(GetMetadataSchemasMetadataSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.nameInDestination = defaults.nameInDestination;
    	      this.nameInSource = defaults.nameInSource;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder nameInDestination(String nameInDestination) {
            this.nameInDestination = Objects.requireNonNull(nameInDestination);
            return this;
        }
        @CustomType.Setter
        public Builder nameInSource(String nameInSource) {
            this.nameInSource = Objects.requireNonNull(nameInSource);
            return this;
        }
        public GetMetadataSchemasMetadataSchema build() {
            final var o = new GetMetadataSchemasMetadataSchema();
            o.id = id;
            o.nameInDestination = nameInDestination;
            o.nameInSource = nameInSource;
            return o;
        }
    }
}
