// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Returns a list of all transformation projects available via API within your Fivetran account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const test = fivetran.getTransformationProjects({});
 * ```
 */
export function getTransformationProjects(opts?: pulumi.InvokeOptions): Promise<GetTransformationProjectsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fivetran:index/getTransformationProjects:getTransformationProjects", {
    }, opts);
}

/**
 * A collection of values returned by getTransformationProjects.
 */
export interface GetTransformationProjectsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projects: outputs.GetTransformationProjectsProject[];
}
/**
 * Returns a list of all transformation projects available via API within your Fivetran account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const test = fivetran.getTransformationProjects({});
 * ```
 */
export function getTransformationProjectsOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransformationProjectsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("fivetran:index/getTransformationProjects:getTransformationProjects", {
    }, opts);
}
