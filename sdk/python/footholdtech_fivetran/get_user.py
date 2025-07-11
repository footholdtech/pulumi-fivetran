# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, created_at=None, email=None, family_name=None, given_name=None, id=None, invited=None, logged_in_at=None, phone=None, picture=None, role=None, verified=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if family_name and not isinstance(family_name, str):
            raise TypeError("Expected argument 'family_name' to be a str")
        pulumi.set(__self__, "family_name", family_name)
        if given_name and not isinstance(given_name, str):
            raise TypeError("Expected argument 'given_name' to be a str")
        pulumi.set(__self__, "given_name", given_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if invited and not isinstance(invited, bool):
            raise TypeError("Expected argument 'invited' to be a bool")
        pulumi.set(__self__, "invited", invited)
        if logged_in_at and not isinstance(logged_in_at, str):
            raise TypeError("Expected argument 'logged_in_at' to be a str")
        pulumi.set(__self__, "logged_in_at", logged_in_at)
        if phone and not isinstance(phone, str):
            raise TypeError("Expected argument 'phone' to be a str")
        pulumi.set(__self__, "phone", phone)
        if picture and not isinstance(picture, str):
            raise TypeError("Expected argument 'picture' to be a str")
        pulumi.set(__self__, "picture", picture)
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        pulumi.set(__self__, "role", role)
        if verified and not isinstance(verified, bool):
            raise TypeError("Expected argument 'verified' to be a bool")
        pulumi.set(__self__, "verified", verified)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> builtins.str:
        """
        The timestamp that the user created their Fivetran account.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def email(self) -> builtins.str:
        """
        The email address that the user has associated with their user profile.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="familyName")
    def family_name(self) -> builtins.str:
        """
        The last name of the user.
        """
        return pulumi.get(self, "family_name")

    @property
    @pulumi.getter(name="givenName")
    def given_name(self) -> builtins.str:
        """
        The first name of the user.
        """
        return pulumi.get(self, "given_name")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The unique identifier for the user within the Fivetran system.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def invited(self) -> builtins.bool:
        """
        The field indicates whether the user has been invited to your account.
        """
        return pulumi.get(self, "invited")

    @property
    @pulumi.getter(name="loggedInAt")
    def logged_in_at(self) -> builtins.str:
        """
        The last time that the user has logged into their Fivetran account.
        """
        return pulumi.get(self, "logged_in_at")

    @property
    @pulumi.getter
    def phone(self) -> builtins.str:
        """
        The phone number of the user.
        """
        return pulumi.get(self, "phone")

    @property
    @pulumi.getter
    def picture(self) -> builtins.str:
        """
        The user's avatar as a URL link (for example, 'http://mycompany.com/avatars/john_white.png') or base64 data URI (for example, 'data:image/png;base64,aHR0cDovL215Y29tcGFueS5jb20vYXZhdGFycy9qb2huX3doaXRlLnBuZw==')
        """
        return pulumi.get(self, "picture")

    @property
    @pulumi.getter
    def role(self) -> builtins.str:
        """
        The role that you would like to assign to the user.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter
    def verified(self) -> builtins.bool:
        """
        The field indicates whether the user has verified their email address in the account creation process.
        """
        return pulumi.get(self, "verified")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            created_at=self.created_at,
            email=self.email,
            family_name=self.family_name,
            given_name=self.given_name,
            id=self.id,
            invited=self.invited,
            logged_in_at=self.logged_in_at,
            phone=self.phone,
            picture=self.picture,
            role=self.role,
            verified=self.verified)


def get_user(id: Optional[builtins.str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    This data source returns a user object.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fivetran as fivetran

    my_user = fivetran.get_user(id="anonymous_mystery")
    ```


    :param builtins.str id: The unique identifier for the user within the Fivetran system.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('fivetran:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        created_at=pulumi.get(__ret__, 'created_at'),
        email=pulumi.get(__ret__, 'email'),
        family_name=pulumi.get(__ret__, 'family_name'),
        given_name=pulumi.get(__ret__, 'given_name'),
        id=pulumi.get(__ret__, 'id'),
        invited=pulumi.get(__ret__, 'invited'),
        logged_in_at=pulumi.get(__ret__, 'logged_in_at'),
        phone=pulumi.get(__ret__, 'phone'),
        picture=pulumi.get(__ret__, 'picture'),
        role=pulumi.get(__ret__, 'role'),
        verified=pulumi.get(__ret__, 'verified'))
def get_user_output(id: Optional[pulumi.Input[builtins.str]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUserResult]:
    """
    This data source returns a user object.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fivetran as fivetran

    my_user = fivetran.get_user(id="anonymous_mystery")
    ```


    :param builtins.str id: The unique identifier for the user within the Fivetran system.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('fivetran:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult)
    return __ret__.apply(lambda __response__: GetUserResult(
        created_at=pulumi.get(__response__, 'created_at'),
        email=pulumi.get(__response__, 'email'),
        family_name=pulumi.get(__response__, 'family_name'),
        given_name=pulumi.get(__response__, 'given_name'),
        id=pulumi.get(__response__, 'id'),
        invited=pulumi.get(__response__, 'invited'),
        logged_in_at=pulumi.get(__response__, 'logged_in_at'),
        phone=pulumi.get(__response__, 'phone'),
        picture=pulumi.get(__response__, 'picture'),
        role=pulumi.get(__response__, 'role'),
        verified=pulumi.get(__response__, 'verified')))
