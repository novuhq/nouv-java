# Events
(*events()*)

## Overview

Events represent a change in state of a subscriber. They are used to trigger workflows, and enable you to send notifications to subscribers based on their actions.

<https://docs.novu.co/workflows>
### Available Operations

* [cancel](#cancel) - Cancel triggered event
* [trigger](#trigger) - Trigger event
* [triggerBroadcast](#triggerbroadcast) - Broadcast event to all
* [triggerBulk](#triggerbulk) - Bulk trigger event

## cancel


    Using a previously generated transactionId during the event trigger,
     will cancel any active or pending workflows. This is useful to cancel active digests, delays etc...
    

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

            EventsControllerCancelResponse res = sdk.events().cancel()
                .transactionId("<value>")
                .call();

            if (res.dataBooleanDto().isPresent()) {
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
| `transactionId`    | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.EventsControllerCancelResponse>](../../models/operations/EventsControllerCancelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## trigger


    Trigger event is the main (and only) way to send notifications to subscribers. 
    The trigger identifier is used to match the particular workflow associated with it. 
    Additional information can be passed according the body interface below.
    

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

            TriggerEventRequestDto req = TriggerEventRequestDto.builder()
                .name("workflow_identifier")
                .to(java.util.List.of(
                        To.of(TopicPayloadDto.builder()
                                .topicKey("topic_key")
                                .type(TopicPayloadDtoType.TOPIC)
                                .build())))
                .overrides(TriggerEventRequestDtoOverrides.builder()
                    .build())
                .payload(TriggerEventRequestDtoPayload.builder()
                    .build())
                .build();

            EventsControllerTriggerResponse res = sdk.events().trigger()
                .request(req)
                .call();

            if (res.triggerEventResponseDto().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [co.novu.co.novu.sdk.models.components.TriggerEventRequestDto](../../models/shared/TriggerEventRequestDto.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.EventsControllerTriggerResponse>](../../models/operations/EventsControllerTriggerResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## triggerBroadcast

Trigger a broadcast event to all existing subscribers, could be used to send announcements, etc.
      In the future could be used to trigger events to a subset of subscribers based on defined filters.

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

            TriggerEventToAllRequestDto req = TriggerEventToAllRequestDto.builder()
                .name("<value>")
                .payload(TriggerEventToAllRequestDtoPayload.builder()
                        .build())
                .overrides(TriggerEventToAllRequestDtoOverrides.builder()
                    .build())
                .build();

            EventsControllerBroadcastEventToAllResponse res = sdk.events().triggerBroadcast()
                .request(req)
                .call();

            if (res.triggerEventResponseDto().isPresent()) {
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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [co.novu.co.novu.sdk.models.components.TriggerEventToAllRequestDto](../../models/shared/TriggerEventToAllRequestDto.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.EventsControllerBroadcastEventToAllResponse>](../../models/operations/EventsControllerBroadcastEventToAllResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## triggerBulk


      Using this endpoint you can trigger multiple events at once, to avoid multiple calls to the API.
      The bulk API is limited to 100 events per request.
    

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

            BulkTriggerEventDto req = BulkTriggerEventDto.builder()
                .events(java.util.List.of(
                        TriggerEventRequestDto.builder()
                            .name("workflow_identifier")
                            .to(java.util.List.of(
                                    To.of(TopicPayloadDto.builder()
                                            .topicKey("topic_key")
                                            .type(TopicPayloadDtoType.TOPIC)
                                            .build())))
                            .overrides(TriggerEventRequestDtoOverrides.builder()
                                .build())
                            .payload(TriggerEventRequestDtoPayload.builder()
                                .build())
                            .build()))
                .build();

            EventsControllerTriggerBulkResponse res = sdk.events().triggerBulk()
                .request(req)
                .call();

            if (res.triggerEventResponseDtos().isPresent()) {
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [co.novu.co.novu.sdk.models.components.BulkTriggerEventDto](../../models/shared/BulkTriggerEventDto.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.EventsControllerTriggerBulkResponse>](../../models/operations/EventsControllerTriggerBulkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
