// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * -This resource allows you to manage connectors schedule: pause/unpause connector, set dailySyncTime and sync_frequency.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fivetran from "@footholdtech/fivetran";
 *
 * const myConnectorSchedule = new fivetran.ConnectorSchedule("my_connector_schedule", {
 *     connectorId: myConnector.id,
 *     syncFrequency: "1440",
 *     dailySyncTime: "03:00",
 *     paused: "false",
 *     pauseAfterTrial: "true",
 *     scheduleType: "auto",
 * });
 * ```
 *
 * ## Import
 *
 * You don't need to import this resource as it is synthetic.
 *
 * To fetch schedule values from existing connector use `fivetran_connector` data source:
 *
 * hcl
 *
 * data "fivetran_connector" "my_connector" {
 *
 *     id = "my_connector_id"
 *
 * }
 *
 * now you can use schedule values from this data_source:
 *
 *   sync_frequency = data.fivetran_connector.my_connector.sync_frequency
 *
 *   paused = data.fivetran_connector.my_connector.paused
 *
 * This resource manages settings for already existing connector instance and doesn't create a new one.
 *
 * If you already have an existing connector with id = `my_connector_id` just define `fivetran_connector_schedule` resource:
 *
 * hcl
 *
 * resource "fivetran_connector_schedule" "my_connector_schedule" {
 *
 *     connector_id = "my_connector_id"
 *     
 *     sync_frequency     = "360"
 *     
 *     paused             = false
 *     
 *     pause_after_trial  = true
 *     
 *     schedule_type      = "auto"
 *
 * }
 *
 * -> NOTE: You can't have several resources managing the same `connector_id`. They will be in conflict ater each `apply`.
 */
export class ConnectorSchedule extends pulumi.CustomResource {
    /**
     * Get an existing ConnectorSchedule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectorScheduleState, opts?: pulumi.CustomResourceOptions): ConnectorSchedule {
        return new ConnectorSchedule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'fivetran:index/connectorSchedule:ConnectorSchedule';

    /**
     * Returns true if the given object is an instance of ConnectorSchedule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConnectorSchedule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConnectorSchedule.__pulumiType;
    }

    /**
     * The unique identifier for the connector within the Fivetran system.
     */
    public readonly connectorId!: pulumi.Output<string>;
    /**
     * The optional parameter that defines the sync start time when the sync frequency is already set or being set by the current request to 1440. It can be specified in one hour increments starting from 00:00 to 23:00. If not specified, we will use [the baseline sync start time](https://fivetran.com/docs/getting-started/syncoverview#syncfrequencyandscheduling). This parameter has no effect on the [0 to 60 minutes offset](https://fivetran.com/docs/getting-started/syncoverview#syncstarttimesandoffsets) used to determine the actual sync start time.
     */
    public readonly dailySyncTime!: pulumi.Output<string>;
    /**
     * Specifies whether the connector should be paused after the free trial period has ended.
     */
    public readonly pauseAfterTrial!: pulumi.Output<string>;
    /**
     * Specifies whether the connector is paused.
     */
    public readonly paused!: pulumi.Output<string>;
    /**
     * The connector schedule configuration type. Supported values: auto, manual.
     */
    public readonly scheduleType!: pulumi.Output<string>;
    /**
     * The connector sync frequency in minutes. Supported values: 1, 5, 15, 30, 60, 120, 180, 360, 480, 720, 1440.
     */
    public readonly syncFrequency!: pulumi.Output<string>;

    /**
     * Create a ConnectorSchedule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectorScheduleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectorScheduleArgs | ConnectorScheduleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectorScheduleState | undefined;
            resourceInputs["connectorId"] = state ? state.connectorId : undefined;
            resourceInputs["dailySyncTime"] = state ? state.dailySyncTime : undefined;
            resourceInputs["pauseAfterTrial"] = state ? state.pauseAfterTrial : undefined;
            resourceInputs["paused"] = state ? state.paused : undefined;
            resourceInputs["scheduleType"] = state ? state.scheduleType : undefined;
            resourceInputs["syncFrequency"] = state ? state.syncFrequency : undefined;
        } else {
            const args = argsOrState as ConnectorScheduleArgs | undefined;
            if ((!args || args.connectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectorId'");
            }
            resourceInputs["connectorId"] = args ? args.connectorId : undefined;
            resourceInputs["dailySyncTime"] = args ? args.dailySyncTime : undefined;
            resourceInputs["pauseAfterTrial"] = args ? args.pauseAfterTrial : undefined;
            resourceInputs["paused"] = args ? args.paused : undefined;
            resourceInputs["scheduleType"] = args ? args.scheduleType : undefined;
            resourceInputs["syncFrequency"] = args ? args.syncFrequency : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConnectorSchedule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConnectorSchedule resources.
 */
export interface ConnectorScheduleState {
    /**
     * The unique identifier for the connector within the Fivetran system.
     */
    connectorId?: pulumi.Input<string>;
    /**
     * The optional parameter that defines the sync start time when the sync frequency is already set or being set by the current request to 1440. It can be specified in one hour increments starting from 00:00 to 23:00. If not specified, we will use [the baseline sync start time](https://fivetran.com/docs/getting-started/syncoverview#syncfrequencyandscheduling). This parameter has no effect on the [0 to 60 minutes offset](https://fivetran.com/docs/getting-started/syncoverview#syncstarttimesandoffsets) used to determine the actual sync start time.
     */
    dailySyncTime?: pulumi.Input<string>;
    /**
     * Specifies whether the connector should be paused after the free trial period has ended.
     */
    pauseAfterTrial?: pulumi.Input<string>;
    /**
     * Specifies whether the connector is paused.
     */
    paused?: pulumi.Input<string>;
    /**
     * The connector schedule configuration type. Supported values: auto, manual.
     */
    scheduleType?: pulumi.Input<string>;
    /**
     * The connector sync frequency in minutes. Supported values: 1, 5, 15, 30, 60, 120, 180, 360, 480, 720, 1440.
     */
    syncFrequency?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConnectorSchedule resource.
 */
export interface ConnectorScheduleArgs {
    /**
     * The unique identifier for the connector within the Fivetran system.
     */
    connectorId: pulumi.Input<string>;
    /**
     * The optional parameter that defines the sync start time when the sync frequency is already set or being set by the current request to 1440. It can be specified in one hour increments starting from 00:00 to 23:00. If not specified, we will use [the baseline sync start time](https://fivetran.com/docs/getting-started/syncoverview#syncfrequencyandscheduling). This parameter has no effect on the [0 to 60 minutes offset](https://fivetran.com/docs/getting-started/syncoverview#syncstarttimesandoffsets) used to determine the actual sync start time.
     */
    dailySyncTime?: pulumi.Input<string>;
    /**
     * Specifies whether the connector should be paused after the free trial period has ended.
     */
    pauseAfterTrial?: pulumi.Input<string>;
    /**
     * Specifies whether the connector is paused.
     */
    paused?: pulumi.Input<string>;
    /**
     * The connector schedule configuration type. Supported values: auto, manual.
     */
    scheduleType?: pulumi.Input<string>;
    /**
     * The connector sync frequency in minutes. Supported values: 1, 5, 15, 30, 60, 120, 180, 360, 480, 720, 1440.
     */
    syncFrequency?: pulumi.Input<string>;
}
