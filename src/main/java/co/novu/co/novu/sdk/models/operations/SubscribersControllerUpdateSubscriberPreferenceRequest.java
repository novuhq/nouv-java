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

public class SubscribersControllerUpdateSubscriberPreferenceRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscriberId")
    private String subscriberId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=parameter")
    private String parameter;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private co.novu.co.novu.sdk.models.components.UpdateSubscriberPreferenceRequestDto updateSubscriberPreferenceRequestDto;

    @JsonCreator
    public SubscribersControllerUpdateSubscriberPreferenceRequest(
            String subscriberId,
            String parameter,
            co.novu.co.novu.sdk.models.components.UpdateSubscriberPreferenceRequestDto updateSubscriberPreferenceRequestDto) {
        Utils.checkNotNull(subscriberId, "subscriberId");
        Utils.checkNotNull(parameter, "parameter");
        Utils.checkNotNull(updateSubscriberPreferenceRequestDto, "updateSubscriberPreferenceRequestDto");
        this.subscriberId = subscriberId;
        this.parameter = parameter;
        this.updateSubscriberPreferenceRequestDto = updateSubscriberPreferenceRequestDto;
    }

    @JsonIgnore
    public String subscriberId() {
        return subscriberId;
    }

    @JsonIgnore
    public String parameter() {
        return parameter;
    }

    @JsonIgnore
    public co.novu.co.novu.sdk.models.components.UpdateSubscriberPreferenceRequestDto updateSubscriberPreferenceRequestDto() {
        return updateSubscriberPreferenceRequestDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SubscribersControllerUpdateSubscriberPreferenceRequest withSubscriberId(String subscriberId) {
        Utils.checkNotNull(subscriberId, "subscriberId");
        this.subscriberId = subscriberId;
        return this;
    }

    public SubscribersControllerUpdateSubscriberPreferenceRequest withParameter(String parameter) {
        Utils.checkNotNull(parameter, "parameter");
        this.parameter = parameter;
        return this;
    }

    public SubscribersControllerUpdateSubscriberPreferenceRequest withUpdateSubscriberPreferenceRequestDto(co.novu.co.novu.sdk.models.components.UpdateSubscriberPreferenceRequestDto updateSubscriberPreferenceRequestDto) {
        Utils.checkNotNull(updateSubscriberPreferenceRequestDto, "updateSubscriberPreferenceRequestDto");
        this.updateSubscriberPreferenceRequestDto = updateSubscriberPreferenceRequestDto;
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
        SubscribersControllerUpdateSubscriberPreferenceRequest other = (SubscribersControllerUpdateSubscriberPreferenceRequest) o;
        return 
            java.util.Objects.deepEquals(this.subscriberId, other.subscriberId) &&
            java.util.Objects.deepEquals(this.parameter, other.parameter) &&
            java.util.Objects.deepEquals(this.updateSubscriberPreferenceRequestDto, other.updateSubscriberPreferenceRequestDto);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            subscriberId,
            parameter,
            updateSubscriberPreferenceRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscribersControllerUpdateSubscriberPreferenceRequest.class,
                "subscriberId", subscriberId,
                "parameter", parameter,
                "updateSubscriberPreferenceRequestDto", updateSubscriberPreferenceRequestDto);
    }
    
    public final static class Builder {
 
        private String subscriberId;
 
        private String parameter;
 
        private co.novu.co.novu.sdk.models.components.UpdateSubscriberPreferenceRequestDto updateSubscriberPreferenceRequestDto;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder subscriberId(String subscriberId) {
            Utils.checkNotNull(subscriberId, "subscriberId");
            this.subscriberId = subscriberId;
            return this;
        }

        public Builder parameter(String parameter) {
            Utils.checkNotNull(parameter, "parameter");
            this.parameter = parameter;
            return this;
        }

        public Builder updateSubscriberPreferenceRequestDto(co.novu.co.novu.sdk.models.components.UpdateSubscriberPreferenceRequestDto updateSubscriberPreferenceRequestDto) {
            Utils.checkNotNull(updateSubscriberPreferenceRequestDto, "updateSubscriberPreferenceRequestDto");
            this.updateSubscriberPreferenceRequestDto = updateSubscriberPreferenceRequestDto;
            return this;
        }
        
        public SubscribersControllerUpdateSubscriberPreferenceRequest build() {
            return new SubscribersControllerUpdateSubscriberPreferenceRequest(
                subscriberId,
                parameter,
                updateSubscriberPreferenceRequestDto);
        }
    }
}

