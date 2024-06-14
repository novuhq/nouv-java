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

public class DelayScheduledMetadata {

    @JsonProperty("delayPath")
    private String delayPath;

    @JsonProperty("type")
    private DelayScheduledMetadataType type;

    @JsonCreator
    public DelayScheduledMetadata(
            @JsonProperty("delayPath") String delayPath,
            @JsonProperty("type") DelayScheduledMetadataType type) {
        Utils.checkNotNull(delayPath, "delayPath");
        Utils.checkNotNull(type, "type");
        this.delayPath = delayPath;
        this.type = type;
    }

    @JsonIgnore
    public String delayPath() {
        return delayPath;
    }

    @JsonIgnore
    public DelayScheduledMetadataType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DelayScheduledMetadata withDelayPath(String delayPath) {
        Utils.checkNotNull(delayPath, "delayPath");
        this.delayPath = delayPath;
        return this;
    }

    public DelayScheduledMetadata withType(DelayScheduledMetadataType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        DelayScheduledMetadata other = (DelayScheduledMetadata) o;
        return 
            java.util.Objects.deepEquals(this.delayPath, other.delayPath) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            delayPath,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DelayScheduledMetadata.class,
                "delayPath", delayPath,
                "type", type);
    }
    
    public final static class Builder {
 
        private String delayPath;
 
        private DelayScheduledMetadataType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder delayPath(String delayPath) {
            Utils.checkNotNull(delayPath, "delayPath");
            this.delayPath = delayPath;
            return this;
        }

        public Builder type(DelayScheduledMetadataType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public DelayScheduledMetadata build() {
            return new DelayScheduledMetadata(
                delayPath,
                type);
        }
    }
}

