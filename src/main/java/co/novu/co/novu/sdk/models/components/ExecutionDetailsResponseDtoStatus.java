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

public enum ExecutionDetailsResponseDtoStatus {
    SUCCESS("Success"),
    WARNING("Warning"),
    FAILED("Failed"),
    PENDING("Pending"),
    QUEUED("Queued"),
    READ_CONFIRMATION("ReadConfirmation");

    @JsonValue
    private final String value;

    private ExecutionDetailsResponseDtoStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
