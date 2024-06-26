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

public class UpdateWorkflowRequestDto {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("critical")
    private Optional<? extends Boolean> critical;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends UpdateWorkflowRequestDtoData> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<? extends String> identifier;

    @JsonProperty("name")
    private String name;

    @JsonProperty("notificationGroupId")
    private String notificationGroupId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preferenceSettings")
    private Optional<? extends PreferenceChannels> preferenceSettings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("steps")
    private Optional<? extends java.util.List<NotificationStep>> steps;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends java.util.List<String>> tags;

    @JsonCreator
    public UpdateWorkflowRequestDto(
            @JsonProperty("critical") Optional<? extends Boolean> critical,
            @JsonProperty("data") Optional<? extends UpdateWorkflowRequestDtoData> data,
            @JsonProperty("description") Optional<? extends String> description,
            @JsonProperty("identifier") Optional<? extends String> identifier,
            @JsonProperty("name") String name,
            @JsonProperty("notificationGroupId") String notificationGroupId,
            @JsonProperty("preferenceSettings") Optional<? extends PreferenceChannels> preferenceSettings,
            @JsonProperty("steps") Optional<? extends java.util.List<NotificationStep>> steps,
            @JsonProperty("tags") Optional<? extends java.util.List<String>> tags) {
        Utils.checkNotNull(critical, "critical");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(notificationGroupId, "notificationGroupId");
        Utils.checkNotNull(preferenceSettings, "preferenceSettings");
        Utils.checkNotNull(steps, "steps");
        Utils.checkNotNull(tags, "tags");
        this.critical = critical;
        this.data = data;
        this.description = description;
        this.identifier = identifier;
        this.name = name;
        this.notificationGroupId = notificationGroupId;
        this.preferenceSettings = preferenceSettings;
        this.steps = steps;
        this.tags = tags;
    }
    
