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

public class ActivityNotificationSubscriberResponseDto {

    @JsonProperty("_id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<? extends String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstName")
    private Optional<? extends String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    private Optional<? extends String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<? extends String> phone;

    @JsonCreator
    public ActivityNotificationSubscriberResponseDto(
            @JsonProperty("_id") String id,
            @JsonProperty("email") Optional<? extends String> email,
            @JsonProperty("firstName") Optional<? extends String> firstName,
            @JsonProperty("lastName") Optional<? extends String> lastName,
            @JsonProperty("phone") Optional<? extends String> phone) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(phone, "phone");
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    public ActivityNotificationSubscriberResponseDto(
            String id) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> email() {
        return (Optional<String>) email;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> firstName() {
        return (Optional<String>) firstName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> lastName() {
        return (Optional<String>) lastName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> phone() {
        return (Optional<String>) phone;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivityNotificationSubscriberResponseDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ActivityNotificationSubscriberResponseDto withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public ActivityNotificationSubscriberResponseDto withEmail(Optional<? extends String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public ActivityNotificationSubscriberResponseDto withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    public ActivityNotificationSubscriberResponseDto withFirstName(Optional<? extends String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public ActivityNotificationSubscriberResponseDto withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    public ActivityNotificationSubscriberResponseDto withLastName(Optional<? extends String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public ActivityNotificationSubscriberResponseDto withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    public ActivityNotificationSubscriberResponseDto withPhone(Optional<? extends String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
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
        ActivityNotificationSubscriberResponseDto other = (ActivityNotificationSubscriberResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.firstName, other.firstName) &&
            java.util.Objects.deepEquals(this.lastName, other.lastName) &&
            java.util.Objects.deepEquals(this.phone, other.phone);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            email,
            firstName,
            lastName,
            phone);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActivityNotificationSubscriberResponseDto.class,
                "id", id,
                "email", email,
                "firstName", firstName,
                "lastName", lastName,
                "phone", phone);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends String> email = Optional.empty();
 
        private Optional<? extends String> firstName = Optional.empty();
 
        private Optional<? extends String> lastName = Optional.empty();
 
        private Optional<? extends String> phone = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<? extends String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder firstName(Optional<? extends String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<? extends String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder phone(String phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        public Builder phone(Optional<? extends String> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }
        
        public ActivityNotificationSubscriberResponseDto build() {
            return new ActivityNotificationSubscriberResponseDto(
                id,
                email,
                firstName,
                lastName,
                phone);
        }
    }
}

