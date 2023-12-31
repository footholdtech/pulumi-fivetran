// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorDestinationSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorDestinationSchemaArgs Empty = new ConnectorDestinationSchemaArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="table")
    private @Nullable Output<String> table;

    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private ConnectorDestinationSchemaArgs() {}

    private ConnectorDestinationSchemaArgs(ConnectorDestinationSchemaArgs $) {
        this.name = $.name;
        this.prefix = $.prefix;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorDestinationSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorDestinationSchemaArgs $;

        public Builder() {
            $ = new ConnectorDestinationSchemaArgs();
        }

        public Builder(ConnectorDestinationSchemaArgs defaults) {
            $ = new ConnectorDestinationSchemaArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        public Builder table(String table) {
            return table(Output.of(table));
        }

        public ConnectorDestinationSchemaArgs build() {
            return $;
        }
    }

}
