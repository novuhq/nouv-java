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

public class EventsControllerCancelRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transactionId")
    private String transactionId;

    @JsonCreator
    public EventsControllerCancelRequest(
            String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
    }

    @JsonIgnore
    public String transactionId() {
        return transactionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EventsControllerCancelRequest withTransactionId(String transactionId) {
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
        EventsControllerCancelRequest other = (EventsControllerCancelRequest) o;
        return 
            java.util.Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EventsControllerCancelRequest.class,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private String transactionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }
        
        public EventsControllerCancelRequest build() {
            return new EventsControllerCancelRequest(
                transactionId);
        }
    }
}
