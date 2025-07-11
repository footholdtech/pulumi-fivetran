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

__all__ = ['ConnectorFingerprintsArgs', 'ConnectorFingerprints']

@pulumi.input_type
class ConnectorFingerprintsArgs:
    def __init__(__self__, *,
                 connector_id: pulumi.Input[builtins.str],
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorFingerprintsFingerprintArgs']]]] = None):
        """
        The set of arguments for constructing a ConnectorFingerprints resource.
        :param pulumi.Input[builtins.str] connector_id: The unique identifier for the target connection within the Fivetran system.
        """
        pulumi.set(__self__, "connector_id", connector_id)
        if fingerprints is not None:
            pulumi.set(__self__, "fingerprints", fingerprints)

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
    def fingerprints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorFingerprintsFingerprintArgs']]]]:
        return pulumi.get(self, "fingerprints")

    @fingerprints.setter
    def fingerprints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorFingerprintsFingerprintArgs']]]]):
        pulumi.set(self, "fingerprints", value)


@pulumi.input_type
class _ConnectorFingerprintsState:
    def __init__(__self__, *,
                 connector_id: Optional[pulumi.Input[builtins.str]] = None,
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorFingerprintsFingerprintArgs']]]] = None):
        """
        Input properties used for looking up and filtering ConnectorFingerprints resources.
        :param pulumi.Input[builtins.str] connector_id: The unique identifier for the target connection within the Fivetran system.
        """
        if connector_id is not None:
            pulumi.set(__self__, "connector_id", connector_id)
        if fingerprints is not None:
            pulumi.set(__self__, "fingerprints", fingerprints)

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

    @property
    @pulumi.getter
    def fingerprints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorFingerprintsFingerprintArgs']]]]:
        return pulumi.get(self, "fingerprints")

    @fingerprints.setter
    def fingerprints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectorFingerprintsFingerprintArgs']]]]):
        pulumi.set(self, "fingerprints", value)


@pulumi.type_token("fivetran:index/connectorFingerprints:ConnectorFingerprints")
class ConnectorFingerprints(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connector_id: Optional[pulumi.Input[builtins.str]] = None,
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectorFingerprintsFingerprintArgs', 'ConnectorFingerprintsFingerprintArgsDict']]]]] = None,
                 __props__=None):
        """
        This resource allows you to manage list of approved SSH fingerprints for a particular connector.

        ## Example Usage

        ```python
        import pulumi
        import footholdtech_fivetran as fivetran

        my_connector_approved_fingerprints = fivetran.ConnectorFingerprints("my_connector_approved_fingerprints",
            connector_id=my_connector["id"],
            fingerprints=[
                {
                    "hash": "jhgfJfgrI6yy...",
                    "public_key": "ssh-rsa CCCCB3NzaC1yc2ECCASFWFWDFRWT5WAS ... fivetran user key",
                },
                {
                    "hash": "eUtPirI6yytWe...",
                    "public_key": "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC6 ... fivetran user key",
                },
            ])
        ```

        ## Import

        1. To import an existing `fivetran_connector_fingerprints` resource into your Terraform state, you need to get **Fivetran Connector ID** on the **Setup** tab of the connector page in your Fivetran dashboard.

        2. Retrieve all connectors in a particular group using the [fivetran_group_connectors data source](/docs/data-sources/group_connectors). To retrieve existing groups, use the [fivetran_groups data source](/docs/data-sources/groups).

        3. Define an empty resource in your `.tf` configuration:

        hcl

        resource "fivetran_connector_fingerprints" "my_imported_connector_fingerprints" {

        }

        4. Run the `pulumi import` command:

        ```sh
        $ pulumi import fivetran:index/connectorFingerprints:ConnectorFingerprints my_imported_connector_fingerprints {your Fivetran Connector ID}
        ```

        5.  Use the `terraform state show` command to get the values from the state:

        terraform state show 'fivetran_connector_fingerprints.my_imported_connector_fingerprints'

        6. Copy the values and paste them to your `.tf` configuration.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] connector_id: The unique identifier for the target connection within the Fivetran system.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectorFingerprintsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to manage list of approved SSH fingerprints for a particular connector.

        ## Example Usage

        ```python
        import pulumi
        import footholdtech_fivetran as fivetran

        my_connector_approved_fingerprints = fivetran.ConnectorFingerprints("my_connector_approved_fingerprints",
            connector_id=my_connector["id"],
            fingerprints=[
                {
                    "hash": "jhgfJfgrI6yy...",
                    "public_key": "ssh-rsa CCCCB3NzaC1yc2ECCASFWFWDFRWT5WAS ... fivetran user key",
                },
                {
                    "hash": "eUtPirI6yytWe...",
                    "public_key": "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC6 ... fivetran user key",
                },
            ])
        ```

        ## Import

        1. To import an existing `fivetran_connector_fingerprints` resource into your Terraform state, you need to get **Fivetran Connector ID** on the **Setup** tab of the connector page in your Fivetran dashboard.

        2. Retrieve all connectors in a particular group using the [fivetran_group_connectors data source](/docs/data-sources/group_connectors). To retrieve existing groups, use the [fivetran_groups data source](/docs/data-sources/groups).

        3. Define an empty resource in your `.tf` configuration:

        hcl

        resource "fivetran_connector_fingerprints" "my_imported_connector_fingerprints" {

        }

        4. Run the `pulumi import` command:

        ```sh
        $ pulumi import fivetran:index/connectorFingerprints:ConnectorFingerprints my_imported_connector_fingerprints {your Fivetran Connector ID}
        ```

        5.  Use the `terraform state show` command to get the values from the state:

        terraform state show 'fivetran_connector_fingerprints.my_imported_connector_fingerprints'

        6. Copy the values and paste them to your `.tf` configuration.

        :param str resource_name: The name of the resource.
        :param ConnectorFingerprintsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectorFingerprintsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connector_id: Optional[pulumi.Input[builtins.str]] = None,
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectorFingerprintsFingerprintArgs', 'ConnectorFingerprintsFingerprintArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConnectorFingerprintsArgs.__new__(ConnectorFingerprintsArgs)

            if connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'connector_id'")
            __props__.__dict__["connector_id"] = connector_id
            __props__.__dict__["fingerprints"] = fingerprints
        super(ConnectorFingerprints, __self__).__init__(
            'fivetran:index/connectorFingerprints:ConnectorFingerprints',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connector_id: Optional[pulumi.Input[builtins.str]] = None,
            fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectorFingerprintsFingerprintArgs', 'ConnectorFingerprintsFingerprintArgsDict']]]]] = None) -> 'ConnectorFingerprints':
        """
        Get an existing ConnectorFingerprints resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] connector_id: The unique identifier for the target connection within the Fivetran system.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectorFingerprintsState.__new__(_ConnectorFingerprintsState)

        __props__.__dict__["connector_id"] = connector_id
        __props__.__dict__["fingerprints"] = fingerprints
        return ConnectorFingerprints(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> pulumi.Output[builtins.str]:
        """
        The unique identifier for the target connection within the Fivetran system.
        """
        return pulumi.get(self, "connector_id")

    @property
    @pulumi.getter
    def fingerprints(self) -> pulumi.Output[Optional[Sequence['outputs.ConnectorFingerprintsFingerprint']]]:
        return pulumi.get(self, "fingerprints")

