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

public class EnvironmentsControllerRegenerateOrganizationApiKeysResponse implements co.novu.co.novu.sdk.utils.Response {

    /**
     * Created
     */
    private Optional<? extends java.util.List<co.novu.co.novu.sdk.models.components.ApiKey>> apiKeys;

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

    @JsonCreator
    public EnvironmentsControllerRegenerateOrganizationApiKeysResponse(
            Optional<? extends java.util.List<co.novu.co.novu.sdk.models.components.ApiKey>> apiKeys,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiKeys, "apiKeys");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiKeys = apiKeys;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public EnvironmentsControllerRegenerateOrganizationApiKeysResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<co.novu.co.novu.sdk.models.components.ApiKey>> apiKeys() {
        return (Optional<java.util.List<co.novu.co.novu.sdk.models.components.ApiKey>>) apiKeys;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Created
     */
    public EnvironmentsControllerRegenerateOrganizationApiKeysResponse withApiKeys(java.util.List<co.novu.co.novu.sdk.models.components.ApiKey> apiKeys) {
        Utils.checkNotNull(apiKeys, "apiKeys");
        this.apiKeys = Optional.ofNullable(apiKeys);
        return this;
    }

    /**
     * Created
     */
    public EnvironmentsControllerRegenerateOrganizationApiKeysResponse withApiKeys(Optional<? extends java.util.List<co.novu.co.novu.sdk.models.components.ApiKey>> apiKeys) {
        Utils.checkNotNull(apiKeys, "apiKeys");
        this.apiKeys = apiKeys;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public EnvironmentsControllerRegenerateOrganizationApiKeysResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public EnvironmentsControllerRegenerateOrganizationApiKeysResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public EnvironmentsControllerRegenerateOrganizationApiKeysResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        EnvironmentsControllerRegenerateOrganizationApiKeysResponse other = (EnvironmentsControllerRegenerateOrganizationApiKeysResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiKeys, other.apiKeys) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKeys,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnvironmentsControllerRegenerateOrganizationApiKeysResponse.class,
                "apiKeys", apiKeys,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<co.novu.co.novu.sdk.models.components.ApiKey>> apiKeys = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Created
         */
        public Builder apiKeys(java.util.List<co.novu.co.novu.sdk.models.components.ApiKey> apiKeys) {
            Utils.checkNotNull(apiKeys, "apiKeys");
            this.apiKeys = Optional.ofNullable(apiKeys);
            return this;
        }

        /**
         * Created
         */
        public Builder apiKeys(Optional<? extends java.util.List<co.novu.co.novu.sdk.models.components.ApiKey>> apiKeys) {
            Utils.checkNotNull(apiKeys, "apiKeys");
            this.apiKeys = apiKeys;
            return this;
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
        
        public EnvironmentsControllerRegenerateOrganizationApiKeysResponse build() {
            return new EnvironmentsControllerRegenerateOrganizationApiKeysResponse(
                apiKeys,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

