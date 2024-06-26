/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

import co.novu.co.novu.sdk.utils.SpeakeasyMetadata;
import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class IntegrationsControllerRemoveIntegrationRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=integrationId")
    private String integrationId;

    @JsonCreator
    public IntegrationsControllerRemoveIntegrationRequest(
            String integrationId) {
        Utils.checkNotNull(integrationId, "integrationId");
        this.integrationId = integrationId;
    }

    @JsonIgnore
    public String integrationId() {
        return integrationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public IntegrationsControllerRemoveIntegrationRequest withIntegrationId(String integrationId) {
        Utils.checkNotNull(integrationId, "integrationId");
        this.integrationId = integrationId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegrationsControllerRemoveIntegrationRequest other = (IntegrationsControllerRemoveIntegrationRequest) o;
        return 
            java.util.Objects.deepEquals(this.integrationId, other.integrationId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            integrationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IntegrationsControllerRemoveIntegrationRequest.class,
                "integrationId", integrationId);
    }
    
    public final static class Builder {
 
        private String integrationId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder integrationId(String integrationId) {
            Utils.checkNotNull(integrationId, "integrationId");
            this.integrationId = integrationId;
            return this;
        }
        
        public IntegrationsControllerRemoveIntegrationRequest build() {
            return new IntegrationsControllerRemoveIntegrationRequest(
                integrationId);
        }
    }
}

