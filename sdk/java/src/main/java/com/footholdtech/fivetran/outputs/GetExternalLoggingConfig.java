// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExternalLoggingConfig {
    /**
     * @return API Key
     * 
     */
    private @Nullable String apiKey;
    /**
     * @return Channel
     * 
     */
    private @Nullable String channel;
    /**
     * @return Enable SSL
     * 
     */
    private @Nullable Boolean enableSsl;
    /**
     * @return external_id
     * 
     */
    private @Nullable String externalId;
    /**
     * @return Server name
     * 
     */
    private @Nullable String host;
    /**
     * @return Server name
     * 
     */
    private @Nullable String hostname;
    /**
     * @return Log Group Name
     * 
     */
    private @Nullable String logGroupName;
    /**
     * @return Port
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Primary Key
     * 
     */
    private @Nullable String primaryKey;
    /**
     * @return Region
     * 
     */
    private @Nullable String region;
    /**
     * @return Role Arn
     * 
     */
    private @Nullable String roleArn;
    /**
     * @return Sub Domain
     * 
     */
    private @Nullable String subDomain;
    /**
     * @return Token
     * 
     */
    private @Nullable String token;
    /**
     * @return Workspace ID
     * 
     */
    private @Nullable String workspaceId;

    private GetExternalLoggingConfig() {}
    /**
     * @return API Key
     * 
     */
    public Optional<String> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * @return Channel
     * 
     */
    public Optional<String> channel() {
        return Optional.ofNullable(this.channel);
    }
    /**
     * @return Enable SSL
     * 
     */
    public Optional<Boolean> enableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }
    /**
     * @return external_id
     * 
     */
    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }
    /**
     * @return Server name
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return Server name
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return Log Group Name
     * 
     */
    public Optional<String> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }
    /**
     * @return Port
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Primary Key
     * 
     */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * @return Region
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Role Arn
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return Sub Domain
     * 
     */
    public Optional<String> subDomain() {
        return Optional.ofNullable(this.subDomain);
    }
    /**
     * @return Token
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }
    /**
     * @return Workspace ID
     * 
     */
    public Optional<String> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalLoggingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable String channel;
        private @Nullable Boolean enableSsl;
        private @Nullable String externalId;
        private @Nullable String host;
        private @Nullable String hostname;
        private @Nullable String logGroupName;
        private @Nullable Integer port;
        private @Nullable String primaryKey;
        private @Nullable String region;
        private @Nullable String roleArn;
        private @Nullable String subDomain;
        private @Nullable String token;
        private @Nullable String workspaceId;
        public Builder() {}
        public Builder(GetExternalLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.channel = defaults.channel;
    	      this.enableSsl = defaults.enableSsl;
    	      this.externalId = defaults.externalId;
    	      this.host = defaults.host;
    	      this.hostname = defaults.hostname;
    	      this.logGroupName = defaults.logGroupName;
    	      this.port = defaults.port;
    	      this.primaryKey = defaults.primaryKey;
    	      this.region = defaults.region;
    	      this.roleArn = defaults.roleArn;
    	      this.subDomain = defaults.subDomain;
    	      this.token = defaults.token;
    	      this.workspaceId = defaults.workspaceId;
        }

        @CustomType.Setter
        public Builder apiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder channel(@Nullable String channel) {
            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder enableSsl(@Nullable Boolean enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }
        @CustomType.Setter
        public Builder externalId(@Nullable String externalId) {
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder subDomain(@Nullable String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }
        @CustomType.Setter
        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public GetExternalLoggingConfig build() {
            final var o = new GetExternalLoggingConfig();
            o.apiKey = apiKey;
            o.channel = channel;
            o.enableSsl = enableSsl;
            o.externalId = externalId;
            o.host = host;
            o.hostname = hostname;
            o.logGroupName = logGroupName;
            o.port = port;
            o.primaryKey = primaryKey;
            o.region = region;
            o.roleArn = roleArn;
            o.subDomain = subDomain;
            o.token = token;
            o.workspaceId = workspaceId;
            return o;
        }
    }
}