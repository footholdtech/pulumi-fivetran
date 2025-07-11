// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"errors"
	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to create, update, and delete connector membership for teams
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := fivetran.NewTeamConnectorMembership(ctx, "test_team_connector_membership", &fivetran.TeamConnectorMembershipArgs{
//				TeamId: pulumi.String("test_team"),
//				Connectors: fivetran.TeamConnectorMembershipConnectorArray{
//					&fivetran.TeamConnectorMembershipConnectorArgs{
//						ConnectorId: pulumi.String("test_connector"),
//						Role:        pulumi.String("Connector Administrator"),
//						CreatedAt:   pulumi.String("2020-05-25T15:26:47.306509Z"),
//					},
//					&fivetran.TeamConnectorMembershipConnectorArgs{
//						ConnectorId: pulumi.String("test_connector"),
//						Role:        pulumi.String("Connector Administrator"),
//						CreatedAt:   pulumi.String("2020-05-25T15:26:47.306509Z"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// 1. To import an existing `fivetran_team_connector_membership` resource into your Terraform state, you need to get `team_id` and `connector_id`
//
// You can retrieve all teams using the [fivetran_teams data source](/docs/data-sources/teams).
//
// 2. Define an empty resource in your `.tf` configuration:
//
// hcl
//
// resource "fivetran_team_connector_membership" "my_imported_fivetran_team_connector_membership" {
//
// }
//
// 3. Run the `pulumi import` command:
//
// ```sh
// $ pulumi import fivetran:index/teamConnectorMembership:TeamConnectorMembership my_imported_fivetran_team_connector_membership {team_id}
// ```
//
// 4. Use the `terraform state show` command to get the values from the state:
//
// terraform state show 'fivetran_team_connector_membership.my_imported_fivetran_team_connector_membership'
//
// 5. Copy the values and paste them to your `.tf` configuration.
type TeamConnectorMembership struct {
	pulumi.CustomResourceState

	Connectors TeamConnectorMembershipConnectorArrayOutput `pulumi:"connectors"`
	// The unique identifier for the team within your account.
	TeamId pulumi.StringOutput `pulumi:"teamId"`
}

// NewTeamConnectorMembership registers a new resource with the given unique name, arguments, and options.
func NewTeamConnectorMembership(ctx *pulumi.Context,
	name string, args *TeamConnectorMembershipArgs, opts ...pulumi.ResourceOption) (*TeamConnectorMembership, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TeamId == nil {
		return nil, errors.New("invalid value for required argument 'TeamId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TeamConnectorMembership
	err := ctx.RegisterResource("fivetran:index/teamConnectorMembership:TeamConnectorMembership", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamConnectorMembership gets an existing TeamConnectorMembership resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamConnectorMembership(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamConnectorMembershipState, opts ...pulumi.ResourceOption) (*TeamConnectorMembership, error) {
	var resource TeamConnectorMembership
	err := ctx.ReadResource("fivetran:index/teamConnectorMembership:TeamConnectorMembership", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamConnectorMembership resources.
type teamConnectorMembershipState struct {
	Connectors []TeamConnectorMembershipConnector `pulumi:"connectors"`
	// The unique identifier for the team within your account.
	TeamId *string `pulumi:"teamId"`
}

type TeamConnectorMembershipState struct {
	Connectors TeamConnectorMembershipConnectorArrayInput
	// The unique identifier for the team within your account.
	TeamId pulumi.StringPtrInput
}

func (TeamConnectorMembershipState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamConnectorMembershipState)(nil)).Elem()
}

type teamConnectorMembershipArgs struct {
	Connectors []TeamConnectorMembershipConnector `pulumi:"connectors"`
	// The unique identifier for the team within your account.
	TeamId string `pulumi:"teamId"`
}

// The set of arguments for constructing a TeamConnectorMembership resource.
type TeamConnectorMembershipArgs struct {
	Connectors TeamConnectorMembershipConnectorArrayInput
	// The unique identifier for the team within your account.
	TeamId pulumi.StringInput
}

func (TeamConnectorMembershipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamConnectorMembershipArgs)(nil)).Elem()
}

type TeamConnectorMembershipInput interface {
	pulumi.Input

	ToTeamConnectorMembershipOutput() TeamConnectorMembershipOutput
	ToTeamConnectorMembershipOutputWithContext(ctx context.Context) TeamConnectorMembershipOutput
}

func (*TeamConnectorMembership) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamConnectorMembership)(nil)).Elem()
}

func (i *TeamConnectorMembership) ToTeamConnectorMembershipOutput() TeamConnectorMembershipOutput {
	return i.ToTeamConnectorMembershipOutputWithContext(context.Background())
}

func (i *TeamConnectorMembership) ToTeamConnectorMembershipOutputWithContext(ctx context.Context) TeamConnectorMembershipOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamConnectorMembershipOutput)
}

// TeamConnectorMembershipArrayInput is an input type that accepts TeamConnectorMembershipArray and TeamConnectorMembershipArrayOutput values.
// You can construct a concrete instance of `TeamConnectorMembershipArrayInput` via:
//
//	TeamConnectorMembershipArray{ TeamConnectorMembershipArgs{...} }
type TeamConnectorMembershipArrayInput interface {
	pulumi.Input

	ToTeamConnectorMembershipArrayOutput() TeamConnectorMembershipArrayOutput
	ToTeamConnectorMembershipArrayOutputWithContext(context.Context) TeamConnectorMembershipArrayOutput
}

