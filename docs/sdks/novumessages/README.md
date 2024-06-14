# NovuMessages
(*subscribers().messages()*)

### Available Operations

* [markAll](#markall) - Marks all the subscriber messages as read, unread, seen or unseen. Optionally you can pass feed id (or array) to mark messages of a particular feed.
* [markAllAs](#markallas) - Mark a subscriber messages as seen, read, unseen or unread
* [updateAsSeen](#updateasseen) - Mark message action as seen

## markAll

Marks all the subscriber messages as read, unread, seen or unseen. Optionally you can pass feed id (or array) to mark messages of a particular feed.

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

            SubscribersControllerMarkAllUnreadAsReadResponse res = sdk.subscribers().messages().markAll()
                .subscriberId("<value>")
                .markAllMessageAsRequestDto(MarkAllMessageAsRequestDto.builder()
                    .markAs(MarkAs.SEEN)
                    .build())
                .call();

            if (res.number().isPresent()) {
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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `subscriberId`                                                                                                            | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
| `markAllMessageAsRequestDto`                                                                                              | [co.novu.co.novu.sdk.models.components.MarkAllMessageAsRequestDto](../../models/components/MarkAllMessageAsRequestDto.md) | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerMarkAllUnreadAsReadResponse>](../../models/operations/SubscribersControllerMarkAllUnreadAsReadResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## markAllAs

Mark a subscriber messages as seen, read, unseen or unread

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

            SubscribersControllerMarkMessagesAsResponse res = sdk.subscribers().messages().markAllAs()
                .subscriberId("<value>")
                .messageMarkAsRequestDto(MessageMarkAsRequestDto.builder()
                    .markAs(MessageMarkAsRequestDtoMarkAs.SEEN)
                    .messageId(MessageId.of("<value>"))
                    .build())
                .call();

            if (res.messageEntities().isPresent()) {
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `subscriberId`                                                                                                      | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |
| `messageMarkAsRequestDto`                                                                                           | [co.novu.co.novu.sdk.models.components.MessageMarkAsRequestDto](../../models/components/MessageMarkAsRequestDto.md) | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerMarkMessagesAsResponse>](../../models/operations/SubscribersControllerMarkMessagesAsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateAsSeen

Mark message action as seen

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

            SubscribersControllerMarkActionAsSeenRequest req = SubscribersControllerMarkActionAsSeenRequest.builder()
                .messageId("<value>")
                .type("<value>")
                .subscriberId("<value>")
                .markMessageActionAsSeenDto(MarkMessageActionAsSeenDto.builder()
                        .status(MarkMessageActionAsSeenDtoStatus.DONE)
                        .build())
                .build();

            SubscribersControllerMarkActionAsSeenResponse res = sdk.subscribers().messages().updateAsSeen()
                .request(req)
                .call();

            if (res.messageResponseDto().isPresent()) {
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

| Parameter                                                                                                                                                     | Type                                                                                                                                                          | Required                                                                                                                                                      | Description                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                     | [co.novu.co.novu.sdk.models.operations.SubscribersControllerMarkActionAsSeenRequest](../../models/operations/SubscribersControllerMarkActionAsSeenRequest.md) | :heavy_check_mark:                                                                                                                                            | The request object to use for the request.                                                                                                                    |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerMarkActionAsSeenResponse>](../../models/operations/SubscribersControllerMarkActionAsSeenResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
