// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source returns a list of SSH fingerprints approved for specified connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const connectorFingerprints = fivetran.getConnectorFingerprints({
 *     id: "connector_id",
 * });
 * ```
 */
export function getConnectorFingerprints(args: GetConnectorFingerprintsArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectorFingerprintsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fivetran:index/getConnectorFingerprints:getConnectorFingerprints", {
        "fingerprints": args.fingerprints,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnectorFingerprints.
 */
export interface GetConnectorFingerprintsArgs {
    fingerprints?: inputs.GetConnectorFingerprintsFingerprint[];
    /**
     * The unique identifier for the resource. Equal to target connection id.
     */
    id: string;
}

/**
 * A collection of values returned by getConnectorFingerprints.
 */
export interface GetConnectorFingerprintsResult {
    /**
     * The unique identifier for the target connection within the Fivetran system.
     */
    readonly connectorId: string;
    readonly fingerprints?: outputs.GetConnectorFingerprintsFingerprint[];
    /**
     * The unique identifier for the resource. Equal to target connection id.
     */
    readonly id: string;
}
/**
 * This data source returns a list of SSH fingerprints approved for specified connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const connectorFingerprints = fivetran.getConnectorFingerprints({
 *     id: "connector_id",
 * });
 * ```
 */
export function getConnectorFingerprintsOutput(args: GetConnectorFingerprintsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConnectorFingerprintsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("fivetran:index/getConnectorFingerprints:getConnectorFingerprints", {
        "fingerprints": args.fingerprints,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnectorFingerprints.
 */
export interface GetConnectorFingerprintsOutputArgs {
    fingerprints?: pulumi.Input<pulumi.Input<inputs.GetConnectorFingerprintsFingerprintArgs>[]>;
    /**
     * The unique identifier for the resource. Equal to target connection id.
     */
    id: pulumi.Input<string>;
}
