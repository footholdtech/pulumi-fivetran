// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran;

import com.footholdtech.fivetran.ExternalLoggingArgs;
import com.footholdtech.fivetran.Utilities;
import com.footholdtech.fivetran.inputs.ExternalLoggingState;
import com.footholdtech.fivetran.outputs.ExternalLoggingConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * 1. To import an existing `fivetran_external_logging` resource into your Terraform state, you need to get **External Logging Group ID** on the external logging page in your Fivetran dashboard. To retrieve existing groups, use the [fivetran_groups data source](/docs/data-sources/groups). 2. Define an empty resource in your `.tf` configurationhcl resource &#34;fivetran_external_logging&#34; &#34;my_imported_external_logging&#34; { }
 * 
 * ```sh
 *  $ pulumi import fivetran:index/externalLogging:ExternalLogging
 * 
 * Run the `terraform import` command with the following parameters
 * ```
 * 
 * ```sh
 *  $ pulumi import fivetran:index/externalLogging:ExternalLogging my_imported_external_logging {your External Logging Group ID}
 * ```
 * 
 *  4. Use the `terraform state show` command to get the values from the stateterraform state show &#39;fivetran_external_logging.my_imported_external_logging&#39; 5. Copy the values and paste them to your `.tf` configuration. -&gt; The `config` object in the state contains all properties defined in the schema. You need to remove properties from the `config` that are not related to destinations. See the [Fivetran REST API documentation](https://fivetran.com/docs/rest-api/log-service-management#logservicesetupconfigurations) for reference to find the properties you need to keep in the `config` section.
 * 
 */
@ResourceType(type="fivetran:index/externalLogging:ExternalLogging")
public class ExternalLogging extends com.pulumi.resources.CustomResource {
    @Export(name="config", refs={ExternalLoggingConfig.class}, tree="[0]")
    private Output<ExternalLoggingConfig> config;

    public Output<ExternalLoggingConfig> config() {
        return this.config;
    }
    /**
     * The boolean value specifying whether the log service is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return The boolean value specifying whether the log service is enabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The unique identifier for the log service within the Fivetran system.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return The unique identifier for the log service within the Fivetran system.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * Specifies whether the setup tests should be run automatically. The default value is TRUE.
     * 
     */
    @Export(name="runSetupTests", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> runSetupTests;

    /**
     * @return Specifies whether the setup tests should be run automatically. The default value is TRUE.
     * 
     */
    public Output<Optional<Boolean>> runSetupTests() {
        return Codegen.optional(this.runSetupTests);
    }
    /**
     * The name for the log service type within the Fivetran system. We support the following log services: azure*monitor*log, cloudwatch, datadog*log, new*relic_log, splunkLog, stackdriver.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The name for the log service type within the Fivetran system. We support the following log services: azure*monitor*log, cloudwatch, datadog*log, new*relic_log, splunkLog, stackdriver.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalLogging(String name) {
        this(name, ExternalLoggingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalLogging(String name, ExternalLoggingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalLogging(String name, ExternalLoggingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fivetran:index/externalLogging:ExternalLogging", name, args == null ? ExternalLoggingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExternalLogging(String name, Output<String> id, @Nullable ExternalLoggingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fivetran:index/externalLogging:ExternalLogging", name, state, makeResourceOptions(options, id));
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
    public static ExternalLogging get(String name, Output<String> id, @Nullable ExternalLoggingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalLogging(name, id, state, options);
    }
}
