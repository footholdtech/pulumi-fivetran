// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The email address that the user has associated with their user profile.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email address that the user has associated with their user profile.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * The last name of the user.
     * 
     */
    @Import(name="familyName", required=true)
    private Output<String> familyName;

    /**
     * @return The last name of the user.
     * 
     */
    public Output<String> familyName() {
        return this.familyName;
    }

    /**
     * The first name of the user.
     * 
     */
    @Import(name="givenName", required=true)
    private Output<String> givenName;

    /**
     * @return The first name of the user.
     * 
     */
    public Output<String> givenName() {
        return this.givenName;
    }

    /**
     * The field indicates whether the user has been invited to your account.
     * 
     */
    @Import(name="invited")
    private @Nullable Output<Boolean> invited;

    /**
     * @return The field indicates whether the user has been invited to your account.
     * 
     */
    public Optional<Output<Boolean>> invited() {
        return Optional.ofNullable(this.invited);
    }

    /**
     * The phone number of the user.
     * 
     */
    @Import(name="phone")
    private @Nullable Output<String> phone;

    /**
     * @return The phone number of the user.
     * 
     */
    public Optional<Output<String>> phone() {
        return Optional.ofNullable(this.phone);
    }

    /**
     * The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
     * 
     */
    @Import(name="picture")
    private @Nullable Output<String> picture;

    /**
     * @return The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
     * 
     */
    public Optional<Output<String>> picture() {
        return Optional.ofNullable(this.picture);
    }

    /**
     * The role that you would like to assign to the user.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that you would like to assign to the user.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The field indicates whether the user has verified their email address in the account creation process.
     * 
     */
    @Import(name="verified")
    private @Nullable Output<Boolean> verified;

    /**
     * @return The field indicates whether the user has verified their email address in the account creation process.
     * 
     */
    public Optional<Output<Boolean>> verified() {
        return Optional.ofNullable(this.verified);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.email = $.email;
        this.familyName = $.familyName;
        this.givenName = $.givenName;
        this.invited = $.invited;
        this.phone = $.phone;
        this.picture = $.picture;
        this.role = $.role;
        this.verified = $.verified;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email address that the user has associated with their user profile.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address that the user has associated with their user profile.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param familyName The last name of the user.
         * 
         * @return builder
         * 
         */
        public Builder familyName(Output<String> familyName) {
            $.familyName = familyName;
            return this;
        }

        /**
         * @param familyName The last name of the user.
         * 
         * @return builder
         * 
         */
        public Builder familyName(String familyName) {
            return familyName(Output.of(familyName));
        }

        /**
         * @param givenName The first name of the user.
         * 
         * @return builder
         * 
         */
        public Builder givenName(Output<String> givenName) {
            $.givenName = givenName;
            return this;
        }

        /**
         * @param givenName The first name of the user.
         * 
         * @return builder
         * 
         */
        public Builder givenName(String givenName) {
            return givenName(Output.of(givenName));
        }

        /**
         * @param invited The field indicates whether the user has been invited to your account.
         * 
         * @return builder
         * 
         */
        public Builder invited(@Nullable Output<Boolean> invited) {
            $.invited = invited;
            return this;
        }

        /**
         * @param invited The field indicates whether the user has been invited to your account.
         * 
         * @return builder
         * 
         */
        public Builder invited(Boolean invited) {
            return invited(Output.of(invited));
        }

        /**
         * @param phone The phone number of the user.
         * 
         * @return builder
         * 
         */
        public Builder phone(@Nullable Output<String> phone) {
            $.phone = phone;
            return this;
        }

        /**
         * @param phone The phone number of the user.
         * 
         * @return builder
         * 
         */
        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        /**
         * @param picture The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
         * 
         * @return builder
         * 
         */
        public Builder picture(@Nullable Output<String> picture) {
            $.picture = picture;
            return this;
        }

        /**
         * @param picture The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
         * 
         * @return builder
         * 
         */
        public Builder picture(String picture) {
            return picture(Output.of(picture));
        }

        /**
         * @param role The role that you would like to assign to the user.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that you would like to assign to the user.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param verified The field indicates whether the user has verified their email address in the account creation process.
         * 
         * @return builder
         * 
         */
        public Builder verified(@Nullable Output<Boolean> verified) {
            $.verified = verified;
            return this;
        }

        /**
         * @param verified The field indicates whether the user has verified their email address in the account creation process.
         * 
         * @return builder
         * 
         */
        public Builder verified(Boolean verified) {
            return verified(Output.of(verified));
        }

        public UserArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.familyName = Objects.requireNonNull($.familyName, "expected parameter 'familyName' to be non-null");
            $.givenName = Objects.requireNonNull($.givenName, "expected parameter 'givenName' to be non-null");
            return $;
        }
    }

}
