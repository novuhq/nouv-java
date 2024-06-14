/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import co.novu.co.novu.sdk.utils.TypedObject;
import co.novu.co.novu.sdk.utils.Utils.JsonShape;

/**
 * FeedIdentifier - Optional feed identifier or array of feed identifiers
 */

@JsonDeserialize(using = FeedIdentifier._Deserializer.class)
public class FeedIdentifier {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private FeedIdentifier(TypedObject value) {
        this.value = value;
    }

    public static FeedIdentifier of(String value) {
        Utils.checkNotNull(value, "value");
        return new FeedIdentifier(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static FeedIdentifier of(java.util.List<String> value) {
        Utils.checkNotNull(value, "value");
        return new FeedIdentifier(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.util.List<String>>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code String}</li>
     * <li>{@code java.util.List<String>}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedIdentifier other = (FeedIdentifier) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends co.novu.co.novu.sdk.utils.OneOfDeserializer<FeedIdentifier> {

        public _Deserializer() {
            super(FeedIdentifier.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<String>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<java.util.List<String>>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(FeedIdentifier.class,
                "value", value);
    }
 
}
