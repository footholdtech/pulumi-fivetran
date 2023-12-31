// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran;

import com.footholdtech.fivetran.inputs.ConnectorFingerprintsFingerprintArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorFingerprintsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorFingerprintsArgs Empty = new ConnectorFingerprintsArgs();

    /**
     * The unique identifier for the target connector within the Fivetran system.
     * 
     */
    @Import(name="connectorId", required=true)
    private Output<String> connectorId;

    /**
     * @return The unique identifier for the target connector within the Fivetran system.
     * 
     */
    public Output<String> connectorId() {
        return this.connectorId;
    }

    @Import(name="fingerprints")
    private @Nullable Output<List<ConnectorFingerprintsFingerprintArgs>> fingerprints;

    public Optional<Output<List<ConnectorFingerprintsFingerprintArgs>>> fingerprints() {
        return Optional.ofNullable(this.fingerprints);
    }

    private ConnectorFingerprintsArgs() {}

    private ConnectorFingerprintsArgs(ConnectorFingerprintsArgs $) {
        this.connectorId = $.connectorId;
        this.fingerprints = $.fingerprints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorFingerprintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorFingerprintsArgs $;

        public Builder() {
            $ = new ConnectorFingerprintsArgs();
        }

        public Builder(ConnectorFingerprintsArgs defaults) {
            $ = new ConnectorFingerprintsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectorId The unique identifier for the target connector within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder connectorId(Output<String> connectorId) {
            $.connectorId = connectorId;
            return this;
        }

        /**
         * @param connectorId The unique identifier for the target connector within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder connectorId(String connectorId) {
            return connectorId(Output.of(connectorId));
        }

        public Builder fingerprints(@Nullable Output<List<ConnectorFingerprintsFingerprintArgs>> fingerprints) {
            $.fingerprints = fingerprints;
            return this;
        }

        public Builder fingerprints(List<ConnectorFingerprintsFingerprintArgs> fingerprints) {
            return fingerprints(Output.of(fingerprints));
        }

        public Builder fingerprints(ConnectorFingerprintsFingerprintArgs... fingerprints) {
            return fingerprints(List.of(fingerprints));
        }

        public ConnectorFingerprintsArgs build() {
            $.connectorId = Objects.requireNonNull($.connectorId, "expected parameter 'connectorId' to be non-null");
            return $;
        }
    }

}
