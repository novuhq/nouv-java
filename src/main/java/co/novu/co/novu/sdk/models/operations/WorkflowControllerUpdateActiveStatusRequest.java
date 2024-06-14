/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

import co.novu.co.novu.sdk.utils.SpeakeasyMetadata;
import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class WorkflowControllerUpdateActiveStatusRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflowId")
    private String workflowId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private co.novu.co.novu.sdk.models.components.ChangeWorkflowStatusRequestDto changeWorkflowStatusRequestDto;

    @JsonCreator
    public WorkflowControllerUpdateActiveStatusRequest(
            String workflowId,
            co.novu.co.novu.sdk.models.components.ChangeWorkflowStatusRequestDto changeWorkflowStatusRequestDto) {
        Utils.checkNotNull(workflowId, "workflowId");
        Utils.checkNotNull(changeWorkflowStatusRequestDto, "changeWorkflowStatusRequestDto");
        this.workflowId = workflowId;
        this.changeWorkflowStatusRequestDto = changeWorkflowStatusRequestDto;
    }

    @JsonIgnore
    public String workflowId() {
        return workflowId;
    }

    @JsonIgnore
    public co.novu.co.novu.sdk.models.components.ChangeWorkflowStatusRequestDto changeWorkflowStatusRequestDto() {
        return changeWorkflowStatusRequestDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WorkflowControllerUpdateActiveStatusRequest withWorkflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
        return this;
    }

    public WorkflowControllerUpdateActiveStatusRequest withChangeWorkflowStatusRequestDto(co.novu.co.novu.sdk.models.components.ChangeWorkflowStatusRequestDto changeWorkflowStatusRequestDto) {
        Utils.checkNotNull(changeWorkflowStatusRequestDto, "changeWorkflowStatusRequestDto");
        this.changeWorkflowStatusRequestDto = changeWorkflowStatusRequestDto;
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
        WorkflowControllerUpdateActiveStatusRequest other = (WorkflowControllerUpdateActiveStatusRequest) o;
        return 
            java.util.Objects.deepEquals(this.workflowId, other.workflowId) &&
            java.util.Objects.deepEquals(this.changeWorkflowStatusRequestDto, other.changeWorkflowStatusRequestDto);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            workflowId,
            changeWorkflowStatusRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkflowControllerUpdateActiveStatusRequest.class,
                "workflowId", workflowId,
                "changeWorkflowStatusRequestDto", changeWorkflowStatusRequestDto);
    }
    
    public final static class Builder {
 
        private String workflowId;
 
        private co.novu.co.novu.sdk.models.components.ChangeWorkflowStatusRequestDto changeWorkflowStatusRequestDto;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder workflowId(String workflowId) {
            Utils.checkNotNull(workflowId, "workflowId");
            this.workflowId = workflowId;
            return this;
        }

        public Builder changeWorkflowStatusRequestDto(co.novu.co.novu.sdk.models.components.ChangeWorkflowStatusRequestDto changeWorkflowStatusRequestDto) {
            Utils.checkNotNull(changeWorkflowStatusRequestDto, "changeWorkflowStatusRequestDto");
            this.changeWorkflowStatusRequestDto = changeWorkflowStatusRequestDto;
            return this;
        }
        
        public WorkflowControllerUpdateActiveStatusRequest build() {
            return new WorkflowControllerUpdateActiveStatusRequest(
                workflowId,
                changeWorkflowStatusRequestDto);
        }
    }
}
