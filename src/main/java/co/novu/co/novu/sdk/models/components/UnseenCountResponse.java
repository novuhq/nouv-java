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

public class UnseenCountResponse {

    @JsonProperty("count")
    private double count;

    @JsonCreator
    public UnseenCountResponse(
            @JsonProperty("count") double count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
    }

    @JsonIgnore
    public double count() {
        return count;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UnseenCountResponse withCount(double count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
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
        UnseenCountResponse other = (UnseenCountResponse) o;
        return 
            java.util.Objects.deepEquals(this.count, other.count);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            count);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnseenCountResponse.class,
                "count", count);
    }
    
    public final static class Builder {
 
        private Double count;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder count(double count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }
        
        public UnseenCountResponse build() {
            return new UnseenCountResponse(
                count);
        }
    }
}

