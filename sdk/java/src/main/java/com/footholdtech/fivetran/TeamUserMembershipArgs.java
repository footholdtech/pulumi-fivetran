// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran;

import com.footholdtech.fivetran.inputs.TeamUserMembershipUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamUserMembershipArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamUserMembershipArgs Empty = new TeamUserMembershipArgs();

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

    @Import(name="users")
    private @Nullable Output<List<TeamUserMembershipUserArgs>> users;

    public Optional<Output<List<TeamUserMembershipUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private TeamUserMembershipArgs() {}

    private TeamUserMembershipArgs(TeamUserMembershipArgs $) {
        this.teamId = $.teamId;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamUserMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamUserMembershipArgs $;

        public Builder() {
            $ = new TeamUserMembershipArgs();
        }

        public Builder(TeamUserMembershipArgs defaults) {
            $ = new TeamUserMembershipArgs(Objects.requireNonNull(defaults));
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

        public Builder users(@Nullable Output<List<TeamUserMembershipUserArgs>> users) {
            $.users = users;
            return this;
        }

        public Builder users(List<TeamUserMembershipUserArgs> users) {
            return users(Output.of(users));
        }

        public Builder users(TeamUserMembershipUserArgs... users) {
            return users(List.of(users));
        }

        public TeamUserMembershipArgs build() {
            $.teamId = Objects.requireNonNull($.teamId, "expected parameter 'teamId' to be non-null");
            return $;
        }
    }

}