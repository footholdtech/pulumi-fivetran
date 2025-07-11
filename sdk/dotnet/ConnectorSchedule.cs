// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran
{
    /// <summary>
    /// -This resource allows you to manage connectors schedule: pause/unpause connector, set daily_sync_time and sync_frequency.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Fivetran = Footholdtech.Fivetran;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myConnectorSchedule = new Fivetran.ConnectorSchedule("my_connector_schedule", new()
    ///     {
    ///         ConnectorId = myConnector.Id,
    ///         SyncFrequency = "1440",
    ///         DailySyncTime = "03:00",
    ///         Paused = "false",
    ///         PauseAfterTrial = "true",
    ///         ScheduleType = "auto",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You don't need to import this resource as it is synthetic.
    /// 
    /// To fetch schedule values from existing connector use `fivetran_connector` data source:
    /// 
    /// hcl
    /// 
    /// data "fivetran_connector" "my_connector" {
    /// 
    ///     id = "my_connector_id"
    /// 
    /// }
    /// 
    /// now you can use schedule values from this data_source:
    /// 
    ///   sync_frequency = data.fivetran_connector.my_connector.sync_frequency
    /// 
    ///   paused = data.fivetran_connector.my_connector.paused
    /// 
    /// This resource manages settings for already existing connector instance and doesn't create a new one.
    /// 
    /// If you already have an existing connector with id = `my_connector_id` just define `fivetran_connector_schedule` resource:
    /// 
    /// hcl
    /// 
    /// resource "fivetran_connector_schedule" "my_connector_schedule" {
    /// 
    ///     connector_id = "my_connector_id"
    ///     
    ///     sync_frequency     = "360"
    ///     
    ///     paused             = false
    ///     
    ///     pause_after_trial  = true
    ///     
    ///     schedule_type      = "auto"
    /// 
    /// }
    /// 
    /// -&gt; NOTE: You can't have several resources managing the same `connector_id`. They will be in conflict ater each `apply`.
    /// </summary>
    [FivetranResourceType("fivetran:index/connectorSchedule:ConnectorSchedule")]
    public partial class ConnectorSchedule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The unique identifier for the connector within the Fivetran system.
        /// </summary>
        [Output("connectorId")]
        public Output<string> ConnectorId { get; private set; } = null!;

        /// <summary>
        /// The optional parameter that defines the sync start time when the sync frequency is already set or being set by the current request to 1440. It can be specified in one hour increments starting from 00:00 to 23:00. If not specified, we will use [the baseline sync start time](https://fivetran.com/docs/getting-started/syncoverview#syncfrequencyandscheduling). This parameter has no effect on the [0 to 60 minutes offset](https://fivetran.com/docs/getting-started/syncoverview#syncstarttimesandoffsets) used to determine the actual sync start time.
        /// </summary>
        [Output("dailySyncTime")]
        public Output<string> DailySyncTime { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the connector should be paused after the free trial period has ended.
        /// </summary>
        [Output("pauseAfterTrial")]
        public Output<string> PauseAfterTrial { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the connector is paused.
        /// </summary>
        [Output("paused")]
        public Output<string> Paused { get; private set; } = null!;

        /// <summary>
        /// The connector schedule configuration type. Supported values: auto, manual.
        /// </summary>
        [Output("scheduleType")]
        public Output<string> ScheduleType { get; private set; } = null!;

        /// <summary>
        /// The connector sync frequency in minutes. Supported values: 1, 5, 15, 30, 60, 120, 180, 360, 480, 720, 1440.
        /// </summary>
        [Output("syncFrequency")]
        public Output<string> SyncFrequency { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectorSchedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectorSchedule(string name, ConnectorScheduleArgs args, CustomResourceOptions? options = null)
            : base("fivetran:index/connectorSchedule:ConnectorSchedule", name, args ?? new ConnectorScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectorSchedule(string name, Input<string> id, ConnectorScheduleState? state = null, CustomResourceOptions? options = null)
            : base("fivetran:index/connectorSchedule:ConnectorSchedule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/footholdtech/pulumi-fivetran",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ConnectorSchedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectorSchedule Get(string name, Input<string> id, ConnectorScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectorSchedule(name, id, state, options);
        }
    }

    public sealed class ConnectorScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier for the connector within the Fivetran system.
        /// </summary>
        [Input("connectorId", required: true)]
        public Input<string> ConnectorId { get; set; } = null!;

        /// <summary>
        /// The optional parameter that defines the sync start time when the sync frequency is already set or being set by the current request to 1440. It can be specified in one hour increments starting from 00:00 to 23:00. If not specified, we will use [the baseline sync start time](https://fivetran.com/docs/getting-started/syncoverview#syncfrequencyandscheduling). This parameter has no effect on the [0 to 60 minutes offset](https://fivetran.com/docs/getting-started/syncoverview#syncstarttimesandoffsets) used to determine the actual sync start time.
        /// </summary>
        [Input("dailySyncTime")]
        public Input<string>? DailySyncTime { get; set; }

        /// <summary>
        /// Specifies whether the connector should be paused after the free trial period has ended.
        /// </summary>
        [Input("pauseAfterTrial")]
        public Input<string>? PauseAfterTrial { get; set; }

        /// <summary>
        /// Specifies whether the connector is paused.
        /// </summary>
        [Input("paused")]
        public Input<string>? Paused { get; set; }

        /// <summary>
        /// The connector schedule configuration type. Supported values: auto, manual.
        /// </summary>
        [Input("scheduleType")]
        public Input<string>? ScheduleType { get; set; }

        /// <summary>
        /// The connector sync frequency in minutes. Supported values: 1, 5, 15, 30, 60, 120, 180, 360, 480, 720, 1440.
        /// </summary>
        [Input("syncFrequency")]
        public Input<string>? SyncFrequency { get; set; }

        public ConnectorScheduleArgs()
        {
        }
        public static new ConnectorScheduleArgs Empty => new ConnectorScheduleArgs();
    }

    public sealed class ConnectorScheduleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier for the connector within the Fivetran system.
        /// </summary>
        [Input("connectorId")]
        public Input<string>? ConnectorId { get; set; }

        /// <summary>
        /// The optional parameter that defines the sync start time when the sync frequency is already set or being set by the current request to 1440. It can be specified in one hour increments starting from 00:00 to 23:00. If not specified, we will use [the baseline sync start time](https://fivetran.com/docs/getting-started/syncoverview#syncfrequencyandscheduling). This parameter has no effect on the [0 to 60 minutes offset](https://fivetran.com/docs/getting-started/syncoverview#syncstarttimesandoffsets) used to determine the actual sync start time.
        /// </summary>
        [Input("dailySyncTime")]
        public Input<string>? DailySyncTime { get; set; }

        /// <summary>
        /// Specifies whether the connector should be paused after the free trial period has ended.
        /// </summary>
        [Input("pauseAfterTrial")]
        public Input<string>? PauseAfterTrial { get; set; }

        /// <summary>
        /// Specifies whether the connector is paused.
        /// </summary>
        [Input("paused")]
        public Input<string>? Paused { get; set; }

        /// <summary>
        /// The connector schedule configuration type. Supported values: auto, manual.
        /// </summary>
        [Input("scheduleType")]
        public Input<string>? ScheduleType { get; set; }

        /// <summary>
        /// The connector sync frequency in minutes. Supported values: 1, 5, 15, 30, 60, 120, 180, 360, 480, 720, 1440.
        /// </summary>
        [Input("syncFrequency")]
        public Input<string>? SyncFrequency { get; set; }

        public ConnectorScheduleState()
        {
        }
        public static new ConnectorScheduleState Empty => new ConnectorScheduleState();
    }
}
