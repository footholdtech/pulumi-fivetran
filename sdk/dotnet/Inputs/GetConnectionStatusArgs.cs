// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran.Inputs
{

    public sealed class GetConnectionStatusInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The boolean specifying whether the connection should be triggered to re-sync all historical data. If you set this parameter to TRUE, the next scheduled sync will be historical. If the value is FALSE or not specified, the connection will not re-sync historical data. NOTE: When the value is TRUE, only the next scheduled sync will be historical, all subsequent ones will be incremental. This parameter is set to FALSE once the historical sync is completed.
        /// </summary>
        [Input("isHistoricalSync", required: true)]
        public Input<bool> IsHistoricalSync { get; set; } = null!;

        /// <summary>
        /// The current setup state of the connection. The available values are: \n\n - incomplete - the setup config is incomplete, the setup tests never succeeded  `connected` - the connection is properly set up, `broken` - the connection setup config is broken.
        /// </summary>
        [Input("setupState", required: true)]
        public Input<string> SetupState { get; set; } = null!;

        /// <summary>
        /// The current sync state of the connection. The available values are: `scheduled` - the sync is waiting to be run, `syncing` - the sync is currently running, `paused` - the sync is currently paused, `rescheduled` - the sync is waiting until more API calls are available in the source service.
        /// </summary>
        [Input("syncState", required: true)]
        public Input<string> SyncState { get; set; } = null!;

        [Input("tasks", required: true)]
        private InputList<Inputs.GetConnectionStatusTaskInputArgs>? _tasks;

        /// <summary>
        /// The collection of tasks for the connection.
        /// </summary>
        public InputList<Inputs.GetConnectionStatusTaskInputArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.GetConnectionStatusTaskInputArgs>());
            set => _tasks = value;
        }

        /// <summary>
        /// The current data update state of the connection. The available values are: `on_schedule` - the sync is running smoothly, no delays, `delayed` - the data is delayed for a longer time than expected for the update.
        /// </summary>
        [Input("updateState", required: true)]
        public Input<string> UpdateState { get; set; } = null!;

        [Input("warnings", required: true)]
        private InputList<Inputs.GetConnectionStatusWarningInputArgs>? _warnings;

        /// <summary>
        /// The collection of warnings for the connection.
        /// </summary>
        public InputList<Inputs.GetConnectionStatusWarningInputArgs> Warnings
        {
            get => _warnings ?? (_warnings = new InputList<Inputs.GetConnectionStatusWarningInputArgs>());
            set => _warnings = value;
        }

        public GetConnectionStatusInputArgs()
        {
        }
        public static new GetConnectionStatusInputArgs Empty => new GetConnectionStatusInputArgs();
    }
}
