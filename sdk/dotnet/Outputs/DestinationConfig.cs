// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran.Outputs
{

    [OutputType]
    public sealed class DestinationConfig
    {
        /// <summary>
        /// The connector authorization settings. Check possible config formats in [create method](https://www.terraform.io/openapi/reference/v1/operation/create_connector/)
        /// </summary>
        public readonly string? Auth;
        /// <summary>
        /// Authentication type. Default value: `PASSWORD`.
        /// </summary>
        public readonly string? AuthType;
        /// <summary>
        /// Customer bucket. If specified, your GCS bucket will be used to process the data instead of a Fivetran-managed bucket. The bucket must be present in the same location as the dataset location.
        /// </summary>
        public readonly string? Bucket;
        /// <summary>
        /// Catalog name
        /// </summary>
        public readonly string? Catalog;
        /// <summary>
        /// ClientId of your Azure Data Lake Storage
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// Cluster ID. Must be populated if `connection_type` is set to `SshTunnel` and `auth_type` is set to `IAM`.
        /// </summary>
        public readonly string? ClusterId;
        /// <summary>
        /// Cluster region. Must be populated if `connection_type` is set to `SshTunnel` and `auth_type` is set to `IAM`.
        /// </summary>
        public readonly string? ClusterRegion;
        /// <summary>
        /// Connection method. Default value: `Directly`.
        /// </summary>
        public readonly string? ConnectionType;
        /// <summary>
        /// Container Name of your Azure Data Lake Storage
        /// </summary>
        public readonly string? ContainerName;
        /// <summary>
        /// Whether to create external tables
        /// </summary>
        public readonly string? CreateExternalTables;
        /// <summary>
        /// Data location. Datasets will reside in this location.
        /// </summary>
        public readonly string? DataSetLocation;
        /// <summary>
        /// Database name
        /// </summary>
        public readonly string? Database;
        /// <summary>
        /// External location to store Delta tables. Default value: `""`  (null). By default, the external tables will reside in the `/{schema}/{table}` path, and if you specify an external location in the `{externalLocation}/{schema}/{table}` path.
        /// </summary>
        public readonly string? ExternalLocation;
        /// <summary>
        /// ARN of the role which you created with different required policy mentioned in our setup guide
        /// </summary>
        public readonly string? FivetranRoleArn;
        /// <summary>
        /// Server name
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// HTTP path
        /// </summary>
        public readonly string? HttpPath;
        /// <summary>
        /// Indicates that a private key is encrypted. The default value: `false`. The field can be specified if authentication type is `KEY_PAIR`.
        /// </summary>
        public readonly string? IsPrivateKeyEncrypted;
        /// <summary>
        /// OneLake lakehouse name
        /// </summary>
        public readonly string? LakehouseName;
        /// <summary>
        /// In case private key is encrypted, you are required to enter passphrase that was used to encrypt the private key. The field can be specified if authentication type is `KEY_PAIR`.
        /// </summary>
        public readonly string? Passphrase;
        /// <summary>
        /// Database user password
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Personal access token
        /// </summary>
        public readonly string? PersonalAccessToken;
        /// <summary>
        /// Server port number
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// Prefix path of the bucket for which you have configured access policy. It is not required if access has been granted to entire Bucket in the access policy
        /// </summary>
        public readonly string? PrefixPath;
        /// <summary>
        /// Private access key.  The field should be specified if authentication type is `KEY_PAIR`.
        /// </summary>
        public readonly string? PrivateKey;
        /// <summary>
        /// BigQuery project ID
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Public key to grant Fivetran SSH access to git repository.
        /// </summary>
        public readonly string? PublicKey;
        /// <summary>
        /// Region of your AWS S3 bucket
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// The group role that you would like to assign this new user to. Supported group roles: ‘Destination Administrator‘, ‘Destination Reviewer‘, ‘Destination Analyst‘, ‘Connector Creator‘, or a custom destination role
        /// </summary>
        public readonly string? Role;
        /// <summary>
        /// Role ARN with Redshift permissions. Required if authentication type is `IAM`.
        /// </summary>
        public readonly string? RoleArn;
        /// <summary>
        /// Private key of the customer service account. If specified, your service account will be used to process the data instead of the Fivetran-managed service account.
        /// </summary>
        public readonly string? SecretKey;
        /// <summary>
        /// Secret Value of your Azure Data Lake Storage
        /// </summary>
        public readonly string? SecretValue;
        /// <summary>
        /// Server name
        /// </summary>
        public readonly string? ServerHostName;
        /// <summary>
        /// Storage Account Name of your Azure Data Lake Storage
        /// </summary>
        public readonly string? StorageAccountName;
        /// <summary>
        /// TenantId of your Azure Data Lake Storage
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// SSH server name. Must be populated if `connection_type` is set to `SshTunnel`.
        /// </summary>
        public readonly string? TunnelHost;
        /// <summary>
        /// SSH server port name. Must be populated if `connection_type` is set to `SshTunnel`.
        /// </summary>
        public readonly string? TunnelPort;
        /// <summary>
        /// SSH user name. Must be populated if `connection_type` is set to `SshTunnel`.
        /// </summary>
        public readonly string? TunnelUser;
        /// <summary>
        /// Database user name
        /// </summary>
        public readonly string? User;
        /// <summary>
        /// OneLake workspace name
        /// </summary>
        public readonly string? WorkspaceName;

        [OutputConstructor]
        private DestinationConfig(
            string? auth,

            string? authType,

            string? bucket,

            string? catalog,

            string? clientId,

            string? clusterId,

            string? clusterRegion,

            string? connectionType,

            string? containerName,

            string? createExternalTables,

            string? dataSetLocation,

            string? database,

            string? externalLocation,

            string? fivetranRoleArn,

            string? host,

            string? httpPath,

            string? isPrivateKeyEncrypted,

            string? lakehouseName,

            string? passphrase,

            string? password,

            string? personalAccessToken,

            int? port,

            string? prefixPath,

            string? privateKey,

            string? projectId,

            string? publicKey,

            string? region,

            string? role,

            string? roleArn,

            string? secretKey,

            string? secretValue,

            string? serverHostName,

            string? storageAccountName,

            string? tenantId,

            string? tunnelHost,

            string? tunnelPort,

            string? tunnelUser,

            string? user,

            string? workspaceName)
        {
            Auth = auth;
            AuthType = authType;
            Bucket = bucket;
            Catalog = catalog;
            ClientId = clientId;
            ClusterId = clusterId;
            ClusterRegion = clusterRegion;
            ConnectionType = connectionType;
            ContainerName = containerName;
            CreateExternalTables = createExternalTables;
            DataSetLocation = dataSetLocation;
            Database = database;
            ExternalLocation = externalLocation;
            FivetranRoleArn = fivetranRoleArn;
            Host = host;
            HttpPath = httpPath;
            IsPrivateKeyEncrypted = isPrivateKeyEncrypted;
            LakehouseName = lakehouseName;
            Passphrase = passphrase;
            Password = password;
            PersonalAccessToken = personalAccessToken;
            Port = port;
            PrefixPath = prefixPath;
            PrivateKey = privateKey;
            ProjectId = projectId;
            PublicKey = publicKey;
            Region = region;
            Role = role;
            RoleArn = roleArn;
            SecretKey = secretKey;
            SecretValue = secretValue;
            ServerHostName = serverHostName;
            StorageAccountName = storageAccountName;
            TenantId = tenantId;
            TunnelHost = tunnelHost;
            TunnelPort = tunnelPort;
            TunnelUser = tunnelUser;
            User = user;
            WorkspaceName = workspaceName;
        }
    }
}
