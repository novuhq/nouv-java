/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ChangeResponseDto {

    @JsonProperty("_creatorId")
    private String creatorId;

    @JsonProperty("_entityId")
    private String entityId;

    @JsonProperty("_environmentId")
    private String environmentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_id")
    private Optional<? extends String> id;

    @JsonProperty("_organizationId")
    private String organizationId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_parentId")
    private Optional<? extends String> parentId;

    @JsonProperty("change")
    private Change change;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("enabled")
    private boolean enabled;

    @JsonProperty("type")
    private Type type;

    @JsonCreator
    public ChangeResponseDto(
            @JsonProperty("_creatorId") String creatorId,
            @JsonProperty("_entityId") String entityId,
            @JsonProperty("_environmentId") String environmentId,
            @JsonProperty("_id") Optional<? extends String> id,
            @JsonProperty("_organizationId") String organizationId,
            @JsonProperty("_parentId") Optional<? extends String> parentId,
            @JsonProperty("change") Change change,
            @JsonProperty("createdAt") String createdAt,
            @JsonProperty("enabled") boolean enabled,
            @JsonProperty("type") Type type) {
        Utils.checkNotNull(creatorId, "creatorId");
        Utils.checkNotNull(entityId, "entityId");
        Utils.checkNotNull(environmentId, "environmentId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(change, "change");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(enabled, "enabled");
        Utils.checkNotNull(type, "type");
        this.creatorId = creatorId;
        this.entityId = entityId;
        this.environmentId = environmentId;
        this.id = id;
        this.organizationId = organizationId;
        this.parentId = parentId;
        this.change = change;
        this.createdAt = createdAt;
        this.enabled = enabled;
        this.type = type;
    }
    
    public ChangeResponseDto(
            String creatorId,
            String entityId,
            String environmentId,
            String organizationId,
            Change change,
            String createdAt,
            boolean enabled,
            Type type) {
        this(creatorId, entityId, environmentId, Optional.empty(), organizationId, Optional.empty(), change, createdAt, enabled, type);
    }

    @JsonIgnore
    public String creatorId() {
        return creatorId;
    }

    @JsonIgnore
    public String entityId() {
        return entityId;
    }

    @JsonIgnore
    public String environmentId() {
        return environmentId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> id() {
        return (Optional<String>) id;
    }

    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> parentId() {
        return (Optional<String>) parentId;
    }

    @JsonIgnore
    public Change change() {
        return change;
    }

    @JsonIgnore
    public String createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public boolean enabled() {
        return enabled;
    }

    @JsonIgnore
    public Type type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ChangeResponseDto withCreatorId(String creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = creatorId;
        return this;
    }

    public ChangeResponseDto withEntityId(String entityId) {
        Utils.checkNotNull(entityId, "entityId");
        this.entityId = entityId;
        return this;
    }

    public ChangeResponseDto withEnvironmentId(String environmentId) {
        Utils.checkNotNull(environmentId, "environmentId");
        this.environmentId = environmentId;
        return this;
    }

    public ChangeResponseDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ChangeResponseDto withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ChangeResponseDto withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public ChangeResponseDto withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = Optional.ofNullable(parentId);
        return this;
    }

    public ChangeResponseDto withParentId(Optional<? extends String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    public ChangeResponseDto withChange(Change change) {
        Utils.checkNotNull(change, "change");
        this.change = change;
        return this;
    }

    public ChangeResponseDto withCreatedAt(String createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public ChangeResponseDto withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
        return this;
    }

    public ChangeResponseDto withType(Type type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeResponseDto other = (ChangeResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.creatorId, other.creatorId) &&
            java.util.Objects.deepEquals(this.entityId, other.entityId) &&
            java.util.Objects.deepEquals(this.environmentId, other.environmentId) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.parentId, other.parentId) &&
            java.util.Objects.deepEquals(this.change, other.change) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.enabled, other.enabled) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            creatorId,
            entityId,
            environmentId,
            id,
            organizationId,
            parentId,
            change,
            createdAt,
            enabled,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ChangeResponseDto.class,
                "creatorId", creatorId,
                "entityId", entityId,
                "environmentId", environmentId,
                "id", id,
                "organizationId", organizationId,
                "parentId", parentId,
                "change", change,
                "createdAt", createdAt,
                "enabled", enabled,
                "type", type);
    }
    
    public final static class Builder {
 
        private String creatorId;
 
        private String entityId;
 
        private String environmentId;
 
        private Optional<? extends String> id = Optional.empty();
 
        private String organizationId;
 
        private Optional<? extends String> parentId = Optional.empty();
 
        private Change change;
 
        private String createdAt;
 
        private Boolean enabled;
 
        private Type type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder creatorId(String creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = creatorId;
            return this;
        }

        public Builder entityId(String entityId) {
            Utils.checkNotNull(entityId, "entityId");
            this.entityId = entityId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            Utils.checkNotNull(environmentId, "environmentId");
            this.environmentId = environmentId;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = Optional.ofNullable(parentId);
            return this;
        }

        public Builder parentId(Optional<? extends String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }

        public Builder change(Change change) {
            Utils.checkNotNull(change, "change");
            this.change = change;
            return this;
        }

        public Builder createdAt(String createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }

        public Builder type(Type type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public ChangeResponseDto build() {
            return new ChangeResponseDto(
                creatorId,
                entityId,
                environmentId,
                id,
                organizationId,
                parentId,
                change,
                createdAt,
                enabled,
                type);
        }
    }
}

