// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetDestinationFingerprintsFingerprint;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDestinationFingerprintsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDestinationFingerprintsPlainArgs Empty = new GetDestinationFingerprintsPlainArgs();

    @Import(name="fingerprints")
    private @Nullable List<GetDestinationFingerprintsFingerprint> fingerprints;

    public Optional<List<GetDestinationFingerprintsFingerprint>> fingerprints() {
        return Optional.ofNullable(this.fingerprints);
    }

    /**
     * The unique identifier for the resource. Equal to target destination id.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique identifier for the resource. Equal to target destination id.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetDestinationFingerprintsPlainArgs() {}

    private GetDestinationFingerprintsPlainArgs(GetDestinationFingerprintsPlainArgs $) {
        this.fingerprints = $.fingerprints;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDestinationFingerprintsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDestinationFingerprintsPlainArgs $;

        public Builder() {
            $ = new GetDestinationFingerprintsPlainArgs();
        }

        public Builder(GetDestinationFingerprintsPlainArgs defaults) {
            $ = new GetDestinationFingerprintsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder fingerprints(@Nullable List<GetDestinationFingerprintsFingerprint> fingerprints) {
            $.fingerprints = fingerprints;
            return this;
        }

        public Builder fingerprints(GetDestinationFingerprintsFingerprint... fingerprints) {
            return fingerprints(List.of(fingerprints));
        }

        /**
         * @param id The unique identifier for the resource. Equal to target destination id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetDestinationFingerprintsPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
