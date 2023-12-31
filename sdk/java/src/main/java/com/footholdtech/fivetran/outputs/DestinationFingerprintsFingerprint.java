// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DestinationFingerprintsFingerprint {
    /**
     * @return Hash of the fingerprint.
     * 
     */
    private String hash;
    /**
     * @return The SSH public key.
     * 
     */
    private String publicKey;
    /**
     * @return User name who validated the fingerprint.
     * 
     */
    private @Nullable String validatedBy;
    /**
     * @return The date when SSH fingerprint was approved.
     * 
     */
    private @Nullable String validatedDate;

    private DestinationFingerprintsFingerprint() {}
    /**
     * @return Hash of the fingerprint.
     * 
     */
    public String hash() {
        return this.hash;
    }
    /**
     * @return The SSH public key.
     * 
     */
    public String publicKey() {
        return this.publicKey;
    }
    /**
     * @return User name who validated the fingerprint.
     * 
     */
    public Optional<String> validatedBy() {
        return Optional.ofNullable(this.validatedBy);
    }
    /**
     * @return The date when SSH fingerprint was approved.
     * 
     */
    public Optional<String> validatedDate() {
        return Optional.ofNullable(this.validatedDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationFingerprintsFingerprint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hash;
        private String publicKey;
        private @Nullable String validatedBy;
        private @Nullable String validatedDate;
        public Builder() {}
        public Builder(DestinationFingerprintsFingerprint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hash = defaults.hash;
    	      this.publicKey = defaults.publicKey;
    	      this.validatedBy = defaults.validatedBy;
    	      this.validatedDate = defaults.validatedDate;
        }

        @CustomType.Setter
        public Builder hash(String hash) {
            this.hash = Objects.requireNonNull(hash);
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        @CustomType.Setter
        public Builder validatedBy(@Nullable String validatedBy) {
            this.validatedBy = validatedBy;
            return this;
        }
        @CustomType.Setter
        public Builder validatedDate(@Nullable String validatedDate) {
            this.validatedDate = validatedDate;
            return this;
        }
        public DestinationFingerprintsFingerprint build() {
            final var o = new DestinationFingerprintsFingerprint();
            o.hash = hash;
            o.publicKey = publicKey;
            o.validatedBy = validatedBy;
            o.validatedDate = validatedDate;
            return o;
        }
    }
}
