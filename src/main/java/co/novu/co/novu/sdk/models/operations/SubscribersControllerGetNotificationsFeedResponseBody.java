/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SubscribersControllerGetNotificationsFeedResponseBody {

    @JsonProperty("data")
    private java.util.List<co.novu.co.novu.sdk.models.components.FeedResponseDto> data;

    /**
     * Does the list have more items to fetch
     */
    @JsonProperty("hasMore")
    private boolean hasMore;

    /**
     * The current page of the paginated response
     */
    @JsonProperty("page")
    private double page;

    /**
     * Number of items on each page
     */
    @JsonProperty("pageSize")
    private double pageSize;

    @JsonCreator
    public SubscribersControllerGetNotificationsFeedResponseBody(
            @JsonProperty("data") java.util.List<co.novu.co.novu.sdk.models.components.FeedResponseDto> data,
            @JsonProperty("hasMore") boolean hasMore,
            @JsonProperty("page") double page,
            @JsonProperty("pageSize") double pageSize) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(hasMore, "hasMore");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        this.data = data;
        this.hasMore = hasMore;
        this.page = page;
        this.pageSize = pageSize;
    }

    @JsonIgnore
    public java.util.List<co.novu.co.novu.sdk.models.components.FeedResponseDto> data() {
        return data;
    }

    /**
     * Does the list have more items to fetch
     */
    @JsonIgnore
    public boolean hasMore() {
        return hasMore;
    }

    /**
     * The current page of the paginated response
     */
    @JsonIgnore
    public double page() {
        return page;
    }

    /**
     * Number of items on each page
     */
    @JsonIgnore
    public double pageSize() {
        return pageSize;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SubscribersControllerGetNotificationsFeedResponseBody withData(java.util.List<co.novu.co.novu.sdk.models.components.FeedResponseDto> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Does the list have more items to fetch
     */
    public SubscribersControllerGetNotificationsFeedResponseBody withHasMore(boolean hasMore) {
        Utils.checkNotNull(hasMore, "hasMore");
        this.hasMore = hasMore;
        return this;
    }

    /**
     * The current page of the paginated response
     */
    public SubscribersControllerGetNotificationsFeedResponseBody withPage(double page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of items on each page
     */
    public SubscribersControllerGetNotificationsFeedResponseBody withPageSize(double pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
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
        SubscribersControllerGetNotificationsFeedResponseBody other = (SubscribersControllerGetNotificationsFeedResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.hasMore, other.hasMore) &&
            java.util.Objects.deepEquals(this.page, other.page) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            hasMore,
            page,
            pageSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscribersControllerGetNotificationsFeedResponseBody.class,
                "data", data,
                "hasMore", hasMore,
                "page", page,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private java.util.List<co.novu.co.novu.sdk.models.components.FeedResponseDto> data;
 
        private Boolean hasMore;
 
        private Double page;
 
        private Double pageSize;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<co.novu.co.novu.sdk.models.components.FeedResponseDto> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Does the list have more items to fetch
         */
        public Builder hasMore(boolean hasMore) {
            Utils.checkNotNull(hasMore, "hasMore");
            this.hasMore = hasMore;
            return this;
        }

        /**
         * The current page of the paginated response
         */
        public Builder page(double page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * Number of items on each page
         */
        public Builder pageSize(double pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }
        
        public SubscribersControllerGetNotificationsFeedResponseBody build() {
            return new SubscribersControllerGetNotificationsFeedResponseBody(
                data,
                hasMore,
                page,
                pageSize);
        }
    }
}

