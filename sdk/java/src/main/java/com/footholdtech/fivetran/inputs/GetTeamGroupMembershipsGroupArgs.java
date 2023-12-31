// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTeamGroupMembershipsGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTeamGroupMembershipsGroupArgs Empty = new GetTeamGroupMembershipsGroupArgs();

    /**
     * The date and time the membership was created
     * 
     */
    @Import(name="createdAt", required=true)
    private Output<String> createdAt;

    /**
     * @return The date and time the membership was created
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }

    /**
     * The group unique identifier
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The group unique identifier
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The team&#39;s role that links the team and the group
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The team&#39;s role that links the team and the group
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private GetTeamGroupMembershipsGroupArgs() {}

    private GetTeamGroupMembershipsGroupArgs(GetTeamGroupMembershipsGroupArgs $) {
        this.createdAt = $.createdAt;
        this.groupId = $.groupId;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamGroupMembershipsGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamGroupMembershipsGroupArgs $;

        public Builder() {
            $ = new GetTeamGroupMembershipsGroupArgs();
        }

        public Builder(GetTeamGroupMembershipsGroupArgs defaults) {
            $ = new GetTeamGroupMembershipsGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The date and time the membership was created
         * 
         * @return builder
         * 
         */
        public Builder createdAt(Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time the membership was created
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param groupId The group unique identifier
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group unique identifier
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param role The team&#39;s role that links the team and the group
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The team&#39;s role that links the team and the group
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public GetTeamGroupMembershipsGroupArgs build() {
            $.createdAt = Objects.requireNonNull($.createdAt, "expected parameter 'createdAt' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
