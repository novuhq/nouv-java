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

public class EmailBlock {

    @JsonProperty("content")
    private String content;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("styles")
    private Optional<? extends EmailBlockStyles> styles;

    @JsonProperty("type")
    private EmailBlockType type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private Optional<? extends String> url;

    @JsonCreator
    public EmailBlock(
            @JsonProperty("content") String content,
            @JsonProperty("styles") Optional<? extends EmailBlockStyles> styles,
            @JsonProperty("type") EmailBlockType type,
            @JsonProperty("url") Optional<? extends String> url) {
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(styles, "styles");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(url, "url");
        this.content = content;
        this.styles = styles;
        this.type = type;
        this.url = url;
    }
    
    public EmailBlock(
            String content,
            EmailBlockType type) {
        this(content, Optional.empty(), type, Optional.empty());
    }

    @JsonIgnore
    public String content() {
        return content;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EmailBlockStyles> styles() {
        return (Optional<EmailBlockStyles>) styles;
    }

    @JsonIgnore
    public EmailBlockType type() {
        return type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> url() {
        return (Optional<String>) url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EmailBlock withContent(String content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public EmailBlock withStyles(EmailBlockStyles styles) {
        Utils.checkNotNull(styles, "styles");
        this.styles = Optional.ofNullable(styles);
        return this;
    }

    public EmailBlock withStyles(Optional<? extends EmailBlockStyles> styles) {
        Utils.checkNotNull(styles, "styles");
        this.styles = styles;
        return this;
    }

    public EmailBlock withType(EmailBlockType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public EmailBlock withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    public EmailBlock withUrl(Optional<? extends String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        EmailBlock other = (EmailBlock) o;
        return 
            java.util.Objects.deepEquals(this.content, other.content) &&
            java.util.Objects.deepEquals(this.styles, other.styles) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            content,
            styles,
            type,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmailBlock.class,
                "content", content,
                "styles", styles,
                "type", type,
                "url", url);
    }
    
    public final static class Builder {
 
        private String content;
 
        private Optional<? extends EmailBlockStyles> styles = Optional.empty();
 
        private EmailBlockType type;
 
        private Optional<? extends String> url = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder content(String content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder styles(EmailBlockStyles styles) {
            Utils.checkNotNull(styles, "styles");
            this.styles = Optional.ofNullable(styles);
            return this;
        }

        public Builder styles(Optional<? extends EmailBlockStyles> styles) {
            Utils.checkNotNull(styles, "styles");
            this.styles = styles;
            return this;
        }

        public Builder type(EmailBlockType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        public Builder url(Optional<? extends String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public EmailBlock build() {
            return new EmailBlock(
                content,
                styles,
                type,
                url);
        }
    }
}

