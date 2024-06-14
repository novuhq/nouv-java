/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class EmailBlockStyles {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("textAlign")
    private Optional<? extends TextAlign> textAlign;

    @JsonCreator
    public EmailBlockStyles(
            @JsonProperty("textAlign") Optional<? extends TextAlign> textAlign) {
        Utils.checkNotNull(textAlign, "textAlign");
        this.textAlign = textAlign;
    }
    
    public EmailBlockStyles() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TextAlign> textAlign() {
        return (Optional<TextAlign>) textAlign;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EmailBlockStyles withTextAlign(TextAlign textAlign) {
        Utils.checkNotNull(textAlign, "textAlign");
        this.textAlign = Optional.ofNullable(textAlign);
        return this;
    }

    public EmailBlockStyles withTextAlign(Optional<? extends TextAlign> textAlign) {
        Utils.checkNotNull(textAlign, "textAlign");
        this.textAlign = textAlign;
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
        EmailBlockStyles other = (EmailBlockStyles) o;
        return 
            java.util.Objects.deepEquals(this.textAlign, other.textAlign);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            textAlign);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmailBlockStyles.class,
                "textAlign", textAlign);
    }
    
    public final static class Builder {
 
        private Optional<? extends TextAlign> textAlign = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder textAlign(TextAlign textAlign) {
            Utils.checkNotNull(textAlign, "textAlign");
            this.textAlign = Optional.ofNullable(textAlign);
            return this;
        }

        public Builder textAlign(Optional<? extends TextAlign> textAlign) {
            Utils.checkNotNull(textAlign, "textAlign");
            this.textAlign = textAlign;
            return this;
        }
        
        public EmailBlockStyles build() {
            return new EmailBlockStyles(
                textAlign);
        }
    }
}

