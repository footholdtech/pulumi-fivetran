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

// This resource allows you to create, update, and delete group membership for user
//
// ## Import
//
// 1. To import an existing `fivetran_user_group_membership` resource into your Terraform state, you need to get `user_id` and `group_id`
//
// You can retrieve all users using the [fivetran_users data source](/docs/data-sources/users).
//
// 2. Define an empty resource in your `.tf` configuration:
//
// hcl
//
// resource "fivetran_user_group_membership" "my_imported_fivetran_user_group_membership" {
//
// }
//
// 3. Run the `pulumi import` command:
//
// ```sh
// $ pulumi import fivetran:index/userGroupMembership:UserGroupMembership my_imported_fivetran_user_group_membership {user_id}
// ```
//
// 4. Use the `terraform state show` command to get the values from the state:
//
// terraform state show 'fivetran_user_group_membership.my_imported_fivetran_user_group_membership'
//
// 5. Copy the values and paste them to your `.tf` configuration.
type UserGroupMembership struct {
	pulumi.CustomResourceState

	Groups UserGroupMembershipGroupArrayOutput `pulumi:"groups"`
	// The unique identifier for the user within your account.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserGroupMembership registers a new resource with the given unique name, arguments, and options.
func NewUserGroupMembership(ctx *pulumi.Context,
	name string, args *UserGroupMembershipArgs, opts ...pulumi.ResourceOption) (*UserGroupMembership, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserGroupMembership
	err := ctx.RegisterResource("fivetran:index/userGroupMembership:UserGroupMembership", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserGroupMembership gets an existing UserGroupMembership resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserGroupMembership(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserGroupMembershipState, opts ...pulumi.ResourceOption) (*UserGroupMembership, error) {
	var resource UserGroupMembership
	err := ctx.ReadResource("fivetran:index/userGroupMembership:UserGroupMembership", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserGroupMembership resources.
type userGroupMembershipState struct {
	Groups []UserGroupMembershipGroup `pulumi:"groups"`
	// The unique identifier for the user within your account.
	UserId *string `pulumi:"userId"`
}

type UserGroupMembershipState struct {
	Groups UserGroupMembershipGroupArrayInput
	// The unique identifier for the user within your account.
	UserId pulumi.StringPtrInput
}

func (UserGroupMembershipState) ElementType() reflect.Type {
	return reflect.TypeOf((*userGroupMembershipState)(nil)).Elem()
}

type userGroupMembershipArgs struct {
	Groups []UserGroupMembershipGroup `pulumi:"groups"`
	// The unique identifier for the user within your account.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserGroupMembership resource.
type UserGroupMembershipArgs struct {
	Groups UserGroupMembershipGroupArrayInput
	// The unique identifier for the user within your account.
	UserId pulumi.StringInput
}

func (UserGroupMembershipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userGroupMembershipArgs)(nil)).Elem()
}

type UserGroupMembershipInput interface {
	pulumi.Input

	ToUserGroupMembershipOutput() UserGroupMembershipOutput
	ToUserGroupMembershipOutputWithContext(ctx context.Context) UserGroupMembershipOutput
}

func (*UserGroupMembership) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGroupMembership)(nil)).Elem()
}

func (i *UserGroupMembership) ToUserGroupMembershipOutput() UserGroupMembershipOutput {
	return i.ToUserGroupMembershipOutputWithContext(context.Background())
}

func (i *UserGroupMembership) ToUserGroupMembershipOutputWithContext(ctx context.Context) UserGroupMembershipOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupMembershipOutput)
}

// UserGroupMembershipArrayInput is an input type that accepts UserGroupMembershipArray and UserGroupMembershipArrayOutput values.
// You can construct a concrete instance of `UserGroupMembershipArrayInput` via:
//
//	UserGroupMembershipArray{ UserGroupMembershipArgs{...} }
type UserGroupMembershipArrayInput interface {
	pulumi.Input

	ToUserGroupMembershipArrayOutput() UserGroupMembershipArrayOutput
	ToUserGroupMembershipArrayOutputWithContext(context.Context) UserGroupMembershipArrayOutput
}

type UserGroupMembershipArray []UserGroupMembershipInput

func (UserGroupMembershipArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGroupMembership)(nil)).Elem()
}

