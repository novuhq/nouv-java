# Credentials
(*subscribers().credentials()*)

### Available Operations

* [append](#append) - Modify subscriber credentials
* [delete](#delete) - Delete subscriber credentials by providerId
* [update](#update) - Update subscriber credentials

## append

Subscriber credentials associated to the delivery methods such as slack and push tokens.
    This endpoint appends provided credentials and deviceTokens to the existing ones.

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

            SubscribersControllerModifySubscriberChannelResponse res = sdk.subscribers().credentials().append()
                .subscriberId("<value>")
                .updateSubscriberChannelRequestDto(UpdateSubscriberChannelRequestDto.builder()
                    .credentials(ChannelCredentials.builder()
                            .webhookUrl("<value>")
                            .build())
                    .providerId(UpdateSubscriberChannelRequestDtoProviderId.ZULIP)
                    .build())
                .call();

            if (res.subscriberResponseDto().isPresent()) {
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

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `subscriberId`                                                                                                                          | *String*                                                                                                                                | :heavy_check_mark:                                                                                                                      | N/A                                                                                                                                     |
| `updateSubscriberChannelRequestDto`                                                                                                     | [co.novu.co.novu.sdk.models.components.UpdateSubscriberChannelRequestDto](../../models/components/UpdateSubscriberChannelRequestDto.md) | :heavy_check_mark:                                                                                                                      | N/A                                                                                                                                     |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerModifySubscriberChannelResponse>](../../models/operations/SubscribersControllerModifySubscriberChannelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Delete subscriber credentials such as slack and expo tokens.

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

            SubscribersControllerDeleteSubscriberCredentialsResponse res = sdk.subscribers().credentials().delete()
                .subscriberId("<value>")
                .providerId("<value>")
                .call();

            // handle response
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
| `subscriberId`     | *String*           | :heavy_check_mark: | N/A                |
| `providerId`       | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerDeleteSubscriberCredentialsResponse>](../../models/operations/SubscribersControllerDeleteSubscriberCredentialsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Subscriber credentials associated to the delivery methods such as slack and push tokens.

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

            SubscribersControllerUpdateSubscriberChannelResponse res = sdk.subscribers().credentials().update()
                .subscriberId("<value>")
                .updateSubscriberChannelRequestDto(UpdateSubscriberChannelRequestDto.builder()
                    .credentials(ChannelCredentials.builder()
                            .webhookUrl("<value>")
                            .build())
                    .providerId(UpdateSubscriberChannelRequestDtoProviderId.PUSHPAD)
                    .build())
                .call();

            if (res.subscriberResponseDto().isPresent()) {
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

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `subscriberId`                                                                                                                          | *String*                                                                                                                                | :heavy_check_mark:                                                                                                                      | N/A                                                                                                                                     |
| `updateSubscriberChannelRequestDto`                                                                                                     | [co.novu.co.novu.sdk.models.components.UpdateSubscriberChannelRequestDto](../../models/components/UpdateSubscriberChannelRequestDto.md) | :heavy_check_mark:                                                                                                                      | N/A                                                                                                                                     |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerUpdateSubscriberChannelResponse>](../../models/operations/SubscribersControllerUpdateSubscriberChannelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
