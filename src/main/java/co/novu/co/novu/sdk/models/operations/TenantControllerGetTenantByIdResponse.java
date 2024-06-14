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

public class TenantControllerGetTenantByIdResponse implements co.novu.co.novu.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends co.novu.co.novu.sdk.models.components.GetTenantResponseDto> getTenantResponseDto;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public TenantControllerGetTenantByIdResponse(
            String contentType,
            Optional<? extends co.novu.co.novu.sdk.models.components.GetTenantResponseDto> getTenantResponseDto,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(getTenantResponseDto, "getTenantResponseDto");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.getTenantResponseDto = getTenantResponseDto;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public TenantControllerGetTenantByIdResponse(
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
    public Optional<co.novu.co.novu.sdk.models.components.GetTenantResponseDto> getTenantResponseDto() {
        return (Optional<co.novu.co.novu.sdk.models.components.GetTenantResponseDto>) getTenantResponseDto;
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
    public TenantControllerGetTenantByIdResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public TenantControllerGetTenantByIdResponse withGetTenantResponseDto(co.novu.co.novu.sdk.models.components.GetTenantResponseDto getTenantResponseDto) {
        Utils.checkNotNull(getTenantResponseDto, "getTenantResponseDto");
        this.getTenantResponseDto = Optional.ofNullable(getTenantResponseDto);
        return this;
    }

    /**
     * Ok
     */
    public TenantControllerGetTenantByIdResponse withGetTenantResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.GetTenantResponseDto> getTenantResponseDto) {
        Utils.checkNotNull(getTenantResponseDto, "getTenantResponseDto");
        this.getTenantResponseDto = getTenantResponseDto;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public TenantControllerGetTenantByIdResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public TenantControllerGetTenantByIdResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        TenantControllerGetTenantByIdResponse other = (TenantControllerGetTenantByIdResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.getTenantResponseDto, other.getTenantResponseDto) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            getTenantResponseDto,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TenantControllerGetTenantByIdResponse.class,
                "contentType", contentType,
                "getTenantResponseDto", getTenantResponseDto,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends co.novu.co.novu.sdk.models.components.GetTenantResponseDto> getTenantResponseDto = Optional.empty();
 
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
        public Builder getTenantResponseDto(co.novu.co.novu.sdk.models.components.GetTenantResponseDto getTenantResponseDto) {
            Utils.checkNotNull(getTenantResponseDto, "getTenantResponseDto");
            this.getTenantResponseDto = Optional.ofNullable(getTenantResponseDto);
            return this;
        }

        /**
         * Ok
         */
        public Builder getTenantResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.GetTenantResponseDto> getTenantResponseDto) {
            Utils.checkNotNull(getTenantResponseDto, "getTenantResponseDto");
            this.getTenantResponseDto = getTenantResponseDto;
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
        
        public TenantControllerGetTenantByIdResponse build() {
            return new TenantControllerGetTenantByIdResponse(
                contentType,
                getTenantResponseDto,
                statusCode,
                rawResponse);
        }
    }
}

