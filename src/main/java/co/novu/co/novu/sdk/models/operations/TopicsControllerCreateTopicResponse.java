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

public class TopicsControllerCreateTopicResponse implements co.novu.co.novu.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Created
     */
    private Optional<? extends co.novu.co.novu.sdk.models.components.CreateTopicResponseDto> createTopicResponseDto;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public TopicsControllerCreateTopicResponse(
            String contentType,
            Optional<? extends co.novu.co.novu.sdk.models.components.CreateTopicResponseDto> createTopicResponseDto,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createTopicResponseDto, "createTopicResponseDto");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createTopicResponseDto = createTopicResponseDto;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public TopicsControllerCreateTopicResponse(
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
     * Created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<co.novu.co.novu.sdk.models.components.CreateTopicResponseDto> createTopicResponseDto() {
        return (Optional<co.novu.co.novu.sdk.models.components.CreateTopicResponseDto>) createTopicResponseDto;
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
    public TopicsControllerCreateTopicResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Created
     */
    public TopicsControllerCreateTopicResponse withCreateTopicResponseDto(co.novu.co.novu.sdk.models.components.CreateTopicResponseDto createTopicResponseDto) {
        Utils.checkNotNull(createTopicResponseDto, "createTopicResponseDto");
        this.createTopicResponseDto = Optional.ofNullable(createTopicResponseDto);
        return this;
    }

    /**
     * Created
     */
    public TopicsControllerCreateTopicResponse withCreateTopicResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.CreateTopicResponseDto> createTopicResponseDto) {
        Utils.checkNotNull(createTopicResponseDto, "createTopicResponseDto");
        this.createTopicResponseDto = createTopicResponseDto;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public TopicsControllerCreateTopicResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public TopicsControllerCreateTopicResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        TopicsControllerCreateTopicResponse other = (TopicsControllerCreateTopicResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createTopicResponseDto, other.createTopicResponseDto) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createTopicResponseDto,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TopicsControllerCreateTopicResponse.class,
                "contentType", contentType,
                "createTopicResponseDto", createTopicResponseDto,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends co.novu.co.novu.sdk.models.components.CreateTopicResponseDto> createTopicResponseDto = Optional.empty();
 
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
         * Created
         */
        public Builder createTopicResponseDto(co.novu.co.novu.sdk.models.components.CreateTopicResponseDto createTopicResponseDto) {
            Utils.checkNotNull(createTopicResponseDto, "createTopicResponseDto");
            this.createTopicResponseDto = Optional.ofNullable(createTopicResponseDto);
            return this;
        }

        /**
         * Created
         */
        public Builder createTopicResponseDto(Optional<? extends co.novu.co.novu.sdk.models.components.CreateTopicResponseDto> createTopicResponseDto) {
            Utils.checkNotNull(createTopicResponseDto, "createTopicResponseDto");
            this.createTopicResponseDto = createTopicResponseDto;
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
        
        public TopicsControllerCreateTopicResponse build() {
            return new TopicsControllerCreateTopicResponse(
                contentType,
                createTopicResponseDto,
                statusCode,
                rawResponse);
        }
    }
}
