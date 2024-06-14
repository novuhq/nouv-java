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

public class SubscriberResponseDto {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("__v")
    private Optional<? extends Double> v;

    @JsonProperty("_environmentId")
    private String environmentId;

    /**
     * The internal id novu generated for your subscriber, this is not the subscriberId matching your query. See `subscriberId` for that
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_id")
    private Optional<? extends String> id;

    @JsonProperty("_organizationId")
    private String organizationId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("avatar")
    private Optional<? extends String> avatar;

    /**
     * Channels settings for subscriber
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channels")
    private Optional<? extends java.util.List<ChannelSettings>> channels;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("deleted")
    private boolean deleted;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<? extends String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstName")
    private Optional<? extends String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isOnline")
    private Optional<? extends Boolean> isOnline;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    private Optional<? extends String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastOnlineAt")
    private Optional<? extends String> lastOnlineAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("locale")
    private Optional<? extends String> locale;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<? extends String> phone;

    /**
     * The internal identifier you used to create this subscriber, usually correlates to the id the user in your systems
     */
    @JsonProperty("subscriberId")
    private String subscriberId;

    @JsonProperty("updatedAt")
    private String updatedAt;

    @JsonCreator
    public SubscriberResponseDto(
            @JsonProperty("__v") Optional<? extends Double> v,
            @JsonProperty("_environmentId") String environmentId,
            @JsonProperty("_id") Optional<? extends String> id,
            @JsonProperty("_organizationId") String organizationId,
            @JsonProperty("avatar") Optional<? extends String> avatar,
            @JsonProperty("channels") Optional<? extends java.util.List<ChannelSettings>> channels,
            @JsonProperty("createdAt") String createdAt,
            @JsonProperty("deleted") boolean deleted,
            @JsonProperty("email") Optional<? extends String> email,
            @JsonProperty("firstName") Optional<? extends String> firstName,
            @JsonProperty("isOnline") Optional<? extends Boolean> isOnline,
            @JsonProperty("lastName") Optional<? extends String> lastName,
            @JsonProperty("lastOnlineAt") Optional<? extends String> lastOnlineAt,
            @JsonProperty("locale") Optional<? extends String> locale,
            @JsonProperty("phone") Optional<? extends String> phone,
            @JsonProperty("subscriberId") String subscriberId,
            @JsonProperty("updatedAt") String updatedAt) {
        Utils.checkNotNull(v, "v");
        Utils.checkNotNull(environmentId, "environmentId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(avatar, "avatar");
        Utils.checkNotNull(channels, "channels");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(deleted, "deleted");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(isOnline, "isOnline");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(lastOnlineAt, "lastOnlineAt");
        Utils.checkNotNull(locale, "locale");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(subscriberId, "subscriberId");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.v = v;
        this.environmentId = environmentId;
        this.id = id;
        this.organizationId = organizationId;
        this.avatar = avatar;
        this.channels = channels;
        this.createdAt = createdAt;
        this.deleted = deleted;
        this.email = email;
        this.firstName = firstName;
        this.isOnline = isOnline;
        this.lastName = lastName;
        this.lastOnlineAt = lastOnlineAt;
        this.locale = locale;
        this.phone = phone;
        this.subscriberId = subscriberId;
        this.updatedAt = updatedAt;
    }
    
    public SubscriberResponseDto(
            String environmentId,
            String organizationId,
            String createdAt,
            boolean deleted,
            String subscriberId,
            String updatedAt) {
        this(Optional.empty(), environmentId, Optional.empty(), organizationId, Optional.empty(), Optional.empty(), createdAt, deleted, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), subscriberId, updatedAt);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> v() {
        return (Optional<Double>) v;
    }

    @JsonIgnore
    public String environmentId() {
        return environmentId;
    }

    /**
     * The internal id novu generated for your subscriber, this is not the subscriberId matching your query. See `subscriberId` for that
     */
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
    public Optional<String> avatar() {
        return (Optional<String>) avatar;
    }

    /**
     * Channels settings for subscriber
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<ChannelSettings>> channels() {
        return (Optional<java.util.List<ChannelSettings>>) channels;
    }

    @JsonIgnore
    public String createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public boolean deleted() {
        return deleted;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> email() {
        return (Optional<String>) email;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> firstName() {
        return (Optional<String>) firstName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> isOnline() {
        return (Optional<Boolean>) isOnline;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> lastName() {
        return (Optional<String>) lastName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> lastOnlineAt() {
        return (Optional<String>) lastOnlineAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> locale() {
        return (Optional<String>) locale;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> phone() {
        return (Optional<String>) phone;
    }

    /**
     * The internal identifier you used to create this subscriber, usually correlates to the id the user in your systems
     */
    @JsonIgnore
    public String subscriberId() {
        return subscriberId;
    }

    @JsonIgnore
    public String updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SubscriberResponseDto withV(double v) {
        Utils.checkNotNull(v, "v");
        this.v = Optional.ofNullable(v);
        return this;
    }

    public SubscriberResponseDto withV(Optional<? extends Double> v) {
        Utils.checkNotNull(v, "v");
        this.v = v;
        return this;
    }

    public SubscriberResponseDto withEnvironmentId(String environmentId) {
        Utils.checkNotNull(environmentId, "environmentId");
        this.environmentId = environmentId;
        return this;
    }

    /**
     * The internal id novu generated for your subscriber, this is not the subscriberId matching your query. See `subscriberId` for that
     */
    public SubscriberResponseDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The internal id novu generated for your subscriber, this is not the subscriberId matching your query. See `subscriberId` for that
     */
    public SubscriberResponseDto withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public SubscriberResponseDto withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public SubscriberResponseDto withAvatar(String avatar) {
        Utils.checkNotNull(avatar, "avatar");
        this.avatar = Optional.ofNullable(avatar);
        return this;
    }

    public SubscriberResponseDto withAvatar(Optional<? extends String> avatar) {
        Utils.checkNotNull(avatar, "avatar");
        this.avatar = avatar;
        return this;
    }

    /**
     * Channels settings for subscriber
     */
    public SubscriberResponseDto withChannels(java.util.List<ChannelSettings> channels) {
        Utils.checkNotNull(channels, "channels");
        this.channels = Optional.ofNullable(channels);
        return this;
    }

    /**
     * Channels settings for subscriber
     */
    public SubscriberResponseDto withChannels(Optional<? extends java.util.List<ChannelSettings>> channels) {
        Utils.checkNotNull(channels, "channels");
        this.channels = channels;
        return this;
    }

    public SubscriberResponseDto withCreatedAt(String createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public SubscriberResponseDto withDeleted(boolean deleted) {
        Utils.checkNotNull(deleted, "deleted");
        this.deleted = deleted;
        return this;
    }

    public SubscriberResponseDto withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public SubscriberResponseDto withEmail(Optional<? extends String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public SubscriberResponseDto withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    public SubscriberResponseDto withFirstName(Optional<? extends String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public SubscriberResponseDto withIsOnline(boolean isOnline) {
        Utils.checkNotNull(isOnline, "isOnline");
        this.isOnline = Optional.ofNullable(isOnline);
        return this;
    }

    public SubscriberResponseDto withIsOnline(Optional<? extends Boolean> isOnline) {
        Utils.checkNotNull(isOnline, "isOnline");
        this.isOnline = isOnline;
        return this;
    }

    public SubscriberResponseDto withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    public SubscriberResponseDto withLastName(Optional<? extends String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public SubscriberResponseDto withLastOnlineAt(String lastOnlineAt) {
        Utils.checkNotNull(lastOnlineAt, "lastOnlineAt");
        this.lastOnlineAt = Optional.ofNullable(lastOnlineAt);
        return this;
    }

    public SubscriberResponseDto withLastOnlineAt(Optional<? extends String> lastOnlineAt) {
        Utils.checkNotNull(lastOnlineAt, "lastOnlineAt");
        this.lastOnlineAt = lastOnlineAt;
        return this;
    }

    public SubscriberResponseDto withLocale(String locale) {
        Utils.checkNotNull(locale, "locale");
        this.locale = Optional.ofNullable(locale);
        return this;
    }

    public SubscriberResponseDto withLocale(Optional<? extends String> locale) {
        Utils.checkNotNull(locale, "locale");
        this.locale = locale;
        return this;
    }

    public SubscriberResponseDto withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    public SubscriberResponseDto withPhone(Optional<? extends String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * The internal identifier you used to create this subscriber, usually correlates to the id the user in your systems
     */
    public SubscriberResponseDto withSubscriberId(String subscriberId) {
        Utils.checkNotNull(subscriberId, "subscriberId");
        this.subscriberId = subscriberId;
        return this;
    }

    public SubscriberResponseDto withUpdatedAt(String updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        SubscriberResponseDto other = (SubscriberResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.v, other.v) &&
            java.util.Objects.deepEquals(this.environmentId, other.environmentId) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.avatar, other.avatar) &&
            java.util.Objects.deepEquals(this.channels, other.channels) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.deleted, other.deleted) &&
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.firstName, other.firstName) &&
            java.util.Objects.deepEquals(this.isOnline, other.isOnline) &&
            java.util.Objects.deepEquals(this.lastName, other.lastName) &&
            java.util.Objects.deepEquals(this.lastOnlineAt, other.lastOnlineAt) &&
            java.util.Objects.deepEquals(this.locale, other.locale) &&
            java.util.Objects.deepEquals(this.phone, other.phone) &&
            java.util.Objects.deepEquals(this.subscriberId, other.subscriberId) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            v,
            environmentId,
            id,
            organizationId,
            avatar,
            channels,
            createdAt,
            deleted,
            email,
            firstName,
            isOnline,
            lastName,
            lastOnlineAt,
            locale,
            phone,
            subscriberId,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscriberResponseDto.class,
                "v", v,
                "environmentId", environmentId,
                "id", id,
                "organizationId", organizationId,
                "avatar", avatar,
                "channels", channels,
                "createdAt", createdAt,
                "deleted", deleted,
                "email", email,
                "firstName", firstName,
                "isOnline", isOnline,
                "lastName", lastName,
                "lastOnlineAt", lastOnlineAt,
                "locale", locale,
                "phone", phone,
                "subscriberId", subscriberId,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> v = Optional.empty();
 
        private String environmentId;
 
        private Optional<? extends String> id = Optional.empty();
 
        private String organizationId;
 
        private Optional<? extends String> avatar = Optional.empty();
 
        private Optional<? extends java.util.List<ChannelSettings>> channels = Optional.empty();
 
        private String createdAt;
 
        private Boolean deleted;
 
        private Optional<? extends String> email = Optional.empty();
 
        private Optional<? extends String> firstName = Optional.empty();
 
        private Optional<? extends Boolean> isOnline = Optional.empty();
 
        private Optional<? extends String> lastName = Optional.empty();
 
        private Optional<? extends String> lastOnlineAt = Optional.empty();
 
        private Optional<? extends String> locale = Optional.empty();
 
        private Optional<? extends String> phone = Optional.empty();
 
        private String subscriberId;
 
        private String updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder v(double v) {
            Utils.checkNotNull(v, "v");
            this.v = Optional.ofNullable(v);
            return this;
        }

        public Builder v(Optional<? extends Double> v) {
            Utils.checkNotNull(v, "v");
            this.v = v;
            return this;
        }

        public Builder environmentId(String environmentId) {
            Utils.checkNotNull(environmentId, "environmentId");
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The internal id novu generated for your subscriber, this is not the subscriberId matching your query. See `subscriberId` for that
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The internal id novu generated for your subscriber, this is not the subscriberId matching your query. See `subscriberId` for that
         */
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

        public Builder avatar(String avatar) {
            Utils.checkNotNull(avatar, "avatar");
            this.avatar = Optional.ofNullable(avatar);
            return this;
        }

        public Builder avatar(Optional<? extends String> avatar) {
            Utils.checkNotNull(avatar, "avatar");
            this.avatar = avatar;
            return this;
        }

        /**
         * Channels settings for subscriber
         */
        public Builder channels(java.util.List<ChannelSettings> channels) {
            Utils.checkNotNull(channels, "channels");
            this.channels = Optional.ofNullable(channels);
            return this;
        }

        /**
         * Channels settings for subscriber
         */
        public Builder channels(Optional<? extends java.util.List<ChannelSettings>> channels) {
            Utils.checkNotNull(channels, "channels");
            this.channels = channels;
            return this;
        }

        public Builder createdAt(String createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder deleted(boolean deleted) {
            Utils.checkNotNull(deleted, "deleted");
            this.deleted = deleted;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<? extends String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder firstName(Optional<? extends String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder isOnline(boolean isOnline) {
            Utils.checkNotNull(isOnline, "isOnline");
            this.isOnline = Optional.ofNullable(isOnline);
            return this;
        }

        public Builder isOnline(Optional<? extends Boolean> isOnline) {
            Utils.checkNotNull(isOnline, "isOnline");
            this.isOnline = isOnline;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<? extends String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder lastOnlineAt(String lastOnlineAt) {
            Utils.checkNotNull(lastOnlineAt, "lastOnlineAt");
            this.lastOnlineAt = Optional.ofNullable(lastOnlineAt);
            return this;
        }

        public Builder lastOnlineAt(Optional<? extends String> lastOnlineAt) {
            Utils.checkNotNull(lastOnlineAt, "lastOnlineAt");
            this.lastOnlineAt = lastOnlineAt;
            return this;
        }

        public Builder locale(String locale) {
            Utils.checkNotNull(locale, "locale");
            this.locale = Optional.ofNullable(locale);
            return this;
        }

        public Builder locale(Optional<? extends String> locale) {
            Utils.checkNotNull(locale, "locale");
            this.locale = locale;
            return this;
        }

        public Builder phone(String phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        public Builder phone(Optional<? extends String> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        /**
         * The internal identifier you used to create this subscriber, usually correlates to the id the user in your systems
         */
        public Builder subscriberId(String subscriberId) {
            Utils.checkNotNull(subscriberId, "subscriberId");
            this.subscriberId = subscriberId;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public SubscriberResponseDto build() {
            return new SubscriberResponseDto(
                v,
                environmentId,
                id,
                organizationId,
                avatar,
                channels,
                createdAt,
                deleted,
                email,
                firstName,
                isOnline,
                lastName,
                lastOnlineAt,
                locale,
                phone,
                subscriberId,
                updatedAt);
        }
    }
}

