// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source returns a team object.
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
//			_, err := fivetran.LookupTeam(ctx, &fivetran.LookupTeamArgs{
//				Id: "team_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupTeam(ctx *pulumi.Context, args *LookupTeamArgs, opts ...pulumi.InvokeOption) (*LookupTeamResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTeamResult
	err := ctx.Invoke("fivetran:index/getTeam:getTeam", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTeam.
type LookupTeamArgs struct {
	// The unique identifier for the team within your account.
	Id string `pulumi:"id"`
}

// A collection of values returned by getTeam.
type LookupTeamResult struct {
	// The description of the team within your account.
	Description string `pulumi:"description"`
	// The unique identifier for the team within your account.
	Id string `pulumi:"id"`
	// The name of the team within your account.
	Name string `pulumi:"name"`
	// The account role of the team.
	Role string `pulumi:"role"`
}

func LookupTeamOutput(ctx *pulumi.Context, args LookupTeamOutputArgs, opts ...pulumi.InvokeOption) LookupTeamResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTeamResult, error) {
			args := v.(LookupTeamArgs)
			r, err := LookupTeam(ctx, &args, opts...)
			var s LookupTeamResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTeamResultOutput)
}

// A collection of arguments for invoking getTeam.
type LookupTeamOutputArgs struct {
	// The unique identifier for the team within your account.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupTeamOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTeamArgs)(nil)).Elem()
}

// A collection of values returned by getTeam.
type LookupTeamResultOutput struct{ *pulumi.OutputState }

func (LookupTeamResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTeamResult)(nil)).Elem()
}

func (o LookupTeamResultOutput) ToLookupTeamResultOutput() LookupTeamResultOutput {
	return o
}

func (o LookupTeamResultOutput) ToLookupTeamResultOutputWithContext(ctx context.Context) LookupTeamResultOutput {
	return o
}

func (o LookupTeamResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupTeamResult] {
	return pulumix.Output[LookupTeamResult]{
		OutputState: o.OutputState,
	}
}

// The description of the team within your account.
func (o LookupTeamResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Description }).(pulumi.StringOutput)
}

// The unique identifier for the team within your account.
func (o LookupTeamResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the team within your account.
func (o LookupTeamResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Name }).(pulumi.StringOutput)
}

// The account role of the team.
func (o LookupTeamResultOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Role }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTeamResultOutput{})
}