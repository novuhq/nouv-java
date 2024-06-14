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

public class TriggerEventToAllRequestDto {

    /**
     * It is used to display the Avatar of the provided actor's subscriber id or actor object.
     *     If a new actor object is provided, we will create a new subscriber in our system
     *     
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("actor")
    private Optional<? extends TriggerEventToAllRequestDtoActor> actor;

    /**
     * The trigger identifier associated for the template you wish to send. This identifier can be found on the template page.
     */
    @JsonProperty("name")
    private String name;

    /**
     * This could be used to override provider specific configurations
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("overrides")
    private Optional<? extends TriggerEventToAllRequestDtoOverrides> overrides;

    /**
     * The payload object is used to pass additional custom information that could be used to render the template, or perform routing rules based on it. 
     *       This data will also be available when fetching the notifications feed from the API to display certain parts of the UI.
     */
    @JsonProperty("payload")
    private TriggerEventToAllRequestDtoPayload payload;

    /**
     * It is used to specify a tenant context during trigger event.
     *     If a new tenant object is provided, we will create a new tenant.
     *     
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tenant")
    private Optional<? extends TriggerEventToAllRequestDtoTenant> tenant;

    /**
     * A unique identifier for this transaction, we will generated a UUID if not provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transactionId")
    private Optional<? extends String> transactionId;

    @JsonCreator
    public TriggerEventToAllRequestDto(
            @JsonProperty("actor") Optional<? extends TriggerEventToAllRequestDtoActor> actor,
            @JsonProperty("name") String name,
            @JsonProperty("overrides") Optional<? extends TriggerEventToAllRequestDtoOverrides> overrides,
            @JsonProperty("payload") TriggerEventToAllRequestDtoPayload payload,
            @JsonProperty("tenant") Optional<? extends TriggerEventToAllRequestDtoTenant> tenant,
            @JsonProperty("transactionId") Optional<? extends String> transactionId) {
        Utils.checkNotNull(actor, "actor");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(overrides, "overrides");
        Utils.checkNotNull(payload, "payload");
        Utils.checkNotNull(tenant, "tenant");
        Utils.checkNotNull(transactionId, "transactionId");
        this.actor = actor;
        this.name = name;
        this.overrides = overrides;
        this.payload = payload;
        this.tenant = tenant;
        this.transactionId = transactionId;
    }
    
    public TriggerEventToAllRequestDto(
            String name,
            TriggerEventToAllRequestDtoPayload payload) {
        this(Optional.empty(), name, Optional.empty(), payload, Optional.empty(), Optional.empty());
    }

    /**
     * It is used to display the Avatar of the provided actor's subscriber id or actor object.
     *     If a new actor object is provided, we will create a new subscriber in our system
     *     
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TriggerEventToAllRequestDtoActor> actor() {
        return (Optional<TriggerEventToAllRequestDtoActor>) actor;
    }

    /**
     * The trigger identifier associated for the template you wish to send. This identifier can be found on the template page.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * This could be used to override provider specific configurations
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TriggerEventToAllRequestDtoOverrides> overrides() {
        return (Optional<TriggerEventToAllRequestDtoOverrides>) overrides;
    }

    /**
     * The payload object is used to pass additional custom information that could be used to render the template, or perform routing rules based on it. 
     *       This data will also be available when fetching the notifications feed from the API to display certain parts of the UI.
     */
    @JsonIgnore
    public TriggerEventToAllRequestDtoPayload payload() {
        return payload;
    }

    /**
     * It is used to specify a tenant context during trigger event.
     *     If a new tenant object is provided, we will create a new tenant.
     *     
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TriggerEventToAllRequestDtoTenant> tenant() {
        return (Optional<TriggerEventToAllRequestDtoTenant>) tenant;
    }

    /**
     * A unique identifier for this transaction, we will generated a UUID if not provided.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> transactionId() {
        return (Optional<String>) transactionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * It is used to display the Avatar of the provided actor's subscriber id or actor object.
     *     If a new actor object is provided, we will create a new subscriber in our system
     *     
     */
    public TriggerEventToAllRequestDto withActor(TriggerEventToAllRequestDtoActor actor) {
        Utils.checkNotNull(actor, "actor");
        this.actor = Optional.ofNullable(actor);
        return this;
    }

    /**
     * It is used to display the Avatar of the provided actor's subscriber id or actor object.
     *     If a new actor object is provided, we will create a new subscriber in our system
     *     
     */
    public TriggerEventToAllRequestDto withActor(Optional<? extends TriggerEventToAllRequestDtoActor> actor) {
        Utils.checkNotNull(actor, "actor");
        this.actor = actor;
        return this;
    }

    /**
     * The trigger identifier associated for the template you wish to send. This identifier can be found on the template page.
     */
    public TriggerEventToAllRequestDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * This could be used to override provider specific configurations
     */
    public TriggerEventToAllRequestDto withOverrides(TriggerEventToAllRequestDtoOverrides overrides) {
        Utils.checkNotNull(overrides, "overrides");
        this.overrides = Optional.ofNullable(overrides);
        return this;
    }

    /**
     * This could be used to override provider specific configurations
     */
    public TriggerEventToAllRequestDto withOverrides(Optional<? extends TriggerEventToAllRequestDtoOverrides> overrides) {
        Utils.checkNotNull(overrides, "overrides");
        this.overrides = overrides;
        return this;
    }

