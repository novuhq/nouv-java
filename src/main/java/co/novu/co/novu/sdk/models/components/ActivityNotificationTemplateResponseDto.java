/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ActivityNotificationTemplateResponseDto {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_id")
    private Optional<? extends String> id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("triggers")
    private java.util.List<NotificationTrigger> triggers;

    @JsonCreator
    public ActivityNotificationTemplateResponseDto(
            @JsonProperty("_id") Optional<? extends String> id,
            @JsonProperty("name") String name,
            @JsonProperty("triggers") java.util.List<NotificationTrigger> triggers) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(triggers, "triggers");
        this.id = id;
        this.name = name;
        this.triggers = triggers;
    }
    
    public ActivityNotificationTemplateResponseDto(
            String name,
            java.util.List<NotificationTrigger> triggers) {
        this(Optional.empty(), name, triggers);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> id() {
        return (Optional<String>) id;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public java.util.List<NotificationTrigger> triggers() {
        return triggers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivityNotificationTemplateResponseDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ActivityNotificationTemplateResponseDto withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ActivityNotificationTemplateResponseDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ActivityNotificationTemplateResponseDto withTriggers(java.util.List<NotificationTrigger> triggers) {
        Utils.checkNotNull(triggers, "triggers");
        this.triggers = triggers;
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
        ActivityNotificationTemplateResponseDto other = (ActivityNotificationTemplateResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.triggers, other.triggers);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name,
            triggers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActivityNotificationTemplateResponseDto.class,
                "id", id,
                "name", name,
                "triggers", triggers);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private String name;
 
        private java.util.List<NotificationTrigger> triggers;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder triggers(java.util.List<NotificationTrigger> triggers) {
            Utils.checkNotNull(triggers, "triggers");
            this.triggers = triggers;
            return this;
        }
        
        public ActivityNotificationTemplateResponseDto build() {
            return new ActivityNotificationTemplateResponseDto(
                id,
                name,
                triggers);
        }
    }
}

