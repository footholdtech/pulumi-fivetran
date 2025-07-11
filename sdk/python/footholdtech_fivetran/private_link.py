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

__all__ = ['PrivateLinkArgs', 'PrivateLink']

@pulumi.input_type
class PrivateLinkArgs:
    def __init__(__self__, *,
                 config_map: pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]],
                 region: pulumi.Input[builtins.str],
                 service: pulumi.Input[builtins.str],
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a PrivateLink resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] config_map: Configuration.
        :param pulumi.Input[builtins.str] region: Data processing location. This is where Fivetran will operate and run computation on data.
        :param pulumi.Input[builtins.str] service: Service type.
        :param pulumi.Input[builtins.str] name: The private link name within the account. The name must start with a letter or underscore and can only contain letters,
               numbers, or underscores. Maximum size of name is 23 characters.
        """
        pulumi.set(__self__, "config_map", config_map)
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "service", service)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="configMap")
    def config_map(self) -> pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]:
        """
        Configuration.
        """
        return pulumi.get(self, "config_map")

    @config_map.setter
    def config_map(self, value: pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]):
        pulumi.set(self, "config_map", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[builtins.str]:
        """
        Data processing location. This is where Fivetran will operate and run computation on data.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[builtins.str]:
        """
        Service type.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The private link name within the account. The name must start with a letter or underscore and can only contain letters,
        numbers, or underscores. Maximum size of name is 23 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _PrivateLinkState:
    def __init__(__self__, *,
                 cloud_provider: Optional[pulumi.Input[builtins.str]] = None,
                 config_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 created_at: Optional[pulumi.Input[builtins.str]] = None,
                 created_by: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 service: Optional[pulumi.Input[builtins.str]] = None,
                 state: Optional[pulumi.Input[builtins.str]] = None,
                 state_summary: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering PrivateLink resources.
        :param pulumi.Input[builtins.str] cloud_provider: The cloud provider name.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] config_map: Configuration.
        :param pulumi.Input[builtins.str] created_at: The date and time the membership was created.
        :param pulumi.Input[builtins.str] created_by: The unique identifier for the User within the Fivetran system.
        :param pulumi.Input[builtins.str] name: The private link name within the account. The name must start with a letter or underscore and can only contain letters,
               numbers, or underscores. Maximum size of name is 23 characters.
        :param pulumi.Input[builtins.str] region: Data processing location. This is where Fivetran will operate and run computation on data.
        :param pulumi.Input[builtins.str] service: Service type.
        :param pulumi.Input[builtins.str] state: The state of the private link.
        :param pulumi.Input[builtins.str] state_summary: The state of the private link.
        """
        if cloud_provider is not None:
            pulumi.set(__self__, "cloud_provider", cloud_provider)
        if config_map is not None:
            pulumi.set(__self__, "config_map", config_map)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if state_summary is not None:
            pulumi.set(__self__, "state_summary", state_summary)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The cloud provider name.
        """
        return pulumi.get(self, "cloud_provider")

    @cloud_provider.setter
    def cloud_provider(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cloud_provider", value)

    @property
    @pulumi.getter(name="configMap")
    def config_map(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        Configuration.
        """
        return pulumi.get(self, "config_map")

    @config_map.setter
    def config_map(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "config_map", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The date and time the membership was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The unique identifier for the User within the Fivetran system.
        """
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created_by", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The private link name within the account. The name must start with a letter or underscore and can only contain letters,
        numbers, or underscores. Maximum size of name is 23 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Data processing location. This is where Fivetran will operate and run computation on data.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Service type.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The state of the private link.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="stateSummary")
    def state_summary(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The state of the private link.
        """
        return pulumi.get(self, "state_summary")

    @state_summary.setter
    def state_summary(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "state_summary", value)


@pulumi.type_token("fivetran:index/privateLink:PrivateLink")
class PrivateLink(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 service: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        This resource allows you to create, update, and delete private links.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] config_map: Configuration.
        :param pulumi.Input[builtins.str] name: The private link name within the account. The name must start with a letter or underscore and can only contain letters,
               numbers, or underscores. Maximum size of name is 23 characters.
        :param pulumi.Input[builtins.str] region: Data processing location. This is where Fivetran will operate and run computation on data.
        :param pulumi.Input[builtins.str] service: Service type.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivateLinkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to create, update, and delete private links.

        :param str resource_name: The name of the resource.
        :param PrivateLinkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivateLinkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 service: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivateLinkArgs.__new__(PrivateLinkArgs)

            if config_map is None and not opts.urn:
                raise TypeError("Missing required property 'config_map'")
            __props__.__dict__["config_map"] = config_map
            __props__.__dict__["name"] = name
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
            __props__.__dict__["cloud_provider"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["created_by"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["state_summary"] = None
        super(PrivateLink, __self__).__init__(
            'fivetran:index/privateLink:PrivateLink',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cloud_provider: Optional[pulumi.Input[builtins.str]] = None,
            config_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            created_at: Optional[pulumi.Input[builtins.str]] = None,
            created_by: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            region: Optional[pulumi.Input[builtins.str]] = None,
            service: Optional[pulumi.Input[builtins.str]] = None,
            state: Optional[pulumi.Input[builtins.str]] = None,
            state_summary: Optional[pulumi.Input[builtins.str]] = None) -> 'PrivateLink':
        """
        Get an existing PrivateLink resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] cloud_provider: The cloud provider name.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] config_map: Configuration.
        :param pulumi.Input[builtins.str] created_at: The date and time the membership was created.
        :param pulumi.Input[builtins.str] created_by: The unique identifier for the User within the Fivetran system.
        :param pulumi.Input[builtins.str] name: The private link name within the account. The name must start with a letter or underscore and can only contain letters,
               numbers, or underscores. Maximum size of name is 23 characters.
        :param pulumi.Input[builtins.str] region: Data processing location. This is where Fivetran will operate and run computation on data.
        :param pulumi.Input[builtins.str] service: Service type.
        :param pulumi.Input[builtins.str] state: The state of the private link.
        :param pulumi.Input[builtins.str] state_summary: The state of the private link.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivateLinkState.__new__(_PrivateLinkState)

        __props__.__dict__["cloud_provider"] = cloud_provider
        __props__.__dict__["config_map"] = config_map
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["created_by"] = created_by
        __props__.__dict__["name"] = name
        __props__.__dict__["region"] = region
        __props__.__dict__["service"] = service
        __props__.__dict__["state"] = state
        __props__.__dict__["state_summary"] = state_summary
        return PrivateLink(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> pulumi.Output[builtins.str]:
        """
        The cloud provider name.
        """
        return pulumi.get(self, "cloud_provider")

    @property
    @pulumi.getter(name="configMap")
    def config_map(self) -> pulumi.Output[Mapping[str, builtins.str]]:
        """
        Configuration.
        """
        return pulumi.get(self, "config_map")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[builtins.str]:
        """
        The date and time the membership was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[builtins.str]:
        """
        The unique identifier for the User within the Fivetran system.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The private link name within the account. The name must start with a letter or underscore and can only contain letters,
        numbers, or underscores. Maximum size of name is 23 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[builtins.str]:
        """
        Data processing location. This is where Fivetran will operate and run computation on data.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[builtins.str]:
        """
        Service type.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[builtins.str]:
        """
        The state of the private link.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="stateSummary")
    def state_summary(self) -> pulumi.Output[builtins.str]:
        """
        The state of the private link.
        """
        return pulumi.get(self, "state_summary")

