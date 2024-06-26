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

public class TenantControllerUpdateTenantResponse implements co.novu.co.novu.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Ok
     */
    private Optional<? extends co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto> updateTenantResponseDto;

    @JsonCreator
    public TenantControllerUpdateTenantResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto> updateTenantResponseDto) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateTenantResponseDto, "updateTenantResponseDto");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateTenantResponseDto = updateTenantResponseDto;
    }
    
    public TenantControllerUpdateTenantResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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

    /**
     * Ok
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto> updateTenantResponseDto() {
        return (Optional<co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto>) updateTenantResponseDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public TenantControllerUpdateTenantResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public TenantControllerUpdateTenantResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public TenantControllerUpdateTenantResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Ok
     */
    public TenantControllerUpdateTenantResponse withUpdateTenantResponseDto(co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto updateTenantResponseDto) {
        Utils.checkNotNull(updateTenantResponseDto, "updateTenantResponseDto");
        this.updateTenantResponseDto = Optional.ofNullable(updateTenantResponseDto);
        return this;
    }

    /**
     * Ok
     */
    public TenantControllerUpdateTenantResponse withUpdateTenantResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto> updateTenantResponseDto) {
        Utils.checkNotNull(updateTenantResponseDto, "updateTenantResponseDto");
        this.updateTenantResponseDto = updateTenantResponseDto;
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
        TenantControllerUpdateTenantResponse other = (TenantControllerUpdateTenantResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.updateTenantResponseDto, other.updateTenantResponseDto);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            updateTenantResponseDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TenantControllerUpdateTenantResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateTenantResponseDto", updateTenantResponseDto);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto> updateTenantResponseDto = Optional.empty();  
        
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

        /**
         * Ok
         */
        public Builder updateTenantResponseDto(co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto updateTenantResponseDto) {
            Utils.checkNotNull(updateTenantResponseDto, "updateTenantResponseDto");
            this.updateTenantResponseDto = Optional.ofNullable(updateTenantResponseDto);
            return this;
        }

        /**
         * Ok
         */
        public Builder updateTenantResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto> updateTenantResponseDto) {
            Utils.checkNotNull(updateTenantResponseDto, "updateTenantResponseDto");
            this.updateTenantResponseDto = updateTenantResponseDto;
            return this;
        }
        
        public TenantControllerUpdateTenantResponse build() {
            return new TenantControllerUpdateTenantResponse(
                contentType,
                statusCode,
                rawResponse,
                updateTenantResponseDto);
        }
    }
}

