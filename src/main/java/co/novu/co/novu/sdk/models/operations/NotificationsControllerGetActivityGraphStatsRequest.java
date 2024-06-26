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
import java.util.Optional;

public class NotificationsControllerGetActivityGraphStatsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=days")
    private Optional<? extends Double> days;

    @JsonCreator
    public NotificationsControllerGetActivityGraphStatsRequest(
            Optional<? extends Double> days) {
        Utils.checkNotNull(days, "days");
        this.days = days;
    }
    
    public NotificationsControllerGetActivityGraphStatsRequest() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> days() {
        return (Optional<Double>) days;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NotificationsControllerGetActivityGraphStatsRequest withDays(double days) {
        Utils.checkNotNull(days, "days");
        this.days = Optional.ofNullable(days);
        return this;
    }

    public NotificationsControllerGetActivityGraphStatsRequest withDays(Optional<? extends Double> days) {
        Utils.checkNotNull(days, "days");
        this.days = days;
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
        NotificationsControllerGetActivityGraphStatsRequest other = (NotificationsControllerGetActivityGraphStatsRequest) o;
        return 
            java.util.Objects.deepEquals(this.days, other.days);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            days);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NotificationsControllerGetActivityGraphStatsRequest.class,
                "days", days);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> days = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder days(double days) {
            Utils.checkNotNull(days, "days");
            this.days = Optional.ofNullable(days);
            return this;
        }

        public Builder days(Optional<? extends Double> days) {
            Utils.checkNotNull(days, "days");
            this.days = days;
            return this;
        }
        
        public NotificationsControllerGetActivityGraphStatsRequest build() {
            return new NotificationsControllerGetActivityGraphStatsRequest(
                days);
        }
    }
}

