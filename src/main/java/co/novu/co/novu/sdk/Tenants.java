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
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import java.io.InputStream;
import java.lang.Long;
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
 * A tenant represents a group of users. As a developer, when your apps have organizations, they are referred to as tenants. Tenants in Novu provides the ability to tailor specific notification experiences to users of different groups or organizations.
 * https://docs.novu.co/tenants
 */
public class Tenants implements
            MethodCallTenantControllerCreateTenant,
            MethodCallTenantControllerRemoveTenant,
            MethodCallTenantControllerListTenants,
            MethodCallTenantControllerGetTenantById,
            MethodCallTenantControllerUpdateTenant {

    private final SDKConfiguration sdkConfiguration;

    Tenants(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create tenant
     * Create tenant under the current environment
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerCreateTenantRequestBuilder create() {
        return new co.novu.co.novu.sdk.models.operations.TenantControllerCreateTenantRequestBuilder(this);
    }

    /**
     * Create tenant
     * Create tenant under the current environment
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerCreateTenantResponse create(
            co.novu.co.novu.sdk.models.components.CreateTenantRequestDto request) throws Exception {
        return create(request, Optional.empty());
    }
    /**
     * Create tenant
     * Create tenant under the current environment
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerCreateTenantResponse create(
            co.novu.co.novu.sdk.models.components.CreateTenantRequestDto request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/tenants");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<co.novu.co.novu.sdk.models.components.CreateTenantRequestDto>() {});
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
                            new BeforeRequestContextImpl("TenantController_createTenant", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("TenantController_createTenant", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("TenantController_createTenant", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.TenantControllerCreateTenantResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.TenantControllerCreateTenantResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.TenantControllerCreateTenantResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200", "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.components.CreateTenantResponseDto _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.components.CreateTenantResponseDto>() {});
                _res.withCreateTenantResponseDto(java.util.Optional.ofNullable(_out));
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
     * Delete tenant
     * Deletes a tenant entity from the Novu platform
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantRequestBuilder delete() {
        return new co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantRequestBuilder(this);
    }

    /**
     * Delete tenant
     * Deletes a tenant entity from the Novu platform
     * @param identifier
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantResponse delete(
            String identifier) throws Exception {
        return delete(identifier, Optional.empty());
    }
    /**
     * Delete tenant
     * Deletes a tenant entity from the Novu platform
     * @param identifier
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantResponse delete(
            String identifier,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantRequest request =
            co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantRequest
                .builder()
                .identifier(identifier)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantRequest.class,
                _baseUrl,
                "/v1/tenants/{identifier}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
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
                            new BeforeRequestContextImpl("TenantController_removeTenant", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("TenantController_removeTenant", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("TenantController_removeTenant", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "409", "429", "4XX", "503", "5XX")) {
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
     * Get tenants
     * Returns a list of tenants, could paginated using the `page` and `limit` query parameter
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsRequestBuilder list() {
        return new co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsRequestBuilder(this);
    }

    /**
     * Get tenants
     * Returns a list of tenants, could paginated using the `page` and `limit` query parameter
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty());
    }
    /**
     * Get tenants
     * Returns a list of tenants, could paginated using the `page` and `limit` query parameter
     * @param page
     * @param limit
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsResponse list(
            Optional<? extends Double> page,
            Optional<? extends Double> limit,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsRequest request =
            co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsRequest
                .builder()
                .page(page)
                .limit(limit)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/tenants");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsRequest.class,
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
                            new BeforeRequestContextImpl("TenantController_listTenants", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("TenantController_listTenants", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("TenantController_listTenants", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        byte[] _fullResponse = Utils.toByteArrayAndClose(_httpRes.body());
        
        @SuppressWarnings("deprecation")
        co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes)
                .next(() -> {
                    String _stringBody = new String(_fullResponse, StandardCharsets.UTF_8);
                    ReadContext _body = JsonPath.parse(_stringBody);

                    if (request == null) {
                        return Optional.empty();
                    }
                    long _newPage = page + 1;
                    
                    @SuppressWarnings("unchecked")
                    List<Long> _firstResult = _body.read("$.data.resultArray", List.class);
                    if (_firstResult == null || _firstResult.isEmpty()){
                        return Optional.empty();
                    };
                    long _resolvedLimit = limit.get();
                    
                    if (_firstResult.size() < _resolvedLimit) {
                        return Optional.empty();
                    };
                    co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsRequestBuilder _ret = list();
                    _ret.page(_newPage);
                    _ret.limit(_resolvedLimit);
                    return Optional.of(_ret.call());
                });

        co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsResponseBody _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsResponseBody>() {});
                _res.withObject(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    _fullResponse);
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "409", "429", "4XX", "503", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    _fullResponse);
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            _fullResponse);
    }



    /**
     * Get tenant
     * Get tenant by your internal id used to identify the tenant
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdRequestBuilder retrieve() {
        return new co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdRequestBuilder(this);
    }

    /**
     * Get tenant
     * Get tenant by your internal id used to identify the tenant
     * @param identifier
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdResponse retrieve(
            String identifier) throws Exception {
        return retrieve(identifier, Optional.empty());
    }
    /**
     * Get tenant
     * Get tenant by your internal id used to identify the tenant
     * @param identifier
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdResponse retrieve(
            String identifier,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdRequest request =
            co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdRequest
                .builder()
                .identifier(identifier)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdRequest.class,
                _baseUrl,
                "/v1/tenants/{identifier}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
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
                            new BeforeRequestContextImpl("TenantController_getTenantById", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("TenantController_getTenantById", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("TenantController_getTenantById", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.components.GetTenantResponseDto _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.components.GetTenantResponseDto>() {});
                _res.withGetTenantResponseDto(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "409", "429", "4XX", "503", "5XX")) {
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
     * Update tenant
     * Update tenant by your internal id used to identify the tenant
     * @return The call builder
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantRequestBuilder update() {
        return new co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantRequestBuilder(this);
    }

    /**
     * Update tenant
     * Update tenant by your internal id used to identify the tenant
     * @param identifier
     * @param updateTenantRequestDto
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantResponse update(
            String identifier,
            co.novu.co.novu.sdk.models.components.UpdateTenantRequestDto updateTenantRequestDto) throws Exception {
        return update(identifier, updateTenantRequestDto, Optional.empty());
    }
    /**
     * Update tenant
     * Update tenant by your internal id used to identify the tenant
     * @param identifier
     * @param updateTenantRequestDto
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantResponse update(
            String identifier,
            co.novu.co.novu.sdk.models.components.UpdateTenantRequestDto updateTenantRequestDto,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }

        co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantRequest request =
            co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantRequest
                .builder()
                .identifier(identifier)
                .updateTenantRequestDto(updateTenantRequestDto)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantRequest.class,
                _baseUrl,
                "/v1/tenants/{identifier}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PATCH");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "updateTenantRequestDto", "json", false);
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
                            new BeforeRequestContextImpl("TenantController_updateTenant", Optional.empty(), sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl("TenantController_updateTenant", Optional.empty(), sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl("TenantController_updateTenant", Optional.empty(), sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantResponse.Builder _resBuilder = 
            co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<co.novu.co.novu.sdk.models.components.UpdateTenantResponseDto>() {});
                _res.withUpdateTenantResponseDto(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "409", "429", "4XX", "503", "5XX")) {
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
