/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk;

import co.novu.co.novu.sdk.utils.Hook.SdkInitData;
import co.novu.co.novu.sdk.utils.HTTPClient;
import co.novu.co.novu.sdk.utils.RetryConfig;
import co.novu.co.novu.sdk.models.components.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
      public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "1.0";
    public String sdkVersion = "0.2.0";
    public String genVersion = "2.342.6";
    public String userAgent = "speakeasy-sdk/java 0.2.0 2.342.6 1.0 co.novu.co.novu.sdk";

    private co.novu.co.novu.sdk.utils.Hooks _hooks = createHooks();

    private static co.novu.co.novu.sdk.utils.Hooks createHooks() {
        co.novu.co.novu.sdk.utils.Hooks hooks = new co.novu.co.novu.sdk.utils.Hooks();
        return hooks;
    }
    
    public co.novu.co.novu.sdk.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(co.novu.co.novu.sdk.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        co.novu.co.novu.sdk.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
