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

public class WorkflowControllerDeleteWorkflowByIdRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflowId")
    private String workflowId;

    @JsonCreator
    public WorkflowControllerDeleteWorkflowByIdRequest(
            String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
    }

    @JsonIgnore
    public String workflowId() {
        return workflowId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WorkflowControllerDeleteWorkflowByIdRequest withWorkflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
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
        WorkflowControllerDeleteWorkflowByIdRequest other = (WorkflowControllerDeleteWorkflowByIdRequest) o;
        return 
            java.util.Objects.deepEquals(this.workflowId, other.workflowId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            workflowId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkflowControllerDeleteWorkflowByIdRequest.class,
                "workflowId", workflowId);
    }
    
    public final static class Builder {
 
        private String workflowId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder workflowId(String workflowId) {
            Utils.checkNotNull(workflowId, "workflowId");
            this.workflowId = workflowId;
            return this;
        }
        
        public WorkflowControllerDeleteWorkflowByIdRequest build() {
            return new WorkflowControllerDeleteWorkflowByIdRequest(
                workflowId);
        }
    }
}

