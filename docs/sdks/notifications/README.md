# Notifications
(*notifications()*)

### Available Operations

* [list](#list) - Get notifications
* [retrieve](#retrieve) - Get notification

## list

Get notifications

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

            NotificationsControllerListNotificationsRequest req = NotificationsControllerListNotificationsRequest.builder()
                .channels(java.util.List.of(
                        Channels.CHAT))
                .templates(java.util.List.of(
                        "<value>"))
                .emails(java.util.List.of(
                        "<value>"))
                .search("<value>")
                .subscriberIds(java.util.List.of(
                        "<value>"))
                .build();

            NotificationsControllerListNotificationsResponse res = sdk.notifications().list()
                .request(req)
                .call();

            if (res.activitiesResponseDto().isPresent()) {
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

| Parameter                                                                                                                                                           | Type                                                                                                                                                                | Required                                                                                                                                                            | Description                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                           | [co.novu.co.novu.sdk.models.operations.NotificationsControllerListNotificationsRequest](../../models/operations/NotificationsControllerListNotificationsRequest.md) | :heavy_check_mark:                                                                                                                                                  | The request object to use for the request.                                                                                                                          |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.NotificationsControllerListNotificationsResponse>](../../models/operations/NotificationsControllerListNotificationsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## retrieve

Get notification

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

            NotificationsControllerGetNotificationResponse res = sdk.notifications().retrieve()
                .notificationId("<value>")
                .call();

            if (res.activityNotificationResponseDto().isPresent()) {
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


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.NotificationsControllerGetNotificationResponse>](../../models/operations/NotificationsControllerGetNotificationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
