// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran;

import com.footholdtech.fivetran.ConnectorArgs;
import com.footholdtech.fivetran.Utilities;
import com.footholdtech.fivetran.inputs.ConnectorState;
import com.footholdtech.fivetran.outputs.ConnectorAuth;
import com.footholdtech.fivetran.outputs.ConnectorConfig;
import com.footholdtech.fivetran.outputs.ConnectorDestinationSchema;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ### How to authorize connector
 * 
 */
@ResourceType(type="fivetran:index/connector:Connector")
public class Connector extends com.pulumi.resources.CustomResource {
    @Export(name="auth", refs={ConnectorAuth.class}, tree="[0]")
    private Output</* @Nullable */ ConnectorAuth> auth;

    public Output<Optional<ConnectorAuth>> auth() {
        return Codegen.optional(this.auth);
    }
    @Export(name="config", refs={ConnectorConfig.class}, tree="[0]")
    private Output<ConnectorConfig> config;

    public Output<ConnectorConfig> config() {
        return this.config;
    }
    /**
     * The unique identifier of the user who has created the connector in your account
     * 
     */
    @Export(name="connectedBy", refs={String.class}, tree="[0]")
    private Output<String> connectedBy;

    /**
     * @return The unique identifier of the user who has created the connector in your account
     * 
     */
    public Output<String> connectedBy() {
        return this.connectedBy;
    }
    /**
     * The timestamp of the time the connector was created in your account
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The timestamp of the time the connector was created in your account
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="destinationSchema", refs={ConnectorDestinationSchema.class}, tree="[0]")
    private Output<ConnectorDestinationSchema> destinationSchema;

    public Output<ConnectorDestinationSchema> destinationSchema() {
        return this.destinationSchema;
    }
    /**
     * The unique identifier for the Group (Destination) within the Fivetran system.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return The unique identifier for the Group (Destination) within the Fivetran system.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    @Export(name="lastUpdated", refs={String.class}, tree="[0]")
    private Output<String> lastUpdated;

    public Output<String> lastUpdated() {
        return this.lastUpdated;
    }
    /**
     * The name used both as the connector&#39;s name within the Fivetran system and as the source schema&#39;s name within your
     * destination.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name used both as the connector&#39;s name within the Fivetran system and as the source schema&#39;s name within your
     * destination.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies whether the setup tests should be run automatically. The default value is TRUE.
     * 
     */
    @Export(name="runSetupTests", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runSetupTests;

    /**
     * @return Specifies whether the setup tests should be run automatically. The default value is TRUE.
     * 
     */
    public Output<Optional<String>> runSetupTests() {
        return Codegen.optional(this.runSetupTests);
    }
    /**
     * The connector type name within the Fivetran system.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
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
    @Export(name="trustCertificates", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> trustCertificates;

    /**
     * @return Specifies whether we should trust the certificate automatically. The default value is FALSE. If a certificate is not
     * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
     * certificate](https://fivetran.com/docs/rest-api/certificates#approveadestinationcertificate).
     * 
     */
    public Output<Optional<String>> trustCertificates() {
        return Codegen.optional(this.trustCertificates);
    }
    /**
     * Specifies whether we should trust the SSH fingerprint automatically. The default value is FALSE. If a fingerprint is not
     * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
     * fingerprint](https://fivetran.com/docs/rest-api/certificates#approveadestinationfingerprint).
     * 
     */
    @Export(name="trustFingerprints", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> trustFingerprints;

    /**
     * @return Specifies whether we should trust the SSH fingerprint automatically. The default value is FALSE. If a fingerprint is not
     * trusted automatically, it has to be approved with [Certificates Management API Approve a destination
     * fingerprint](https://fivetran.com/docs/rest-api/certificates#approveadestinationfingerprint).
     * 
     */
    public Output<Optional<String>> trustFingerprints() {
        return Codegen.optional(this.trustFingerprints);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(String name, ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, ConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fivetran:index/connector:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connector(String name, Output<String> id, @Nullable ConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fivetran:index/connector:Connector", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Connector get(String name, Output<String> id, @Nullable ConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, state, options);
    }
}
