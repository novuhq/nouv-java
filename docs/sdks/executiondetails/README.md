# ExecutionDetails
(*executionDetails()*)

## Overview

Execution details are used to track the execution of a workflow. They provided detailed information on the execution of a workflow, including the status of each step, the input and output of each step, and the overall status of the execution.

<https://docs.novu.co/activity-feed>
### Available Operations

* [retrieve](#retrieve) - Get execution details

## retrieve

Get execution details

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

            ExecutionDetailsControllerGetExecutionDetailsForNotificationResponse res = sdk.executionDetails().retrieve()
                .notificationId("<value>")
                .subscriberId("<value>")
                .call();

            if (res.executionDetailsResponseDtos().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `notificationId`   | *String*           | :heavy_check_mark: | N/A                |
| `subscriberId`     | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.ExecutionDetailsControllerGetExecutionDetailsForNotificationResponse>](../../models/operations/ExecutionDetailsControllerGetExecutionDetailsForNotificationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
