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

public class SubscriberChannelDto {

    @JsonProperty("credentials")
    private ChannelCredentialsDto credentials;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("integrationIdentifier")
    private Optional<? extends String> integrationIdentifier;

    @JsonProperty("providerId")
    private SubscriberChannelDtoProviderId providerId;

    @JsonCreator
    public SubscriberChannelDto(
            @JsonProperty("credentials") ChannelCredentialsDto credentials,
            @JsonProperty("integrationIdentifier") Optional<? extends String> integrationIdentifier,
            @JsonProperty("providerId") SubscriberChannelDtoProviderId providerId) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(integrationIdentifier, "integrationIdentifier");
        Utils.checkNotNull(providerId, "providerId");
        this.credentials = credentials;
        this.integrationIdentifier = integrationIdentifier;
        this.providerId = providerId;
    }
    
    public SubscriberChannelDto(
            ChannelCredentialsDto credentials,
            SubscriberChannelDtoProviderId providerId) {
        this(credentials, Optional.empty(), providerId);
    }

    @JsonIgnore
    public ChannelCredentialsDto credentials() {
        return credentials;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> integrationIdentifier() {
        return (Optional<String>) integrationIdentifier;
    }

    @JsonIgnore
    public SubscriberChannelDtoProviderId providerId() {
        return providerId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SubscriberChannelDto withCredentials(ChannelCredentialsDto credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    public SubscriberChannelDto withIntegrationIdentifier(String integrationIdentifier) {
        Utils.checkNotNull(integrationIdentifier, "integrationIdentifier");
        this.integrationIdentifier = Optional.ofNullable(integrationIdentifier);
        return this;
    }

    public SubscriberChannelDto withIntegrationIdentifier(Optional<? extends String> integrationIdentifier) {
        Utils.checkNotNull(integrationIdentifier, "integrationIdentifier");
        this.integrationIdentifier = integrationIdentifier;
        return this;
    }

    public SubscriberChannelDto withProviderId(SubscriberChannelDtoProviderId providerId) {
        Utils.checkNotNull(providerId, "providerId");
        this.providerId = providerId;
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
        SubscriberChannelDto other = (SubscriberChannelDto) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.integrationIdentifier, other.integrationIdentifier) &&
            java.util.Objects.deepEquals(this.providerId, other.providerId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            integrationIdentifier,
            providerId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscriberChannelDto.class,
                "credentials", credentials,
                "integrationIdentifier", integrationIdentifier,
                "providerId", providerId);
    }
    
    public final static class Builder {
 
        private ChannelCredentialsDto credentials;
 
        private Optional<? extends String> integrationIdentifier = Optional.empty();
 
        private SubscriberChannelDtoProviderId providerId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(ChannelCredentialsDto credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        public Builder integrationIdentifier(String integrationIdentifier) {
            Utils.checkNotNull(integrationIdentifier, "integrationIdentifier");
            this.integrationIdentifier = Optional.ofNullable(integrationIdentifier);
            return this;
        }

        public Builder integrationIdentifier(Optional<? extends String> integrationIdentifier) {
            Utils.checkNotNull(integrationIdentifier, "integrationIdentifier");
            this.integrationIdentifier = integrationIdentifier;
            return this;
        }

        public Builder providerId(SubscriberChannelDtoProviderId providerId) {
            Utils.checkNotNull(providerId, "providerId");
            this.providerId = providerId;
            return this;
        }
        
        public SubscriberChannelDto build() {
            return new SubscriberChannelDto(
                credentials,
                integrationIdentifier,
                providerId);
        }
    }
}

