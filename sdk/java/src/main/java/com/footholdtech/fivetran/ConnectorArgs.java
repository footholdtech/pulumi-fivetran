// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran;

import com.footholdtech.fivetran.inputs.ConnectorAuthArgs;
import com.footholdtech.fivetran.inputs.ConnectorConfigArgs;
import com.footholdtech.fivetran.inputs.ConnectorDestinationSchemaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorArgs Empty = new ConnectorArgs();

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

    @Import(name="destinationSchema", required=true)
    private Output<ConnectorDestinationSchemaArgs> destinationSchema;

    public Output<ConnectorDestinationSchemaArgs> destinationSchema() {
        return this.destinationSchema;
    }

    /**
     * The unique identifier for the Group (Destination) within the Fivetran system.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The unique identifier for the Group (Destination) within the Fivetran system.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
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
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The connector type name within the Fivetran system.
     * 
     */
    public Output<String> service() {
        return this.service;
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

    private ConnectorArgs() {}

    private ConnectorArgs(ConnectorArgs $) {
        this.auth = $.auth;
        this.config = $.config;
        this.destinationSchema = $.destinationSchema;
        this.groupId = $.groupId;
        this.runSetupTests = $.runSetupTests;
        this.service = $.service;
        this.trustCertificates = $.trustCertificates;
        this.trustFingerprints = $.trustFingerprints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorArgs $;

        public Builder() {
            $ = new ConnectorArgs();
        }

        public Builder(ConnectorArgs defaults) {
            $ = new ConnectorArgs(Objects.requireNonNull(defaults));
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

        public Builder destinationSchema(Output<ConnectorDestinationSchemaArgs> destinationSchema) {
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
        public Builder groupId(Output<String> groupId) {
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
        public Builder service(Output<String> service) {
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

        public ConnectorArgs build() {
            $.destinationSchema = Objects.requireNonNull($.destinationSchema, "expected parameter 'destinationSchema' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
