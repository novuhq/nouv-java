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

public class RenameTopicResponseDto {

    @JsonProperty("_environmentId")
    private String environmentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_id")
    private Optional<? extends String> id;

    @JsonProperty("_organizationId")
    private String organizationId;

    @JsonProperty("key")
    private String key;

    @JsonProperty("name")
    private String name;

    @JsonProperty("subscribers")
    private java.util.List<String> subscribers;

    @JsonCreator
    public RenameTopicResponseDto(
            @JsonProperty("_environmentId") String environmentId,
            @JsonProperty("_id") Optional<? extends String> id,
            @JsonProperty("_organizationId") String organizationId,
            @JsonProperty("key") String key,
            @JsonProperty("name") String name,
            @JsonProperty("subscribers") java.util.List<String> subscribers) {
        Utils.checkNotNull(environmentId, "environmentId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(subscribers, "subscribers");
        this.environmentId = environmentId;
        this.id = id;
        this.organizationId = organizationId;
        this.key = key;
        this.name = name;
        this.subscribers = subscribers;
    }
    
    public RenameTopicResponseDto(
            String environmentId,
            String organizationId,
            String key,
            String name,
            java.util.List<String> subscribers) {
        this(environmentId, Optional.empty(), organizationId, key, name, subscribers);
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

    @JsonIgnore
    public String key() {
        return key;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public java.util.List<String> subscribers() {
        return subscribers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RenameTopicResponseDto withEnvironmentId(String environmentId) {
        Utils.checkNotNull(environmentId, "environmentId");
        this.environmentId = environmentId;
        return this;
    }

    public RenameTopicResponseDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public RenameTopicResponseDto withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public RenameTopicResponseDto withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public RenameTopicResponseDto withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public RenameTopicResponseDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public RenameTopicResponseDto withSubscribers(java.util.List<String> subscribers) {
        Utils.checkNotNull(subscribers, "subscribers");
        this.subscribers = subscribers;
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
        RenameTopicResponseDto other = (RenameTopicResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.environmentId, other.environmentId) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.subscribers, other.subscribers);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            environmentId,
            id,
            organizationId,
            key,
            name,
            subscribers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RenameTopicResponseDto.class,
                "environmentId", environmentId,
                "id", id,
                "organizationId", organizationId,
                "key", key,
                "name", name,
                "subscribers", subscribers);
    }
    
    public final static class Builder {
 
        private String environmentId;
 
        private Optional<? extends String> id = Optional.empty();
 
        private String organizationId;
 
        private String key;
 
        private String name;
 
        private java.util.List<String> subscribers;  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder subscribers(java.util.List<String> subscribers) {
            Utils.checkNotNull(subscribers, "subscribers");
            this.subscribers = subscribers;
            return this;
        }
        
        public RenameTopicResponseDto build() {
            return new RenameTopicResponseDto(
                environmentId,
                id,
                organizationId,
                key,
                name,
                subscribers);
        }
    }
}

