/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

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

public class ActivitiesResponseDto {

    @JsonProperty("data")
    private java.util.List<ActivityNotificationResponseDto> data;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonProperty("page")
    private double page;

    @JsonProperty("pageSize")
    private double pageSize;

    @JsonCreator
    public ActivitiesResponseDto(
            @JsonProperty("data") java.util.List<ActivityNotificationResponseDto> data,
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
    public java.util.List<ActivityNotificationResponseDto> data() {
        return data;
    }

    @JsonIgnore
    public boolean hasMore() {
        return hasMore;
    }

    @JsonIgnore
    public double page() {
        return page;
    }

    @JsonIgnore
    public double pageSize() {
        return pageSize;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivitiesResponseDto withData(java.util.List<ActivityNotificationResponseDto> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public ActivitiesResponseDto withHasMore(boolean hasMore) {
        Utils.checkNotNull(hasMore, "hasMore");
        this.hasMore = hasMore;
        return this;
    }

    public ActivitiesResponseDto withPage(double page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    public ActivitiesResponseDto withPageSize(double pageSize) {
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
        ActivitiesResponseDto other = (ActivitiesResponseDto) o;
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
        return Utils.toString(ActivitiesResponseDto.class,
                "data", data,
                "hasMore", hasMore,
                "page", page,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private java.util.List<ActivityNotificationResponseDto> data;
 
        private Boolean hasMore;
 
        private Double page;
 
        private Double pageSize;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<ActivityNotificationResponseDto> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder hasMore(boolean hasMore) {
            Utils.checkNotNull(hasMore, "hasMore");
            this.hasMore = hasMore;
            return this;
        }

        public Builder page(double page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        public Builder pageSize(double pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }
        
        public ActivitiesResponseDto build() {
            return new ActivitiesResponseDto(
                data,
                hasMore,
                page,
                pageSize);
        }
    }
}

