// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetGroupUsersUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGroupUsersUserArgs Empty = new GetGroupUsersUserArgs();

    /**
     * The timestamp that the user created their Fivetran account
     * 
     */
    @Import(name="createdAt", required=true)
    private Output<String> createdAt;

    /**
     * @return The timestamp that the user created their Fivetran account
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }

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
     * The unique identifier for the user within the account.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique identifier for the user within the account.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The field indicates whether the user has verified their email address in the account creation process.
     * 
     */
    @Import(name="invited", required=true)
    private Output<Boolean> invited;

    /**
     * @return The field indicates whether the user has verified their email address in the account creation process.
     * 
     */
    public Output<Boolean> invited() {
        return this.invited;
    }

    /**
     * The last time that the user has logged into their Fivetran account.
     * 
     */
    @Import(name="loggedInAt", required=true)
    private Output<String> loggedInAt;

    /**
     * @return The last time that the user has logged into their Fivetran account.
     * 
     */
    public Output<String> loggedInAt() {
        return this.loggedInAt;
    }

    /**
     * The phone number of the user.
     * 
     */
    @Import(name="phone", required=true)
    private Output<String> phone;

    /**
     * @return The phone number of the user.
     * 
     */
    public Output<String> phone() {
        return this.phone;
    }

    /**
     * The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
     * 
     */
    @Import(name="picture", required=true)
    private Output<String> picture;

    /**
     * @return The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
     * 
     */
    public Output<String> picture() {
        return this.picture;
    }

    /**
     * The group role that you would like to assign this new user to. Supported group roles: ‘Destination Administrator‘, ‘Destination Reviewer‘, ‘Destination Analyst‘, ‘Connector Creator‘, or a custom destination role
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The group role that you would like to assign this new user to. Supported group roles: ‘Destination Administrator‘, ‘Destination Reviewer‘, ‘Destination Analyst‘, ‘Connector Creator‘, or a custom destination role
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * The field indicates whether the user has verified their email address in the account creation process.
     * 
     */
    @Import(name="verified", required=true)
    private Output<Boolean> verified;

    /**
     * @return The field indicates whether the user has verified their email address in the account creation process.
     * 
     */
    public Output<Boolean> verified() {
        return this.verified;
    }

    private GetGroupUsersUserArgs() {}

    private GetGroupUsersUserArgs(GetGroupUsersUserArgs $) {
        this.createdAt = $.createdAt;
        this.email = $.email;
        this.familyName = $.familyName;
        this.givenName = $.givenName;
        this.id = $.id;
        this.invited = $.invited;
        this.loggedInAt = $.loggedInAt;
        this.phone = $.phone;
        this.picture = $.picture;
        this.role = $.role;
        this.verified = $.verified;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupUsersUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupUsersUserArgs $;

        public Builder() {
            $ = new GetGroupUsersUserArgs();
        }

        public Builder(GetGroupUsersUserArgs defaults) {
            $ = new GetGroupUsersUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The timestamp that the user created their Fivetran account
         * 
         * @return builder
         * 
         */
        public Builder createdAt(Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The timestamp that the user created their Fivetran account
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
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
         * @param id The unique identifier for the user within the account.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier for the user within the account.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param invited The field indicates whether the user has verified their email address in the account creation process.
         * 
         * @return builder
         * 
         */
        public Builder invited(Output<Boolean> invited) {
            $.invited = invited;
            return this;
        }

        /**
         * @param invited The field indicates whether the user has verified their email address in the account creation process.
         * 
         * @return builder
         * 
         */
        public Builder invited(Boolean invited) {
            return invited(Output.of(invited));
        }

        /**
         * @param loggedInAt The last time that the user has logged into their Fivetran account.
         * 
         * @return builder
         * 
         */
        public Builder loggedInAt(Output<String> loggedInAt) {
            $.loggedInAt = loggedInAt;
            return this;
        }

        /**
         * @param loggedInAt The last time that the user has logged into their Fivetran account.
         * 
         * @return builder
         * 
         */
        public Builder loggedInAt(String loggedInAt) {
            return loggedInAt(Output.of(loggedInAt));
        }

        /**
         * @param phone The phone number of the user.
         * 
         * @return builder
         * 
         */
        public Builder phone(Output<String> phone) {
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
        public Builder picture(Output<String> picture) {
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
         * @param role The group role that you would like to assign this new user to. Supported group roles: ‘Destination Administrator‘, ‘Destination Reviewer‘, ‘Destination Analyst‘, ‘Connector Creator‘, or a custom destination role
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The group role that you would like to assign this new user to. Supported group roles: ‘Destination Administrator‘, ‘Destination Reviewer‘, ‘Destination Analyst‘, ‘Connector Creator‘, or a custom destination role
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
        public Builder verified(Output<Boolean> verified) {
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

        public GetGroupUsersUserArgs build() {
            $.createdAt = Objects.requireNonNull($.createdAt, "expected parameter 'createdAt' to be non-null");
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.familyName = Objects.requireNonNull($.familyName, "expected parameter 'familyName' to be non-null");
            $.givenName = Objects.requireNonNull($.givenName, "expected parameter 'givenName' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.invited = Objects.requireNonNull($.invited, "expected parameter 'invited' to be non-null");
            $.loggedInAt = Objects.requireNonNull($.loggedInAt, "expected parameter 'loggedInAt' to be non-null");
            $.phone = Objects.requireNonNull($.phone, "expected parameter 'phone' to be non-null");
            $.picture = Objects.requireNonNull($.picture, "expected parameter 'picture' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.verified = Objects.requireNonNull($.verified, "expected parameter 'verified' to be non-null");
            return $;
        }
    }

}
