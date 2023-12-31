// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetConnectorCertificatesCertificate;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectorCertificatesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorCertificatesPlainArgs Empty = new GetConnectorCertificatesPlainArgs();

    @Import(name="certificates")
    private @Nullable List<GetConnectorCertificatesCertificate> certificates;

    public Optional<List<GetConnectorCertificatesCertificate>> certificates() {
        return Optional.ofNullable(this.certificates);
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

    private GetConnectorCertificatesPlainArgs() {}

    private GetConnectorCertificatesPlainArgs(GetConnectorCertificatesPlainArgs $) {
        this.certificates = $.certificates;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorCertificatesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorCertificatesPlainArgs $;

        public Builder() {
            $ = new GetConnectorCertificatesPlainArgs();
        }

        public Builder(GetConnectorCertificatesPlainArgs defaults) {
            $ = new GetConnectorCertificatesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificates(@Nullable List<GetConnectorCertificatesCertificate> certificates) {
            $.certificates = certificates;
            return this;
        }

        public Builder certificates(GetConnectorCertificatesCertificate... certificates) {
            return certificates(List.of(certificates));
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

        public GetConnectorCertificatesPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
