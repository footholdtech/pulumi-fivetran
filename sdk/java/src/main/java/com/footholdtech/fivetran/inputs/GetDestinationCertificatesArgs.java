// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.GetDestinationCertificatesCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDestinationCertificatesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDestinationCertificatesArgs Empty = new GetDestinationCertificatesArgs();

    @Import(name="certificates")
    private @Nullable Output<List<GetDestinationCertificatesCertificateArgs>> certificates;

    public Optional<Output<List<GetDestinationCertificatesCertificateArgs>>> certificates() {
        return Optional.ofNullable(this.certificates);
    }

    /**
     * The unique identifier for the resource. Equal to target destination id.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique identifier for the resource. Equal to target destination id.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetDestinationCertificatesArgs() {}

    private GetDestinationCertificatesArgs(GetDestinationCertificatesArgs $) {
        this.certificates = $.certificates;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDestinationCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDestinationCertificatesArgs $;

        public Builder() {
            $ = new GetDestinationCertificatesArgs();
        }

        public Builder(GetDestinationCertificatesArgs defaults) {
            $ = new GetDestinationCertificatesArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificates(@Nullable Output<List<GetDestinationCertificatesCertificateArgs>> certificates) {
            $.certificates = certificates;
            return this;
        }

        public Builder certificates(List<GetDestinationCertificatesCertificateArgs> certificates) {
            return certificates(Output.of(certificates));
        }

        public Builder certificates(GetDestinationCertificatesCertificateArgs... certificates) {
            return certificates(List.of(certificates));
        }

        /**
         * @param id The unique identifier for the resource. Equal to target destination id.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier for the resource. Equal to target destination id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetDestinationCertificatesArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}