# Preferences
(*subscribers().preferences()*)

### Available Operations

* [list](#list) - Get subscriber preferences
* [retrieveByLevel](#retrievebylevel) - Get subscriber preferences by level
* [update](#update) - Update subscriber preference
* [updateGlobal](#updateglobal) - Update subscriber global preferences

## list

Get subscriber preferences

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

            SubscribersControllerListSubscriberPreferencesResponse res = sdk.subscribers().preferences().list()
                .subscriberId("<value>")
                .call();

            if (res.updateSubscriberPreferenceResponseDtos().isPresent()) {
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
| `subscriberId`     | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerListSubscriberPreferencesResponse>](../../models/operations/SubscribersControllerListSubscriberPreferencesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## retrieveByLevel

Get subscriber preferences by level

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

            SubscribersControllerGetSubscriberPreferenceByLevelResponse res = sdk.subscribers().preferences().retrieveByLevel()
                .parameter("<value>")
                .subscriberId("<value>")
                .call();

            if (res.getSubscriberPreferencesResponseDtos().isPresent()) {
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
| `parameter`        | *String*           | :heavy_check_mark: | N/A                |
| `subscriberId`     | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerGetSubscriberPreferenceByLevelResponse>](../../models/operations/SubscribersControllerGetSubscriberPreferenceByLevelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Update subscriber preference

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

            SubscribersControllerUpdateSubscriberPreferenceRequest req = SubscribersControllerUpdateSubscriberPreferenceRequest.builder()
                .subscriberId("<value>")
                .parameter("<value>")
                .updateSubscriberPreferenceRequestDto(UpdateSubscriberPreferenceRequestDto.builder()
                        .build())
                .build();

            SubscribersControllerUpdateSubscriberPreferenceResponse res = sdk.subscribers().preferences().update()
                .request(req)
                .call();

            if (res.updateSubscriberPreferenceResponseDto().isPresent()) {
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

| Parameter                                                                                                                                                                         | Type                                                                                                                                                                              | Required                                                                                                                                                                          | Description                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                         | [co.novu.co.novu.sdk.models.operations.SubscribersControllerUpdateSubscriberPreferenceRequest](../../models/operations/SubscribersControllerUpdateSubscriberPreferenceRequest.md) | :heavy_check_mark:                                                                                                                                                                | The request object to use for the request.                                                                                                                                        |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerUpdateSubscriberPreferenceResponse>](../../models/operations/SubscribersControllerUpdateSubscriberPreferenceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateGlobal

Update subscriber global preferences

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

            SubscribersControllerUpdateSubscriberGlobalPreferencesResponse res = sdk.subscribers().preferences().updateGlobal()
                .subscriberId("<value>")
                .updateSubscriberGlobalPreferencesRequestDto(UpdateSubscriberGlobalPreferencesRequestDto.builder()
                    .build())
                .call();

            if (res.updateSubscriberPreferenceResponseDto().isPresent()) {
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

| Parameter                                                                                                                                                   | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `subscriberId`                                                                                                                                              | *String*                                                                                                                                                    | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         |
| `updateSubscriberGlobalPreferencesRequestDto`                                                                                                               | [co.novu.co.novu.sdk.models.components.UpdateSubscriberGlobalPreferencesRequestDto](../../models/components/UpdateSubscriberGlobalPreferencesRequestDto.md) | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerUpdateSubscriberGlobalPreferencesResponse>](../../models/operations/SubscribersControllerUpdateSubscriberGlobalPreferencesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
