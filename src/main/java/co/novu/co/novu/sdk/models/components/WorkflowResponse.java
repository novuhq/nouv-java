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

public class WorkflowResponse {

    @JsonProperty("_creatorId")
    private String creatorId;

    @JsonProperty("_environmentId")
    private String environmentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_id")
    private Optional<? extends String> id;

    @JsonProperty("_notificationGroupId")
    private String notificationGroupId;

    @JsonProperty("_organizationId")
    private String organizationId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_parentId")
    private Optional<? extends String> parentId;

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("critical")
    private boolean critical;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends WorkflowResponseData> data;

    @JsonProperty("deleted")
    private boolean deleted;

    @JsonProperty("deletedAt")
    private String deletedAt;

    @JsonProperty("deletedBy")
    private String deletedBy;

    @JsonProperty("description")
    private String description;

    @JsonProperty("draft")
    private boolean draft;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notificationGroup")
    private Optional<? extends NotificationGroup> notificationGroup;

    @JsonProperty("preferenceSettings")
    private PreferenceChannels preferenceSettings;

    @JsonProperty("steps")
    private java.util.List<NotificationStep> steps;

    @JsonProperty("tags")
    private java.util.List<String> tags;

    @JsonProperty("triggers")
    private java.util.List<NotificationTrigger> triggers;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowIntegrationStatus")
    private Optional<? extends WorkflowIntegrationStatus> workflowIntegrationStatus;

