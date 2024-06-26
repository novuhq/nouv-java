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


public class SubscribersControllerMarkActionAsSeenRequestBuilder {

    private SubscribersControllerMarkActionAsSeenRequest request;
    private Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallSubscribersControllerMarkActionAsSeen sdk;

    public SubscribersControllerMarkActionAsSeenRequestBuilder(SDKMethodInterfaces.MethodCallSubscribersControllerMarkActionAsSeen sdk) {
        this.sdk = sdk;
    }

    public SubscribersControllerMarkActionAsSeenRequestBuilder request(SubscribersControllerMarkActionAsSeenRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public SubscribersControllerMarkActionAsSeenRequestBuilder retryConfig(co.novu.co.novu.sdk.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public SubscribersControllerMarkActionAsSeenRequestBuilder retryConfig(Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public SubscribersControllerMarkActionAsSeenResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateAsSeen(
            request,
            options);
    }
}
