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


public class TopicsControllerAddSubscribersRequestBuilder {

    private String topicKey;
    private co.novu.co.novu.sdk.models.components.AddSubscribersRequestDto addSubscribersRequestDto;
    private Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallTopicsControllerAddSubscribers sdk;

    public TopicsControllerAddSubscribersRequestBuilder(SDKMethodInterfaces.MethodCallTopicsControllerAddSubscribers sdk) {
        this.sdk = sdk;
    }

    public TopicsControllerAddSubscribersRequestBuilder topicKey(String topicKey) {
        Utils.checkNotNull(topicKey, "topicKey");
        this.topicKey = topicKey;
        return this;
    }

    public TopicsControllerAddSubscribersRequestBuilder addSubscribersRequestDto(co.novu.co.novu.sdk.models.components.AddSubscribersRequestDto addSubscribersRequestDto) {
        Utils.checkNotNull(addSubscribersRequestDto, "addSubscribersRequestDto");
        this.addSubscribersRequestDto = addSubscribersRequestDto;
        return this;
    }
                
    public TopicsControllerAddSubscribersRequestBuilder retryConfig(co.novu.co.novu.sdk.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public TopicsControllerAddSubscribersRequestBuilder retryConfig(Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public TopicsControllerAddSubscribersResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.assign(
            topicKey,
            addSubscribersRequestDto,
            options);
    }
}
