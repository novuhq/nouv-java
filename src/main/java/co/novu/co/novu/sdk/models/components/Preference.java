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

public class Preference {

    /**
     * Subscriber preferences for the different channels regarding this workflow
     */
    @JsonProperty("channels")
    private PreferenceChannels channels;

    /**
     * Sets if the workflow is fully enabled for all channels or not for the subscriber.
     */
    @JsonProperty("enabled")
    private boolean enabled;

    @JsonCreator
    public Preference(
            @JsonProperty("channels") PreferenceChannels channels,
            @JsonProperty("enabled") boolean enabled) {
        Utils.checkNotNull(channels, "channels");
        Utils.checkNotNull(enabled, "enabled");
        this.channels = channels;
        this.enabled = enabled;
    }

    /**
     * Subscriber preferences for the different channels regarding this workflow
     */
    @JsonIgnore
    public PreferenceChannels channels() {
        return channels;
    }

    /**
     * Sets if the workflow is fully enabled for all channels or not for the subscriber.
     */
    @JsonIgnore
    public boolean enabled() {
        return enabled;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Subscriber preferences for the different channels regarding this workflow
     */
    public Preference withChannels(PreferenceChannels channels) {
        Utils.checkNotNull(channels, "channels");
        this.channels = channels;
        return this;
    }

    /**
     * Sets if the workflow is fully enabled for all channels or not for the subscriber.
     */
    public Preference withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
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
        Preference other = (Preference) o;
        return 
            java.util.Objects.deepEquals(this.channels, other.channels) &&
            java.util.Objects.deepEquals(this.enabled, other.enabled);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            channels,
            enabled);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Preference.class,
                "channels", channels,
                "enabled", enabled);
    }
    
    public final static class Builder {
 
        private PreferenceChannels channels;
 
        private Boolean enabled;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Subscriber preferences for the different channels regarding this workflow
         */
        public Builder channels(PreferenceChannels channels) {
            Utils.checkNotNull(channels, "channels");
            this.channels = channels;
            return this;
        }

        /**
         * Sets if the workflow is fully enabled for all channels or not for the subscriber.
         */
        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }
        
        public Preference build() {
            return new Preference(
                channels,
                enabled);
        }
    }
}
