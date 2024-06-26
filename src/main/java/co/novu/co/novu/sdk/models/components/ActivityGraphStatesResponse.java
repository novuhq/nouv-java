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

public class ActivityGraphStatesResponse {

    @JsonProperty("_id")
    private String id;

    @JsonProperty("channels")
    private java.util.List<Channels> channels;

    @JsonProperty("count")
    private double count;

    @JsonProperty("templates")
    private java.util.List<String> templates;

    @JsonCreator
    public ActivityGraphStatesResponse(
            @JsonProperty("_id") String id,
            @JsonProperty("channels") java.util.List<Channels> channels,
            @JsonProperty("count") double count,
            @JsonProperty("templates") java.util.List<String> templates) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(channels, "channels");
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(templates, "templates");
        this.id = id;
        this.channels = channels;
        this.count = count;
        this.templates = templates;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public java.util.List<Channels> channels() {
        return channels;
    }

    @JsonIgnore
    public double count() {
        return count;
    }

    @JsonIgnore
    public java.util.List<String> templates() {
        return templates;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivityGraphStatesResponse withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ActivityGraphStatesResponse withChannels(java.util.List<Channels> channels) {
        Utils.checkNotNull(channels, "channels");
        this.channels = channels;
        return this;
    }

    public ActivityGraphStatesResponse withCount(double count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    public ActivityGraphStatesResponse withTemplates(java.util.List<String> templates) {
        Utils.checkNotNull(templates, "templates");
        this.templates = templates;
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
        ActivityGraphStatesResponse other = (ActivityGraphStatesResponse) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.channels, other.channels) &&
            java.util.Objects.deepEquals(this.count, other.count) &&
            java.util.Objects.deepEquals(this.templates, other.templates);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            channels,
            count,
            templates);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActivityGraphStatesResponse.class,
                "id", id,
                "channels", channels,
                "count", count,
                "templates", templates);
    }
    
    public final static class Builder {
 
        private String id;
 
        private java.util.List<Channels> channels;
 
        private Double count;
 
        private java.util.List<String> templates;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder channels(java.util.List<Channels> channels) {
            Utils.checkNotNull(channels, "channels");
            this.channels = channels;
            return this;
        }

        public Builder count(double count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }

        public Builder templates(java.util.List<String> templates) {
            Utils.checkNotNull(templates, "templates");
            this.templates = templates;
            return this;
        }
        
        public ActivityGraphStatesResponse build() {
            return new ActivityGraphStatesResponse(
                id,
                channels,
                count,
                templates);
        }
    }
}

