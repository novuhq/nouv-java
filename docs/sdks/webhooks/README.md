# Webhooks
(*integrations().webhooks()*)

### Available Operations

* [retrieve](#retrieve) - Get webhook support status for provider

## retrieve

Return the status of the webhook for this provider, if it is supported or if it is not based on a boolean value

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

            IntegrationsControllerGetWebhookSupportStatusResponse res = sdk.integrations().webhooks().retrieve()
                .providerOrIntegrationId("<value>")
                .call();

            if (res.boolean_().isPresent()) {
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

| Parameter                 | Type                      | Required                  | Description               |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `providerOrIntegrationId` | *String*                  | :heavy_check_mark:        | N/A                       |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.IntegrationsControllerGetWebhookSupportStatusResponse>](../../models/operations/IntegrationsControllerGetWebhookSupportStatusResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