type TeamConnectorMembershipArray []TeamConnectorMembershipInput

func (TeamConnectorMembershipArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamConnectorMembership)(nil)).Elem()
}

func (i TeamConnectorMembershipArray) ToTeamConnectorMembershipArrayOutput() TeamConnectorMembershipArrayOutput {
	return i.ToTeamConnectorMembershipArrayOutputWithContext(context.Background())
}

func (i TeamConnectorMembershipArray) ToTeamConnectorMembershipArrayOutputWithContext(ctx context.Context) TeamConnectorMembershipArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamConnectorMembershipArrayOutput)
}

// TeamConnectorMembershipMapInput is an input type that accepts TeamConnectorMembershipMap and TeamConnectorMembershipMapOutput values.
// You can construct a concrete instance of `TeamConnectorMembershipMapInput` via:
//
//	TeamConnectorMembershipMap{ "key": TeamConnectorMembershipArgs{...} }
type TeamConnectorMembershipMapInput interface {
	pulumi.Input

	ToTeamConnectorMembershipMapOutput() TeamConnectorMembershipMapOutput
	ToTeamConnectorMembershipMapOutputWithContext(context.Context) TeamConnectorMembershipMapOutput
}

type TeamConnectorMembershipMap map[string]TeamConnectorMembershipInput

func (TeamConnectorMembershipMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamConnectorMembership)(nil)).Elem()
}

func (i TeamConnectorMembershipMap) ToTeamConnectorMembershipMapOutput() TeamConnectorMembershipMapOutput {
	return i.ToTeamConnectorMembershipMapOutputWithContext(context.Background())
}

func (i TeamConnectorMembershipMap) ToTeamConnectorMembershipMapOutputWithContext(ctx context.Context) TeamConnectorMembershipMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamConnectorMembershipMapOutput)
}

type TeamConnectorMembershipOutput struct{ *pulumi.OutputState }

func (TeamConnectorMembershipOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamConnectorMembership)(nil)).Elem()
}

func (o TeamConnectorMembershipOutput) ToTeamConnectorMembershipOutput() TeamConnectorMembershipOutput {
	return o
}

func (o TeamConnectorMembershipOutput) ToTeamConnectorMembershipOutputWithContext(ctx context.Context) TeamConnectorMembershipOutput {
	return o
}

func (o TeamConnectorMembershipOutput) Connectors() TeamConnectorMembershipConnectorArrayOutput {
	return o.ApplyT(func(v *TeamConnectorMembership) TeamConnectorMembershipConnectorArrayOutput { return v.Connectors }).(TeamConnectorMembershipConnectorArrayOutput)
}

// The unique identifier for the team within your account.
func (o TeamConnectorMembershipOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamConnectorMembership) pulumi.StringOutput { return v.TeamId }).(pulumi.StringOutput)
}

type TeamConnectorMembershipArrayOutput struct{ *pulumi.OutputState }

func (TeamConnectorMembershipArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamConnectorMembership)(nil)).Elem()
}

func (o TeamConnectorMembershipArrayOutput) ToTeamConnectorMembershipArrayOutput() TeamConnectorMembershipArrayOutput {
	return o
}

func (o TeamConnectorMembershipArrayOutput) ToTeamConnectorMembershipArrayOutputWithContext(ctx context.Context) TeamConnectorMembershipArrayOutput {
	return o
}

func (o TeamConnectorMembershipArrayOutput) Index(i pulumi.IntInput) TeamConnectorMembershipOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamConnectorMembership {
		return vs[0].([]*TeamConnectorMembership)[vs[1].(int)]
	}).(TeamConnectorMembershipOutput)
}

type TeamConnectorMembershipMapOutput struct{ *pulumi.OutputState }

func (TeamConnectorMembershipMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamConnectorMembership)(nil)).Elem()
}

func (o TeamConnectorMembershipMapOutput) ToTeamConnectorMembershipMapOutput() TeamConnectorMembershipMapOutput {
	return o
}

func (o TeamConnectorMembershipMapOutput) ToTeamConnectorMembershipMapOutputWithContext(ctx context.Context) TeamConnectorMembershipMapOutput {
	return o
}

func (o TeamConnectorMembershipMapOutput) MapIndex(k pulumi.StringInput) TeamConnectorMembershipOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamConnectorMembership {
		return vs[0].(map[string]*TeamConnectorMembership)[vs[1].(string)]
	}).(TeamConnectorMembershipOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamConnectorMembershipInput)(nil)).Elem(), &TeamConnectorMembership{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamConnectorMembershipArrayInput)(nil)).Elem(), TeamConnectorMembershipArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamConnectorMembershipMapInput)(nil)).Elem(), TeamConnectorMembershipMap{})
	pulumi.RegisterOutputType(TeamConnectorMembershipOutput{})
	pulumi.RegisterOutputType(TeamConnectorMembershipArrayOutput{})
	pulumi.RegisterOutputType(TeamConnectorMembershipMapOutput{})
}
