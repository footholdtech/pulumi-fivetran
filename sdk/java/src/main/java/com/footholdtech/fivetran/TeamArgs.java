// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamArgs Empty = new TeamArgs();

    /**
     * The description of the team within your account.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the team within your account.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the team within your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the team within your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The account role of the team.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The account role of the team.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private TeamArgs() {}

    private TeamArgs(TeamArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamArgs $;

        public Builder() {
            $ = new TeamArgs();
        }

        public Builder(TeamArgs defaults) {
            $ = new TeamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the team within your account.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the team within your account.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the team within your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the team within your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param role The account role of the team.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The account role of the team.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public TeamArgs build() {
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
