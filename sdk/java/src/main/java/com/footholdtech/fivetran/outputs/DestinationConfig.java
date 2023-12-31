// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DestinationConfig {
    /**
     * @return The connector authorization settings. Check possible config formats in [create method](https://www.terraform.io/openapi/reference/v1/operation/create_connector/)
     * 
     */
    private @Nullable String auth;
    /**
     * @return Authentication type. Default value: `PASSWORD`.
     * 
     */
    private @Nullable String authType;
    /**
     * @return Customer bucket. If specified, your GCS bucket will be used to process the data instead of a Fivetran-managed bucket. The bucket must be present in the same location as the dataset location.
     * 
     */
    private @Nullable String bucket;
    /**
     * @return Catalog name
     * 
     */
    private @Nullable String catalog;
    /**
     * @return ClientId of your Azure Data Lake Storage
     * 
     */
    private @Nullable String clientId;
    /**
     * @return Cluster ID. Must be populated if `connection_type` is set to `SshTunnel` and `auth_type` is set to `IAM`.
     * 
     */
    private @Nullable String clusterId;
    /**
     * @return Cluster region. Must be populated if `connection_type` is set to `SshTunnel` and `auth_type` is set to `IAM`.
     * 
     */
    private @Nullable String clusterRegion;
    /**
     * @return Connection method. Default value: `Directly`.
     * 
     */
    private @Nullable String connectionType;
    /**
     * @return Container Name of your Azure Data Lake Storage
     * 
     */
    private @Nullable String containerName;
    /**
     * @return Whether to create external tables
     * 
     */
    private @Nullable String createExternalTables;
    /**
     * @return Data location. Datasets will reside in this location.
     * 
     */
    private @Nullable String dataSetLocation;
    /**
     * @return Database name
     * 
     */
    private @Nullable String database;
    /**
     * @return External location to store Delta tables. Default value: `&#34;&#34;`  (null). By default, the external tables will reside in the `/{schema}/{table}` path, and if you specify an external location in the `{externalLocation}/{schema}/{table}` path.
     * 
     */
    private @Nullable String externalLocation;
    /**
     * @return ARN of the role which you created with different required policy mentioned in our setup guide
     * 
     */
    private @Nullable String fivetranRoleArn;
    /**
     * @return Server name
     * 
     */
    private @Nullable String host;
    /**
     * @return HTTP path
     * 
     */
    private @Nullable String httpPath;
    /**
     * @return Indicates that a private key is encrypted. The default value: `false`. The field can be specified if authentication type is `KEY_PAIR`.
     * 
     */
    private @Nullable String isPrivateKeyEncrypted;
    /**
     * @return OneLake lakehouse name
     * 
     */
    private @Nullable String lakehouseName;
    /**
     * @return In case private key is encrypted, you are required to enter passphrase that was used to encrypt the private key. The field can be specified if authentication type is `KEY_PAIR`.
     * 
     */
    private @Nullable String passphrase;
    /**
     * @return Database user password
     * 
     */
    private @Nullable String password;
    /**
     * @return Personal access token
     * 
     */
    private @Nullable String personalAccessToken;
    /**
     * @return Server port number
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Prefix path of the bucket for which you have configured access policy. It is not required if access has been granted to entire Bucket in the access policy
     * 
     */
    private @Nullable String prefixPath;
    /**
     * @return Private access key.  The field should be specified if authentication type is `KEY_PAIR`.
     * 
     */
    private @Nullable String privateKey;
    /**
     * @return BigQuery project ID
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Public key to grant Fivetran SSH access to git repository.
     * 
     */
    private @Nullable String publicKey;
    /**
     * @return Region of your AWS S3 bucket
     * 
     */
    private @Nullable String region;
    /**
     * @return The group role that you would like to assign this new user to. Supported group roles: ‘Destination Administrator‘, ‘Destination Reviewer‘, ‘Destination Analyst‘, ‘Connector Creator‘, or a custom destination role
     * 
     */
    private @Nullable String role;
    /**
     * @return Role ARN with Redshift permissions. Required if authentication type is `IAM`.
     * 
     */
    private @Nullable String roleArn;
    /**
     * @return Private key of the customer service account. If specified, your service account will be used to process the data instead of the Fivetran-managed service account.
     * 
     */
    private @Nullable String secretKey;
    /**
     * @return Secret Value of your Azure Data Lake Storage
     * 
     */
    private @Nullable String secretValue;
    /**
     * @return Server name
     * 
     */
    private @Nullable String serverHostName;
    /**
     * @return Storage Account Name of your Azure Data Lake Storage
     * 
     */
    private @Nullable String storageAccountName;
    /**
     * @return TenantId of your Azure Data Lake Storage
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return SSH server name. Must be populated if `connection_type` is set to `SshTunnel`.
     * 
     */
    private @Nullable String tunnelHost;
    /**
     * @return SSH server port name. Must be populated if `connection_type` is set to `SshTunnel`.
     * 
     */
    private @Nullable String tunnelPort;
    /**
     * @return SSH user name. Must be populated if `connection_type` is set to `SshTunnel`.
     * 
     */
    private @Nullable String tunnelUser;
    /**
     * @return Database user name
     * 
     */
    private @Nullable String user;
    /**
     * @return OneLake workspace name
     * 
     */
    private @Nullable String workspaceName;

    private DestinationConfig() {}
    /**
     * @return The connector authorization settings. Check possible config formats in [create method](https://www.terraform.io/openapi/reference/v1/operation/create_connector/)
     * 
     */
    public Optional<String> auth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * @return Authentication type. Default value: `PASSWORD`.
     * 
     */
    public Optional<String> authType() {
        return Optional.ofNullable(this.authType);
    }
    /**
     * @return Customer bucket. If specified, your GCS bucket will be used to process the data instead of a Fivetran-managed bucket. The bucket must be present in the same location as the dataset location.
     * 
     */
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * @return Catalog name
     * 
     */
    public Optional<String> catalog() {
        return Optional.ofNullable(this.catalog);
    }
    /**
     * @return ClientId of your Azure Data Lake Storage
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return Cluster ID. Must be populated if `connection_type` is set to `SshTunnel` and `auth_type` is set to `IAM`.
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return Cluster region. Must be populated if `connection_type` is set to `SshTunnel` and `auth_type` is set to `IAM`.
     * 
     */
    public Optional<String> clusterRegion() {
        return Optional.ofNullable(this.clusterRegion);
    }
    /**
     * @return Connection method. Default value: `Directly`.
     * 
     */
    public Optional<String> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }
    /**
     * @return Container Name of your Azure Data Lake Storage
     * 
     */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * @return Whether to create external tables
     * 
     */
    public Optional<String> createExternalTables() {
        return Optional.ofNullable(this.createExternalTables);
    }
    /**
     * @return Data location. Datasets will reside in this location.
     * 
     */
    public Optional<String> dataSetLocation() {
        return Optional.ofNullable(this.dataSetLocation);
    }
    /**
     * @return Database name
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    /**
     * @return External location to store Delta tables. Default value: `&#34;&#34;`  (null). By default, the external tables will reside in the `/{schema}/{table}` path, and if you specify an external location in the `{externalLocation}/{schema}/{table}` path.
     * 
     */
    public Optional<String> externalLocation() {
        return Optional.ofNullable(this.externalLocation);
    }
    /**
     * @return ARN of the role which you created with different required policy mentioned in our setup guide
     * 
     */
    public Optional<String> fivetranRoleArn() {
        return Optional.ofNullable(this.fivetranRoleArn);
    }
    /**
     * @return Server name
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return HTTP path
     * 
     */
    public Optional<String> httpPath() {
        return Optional.ofNullable(this.httpPath);
    }
    /**
     * @return Indicates that a private key is encrypted. The default value: `false`. The field can be specified if authentication type is `KEY_PAIR`.
     * 
     */
    public Optional<String> isPrivateKeyEncrypted() {
        return Optional.ofNullable(this.isPrivateKeyEncrypted);
    }
    /**
     * @return OneLake lakehouse name
     * 
     */
    public Optional<String> lakehouseName() {
        return Optional.ofNullable(this.lakehouseName);
    }
    /**
     * @return In case private key is encrypted, you are required to enter passphrase that was used to encrypt the private key. The field can be specified if authentication type is `KEY_PAIR`.
     * 
     */
    public Optional<String> passphrase() {
        return Optional.ofNullable(this.passphrase);
    }
    /**
     * @return Database user password
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Personal access token
     * 
     */
    public Optional<String> personalAccessToken() {
        return Optional.ofNullable(this.personalAccessToken);
    }
    /**
     * @return Server port number
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Prefix path of the bucket for which you have configured access policy. It is not required if access has been granted to entire Bucket in the access policy
     * 
     */
    public Optional<String> prefixPath() {
        return Optional.ofNullable(this.prefixPath);
    }
    /**
     * @return Private access key.  The field should be specified if authentication type is `KEY_PAIR`.
     * 
     */
    public Optional<String> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }
    /**
     * @return BigQuery project ID
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Public key to grant Fivetran SSH access to git repository.
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * @return Region of your AWS S3 bucket
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The group role that you would like to assign this new user to. Supported group roles: ‘Destination Administrator‘, ‘Destination Reviewer‘, ‘Destination Analyst‘, ‘Connector Creator‘, or a custom destination role
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * @return Role ARN with Redshift permissions. Required if authentication type is `IAM`.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return Private key of the customer service account. If specified, your service account will be used to process the data instead of the Fivetran-managed service account.
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return Secret Value of your Azure Data Lake Storage
     * 
     */
    public Optional<String> secretValue() {
        return Optional.ofNullable(this.secretValue);
    }
    /**
     * @return Server name
     * 
     */
    public Optional<String> serverHostName() {
        return Optional.ofNullable(this.serverHostName);
    }
    /**
     * @return Storage Account Name of your Azure Data Lake Storage
     * 
     */
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }
    /**
     * @return TenantId of your Azure Data Lake Storage
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return SSH server name. Must be populated if `connection_type` is set to `SshTunnel`.
     * 
     */
    public Optional<String> tunnelHost() {
        return Optional.ofNullable(this.tunnelHost);
    }
    /**
     * @return SSH server port name. Must be populated if `connection_type` is set to `SshTunnel`.
     * 
     */
    public Optional<String> tunnelPort() {
        return Optional.ofNullable(this.tunnelPort);
    }
    /**
     * @return SSH user name. Must be populated if `connection_type` is set to `SshTunnel`.
     * 
     */
    public Optional<String> tunnelUser() {
        return Optional.ofNullable(this.tunnelUser);
    }
    /**
     * @return Database user name
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }
    /**
     * @return OneLake workspace name
     * 
     */
    public Optional<String> workspaceName() {
        return Optional.ofNullable(this.workspaceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String auth;
        private @Nullable String authType;
        private @Nullable String bucket;
        private @Nullable String catalog;
        private @Nullable String clientId;
        private @Nullable String clusterId;
        private @Nullable String clusterRegion;
        private @Nullable String connectionType;
        private @Nullable String containerName;
        private @Nullable String createExternalTables;
        private @Nullable String dataSetLocation;
        private @Nullable String database;
        private @Nullable String externalLocation;
        private @Nullable String fivetranRoleArn;
        private @Nullable String host;
        private @Nullable String httpPath;
        private @Nullable String isPrivateKeyEncrypted;
        private @Nullable String lakehouseName;
        private @Nullable String passphrase;
        private @Nullable String password;
        private @Nullable String personalAccessToken;
        private @Nullable Integer port;
        private @Nullable String prefixPath;
        private @Nullable String privateKey;
        private @Nullable String projectId;
        private @Nullable String publicKey;
        private @Nullable String region;
        private @Nullable String role;
        private @Nullable String roleArn;
        private @Nullable String secretKey;
        private @Nullable String secretValue;
        private @Nullable String serverHostName;
        private @Nullable String storageAccountName;
        private @Nullable String tenantId;
        private @Nullable String tunnelHost;
        private @Nullable String tunnelPort;
        private @Nullable String tunnelUser;
        private @Nullable String user;
        private @Nullable String workspaceName;
        public Builder() {}
        public Builder(DestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.authType = defaults.authType;
    	      this.bucket = defaults.bucket;
    	      this.catalog = defaults.catalog;
    	      this.clientId = defaults.clientId;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterRegion = defaults.clusterRegion;
    	      this.connectionType = defaults.connectionType;
    	      this.containerName = defaults.containerName;
    	      this.createExternalTables = defaults.createExternalTables;
    	      this.dataSetLocation = defaults.dataSetLocation;
    	      this.database = defaults.database;
    	      this.externalLocation = defaults.externalLocation;
    	      this.fivetranRoleArn = defaults.fivetranRoleArn;
    	      this.host = defaults.host;
    	      this.httpPath = defaults.httpPath;
    	      this.isPrivateKeyEncrypted = defaults.isPrivateKeyEncrypted;
    	      this.lakehouseName = defaults.lakehouseName;
    	      this.passphrase = defaults.passphrase;
    	      this.password = defaults.password;
    	      this.personalAccessToken = defaults.personalAccessToken;
    	      this.port = defaults.port;
    	      this.prefixPath = defaults.prefixPath;
    	      this.privateKey = defaults.privateKey;
    	      this.projectId = defaults.projectId;
    	      this.publicKey = defaults.publicKey;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.roleArn = defaults.roleArn;
    	      this.secretKey = defaults.secretKey;
    	      this.secretValue = defaults.secretValue;
    	      this.serverHostName = defaults.serverHostName;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.tenantId = defaults.tenantId;
    	      this.tunnelHost = defaults.tunnelHost;
    	      this.tunnelPort = defaults.tunnelPort;
    	      this.tunnelUser = defaults.tunnelUser;
    	      this.user = defaults.user;
    	      this.workspaceName = defaults.workspaceName;
        }

        @CustomType.Setter
        public Builder auth(@Nullable String auth) {
            this.auth = auth;
            return this;
        }
        @CustomType.Setter
        public Builder authType(@Nullable String authType) {
            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder catalog(@Nullable String catalog) {
            this.catalog = catalog;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterRegion(@Nullable String clusterRegion) {
            this.clusterRegion = clusterRegion;
            return this;
        }
        @CustomType.Setter
        public Builder connectionType(@Nullable String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        @CustomType.Setter
        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        @CustomType.Setter
        public Builder createExternalTables(@Nullable String createExternalTables) {
            this.createExternalTables = createExternalTables;
            return this;
        }
        @CustomType.Setter
        public Builder dataSetLocation(@Nullable String dataSetLocation) {
            this.dataSetLocation = dataSetLocation;
            return this;
        }
        @CustomType.Setter
        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder externalLocation(@Nullable String externalLocation) {
            this.externalLocation = externalLocation;
            return this;
        }
        @CustomType.Setter
        public Builder fivetranRoleArn(@Nullable String fivetranRoleArn) {
            this.fivetranRoleArn = fivetranRoleArn;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder httpPath(@Nullable String httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        @CustomType.Setter
        public Builder isPrivateKeyEncrypted(@Nullable String isPrivateKeyEncrypted) {
            this.isPrivateKeyEncrypted = isPrivateKeyEncrypted;
            return this;
        }
        @CustomType.Setter
        public Builder lakehouseName(@Nullable String lakehouseName) {
            this.lakehouseName = lakehouseName;
            return this;
        }
        @CustomType.Setter
        public Builder passphrase(@Nullable String passphrase) {
            this.passphrase = passphrase;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder personalAccessToken(@Nullable String personalAccessToken) {
            this.personalAccessToken = personalAccessToken;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder prefixPath(@Nullable String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder secretValue(@Nullable String secretValue) {
            this.secretValue = secretValue;
            return this;
        }
        @CustomType.Setter
        public Builder serverHostName(@Nullable String serverHostName) {
            this.serverHostName = serverHostName;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelHost(@Nullable String tunnelHost) {
            this.tunnelHost = tunnelHost;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelPort(@Nullable String tunnelPort) {
            this.tunnelPort = tunnelPort;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelUser(@Nullable String tunnelUser) {
            this.tunnelUser = tunnelUser;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }
        @CustomType.Setter
        public Builder workspaceName(@Nullable String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public DestinationConfig build() {
            final var o = new DestinationConfig();
            o.auth = auth;
            o.authType = authType;
            o.bucket = bucket;
            o.catalog = catalog;
            o.clientId = clientId;
            o.clusterId = clusterId;
            o.clusterRegion = clusterRegion;
            o.connectionType = connectionType;
            o.containerName = containerName;
            o.createExternalTables = createExternalTables;
            o.dataSetLocation = dataSetLocation;
            o.database = database;
            o.externalLocation = externalLocation;
            o.fivetranRoleArn = fivetranRoleArn;
            o.host = host;
            o.httpPath = httpPath;
            o.isPrivateKeyEncrypted = isPrivateKeyEncrypted;
            o.lakehouseName = lakehouseName;
            o.passphrase = passphrase;
            o.password = password;
            o.personalAccessToken = personalAccessToken;
            o.port = port;
            o.prefixPath = prefixPath;
            o.privateKey = privateKey;
            o.projectId = projectId;
            o.publicKey = publicKey;
            o.region = region;
            o.role = role;
            o.roleArn = roleArn;
            o.secretKey = secretKey;
            o.secretValue = secretValue;
            o.serverHostName = serverHostName;
            o.storageAccountName = storageAccountName;
            o.tenantId = tenantId;
            o.tunnelHost = tunnelHost;
            o.tunnelPort = tunnelPort;
            o.tunnelUser = tunnelUser;
            o.user = user;
            o.workspaceName = workspaceName;
            return o;
        }
    }
}
