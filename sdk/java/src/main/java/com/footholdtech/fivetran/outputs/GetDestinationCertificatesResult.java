// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.footholdtech.fivetran.outputs.GetDestinationCertificatesCertificate;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDestinationCertificatesResult {
    private @Nullable List<GetDestinationCertificatesCertificate> certificates;
    /**
     * @return The unique identifier for the target destination within the Fivetran system.
     * 
     */
    private String destinationId;
    /**
     * @return The unique identifier for the resource. Equal to target destination id.
     * 
     */
    private String id;

    private GetDestinationCertificatesResult() {}
    public List<GetDestinationCertificatesCertificate> certificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    /**
     * @return The unique identifier for the target destination within the Fivetran system.
     * 
     */
    public String destinationId() {
        return this.destinationId;
    }
    /**
     * @return The unique identifier for the resource. Equal to target destination id.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDestinationCertificatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetDestinationCertificatesCertificate> certificates;
        private String destinationId;
        private String id;
        public Builder() {}
        public Builder(GetDestinationCertificatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.destinationId = defaults.destinationId;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder certificates(@Nullable List<GetDestinationCertificatesCertificate> certificates) {
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(GetDestinationCertificatesCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        @CustomType.Setter
        public Builder destinationId(String destinationId) {
            this.destinationId = Objects.requireNonNull(destinationId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetDestinationCertificatesResult build() {
            final var o = new GetDestinationCertificatesResult();
            o.certificates = certificates;
            o.destinationId = destinationId;
            o.id = id;
            return o;
        }
    }
}