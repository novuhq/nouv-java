# Authentication
(*subscribers().authentication()*)

### Available Operations

* [chatAccessOauth](#chataccessoauth) - Handle chat oauth
* [chatAccessOauthCallBack](#chataccessoauthcallback) - Handle providers oauth redirect

## chatAccessOauth

Handle chat oauth

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

            SubscribersControllerChatAccessOauthRequest req = SubscribersControllerChatAccessOauthRequest.builder()
                .subscriberId("<value>")
                .providerId("<value>")
                .hmacHash("<value>")
                .environmentId("<value>")
                .build();

            SubscribersControllerChatAccessOauthResponse res = sdk.subscribers().authentication().chatAccessOauth()
                .request(req)
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

| Parameter                                                                                                                                                   | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                   | [co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthRequest](../../models/operations/SubscribersControllerChatAccessOauthRequest.md) | :heavy_check_mark:                                                                                                                                          | The request object to use for the request.                                                                                                                  |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthResponse>](../../models/operations/SubscribersControllerChatAccessOauthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## chatAccessOauthCallBack

Handle providers oauth redirect

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

            SubscribersControllerChatOauthCallbackRequest req = SubscribersControllerChatOauthCallbackRequest.builder()
                .subscriberId("<value>")
                .providerId("<value>")
                .code("<value>")
                .hmacHash("<value>")
                .environmentId("<value>")
                .build();

            SubscribersControllerChatOauthCallbackResponse res = sdk.subscribers().authentication().chatAccessOauthCallBack()
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

| Parameter                                                                                                                                                       | Type                                                                                                                                                            | Required                                                                                                                                                        | Description                                                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                       | [co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackRequest](../../models/operations/SubscribersControllerChatOauthCallbackRequest.md) | :heavy_check_mark:                                                                                                                                              | The request object to use for the request.                                                                                                                      |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackResponse>](../../models/operations/SubscribersControllerChatOauthCallbackResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
