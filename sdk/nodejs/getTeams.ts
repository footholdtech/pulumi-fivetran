// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source returns a list of all teams within your Fivetran account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@pulumi/fivetran";
 *
 * const teams = fivetran.getTeams({});
 * ```
 */
export function getTeams(args?: GetTeamsArgs, opts?: pulumi.InvokeOptions): Promise<GetTeamsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fivetran:index/getTeams:getTeams", {
        "teams": args.teams,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeams.
 */
export interface GetTeamsArgs {
    teams?: inputs.GetTeamsTeam[];
}

/**
 * A collection of values returned by getTeams.
 */
export interface GetTeamsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly teams: outputs.GetTeamsTeam[];
}
/**
 * This data source returns a list of all teams within your Fivetran account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@pulumi/fivetran";
 *
 * const teams = fivetran.getTeams({});
 * ```
 */
export function getTeamsOutput(args?: GetTeamsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTeamsResult> {
    return pulumi.output(args).apply((a: any) => getTeams(a, opts))
}

/**
 * A collection of arguments for invoking getTeams.
 */
export interface GetTeamsOutputArgs {
    teams?: pulumi.Input<pulumi.Input<inputs.GetTeamsTeamArgs>[]>;
}