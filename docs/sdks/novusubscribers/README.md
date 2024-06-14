# NovuSubscribers
(*topics().subscribers()*)

### Available Operations

* [assign](#assign) - Subscribers addition
* [delete](#delete) - Subscribers removal
* [retrieve](#retrieve) - Check topic subscriber

## assign

Add subscribers to a topic by key

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

            TopicsControllerAddSubscribersResponse res = sdk.topics().subscribers().assign()
                .topicKey("<value>")
                .addSubscribersRequestDto(AddSubscribersRequestDto.builder()
                    .subscribers(java.util.List.of(
                            "<value>"))
                    .build())
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

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `topicKey`                                                                                                            | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |
| `addSubscribersRequestDto`                                                                                            | [co.novu.co.novu.sdk.models.components.AddSubscribersRequestDto](../../models/components/AddSubscribersRequestDto.md) | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.TopicsControllerAddSubscribersResponse>](../../models/operations/TopicsControllerAddSubscribersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Remove subscribers from a topic

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

            TopicsControllerRemoveSubscribersResponse res = sdk.topics().subscribers().delete()
                .topicKey("<value>")
                .removeSubscribersRequestDto(RemoveSubscribersRequestDto.builder()
                    .subscribers(java.util.List.of(
                            "<value>"))
                    .build())
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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `topicKey`                                                                                                                  | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `removeSubscribersRequestDto`                                                                                               | [co.novu.co.novu.sdk.models.components.RemoveSubscribersRequestDto](../../models/components/RemoveSubscribersRequestDto.md) | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.TopicsControllerRemoveSubscribersResponse>](../../models/operations/TopicsControllerRemoveSubscribersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## retrieve

Check if a subscriber belongs to a certain topic

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

            TopicsControllerGetTopicSubscriberResponse res = sdk.topics().subscribers().retrieve()
                .topicKey("<value>")
                .externalSubscriberId("<value>")
                .call();

            if (res.topicSubscriberDto().isPresent()) {
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

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `topicKey`             | *String*               | :heavy_check_mark:     | N/A                    |
| `externalSubscriberId` | *String*               | :heavy_check_mark:     | N/A                    |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.TopicsControllerGetTopicSubscriberResponse>](../../models/operations/TopicsControllerGetTopicSubscriberResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
