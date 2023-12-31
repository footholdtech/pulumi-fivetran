// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran
{
    public static class GetDestination
    {
        /// <summary>
        /// This data source returns a destination object.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var dest = Fivetran.GetDestination.Invoke(new()
        ///     {
        ///         Id = "anonymous_mystery",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDestinationResult> InvokeAsync(GetDestinationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDestinationResult>("fivetran:index/getDestination:getDestination", args ?? new GetDestinationArgs(), options.WithDefaults());

        /// <summary>
        /// This data source returns a destination object.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fivetran = Pulumi.Fivetran;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var dest = Fivetran.GetDestination.Invoke(new()
        ///     {
        ///         Id = "anonymous_mystery",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDestinationResult> Invoke(GetDestinationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDestinationResult>("fivetran:index/getDestination:getDestination", args ?? new GetDestinationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDestinationArgs : global::Pulumi.InvokeArgs
    {
        [Input("configs")]
        private List<Inputs.GetDestinationConfigArgs>? _configs;
        public List<Inputs.GetDestinationConfigArgs> Configs
        {
            get => _configs ?? (_configs = new List<Inputs.GetDestinationConfigArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// The unique identifier for the destination within the Fivetran system
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetDestinationArgs()
        {
        }
        public static new GetDestinationArgs Empty => new GetDestinationArgs();
    }

    public sealed class GetDestinationInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("configs")]
        private InputList<Inputs.GetDestinationConfigInputArgs>? _configs;
        public InputList<Inputs.GetDestinationConfigInputArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.GetDestinationConfigInputArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// The unique identifier for the destination within the Fivetran system
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetDestinationInvokeArgs()
        {
        }
        public static new GetDestinationInvokeArgs Empty => new GetDestinationInvokeArgs();
    }


    [OutputType]
    public sealed class GetDestinationResult
    {
        public readonly ImmutableArray<Outputs.GetDestinationConfigResult> Configs;
        /// <summary>
        /// The unique identifier for the Group within the Fivetran system.
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// The unique identifier for the destination within the Fivetran system
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Data processing location. This is where Fivetran will operate and run computation on data.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The destination type name within the Fivetran system
        /// </summary>
        public readonly string Service;
        /// <summary>
        /// Destination setup status
        /// </summary>
        public readonly string SetupStatus;
        /// <summary>
        /// Determines the time zone for the Fivetran sync schedule.
        /// </summary>
        public readonly string TimeZoneOffset;

        [OutputConstructor]
        private GetDestinationResult(
            ImmutableArray<Outputs.GetDestinationConfigResult> configs,

            string groupId,

            string id,

            string region,

            string service,

            string setupStatus,

            string timeZoneOffset)
        {
            Configs = configs;
            GroupId = groupId;
            Id = id;
            Region = region;
            Service = service;
            SetupStatus = setupStatus;
            TimeZoneOffset = timeZoneOffset;
        }
    }
}