    /**
     * The payload object is used to pass additional custom information that could be used to render the template, or perform routing rules based on it. 
     *       This data will also be available when fetching the notifications feed from the API to display certain parts of the UI.
     */
    public TriggerEventToAllRequestDto withPayload(TriggerEventToAllRequestDtoPayload payload) {
        Utils.checkNotNull(payload, "payload");
        this.payload = payload;
        return this;
    }

    /**
     * It is used to specify a tenant context during trigger event.
     *     If a new tenant object is provided, we will create a new tenant.
     *     
     */
    public TriggerEventToAllRequestDto withTenant(TriggerEventToAllRequestDtoTenant tenant) {
        Utils.checkNotNull(tenant, "tenant");
        this.tenant = Optional.ofNullable(tenant);
        return this;
    }

    /**
     * It is used to specify a tenant context during trigger event.
     *     If a new tenant object is provided, we will create a new tenant.
     *     
     */
    public TriggerEventToAllRequestDto withTenant(Optional<? extends TriggerEventToAllRequestDtoTenant> tenant) {
        Utils.checkNotNull(tenant, "tenant");
        this.tenant = tenant;
        return this;
    }

    /**
     * A unique identifier for this transaction, we will generated a UUID if not provided.
     */
    public TriggerEventToAllRequestDto withTransactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = Optional.ofNullable(transactionId);
        return this;
    }

    /**
     * A unique identifier for this transaction, we will generated a UUID if not provided.
     */
    public TriggerEventToAllRequestDto withTransactionId(Optional<? extends String> transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
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
        TriggerEventToAllRequestDto other = (TriggerEventToAllRequestDto) o;
        return 
            java.util.Objects.deepEquals(this.actor, other.actor) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.overrides, other.overrides) &&
            java.util.Objects.deepEquals(this.payload, other.payload) &&
            java.util.Objects.deepEquals(this.tenant, other.tenant) &&
            java.util.Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            actor,
            name,
            overrides,
            payload,
            tenant,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TriggerEventToAllRequestDto.class,
                "actor", actor,
                "name", name,
                "overrides", overrides,
                "payload", payload,
                "tenant", tenant,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends TriggerEventToAllRequestDtoActor> actor = Optional.empty();
 
        private String name;
 
        private Optional<? extends TriggerEventToAllRequestDtoOverrides> overrides = Optional.empty();
 
        private TriggerEventToAllRequestDtoPayload payload;
 
        private Optional<? extends TriggerEventToAllRequestDtoTenant> tenant = Optional.empty();
 
        private Optional<? extends String> transactionId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * It is used to display the Avatar of the provided actor's subscriber id or actor object.
         *     If a new actor object is provided, we will create a new subscriber in our system
         *     
         */
        public Builder actor(TriggerEventToAllRequestDtoActor actor) {
            Utils.checkNotNull(actor, "actor");
            this.actor = Optional.ofNullable(actor);
            return this;
        }

        /**
         * It is used to display the Avatar of the provided actor's subscriber id or actor object.
         *     If a new actor object is provided, we will create a new subscriber in our system
         *     
         */
        public Builder actor(Optional<? extends TriggerEventToAllRequestDtoActor> actor) {
            Utils.checkNotNull(actor, "actor");
            this.actor = actor;
            return this;
        }

        /**
         * The trigger identifier associated for the template you wish to send. This identifier can be found on the template page.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * This could be used to override provider specific configurations
         */
        public Builder overrides(TriggerEventToAllRequestDtoOverrides overrides) {
            Utils.checkNotNull(overrides, "overrides");
            this.overrides = Optional.ofNullable(overrides);
            return this;
        }

        /**
         * This could be used to override provider specific configurations
         */
        public Builder overrides(Optional<? extends TriggerEventToAllRequestDtoOverrides> overrides) {
            Utils.checkNotNull(overrides, "overrides");
            this.overrides = overrides;
            return this;
        }

        /**
         * The payload object is used to pass additional custom information that could be used to render the template, or perform routing rules based on it. 
         *       This data will also be available when fetching the notifications feed from the API to display certain parts of the UI.
         */
        public Builder payload(TriggerEventToAllRequestDtoPayload payload) {
            Utils.checkNotNull(payload, "payload");
            this.payload = payload;
            return this;
        }

        /**
         * It is used to specify a tenant context during trigger event.
         *     If a new tenant object is provided, we will create a new tenant.
         *     
         */
        public Builder tenant(TriggerEventToAllRequestDtoTenant tenant) {
            Utils.checkNotNull(tenant, "tenant");
            this.tenant = Optional.ofNullable(tenant);
            return this;
        }

        /**
         * It is used to specify a tenant context during trigger event.
         *     If a new tenant object is provided, we will create a new tenant.
         *     
         */
        public Builder tenant(Optional<? extends TriggerEventToAllRequestDtoTenant> tenant) {
            Utils.checkNotNull(tenant, "tenant");
            this.tenant = tenant;
            return this;
        }

        /**
         * A unique identifier for this transaction, we will generated a UUID if not provided.
         */
        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = Optional.ofNullable(transactionId);
            return this;
        }

        /**
         * A unique identifier for this transaction, we will generated a UUID if not provided.
         */
        public Builder transactionId(Optional<? extends String> transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }
        
        public TriggerEventToAllRequestDto build() {
            return new TriggerEventToAllRequestDto(
                actor,
                name,
                overrides,
                payload,
                tenant,
                transactionId);
        }
    }
}

