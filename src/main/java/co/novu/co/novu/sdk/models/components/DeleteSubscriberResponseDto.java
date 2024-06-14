/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DeleteSubscriberResponseDto {

    /**
     * A boolean stating the success of the action
     */
    @JsonProperty("acknowledged")
    private boolean acknowledged;

    /**
     * The status enum for the performed action
     */
    @JsonProperty("status")
    private DeleteSubscriberResponseDtoStatus status;

    @JsonCreator
    public DeleteSubscriberResponseDto(
            @JsonProperty("acknowledged") boolean acknowledged,
            @JsonProperty("status") DeleteSubscriberResponseDtoStatus status) {
        Utils.checkNotNull(acknowledged, "acknowledged");
        Utils.checkNotNull(status, "status");
        this.acknowledged = acknowledged;
        this.status = status;
    }

    /**
     * A boolean stating the success of the action
     */
    @JsonIgnore
    public boolean acknowledged() {
        return acknowledged;
    }

    /**
     * The status enum for the performed action
     */
    @JsonIgnore
    public DeleteSubscriberResponseDtoStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A boolean stating the success of the action
     */
    public DeleteSubscriberResponseDto withAcknowledged(boolean acknowledged) {
        Utils.checkNotNull(acknowledged, "acknowledged");
        this.acknowledged = acknowledged;
        return this;
    }

    /**
     * The status enum for the performed action
     */
    public DeleteSubscriberResponseDto withStatus(DeleteSubscriberResponseDtoStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        DeleteSubscriberResponseDto other = (DeleteSubscriberResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.acknowledged, other.acknowledged) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            acknowledged,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteSubscriberResponseDto.class,
                "acknowledged", acknowledged,
                "status", status);
    }
    
    public final static class Builder {
 
        private Boolean acknowledged;
 
        private DeleteSubscriberResponseDtoStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A boolean stating the success of the action
         */
        public Builder acknowledged(boolean acknowledged) {
            Utils.checkNotNull(acknowledged, "acknowledged");
            this.acknowledged = acknowledged;
            return this;
        }

        /**
         * The status enum for the performed action
         */
        public Builder status(DeleteSubscriberResponseDtoStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public DeleteSubscriberResponseDto build() {
            return new DeleteSubscriberResponseDto(
                acknowledged,
                status);
        }
    }
}

