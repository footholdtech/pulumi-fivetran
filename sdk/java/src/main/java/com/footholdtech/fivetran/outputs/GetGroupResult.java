// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * @return The timestamp of when the group was created in your account.
     * 
     */
    private String createdAt;
    /**
     * @return The unique identifier for the group within the Fivetran system.
     * 
     */
    private String id;
    /**
     * @return The name of the group within your account.
     * 
     */
    private String name;

    private GetGroupResult() {}
    /**
     * @return The timestamp of when the group was created in your account.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The unique identifier for the group within the Fivetran system.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the group within your account.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetGroupResult build() {
            final var o = new GetGroupResult();
            o.createdAt = createdAt;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}