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

public class Authentication implements
            MethodCallSubscribersControllerChatAccessOauth,
            MethodCallSubscribersControllerChatOauthCallback {

    private final SDKConfiguration sdkConfiguration;

    Authentication(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Handle chat oauth
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthRequestBuilder chatAccessOauth() {
        return new co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthRequestBuilder(this);
    }

    /**
     * Handle chat oauth
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthResponse chatAccessOauth(
            co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthRequest request) throws Exception {
        return chatAccessOauth(request, Optional.empty());
    }
    /**
     * Handle chat oauth
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthResponse chatAccessOauth(
            co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthRequest.class,
                _baseUrl,
                "/v1/subscribers/{subscriberId}/credentials/{providerId}/oauth",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthRequest.class,
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
                            new BeforeRequestContextImpl("SubscribersController_chatAccessOauth", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("SubscribersController_chatAccessOauth", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("SubscribersController_chatAccessOauth", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.SubscribersControllerChatAccessOauthResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
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
     * Handle providers oauth redirect
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackRequestBuilder chatAccessOauthCallBack() {
        return new co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackRequestBuilder(this);
    }

    /**
     * Handle providers oauth redirect
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackResponse chatAccessOauthCallBack(
            co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackRequest request) throws Exception {
        return chatAccessOauthCallBack(request, Optional.empty());
    }
    /**
     * Handle providers oauth redirect
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackResponse chatAccessOauthCallBack(
            co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackRequest.class,
                _baseUrl,
                "/v1/subscribers/{subscriberId}/credentials/{providerId}/oauth/callback",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackRequest.class,
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
                            new BeforeRequestContextImpl("SubscribersController_chatOauthCallback", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("SubscribersController_chatOauthCallback", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("SubscribersController_chatOauthCallback", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.operations.SubscribersControllerChatOauthCallbackResponseBody>() {});
                _res.withObject(java.util.Optional.ofNullable(_out));
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
