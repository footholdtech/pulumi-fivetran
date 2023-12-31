// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDbtProjectProjectConfig {
    private String folderPath;
    private String gitBranch;
    private String gitRemoteUrl;

    private GetDbtProjectProjectConfig() {}
    public String folderPath() {
        return this.folderPath;
    }
    public String gitBranch() {
        return this.gitBranch;
    }
    public String gitRemoteUrl() {
        return this.gitRemoteUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbtProjectProjectConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String folderPath;
        private String gitBranch;
        private String gitRemoteUrl;
        public Builder() {}
        public Builder(GetDbtProjectProjectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderPath = defaults.folderPath;
    	      this.gitBranch = defaults.gitBranch;
    	      this.gitRemoteUrl = defaults.gitRemoteUrl;
        }

        @CustomType.Setter
        public Builder folderPath(String folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }
        @CustomType.Setter
        public Builder gitBranch(String gitBranch) {
            this.gitBranch = Objects.requireNonNull(gitBranch);
            return this;
        }
        @CustomType.Setter
        public Builder gitRemoteUrl(String gitRemoteUrl) {
            this.gitRemoteUrl = Objects.requireNonNull(gitRemoteUrl);
            return this;
        }
        public GetDbtProjectProjectConfig build() {
            final var o = new GetDbtProjectProjectConfig();
            o.folderPath = folderPath;
            o.gitBranch = gitBranch;
            o.gitRemoteUrl = gitRemoteUrl;
            return o;
        }
    }
}