    public UpdateWorkflowRequestDto(
            String name,
            String notificationGroupId) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), name, notificationGroupId, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> critical() {
        return (Optional<Boolean>) critical;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateWorkflowRequestDtoData> data() {
        return (Optional<UpdateWorkflowRequestDtoData>) data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> description() {
        return (Optional<String>) description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> identifier() {
        return (Optional<String>) identifier;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String notificationGroupId() {
        return notificationGroupId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PreferenceChannels> preferenceSettings() {
        return (Optional<PreferenceChannels>) preferenceSettings;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<NotificationStep>> steps() {
        return (Optional<java.util.List<NotificationStep>>) steps;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> tags() {
        return (Optional<java.util.List<String>>) tags;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateWorkflowRequestDto withCritical(boolean critical) {
        Utils.checkNotNull(critical, "critical");
        this.critical = Optional.ofNullable(critical);
        return this;
    }

    public UpdateWorkflowRequestDto withCritical(Optional<? extends Boolean> critical) {
        Utils.checkNotNull(critical, "critical");
        this.critical = critical;
        return this;
    }

    public UpdateWorkflowRequestDto withData(UpdateWorkflowRequestDtoData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public UpdateWorkflowRequestDto withData(Optional<? extends UpdateWorkflowRequestDtoData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public UpdateWorkflowRequestDto withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public UpdateWorkflowRequestDto withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public UpdateWorkflowRequestDto withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    public UpdateWorkflowRequestDto withIdentifier(Optional<? extends String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public UpdateWorkflowRequestDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public UpdateWorkflowRequestDto withNotificationGroupId(String notificationGroupId) {
        Utils.checkNotNull(notificationGroupId, "notificationGroupId");
        this.notificationGroupId = notificationGroupId;
        return this;
    }

    public UpdateWorkflowRequestDto withPreferenceSettings(PreferenceChannels preferenceSettings) {
        Utils.checkNotNull(preferenceSettings, "preferenceSettings");
        this.preferenceSettings = Optional.ofNullable(preferenceSettings);
        return this;
    }

    public UpdateWorkflowRequestDto withPreferenceSettings(Optional<? extends PreferenceChannels> preferenceSettings) {
        Utils.checkNotNull(preferenceSettings, "preferenceSettings");
        this.preferenceSettings = preferenceSettings;
        return this;
    }

    public UpdateWorkflowRequestDto withSteps(java.util.List<NotificationStep> steps) {
        Utils.checkNotNull(steps, "steps");
        this.steps = Optional.ofNullable(steps);
        return this;
    }

    public UpdateWorkflowRequestDto withSteps(Optional<? extends java.util.List<NotificationStep>> steps) {
        Utils.checkNotNull(steps, "steps");
        this.steps = steps;
        return this;
    }

    public UpdateWorkflowRequestDto withTags(java.util.List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public UpdateWorkflowRequestDto withTags(Optional<? extends java.util.List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
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
        UpdateWorkflowRequestDto other = (UpdateWorkflowRequestDto) o;
        return 
            java.util.Objects.deepEquals(this.critical, other.critical) &&
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.identifier, other.identifier) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.notificationGroupId, other.notificationGroupId) &&
            java.util.Objects.deepEquals(this.preferenceSettings, other.preferenceSettings) &&
            java.util.Objects.deepEquals(this.steps, other.steps) &&
            java.util.Objects.deepEquals(this.tags, other.tags);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            critical,
            data,
            description,
            identifier,
            name,
            notificationGroupId,
            preferenceSettings,
            steps,
            tags);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateWorkflowRequestDto.class,
                "critical", critical,
                "data", data,
                "description", description,
                "identifier", identifier,
                "name", name,
                "notificationGroupId", notificationGroupId,
                "preferenceSettings", preferenceSettings,
                "steps", steps,
                "tags", tags);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> critical = Optional.empty();
 
        private Optional<? extends UpdateWorkflowRequestDtoData> data = Optional.empty();
 
        private Optional<? extends String> description = Optional.empty();
 
        private Optional<? extends String> identifier = Optional.empty();
 
        private String name;
 
        private String notificationGroupId;
 
        private Optional<? extends PreferenceChannels> preferenceSettings = Optional.empty();
 
        private Optional<? extends java.util.List<NotificationStep>> steps = Optional.empty();
 
        private Optional<? extends java.util.List<String>> tags = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder critical(boolean critical) {
            Utils.checkNotNull(critical, "critical");
            this.critical = Optional.ofNullable(critical);
            return this;
        }

        public Builder critical(Optional<? extends Boolean> critical) {
            Utils.checkNotNull(critical, "critical");
            this.critical = critical;
            return this;
        }

        public Builder data(UpdateWorkflowRequestDtoData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends UpdateWorkflowRequestDtoData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = Optional.ofNullable(identifier);
            return this;
        }

        public Builder identifier(Optional<? extends String> identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder notificationGroupId(String notificationGroupId) {
            Utils.checkNotNull(notificationGroupId, "notificationGroupId");
            this.notificationGroupId = notificationGroupId;
            return this;
        }

        public Builder preferenceSettings(PreferenceChannels preferenceSettings) {
            Utils.checkNotNull(preferenceSettings, "preferenceSettings");
            this.preferenceSettings = Optional.ofNullable(preferenceSettings);
            return this;
        }

        public Builder preferenceSettings(Optional<? extends PreferenceChannels> preferenceSettings) {
            Utils.checkNotNull(preferenceSettings, "preferenceSettings");
            this.preferenceSettings = preferenceSettings;
            return this;
        }

        public Builder steps(java.util.List<NotificationStep> steps) {
            Utils.checkNotNull(steps, "steps");
            this.steps = Optional.ofNullable(steps);
            return this;
        }

        public Builder steps(Optional<? extends java.util.List<NotificationStep>> steps) {
            Utils.checkNotNull(steps, "steps");
            this.steps = steps;
            return this;
        }

        public Builder tags(java.util.List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends java.util.List<String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }
        
        public UpdateWorkflowRequestDto build() {
            return new UpdateWorkflowRequestDto(
                critical,
                data,
                description,
                identifier,
                name,
                notificationGroupId,
                preferenceSettings,
                steps,
                tags);
        }
    }
}

