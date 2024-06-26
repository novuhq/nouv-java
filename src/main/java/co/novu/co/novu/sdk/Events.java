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
import co.novu.co.novu.sdk.utils.SerializedBody;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Events represent a change in state of a subscriber. They are used to trigger workflows, and enable you to send notifications to subscribers based on their actions.
 * https://docs.novu.co/workflows
 */
public class Events implements
            MethodCallEventsControllerCancel,
            MethodCallEventsControllerTrigger,
            MethodCallEventsControllerBroadcastEventToAll,
            MethodCallEventsControllerTriggerBulk {

    private final SDKConfiguration sdkConfiguration;

    Events(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Cancel triggered event
     * 
     *     Using a previously generated transactionId during the event trigger,
     *      will cancel any active or pending workflows. This is useful to cancel active digests, delays etc...
     *     
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerCancelRequestBuilder cancel() {
        return new co.novu.co.novu.sdk.models.operations.EventsControllerCancelRequestBuilder(this);
    }

    /**
     * Cancel triggered event
     * 
     *     Using a previously generated transactionId during the event trigger,
     *      will cancel any active or pending workflows. This is useful to cancel active digests, delays etc...
     *     
     * @param transactionId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerCancelResponse cancel(
            String transactionId) throws Exception {
        return cancel(transactionId, Optional.empty());
    }
    /**
     * Cancel triggered event
     * 
     *     Using a previously generated transactionId during the event trigger,
     *      will cancel any active or pending workflows. This is useful to cancel active digests, delays etc...
     *     
     * @param transactionId
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerCancelResponse cancel(
            String transactionId,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        co.novu.co.novu.sdk.models.operations.EventsControllerCancelRequest request =
            co.novu.co.novu.sdk.models.operations.EventsControllerCancelRequest
                .builder()
                .transactionId(transactionId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                co.novu.co.novu.sdk.models.operations.EventsControllerCancelRequest.class,
                _baseUrl,
                "/v1/events/trigger/{transactionId}",
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
                            new BeforeRequestContextImpl("EventsController_cancel", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("EventsController_cancel", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("EventsController_cancel", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.EventsControllerCancelResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.EventsControllerCancelResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.EventsControllerCancelResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.components.DataBooleanDto _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.components.DataBooleanDto>() {});
                _res.withDataBooleanDto(java.util.Optional.ofNullable(_out));
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
     * Trigger event
     * 
     *     Trigger event is the main (and only) way to send notifications to subscribers. 
     *     The trigger identifier is used to match the particular workflow associated with it. 
     *     Additional information can be passed according the body interface below.
     *     
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerTriggerRequestBuilder trigger() {
        return new co.novu.co.novu.sdk.models.operations.EventsControllerTriggerRequestBuilder(this);
    }

    /**
     * Trigger event
     * 
     *     Trigger event is the main (and only) way to send notifications to subscribers. 
     *     The trigger identifier is used to match the particular workflow associated with it. 
     *     Additional information can be passed according the body interface below.
     *     
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerTriggerResponse trigger(
            co.novu.co.novu.sdk.models.components.TriggerEventRequestDto request) throws Exception {
        return trigger(request, Optional.empty());
    }
    /**
     * Trigger event
     * 
     *     Trigger event is the main (and only) way to send notifications to subscribers. 
     *     The trigger identifier is used to match the particular workflow associated with it. 
     *     Additional information can be passed according the body interface below.
     *     
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerTriggerResponse trigger(
            co.novu.co.novu.sdk.models.components.TriggerEventRequestDto request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/events/trigger");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<co.novu.co.novu.sdk.models.components.TriggerEventRequestDto>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
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
                            new BeforeRequestContextImpl("EventsController_trigger", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("EventsController_trigger", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("EventsController_trigger", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.EventsControllerTriggerResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.EventsControllerTriggerResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.EventsControllerTriggerResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.components.TriggerEventResponseDto _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.components.TriggerEventResponseDto>() {});
                _res.withTriggerEventResponseDto(java.util.Optional.ofNullable(_out));
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
     * Broadcast event to all
     * Trigger a broadcast event to all existing subscribers, could be used to send announcements, etc.
     *       In the future could be used to trigger events to a subset of subscribers based on defined filters.
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerBroadcastEventToAllRequestBuilder triggerBroadcast() {
        return new co.novu.co.novu.sdk.models.operations.EventsControllerBroadcastEventToAllRequestBuilder(this);
    }

    /**
     * Broadcast event to all
     * Trigger a broadcast event to all existing subscribers, could be used to send announcements, etc.
     *       In the future could be used to trigger events to a subset of subscribers based on defined filters.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerBroadcastEventToAllResponse triggerBroadcast(
            co.novu.co.novu.sdk.models.components.TriggerEventToAllRequestDto request) throws Exception {
        return triggerBroadcast(request, Optional.empty());
    }
    /**
     * Broadcast event to all
     * Trigger a broadcast event to all existing subscribers, could be used to send announcements, etc.
     *       In the future could be used to trigger events to a subset of subscribers based on defined filters.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerBroadcastEventToAllResponse triggerBroadcast(
            co.novu.co.novu.sdk.models.components.TriggerEventToAllRequestDto request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/events/trigger/broadcast");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<co.novu.co.novu.sdk.models.components.TriggerEventToAllRequestDto>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
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
                            new BeforeRequestContextImpl("EventsController_broadcastEventToAll", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("EventsController_broadcastEventToAll", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("EventsController_broadcastEventToAll", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.EventsControllerBroadcastEventToAllResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.EventsControllerBroadcastEventToAllResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.EventsControllerBroadcastEventToAllResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200", "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.components.TriggerEventResponseDto _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.components.TriggerEventResponseDto>() {});
                _res.withTriggerEventResponseDto(java.util.Optional.ofNullable(_out));
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
     * Bulk trigger event
     * 
     *       Using this endpoint you can trigger multiple events at once, to avoid multiple calls to the API.
     *       The bulk API is limited to 100 events per request.
     *     
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerTriggerBulkRequestBuilder triggerBulk() {
        return new co.novu.co.novu.sdk.models.operations.EventsControllerTriggerBulkRequestBuilder(this);
    }

    /**
     * Bulk trigger event
     * 
     *       Using this endpoint you can trigger multiple events at once, to avoid multiple calls to the API.
     *       The bulk API is limited to 100 events per request.
     *     
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerTriggerBulkResponse triggerBulk(
            co.novu.co.novu.sdk.models.components.BulkTriggerEventDto request) throws Exception {
        return triggerBulk(request, Optional.empty());
    }
    /**
     * Bulk trigger event
     * 
     *       Using this endpoint you can trigger multiple events at once, to avoid multiple calls to the API.
     *       The bulk API is limited to 100 events per request.
     *     
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.EventsControllerTriggerBulkResponse triggerBulk(
            co.novu.co.novu.sdk.models.components.BulkTriggerEventDto request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/events/trigger/bulk");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<co.novu.co.novu.sdk.models.components.BulkTriggerEventDto>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
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
                            new BeforeRequestContextImpl("EventsController_triggerBulk", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("EventsController_triggerBulk", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("EventsController_triggerBulk", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.EventsControllerTriggerBulkResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.EventsControllerTriggerBulkResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.EventsControllerTriggerBulkResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                java.util.List<co.novu.co.novu.sdk.models.components.TriggerEventResponseDto> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<co.novu.co.novu.sdk.models.components.TriggerEventResponseDto>>() {});
                _res.withTriggerEventResponseDtos(java.util.Optional.ofNullable(_out));
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
