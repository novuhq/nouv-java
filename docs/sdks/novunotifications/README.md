# NovuNotifications
(*subscribers().notifications()*)

### Available Operations

* [retrieve](#retrieve) - Get in-app notification feed for a particular subscriber
* [unseenCount](#unseencount) - Get the unseen in-app notifications count for subscribers feed

## retrieve

Get in-app notification feed for a particular subscriber

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

            SubscribersControllerGetNotificationsFeedRequest req = SubscribersControllerGetNotificationsFeedRequest.builder()
                .subscriberId("<value>")
                .payload("btoa(JSON.stringify({ foo: 123 })) results in base64 encoded string like eyJmb28iOjEyM30=")
                .build();

            SubscribersControllerGetNotificationsFeedResponse res = sdk.subscribers().notifications().retrieve()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                                                                                                                                             | Type                                                                                                                                                                  | Required                                                                                                                                                              | Description                                                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                             | [co.novu.co.novu.sdk.models.operations.SubscribersControllerGetNotificationsFeedRequest](../../models/operations/SubscribersControllerGetNotificationsFeedRequest.md) | :heavy_check_mark:                                                                                                                                                    | The request object to use for the request.                                                                                                                            |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerGetNotificationsFeedResponse>](../../models/operations/SubscribersControllerGetNotificationsFeedResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## unseenCount

Get the unseen in-app notifications count for subscribers feed

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

            SubscribersControllerGetUnseenCountRequest req = SubscribersControllerGetUnseenCountRequest.builder()
                .seen(false)
                .subscriberId("<value>")
                .limit(2166.35d)
                .build();

            SubscribersControllerGetUnseenCountResponse res = sdk.subscribers().notifications().unseenCount()
                .request(req)
                .call();

            if (res.unseenCountResponse().isPresent()) {
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

| Parameter                                                                                                                                                 | Type                                                                                                                                                      | Required                                                                                                                                                  | Description                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                 | [co.novu.co.novu.sdk.models.operations.SubscribersControllerGetUnseenCountRequest](../../models/operations/SubscribersControllerGetUnseenCountRequest.md) | :heavy_check_mark:                                                                                                                                        | The request object to use for the request.                                                                                                                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerGetUnseenCountResponse>](../../models/operations/SubscribersControllerGetUnseenCountResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
