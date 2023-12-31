// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupServiceAccountResult {
    /**
     * @return The unique identifier for the group within the Fivetran system.
     * 
     */
    private String id;
    /**
     * @return Fivetran service account associated with the group.
     * 
     */
    private String serviceAccount;

    private GetGroupServiceAccountResult() {}
    /**
     * @return The unique identifier for the group within the Fivetran system.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Fivetran service account associated with the group.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupServiceAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String serviceAccount;
        public Builder() {}
        public Builder(GetGroupServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public GetGroupServiceAccountResult build() {
            final var o = new GetGroupServiceAccountResult();
            o.id = id;
            o.serviceAccount = serviceAccount;
            return o;
        }
    }
}
