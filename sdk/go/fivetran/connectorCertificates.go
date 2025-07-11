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

type ConnectorCertificates struct {
	pulumi.CustomResourceState

	Certificates ConnectorCertificatesCertificateArrayOutput `pulumi:"certificates"`
	// The unique identifier for the target connection within the Fivetran system.
	ConnectorId pulumi.StringOutput `pulumi:"connectorId"`
}

// NewConnectorCertificates registers a new resource with the given unique name, arguments, and options.
func NewConnectorCertificates(ctx *pulumi.Context,
	name string, args *ConnectorCertificatesArgs, opts ...pulumi.ResourceOption) (*ConnectorCertificates, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectorId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectorId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConnectorCertificates
	err := ctx.RegisterResource("fivetran:index/connectorCertificates:ConnectorCertificates", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectorCertificates gets an existing ConnectorCertificates resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectorCertificates(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorCertificatesState, opts ...pulumi.ResourceOption) (*ConnectorCertificates, error) {
	var resource ConnectorCertificates
	err := ctx.ReadResource("fivetran:index/connectorCertificates:ConnectorCertificates", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectorCertificates resources.
type connectorCertificatesState struct {
	Certificates []ConnectorCertificatesCertificate `pulumi:"certificates"`
	// The unique identifier for the target connection within the Fivetran system.
	ConnectorId *string `pulumi:"connectorId"`
}

type ConnectorCertificatesState struct {
	Certificates ConnectorCertificatesCertificateArrayInput
	// The unique identifier for the target connection within the Fivetran system.
	ConnectorId pulumi.StringPtrInput
}

func (ConnectorCertificatesState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorCertificatesState)(nil)).Elem()
}

type connectorCertificatesArgs struct {
	Certificates []ConnectorCertificatesCertificate `pulumi:"certificates"`
	// The unique identifier for the target connection within the Fivetran system.
	ConnectorId string `pulumi:"connectorId"`
}

// The set of arguments for constructing a ConnectorCertificates resource.
type ConnectorCertificatesArgs struct {
	Certificates ConnectorCertificatesCertificateArrayInput
	// The unique identifier for the target connection within the Fivetran system.
	ConnectorId pulumi.StringInput
}

func (ConnectorCertificatesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorCertificatesArgs)(nil)).Elem()
}

type ConnectorCertificatesInput interface {
	pulumi.Input

	ToConnectorCertificatesOutput() ConnectorCertificatesOutput
	ToConnectorCertificatesOutputWithContext(ctx context.Context) ConnectorCertificatesOutput
}

func (*ConnectorCertificates) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectorCertificates)(nil)).Elem()
}

func (i *ConnectorCertificates) ToConnectorCertificatesOutput() ConnectorCertificatesOutput {
	return i.ToConnectorCertificatesOutputWithContext(context.Background())
}

func (i *ConnectorCertificates) ToConnectorCertificatesOutputWithContext(ctx context.Context) ConnectorCertificatesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorCertificatesOutput)
}

// ConnectorCertificatesArrayInput is an input type that accepts ConnectorCertificatesArray and ConnectorCertificatesArrayOutput values.
// You can construct a concrete instance of `ConnectorCertificatesArrayInput` via:
//
//	ConnectorCertificatesArray{ ConnectorCertificatesArgs{...} }
type ConnectorCertificatesArrayInput interface {
	pulumi.Input

	ToConnectorCertificatesArrayOutput() ConnectorCertificatesArrayOutput
	ToConnectorCertificatesArrayOutputWithContext(context.Context) ConnectorCertificatesArrayOutput
}

type ConnectorCertificatesArray []ConnectorCertificatesInput

func (ConnectorCertificatesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectorCertificates)(nil)).Elem()
}

func (i ConnectorCertificatesArray) ToConnectorCertificatesArrayOutput() ConnectorCertificatesArrayOutput {
	return i.ToConnectorCertificatesArrayOutputWithContext(context.Background())
}

func (i ConnectorCertificatesArray) ToConnectorCertificatesArrayOutputWithContext(ctx context.Context) ConnectorCertificatesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorCertificatesArrayOutput)
}

