// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.footholdtech.fivetran.outputs.GetConnectorCertificatesCertificate;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectorCertificatesResult {
    private @Nullable List<GetConnectorCertificatesCertificate> certificates;
    /**
     * @return The unique identifier for the target connector within the Fivetran system.
     * 
     */
    private String connectorId;
    /**
     * @return The unique identifier for the resource. Equal to target connector id.
     * 
     */
    private String id;

    private GetConnectorCertificatesResult() {}
    public List<GetConnectorCertificatesCertificate> certificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    /**
     * @return The unique identifier for the target connector within the Fivetran system.
     * 
     */
    public String connectorId() {
        return this.connectorId;
    }
    /**
     * @return The unique identifier for the resource. Equal to target connector id.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorCertificatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetConnectorCertificatesCertificate> certificates;
        private String connectorId;
        private String id;
        public Builder() {}
        public Builder(GetConnectorCertificatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.connectorId = defaults.connectorId;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder certificates(@Nullable List<GetConnectorCertificatesCertificate> certificates) {
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(GetConnectorCertificatesCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        @CustomType.Setter
        public Builder connectorId(String connectorId) {
            this.connectorId = Objects.requireNonNull(connectorId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetConnectorCertificatesResult build() {
            final var o = new GetConnectorCertificatesResult();
            o.certificates = certificates;
            o.connectorId = connectorId;
            o.id = id;
            return o;
        }
    }
}