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

public class TopicsControllerDeleteTopicRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=topicKey")
    private String topicKey;

    @JsonCreator
    public TopicsControllerDeleteTopicRequest(
            String topicKey) {
        Utils.checkNotNull(topicKey, "topicKey");
        this.topicKey = topicKey;
    }

    @JsonIgnore
    public String topicKey() {
        return topicKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TopicsControllerDeleteTopicRequest withTopicKey(String topicKey) {
        Utils.checkNotNull(topicKey, "topicKey");
        this.topicKey = topicKey;
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
        TopicsControllerDeleteTopicRequest other = (TopicsControllerDeleteTopicRequest) o;
        return 
            java.util.Objects.deepEquals(this.topicKey, other.topicKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            topicKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TopicsControllerDeleteTopicRequest.class,
                "topicKey", topicKey);
    }
    
    public final static class Builder {
 
        private String topicKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder topicKey(String topicKey) {
            Utils.checkNotNull(topicKey, "topicKey");
            this.topicKey = topicKey;
            return this;
        }
        
        public TopicsControllerDeleteTopicRequest build() {
            return new TopicsControllerDeleteTopicRequest(
                topicKey);
        }
    }
}

