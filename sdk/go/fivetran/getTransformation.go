// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns transformation details if a valid identifier was provided
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
//			_, err := fivetran.LookupTransformation(ctx, &fivetran.LookupTransformationArgs{
//				Id: "id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupTransformation(ctx *pulumi.Context, args *LookupTransformationArgs, opts ...pulumi.InvokeOption) (*LookupTransformationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTransformationResult
	err := ctx.Invoke("fivetran:index/getTransformation:getTransformation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransformation.
type LookupTransformationArgs struct {
	// The unique identifier for the Transformation within the Fivetran system.
	Id                   string                                 `pulumi:"id"`
	Schedule             *GetTransformationSchedule             `pulumi:"schedule"`
	TransformationConfig *GetTransformationTransformationConfig `pulumi:"transformationConfig"`
}

// A collection of values returned by getTransformation.
type LookupTransformationResult struct {
	// The timestamp of when the transformation was created in your account.
	CreatedAt string `pulumi:"createdAt"`
	// The unique identifier for the User within the Fivetran system who created the transformation.
	CreatedById string `pulumi:"createdById"`
	// The unique identifier for the Transformation within the Fivetran system.
	Id string `pulumi:"id"`
	// Identifiers of related models.
	OutputModelNames []string `pulumi:"outputModelNames"`
	// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
	Paused   bool                       `pulumi:"paused"`
	Schedule *GetTransformationSchedule `pulumi:"schedule"`
	// Status of transformation Project (NOT_READY, READY, ERROR).
	Status               string                                 `pulumi:"status"`
	TransformationConfig *GetTransformationTransformationConfig `pulumi:"transformationConfig"`
	// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
	Type string `pulumi:"type"`
}

func LookupTransformationOutput(ctx *pulumi.Context, args LookupTransformationOutputArgs, opts ...pulumi.InvokeOption) LookupTransformationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTransformationResultOutput, error) {
			args := v.(LookupTransformationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("fivetran:index/getTransformation:getTransformation", args, LookupTransformationResultOutput{}, options).(LookupTransformationResultOutput), nil
		}).(LookupTransformationResultOutput)
}

// A collection of arguments for invoking getTransformation.
type LookupTransformationOutputArgs struct {
	// The unique identifier for the Transformation within the Fivetran system.
	Id                   pulumi.StringInput                            `pulumi:"id"`
	Schedule             GetTransformationSchedulePtrInput             `pulumi:"schedule"`
	TransformationConfig GetTransformationTransformationConfigPtrInput `pulumi:"transformationConfig"`
}

func (LookupTransformationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTransformationArgs)(nil)).Elem()
}

// A collection of values returned by getTransformation.
type LookupTransformationResultOutput struct{ *pulumi.OutputState }

func (LookupTransformationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTransformationResult)(nil)).Elem()
}

func (o LookupTransformationResultOutput) ToLookupTransformationResultOutput() LookupTransformationResultOutput {
	return o
}

func (o LookupTransformationResultOutput) ToLookupTransformationResultOutputWithContext(ctx context.Context) LookupTransformationResultOutput {
	return o
}

// The timestamp of when the transformation was created in your account.
func (o LookupTransformationResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransformationResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The unique identifier for the User within the Fivetran system who created the transformation.
func (o LookupTransformationResultOutput) CreatedById() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransformationResult) string { return v.CreatedById }).(pulumi.StringOutput)
}

// The unique identifier for the Transformation within the Fivetran system.
func (o LookupTransformationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransformationResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifiers of related models.
func (o LookupTransformationResultOutput) OutputModelNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTransformationResult) []string { return v.OutputModelNames }).(pulumi.StringArrayOutput)
}

// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
func (o LookupTransformationResultOutput) Paused() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTransformationResult) bool { return v.Paused }).(pulumi.BoolOutput)
}

func (o LookupTransformationResultOutput) Schedule() GetTransformationSchedulePtrOutput {
	return o.ApplyT(func(v LookupTransformationResult) *GetTransformationSchedule { return v.Schedule }).(GetTransformationSchedulePtrOutput)
}

// Status of transformation Project (NOT_READY, READY, ERROR).
func (o LookupTransformationResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransformationResult) string { return v.Status }).(pulumi.StringOutput)
}

func (o LookupTransformationResultOutput) TransformationConfig() GetTransformationTransformationConfigPtrOutput {
	return o.ApplyT(func(v LookupTransformationResult) *GetTransformationTransformationConfig {
		return v.TransformationConfig
	}).(GetTransformationTransformationConfigPtrOutput)
}

// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
func (o LookupTransformationResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransformationResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTransformationResultOutput{})
}
