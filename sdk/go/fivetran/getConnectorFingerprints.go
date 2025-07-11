// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fivetran

import (
	"context"
	"reflect"

	"github.com/footholdtech/pulumi-fivetran/sdk/go/fivetran/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source returns a list of SSH fingerprints approved for specified connector.
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
//			_, err := fivetran.LookupConnectorFingerprints(ctx, &fivetran.LookupConnectorFingerprintsArgs{
//				Id: "connector_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupConnectorFingerprints(ctx *pulumi.Context, args *LookupConnectorFingerprintsArgs, opts ...pulumi.InvokeOption) (*LookupConnectorFingerprintsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectorFingerprintsResult
	err := ctx.Invoke("fivetran:index/getConnectorFingerprints:getConnectorFingerprints", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectorFingerprints.
type LookupConnectorFingerprintsArgs struct {
	Fingerprints []GetConnectorFingerprintsFingerprint `pulumi:"fingerprints"`
	// The unique identifier for the resource. Equal to target connection id.
	Id string `pulumi:"id"`
}

// A collection of values returned by getConnectorFingerprints.
type LookupConnectorFingerprintsResult struct {
	// The unique identifier for the target connection within the Fivetran system.
	ConnectorId  string                                `pulumi:"connectorId"`
	Fingerprints []GetConnectorFingerprintsFingerprint `pulumi:"fingerprints"`
	// The unique identifier for the resource. Equal to target connection id.
	Id string `pulumi:"id"`
}

func LookupConnectorFingerprintsOutput(ctx *pulumi.Context, args LookupConnectorFingerprintsOutputArgs, opts ...pulumi.InvokeOption) LookupConnectorFingerprintsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConnectorFingerprintsResultOutput, error) {
			args := v.(LookupConnectorFingerprintsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("fivetran:index/getConnectorFingerprints:getConnectorFingerprints", args, LookupConnectorFingerprintsResultOutput{}, options).(LookupConnectorFingerprintsResultOutput), nil
		}).(LookupConnectorFingerprintsResultOutput)
}

// A collection of arguments for invoking getConnectorFingerprints.
type LookupConnectorFingerprintsOutputArgs struct {
	Fingerprints GetConnectorFingerprintsFingerprintArrayInput `pulumi:"fingerprints"`
	// The unique identifier for the resource. Equal to target connection id.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupConnectorFingerprintsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorFingerprintsArgs)(nil)).Elem()
}

// A collection of values returned by getConnectorFingerprints.
type LookupConnectorFingerprintsResultOutput struct{ *pulumi.OutputState }

func (LookupConnectorFingerprintsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorFingerprintsResult)(nil)).Elem()
}

func (o LookupConnectorFingerprintsResultOutput) ToLookupConnectorFingerprintsResultOutput() LookupConnectorFingerprintsResultOutput {
	return o
}

func (o LookupConnectorFingerprintsResultOutput) ToLookupConnectorFingerprintsResultOutputWithContext(ctx context.Context) LookupConnectorFingerprintsResultOutput {
	return o
}

// The unique identifier for the target connection within the Fivetran system.
func (o LookupConnectorFingerprintsResultOutput) ConnectorId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorFingerprintsResult) string { return v.ConnectorId }).(pulumi.StringOutput)
}

func (o LookupConnectorFingerprintsResultOutput) Fingerprints() GetConnectorFingerprintsFingerprintArrayOutput {
	return o.ApplyT(func(v LookupConnectorFingerprintsResult) []GetConnectorFingerprintsFingerprint { return v.Fingerprints }).(GetConnectorFingerprintsFingerprintArrayOutput)
}

// The unique identifier for the resource. Equal to target connection id.
func (o LookupConnectorFingerprintsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorFingerprintsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectorFingerprintsResultOutput{})
}