// ConnectorCertificatesMapInput is an input type that accepts ConnectorCertificatesMap and ConnectorCertificatesMapOutput values.
// You can construct a concrete instance of `ConnectorCertificatesMapInput` via:
//
//	ConnectorCertificatesMap{ "key": ConnectorCertificatesArgs{...} }
type ConnectorCertificatesMapInput interface {
	pulumi.Input

	ToConnectorCertificatesMapOutput() ConnectorCertificatesMapOutput
	ToConnectorCertificatesMapOutputWithContext(context.Context) ConnectorCertificatesMapOutput
}

type ConnectorCertificatesMap map[string]ConnectorCertificatesInput

func (ConnectorCertificatesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectorCertificates)(nil)).Elem()
}

func (i ConnectorCertificatesMap) ToConnectorCertificatesMapOutput() ConnectorCertificatesMapOutput {
	return i.ToConnectorCertificatesMapOutputWithContext(context.Background())
}

func (i ConnectorCertificatesMap) ToConnectorCertificatesMapOutputWithContext(ctx context.Context) ConnectorCertificatesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorCertificatesMapOutput)
}

type ConnectorCertificatesOutput struct{ *pulumi.OutputState }

func (ConnectorCertificatesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectorCertificates)(nil)).Elem()
}

func (o ConnectorCertificatesOutput) ToConnectorCertificatesOutput() ConnectorCertificatesOutput {
	return o
}

func (o ConnectorCertificatesOutput) ToConnectorCertificatesOutputWithContext(ctx context.Context) ConnectorCertificatesOutput {
	return o
}

func (o ConnectorCertificatesOutput) Certificates() ConnectorCertificatesCertificateArrayOutput {
	return o.ApplyT(func(v *ConnectorCertificates) ConnectorCertificatesCertificateArrayOutput { return v.Certificates }).(ConnectorCertificatesCertificateArrayOutput)
}

// The unique identifier for the target connection within the Fivetran system.
func (o ConnectorCertificatesOutput) ConnectorId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorCertificates) pulumi.StringOutput { return v.ConnectorId }).(pulumi.StringOutput)
}

type ConnectorCertificatesArrayOutput struct{ *pulumi.OutputState }

func (ConnectorCertificatesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectorCertificates)(nil)).Elem()
}

func (o ConnectorCertificatesArrayOutput) ToConnectorCertificatesArrayOutput() ConnectorCertificatesArrayOutput {
	return o
}

func (o ConnectorCertificatesArrayOutput) ToConnectorCertificatesArrayOutputWithContext(ctx context.Context) ConnectorCertificatesArrayOutput {
	return o
}

func (o ConnectorCertificatesArrayOutput) Index(i pulumi.IntInput) ConnectorCertificatesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectorCertificates {
		return vs[0].([]*ConnectorCertificates)[vs[1].(int)]
	}).(ConnectorCertificatesOutput)
}

type ConnectorCertificatesMapOutput struct{ *pulumi.OutputState }

func (ConnectorCertificatesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectorCertificates)(nil)).Elem()
}

func (o ConnectorCertificatesMapOutput) ToConnectorCertificatesMapOutput() ConnectorCertificatesMapOutput {
	return o
}

func (o ConnectorCertificatesMapOutput) ToConnectorCertificatesMapOutputWithContext(ctx context.Context) ConnectorCertificatesMapOutput {
	return o
}

func (o ConnectorCertificatesMapOutput) MapIndex(k pulumi.StringInput) ConnectorCertificatesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectorCertificates {
		return vs[0].(map[string]*ConnectorCertificates)[vs[1].(string)]
	}).(ConnectorCertificatesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorCertificatesInput)(nil)).Elem(), &ConnectorCertificates{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorCertificatesArrayInput)(nil)).Elem(), ConnectorCertificatesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorCertificatesMapInput)(nil)).Elem(), ConnectorCertificatesMap{})
	pulumi.RegisterOutputType(ConnectorCertificatesOutput{})
	pulumi.RegisterOutputType(ConnectorCertificatesArrayOutput{})
	pulumi.RegisterOutputType(ConnectorCertificatesMapOutput{})
}
