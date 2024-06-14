/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

import co.novu.co.novu.sdk.models.errors.SDKError;
import co.novu.co.novu.sdk.utils.LazySingletonValue;
import co.novu.co.novu.sdk.utils.Options.Builder;
import co.novu.co.novu.sdk.utils.Options;
import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class SubscribersControllerGetSubscriberRequestBuilder {

    private String subscriberId;
    private Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallSubscribersControllerGetSubscriber sdk;

    public SubscribersControllerGetSubscriberRequestBuilder(SDKMethodInterfaces.MethodCallSubscribersControllerGetSubscriber sdk) {
        this.sdk = sdk;
    }

    public SubscribersControllerGetSubscriberRequestBuilder subscriberId(String subscriberId) {
        Utils.checkNotNull(subscriberId, "subscriberId");
        this.subscriberId = subscriberId;
        return this;
    }
                
    public SubscribersControllerGetSubscriberRequestBuilder retryConfig(co.novu.co.novu.sdk.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public SubscribersControllerGetSubscriberRequestBuilder retryConfig(Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public SubscribersControllerGetSubscriberResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.retrieve(
            subscriberId,
            options);
    }
}
