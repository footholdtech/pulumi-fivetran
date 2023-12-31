// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.TeamConnectorMembershipConnectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamConnectorMembershipState extends com.pulumi.resources.ResourceArgs {

    public static final TeamConnectorMembershipState Empty = new TeamConnectorMembershipState();

    @Import(name="connectors")
    private @Nullable Output<List<TeamConnectorMembershipConnectorArgs>> connectors;

    public Optional<Output<List<TeamConnectorMembershipConnectorArgs>>> connectors() {
        return Optional.ofNullable(this.connectors);
    }

    /**
     * The unique identifier for the team within your account.
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return The unique identifier for the team within your account.
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private TeamConnectorMembershipState() {}

    private TeamConnectorMembershipState(TeamConnectorMembershipState $) {
        this.connectors = $.connectors;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamConnectorMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamConnectorMembershipState $;

        public Builder() {
            $ = new TeamConnectorMembershipState();
        }

        public Builder(TeamConnectorMembershipState defaults) {
            $ = new TeamConnectorMembershipState(Objects.requireNonNull(defaults));
        }

        public Builder connectors(@Nullable Output<List<TeamConnectorMembershipConnectorArgs>> connectors) {
            $.connectors = connectors;
            return this;
        }

        public Builder connectors(List<TeamConnectorMembershipConnectorArgs> connectors) {
            return connectors(Output.of(connectors));
        }

        public Builder connectors(TeamConnectorMembershipConnectorArgs... connectors) {
            return connectors(List.of(connectors));
        }

        /**
         * @param teamId The unique identifier for the team within your account.
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
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

        public TeamConnectorMembershipState build() {
            return $;
        }
    }

}
