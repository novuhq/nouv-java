# Branding
(*organizations().branding()*)

### Available Operations

* [update](#update) - Update organization branding details

## update

Update organization branding details

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

            UpdateBrandingDetailsDto req = UpdateBrandingDetailsDto.builder()
                .color("<value>")
                .contentBackground("<value>")
                .fontColor("<value>")
                .logo("<value>")
                .build();

            OrganizationControllerUpdateBrandingDetailsResponse res = sdk.organizations().branding().update()
                .request(req)
                .call();

            if (res.organizationBrandingResponseDto().isPresent()) {
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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [co.novu.co.novu.sdk.models.components.UpdateBrandingDetailsDto](../../models/shared/UpdateBrandingDetailsDto.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.OrganizationControllerUpdateBrandingDetailsResponse>](../../models/operations/OrganizationControllerUpdateBrandingDetailsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