func (i UserGroupMembershipArray) ToUserGroupMembershipArrayOutput() UserGroupMembershipArrayOutput {
	return i.ToUserGroupMembershipArrayOutputWithContext(context.Background())
}

func (i UserGroupMembershipArray) ToUserGroupMembershipArrayOutputWithContext(ctx context.Context) UserGroupMembershipArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupMembershipArrayOutput)
}

// UserGroupMembershipMapInput is an input type that accepts UserGroupMembershipMap and UserGroupMembershipMapOutput values.
// You can construct a concrete instance of `UserGroupMembershipMapInput` via:
//
//	UserGroupMembershipMap{ "key": UserGroupMembershipArgs{...} }
type UserGroupMembershipMapInput interface {
	pulumi.Input

	ToUserGroupMembershipMapOutput() UserGroupMembershipMapOutput
	ToUserGroupMembershipMapOutputWithContext(context.Context) UserGroupMembershipMapOutput
}

type UserGroupMembershipMap map[string]UserGroupMembershipInput

func (UserGroupMembershipMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGroupMembership)(nil)).Elem()
}

func (i UserGroupMembershipMap) ToUserGroupMembershipMapOutput() UserGroupMembershipMapOutput {
	return i.ToUserGroupMembershipMapOutputWithContext(context.Background())
}

func (i UserGroupMembershipMap) ToUserGroupMembershipMapOutputWithContext(ctx context.Context) UserGroupMembershipMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupMembershipMapOutput)
}

type UserGroupMembershipOutput struct{ *pulumi.OutputState }

func (UserGroupMembershipOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGroupMembership)(nil)).Elem()
}

func (o UserGroupMembershipOutput) ToUserGroupMembershipOutput() UserGroupMembershipOutput {
	return o
}

func (o UserGroupMembershipOutput) ToUserGroupMembershipOutputWithContext(ctx context.Context) UserGroupMembershipOutput {
	return o
}

func (o UserGroupMembershipOutput) Groups() UserGroupMembershipGroupArrayOutput {
	return o.ApplyT(func(v *UserGroupMembership) UserGroupMembershipGroupArrayOutput { return v.Groups }).(UserGroupMembershipGroupArrayOutput)
}

// The unique identifier for the user within your account.
func (o UserGroupMembershipOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroupMembership) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserGroupMembershipArrayOutput struct{ *pulumi.OutputState }

func (UserGroupMembershipArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGroupMembership)(nil)).Elem()
}

func (o UserGroupMembershipArrayOutput) ToUserGroupMembershipArrayOutput() UserGroupMembershipArrayOutput {
	return o
}

func (o UserGroupMembershipArrayOutput) ToUserGroupMembershipArrayOutputWithContext(ctx context.Context) UserGroupMembershipArrayOutput {
	return o
}

func (o UserGroupMembershipArrayOutput) Index(i pulumi.IntInput) UserGroupMembershipOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserGroupMembership {
		return vs[0].([]*UserGroupMembership)[vs[1].(int)]
	}).(UserGroupMembershipOutput)
}

type UserGroupMembershipMapOutput struct{ *pulumi.OutputState }

func (UserGroupMembershipMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGroupMembership)(nil)).Elem()
}

func (o UserGroupMembershipMapOutput) ToUserGroupMembershipMapOutput() UserGroupMembershipMapOutput {
	return o
}

func (o UserGroupMembershipMapOutput) ToUserGroupMembershipMapOutputWithContext(ctx context.Context) UserGroupMembershipMapOutput {
	return o
}

func (o UserGroupMembershipMapOutput) MapIndex(k pulumi.StringInput) UserGroupMembershipOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserGroupMembership {
		return vs[0].(map[string]*UserGroupMembership)[vs[1].(string)]
	}).(UserGroupMembershipOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupMembershipInput)(nil)).Elem(), &UserGroupMembership{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupMembershipArrayInput)(nil)).Elem(), UserGroupMembershipArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupMembershipMapInput)(nil)).Elem(), UserGroupMembershipMap{})
	pulumi.RegisterOutputType(UserGroupMembershipOutput{})
	pulumi.RegisterOutputType(UserGroupMembershipArrayOutput{})
	pulumi.RegisterOutputType(UserGroupMembershipMapOutput{})
}
