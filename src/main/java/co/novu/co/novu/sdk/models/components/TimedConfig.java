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

public class TimedConfig {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("atTime")
    private Optional<? extends String> atTime;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("monthDays")
    private Optional<? extends java.util.List<String>> monthDays;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("monthlyType")
    private Optional<? extends MonthlyType> monthlyType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ordinal")
    private Optional<? extends Ordinal> ordinal;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ordinalValue")
    private Optional<? extends OrdinalValue> ordinalValue;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("weekDays")
    private Optional<? extends java.util.List<WeekDays>> weekDays;

    @JsonCreator
    public TimedConfig(
            @JsonProperty("atTime") Optional<? extends String> atTime,
            @JsonProperty("monthDays") Optional<? extends java.util.List<String>> monthDays,
            @JsonProperty("monthlyType") Optional<? extends MonthlyType> monthlyType,
            @JsonProperty("ordinal") Optional<? extends Ordinal> ordinal,
            @JsonProperty("ordinalValue") Optional<? extends OrdinalValue> ordinalValue,
            @JsonProperty("weekDays") Optional<? extends java.util.List<WeekDays>> weekDays) {
        Utils.checkNotNull(atTime, "atTime");
        Utils.checkNotNull(monthDays, "monthDays");
        Utils.checkNotNull(monthlyType, "monthlyType");
        Utils.checkNotNull(ordinal, "ordinal");
        Utils.checkNotNull(ordinalValue, "ordinalValue");
        Utils.checkNotNull(weekDays, "weekDays");
        this.atTime = atTime;
        this.monthDays = monthDays;
        this.monthlyType = monthlyType;
        this.ordinal = ordinal;
        this.ordinalValue = ordinalValue;
        this.weekDays = weekDays;
    }
    
