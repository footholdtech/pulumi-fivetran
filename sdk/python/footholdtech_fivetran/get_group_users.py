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
from . import outputs
from ._inputs import *

__all__ = [
    'GetGroupUsersResult',
    'AwaitableGetGroupUsersResult',
    'get_group_users',
    'get_group_users_output',
]

@pulumi.output_type
class GetGroupUsersResult:
    """
    A collection of values returned by getGroupUsers.
    """
    def __init__(__self__, id=None, users=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The unique identifier for the group within the Fivetran system. Data-source will represent a set of users who has membership in this group.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def users(self) -> Optional[Sequence['outputs.GetGroupUsersUserResult']]:
        return pulumi.get(self, "users")


class AwaitableGetGroupUsersResult(GetGroupUsersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupUsersResult(
            id=self.id,
            users=self.users)


def get_group_users(id: Optional[builtins.str] = None,
                    users: Optional[Sequence[Union['GetGroupUsersUserArgs', 'GetGroupUsersUserArgsDict']]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupUsersResult:
    """
    This data source returns a list of information about all users within a group in your Fivetran account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fivetran as fivetran

    group_users = fivetran.get_group_users(id="anonymous_mystery")
    ```


    :param builtins.str id: The unique identifier for the group within the Fivetran system. Data-source will represent a set of users who has membership in this group.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['users'] = users
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('fivetran:index/getGroupUsers:getGroupUsers', __args__, opts=opts, typ=GetGroupUsersResult).value

    return AwaitableGetGroupUsersResult(
        id=pulumi.get(__ret__, 'id'),
        users=pulumi.get(__ret__, 'users'))
def get_group_users_output(id: Optional[pulumi.Input[builtins.str]] = None,
                           users: Optional[pulumi.Input[Optional[Sequence[Union['GetGroupUsersUserArgs', 'GetGroupUsersUserArgsDict']]]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGroupUsersResult]:
    """
    This data source returns a list of information about all users within a group in your Fivetran account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fivetran as fivetran

    group_users = fivetran.get_group_users(id="anonymous_mystery")
    ```


    :param builtins.str id: The unique identifier for the group within the Fivetran system. Data-source will represent a set of users who has membership in this group.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['users'] = users
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('fivetran:index/getGroupUsers:getGroupUsers', __args__, opts=opts, typ=GetGroupUsersResult)
    return __ret__.apply(lambda __response__: GetGroupUsersResult(
        id=pulumi.get(__response__, 'id'),
        users=pulumi.get(__response__, 'users')))
