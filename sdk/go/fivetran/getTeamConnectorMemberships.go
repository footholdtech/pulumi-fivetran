// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source returns a connector membership within team object.
func GetTeamConnectorMemberships(ctx *pulumi.Context, args *GetTeamConnectorMembershipsArgs, opts ...pulumi.InvokeOption) (*GetTeamConnectorMembershipsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTeamConnectorMembershipsResult
	err := ctx.Invoke("fivetran:index/getTeamConnectorMemberships:getTeamConnectorMemberships", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTeamConnectorMemberships.
type GetTeamConnectorMembershipsArgs struct {
	Connectors []GetTeamConnectorMembershipsConnector `pulumi:"connectors"`
	// The unique identifier for the team within your account.
	TeamId string `pulumi:"teamId"`
}

// A collection of values returned by getTeamConnectorMemberships.
type GetTeamConnectorMembershipsResult struct {
	Connectors []GetTeamConnectorMembershipsConnector `pulumi:"connectors"`
	// The unique identifier for resource.
	Id string `pulumi:"id"`
	// The unique identifier for the team within your account.
	TeamId string `pulumi:"teamId"`
}

func GetTeamConnectorMembershipsOutput(ctx *pulumi.Context, args GetTeamConnectorMembershipsOutputArgs, opts ...pulumi.InvokeOption) GetTeamConnectorMembershipsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTeamConnectorMembershipsResultOutput, error) {
			args := v.(GetTeamConnectorMembershipsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("fivetran:index/getTeamConnectorMemberships:getTeamConnectorMemberships", args, GetTeamConnectorMembershipsResultOutput{}, options).(GetTeamConnectorMembershipsResultOutput), nil
		}).(GetTeamConnectorMembershipsResultOutput)
}

// A collection of arguments for invoking getTeamConnectorMemberships.
type GetTeamConnectorMembershipsOutputArgs struct {
	Connectors GetTeamConnectorMembershipsConnectorArrayInput `pulumi:"connectors"`
	// The unique identifier for the team within your account.
	TeamId pulumi.StringInput `pulumi:"teamId"`
}

func (GetTeamConnectorMembershipsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTeamConnectorMembershipsArgs)(nil)).Elem()
}

// A collection of values returned by getTeamConnectorMemberships.
type GetTeamConnectorMembershipsResultOutput struct{ *pulumi.OutputState }

func (GetTeamConnectorMembershipsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTeamConnectorMembershipsResult)(nil)).Elem()
}

func (o GetTeamConnectorMembershipsResultOutput) ToGetTeamConnectorMembershipsResultOutput() GetTeamConnectorMembershipsResultOutput {
	return o
}

func (o GetTeamConnectorMembershipsResultOutput) ToGetTeamConnectorMembershipsResultOutputWithContext(ctx context.Context) GetTeamConnectorMembershipsResultOutput {
	return o
}

func (o GetTeamConnectorMembershipsResultOutput) Connectors() GetTeamConnectorMembershipsConnectorArrayOutput {
	return o.ApplyT(func(v GetTeamConnectorMembershipsResult) []GetTeamConnectorMembershipsConnector { return v.Connectors }).(GetTeamConnectorMembershipsConnectorArrayOutput)
}

// The unique identifier for resource.
func (o GetTeamConnectorMembershipsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTeamConnectorMembershipsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The unique identifier for the team within your account.
func (o GetTeamConnectorMembershipsResultOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTeamConnectorMembershipsResult) string { return v.TeamId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTeamConnectorMembershipsResultOutput{})
}
