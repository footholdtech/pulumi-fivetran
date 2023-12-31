// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetTeamConnectorMembershipsConnectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamConnectorMembershipsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamConnectorMembershipsArgs Empty = new GetTeamConnectorMembershipsArgs();

    @Import(name="connectors")
    private @Nullable Output<List<GetTeamConnectorMembershipsConnectorArgs>> connectors;

    public Optional<Output<List<GetTeamConnectorMembershipsConnectorArgs>>> connectors() {
        return Optional.ofNullable(this.connectors);
    }

    /**
     * The unique identifier for the team within your account.
     * 
     */
    @Import(name="teamId", required=true)
    private Output<String> teamId;

    /**
     * @return The unique identifier for the team within your account.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }

    private GetTeamConnectorMembershipsArgs() {}

    private GetTeamConnectorMembershipsArgs(GetTeamConnectorMembershipsArgs $) {
        this.connectors = $.connectors;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamConnectorMembershipsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamConnectorMembershipsArgs $;

        public Builder() {
            $ = new GetTeamConnectorMembershipsArgs();
        }

        public Builder(GetTeamConnectorMembershipsArgs defaults) {
            $ = new GetTeamConnectorMembershipsArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectors(@Nullable Output<List<GetTeamConnectorMembershipsConnectorArgs>> connectors) {
            $.connectors = connectors;
            return this;
        }

        public Builder connectors(List<GetTeamConnectorMembershipsConnectorArgs> connectors) {
            return connectors(Output.of(connectors));
        }

        public Builder connectors(GetTeamConnectorMembershipsConnectorArgs... connectors) {
            return connectors(List.of(connectors));
        }

        /**
         * @param teamId The unique identifier for the team within your account.
         * 
         * @return builder
         * 
         */
        public Builder teamId(Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId The unique identifier for the team within your account.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public GetTeamConnectorMembershipsArgs build() {
            $.teamId = Objects.requireNonNull($.teamId, "expected parameter 'teamId' to be non-null");
            return $;
        }
    }

}
