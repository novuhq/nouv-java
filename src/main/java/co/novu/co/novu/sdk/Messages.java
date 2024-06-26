/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk;

import co.novu.co.novu.sdk.models.errors.SDKError;
import co.novu.co.novu.sdk.models.operations.SDKMethodInterfaces.*;
import co.novu.co.novu.sdk.utils.HTTPClient;
import co.novu.co.novu.sdk.utils.HTTPRequest;
import co.novu.co.novu.sdk.utils.Hook.AfterErrorContextImpl;
import co.novu.co.novu.sdk.utils.Hook.AfterSuccessContextImpl;
import co.novu.co.novu.sdk.utils.Hook.BeforeRequestContextImpl;
import co.novu.co.novu.sdk.utils.JSON;
import co.novu.co.novu.sdk.utils.Options;
import co.novu.co.novu.sdk.utils.Retries.NonRetryableException;
import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A message in Novu represents a notification delivered to a recipient on a particular channel. Messages contain information about the request that triggered its delivery, a view of the data sent to the recipient, and a timeline of its lifecycle events. Learn more about messages.
 * https://docs.novu.co/workflows/messages
 */
public class Messages implements
            MethodCallMessagesControllerDeleteMessage,
            MethodCallMessagesControllerDeleteMessagesByTransactionId,
            MethodCallMessagesControllerGetMessages {

    private final SDKConfiguration sdkConfiguration;

    Messages(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Delete message
     * Deletes a message entity from the Novu platform
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageRequestBuilder delete() {
        return new co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageRequestBuilder(this);
    }

    /**
     * Delete message
     * Deletes a message entity from the Novu platform
     * @param messageId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageResponse delete(
            String messageId) throws Exception {
        return delete(messageId, Optional.empty());
    }
    /**
     * Delete message
     * Deletes a message entity from the Novu platform
     * @param messageId
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageResponse delete(
            String messageId,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageRequest request =
            co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageRequest
                .builder()
                .messageId(messageId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageRequest.class,
                _baseUrl,
                "/v1/messages/{messageId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HTTPRequest _finalReq = _req;
        co.novu.co.novu.sdk.utils.RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            _retryConfig = co.novu.co.novu.sdk.utils.RetryConfig.builder()
                .backoff(co.novu.co.novu.sdk.utils.BackoffStrategy.builder()
                            .initialInterval(500, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .maxInterval(30000, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new java.util.ArrayList<>();
        _statusCodes.add("408");
        _statusCodes.add("409");
        _statusCodes.add("429");
        _statusCodes.add("5XX");
        co.novu.co.novu.sdk.utils.Retries _retries = co.novu.co.novu.sdk.utils.Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl("MessagesController_deleteMessage", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("MessagesController_deleteMessage", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("MessagesController_deleteMessage", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessageResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.components.DeleteMessageResponseDto _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.components.DeleteMessageResponseDto>() {});
                _res.withDeleteMessageResponseDto(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "409", "429", "4XX", "503", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Delete messages by transactionId
     * Deletes messages entity from the Novu platform using TransactionId of message
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdRequestBuilder deleteByTransactionId() {
        return new co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdRequestBuilder(this);
    }

    /**
     * Delete messages by transactionId
     * Deletes messages entity from the Novu platform using TransactionId of message
     * @param transactionId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdResponse deleteByTransactionId(
            String transactionId) throws Exception {
        return deleteByTransactionId(Optional.empty(), transactionId, Optional.empty());
    }
    /**
     * Delete messages by transactionId
     * Deletes messages entity from the Novu platform using TransactionId of message
     * @param channel The channel of the message to be deleted
     * @param transactionId
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdResponse deleteByTransactionId(
            Optional<? extends co.novu.co.novu.sdk.models.operations.Channel> channel,
            String transactionId,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdRequest request =
            co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdRequest
                .builder()
                .channel(channel)
                .transactionId(transactionId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdRequest.class,
                _baseUrl,
                "/v1/messages/transaction/{transactionId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HTTPRequest _finalReq = _req;
        co.novu.co.novu.sdk.utils.RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            _retryConfig = co.novu.co.novu.sdk.utils.RetryConfig.builder()
                .backoff(co.novu.co.novu.sdk.utils.BackoffStrategy.builder()
                            .initialInterval(500, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .maxInterval(30000, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new java.util.ArrayList<>();
        _statusCodes.add("408");
        _statusCodes.add("409");
        _statusCodes.add("429");
        _statusCodes.add("5XX");
        co.novu.co.novu.sdk.utils.Retries _retries = co.novu.co.novu.sdk.utils.Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl("MessagesController_deleteMessagesByTransactionId", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("MessagesController_deleteMessagesByTransactionId", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("MessagesController_deleteMessagesByTransactionId", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.MessagesControllerDeleteMessagesByTransactionIdResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "409", "429", "4XX", "503", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Get messages
     * Returns a list of messages, could paginate using the `page` query parameter
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesRequestBuilder retrieve() {
        return new co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesRequestBuilder(this);
    }

    /**
     * Get messages
     * Returns a list of messages, could paginate using the `page` query parameter
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesResponse retrieve(
            co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesRequest request) throws Exception {
        return retrieve(request, Optional.empty());
    }
    /**
     * Get messages
     * Returns a list of messages, could paginate using the `page` query parameter
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesResponse retrieve(
            co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/messages");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HTTPRequest _finalReq = _req;
        co.novu.co.novu.sdk.utils.RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            _retryConfig = co.novu.co.novu.sdk.utils.RetryConfig.builder()
                .backoff(co.novu.co.novu.sdk.utils.BackoffStrategy.builder()
                            .initialInterval(500, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .maxInterval(30000, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new java.util.ArrayList<>();
        _statusCodes.add("408");
        _statusCodes.add("409");
        _statusCodes.add("429");
        _statusCodes.add("5XX");
        co.novu.co.novu.sdk.utils.Retries _retries = co.novu.co.novu.sdk.utils.Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl("MessagesController_getMessages", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("MessagesController_getMessages", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("MessagesController_getMessages", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.MessagesControllerGetMessagesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.components.ActivitiesResponseDto _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.components.ActivitiesResponseDto>() {});
                _res.withActivitiesResponseDto(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "409", "429", "4XX", "503", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
