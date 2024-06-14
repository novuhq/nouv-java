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

public class LayoutsControllerDeleteLayoutRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=layoutId")
    private String layoutId;

    @JsonCreator
    public LayoutsControllerDeleteLayoutRequest(
            String layoutId) {
        Utils.checkNotNull(layoutId, "layoutId");
        this.layoutId = layoutId;
    }

    @JsonIgnore
    public String layoutId() {
        return layoutId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LayoutsControllerDeleteLayoutRequest withLayoutId(String layoutId) {
        Utils.checkNotNull(layoutId, "layoutId");
        this.layoutId = layoutId;
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
        LayoutsControllerDeleteLayoutRequest other = (LayoutsControllerDeleteLayoutRequest) o;
        return 
            java.util.Objects.deepEquals(this.layoutId, other.layoutId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            layoutId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LayoutsControllerDeleteLayoutRequest.class,
                "layoutId", layoutId);
    }
    
    public final static class Builder {
 
        private String layoutId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder layoutId(String layoutId) {
            Utils.checkNotNull(layoutId, "layoutId");
            this.layoutId = layoutId;
            return this;
        }
        
        public LayoutsControllerDeleteLayoutRequest build() {
            return new LayoutsControllerDeleteLayoutRequest(
                layoutId);
        }
    }
}

