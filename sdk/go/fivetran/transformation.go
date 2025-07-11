// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource is in ALPHA state.
//
// This resource allows you to add, manage and delete transformation projects in your account.
//
// ## Example Usage
//
// ## Import
//
// 1. To import an existing `fivetran_transformation` resource into your Terraform state, you need to get **Transformation ID** via API call `GET https://api.fivetran.com/v1/transformations` to retrieve available projects.
//
// 2. Fetch transformation details for particular `transformation-id` using `GET https://api.fivetran.com/v1/transformations/{transformation-id}` to ensure that this is the transformation you want to import.
//
// 3. Define an empty resource in your `.tf` configuration:
//
// hcl
//
// resource "fivetran_transformation" "my_imported_fivetran_transformation" {
//
// }
//
// 4. Run the `pulumi import` command:
//
// ```sh
// $ pulumi import fivetran:index/transformation:Transformation my_imported_fivetran_transformation {Transformation ID}
// ```
//
// 4. Use the `terraform state show` command to get the values from the state:
//
// terraform state show 'fivetran_transformation.my_imported_fivetran_transformation'
//
// 5. Copy the values and paste them to your `.tf` configuration.
type Transformation struct {
	pulumi.CustomResourceState

	// The timestamp of when the transformation was created in your account.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The unique identifier for the User within the Fivetran system who created the transformation.
	CreatedById pulumi.StringOutput `pulumi:"createdById"`
	// Identifiers of related models.
	OutputModelNames pulumi.StringArrayOutput `pulumi:"outputModelNames"`
	// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
	Paused   pulumi.BoolOutput               `pulumi:"paused"`
	Schedule TransformationSchedulePtrOutput `pulumi:"schedule"`
	// Status of transformation Project (NOT_READY, READY, ERROR).
	Status               pulumi.StringOutput                         `pulumi:"status"`
	TransformationConfig TransformationTransformationConfigPtrOutput `pulumi:"transformationConfig"`
	// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewTransformation registers a new resource with the given unique name, arguments, and options.
func NewTransformation(ctx *pulumi.Context,
	name string, args *TransformationArgs, opts ...pulumi.ResourceOption) (*Transformation, error) {
	if args == nil {
		args = &TransformationArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Transformation
	err := ctx.RegisterResource("fivetran:index/transformation:Transformation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransformation gets an existing Transformation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransformation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransformationState, opts ...pulumi.ResourceOption) (*Transformation, error) {
	var resource Transformation
	err := ctx.ReadResource("fivetran:index/transformation:Transformation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Transformation resources.
type transformationState struct {
	// The timestamp of when the transformation was created in your account.
	CreatedAt *string `pulumi:"createdAt"`
	// The unique identifier for the User within the Fivetran system who created the transformation.
	CreatedById *string `pulumi:"createdById"`
	// Identifiers of related models.
	OutputModelNames []string `pulumi:"outputModelNames"`
	// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
	Paused   *bool                   `pulumi:"paused"`
	Schedule *TransformationSchedule `pulumi:"schedule"`
	// Status of transformation Project (NOT_READY, READY, ERROR).
	Status               *string                             `pulumi:"status"`
	TransformationConfig *TransformationTransformationConfig `pulumi:"transformationConfig"`
	// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
	Type *string `pulumi:"type"`
}

type TransformationState struct {
	// The timestamp of when the transformation was created in your account.
	CreatedAt pulumi.StringPtrInput
	// The unique identifier for the User within the Fivetran system who created the transformation.
	CreatedById pulumi.StringPtrInput
	// Identifiers of related models.
	OutputModelNames pulumi.StringArrayInput
	// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
	Paused   pulumi.BoolPtrInput
	Schedule TransformationSchedulePtrInput
	// Status of transformation Project (NOT_READY, READY, ERROR).
	Status               pulumi.StringPtrInput
	TransformationConfig TransformationTransformationConfigPtrInput
	// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
	Type pulumi.StringPtrInput
}

func (TransformationState) ElementType() reflect.Type {
	return reflect.TypeOf((*transformationState)(nil)).Elem()
}

type transformationArgs struct {
	// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
	Paused               *bool                               `pulumi:"paused"`
	Schedule             *TransformationSchedule             `pulumi:"schedule"`
	TransformationConfig *TransformationTransformationConfig `pulumi:"transformationConfig"`
	// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Transformation resource.
type TransformationArgs struct {
	// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
	Paused               pulumi.BoolPtrInput
	Schedule             TransformationSchedulePtrInput
	TransformationConfig TransformationTransformationConfigPtrInput
	// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
	Type pulumi.StringPtrInput
}

func (TransformationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transformationArgs)(nil)).Elem()
}

type TransformationInput interface {
	pulumi.Input

	ToTransformationOutput() TransformationOutput
	ToTransformationOutputWithContext(ctx context.Context) TransformationOutput
}

func (*Transformation) ElementType() reflect.Type {
	return reflect.TypeOf((**Transformation)(nil)).Elem()
}

func (i *Transformation) ToTransformationOutput() TransformationOutput {
	return i.ToTransformationOutputWithContext(context.Background())
}

func (i *Transformation) ToTransformationOutputWithContext(ctx context.Context) TransformationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransformationOutput)
}

// TransformationArrayInput is an input type that accepts TransformationArray and TransformationArrayOutput values.
// You can construct a concrete instance of `TransformationArrayInput` via:
//
//	TransformationArray{ TransformationArgs{...} }
type TransformationArrayInput interface {
	pulumi.Input

	ToTransformationArrayOutput() TransformationArrayOutput
	ToTransformationArrayOutputWithContext(context.Context) TransformationArrayOutput
}

type TransformationArray []TransformationInput

func (TransformationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Transformation)(nil)).Elem()
}

