// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetUsersUser extends com.pulumi.resources.InvokeArgs {

    public static final GetUsersUser Empty = new GetUsersUser();

    /**
     * The timestamp that the user created their Fivetran account
     * 
     */
    @Import(name="createdAt", required=true)
    private String createdAt;

    /**
     * @return The timestamp that the user created their Fivetran account
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * The email address that the user has associated with their user profile.
     * 
     */
    @Import(name="email", required=true)
    private String email;

    /**
     * @return The email address that the user has associated with their user profile.
     * 
     */
    public String email() {
        return this.email;
    }

    /**
     * The last name of the user.
     * 
     */
    @Import(name="familyName", required=true)
    private String familyName;

    /**
     * @return The last name of the user.
     * 
     */
    public String familyName() {
        return this.familyName;
    }

    /**
     * The first name of the user.
     * 
     */
    @Import(name="givenName", required=true)
    private String givenName;

    /**
     * @return The first name of the user.
     * 
     */
    public String givenName() {
        return this.givenName;
    }

    /**
     * The unique identifier for the user within the Fivetran system.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique identifier for the user within the Fivetran system.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The field indicates whether the user has been invited to your account.
     * 
     */
    @Import(name="invited", required=true)
    private Boolean invited;

    /**
     * @return The field indicates whether the user has been invited to your account.
     * 
     */
    public Boolean invited() {
        return this.invited;
    }

    /**
     * The last time that the user has logged into their Fivetran account.
     * 
     */
    @Import(name="loggedInAt", required=true)
    private String loggedInAt;

    /**
     * @return The last time that the user has logged into their Fivetran account.
     * 
     */
    public String loggedInAt() {
        return this.loggedInAt;
    }

    /**
     * The phone number of the user.
     * 
     */
    @Import(name="phone", required=true)
    private String phone;

    /**
     * @return The phone number of the user.
     * 
     */
    public String phone() {
        return this.phone;
    }

    /**
     * The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
     * 
     */
    @Import(name="picture", required=true)
    private String picture;

    /**
     * @return The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
     * 
     */
    public String picture() {
        return this.picture;
    }

    /**
     * The field indicates whether the user has verified their email address in the account creation process.
     * 
     */
    @Import(name="verified", required=true)
    private Boolean verified;

    /**
     * @return The field indicates whether the user has verified their email address in the account creation process.
     * 
     */
    public Boolean verified() {
        return this.verified;
    }

    private GetUsersUser() {}

    private GetUsersUser(GetUsersUser $) {
        this.createdAt = $.createdAt;
        this.email = $.email;
        this.familyName = $.familyName;
        this.givenName = $.givenName;
        this.id = $.id;
        this.invited = $.invited;
        this.loggedInAt = $.loggedInAt;
        this.phone = $.phone;
        this.picture = $.picture;
        this.verified = $.verified;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersUser $;

        public Builder() {
            $ = new GetUsersUser();
        }

        public Builder(GetUsersUser defaults) {
            $ = new GetUsersUser(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The timestamp that the user created their Fivetran account
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param email The email address that the user has associated with their user profile.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            $.email = email;
            return this;
        }

        /**
         * @param familyName The last name of the user.
         * 
         * @return builder
         * 
         */
        public Builder familyName(String familyName) {
            $.familyName = familyName;
            return this;
        }

        /**
         * @param givenName The first name of the user.
         * 
         * @return builder
         * 
         */
        public Builder givenName(String givenName) {
            $.givenName = givenName;
            return this;
        }

        /**
         * @param id The unique identifier for the user within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param invited The field indicates whether the user has been invited to your account.
         * 
         * @return builder
         * 
         */
        public Builder invited(Boolean invited) {
            $.invited = invited;
            return this;
        }

        /**
         * @param loggedInAt The last time that the user has logged into their Fivetran account.
         * 
         * @return builder
         * 
         */
        public Builder loggedInAt(String loggedInAt) {
            $.loggedInAt = loggedInAt;
            return this;
        }

        /**
         * @param phone The phone number of the user.
         * 
         * @return builder
         * 
         */
        public Builder phone(String phone) {
            $.phone = phone;
            return this;
        }

        /**
         * @param picture The user&#39;s avatar as a URL link (for example, &#39;http://mycompany.com/avatars/john_white.png&#39;) or base64 data URI (for example, &#39;data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==&#39;)
         * 
         * @return builder
         * 
         */
        public Builder picture(String picture) {
            $.picture = picture;
            return this;
        }

        /**
         * @param verified The field indicates whether the user has verified their email address in the account creation process.
         * 
         * @return builder
         * 
         */
        public Builder verified(Boolean verified) {
            $.verified = verified;
            return this;
        }

        public GetUsersUser build() {
            $.createdAt = Objects.requireNonNull($.createdAt, "expected parameter 'createdAt' to be non-null");
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.familyName = Objects.requireNonNull($.familyName, "expected parameter 'familyName' to be non-null");
            $.givenName = Objects.requireNonNull($.givenName, "expected parameter 'givenName' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.invited = Objects.requireNonNull($.invited, "expected parameter 'invited' to be non-null");
            $.loggedInAt = Objects.requireNonNull($.loggedInAt, "expected parameter 'loggedInAt' to be non-null");
            $.phone = Objects.requireNonNull($.phone, "expected parameter 'phone' to be non-null");
            $.picture = Objects.requireNonNull($.picture, "expected parameter 'picture' to be non-null");
            $.verified = Objects.requireNonNull($.verified, "expected parameter 'verified' to be non-null");
            return $;
        }
    }

}