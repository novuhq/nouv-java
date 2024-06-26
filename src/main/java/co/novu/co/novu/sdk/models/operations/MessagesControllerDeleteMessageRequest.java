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

public class MessagesControllerDeleteMessageRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=messageId")
    private String messageId;

    @JsonCreator
    public MessagesControllerDeleteMessageRequest(
            String messageId) {
        Utils.checkNotNull(messageId, "messageId");
        this.messageId = messageId;
    }

    @JsonIgnore
    public String messageId() {
        return messageId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MessagesControllerDeleteMessageRequest withMessageId(String messageId) {
        Utils.checkNotNull(messageId, "messageId");
        this.messageId = messageId;
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
        MessagesControllerDeleteMessageRequest other = (MessagesControllerDeleteMessageRequest) o;
        return 
            java.util.Objects.deepEquals(this.messageId, other.messageId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            messageId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MessagesControllerDeleteMessageRequest.class,
                "messageId", messageId);
    }
    
    public final static class Builder {
 
        private String messageId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder messageId(String messageId) {
            Utils.checkNotNull(messageId, "messageId");
            this.messageId = messageId;
            return this;
        }
        
        public MessagesControllerDeleteMessageRequest build() {
            return new MessagesControllerDeleteMessageRequest(
                messageId);
        }
    }
}

