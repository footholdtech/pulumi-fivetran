// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source returns list of logging service objects.
func GetExternalLogs(ctx *pulumi.Context, args *GetExternalLogsArgs, opts ...pulumi.InvokeOption) (*GetExternalLogsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetExternalLogsResult
	err := ctx.Invoke("fivetran:index/getExternalLogs:getExternalLogs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getExternalLogs.
type GetExternalLogsArgs struct {
	Logs []GetExternalLogsLog `pulumi:"logs"`
}

// A collection of values returned by getExternalLogs.
type GetExternalLogsResult struct {
	// The ID of this resource.
	Id   string               `pulumi:"id"`
	Logs []GetExternalLogsLog `pulumi:"logs"`
}

func GetExternalLogsOutput(ctx *pulumi.Context, args GetExternalLogsOutputArgs, opts ...pulumi.InvokeOption) GetExternalLogsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetExternalLogsResultOutput, error) {
			args := v.(GetExternalLogsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("fivetran:index/getExternalLogs:getExternalLogs", args, GetExternalLogsResultOutput{}, options).(GetExternalLogsResultOutput), nil
		}).(GetExternalLogsResultOutput)
}

// A collection of arguments for invoking getExternalLogs.
type GetExternalLogsOutputArgs struct {
	Logs GetExternalLogsLogArrayInput `pulumi:"logs"`
}

func (GetExternalLogsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetExternalLogsArgs)(nil)).Elem()
}

// A collection of values returned by getExternalLogs.
type GetExternalLogsResultOutput struct{ *pulumi.OutputState }

func (GetExternalLogsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetExternalLogsResult)(nil)).Elem()
}

func (o GetExternalLogsResultOutput) ToGetExternalLogsResultOutput() GetExternalLogsResultOutput {
	return o
}

func (o GetExternalLogsResultOutput) ToGetExternalLogsResultOutputWithContext(ctx context.Context) GetExternalLogsResultOutput {
	return o
}

// The ID of this resource.
func (o GetExternalLogsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalLogsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetExternalLogsResultOutput) Logs() GetExternalLogsLogArrayOutput {
	return o.ApplyT(func(v GetExternalLogsResult) []GetExternalLogsLog { return v.Logs }).(GetExternalLogsLogArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetExternalLogsResultOutput{})
}
