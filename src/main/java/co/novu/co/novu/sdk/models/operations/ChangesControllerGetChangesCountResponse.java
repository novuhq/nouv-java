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

public class ChangesControllerGetChangesCountResponse implements co.novu.co.novu.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private Optional<? extends co.novu.co.novu.sdk.models.components.DataNumberDto> dataNumberDto;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ChangesControllerGetChangesCountResponse(
            String contentType,
            Optional<? extends co.novu.co.novu.sdk.models.components.DataNumberDto> dataNumberDto,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(dataNumberDto, "dataNumberDto");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.dataNumberDto = dataNumberDto;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ChangesControllerGetChangesCountResponse(
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<co.novu.co.novu.sdk.models.components.DataNumberDto> dataNumberDto() {
        return (Optional<co.novu.co.novu.sdk.models.components.DataNumberDto>) dataNumberDto;
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
    public ChangesControllerGetChangesCountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public ChangesControllerGetChangesCountResponse withDataNumberDto(co.novu.co.novu.sdk.models.components.DataNumberDto dataNumberDto) {
        Utils.checkNotNull(dataNumberDto, "dataNumberDto");
        this.dataNumberDto = Optional.ofNullable(dataNumberDto);
        return this;
    }

    public ChangesControllerGetChangesCountResponse withDataNumberDto(Optional<? extends co.novu.co.novu.sdk.models.components.DataNumberDto> dataNumberDto) {
        Utils.checkNotNull(dataNumberDto, "dataNumberDto");
        this.dataNumberDto = dataNumberDto;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ChangesControllerGetChangesCountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ChangesControllerGetChangesCountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ChangesControllerGetChangesCountResponse other = (ChangesControllerGetChangesCountResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.dataNumberDto, other.dataNumberDto) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            dataNumberDto,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ChangesControllerGetChangesCountResponse.class,
                "contentType", contentType,
                "dataNumberDto", dataNumberDto,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends co.novu.co.novu.sdk.models.components.DataNumberDto> dataNumberDto = Optional.empty();
 
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

        public Builder dataNumberDto(co.novu.co.novu.sdk.models.components.DataNumberDto dataNumberDto) {
            Utils.checkNotNull(dataNumberDto, "dataNumberDto");
            this.dataNumberDto = Optional.ofNullable(dataNumberDto);
            return this;
        }

        public Builder dataNumberDto(Optional<? extends co.novu.co.novu.sdk.models.components.DataNumberDto> dataNumberDto) {
            Utils.checkNotNull(dataNumberDto, "dataNumberDto");
            this.dataNumberDto = dataNumberDto;
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
        
        public ChangesControllerGetChangesCountResponse build() {
            return new ChangesControllerGetChangesCountResponse(
                contentType,
                dataNumberDto,
                statusCode,
                rawResponse);
        }
    }
}

