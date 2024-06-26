/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class SubscribersControllerRemoveSubscriberResponse implements co.novu.co.novu.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto> deleteSubscriberResponseDto;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public SubscribersControllerRemoveSubscriberResponse(
            String contentType,
            Optional<? extends co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto> deleteSubscriberResponseDto,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(deleteSubscriberResponseDto, "deleteSubscriberResponseDto");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.deleteSubscriberResponseDto = deleteSubscriberResponseDto;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public SubscribersControllerRemoveSubscriberResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Ok
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto> deleteSubscriberResponseDto() {
        return (Optional<co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto>) deleteSubscriberResponseDto;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public SubscribersControllerRemoveSubscriberResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public SubscribersControllerRemoveSubscriberResponse withDeleteSubscriberResponseDto(co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto deleteSubscriberResponseDto) {
        Utils.checkNotNull(deleteSubscriberResponseDto, "deleteSubscriberResponseDto");
        this.deleteSubscriberResponseDto = Optional.ofNullable(deleteSubscriberResponseDto);
        return this;
    }

    /**
     * Ok
     */
    public SubscribersControllerRemoveSubscriberResponse withDeleteSubscriberResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto> deleteSubscriberResponseDto) {
        Utils.checkNotNull(deleteSubscriberResponseDto, "deleteSubscriberResponseDto");
        this.deleteSubscriberResponseDto = deleteSubscriberResponseDto;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public SubscribersControllerRemoveSubscriberResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public SubscribersControllerRemoveSubscriberResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        SubscribersControllerRemoveSubscriberResponse other = (SubscribersControllerRemoveSubscriberResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.deleteSubscriberResponseDto, other.deleteSubscriberResponseDto) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            deleteSubscriberResponseDto,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SubscribersControllerRemoveSubscriberResponse.class,
                "contentType", contentType,
                "deleteSubscriberResponseDto", deleteSubscriberResponseDto,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto> deleteSubscriberResponseDto = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * Ok
         */
        public Builder deleteSubscriberResponseDto(co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto deleteSubscriberResponseDto) {
            Utils.checkNotNull(deleteSubscriberResponseDto, "deleteSubscriberResponseDto");
            this.deleteSubscriberResponseDto = Optional.ofNullable(deleteSubscriberResponseDto);
            return this;
        }

        /**
         * Ok
         */
        public Builder deleteSubscriberResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.DeleteSubscriberResponseDto> deleteSubscriberResponseDto) {
            Utils.checkNotNull(deleteSubscriberResponseDto, "deleteSubscriberResponseDto");
            this.deleteSubscriberResponseDto = deleteSubscriberResponseDto;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public SubscribersControllerRemoveSubscriberResponse build() {
            return new SubscribersControllerRemoveSubscriberResponse(
                contentType,
                deleteSubscriberResponseDto,
                statusCode,
                rawResponse);
        }
    }
}

