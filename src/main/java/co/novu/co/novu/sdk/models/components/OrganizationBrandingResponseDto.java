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

public class OrganizationBrandingResponseDto {

    @JsonProperty("color")
    private String color;

    @JsonProperty("contentBackground")
    private String contentBackground;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    private Optional<? extends Direction> direction;

    @JsonProperty("fontColor")
    private String fontColor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fontFamily")
    private Optional<? extends String> fontFamily;

    @JsonProperty("logo")
    private String logo;

    @JsonCreator
    public OrganizationBrandingResponseDto(
            @JsonProperty("color") String color,
            @JsonProperty("contentBackground") String contentBackground,
            @JsonProperty("direction") Optional<? extends Direction> direction,
            @JsonProperty("fontColor") String fontColor,
            @JsonProperty("fontFamily") Optional<? extends String> fontFamily,
            @JsonProperty("logo") String logo) {
        Utils.checkNotNull(color, "color");
        Utils.checkNotNull(contentBackground, "contentBackground");
        Utils.checkNotNull(direction, "direction");
        Utils.checkNotNull(fontColor, "fontColor");
        Utils.checkNotNull(fontFamily, "fontFamily");
        Utils.checkNotNull(logo, "logo");
        this.color = color;
        this.contentBackground = contentBackground;
        this.direction = direction;
        this.fontColor = fontColor;
        this.fontFamily = fontFamily;
        this.logo = logo;
    }
    
    public OrganizationBrandingResponseDto(
            String color,
            String contentBackground,
            String fontColor,
            String logo) {
        this(color, contentBackground, Optional.empty(), fontColor, Optional.empty(), logo);
    }

    @JsonIgnore
    public String color() {
        return color;
    }

    @JsonIgnore
    public String contentBackground() {
        return contentBackground;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Direction> direction() {
        return (Optional<Direction>) direction;
    }

    @JsonIgnore
    public String fontColor() {
        return fontColor;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> fontFamily() {
        return (Optional<String>) fontFamily;
    }

    @JsonIgnore
    public String logo() {
        return logo;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrganizationBrandingResponseDto withColor(String color) {
        Utils.checkNotNull(color, "color");
        this.color = color;
        return this;
    }

    public OrganizationBrandingResponseDto withContentBackground(String contentBackground) {
        Utils.checkNotNull(contentBackground, "contentBackground");
        this.contentBackground = contentBackground;
        return this;
    }

    public OrganizationBrandingResponseDto withDirection(Direction direction) {
        Utils.checkNotNull(direction, "direction");
        this.direction = Optional.ofNullable(direction);
        return this;
    }

    public OrganizationBrandingResponseDto withDirection(Optional<? extends Direction> direction) {
        Utils.checkNotNull(direction, "direction");
        this.direction = direction;
        return this;
    }

    public OrganizationBrandingResponseDto withFontColor(String fontColor) {
        Utils.checkNotNull(fontColor, "fontColor");
        this.fontColor = fontColor;
        return this;
    }

    public OrganizationBrandingResponseDto withFontFamily(String fontFamily) {
        Utils.checkNotNull(fontFamily, "fontFamily");
        this.fontFamily = Optional.ofNullable(fontFamily);
        return this;
    }

    public OrganizationBrandingResponseDto withFontFamily(Optional<? extends String> fontFamily) {
        Utils.checkNotNull(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
        return this;
    }

    public OrganizationBrandingResponseDto withLogo(String logo) {
        Utils.checkNotNull(logo, "logo");
        this.logo = logo;
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
        OrganizationBrandingResponseDto other = (OrganizationBrandingResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.color, other.color) &&
            java.util.Objects.deepEquals(this.contentBackground, other.contentBackground) &&
            java.util.Objects.deepEquals(this.direction, other.direction) &&
            java.util.Objects.deepEquals(this.fontColor, other.fontColor) &&
            java.util.Objects.deepEquals(this.fontFamily, other.fontFamily) &&
            java.util.Objects.deepEquals(this.logo, other.logo);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            color,
            contentBackground,
            direction,
            fontColor,
            fontFamily,
            logo);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrganizationBrandingResponseDto.class,
                "color", color,
                "contentBackground", contentBackground,
                "direction", direction,
                "fontColor", fontColor,
                "fontFamily", fontFamily,
                "logo", logo);
    }
    
    public final static class Builder {
 
        private String color;
 
        private String contentBackground;
 
        private Optional<? extends Direction> direction = Optional.empty();
 
        private String fontColor;
 
        private Optional<? extends String> fontFamily = Optional.empty();
 
        private String logo;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder color(String color) {
            Utils.checkNotNull(color, "color");
            this.color = color;
            return this;
        }

        public Builder contentBackground(String contentBackground) {
            Utils.checkNotNull(contentBackground, "contentBackground");
            this.contentBackground = contentBackground;
            return this;
        }

        public Builder direction(Direction direction) {
            Utils.checkNotNull(direction, "direction");
            this.direction = Optional.ofNullable(direction);
            return this;
        }

        public Builder direction(Optional<? extends Direction> direction) {
            Utils.checkNotNull(direction, "direction");
            this.direction = direction;
            return this;
        }

        public Builder fontColor(String fontColor) {
            Utils.checkNotNull(fontColor, "fontColor");
            this.fontColor = fontColor;
            return this;
        }

        public Builder fontFamily(String fontFamily) {
            Utils.checkNotNull(fontFamily, "fontFamily");
            this.fontFamily = Optional.ofNullable(fontFamily);
            return this;
        }

        public Builder fontFamily(Optional<? extends String> fontFamily) {
            Utils.checkNotNull(fontFamily, "fontFamily");
            this.fontFamily = fontFamily;
            return this;
        }

        public Builder logo(String logo) {
            Utils.checkNotNull(logo, "logo");
            this.logo = logo;
            return this;
        }
        
        public OrganizationBrandingResponseDto build() {
            return new OrganizationBrandingResponseDto(
                color,
                contentBackground,
                direction,
                fontColor,
                fontFamily,
                logo);
        }
    }
}

