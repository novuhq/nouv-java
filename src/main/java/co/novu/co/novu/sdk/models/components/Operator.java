/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public enum Operator {
    LARGER("LARGER"),
    SMALLER("SMALLER"),
    LARGER_EQUAL("LARGER_EQUAL"),
    SMALLER_EQUAL("SMALLER_EQUAL"),
    EQUAL("EQUAL"),
    NOT_EQUAL("NOT_EQUAL"),
    ALL_IN("ALL_IN"),
    ANY_IN("ANY_IN"),
    NOT_IN("NOT_IN"),
    BETWEEN("BETWEEN"),
    NOT_BETWEEN("NOT_BETWEEN"),
    LIKE("LIKE"),
    NOT_LIKE("NOT_LIKE"),
    IN("IN");

    @JsonValue
    private final String value;

    private Operator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}