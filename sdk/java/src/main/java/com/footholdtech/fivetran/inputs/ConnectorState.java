// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.ConnectorAuthArgs;
import com.footholdtech.fivetran.inputs.ConnectorConfigArgs;
import com.footholdtech.fivetran.inputs.ConnectorDestinationSchemaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorState Empty = new ConnectorState();

    @Import(name="auth")
    private @Nullable Output<ConnectorAuthArgs> auth;

    public Optional<Output<ConnectorAuthArgs>> auth() {
        return Optional.ofNullable(this.auth);
    }

    @Import(name="config")
    private @Nullable Output<ConnectorConfigArgs> config;

    public Optional<Output<ConnectorConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The unique identifier of the user who has created the connector in your account
     * 
     */
    @Import(name="connectedBy")
    private @Nullable Output<String> connectedBy;

    /**
     * @return The unique identifier of the user who has created the connector in your account
     * 
     */
    public Optional<Output<String>> connectedBy() {
        return Optional.ofNullable(this.connectedBy);
    }

    /**
     * The timestamp of the time the connector was created in your account
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The timestamp of the time the connector was created in your account
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="destinationSchema")
    private @Nullable Output<ConnectorDestinationSchemaArgs> destinationSchema;

    public Optional<Output<ConnectorDestinationSchemaArgs>> destinationSchema() {
        return Optional.ofNullable(this.destinationSchema);
    }

    /**
     * The unique identifier for the Group (Destination) within the Fivetran system.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The unique identifier for the Group (Destination) within the Fivetran system.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    /**
     * The name used both as the connector&#39;s name within the Fivetran system and as the source schema&#39;s name within your
     * destination.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name used both as the connector&#39;s name within the Fivetran system and as the source schema&#39;s name within your
     * destination.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies whether the setup tests should be run automatically. The default value is TRUE.
     * 
     */
    @Import(name="runSetupTests")
    private @Nullable Output<String> runSetupTests;

    /**
     * @return Specifies whether the setup tests should be run automatically. The default value is TRUE.
     * 
     */
    public Optional<Output<String>> runSetupTests() {
        return Optional.ofNullable(this.runSetupTests);
    }

    /**
     * The connector type name within the Fivetran system.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The connector type name within the Fivetran system.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * Specifies whether we should trust the certificate automatically. The default value is FALSE. If a certificate is not
     * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
     * certificate](https://fivetran.com/docs/rest-api/certificates#approveadestinationcertificate).
     * 
     */
    @Import(name="trustCertificates")
    private @Nullable Output<String> trustCertificates;

    /**
     * @return Specifies whether we should trust the certificate automatically. The default value is FALSE. If a certificate is not
     * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
     * certificate](https://fivetran.com/docs/rest-api/certificates#approveadestinationcertificate).
     * 
     */
    public Optional<Output<String>> trustCertificates() {
        return Optional.ofNullable(this.trustCertificates);
    }

    /**
     * Specifies whether we should trust the SSH fingerprint automatically. The default value is FALSE. If a fingerprint is not
     * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
     * fingerprint](https://fivetran.com/docs/rest-api/certificates#approveadestinationfingerprint).
     * 
     */
    @Import(name="trustFingerprints")
    private @Nullable Output<String> trustFingerprints;

    /**
     * @return Specifies whether we should trust the SSH fingerprint automatically. The default value is FALSE. If a fingerprint is not
     * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
     * fingerprint](https://fivetran.com/docs/rest-api/certificates#approveadestinationfingerprint).
     * 
     */
    public Optional<Output<String>> trustFingerprints() {
        return Optional.ofNullable(this.trustFingerprints);
    }

    private ConnectorState() {}

    private ConnectorState(ConnectorState $) {
        this.auth = $.auth;
        this.config = $.config;
        this.connectedBy = $.connectedBy;
        this.createdAt = $.createdAt;
        this.destinationSchema = $.destinationSchema;
        this.groupId = $.groupId;
        this.lastUpdated = $.lastUpdated;
        this.name = $.name;
        this.runSetupTests = $.runSetupTests;
        this.service = $.service;
        this.trustCertificates = $.trustCertificates;
        this.trustFingerprints = $.trustFingerprints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorState $;

        public Builder() {
            $ = new ConnectorState();
        }

        public Builder(ConnectorState defaults) {
            $ = new ConnectorState(Objects.requireNonNull(defaults));
        }

        public Builder auth(@Nullable Output<ConnectorAuthArgs> auth) {
            $.auth = auth;
            return this;
        }

        public Builder auth(ConnectorAuthArgs auth) {
            return auth(Output.of(auth));
        }

        public Builder config(@Nullable Output<ConnectorConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(ConnectorConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param connectedBy The unique identifier of the user who has created the connector in your account
         * 
         * @return builder
         * 
         */
        public Builder connectedBy(@Nullable Output<String> connectedBy) {
            $.connectedBy = connectedBy;
            return this;
        }

        /**
         * @param connectedBy The unique identifier of the user who has created the connector in your account
         * 
         * @return builder
         * 
         */
        public Builder connectedBy(String connectedBy) {
            return connectedBy(Output.of(connectedBy));
        }

        /**
         * @param createdAt The timestamp of the time the connector was created in your account
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The timestamp of the time the connector was created in your account
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder destinationSchema(@Nullable Output<ConnectorDestinationSchemaArgs> destinationSchema) {
            $.destinationSchema = destinationSchema;
            return this;
        }

        public Builder destinationSchema(ConnectorDestinationSchemaArgs destinationSchema) {
            return destinationSchema(Output.of(destinationSchema));
        }

        /**
         * @param groupId The unique identifier for the Group (Destination) within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The unique identifier for the Group (Destination) within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        /**
         * @param name The name used both as the connector&#39;s name within the Fivetran system and as the source schema&#39;s name within your
         * destination.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name used both as the connector&#39;s name within the Fivetran system and as the source schema&#39;s name within your
         * destination.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runSetupTests Specifies whether the setup tests should be run automatically. The default value is TRUE.
         * 
         * @return builder
         * 
         */
        public Builder runSetupTests(@Nullable Output<String> runSetupTests) {
            $.runSetupTests = runSetupTests;
            return this;
        }

        /**
         * @param runSetupTests Specifies whether the setup tests should be run automatically. The default value is TRUE.
         * 
         * @return builder
         * 
         */
        public Builder runSetupTests(String runSetupTests) {
            return runSetupTests(Output.of(runSetupTests));
        }

        /**
         * @param service The connector type name within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The connector type name within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param trustCertificates Specifies whether we should trust the certificate automatically. The default value is FALSE. If a certificate is not
         * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
         * certificate](https://fivetran.com/docs/rest-api/certificates#approveadestinationcertificate).
         * 
         * @return builder
         * 
         */
        public Builder trustCertificates(@Nullable Output<String> trustCertificates) {
            $.trustCertificates = trustCertificates;
            return this;
        }

        /**
         * @param trustCertificates Specifies whether we should trust the certificate automatically. The default value is FALSE. If a certificate is not
         * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
         * certificate](https://fivetran.com/docs/rest-api/certificates#approveadestinationcertificate).
         * 
         * @return builder
         * 
         */
        public Builder trustCertificates(String trustCertificates) {
            return trustCertificates(Output.of(trustCertificates));
        }

        /**
         * @param trustFingerprints Specifies whether we should trust the SSH fingerprint automatically. The default value is FALSE. If a fingerprint is not
         * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
         * fingerprint](https://fivetran.com/docs/rest-api/certificates#approveadestinationfingerprint).
         * 
         * @return builder
         * 
         */
        public Builder trustFingerprints(@Nullable Output<String> trustFingerprints) {
            $.trustFingerprints = trustFingerprints;
            return this;
        }

        /**
         * @param trustFingerprints Specifies whether we should trust the SSH fingerprint automatically. The default value is FALSE. If a fingerprint is not
         * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
         * fingerprint](https://fivetran.com/docs/rest-api/certificates#approveadestinationfingerprint).
         * 
         * @return builder
         * 
         */
        public Builder trustFingerprints(String trustFingerprints) {
            return trustFingerprints(Output.of(trustFingerprints));
        }

        public ConnectorState build() {
            return $;
        }
    }

}
