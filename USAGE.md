<!-- Start SDK Example Usage [usage] -->
### Trigger Notification Event

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
<!-- End SDK Example Usage [usage] -->