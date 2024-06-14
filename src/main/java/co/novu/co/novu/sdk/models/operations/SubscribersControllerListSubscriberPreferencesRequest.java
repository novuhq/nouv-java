/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

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

public class SubscribersControllerListSubscriberPreferencesRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscriberId")
    private String subscriberId;

    @JsonCreator
    public SubscribersControllerListSubscriberPreferencesRequest(
            String subscriberId) {
        Utils.checkNotNull(subscriberId, "subscriberId");
        this.subscriberId = subscriberId;
    }

    @JsonIgnore
    public String subscriberId() {
        return subscriberId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SubscribersControllerListSubscriberPreferencesRequest withSubscriberId(String subscriberId) {
        Utils.checkNotNull(subscriberId, "subscriberId");
        this.subscriberId = subscriberId;
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
        SubscribersControllerListSubscriberPreferencesRequest other = (SubscribersControllerListSubscriberPreferencesRequest) o;
        return 
            java.util.Objects.deepEquals(this.subscriberId, other.subscriberId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            subscriberId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscribersControllerListSubscriberPreferencesRequest.class,
                "subscriberId", subscriberId);
    }
    
    public final static class Builder {
 
        private String subscriberId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder subscriberId(String subscriberId) {
            Utils.checkNotNull(subscriberId, "subscriberId");
            this.subscriberId = subscriberId;
            return this;
        }
        
        public SubscribersControllerListSubscriberPreferencesRequest build() {
            return new SubscribersControllerListSubscriberPreferencesRequest(
                subscriberId);
        }
    }
}

