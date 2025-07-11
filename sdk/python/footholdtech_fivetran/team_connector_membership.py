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

__all__ = ['TeamConnectorMembershipArgs', 'TeamConnectorMembership']

@pulumi.input_type
class TeamConnectorMembershipArgs:
    def __init__(__self__, *,
                 team_id: pulumi.Input[builtins.str],
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input['TeamConnectorMembershipConnectorArgs']]]] = None):
        """
        The set of arguments for constructing a TeamConnectorMembership resource.
        :param pulumi.Input[builtins.str] team_id: The unique identifier for the team within your account.
        """
        pulumi.set(__self__, "team_id", team_id)
        if connectors is not None:
            pulumi.set(__self__, "connectors", connectors)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Input[builtins.str]:
        """
        The unique identifier for the team within your account.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "team_id", value)

    @property
    @pulumi.getter
    def connectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamConnectorMembershipConnectorArgs']]]]:
        return pulumi.get(self, "connectors")

    @connectors.setter
    def connectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamConnectorMembershipConnectorArgs']]]]):
        pulumi.set(self, "connectors", value)


@pulumi.input_type
class _TeamConnectorMembershipState:
    def __init__(__self__, *,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input['TeamConnectorMembershipConnectorArgs']]]] = None,
                 team_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering TeamConnectorMembership resources.
        :param pulumi.Input[builtins.str] team_id: The unique identifier for the team within your account.
        """
        if connectors is not None:
            pulumi.set(__self__, "connectors", connectors)
        if team_id is not None:
            pulumi.set(__self__, "team_id", team_id)

    @property
    @pulumi.getter
    def connectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamConnectorMembershipConnectorArgs']]]]:
        return pulumi.get(self, "connectors")

    @connectors.setter
    def connectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamConnectorMembershipConnectorArgs']]]]):
        pulumi.set(self, "connectors", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The unique identifier for the team within your account.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "team_id", value)


@pulumi.type_token("fivetran:index/teamConnectorMembership:TeamConnectorMembership")
class TeamConnectorMembership(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamConnectorMembershipConnectorArgs', 'TeamConnectorMembershipConnectorArgsDict']]]]] = None,
                 team_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        This resource allows you to create, update, and delete connector membership for teams

        ## Example Usage

        ```python
        import pulumi
        import footholdtech_fivetran as fivetran

        test_team_connector_membership = fivetran.TeamConnectorMembership("test_team_connector_membership",
            team_id="test_team",
            connectors=[
                {
                    "connector_id": "test_connector",
                    "role": "Connector Administrator",
                    "created_at": "2020-05-25T15:26:47.306509Z",
                },
                {
                    "connector_id": "test_connector",
                    "role": "Connector Administrator",
                    "created_at": "2020-05-25T15:26:47.306509Z",
                },
            ])
        ```

        ## Import

        1. To import an existing `fivetran_team_connector_membership` resource into your Terraform state, you need to get `team_id` and `connector_id`

        You can retrieve all teams using the [fivetran_teams data source](/docs/data-sources/teams).

        2. Define an empty resource in your `.tf` configuration:

        hcl

        resource "fivetran_team_connector_membership" "my_imported_fivetran_team_connector_membership" {

        }

        3. Run the `pulumi import` command:

        ```sh
        $ pulumi import fivetran:index/teamConnectorMembership:TeamConnectorMembership my_imported_fivetran_team_connector_membership {team_id}
        ```

        4. Use the `terraform state show` command to get the values from the state:

        terraform state show 'fivetran_team_connector_membership.my_imported_fivetran_team_connector_membership'

        5. Copy the values and paste them to your `.tf` configuration.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] team_id: The unique identifier for the team within your account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamConnectorMembershipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to create, update, and delete connector membership for teams

        ## Example Usage

        ```python
        import pulumi
        import footholdtech_fivetran as fivetran

        test_team_connector_membership = fivetran.TeamConnectorMembership("test_team_connector_membership",
            team_id="test_team",
            connectors=[
                {
                    "connector_id": "test_connector",
                    "role": "Connector Administrator",
                    "created_at": "2020-05-25T15:26:47.306509Z",
                },
                {
                    "connector_id": "test_connector",
                    "role": "Connector Administrator",
                    "created_at": "2020-05-25T15:26:47.306509Z",
                },
            ])
        ```

        ## Import

        1. To import an existing `fivetran_team_connector_membership` resource into your Terraform state, you need to get `team_id` and `connector_id`

        You can retrieve all teams using the [fivetran_teams data source](/docs/data-sources/teams).

        2. Define an empty resource in your `.tf` configuration:

        hcl

        resource "fivetran_team_connector_membership" "my_imported_fivetran_team_connector_membership" {

        }

        3. Run the `pulumi import` command:

        ```sh
        $ pulumi import fivetran:index/teamConnectorMembership:TeamConnectorMembership my_imported_fivetran_team_connector_membership {team_id}
        ```

        4. Use the `terraform state show` command to get the values from the state:

        terraform state show 'fivetran_team_connector_membership.my_imported_fivetran_team_connector_membership'

        5. Copy the values and paste them to your `.tf` configuration.

        :param str resource_name: The name of the resource.
        :param TeamConnectorMembershipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamConnectorMembershipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamConnectorMembershipConnectorArgs', 'TeamConnectorMembershipConnectorArgsDict']]]]] = None,
                 team_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamConnectorMembershipArgs.__new__(TeamConnectorMembershipArgs)

            __props__.__dict__["connectors"] = connectors
            if team_id is None and not opts.urn:
                raise TypeError("Missing required property 'team_id'")
            __props__.__dict__["team_id"] = team_id
        super(TeamConnectorMembership, __self__).__init__(
            'fivetran:index/teamConnectorMembership:TeamConnectorMembership',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connectors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamConnectorMembershipConnectorArgs', 'TeamConnectorMembershipConnectorArgsDict']]]]] = None,
            team_id: Optional[pulumi.Input[builtins.str]] = None) -> 'TeamConnectorMembership':
        """
        Get an existing TeamConnectorMembership resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] team_id: The unique identifier for the team within your account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamConnectorMembershipState.__new__(_TeamConnectorMembershipState)

        __props__.__dict__["connectors"] = connectors
        __props__.__dict__["team_id"] = team_id
        return TeamConnectorMembership(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def connectors(self) -> pulumi.Output[Optional[Sequence['outputs.TeamConnectorMembershipConnector']]]:
        return pulumi.get(self, "connectors")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[builtins.str]:
        """
        The unique identifier for the team within your account.
        """
        return pulumi.get(self, "team_id")

