// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectorConfigProjectCredential {
    private String apiKey;
    private String project;
    private String secretKey;

    private GetConnectorConfigProjectCredential() {}
    public String apiKey() {
        return this.apiKey;
    }
    public String project() {
        return this.project;
    }
    public String secretKey() {
        return this.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorConfigProjectCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKey;
        private String project;
        private String secretKey;
        public Builder() {}
        public Builder(GetConnectorConfigProjectCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.project = defaults.project;
    	      this.secretKey = defaults.secretKey;
        }

        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }
        public GetConnectorConfigProjectCredential build() {
            final var o = new GetConnectorConfigProjectCredential();
            o.apiKey = apiKey;
            o.project = project;
            o.secretKey = secretKey;
            return o;
        }
    }
}
