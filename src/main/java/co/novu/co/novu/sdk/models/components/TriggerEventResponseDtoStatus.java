/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * TriggerEventResponseDtoStatus - Status for trigger
 */
public enum TriggerEventResponseDtoStatus {
    ERROR("error"),
    TRIGGER_NOT_ACTIVE("trigger_not_active"),
    NO_WORKFLOW_ACTIVE_STEPS_DEFINED("no_workflow_active_steps_defined"),
    NO_WORKFLOW_STEPS_DEFINED("no_workflow_steps_defined"),
    PROCESSED("processed"),
    SUBSCRIBER_ID_MISSING("subscriber_id_missing"),
    NO_TENANT_FOUND("no_tenant_found");

    @JsonValue
    private final String value;

    private TriggerEventResponseDtoStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
