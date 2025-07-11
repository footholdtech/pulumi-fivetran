// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source returns a list of all webhooks within your Fivetran account.
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
//			_, err := fivetran.GetWebhooks(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetWebhooks(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetWebhooksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWebhooksResult
	err := ctx.Invoke("fivetran:index/getWebhooks:getWebhooks", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getWebhooks.
type GetWebhooksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string               `pulumi:"id"`
	Webhooks []GetWebhooksWebhook `pulumi:"webhooks"`
}

func GetWebhooksOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetWebhooksResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetWebhooksResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("fivetran:index/getWebhooks:getWebhooks", nil, GetWebhooksResultOutput{}, options).(GetWebhooksResultOutput), nil
	}).(GetWebhooksResultOutput)
}

// A collection of values returned by getWebhooks.
type GetWebhooksResultOutput struct{ *pulumi.OutputState }

func (GetWebhooksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWebhooksResult)(nil)).Elem()
}

func (o GetWebhooksResultOutput) ToGetWebhooksResultOutput() GetWebhooksResultOutput {
	return o
}

func (o GetWebhooksResultOutput) ToGetWebhooksResultOutputWithContext(ctx context.Context) GetWebhooksResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetWebhooksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWebhooksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetWebhooksResultOutput) Webhooks() GetWebhooksWebhookArrayOutput {
	return o.ApplyT(func(v GetWebhooksResult) []GetWebhooksWebhook { return v.Webhooks }).(GetWebhooksWebhookArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWebhooksResultOutput{})
}
