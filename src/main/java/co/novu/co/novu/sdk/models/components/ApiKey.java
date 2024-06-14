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

public class ApiKey {

    @JsonProperty("_userId")
    private String userId;

    @JsonProperty("key")
    private String key;

    @JsonCreator
    public ApiKey(
            @JsonProperty("_userId") String userId,
            @JsonProperty("key") String key) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(key, "key");
        this.userId = userId;
        this.key = key;
    }

    @JsonIgnore
    public String userId() {
        return userId;
    }

    @JsonIgnore
    public String key() {
        return key;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ApiKey withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public ApiKey withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
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
        ApiKey other = (ApiKey) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.key, other.key);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            key);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiKey.class,
                "userId", userId,
                "key", key);
    }
    
    public final static class Builder {
 
        private String userId;
 
        private String key;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }
        
        public ApiKey build() {
            return new ApiKey(
                userId,
                key);
        }
    }
}
