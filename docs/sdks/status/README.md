# Status
(*workflows().status()*)

### Available Operations

* [update](#update) - Update workflow status

## update

Workflow was previously named notification template

### Example Usage

```java
package hello.world;

import co.novu.co.novu.sdk.Novu;
import co.novu.co.novu.sdk.models.components.*;
import co.novu.co.novu.sdk.models.components.Security;
import co.novu.co.novu.sdk.models.operations.*;
import co.novu.co.novu.sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Novu sdk = Novu.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            WorkflowControllerUpdateActiveStatusResponse res = sdk.workflows().status().update()
                .workflowId("<value>")
                .changeWorkflowStatusRequestDto(ChangeWorkflowStatusRequestDto.builder()
                    .active(false)
                    .build())
                .call();

            if (res.workflowResponse().isPresent()) {
                // handle response
            }
        } catch (co.novu.co.novu.sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `workflowId`                                                                                                                      | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |
| `changeWorkflowStatusRequestDto`                                                                                                  | [co.novu.co.novu.sdk.models.components.ChangeWorkflowStatusRequestDto](../../models/components/ChangeWorkflowStatusRequestDto.md) | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.WorkflowControllerUpdateActiveStatusResponse>](../../models/operations/WorkflowControllerUpdateActiveStatusResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
