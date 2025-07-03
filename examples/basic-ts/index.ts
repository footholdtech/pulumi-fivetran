import * as pulumi from "@pulumi/pulumi";
import * as fivetran from "@pulumi/fivetran";

const resource = new fivetran.Resource("Resource", { sampleAttribute: "attr" });

export const sampleAttribute = resource.sampleAttribute;
