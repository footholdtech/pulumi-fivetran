// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.footholdtech.fivetran.inputs;

import com.footholdtech.fivetran.inputs.DbtProjectModelArgs;
import com.footholdtech.fivetran.inputs.DbtProjectProjectConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DbtProjectState extends com.pulumi.resources.ResourceArgs {

    public static final DbtProjectState Empty = new DbtProjectState();

    /**
     * The timestamp of the dbt Project creation.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The timestamp of the dbt Project creation.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The unique identifier for the User within the Fivetran system who created the dbt Project.
     * 
     */
    @Import(name="createdById")
    private @Nullable Output<String> createdById;

    /**
     * @return The unique identifier for the User within the Fivetran system who created the dbt Project.
     * 
     */
    public Optional<Output<String>> createdById() {
        return Optional.ofNullable(this.createdById);
    }

    /**
     * The version of dbt that should run the project. We support the following versions: 0.18.0 - 0.18.2, 0.19.0 - 0.19.2, 0.20.0 - 0.20.2, 0.21.0 - 0.21.1, 1.0.0, 1.0.1, 1.0.3 - 1.0.9, 1.1.0 - 1.1.3, 1.2.0 - 1.2.4, 1.3.0 - 1.3.2, 1.4.1.
     * 
     */
    @Import(name="dbtVersion")
    private @Nullable Output<String> dbtVersion;

    /**
     * @return The version of dbt that should run the project. We support the following versions: 0.18.0 - 0.18.2, 0.19.0 - 0.19.2, 0.20.0 - 0.20.2, 0.21.0 - 0.21.1, 1.0.0, 1.0.1, 1.0.3 - 1.0.9, 1.1.0 - 1.1.3, 1.2.0 - 1.2.4, 1.3.0 - 1.3.2, 1.4.1.
     * 
     */
    public Optional<Output<String>> dbtVersion() {
        return Optional.ofNullable(this.dbtVersion);
    }

    /**
     * Default schema in destination. This production schema will contain your transformed data.
     * 
     */
    @Import(name="defaultSchema")
    private @Nullable Output<String> defaultSchema;

    /**
     * @return Default schema in destination. This production schema will contain your transformed data.
     * 
     */
    public Optional<Output<String>> defaultSchema() {
        return Optional.ofNullable(this.defaultSchema);
    }

    /**
     * Should resource wait for project to finish initialization. Default value: true.
     * 
     */
    @Import(name="ensureReadiness")
    private @Nullable Output<Boolean> ensureReadiness;

    /**
     * @return Should resource wait for project to finish initialization. Default value: true.
     * 
     */
    public Optional<Output<Boolean>> ensureReadiness() {
        return Optional.ofNullable(this.ensureReadiness);
    }

    @Import(name="environmentVars")
    private @Nullable Output<List<String>> environmentVars;

    public Optional<Output<List<String>>> environmentVars() {
        return Optional.ofNullable(this.environmentVars);
    }

    /**
     * The unique identifier for the group within the Fivetran system.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The unique identifier for the group within the Fivetran system.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The collection of dbt Models.
     * 
     */
    @Import(name="models")
    private @Nullable Output<List<DbtProjectModelArgs>> models;

    /**
     * @return The collection of dbt Models.
     * 
     */
    public Optional<Output<List<DbtProjectModelArgs>>> models() {
        return Optional.ofNullable(this.models);
    }

    /**
     * Type specific dbt Project configuration parameters.
     * 
     */
    @Import(name="projectConfig")
    private @Nullable Output<DbtProjectProjectConfigArgs> projectConfig;

    /**
     * @return Type specific dbt Project configuration parameters.
     * 
     */
    public Optional<Output<DbtProjectProjectConfigArgs>> projectConfig() {
        return Optional.ofNullable(this.projectConfig);
    }

    /**
     * Public key to grant Fivetran SSH access to git repository.
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return Public key to grant Fivetran SSH access to git repository.
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * Status of dbt Project (NOT_READY, READY, ERROR).
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of dbt Project (NOT_READY, READY, ERROR).
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Target name to set or override the value from the deployment.yaml
     * 
     */
    @Import(name="targetName")
    private @Nullable Output<String> targetName;

    /**
     * @return Target name to set or override the value from the deployment.yaml
     * 
     */
    public Optional<Output<String>> targetName() {
        return Optional.ofNullable(this.targetName);
    }

    /**
     * The number of threads dbt will use (from 1 to 32). Make sure this value is compatible with your destination type. For example, Snowflake supports only 8 concurrent queries on an X-Small warehouse.
     * 
     */
    @Import(name="threads")
    private @Nullable Output<Integer> threads;

    /**
     * @return The number of threads dbt will use (from 1 to 32). Make sure this value is compatible with your destination type. For example, Snowflake supports only 8 concurrent queries on an X-Small warehouse.
     * 
     */
    public Optional<Output<Integer>> threads() {
        return Optional.ofNullable(this.threads);
    }

    /**
     * Type of dbt Project. Currently only `GIT` supported. Empty value will be considered as default (GIT).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of dbt Project. Currently only `GIT` supported. Empty value will be considered as default (GIT).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DbtProjectState() {}

    private DbtProjectState(DbtProjectState $) {
        this.createdAt = $.createdAt;
        this.createdById = $.createdById;
        this.dbtVersion = $.dbtVersion;
        this.defaultSchema = $.defaultSchema;
        this.ensureReadiness = $.ensureReadiness;
        this.environmentVars = $.environmentVars;
        this.groupId = $.groupId;
        this.models = $.models;
        this.projectConfig = $.projectConfig;
        this.publicKey = $.publicKey;
        this.status = $.status;
        this.targetName = $.targetName;
        this.threads = $.threads;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbtProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbtProjectState $;

        public Builder() {
            $ = new DbtProjectState();
        }

        public Builder(DbtProjectState defaults) {
            $ = new DbtProjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The timestamp of the dbt Project creation.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The timestamp of the dbt Project creation.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdById The unique identifier for the User within the Fivetran system who created the dbt Project.
         * 
         * @return builder
         * 
         */
        public Builder createdById(@Nullable Output<String> createdById) {
            $.createdById = createdById;
            return this;
        }

        /**
         * @param createdById The unique identifier for the User within the Fivetran system who created the dbt Project.
         * 
         * @return builder
         * 
         */
        public Builder createdById(String createdById) {
            return createdById(Output.of(createdById));
        }

        /**
         * @param dbtVersion The version of dbt that should run the project. We support the following versions: 0.18.0 - 0.18.2, 0.19.0 - 0.19.2, 0.20.0 - 0.20.2, 0.21.0 - 0.21.1, 1.0.0, 1.0.1, 1.0.3 - 1.0.9, 1.1.0 - 1.1.3, 1.2.0 - 1.2.4, 1.3.0 - 1.3.2, 1.4.1.
         * 
         * @return builder
         * 
         */
        public Builder dbtVersion(@Nullable Output<String> dbtVersion) {
            $.dbtVersion = dbtVersion;
            return this;
        }

        /**
         * @param dbtVersion The version of dbt that should run the project. We support the following versions: 0.18.0 - 0.18.2, 0.19.0 - 0.19.2, 0.20.0 - 0.20.2, 0.21.0 - 0.21.1, 1.0.0, 1.0.1, 1.0.3 - 1.0.9, 1.1.0 - 1.1.3, 1.2.0 - 1.2.4, 1.3.0 - 1.3.2, 1.4.1.
         * 
         * @return builder
         * 
         */
        public Builder dbtVersion(String dbtVersion) {
            return dbtVersion(Output.of(dbtVersion));
        }

        /**
         * @param defaultSchema Default schema in destination. This production schema will contain your transformed data.
         * 
         * @return builder
         * 
         */
        public Builder defaultSchema(@Nullable Output<String> defaultSchema) {
            $.defaultSchema = defaultSchema;
            return this;
        }

        /**
         * @param defaultSchema Default schema in destination. This production schema will contain your transformed data.
         * 
         * @return builder
         * 
         */
        public Builder defaultSchema(String defaultSchema) {
            return defaultSchema(Output.of(defaultSchema));
        }

        /**
         * @param ensureReadiness Should resource wait for project to finish initialization. Default value: true.
         * 
         * @return builder
         * 
         */
        public Builder ensureReadiness(@Nullable Output<Boolean> ensureReadiness) {
            $.ensureReadiness = ensureReadiness;
            return this;
        }

        /**
         * @param ensureReadiness Should resource wait for project to finish initialization. Default value: true.
         * 
         * @return builder
         * 
         */
        public Builder ensureReadiness(Boolean ensureReadiness) {
            return ensureReadiness(Output.of(ensureReadiness));
        }

        public Builder environmentVars(@Nullable Output<List<String>> environmentVars) {
            $.environmentVars = environmentVars;
            return this;
        }

        public Builder environmentVars(List<String> environmentVars) {
            return environmentVars(Output.of(environmentVars));
        }

        public Builder environmentVars(String... environmentVars) {
            return environmentVars(List.of(environmentVars));
        }

        /**
         * @param groupId The unique identifier for the group within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The unique identifier for the group within the Fivetran system.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param models The collection of dbt Models.
         * 
         * @return builder
         * 
         */
        public Builder models(@Nullable Output<List<DbtProjectModelArgs>> models) {
            $.models = models;
            return this;
        }

        /**
         * @param models The collection of dbt Models.
         * 
         * @return builder
         * 
         */
        public Builder models(List<DbtProjectModelArgs> models) {
            return models(Output.of(models));
        }

        /**
         * @param models The collection of dbt Models.
         * 
         * @return builder
         * 
         */
        public Builder models(DbtProjectModelArgs... models) {
            return models(List.of(models));
        }

        /**
         * @param projectConfig Type specific dbt Project configuration parameters.
         * 
         * @return builder
         * 
         */
        public Builder projectConfig(@Nullable Output<DbtProjectProjectConfigArgs> projectConfig) {
            $.projectConfig = projectConfig;
            return this;
        }

        /**
         * @param projectConfig Type specific dbt Project configuration parameters.
         * 
         * @return builder
         * 
         */
        public Builder projectConfig(DbtProjectProjectConfigArgs projectConfig) {
            return projectConfig(Output.of(projectConfig));
        }

        /**
         * @param publicKey Public key to grant Fivetran SSH access to git repository.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey Public key to grant Fivetran SSH access to git repository.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param status Status of dbt Project (NOT_READY, READY, ERROR).
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of dbt Project (NOT_READY, READY, ERROR).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param targetName Target name to set or override the value from the deployment.yaml
         * 
         * @return builder
         * 
         */
        public Builder targetName(@Nullable Output<String> targetName) {
            $.targetName = targetName;
            return this;
        }

        /**
         * @param targetName Target name to set or override the value from the deployment.yaml
         * 
         * @return builder
         * 
         */
        public Builder targetName(String targetName) {
            return targetName(Output.of(targetName));
        }

        /**
         * @param threads The number of threads dbt will use (from 1 to 32). Make sure this value is compatible with your destination type. For example, Snowflake supports only 8 concurrent queries on an X-Small warehouse.
         * 
         * @return builder
         * 
         */
        public Builder threads(@Nullable Output<Integer> threads) {
            $.threads = threads;
            return this;
        }

        /**
         * @param threads The number of threads dbt will use (from 1 to 32). Make sure this value is compatible with your destination type. For example, Snowflake supports only 8 concurrent queries on an X-Small warehouse.
         * 
         * @return builder
         * 
         */
        public Builder threads(Integer threads) {
            return threads(Output.of(threads));
        }

        /**
         * @param type Type of dbt Project. Currently only `GIT` supported. Empty value will be considered as default (GIT).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of dbt Project. Currently only `GIT` supported. Empty value will be considered as default (GIT).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DbtProjectState build() {
            return $;
        }
    }

}