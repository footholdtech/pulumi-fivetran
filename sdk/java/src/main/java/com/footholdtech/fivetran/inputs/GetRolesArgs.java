// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetRolesRoleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRolesArgs Empty = new GetRolesArgs();

    @Import(name="roles")
    private @Nullable Output<List<GetRolesRoleArgs>> roles;

    public Optional<Output<List<GetRolesRoleArgs>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    private GetRolesArgs() {}

    private GetRolesArgs(GetRolesArgs $) {
        this.roles = $.roles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRolesArgs $;

        public Builder() {
            $ = new GetRolesArgs();
        }

        public Builder(GetRolesArgs defaults) {
            $ = new GetRolesArgs(Objects.requireNonNull(defaults));
        }

        public Builder roles(@Nullable Output<List<GetRolesRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        public Builder roles(List<GetRolesRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        public Builder roles(GetRolesRoleArgs... roles) {
            return roles(List.of(roles));
        }

        public GetRolesArgs build() {
            return $;
        }
    }

}
