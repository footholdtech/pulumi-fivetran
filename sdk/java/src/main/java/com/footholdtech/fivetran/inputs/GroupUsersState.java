// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GroupUsersUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupUsersState extends com.pulumi.resources.ResourceArgs {

    public static final GroupUsersState Empty = new GroupUsersState();

    /**
     * The unique identifier for the Group within the Fivetran system.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The unique identifier for the Group within the Fivetran system.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    @Import(name="users")
    private @Nullable Output<List<GroupUsersUserArgs>> users;

    public Optional<Output<List<GroupUsersUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private GroupUsersState() {}

    private GroupUsersState(GroupUsersState $) {
        this.groupId = $.groupId;
        this.lastUpdated = $.lastUpdated;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupUsersState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupUsersState $;

        public Builder() {
            $ = new GroupUsersState();
        }

        public Builder(GroupUsersState defaults) {
            $ = new GroupUsersState(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The unique identifier for the Group within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The unique identifier for the Group within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        public Builder users(@Nullable Output<List<GroupUsersUserArgs>> users) {
            $.users = users;
            return this;
        }

        public Builder users(List<GroupUsersUserArgs> users) {
            return users(Output.of(users));
        }

        public Builder users(GroupUsersUserArgs... users) {
            return users(List.of(users));
        }

        public GroupUsersState build() {
            return $;
        }
    }

}