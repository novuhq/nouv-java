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

public class GetLayoutResponseDto {

    @JsonProperty("_creatorId")
    private String creatorId;

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

    @JsonProperty("channel")
    private GetLayoutResponseDtoChannel channel;

    @JsonProperty("content")
    private String content;

    @JsonProperty("contentType")
    private String contentType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    private Optional<? extends String> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("isDefault")
    private boolean isDefault;

    @JsonProperty("isDeleted")
    private boolean isDeleted;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    private Optional<? extends String> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("variables")
    private Optional<? extends java.util.List<Variables>> variables;

    @JsonCreator
    public GetLayoutResponseDto(
            @JsonProperty("_creatorId") String creatorId,
            @JsonProperty("_environmentId") String environmentId,
            @JsonProperty("_id") Optional<? extends String> id,
            @JsonProperty("_organizationId") String organizationId,
            @JsonProperty("_parentId") Optional<? extends String> parentId,
            @JsonProperty("channel") GetLayoutResponseDtoChannel channel,
            @JsonProperty("content") String content,
            @JsonProperty("contentType") String contentType,
            @JsonProperty("createdAt") Optional<? extends String> createdAt,
            @JsonProperty("description") Optional<? extends String> description,
            @JsonProperty("identifier") String identifier,
            @JsonProperty("isDefault") boolean isDefault,
            @JsonProperty("isDeleted") boolean isDeleted,
            @JsonProperty("name") String name,
            @JsonProperty("updatedAt") Optional<? extends String> updatedAt,
            @JsonProperty("variables") Optional<? extends java.util.List<Variables>> variables) {
        Utils.checkNotNull(creatorId, "creatorId");
        Utils.checkNotNull(environmentId, "environmentId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(channel, "channel");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(isDefault, "isDefault");
        Utils.checkNotNull(isDeleted, "isDeleted");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(variables, "variables");
        this.creatorId = creatorId;
        this.environmentId = environmentId;
        this.id = id;
        this.organizationId = organizationId;
        this.parentId = parentId;
        this.channel = channel;
        this.content = content;
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.description = description;
        this.identifier = identifier;
        this.isDefault = isDefault;
        this.isDeleted = isDeleted;
        this.name = name;
        this.updatedAt = updatedAt;
        this.variables = variables;
    }
    
    public GetLayoutResponseDto(
            String creatorId,
            String environmentId,
            String organizationId,
            GetLayoutResponseDtoChannel channel,
            String content,
            String contentType,
            String identifier,
            boolean isDefault,
            boolean isDeleted,
            String name) {
        this(creatorId, environmentId, Optional.empty(), organizationId, Optional.empty(), channel, content, contentType, Optional.empty(), Optional.empty(), identifier, isDefault, isDeleted, name, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String creatorId() {
        return creatorId;
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
    public GetLayoutResponseDtoChannel channel() {
        return channel;
    }

    @JsonIgnore
    public String content() {
        return content;
    }

    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> createdAt() {
        return (Optional<String>) createdAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> description() {
        return (Optional<String>) description;
    }

    @JsonIgnore
    public String identifier() {
        return identifier;
    }

    @JsonIgnore
    public boolean isDefault() {
        return isDefault;
    }

    @JsonIgnore
    public boolean isDeleted() {
        return isDeleted;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> updatedAt() {
        return (Optional<String>) updatedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Variables>> variables() {
        return (Optional<java.util.List<Variables>>) variables;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLayoutResponseDto withCreatorId(String creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = creatorId;
        return this;
    }

    public GetLayoutResponseDto withEnvironmentId(String environmentId) {
        Utils.checkNotNull(environmentId, "environmentId");
        this.environmentId = environmentId;
        return this;
    }

    public GetLayoutResponseDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetLayoutResponseDto withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetLayoutResponseDto withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public GetLayoutResponseDto withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = Optional.ofNullable(parentId);
        return this;
    }

    public GetLayoutResponseDto withParentId(Optional<? extends String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    public GetLayoutResponseDto withChannel(GetLayoutResponseDtoChannel channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = channel;
        return this;
    }

    public GetLayoutResponseDto withContent(String content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public GetLayoutResponseDto withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public GetLayoutResponseDto withCreatedAt(String createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public GetLayoutResponseDto withCreatedAt(Optional<? extends String> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public GetLayoutResponseDto withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public GetLayoutResponseDto withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public GetLayoutResponseDto withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetLayoutResponseDto withIsDefault(boolean isDefault) {
        Utils.checkNotNull(isDefault, "isDefault");
        this.isDefault = isDefault;
        return this;
    }

    public GetLayoutResponseDto withIsDeleted(boolean isDeleted) {
        Utils.checkNotNull(isDeleted, "isDeleted");
        this.isDeleted = isDeleted;
        return this;
    }

    public GetLayoutResponseDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GetLayoutResponseDto withUpdatedAt(String updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public GetLayoutResponseDto withUpdatedAt(Optional<? extends String> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public GetLayoutResponseDto withVariables(java.util.List<Variables> variables) {
        Utils.checkNotNull(variables, "variables");
        this.variables = Optional.ofNullable(variables);
        return this;
    }

    public GetLayoutResponseDto withVariables(Optional<? extends java.util.List<Variables>> variables) {
        Utils.checkNotNull(variables, "variables");
        this.variables = variables;
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
        GetLayoutResponseDto other = (GetLayoutResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.creatorId, other.creatorId) &&
            java.util.Objects.deepEquals(this.environmentId, other.environmentId) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.parentId, other.parentId) &&
            java.util.Objects.deepEquals(this.channel, other.channel) &&
            java.util.Objects.deepEquals(this.content, other.content) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.identifier, other.identifier) &&
            java.util.Objects.deepEquals(this.isDefault, other.isDefault) &&
            java.util.Objects.deepEquals(this.isDeleted, other.isDeleted) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            java.util.Objects.deepEquals(this.variables, other.variables);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            creatorId,
            environmentId,
            id,
            organizationId,
            parentId,
            channel,
            content,
            contentType,
            createdAt,
            description,
            identifier,
            isDefault,
            isDeleted,
            name,
            updatedAt,
            variables);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLayoutResponseDto.class,
                "creatorId", creatorId,
                "environmentId", environmentId,
                "id", id,
                "organizationId", organizationId,
                "parentId", parentId,
                "channel", channel,
                "content", content,
                "contentType", contentType,
                "createdAt", createdAt,
                "description", description,
                "identifier", identifier,
                "isDefault", isDefault,
                "isDeleted", isDeleted,
                "name", name,
                "updatedAt", updatedAt,
                "variables", variables);
    }
    
    public final static class Builder {
 
        private String creatorId;
 
        private String environmentId;
 
        private Optional<? extends String> id = Optional.empty();
 
        private String organizationId;
 
        private Optional<? extends String> parentId = Optional.empty();
 
        private GetLayoutResponseDtoChannel channel;
 
        private String content;
 
        private String contentType;
 
        private Optional<? extends String> createdAt = Optional.empty();
 
        private Optional<? extends String> description = Optional.empty();
 
        private String identifier;
 
        private Boolean isDefault;
 
        private Boolean isDeleted;
 
        private String name;
 
        private Optional<? extends String> updatedAt = Optional.empty();
 
        private Optional<? extends java.util.List<Variables>> variables = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder creatorId(String creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = creatorId;
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

        public Builder channel(GetLayoutResponseDtoChannel channel) {
            Utils.checkNotNull(channel, "channel");
            this.channel = channel;
            return this;
        }

        public Builder content(String content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        public Builder createdAt(String createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<? extends String> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder isDefault(boolean isDefault) {
            Utils.checkNotNull(isDefault, "isDefault");
            this.isDefault = isDefault;
            return this;
        }

        public Builder isDeleted(boolean isDeleted) {
            Utils.checkNotNull(isDeleted, "isDeleted");
            this.isDeleted = isDeleted;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<? extends String> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder variables(java.util.List<Variables> variables) {
            Utils.checkNotNull(variables, "variables");
            this.variables = Optional.ofNullable(variables);
            return this;
        }

        public Builder variables(Optional<? extends java.util.List<Variables>> variables) {
            Utils.checkNotNull(variables, "variables");
            this.variables = variables;
            return this;
        }
        
        public GetLayoutResponseDto build() {
            return new GetLayoutResponseDto(
                creatorId,
                environmentId,
                id,
                organizationId,
                parentId,
                channel,
                content,
                contentType,
                createdAt,
                description,
                identifier,
                isDefault,
                isDeleted,
                name,
                updatedAt,
                variables);
        }
    }
}

