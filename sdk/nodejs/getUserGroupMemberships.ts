// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source returns a list of group memberships for user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const teamGroupMemberships = fivetran.getUserGroupMemberships({
 *     userId: "user_id",
 * });
 * ```
 */
export function getUserGroupMemberships(args: GetUserGroupMembershipsArgs, opts?: pulumi.InvokeOptions): Promise<GetUserGroupMembershipsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fivetran:index/getUserGroupMemberships:getUserGroupMemberships", {
        "groups": args.groups,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserGroupMemberships.
 */
export interface GetUserGroupMembershipsArgs {
    groups?: inputs.GetUserGroupMembershipsGroup[];
    /**
     * The unique identifier for the user within your account.
     */
    userId: string;
}

/**
 * A collection of values returned by getUserGroupMemberships.
 */
export interface GetUserGroupMembershipsResult {
    readonly groups?: outputs.GetUserGroupMembershipsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The unique identifier for the user within your account.
     */
    readonly userId: string;
}
/**
 * This data source returns a list of group memberships for user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const teamGroupMemberships = fivetran.getUserGroupMemberships({
 *     userId: "user_id",
 * });
 * ```
 */
export function getUserGroupMembershipsOutput(args: GetUserGroupMembershipsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetUserGroupMembershipsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("fivetran:index/getUserGroupMemberships:getUserGroupMemberships", {
        "groups": args.groups,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserGroupMemberships.
 */
export interface GetUserGroupMembershipsOutputArgs {
    groups?: pulumi.Input<pulumi.Input<inputs.GetUserGroupMembershipsGroupArgs>[]>;
    /**
     * The unique identifier for the user within your account.
     */
    userId: pulumi.Input<string>;
}
