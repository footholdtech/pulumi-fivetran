// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns a list of all transformations available via API within your Fivetran account.
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
//			_, err := fivetran.GetTransformations(ctx, &fivetran.GetTransformationsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetTransformations(ctx *pulumi.Context, args *GetTransformationsArgs, opts ...pulumi.InvokeOption) (*GetTransformationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTransformationsResult
	err := ctx.Invoke("fivetran:index/getTransformations:getTransformations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransformations.
type GetTransformationsArgs struct {
	Transformations []GetTransformationsTransformation `pulumi:"transformations"`
}

// A collection of values returned by getTransformations.
type GetTransformationsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id              string                             `pulumi:"id"`
	Transformations []GetTransformationsTransformation `pulumi:"transformations"`
}

func GetTransformationsOutput(ctx *pulumi.Context, args GetTransformationsOutputArgs, opts ...pulumi.InvokeOption) GetTransformationsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTransformationsResultOutput, error) {
			args := v.(GetTransformationsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("fivetran:index/getTransformations:getTransformations", args, GetTransformationsResultOutput{}, options).(GetTransformationsResultOutput), nil
		}).(GetTransformationsResultOutput)
}

// A collection of arguments for invoking getTransformations.
type GetTransformationsOutputArgs struct {
	Transformations GetTransformationsTransformationArrayInput `pulumi:"transformations"`
}

func (GetTransformationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransformationsArgs)(nil)).Elem()
}

// A collection of values returned by getTransformations.
type GetTransformationsResultOutput struct{ *pulumi.OutputState }

func (GetTransformationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransformationsResult)(nil)).Elem()
}

func (o GetTransformationsResultOutput) ToGetTransformationsResultOutput() GetTransformationsResultOutput {
	return o
}

func (o GetTransformationsResultOutput) ToGetTransformationsResultOutputWithContext(ctx context.Context) GetTransformationsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransformationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransformationsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTransformationsResultOutput) Transformations() GetTransformationsTransformationArrayOutput {
	return o.ApplyT(func(v GetTransformationsResult) []GetTransformationsTransformation { return v.Transformations }).(GetTransformationsTransformationArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransformationsResultOutput{})
}