    @JsonCreator
    public WorkflowResponse(
            @JsonProperty("_creatorId") String creatorId,
            @JsonProperty("_environmentId") String environmentId,
            @JsonProperty("_id") Optional<? extends String> id,
            @JsonProperty("_notificationGroupId") String notificationGroupId,
            @JsonProperty("_organizationId") String organizationId,
            @JsonProperty("_parentId") Optional<? extends String> parentId,
            @JsonProperty("active") boolean active,
            @JsonProperty("critical") boolean critical,
            @JsonProperty("data") Optional<? extends WorkflowResponseData> data,
            @JsonProperty("deleted") boolean deleted,
            @JsonProperty("deletedAt") String deletedAt,
            @JsonProperty("deletedBy") String deletedBy,
            @JsonProperty("description") String description,
            @JsonProperty("draft") boolean draft,
            @JsonProperty("name") String name,
            @JsonProperty("notificationGroup") Optional<? extends NotificationGroup> notificationGroup,
            @JsonProperty("preferenceSettings") PreferenceChannels preferenceSettings,
            @JsonProperty("steps") java.util.List<NotificationStep> steps,
            @JsonProperty("tags") java.util.List<String> tags,
            @JsonProperty("triggers") java.util.List<NotificationTrigger> triggers,
            @JsonProperty("workflowIntegrationStatus") Optional<? extends WorkflowIntegrationStatus> workflowIntegrationStatus) {
        Utils.checkNotNull(creatorId, "creatorId");
        Utils.checkNotNull(environmentId, "environmentId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(notificationGroupId, "notificationGroupId");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(critical, "critical");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(deleted, "deleted");
        Utils.checkNotNull(deletedAt, "deletedAt");
        Utils.checkNotNull(deletedBy, "deletedBy");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(draft, "draft");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(notificationGroup, "notificationGroup");
        Utils.checkNotNull(preferenceSettings, "preferenceSettings");
        Utils.checkNotNull(steps, "steps");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(triggers, "triggers");
        Utils.checkNotNull(workflowIntegrationStatus, "workflowIntegrationStatus");
        this.creatorId = creatorId;
        this.environmentId = environmentId;
        this.id = id;
        this.notificationGroupId = notificationGroupId;
        this.organizationId = organizationId;
        this.parentId = parentId;
        this.active = active;
        this.critical = critical;
        this.data = data;
        this.deleted = deleted;
        this.deletedAt = deletedAt;
        this.deletedBy = deletedBy;
        this.description = description;
        this.draft = draft;
        this.name = name;
        this.notificationGroup = notificationGroup;
        this.preferenceSettings = preferenceSettings;
        this.steps = steps;
        this.tags = tags;
        this.triggers = triggers;
        this.workflowIntegrationStatus = workflowIntegrationStatus;
    }
    
    public WorkflowResponse(
            String creatorId,
            String environmentId,
            String notificationGroupId,
            String organizationId,
            boolean active,
            boolean critical,
            boolean deleted,
            String deletedAt,
            String deletedBy,
            String description,
            boolean draft,
            String name,
            PreferenceChannels preferenceSettings,
            java.util.List<NotificationStep> steps,
            java.util.List<String> tags,
            java.util.List<NotificationTrigger> triggers) {
        this(creatorId, environmentId, Optional.empty(), notificationGroupId, organizationId, Optional.empty(), active, critical, Optional.empty(), deleted, deletedAt, deletedBy, description, draft, name, Optional.empty(), preferenceSettings, steps, tags, triggers, Optional.empty());
    }

    @JsonIgnore
    public String creatorId() {
        return creatorId;
    }

    @JsonIgnore
    public String environmentId() {
        return environmentId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> id() {
        return (Optional<String>) id;
    }

    @JsonIgnore
    public String notificationGroupId() {
        return notificationGroupId;
    }

    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> parentId() {
        return (Optional<String>) parentId;
    }

    @JsonIgnore
    public boolean active() {
        return active;
    }

    @JsonIgnore
    public boolean critical() {
        return critical;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WorkflowResponseData> data() {
        return (Optional<WorkflowResponseData>) data;
    }

    @JsonIgnore
    public boolean deleted() {
        return deleted;
    }

    @JsonIgnore
    public String deletedAt() {
        return deletedAt;
    }

    @JsonIgnore
    public String deletedBy() {
        return deletedBy;
    }

    @JsonIgnore
    public String description() {
        return description;
    }

    @JsonIgnore
    public boolean draft() {
        return draft;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NotificationGroup> notificationGroup() {
        return (Optional<NotificationGroup>) notificationGroup;
    }

    @JsonIgnore
    public PreferenceChannels preferenceSettings() {
        return preferenceSettings;
    }

    @JsonIgnore
    public java.util.List<NotificationStep> steps() {
        return steps;
    }

    @JsonIgnore
    public java.util.List<String> tags() {
        return tags;
    }

    @JsonIgnore
    public java.util.List<NotificationTrigger> triggers() {
        return triggers;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WorkflowIntegrationStatus> workflowIntegrationStatus() {
        return (Optional<WorkflowIntegrationStatus>) workflowIntegrationStatus;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WorkflowResponse withCreatorId(String creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = creatorId;
        return this;
    }

    public WorkflowResponse withEnvironmentId(String environmentId) {
        Utils.checkNotNull(environmentId, "environmentId");
        this.environmentId = environmentId;
        return this;
    }

    public WorkflowResponse withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public WorkflowResponse withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public WorkflowResponse withNotificationGroupId(String notificationGroupId) {
        Utils.checkNotNull(notificationGroupId, "notificationGroupId");
        this.notificationGroupId = notificationGroupId;
        return this;
    }

    public WorkflowResponse withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public WorkflowResponse withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = Optional.ofNullable(parentId);
        return this;
    }

    public WorkflowResponse withParentId(Optional<? extends String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    public WorkflowResponse withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    public WorkflowResponse withCritical(boolean critical) {
        Utils.checkNotNull(critical, "critical");
        this.critical = critical;
        return this;
    }

    public WorkflowResponse withData(WorkflowResponseData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public WorkflowResponse withData(Optional<? extends WorkflowResponseData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public WorkflowResponse withDeleted(boolean deleted) {
        Utils.checkNotNull(deleted, "deleted");
        this.deleted = deleted;
        return this;
    }

    public WorkflowResponse withDeletedAt(String deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = deletedAt;
        return this;
    }

    public WorkflowResponse withDeletedBy(String deletedBy) {
        Utils.checkNotNull(deletedBy, "deletedBy");
        this.deletedBy = deletedBy;
        return this;
    }

    public WorkflowResponse withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public WorkflowResponse withDraft(boolean draft) {
        Utils.checkNotNull(draft, "draft");
        this.draft = draft;
        return this;
    }

    public WorkflowResponse withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public WorkflowResponse withNotificationGroup(NotificationGroup notificationGroup) {
        Utils.checkNotNull(notificationGroup, "notificationGroup");
        this.notificationGroup = Optional.ofNullable(notificationGroup);
        return this;
    }

    public WorkflowResponse withNotificationGroup(Optional<? extends NotificationGroup> notificationGroup) {
        Utils.checkNotNull(notificationGroup, "notificationGroup");
        this.notificationGroup = notificationGroup;
        return this;
    }

    public WorkflowResponse withPreferenceSettings(PreferenceChannels preferenceSettings) {
        Utils.checkNotNull(preferenceSettings, "preferenceSettings");
        this.preferenceSettings = preferenceSettings;
        return this;
    }

    public WorkflowResponse withSteps(java.util.List<NotificationStep> steps) {
        Utils.checkNotNull(steps, "steps");
        this.steps = steps;
        return this;
    }

    public WorkflowResponse withTags(java.util.List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public WorkflowResponse withTriggers(java.util.List<NotificationTrigger> triggers) {
        Utils.checkNotNull(triggers, "triggers");
        this.triggers = triggers;
        return this;
    }

    public WorkflowResponse withWorkflowIntegrationStatus(WorkflowIntegrationStatus workflowIntegrationStatus) {
        Utils.checkNotNull(workflowIntegrationStatus, "workflowIntegrationStatus");
        this.workflowIntegrationStatus = Optional.ofNullable(workflowIntegrationStatus);
        return this;
    }

    public WorkflowResponse withWorkflowIntegrationStatus(Optional<? extends WorkflowIntegrationStatus> workflowIntegrationStatus) {
        Utils.checkNotNull(workflowIntegrationStatus, "workflowIntegrationStatus");
        this.workflowIntegrationStatus = workflowIntegrationStatus;
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
        WorkflowResponse other = (WorkflowResponse) o;
        return 
            java.util.Objects.deepEquals(this.creatorId, other.creatorId) &&
            java.util.Objects.deepEquals(this.environmentId, other.environmentId) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.notificationGroupId, other.notificationGroupId) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.parentId, other.parentId) &&
            java.util.Objects.deepEquals(this.active, other.active) &&
            java.util.Objects.deepEquals(this.critical, other.critical) &&
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.deleted, other.deleted) &&
            java.util.Objects.deepEquals(this.deletedAt, other.deletedAt) &&
            java.util.Objects.deepEquals(this.deletedBy, other.deletedBy) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.draft, other.draft) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.notificationGroup, other.notificationGroup) &&
            java.util.Objects.deepEquals(this.preferenceSettings, other.preferenceSettings) &&
            java.util.Objects.deepEquals(this.steps, other.steps) &&
            java.util.Objects.deepEquals(this.tags, other.tags) &&
            java.util.Objects.deepEquals(this.triggers, other.triggers) &&
            java.util.Objects.deepEquals(this.workflowIntegrationStatus, other.workflowIntegrationStatus);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            creatorId,
            environmentId,
            id,
            notificationGroupId,
            organizationId,
            parentId,
            active,
            critical,
            data,
            deleted,
            deletedAt,
            deletedBy,
            description,
            draft,
            name,
            notificationGroup,
            preferenceSettings,
            steps,
            tags,
            triggers,
            workflowIntegrationStatus);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkflowResponse.class,
                "creatorId", creatorId,
                "environmentId", environmentId,
                "id", id,
                "notificationGroupId", notificationGroupId,
                "organizationId", organizationId,
                "parentId", parentId,
                "active", active,
                "critical", critical,
                "data", data,
                "deleted", deleted,
                "deletedAt", deletedAt,
                "deletedBy", deletedBy,
                "description", description,
                "draft", draft,
                "name", name,
                "notificationGroup", notificationGroup,
                "preferenceSettings", preferenceSettings,
                "steps", steps,
                "tags", tags,
                "triggers", triggers,
                "workflowIntegrationStatus", workflowIntegrationStatus);
    }
    
    public final static class Builder {
 
        private String creatorId;
 
        private String environmentId;
 
        private Optional<? extends String> id = Optional.empty();
 
        private String notificationGroupId;
 
        private String organizationId;
 
        private Optional<? extends String> parentId = Optional.empty();
 
        private Boolean active;
 
        private Boolean critical;
 
        private Optional<? extends WorkflowResponseData> data = Optional.empty();
 
        private Boolean deleted;
 
        private String deletedAt;
 
        private String deletedBy;
 
        private String description;
 
        private Boolean draft;
 
        private String name;
 
        private Optional<? extends NotificationGroup> notificationGroup = Optional.empty();
 
        private PreferenceChannels preferenceSettings;
 
        private java.util.List<NotificationStep> steps;
 
        private java.util.List<String> tags;
 
        private java.util.List<NotificationTrigger> triggers;
 
        private Optional<? extends WorkflowIntegrationStatus> workflowIntegrationStatus = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder creatorId(String creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = creatorId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            Utils.checkNotNull(environmentId, "environmentId");
            this.environmentId = environmentId;
            return this;
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

        public Builder notificationGroupId(String notificationGroupId) {
            Utils.checkNotNull(notificationGroupId, "notificationGroupId");
            this.notificationGroupId = notificationGroupId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = Optional.ofNullable(parentId);
            return this;
        }

        public Builder parentId(Optional<? extends String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }

        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        public Builder critical(boolean critical) {
            Utils.checkNotNull(critical, "critical");
            this.critical = critical;
            return this;
        }

        public Builder data(WorkflowResponseData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends WorkflowResponseData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder deleted(boolean deleted) {
            Utils.checkNotNull(deleted, "deleted");
            this.deleted = deleted;
            return this;
        }

        public Builder deletedAt(String deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = deletedAt;
            return this;
        }

        public Builder deletedBy(String deletedBy) {
            Utils.checkNotNull(deletedBy, "deletedBy");
            this.deletedBy = deletedBy;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder draft(boolean draft) {
            Utils.checkNotNull(draft, "draft");
            this.draft = draft;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder notificationGroup(NotificationGroup notificationGroup) {
            Utils.checkNotNull(notificationGroup, "notificationGroup");
            this.notificationGroup = Optional.ofNullable(notificationGroup);
            return this;
        }

        public Builder notificationGroup(Optional<? extends NotificationGroup> notificationGroup) {
            Utils.checkNotNull(notificationGroup, "notificationGroup");
            this.notificationGroup = notificationGroup;
            return this;
        }

        public Builder preferenceSettings(PreferenceChannels preferenceSettings) {
            Utils.checkNotNull(preferenceSettings, "preferenceSettings");
            this.preferenceSettings = preferenceSettings;
            return this;
        }

        public Builder steps(java.util.List<NotificationStep> steps) {
            Utils.checkNotNull(steps, "steps");
            this.steps = steps;
            return this;
        }

        public Builder tags(java.util.List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }

        public Builder triggers(java.util.List<NotificationTrigger> triggers) {
            Utils.checkNotNull(triggers, "triggers");
            this.triggers = triggers;
            return this;
        }

        public Builder workflowIntegrationStatus(WorkflowIntegrationStatus workflowIntegrationStatus) {
            Utils.checkNotNull(workflowIntegrationStatus, "workflowIntegrationStatus");
            this.workflowIntegrationStatus = Optional.ofNullable(workflowIntegrationStatus);
            return this;
        }

        public Builder workflowIntegrationStatus(Optional<? extends WorkflowIntegrationStatus> workflowIntegrationStatus) {
            Utils.checkNotNull(workflowIntegrationStatus, "workflowIntegrationStatus");
            this.workflowIntegrationStatus = workflowIntegrationStatus;
            return this;
        }
        
        public WorkflowResponse build() {
            return new WorkflowResponse(
                creatorId,
                environmentId,
                id,
                notificationGroupId,
                organizationId,
                parentId,
                active,
                critical,
                data,
                deleted,
                deletedAt,
                deletedBy,
                description,
                draft,
                name,
                notificationGroup,
                preferenceSettings,
                steps,
                tags,
                triggers,
                workflowIntegrationStatus);
        }
    }
}
