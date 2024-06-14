/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

import co.novu.co.novu.sdk.utils.LazySingletonValue;
import co.novu.co.novu.sdk.utils.SpeakeasyMetadata;
import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class SubscribersControllerGetNotificationsFeedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscriberId")
    private String subscriberId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<? extends Double> page;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Double> limit;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=read")
    private Optional<? extends Boolean> read;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=seen")
    private Optional<? extends Boolean> seen;

    /**
     * Base64 encoded string of the partial payload JSON object
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=payload")
    private Optional<? extends String> payload;

    @JsonCreator
    public SubscribersControllerGetNotificationsFeedRequest(
            String subscriberId,
            Optional<? extends Double> page,
            Optional<? extends Double> limit,
            Optional<? extends Boolean> read,
            Optional<? extends Boolean> seen,
            Optional<? extends String> payload) {
        Utils.checkNotNull(subscriberId, "subscriberId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(read, "read");
        Utils.checkNotNull(seen, "seen");
        Utils.checkNotNull(payload, "payload");
        this.subscriberId = subscriberId;
        this.page = page;
        this.limit = limit;
        this.read = read;
        this.seen = seen;
        this.payload = payload;
    }
    
    public SubscribersControllerGetNotificationsFeedRequest(
            String subscriberId) {
        this(subscriberId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String subscriberId() {
        return subscriberId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> page() {
        return (Optional<Double>) page;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> limit() {
        return (Optional<Double>) limit;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> read() {
        return (Optional<Boolean>) read;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> seen() {
        return (Optional<Boolean>) seen;
    }

    /**
     * Base64 encoded string of the partial payload JSON object
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> payload() {
        return (Optional<String>) payload;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SubscribersControllerGetNotificationsFeedRequest withSubscriberId(String subscriberId) {
        Utils.checkNotNull(subscriberId, "subscriberId");
        this.subscriberId = subscriberId;
        return this;
    }

    public SubscribersControllerGetNotificationsFeedRequest withPage(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    public SubscribersControllerGetNotificationsFeedRequest withPage(Optional<? extends Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    public SubscribersControllerGetNotificationsFeedRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public SubscribersControllerGetNotificationsFeedRequest withLimit(Optional<? extends Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public SubscribersControllerGetNotificationsFeedRequest withRead(boolean read) {
        Utils.checkNotNull(read, "read");
        this.read = Optional.ofNullable(read);
        return this;
    }

    public SubscribersControllerGetNotificationsFeedRequest withRead(Optional<? extends Boolean> read) {
        Utils.checkNotNull(read, "read");
        this.read = read;
        return this;
    }

    public SubscribersControllerGetNotificationsFeedRequest withSeen(boolean seen) {
        Utils.checkNotNull(seen, "seen");
        this.seen = Optional.ofNullable(seen);
        return this;
    }

    public SubscribersControllerGetNotificationsFeedRequest withSeen(Optional<? extends Boolean> seen) {
        Utils.checkNotNull(seen, "seen");
        this.seen = seen;
        return this;
    }

    /**
     * Base64 encoded string of the partial payload JSON object
     */
    public SubscribersControllerGetNotificationsFeedRequest withPayload(String payload) {
        Utils.checkNotNull(payload, "payload");
        this.payload = Optional.ofNullable(payload);
        return this;
    }

    /**
     * Base64 encoded string of the partial payload JSON object
     */
    public SubscribersControllerGetNotificationsFeedRequest withPayload(Optional<? extends String> payload) {
        Utils.checkNotNull(payload, "payload");
        this.payload = payload;
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
        SubscribersControllerGetNotificationsFeedRequest other = (SubscribersControllerGetNotificationsFeedRequest) o;
        return 
            java.util.Objects.deepEquals(this.subscriberId, other.subscriberId) &&
            java.util.Objects.deepEquals(this.page, other.page) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.read, other.read) &&
            java.util.Objects.deepEquals(this.seen, other.seen) &&
            java.util.Objects.deepEquals(this.payload, other.payload);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            subscriberId,
            page,
            limit,
            read,
            seen,
            payload);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscribersControllerGetNotificationsFeedRequest.class,
                "subscriberId", subscriberId,
                "page", page,
                "limit", limit,
                "read", read,
                "seen", seen,
                "payload", payload);
    }
    
    public final static class Builder {
 
        private String subscriberId;
 
        private Optional<? extends Double> page = Optional.empty();
 
        private Optional<? extends Double> limit;
 
        private Optional<? extends Boolean> read = Optional.empty();
 
        private Optional<? extends Boolean> seen = Optional.empty();
 
        private Optional<? extends String> payload = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder subscriberId(String subscriberId) {
            Utils.checkNotNull(subscriberId, "subscriberId");
            this.subscriberId = subscriberId;
            return this;
        }

        public Builder page(double page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        public Builder page(Optional<? extends Double> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        public Builder limit(double limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        public Builder limit(Optional<? extends Double> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder read(boolean read) {
            Utils.checkNotNull(read, "read");
            this.read = Optional.ofNullable(read);
            return this;
        }

        public Builder read(Optional<? extends Boolean> read) {
            Utils.checkNotNull(read, "read");
            this.read = read;
            return this;
        }

        public Builder seen(boolean seen) {
            Utils.checkNotNull(seen, "seen");
            this.seen = Optional.ofNullable(seen);
            return this;
        }

        public Builder seen(Optional<? extends Boolean> seen) {
            Utils.checkNotNull(seen, "seen");
            this.seen = seen;
            return this;
        }

        /**
         * Base64 encoded string of the partial payload JSON object
         */
        public Builder payload(String payload) {
            Utils.checkNotNull(payload, "payload");
            this.payload = Optional.ofNullable(payload);
            return this;
        }

        /**
         * Base64 encoded string of the partial payload JSON object
         */
        public Builder payload(Optional<? extends String> payload) {
            Utils.checkNotNull(payload, "payload");
            this.payload = payload;
            return this;
        }
        
        public SubscribersControllerGetNotificationsFeedRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            return new SubscribersControllerGetNotificationsFeedRequest(
                subscriberId,
                page,
                limit,
                read,
                seen,
                payload);
        }

        private static final LazySingletonValue<Optional<? extends Double>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "10",
                        new TypeReference<Optional<? extends Double>>() {});
    }
}
