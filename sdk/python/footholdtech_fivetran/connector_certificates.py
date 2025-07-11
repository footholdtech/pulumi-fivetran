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

__all__ = ['ConnectorCertificatesArgs', 'ConnectorCertificates']

@pulumi.input_type
class ConnectorCertificatesArgs:
    def __init__(__self__, *,
                 connector_id: pulumi.Input[builtins.str],
                 certificates: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorCertificatesCertificateArgs']]]] = None):
        """
        The set of arguments for constructing a ConnectorCertificates resource.
        :param pulumi.Input[builtins.str] connector_id: The unique identifier for the target connection within the Fivetran system.
        """
        pulumi.set(__self__, "connector_id", connector_id)
        if certificates is not None:
            pulumi.set(__self__, "certificates", certificates)

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> pulumi.Input[builtins.str]:
        """
        The unique identifier for the target connection within the Fivetran system.
        """
        return pulumi.get(self, "connector_id")

    @connector_id.setter
    def connector_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "connector_id", value)

    @property
    @pulumi.getter
    def certificates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorCertificatesCertificateArgs']]]]:
        return pulumi.get(self, "certificates")

    @certificates.setter
    def certificates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorCertificatesCertificateArgs']]]]):
        pulumi.set(self, "certificates", value)


@pulumi.input_type
class _ConnectorCertificatesState:
    def __init__(__self__, *,
                 certificates: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorCertificatesCertificateArgs']]]] = None,
                 connector_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering ConnectorCertificates resources.
        :param pulumi.Input[builtins.str] connector_id: The unique identifier for the target connection within the Fivetran system.
        """
        if certificates is not None:
            pulumi.set(__self__, "certificates", certificates)
        if connector_id is not None:
            pulumi.set(__self__, "connector_id", connector_id)

    @property
    @pulumi.getter
    def certificates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorCertificatesCertificateArgs']]]]:
        return pulumi.get(self, "certificates")

    @certificates.setter
    def certificates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorCertificatesCertificateArgs']]]]):
        pulumi.set(self, "certificates", value)

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The unique identifier for the target connection within the Fivetran system.
        """
        return pulumi.get(self, "connector_id")

    @connector_id.setter
    def connector_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "connector_id", value)


@pulumi.type_token("fivetran:index/connectorCertificates:ConnectorCertificates")
class ConnectorCertificates(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectorCertificatesCertificateArgs', 'ConnectorCertificatesCertificateArgsDict']]]]] = None,
                 connector_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a ConnectorCertificates resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] connector_id: The unique identifier for the target connection within the Fivetran system.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectorCertificatesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ConnectorCertificates resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ConnectorCertificatesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectorCertificatesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectorCertificatesCertificateArgs', 'ConnectorCertificatesCertificateArgsDict']]]]] = None,
                 connector_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConnectorCertificatesArgs.__new__(ConnectorCertificatesArgs)

            __props__.__dict__["certificates"] = certificates
            if connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'connector_id'")
            __props__.__dict__["connector_id"] = connector_id
        super(ConnectorCertificates, __self__).__init__(
            'fivetran:index/connectorCertificates:ConnectorCertificates',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectorCertificatesCertificateArgs', 'ConnectorCertificatesCertificateArgsDict']]]]] = None,
            connector_id: Optional[pulumi.Input[builtins.str]] = None) -> 'ConnectorCertificates':
        """
        Get an existing ConnectorCertificates resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] connector_id: The unique identifier for the target connection within the Fivetran system.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectorCertificatesState.__new__(_ConnectorCertificatesState)

        __props__.__dict__["certificates"] = certificates
        __props__.__dict__["connector_id"] = connector_id
        return ConnectorCertificates(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificates(self) -> pulumi.Output[Optional[Sequence['outputs.ConnectorCertificatesCertificate']]]:
        return pulumi.get(self, "certificates")

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> pulumi.Output[builtins.str]:
        """
        The unique identifier for the target connection within the Fivetran system.
        """
        return pulumi.get(self, "connector_id")

