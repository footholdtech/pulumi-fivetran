// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source returns a proxy agent object.
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
//			_, err := fivetran.LookupProxyAgent(ctx, &fivetran.LookupProxyAgentArgs{
//				Id: "proxy_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupProxyAgent(ctx *pulumi.Context, args *LookupProxyAgentArgs, opts ...pulumi.InvokeOption) (*LookupProxyAgentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProxyAgentResult
	err := ctx.Invoke("fivetran:index/getProxyAgent:getProxyAgent", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProxyAgent.
type LookupProxyAgentArgs struct {
	// The unique identifier for the proxy within your account.
	Id string `pulumi:"id"`
}

// A collection of values returned by getProxyAgent.
type LookupProxyAgentResult struct {
	// The actor who created the proxy agent.
	CreatedBy string `pulumi:"createdBy"`
	// Proxy agent name.
	DisplayName string `pulumi:"displayName"`
	// Data processing location. This is where Fivetran will operate and run computation on data.
	GroupRegion string `pulumi:"groupRegion"`
	// The unique identifier for the proxy within your account.
	Id string `pulumi:"id"`
	// The timestamp of the time the proxy agent was created in your account.
	RegistredAt string `pulumi:"registredAt"`
	// The salt.
	Salt string `pulumi:"salt"`
	// The auth token.
	Token string `pulumi:"token"`
}

func LookupProxyAgentOutput(ctx *pulumi.Context, args LookupProxyAgentOutputArgs, opts ...pulumi.InvokeOption) LookupProxyAgentResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupProxyAgentResultOutput, error) {
			args := v.(LookupProxyAgentArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("fivetran:index/getProxyAgent:getProxyAgent", args, LookupProxyAgentResultOutput{}, options).(LookupProxyAgentResultOutput), nil
		}).(LookupProxyAgentResultOutput)
}

// A collection of arguments for invoking getProxyAgent.
type LookupProxyAgentOutputArgs struct {
	// The unique identifier for the proxy within your account.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupProxyAgentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProxyAgentArgs)(nil)).Elem()
}

// A collection of values returned by getProxyAgent.
type LookupProxyAgentResultOutput struct{ *pulumi.OutputState }

func (LookupProxyAgentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProxyAgentResult)(nil)).Elem()
}

func (o LookupProxyAgentResultOutput) ToLookupProxyAgentResultOutput() LookupProxyAgentResultOutput {
	return o
}

func (o LookupProxyAgentResultOutput) ToLookupProxyAgentResultOutputWithContext(ctx context.Context) LookupProxyAgentResultOutput {
	return o
}

// The actor who created the proxy agent.
func (o LookupProxyAgentResultOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProxyAgentResult) string { return v.CreatedBy }).(pulumi.StringOutput)
}

// Proxy agent name.
func (o LookupProxyAgentResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProxyAgentResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// Data processing location. This is where Fivetran will operate and run computation on data.
func (o LookupProxyAgentResultOutput) GroupRegion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProxyAgentResult) string { return v.GroupRegion }).(pulumi.StringOutput)
}

// The unique identifier for the proxy within your account.
func (o LookupProxyAgentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProxyAgentResult) string { return v.Id }).(pulumi.StringOutput)
}

// The timestamp of the time the proxy agent was created in your account.
func (o LookupProxyAgentResultOutput) RegistredAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProxyAgentResult) string { return v.RegistredAt }).(pulumi.StringOutput)
}

// The salt.
func (o LookupProxyAgentResultOutput) Salt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProxyAgentResult) string { return v.Salt }).(pulumi.StringOutput)
}

// The auth token.
func (o LookupProxyAgentResultOutput) Token() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProxyAgentResult) string { return v.Token }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProxyAgentResultOutput{})
}
