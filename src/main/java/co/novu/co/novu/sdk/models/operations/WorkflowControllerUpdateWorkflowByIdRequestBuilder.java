/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

import co.novu.co.novu.sdk.models.errors.SDKError;
import co.novu.co.novu.sdk.utils.LazySingletonValue;
import co.novu.co.novu.sdk.utils.Options.Builder;
import co.novu.co.novu.sdk.utils.Options;
import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class WorkflowControllerUpdateWorkflowByIdRequestBuilder {

    private String workflowId;
    private co.novu.co.novu.sdk.models.components.UpdateWorkflowRequestDto updateWorkflowRequestDto;
    private Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallWorkflowControllerUpdateWorkflowById sdk;

    public WorkflowControllerUpdateWorkflowByIdRequestBuilder(SDKMethodInterfaces.MethodCallWorkflowControllerUpdateWorkflowById sdk) {
        this.sdk = sdk;
    }

    public WorkflowControllerUpdateWorkflowByIdRequestBuilder workflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
        return this;
    }

    public WorkflowControllerUpdateWorkflowByIdRequestBuilder updateWorkflowRequestDto(co.novu.co.novu.sdk.models.components.UpdateWorkflowRequestDto updateWorkflowRequestDto) {
        Utils.checkNotNull(updateWorkflowRequestDto, "updateWorkflowRequestDto");
        this.updateWorkflowRequestDto = updateWorkflowRequestDto;
        return this;
    }
                
    public WorkflowControllerUpdateWorkflowByIdRequestBuilder retryConfig(co.novu.co.novu.sdk.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public WorkflowControllerUpdateWorkflowByIdRequestBuilder retryConfig(Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public WorkflowControllerUpdateWorkflowByIdResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.update(
            workflowId,
            updateWorkflowRequestDto,
            options);
    }
}
