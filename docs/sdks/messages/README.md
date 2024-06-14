# Messages
(*messages()*)

## Overview

A message in Novu represents a notification delivered to a recipient on a particular channel. Messages contain information about the request that triggered its delivery, a view of the data sent to the recipient, and a timeline of its lifecycle events. Learn more about messages.

<https://docs.novu.co/workflows/messages>
### Available Operations

* [delete](#delete) - Delete message
* [deleteByTransactionId](#deletebytransactionid) - Delete messages by transactionId
* [retrieve](#retrieve) - Get messages

## delete

Deletes a message entity from the Novu platform

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

            MessagesControllerDeleteMessageResponse res = sdk.messages().delete()
                .messageId("<value>")
                .call();

            if (res.deleteMessageResponseDto().isPresent()) {
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
| `messageId`        | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageResponse>](../../models/operations/MessagesControllerDeleteMessageResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteByTransactionId

Deletes messages entity from the Novu platform using TransactionId of message

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

            MessagesControllerDeleteMessagesByTransactionIdResponse res = sdk.messages().deleteByTransactionId()
                .channel(Channel.PUSH)
                .transactionId("<value>")
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `channel`                                                                                               | [Optional<? extends co.novu.co.novu.sdk.models.operations.Channel>](../../models/operations/Channel.md) | :heavy_minus_sign:                                                                                      | The channel of the message to be deleted                                                                |
| `transactionId`                                                                                         | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdResponse>](../../models/operations/MessagesControllerDeleteMessagesByTransactionIdResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## retrieve

Returns a list of messages, could paginate using the `page` query parameter

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

            MessagesControllerGetMessagesRequest req = MessagesControllerGetMessagesRequest.builder()
                .build();

            MessagesControllerGetMessagesResponse res = sdk.messages().retrieve()
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

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesRequest](../../models/operations/MessagesControllerGetMessagesRequest.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesResponse>](../../models/operations/MessagesControllerGetMessagesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
