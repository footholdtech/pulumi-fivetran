// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetUsersUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUsersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUsersArgs Empty = new GetUsersArgs();

    @Import(name="users")
    private @Nullable Output<List<GetUsersUserArgs>> users;

    public Optional<Output<List<GetUsersUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private GetUsersArgs() {}

    private GetUsersArgs(GetUsersArgs $) {
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersArgs $;

        public Builder() {
            $ = new GetUsersArgs();
        }

        public Builder(GetUsersArgs defaults) {
            $ = new GetUsersArgs(Objects.requireNonNull(defaults));
        }

        public Builder users(@Nullable Output<List<GetUsersUserArgs>> users) {
            $.users = users;
            return this;
        }

        public Builder users(List<GetUsersUserArgs> users) {
            return users(Output.of(users));
        }

        public Builder users(GetUsersUserArgs... users) {
            return users(List.of(users));
        }

        public GetUsersArgs build() {
            return $;
        }
    }

}
