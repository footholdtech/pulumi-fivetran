// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran;

import com.footholdtech.fivetran.DestinationFingerprintsArgs;
import com.footholdtech.fivetran.Utilities;
import com.footholdtech.fivetran.inputs.DestinationFingerprintsState;
import com.footholdtech.fivetran.outputs.DestinationFingerprintsFingerprint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage list of approved SSH fingerprints for a particular destination.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.fivetran.DestinationFingerprints;
 * import com.pulumi.fivetran.DestinationFingerprintsArgs;
 * import com.pulumi.fivetran.inputs.DestinationFingerprintsFingerprintArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myDestinationApprovedFingerprints = new DestinationFingerprints(&#34;myDestinationApprovedFingerprints&#34;, DestinationFingerprintsArgs.builder()        
 *             .destinationId(fivetran_destination.my_destination().id())
 *             .fingerprints(            
 *                 DestinationFingerprintsFingerprintArgs.builder()
 *                     .hash(&#34;jhgfJfgrI6yy...&#34;)
 *                     .publicKey(&#34;ssh-rsa CCCCB3NzaC1yc2ECCASFWFWDFRWT5WAS ... fivetran user key&#34;)
 *                     .build(),
 *                 DestinationFingerprintsFingerprintArgs.builder()
 *                     .hash(&#34;eUtPirI6yytWe...&#34;)
 *                     .publicKey(&#34;ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC6 ... fivetran user key&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * 1. To import an existing `fivetran_destination_fingerprints` resource into your Terraform state, you need to get **Destination Group ID** on the destination page in your Fivetran dashboard. 2. To retrieve existing groups, use the [fivetran_groups data source](/docs/data-sources/groups). 3. Define an empty resource in your `.tf` configurationhcl resource &#34;fivetran_destination_fingerprints&#34; &#34;my_imported_destination_fingerprints&#34; { }
 * 
 * ```sh
 *  $ pulumi import fivetran:index/destinationFingerprints:DestinationFingerprints
 * 
 * Run the `terraform import` command
 * ```
 * 
 * ```sh
 *  $ pulumi import fivetran:index/destinationFingerprints:DestinationFingerprints my_imported_destination_fingerprints {your Destination Group ID}
 * ```
 * 
 * 5.  
 * 
 * Use the `terraform state show` command to get the values from the stateterraform state show &#39;fivetran_destination_fingerprints.my_imported_destination_fingerprints&#39; 6. Copy the values and paste them to your `.tf` configuration.
 * 
 */
@ResourceType(type="fivetran:index/destinationFingerprints:DestinationFingerprints")
public class DestinationFingerprints extends com.pulumi.resources.CustomResource {
    /**
     * The unique identifier for the target destination within the Fivetran system.
     * 
     */
    @Export(name="destinationId", refs={String.class}, tree="[0]")
    private Output<String> destinationId;

    /**
     * @return The unique identifier for the target destination within the Fivetran system.
     * 
     */
    public Output<String> destinationId() {
        return this.destinationId;
    }
    @Export(name="fingerprints", refs={List.class,DestinationFingerprintsFingerprint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DestinationFingerprintsFingerprint>> fingerprints;

    public Output<Optional<List<DestinationFingerprintsFingerprint>>> fingerprints() {
        return Codegen.optional(this.fingerprints);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DestinationFingerprints(String name) {
        this(name, DestinationFingerprintsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DestinationFingerprints(String name, DestinationFingerprintsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DestinationFingerprints(String name, DestinationFingerprintsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fivetran:index/destinationFingerprints:DestinationFingerprints", name, args == null ? DestinationFingerprintsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DestinationFingerprints(String name, Output<String> id, @Nullable DestinationFingerprintsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fivetran:index/destinationFingerprints:DestinationFingerprints", name, state, makeResourceOptions(options, id));
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
    public static DestinationFingerprints get(String name, Output<String> id, @Nullable DestinationFingerprintsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DestinationFingerprints(name, id, state, options);
    }
}
