// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebhooksWebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetWebhooksWebhookArgs Empty = new GetWebhooksWebhookArgs();

    /**
     * Boolean, if set to true, webhooks are immediately sent in response to events
     * 
     */
    @Import(name="active", required=true)
    private Output<Boolean> active;

    /**
     * @return Boolean, if set to true, webhooks are immediately sent in response to events
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }

    /**
     * The webhook creation timestamp
     * 
     */
    @Import(name="createdAt", required=true)
    private Output<String> createdAt;

    /**
     * @return The webhook creation timestamp
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }

    /**
     * The ID of the user who created the webhook.
     * 
     */
    @Import(name="createdBy", required=true)
    private Output<String> createdBy;

    /**
     * @return The ID of the user who created the webhook.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }

    /**
     * The array of event types
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    /**
     * @return The array of event types
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * The group ID
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The group ID
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The webhook ID
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The webhook ID
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Specifies whether the setup tests should be run
     * 
     */
    @Import(name="runTests")
    private @Nullable Output<Boolean> runTests;

    /**
     * @return Specifies whether the setup tests should be run
     * 
     */
    public Optional<Output<Boolean>> runTests() {
        return Optional.ofNullable(this.runTests);
    }

    /**
     * The secret string used for payload signing and masked in the response.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The secret string used for payload signing and masked in the response.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    /**
     * The webhook type (group, account)
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The webhook type (group, account)
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Your webhooks URL endpoint for your application
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Your webhooks URL endpoint for your application
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private GetWebhooksWebhookArgs() {}

    private GetWebhooksWebhookArgs(GetWebhooksWebhookArgs $) {
        this.active = $.active;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.events = $.events;
        this.groupId = $.groupId;
        this.id = $.id;
        this.runTests = $.runTests;
        this.secret = $.secret;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebhooksWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebhooksWebhookArgs $;

        public Builder() {
            $ = new GetWebhooksWebhookArgs();
        }

        public Builder(GetWebhooksWebhookArgs defaults) {
            $ = new GetWebhooksWebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Boolean, if set to true, webhooks are immediately sent in response to events
         * 
         * @return builder
         * 
         */
        public Builder active(Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Boolean, if set to true, webhooks are immediately sent in response to events
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param createdAt The webhook creation timestamp
         * 
         * @return builder
         * 
         */
        public Builder createdAt(Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The webhook creation timestamp
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy The ID of the user who created the webhook.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The ID of the user who created the webhook.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param events The array of event types
         * 
         * @return builder
         * 
         */
        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events The array of event types
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events The array of event types
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        /**
         * @param groupId The group ID
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group ID
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param id The webhook ID
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The webhook ID
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param runTests Specifies whether the setup tests should be run
         * 
         * @return builder
         * 
         */
        public Builder runTests(@Nullable Output<Boolean> runTests) {
            $.runTests = runTests;
            return this;
        }

        /**
         * @param runTests Specifies whether the setup tests should be run
         * 
         * @return builder
         * 
         */
        public Builder runTests(Boolean runTests) {
            return runTests(Output.of(runTests));
        }

        /**
         * @param secret The secret string used for payload signing and masked in the response.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The secret string used for payload signing and masked in the response.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param type The webhook type (group, account)
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The webhook type (group, account)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url Your webhooks URL endpoint for your application
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Your webhooks URL endpoint for your application
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GetWebhooksWebhookArgs build() {
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.createdAt = Objects.requireNonNull($.createdAt, "expected parameter 'createdAt' to be non-null");
            $.createdBy = Objects.requireNonNull($.createdBy, "expected parameter 'createdBy' to be non-null");
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}