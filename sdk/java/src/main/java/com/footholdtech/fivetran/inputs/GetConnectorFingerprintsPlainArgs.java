// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetConnectorFingerprintsFingerprint;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectorFingerprintsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorFingerprintsPlainArgs Empty = new GetConnectorFingerprintsPlainArgs();

    @Import(name="fingerprints")
    private @Nullable List<GetConnectorFingerprintsFingerprint> fingerprints;

    public Optional<List<GetConnectorFingerprintsFingerprint>> fingerprints() {
        return Optional.ofNullable(this.fingerprints);
    }

    /**
     * The unique identifier for the resource. Equal to target connector id.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique identifier for the resource. Equal to target connector id.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetConnectorFingerprintsPlainArgs() {}

    private GetConnectorFingerprintsPlainArgs(GetConnectorFingerprintsPlainArgs $) {
        this.fingerprints = $.fingerprints;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorFingerprintsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorFingerprintsPlainArgs $;

        public Builder() {
            $ = new GetConnectorFingerprintsPlainArgs();
        }

        public Builder(GetConnectorFingerprintsPlainArgs defaults) {
            $ = new GetConnectorFingerprintsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder fingerprints(@Nullable List<GetConnectorFingerprintsFingerprint> fingerprints) {
            $.fingerprints = fingerprints;
            return this;
        }

        public Builder fingerprints(GetConnectorFingerprintsFingerprint... fingerprints) {
            return fingerprints(List.of(fingerprints));
        }

        /**
         * @param id The unique identifier for the resource. Equal to target connector id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetConnectorFingerprintsPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}