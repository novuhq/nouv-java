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

public class OrganizationControllerUpdateBrandingDetailsResponse implements co.novu.co.novu.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto> organizationBrandingResponseDto;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public OrganizationControllerUpdateBrandingDetailsResponse(
            String contentType,
            Optional<? extends co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto> organizationBrandingResponseDto,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(organizationBrandingResponseDto, "organizationBrandingResponseDto");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.organizationBrandingResponseDto = organizationBrandingResponseDto;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public OrganizationControllerUpdateBrandingDetailsResponse(
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
    public Optional<co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto> organizationBrandingResponseDto() {
        return (Optional<co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto>) organizationBrandingResponseDto;
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
    public OrganizationControllerUpdateBrandingDetailsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public OrganizationControllerUpdateBrandingDetailsResponse withOrganizationBrandingResponseDto(co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto organizationBrandingResponseDto) {
        Utils.checkNotNull(organizationBrandingResponseDto, "organizationBrandingResponseDto");
        this.organizationBrandingResponseDto = Optional.ofNullable(organizationBrandingResponseDto);
        return this;
    }

    /**
     * Ok
     */
    public OrganizationControllerUpdateBrandingDetailsResponse withOrganizationBrandingResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto> organizationBrandingResponseDto) {
        Utils.checkNotNull(organizationBrandingResponseDto, "organizationBrandingResponseDto");
        this.organizationBrandingResponseDto = organizationBrandingResponseDto;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public OrganizationControllerUpdateBrandingDetailsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public OrganizationControllerUpdateBrandingDetailsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        OrganizationControllerUpdateBrandingDetailsResponse other = (OrganizationControllerUpdateBrandingDetailsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.organizationBrandingResponseDto, other.organizationBrandingResponseDto) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            organizationBrandingResponseDto,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrganizationControllerUpdateBrandingDetailsResponse.class,
                "contentType", contentType,
                "organizationBrandingResponseDto", organizationBrandingResponseDto,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto> organizationBrandingResponseDto = Optional.empty();
 
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
        public Builder organizationBrandingResponseDto(co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto organizationBrandingResponseDto) {
            Utils.checkNotNull(organizationBrandingResponseDto, "organizationBrandingResponseDto");
            this.organizationBrandingResponseDto = Optional.ofNullable(organizationBrandingResponseDto);
            return this;
        }

        /**
         * Ok
         */
        public Builder organizationBrandingResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.OrganizationBrandingResponseDto> organizationBrandingResponseDto) {
            Utils.checkNotNull(organizationBrandingResponseDto, "organizationBrandingResponseDto");
            this.organizationBrandingResponseDto = organizationBrandingResponseDto;
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
        
        public OrganizationControllerUpdateBrandingDetailsResponse build() {
            return new OrganizationControllerUpdateBrandingDetailsResponse(
                contentType,
                organizationBrandingResponseDto,
                statusCode,
                rawResponse);
        }
    }
}

