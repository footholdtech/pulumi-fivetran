// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source returns a connector object.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const connector = fivetran.getConnector({
 *     id: "anonymous_mystery",
 * });
 * ```
 */
export function getConnector(args: GetConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fivetran:index/getConnector:getConnector", {
        "config": args.config,
        "destinationSchema": args.destinationSchema,
        "id": args.id,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnector.
 */
export interface GetConnectorArgs {
    config?: inputs.GetConnectorConfig;
    destinationSchema?: inputs.GetConnectorDestinationSchema;
    id: string;
    status?: inputs.GetConnectorStatus;
}

/**
 * A collection of values returned by getConnector.
 */
export interface GetConnectorResult {
    readonly config?: outputs.GetConnectorConfig;
    readonly connectedBy: string;
    readonly createdAt: string;
    readonly dailySyncTime: string;
    readonly dataDelaySensitivity: string;
    readonly dataDelayThreshold: number;
    readonly destinationSchema?: outputs.GetConnectorDestinationSchema;
    readonly failedAt: string;
    readonly groupId: string;
    readonly hybridDeploymentAgentId: string;
    readonly id: string;
    readonly name: string;
    readonly networkingMethod: string;
    readonly pauseAfterTrial: boolean;
    readonly paused: boolean;
    readonly privateLinkId: string;
    readonly proxyAgentId: string;
    readonly scheduleType: string;
    readonly service: string;
    readonly serviceVersion: string;
    readonly status?: outputs.GetConnectorStatus;
    readonly succeededAt: string;
    readonly syncFrequency: number;
}
/**
 * This data source returns a connector object.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const connector = fivetran.getConnector({
 *     id: "anonymous_mystery",
 * });
 * ```
 */
export function getConnectorOutput(args: GetConnectorOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConnectorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("fivetran:index/getConnector:getConnector", {
        "config": args.config,
        "destinationSchema": args.destinationSchema,
        "id": args.id,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnector.
 */
export interface GetConnectorOutputArgs {
    config?: pulumi.Input<inputs.GetConnectorConfigArgs>;
    destinationSchema?: pulumi.Input<inputs.GetConnectorDestinationSchemaArgs>;
    id: pulumi.Input<string>;
    status?: pulumi.Input<inputs.GetConnectorStatusArgs>;
}
