// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTeamPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamPlainArgs Empty = new GetTeamPlainArgs();

    /**
     * The unique identifier for the team within your account.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique identifier for the team within your account.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetTeamPlainArgs() {}

    private GetTeamPlainArgs(GetTeamPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamPlainArgs $;

        public Builder() {
            $ = new GetTeamPlainArgs();
        }

        public Builder(GetTeamPlainArgs defaults) {
            $ = new GetTeamPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier for the team within your account.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetTeamPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}