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

public class TopicsControllerRenameTopicRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=topicKey")
    private String topicKey;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private co.novu.co.novu.sdk.models.components.RenameTopicRequestDto renameTopicRequestDto;

    @JsonCreator
    public TopicsControllerRenameTopicRequest(
            String topicKey,
            co.novu.co.novu.sdk.models.components.RenameTopicRequestDto renameTopicRequestDto) {
        Utils.checkNotNull(topicKey, "topicKey");
        Utils.checkNotNull(renameTopicRequestDto, "renameTopicRequestDto");
        this.topicKey = topicKey;
        this.renameTopicRequestDto = renameTopicRequestDto;
    }

    @JsonIgnore
    public String topicKey() {
        return topicKey;
    }

    @JsonIgnore
    public co.novu.co.novu.sdk.models.components.RenameTopicRequestDto renameTopicRequestDto() {
        return renameTopicRequestDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TopicsControllerRenameTopicRequest withTopicKey(String topicKey) {
        Utils.checkNotNull(topicKey, "topicKey");
        this.topicKey = topicKey;
        return this;
    }

    public TopicsControllerRenameTopicRequest withRenameTopicRequestDto(co.novu.co.novu.sdk.models.components.RenameTopicRequestDto renameTopicRequestDto) {
        Utils.checkNotNull(renameTopicRequestDto, "renameTopicRequestDto");
        this.renameTopicRequestDto = renameTopicRequestDto;
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
        TopicsControllerRenameTopicRequest other = (TopicsControllerRenameTopicRequest) o;
        return 
            java.util.Objects.deepEquals(this.topicKey, other.topicKey) &&
            java.util.Objects.deepEquals(this.renameTopicRequestDto, other.renameTopicRequestDto);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            topicKey,
            renameTopicRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TopicsControllerRenameTopicRequest.class,
                "topicKey", topicKey,
                "renameTopicRequestDto", renameTopicRequestDto);
    }
    
    public final static class Builder {
 
        private String topicKey;
 
        private co.novu.co.novu.sdk.models.components.RenameTopicRequestDto renameTopicRequestDto;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder topicKey(String topicKey) {
            Utils.checkNotNull(topicKey, "topicKey");
            this.topicKey = topicKey;
            return this;
        }

        public Builder renameTopicRequestDto(co.novu.co.novu.sdk.models.components.RenameTopicRequestDto renameTopicRequestDto) {
            Utils.checkNotNull(renameTopicRequestDto, "renameTopicRequestDto");
            this.renameTopicRequestDto = renameTopicRequestDto;
            return this;
        }
        
        public TopicsControllerRenameTopicRequest build() {
            return new TopicsControllerRenameTopicRequest(
                topicKey,
                renameTopicRequestDto);
        }
    }
}

