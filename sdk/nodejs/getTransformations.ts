// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Returns a list of all transformations available via API within your Fivetran account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const test = fivetran.getTransformations({});
 * ```
 */
export function getTransformations(args?: GetTransformationsArgs, opts?: pulumi.InvokeOptions): Promise<GetTransformationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fivetran:index/getTransformations:getTransformations", {
        "transformations": args.transformations,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransformations.
 */
export interface GetTransformationsArgs {
    transformations?: inputs.GetTransformationsTransformation[];
}

/**
 * A collection of values returned by getTransformations.
 */
export interface GetTransformationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly transformations?: outputs.GetTransformationsTransformation[];
}
/**
 * Returns a list of all transformations available via API within your Fivetran account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const test = fivetran.getTransformations({});
 * ```
 */
export function getTransformationsOutput(args?: GetTransformationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransformationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("fivetran:index/getTransformations:getTransformations", {
        "transformations": args.transformations,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransformations.
 */
export interface GetTransformationsOutputArgs {
    transformations?: pulumi.Input<pulumi.Input<inputs.GetTransformationsTransformationArgs>[]>;
}