    public TimedConfig() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> atTime() {
        return (Optional<String>) atTime;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> monthDays() {
        return (Optional<java.util.List<String>>) monthDays;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MonthlyType> monthlyType() {
        return (Optional<MonthlyType>) monthlyType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Ordinal> ordinal() {
        return (Optional<Ordinal>) ordinal;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrdinalValue> ordinalValue() {
        return (Optional<OrdinalValue>) ordinalValue;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<WeekDays>> weekDays() {
        return (Optional<java.util.List<WeekDays>>) weekDays;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TimedConfig withAtTime(String atTime) {
        Utils.checkNotNull(atTime, "atTime");
        this.atTime = Optional.ofNullable(atTime);
        return this;
    }

    public TimedConfig withAtTime(Optional<? extends String> atTime) {
        Utils.checkNotNull(atTime, "atTime");
        this.atTime = atTime;
        return this;
    }

    public TimedConfig withMonthDays(java.util.List<String> monthDays) {
        Utils.checkNotNull(monthDays, "monthDays");
        this.monthDays = Optional.ofNullable(monthDays);
        return this;
    }

    public TimedConfig withMonthDays(Optional<? extends java.util.List<String>> monthDays) {
        Utils.checkNotNull(monthDays, "monthDays");
        this.monthDays = monthDays;
        return this;
    }

    public TimedConfig withMonthlyType(MonthlyType monthlyType) {
        Utils.checkNotNull(monthlyType, "monthlyType");
        this.monthlyType = Optional.ofNullable(monthlyType);
        return this;
    }

    public TimedConfig withMonthlyType(Optional<? extends MonthlyType> monthlyType) {
        Utils.checkNotNull(monthlyType, "monthlyType");
        this.monthlyType = monthlyType;
        return this;
    }

    public TimedConfig withOrdinal(Ordinal ordinal) {
        Utils.checkNotNull(ordinal, "ordinal");
        this.ordinal = Optional.ofNullable(ordinal);
        return this;
    }

    public TimedConfig withOrdinal(Optional<? extends Ordinal> ordinal) {
        Utils.checkNotNull(ordinal, "ordinal");
        this.ordinal = ordinal;
        return this;
    }

    public TimedConfig withOrdinalValue(OrdinalValue ordinalValue) {
        Utils.checkNotNull(ordinalValue, "ordinalValue");
        this.ordinalValue = Optional.ofNullable(ordinalValue);
        return this;
    }

    public TimedConfig withOrdinalValue(Optional<? extends OrdinalValue> ordinalValue) {
        Utils.checkNotNull(ordinalValue, "ordinalValue");
        this.ordinalValue = ordinalValue;
        return this;
    }

    public TimedConfig withWeekDays(java.util.List<WeekDays> weekDays) {
        Utils.checkNotNull(weekDays, "weekDays");
        this.weekDays = Optional.ofNullable(weekDays);
        return this;
    }

    public TimedConfig withWeekDays(Optional<? extends java.util.List<WeekDays>> weekDays) {
        Utils.checkNotNull(weekDays, "weekDays");
        this.weekDays = weekDays;
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
        TimedConfig other = (TimedConfig) o;
        return 
            java.util.Objects.deepEquals(this.atTime, other.atTime) &&
            java.util.Objects.deepEquals(this.monthDays, other.monthDays) &&
            java.util.Objects.deepEquals(this.monthlyType, other.monthlyType) &&
            java.util.Objects.deepEquals(this.ordinal, other.ordinal) &&
            java.util.Objects.deepEquals(this.ordinalValue, other.ordinalValue) &&
            java.util.Objects.deepEquals(this.weekDays, other.weekDays);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            atTime,
            monthDays,
            monthlyType,
            ordinal,
            ordinalValue,
            weekDays);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TimedConfig.class,
                "atTime", atTime,
                "monthDays", monthDays,
                "monthlyType", monthlyType,
                "ordinal", ordinal,
                "ordinalValue", ordinalValue,
                "weekDays", weekDays);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> atTime = Optional.empty();
 
        private Optional<? extends java.util.List<String>> monthDays = Optional.empty();
 
        private Optional<? extends MonthlyType> monthlyType = Optional.empty();
 
        private Optional<? extends Ordinal> ordinal = Optional.empty();
 
        private Optional<? extends OrdinalValue> ordinalValue = Optional.empty();
 
        private Optional<? extends java.util.List<WeekDays>> weekDays = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder atTime(String atTime) {
            Utils.checkNotNull(atTime, "atTime");
            this.atTime = Optional.ofNullable(atTime);
            return this;
        }

        public Builder atTime(Optional<? extends String> atTime) {
            Utils.checkNotNull(atTime, "atTime");
            this.atTime = atTime;
            return this;
        }

        public Builder monthDays(java.util.List<String> monthDays) {
            Utils.checkNotNull(monthDays, "monthDays");
            this.monthDays = Optional.ofNullable(monthDays);
            return this;
        }

        public Builder monthDays(Optional<? extends java.util.List<String>> monthDays) {
            Utils.checkNotNull(monthDays, "monthDays");
            this.monthDays = monthDays;
            return this;
        }

        public Builder monthlyType(MonthlyType monthlyType) {
            Utils.checkNotNull(monthlyType, "monthlyType");
            this.monthlyType = Optional.ofNullable(monthlyType);
            return this;
        }

        public Builder monthlyType(Optional<? extends MonthlyType> monthlyType) {
            Utils.checkNotNull(monthlyType, "monthlyType");
            this.monthlyType = monthlyType;
            return this;
        }

        public Builder ordinal(Ordinal ordinal) {
            Utils.checkNotNull(ordinal, "ordinal");
            this.ordinal = Optional.ofNullable(ordinal);
            return this;
        }

        public Builder ordinal(Optional<? extends Ordinal> ordinal) {
            Utils.checkNotNull(ordinal, "ordinal");
            this.ordinal = ordinal;
            return this;
        }

        public Builder ordinalValue(OrdinalValue ordinalValue) {
            Utils.checkNotNull(ordinalValue, "ordinalValue");
            this.ordinalValue = Optional.ofNullable(ordinalValue);
            return this;
        }

        public Builder ordinalValue(Optional<? extends OrdinalValue> ordinalValue) {
            Utils.checkNotNull(ordinalValue, "ordinalValue");
            this.ordinalValue = ordinalValue;
            return this;
        }

        public Builder weekDays(java.util.List<WeekDays> weekDays) {
            Utils.checkNotNull(weekDays, "weekDays");
            this.weekDays = Optional.ofNullable(weekDays);
            return this;
        }

        public Builder weekDays(Optional<? extends java.util.List<WeekDays>> weekDays) {
            Utils.checkNotNull(weekDays, "weekDays");
            this.weekDays = weekDays;
            return this;
        }
        
        public TimedConfig build() {
            return new TimedConfig(
                atTime,
                monthDays,
                monthlyType,
                ordinal,
                ordinalValue,
                weekDays);
        }
    }
}

