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


public class MessagesControllerDeleteMessagesByTransactionIdRequestBuilder {

    private Optional<? extends Channel> channel = Optional.empty();
    private String transactionId;
    private Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallMessagesControllerDeleteMessagesByTransactionId sdk;

    public MessagesControllerDeleteMessagesByTransactionIdRequestBuilder(SDKMethodInterfaces.MethodCallMessagesControllerDeleteMessagesByTransactionId sdk) {
        this.sdk = sdk;
    }
                
    public MessagesControllerDeleteMessagesByTransactionIdRequestBuilder channel(Channel channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = Optional.of(channel);
        return this;
    }

    public MessagesControllerDeleteMessagesByTransactionIdRequestBuilder channel(Optional<? extends Channel> channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = channel;
        return this;
    }

    public MessagesControllerDeleteMessagesByTransactionIdRequestBuilder transactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
        return this;
    }
                
    public MessagesControllerDeleteMessagesByTransactionIdRequestBuilder retryConfig(co.novu.co.novu.sdk.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public MessagesControllerDeleteMessagesByTransactionIdRequestBuilder retryConfig(Optional<co.novu.co.novu.sdk.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public MessagesControllerDeleteMessagesByTransactionIdResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.deleteByTransactionId(
            channel,
            transactionId,
            options);
    }
}
