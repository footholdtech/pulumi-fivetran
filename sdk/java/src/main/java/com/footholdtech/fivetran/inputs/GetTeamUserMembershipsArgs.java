// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetTeamUserMembershipsUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamUserMembershipsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamUserMembershipsArgs Empty = new GetTeamUserMembershipsArgs();

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
    private @Nullable Output<List<GetTeamUserMembershipsUserArgs>> users;

    public Optional<Output<List<GetTeamUserMembershipsUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private GetTeamUserMembershipsArgs() {}

    private GetTeamUserMembershipsArgs(GetTeamUserMembershipsArgs $) {
        this.teamId = $.teamId;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamUserMembershipsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamUserMembershipsArgs $;

        public Builder() {
            $ = new GetTeamUserMembershipsArgs();
        }

        public Builder(GetTeamUserMembershipsArgs defaults) {
            $ = new GetTeamUserMembershipsArgs(Objects.requireNonNull(defaults));
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

        public Builder users(@Nullable Output<List<GetTeamUserMembershipsUserArgs>> users) {
            $.users = users;
            return this;
        }

        public Builder users(List<GetTeamUserMembershipsUserArgs> users) {
            return users(Output.of(users));
        }

        public Builder users(GetTeamUserMembershipsUserArgs... users) {
            return users(List.of(users));
        }

        public GetTeamUserMembershipsArgs build() {
            $.teamId = Objects.requireNonNull($.teamId, "expected parameter 'teamId' to be non-null");
            return $;
        }
    }

}