func (i TransformationArray) ToTransformationArrayOutput() TransformationArrayOutput {
	return i.ToTransformationArrayOutputWithContext(context.Background())
}

func (i TransformationArray) ToTransformationArrayOutputWithContext(ctx context.Context) TransformationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransformationArrayOutput)
}

// TransformationMapInput is an input type that accepts TransformationMap and TransformationMapOutput values.
// You can construct a concrete instance of `TransformationMapInput` via:
//
//	TransformationMap{ "key": TransformationArgs{...} }
type TransformationMapInput interface {
	pulumi.Input

	ToTransformationMapOutput() TransformationMapOutput
	ToTransformationMapOutputWithContext(context.Context) TransformationMapOutput
}

type TransformationMap map[string]TransformationInput

func (TransformationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Transformation)(nil)).Elem()
}

func (i TransformationMap) ToTransformationMapOutput() TransformationMapOutput {
	return i.ToTransformationMapOutputWithContext(context.Background())
}

func (i TransformationMap) ToTransformationMapOutputWithContext(ctx context.Context) TransformationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransformationMapOutput)
}

type TransformationOutput struct{ *pulumi.OutputState }

func (TransformationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Transformation)(nil)).Elem()
}

func (o TransformationOutput) ToTransformationOutput() TransformationOutput {
	return o
}

func (o TransformationOutput) ToTransformationOutputWithContext(ctx context.Context) TransformationOutput {
	return o
}

// The timestamp of when the transformation was created in your account.
func (o TransformationOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Transformation) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The unique identifier for the User within the Fivetran system who created the transformation.
func (o TransformationOutput) CreatedById() pulumi.StringOutput {
	return o.ApplyT(func(v *Transformation) pulumi.StringOutput { return v.CreatedById }).(pulumi.StringOutput)
}

// Identifiers of related models.
func (o TransformationOutput) OutputModelNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Transformation) pulumi.StringArrayOutput { return v.OutputModelNames }).(pulumi.StringArrayOutput)
}

// The field indicating whether the transformation will be set into the paused state. By default, the value is false.
func (o TransformationOutput) Paused() pulumi.BoolOutput {
	return o.ApplyT(func(v *Transformation) pulumi.BoolOutput { return v.Paused }).(pulumi.BoolOutput)
}

func (o TransformationOutput) Schedule() TransformationSchedulePtrOutput {
	return o.ApplyT(func(v *Transformation) TransformationSchedulePtrOutput { return v.Schedule }).(TransformationSchedulePtrOutput)
}

// Status of transformation Project (NOT_READY, READY, ERROR).
func (o TransformationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Transformation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

func (o TransformationOutput) TransformationConfig() TransformationTransformationConfigPtrOutput {
	return o.ApplyT(func(v *Transformation) TransformationTransformationConfigPtrOutput { return v.TransformationConfig }).(TransformationTransformationConfigPtrOutput)
}

// Transformation type. The following values are supported: DBT_CORE, QUICKSTART.
func (o TransformationOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Transformation) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type TransformationArrayOutput struct{ *pulumi.OutputState }

func (TransformationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Transformation)(nil)).Elem()
}

func (o TransformationArrayOutput) ToTransformationArrayOutput() TransformationArrayOutput {
	return o
}

func (o TransformationArrayOutput) ToTransformationArrayOutputWithContext(ctx context.Context) TransformationArrayOutput {
	return o
}

func (o TransformationArrayOutput) Index(i pulumi.IntInput) TransformationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Transformation {
		return vs[0].([]*Transformation)[vs[1].(int)]
	}).(TransformationOutput)
}

type TransformationMapOutput struct{ *pulumi.OutputState }

func (TransformationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Transformation)(nil)).Elem()
}

func (o TransformationMapOutput) ToTransformationMapOutput() TransformationMapOutput {
	return o
}

func (o TransformationMapOutput) ToTransformationMapOutputWithContext(ctx context.Context) TransformationMapOutput {
	return o
}

func (o TransformationMapOutput) MapIndex(k pulumi.StringInput) TransformationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Transformation {
		return vs[0].(map[string]*Transformation)[vs[1].(string)]
	}).(TransformationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransformationInput)(nil)).Elem(), &Transformation{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransformationArrayInput)(nil)).Elem(), TransformationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransformationMapInput)(nil)).Elem(), TransformationMap{})
	pulumi.RegisterOutputType(TransformationOutput{})
	pulumi.RegisterOutputType(TransformationArrayOutput{})
	pulumi.RegisterOutputType(TransformationMapOutput{})
}
