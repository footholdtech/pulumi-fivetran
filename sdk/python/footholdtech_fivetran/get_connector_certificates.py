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
    'GetConnectorCertificatesResult',
    'AwaitableGetConnectorCertificatesResult',
    'get_connector_certificates',
    'get_connector_certificates_output',
]

@pulumi.output_type
class GetConnectorCertificatesResult:
    """
    A collection of values returned by getConnectorCertificates.
    """
    def __init__(__self__, certificates=None, connector_id=None, id=None):
        if certificates and not isinstance(certificates, list):
            raise TypeError("Expected argument 'certificates' to be a list")
        pulumi.set(__self__, "certificates", certificates)
        if connector_id and not isinstance(connector_id, str):
            raise TypeError("Expected argument 'connector_id' to be a str")
        pulumi.set(__self__, "connector_id", connector_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def certificates(self) -> Optional[Sequence['outputs.GetConnectorCertificatesCertificateResult']]:
        return pulumi.get(self, "certificates")

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> builtins.str:
        """
        The unique identifier for the target connection within the Fivetran system.
        """
        return pulumi.get(self, "connector_id")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The unique identifier for the resource. Equal to target connection id.
        """
        return pulumi.get(self, "id")


class AwaitableGetConnectorCertificatesResult(GetConnectorCertificatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectorCertificatesResult(
            certificates=self.certificates,
            connector_id=self.connector_id,
            id=self.id)


def get_connector_certificates(certificates: Optional[Sequence[Union['GetConnectorCertificatesCertificateArgs', 'GetConnectorCertificatesCertificateArgsDict']]] = None,
                               id: Optional[builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectorCertificatesResult:
    """
    This data source returns a list of SSH fingerprints approved for specified connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fivetran as fivetran

    connector_fingerprints = fivetran.get_connector_fingerprints(id="connector_id")
    ```


    :param builtins.str id: The unique identifier for the resource. Equal to target connection id.
    """
    __args__ = dict()
    __args__['certificates'] = certificates
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('fivetran:index/getConnectorCertificates:getConnectorCertificates', __args__, opts=opts, typ=GetConnectorCertificatesResult).value

    return AwaitableGetConnectorCertificatesResult(
        certificates=pulumi.get(__ret__, 'certificates'),
        connector_id=pulumi.get(__ret__, 'connector_id'),
        id=pulumi.get(__ret__, 'id'))
def get_connector_certificates_output(certificates: Optional[pulumi.Input[Optional[Sequence[Union['GetConnectorCertificatesCertificateArgs', 'GetConnectorCertificatesCertificateArgsDict']]]]] = None,
                                      id: Optional[pulumi.Input[builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetConnectorCertificatesResult]:
    """
    This data source returns a list of SSH fingerprints approved for specified connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fivetran as fivetran

    connector_fingerprints = fivetran.get_connector_fingerprints(id="connector_id")
    ```


    :param builtins.str id: The unique identifier for the resource. Equal to target connection id.
    """
    __args__ = dict()
    __args__['certificates'] = certificates
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('fivetran:index/getConnectorCertificates:getConnectorCertificates', __args__, opts=opts, typ=GetConnectorCertificatesResult)
    return __ret__.apply(lambda __response__: GetConnectorCertificatesResult(
        certificates=pulumi.get(__response__, 'certificates'),
        connector_id=pulumi.get(__response__, 'connector_id'),
        id=pulumi.get(__response__, 'id')))
