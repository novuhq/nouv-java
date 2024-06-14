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

public class NotificationGroupsControllerDeleteNotificationGroupResponse implements co.novu.co.novu.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto> deleteNotificationGroupResponseDto;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public NotificationGroupsControllerDeleteNotificationGroupResponse(
            String contentType,
            Optional<? extends co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto> deleteNotificationGroupResponseDto,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(deleteNotificationGroupResponseDto, "deleteNotificationGroupResponseDto");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.deleteNotificationGroupResponseDto = deleteNotificationGroupResponseDto;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public NotificationGroupsControllerDeleteNotificationGroupResponse(
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
    public Optional<co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto> deleteNotificationGroupResponseDto() {
        return (Optional<co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto>) deleteNotificationGroupResponseDto;
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
    public NotificationGroupsControllerDeleteNotificationGroupResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public NotificationGroupsControllerDeleteNotificationGroupResponse withDeleteNotificationGroupResponseDto(co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto deleteNotificationGroupResponseDto) {
        Utils.checkNotNull(deleteNotificationGroupResponseDto, "deleteNotificationGroupResponseDto");
        this.deleteNotificationGroupResponseDto = Optional.ofNullable(deleteNotificationGroupResponseDto);
        return this;
    }

    /**
     * Ok
     */
    public NotificationGroupsControllerDeleteNotificationGroupResponse withDeleteNotificationGroupResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto> deleteNotificationGroupResponseDto) {
        Utils.checkNotNull(deleteNotificationGroupResponseDto, "deleteNotificationGroupResponseDto");
        this.deleteNotificationGroupResponseDto = deleteNotificationGroupResponseDto;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public NotificationGroupsControllerDeleteNotificationGroupResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public NotificationGroupsControllerDeleteNotificationGroupResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        NotificationGroupsControllerDeleteNotificationGroupResponse other = (NotificationGroupsControllerDeleteNotificationGroupResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.deleteNotificationGroupResponseDto, other.deleteNotificationGroupResponseDto) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            deleteNotificationGroupResponseDto,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NotificationGroupsControllerDeleteNotificationGroupResponse.class,
                "contentType", contentType,
                "deleteNotificationGroupResponseDto", deleteNotificationGroupResponseDto,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto> deleteNotificationGroupResponseDto = Optional.empty();
 
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
        public Builder deleteNotificationGroupResponseDto(co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto deleteNotificationGroupResponseDto) {
            Utils.checkNotNull(deleteNotificationGroupResponseDto, "deleteNotificationGroupResponseDto");
            this.deleteNotificationGroupResponseDto = Optional.ofNullable(deleteNotificationGroupResponseDto);
            return this;
        }

        /**
         * Ok
         */
        public Builder deleteNotificationGroupResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.DeleteNotificationGroupResponseDto> deleteNotificationGroupResponseDto) {
            Utils.checkNotNull(deleteNotificationGroupResponseDto, "deleteNotificationGroupResponseDto");
            this.deleteNotificationGroupResponseDto = deleteNotificationGroupResponseDto;
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
        
        public NotificationGroupsControllerDeleteNotificationGroupResponse build() {
            return new NotificationGroupsControllerDeleteNotificationGroupResponse(
                contentType,
                deleteNotificationGroupResponseDto,
                statusCode,
                rawResponse);
        }
    }
}
