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
    'GetGroupConnectionsResult',
    'AwaitableGetGroupConnectionsResult',
    'get_group_connections',
    'get_group_connections_output',
]

@pulumi.output_type
class GetGroupConnectionsResult:
    """
    A collection of values returned by getGroupConnections.
    """
    def __init__(__self__, connections=None, id=None, schema=None):
        if connections and not isinstance(connections, list):
            raise TypeError("Expected argument 'connections' to be a list")
        pulumi.set(__self__, "connections", connections)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)

    @property
    @pulumi.getter
    def connections(self) -> Optional[Sequence['outputs.GetGroupConnectionsConnectionResult']]:
        return pulumi.get(self, "connections")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of this resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def schema(self) -> Optional[builtins.str]:
        """
        Optional filter. When defined, the data source will only contain information for the connection with the specified schema name.
        """
        return pulumi.get(self, "schema")


class AwaitableGetGroupConnectionsResult(GetGroupConnectionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupConnectionsResult(
            connections=self.connections,
            id=self.id,
            schema=self.schema)


def get_group_connections(connections: Optional[Sequence[Union['GetGroupConnectionsConnectionArgs', 'GetGroupConnectionsConnectionArgsDict']]] = None,
                          id: Optional[builtins.str] = None,
                          schema: Optional[builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupConnectionsResult:
    """
    This data source returns a list of information about all connections within a group in your Fivetran account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fivetran as fivetran

    group_connections = fivetran.get_group_connections(id="anonymous_mystery",
        schema="connection_schema_name")
    ```


    :param builtins.str id: The ID of this resource.
    :param builtins.str schema: Optional filter. When defined, the data source will only contain information for the connection with the specified schema name.
    """
    __args__ = dict()
    __args__['connections'] = connections
    __args__['id'] = id
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('fivetran:index/getGroupConnections:getGroupConnections', __args__, opts=opts, typ=GetGroupConnectionsResult).value

    return AwaitableGetGroupConnectionsResult(
        connections=pulumi.get(__ret__, 'connections'),
        id=pulumi.get(__ret__, 'id'),
        schema=pulumi.get(__ret__, 'schema'))
def get_group_connections_output(connections: Optional[pulumi.Input[Optional[Sequence[Union['GetGroupConnectionsConnectionArgs', 'GetGroupConnectionsConnectionArgsDict']]]]] = None,
                                 id: Optional[pulumi.Input[builtins.str]] = None,
                                 schema: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGroupConnectionsResult]:
    """
    This data source returns a list of information about all connections within a group in your Fivetran account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fivetran as fivetran

    group_connections = fivetran.get_group_connections(id="anonymous_mystery",
        schema="connection_schema_name")
    ```


    :param builtins.str id: The ID of this resource.
    :param builtins.str schema: Optional filter. When defined, the data source will only contain information for the connection with the specified schema name.
    """
    __args__ = dict()
    __args__['connections'] = connections
    __args__['id'] = id
    __args__['schema'] = schema
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('fivetran:index/getGroupConnections:getGroupConnections', __args__, opts=opts, typ=GetGroupConnectionsResult)
    return __ret__.apply(lambda __response__: GetGroupConnectionsResult(
        connections=pulumi.get(__response__, 'connections'),
        id=pulumi.get(__response__, 'id'),
        schema=pulumi.get(__response__, 'schema')))
