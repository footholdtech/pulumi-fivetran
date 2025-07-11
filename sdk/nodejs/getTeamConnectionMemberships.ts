// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source returns a connection membership within team object.
 */
export function getTeamConnectionMemberships(args: GetTeamConnectionMembershipsArgs, opts?: pulumi.InvokeOptions): Promise<GetTeamConnectionMembershipsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fivetran:index/getTeamConnectionMemberships:getTeamConnectionMemberships", {
        "connections": args.connections,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeamConnectionMemberships.
 */
export interface GetTeamConnectionMembershipsArgs {
    connections?: inputs.GetTeamConnectionMembershipsConnection[];
    /**
     * The unique identifier for the team within your account.
     */
    id: string;
}

/**
 * A collection of values returned by getTeamConnectionMemberships.
 */
export interface GetTeamConnectionMembershipsResult {
    readonly connections?: outputs.GetTeamConnectionMembershipsConnection[];
    /**
     * The unique identifier for the team within your account.
     */
    readonly id: string;
}
/**
 * This data source returns a connection membership within team object.
 */
export function getTeamConnectionMembershipsOutput(args: GetTeamConnectionMembershipsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTeamConnectionMembershipsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("fivetran:index/getTeamConnectionMemberships:getTeamConnectionMemberships", {
        "connections": args.connections,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeamConnectionMemberships.
 */
export interface GetTeamConnectionMembershipsOutputArgs {
    connections?: pulumi.Input<pulumi.Input<inputs.GetTeamConnectionMembershipsConnectionArgs>[]>;
    /**
     * The unique identifier for the team within your account.
     */
    id: pulumi.Input<string>;
}
