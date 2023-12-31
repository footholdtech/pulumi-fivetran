// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetTeamsTeamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamsArgs Empty = new GetTeamsArgs();

    @Import(name="teams")
    private @Nullable Output<List<GetTeamsTeamArgs>> teams;

    public Optional<Output<List<GetTeamsTeamArgs>>> teams() {
        return Optional.ofNullable(this.teams);
    }

    private GetTeamsArgs() {}

    private GetTeamsArgs(GetTeamsArgs $) {
        this.teams = $.teams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamsArgs $;

        public Builder() {
            $ = new GetTeamsArgs();
        }

        public Builder(GetTeamsArgs defaults) {
            $ = new GetTeamsArgs(Objects.requireNonNull(defaults));
        }

        public Builder teams(@Nullable Output<List<GetTeamsTeamArgs>> teams) {
            $.teams = teams;
            return this;
        }

        public Builder teams(List<GetTeamsTeamArgs> teams) {
            return teams(Output.of(teams));
        }

        public Builder teams(GetTeamsTeamArgs... teams) {
            return teams(List.of(teams));
        }

        public GetTeamsArgs build() {
            return $;
        }
    }

}
