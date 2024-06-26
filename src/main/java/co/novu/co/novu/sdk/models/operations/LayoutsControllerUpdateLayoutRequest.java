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

public class LayoutsControllerUpdateLayoutRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=layoutId")
    private String layoutId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private co.novu.co.novu.sdk.models.components.UpdateLayoutRequestDto updateLayoutRequestDto;

    @JsonCreator
    public LayoutsControllerUpdateLayoutRequest(
            String layoutId,
            co.novu.co.novu.sdk.models.components.UpdateLayoutRequestDto updateLayoutRequestDto) {
        Utils.checkNotNull(layoutId, "layoutId");
        Utils.checkNotNull(updateLayoutRequestDto, "updateLayoutRequestDto");
        this.layoutId = layoutId;
        this.updateLayoutRequestDto = updateLayoutRequestDto;
    }

    @JsonIgnore
    public String layoutId() {
        return layoutId;
    }

    @JsonIgnore
    public co.novu.co.novu.sdk.models.components.UpdateLayoutRequestDto updateLayoutRequestDto() {
        return updateLayoutRequestDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LayoutsControllerUpdateLayoutRequest withLayoutId(String layoutId) {
        Utils.checkNotNull(layoutId, "layoutId");
        this.layoutId = layoutId;
        return this;
    }

    public LayoutsControllerUpdateLayoutRequest withUpdateLayoutRequestDto(co.novu.co.novu.sdk.models.components.UpdateLayoutRequestDto updateLayoutRequestDto) {
        Utils.checkNotNull(updateLayoutRequestDto, "updateLayoutRequestDto");
        this.updateLayoutRequestDto = updateLayoutRequestDto;
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
        LayoutsControllerUpdateLayoutRequest other = (LayoutsControllerUpdateLayoutRequest) o;
        return 
            java.util.Objects.deepEquals(this.layoutId, other.layoutId) &&
            java.util.Objects.deepEquals(this.updateLayoutRequestDto, other.updateLayoutRequestDto);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            layoutId,
            updateLayoutRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LayoutsControllerUpdateLayoutRequest.class,
                "layoutId", layoutId,
                "updateLayoutRequestDto", updateLayoutRequestDto);
    }
    
    public final static class Builder {
 
        private String layoutId;
 
        private co.novu.co.novu.sdk.models.components.UpdateLayoutRequestDto updateLayoutRequestDto;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder layoutId(String layoutId) {
            Utils.checkNotNull(layoutId, "layoutId");
            this.layoutId = layoutId;
            return this;
        }

        public Builder updateLayoutRequestDto(co.novu.co.novu.sdk.models.components.UpdateLayoutRequestDto updateLayoutRequestDto) {
            Utils.checkNotNull(updateLayoutRequestDto, "updateLayoutRequestDto");
            this.updateLayoutRequestDto = updateLayoutRequestDto;
            return this;
        }
        
        public LayoutsControllerUpdateLayoutRequest build() {
            return new LayoutsControllerUpdateLayoutRequest(
                layoutId,
                updateLayoutRequestDto);
        }
    }
}

