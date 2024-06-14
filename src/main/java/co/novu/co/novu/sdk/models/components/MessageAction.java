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

public class MessageAction {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("buttons")
    private Optional<? extends java.util.List<MessageButton>> buttons;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    private Optional<? extends MessageActionResult> result;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends MessageActionStatus> status;

    @JsonCreator
    public MessageAction(
            @JsonProperty("buttons") Optional<? extends java.util.List<MessageButton>> buttons,
            @JsonProperty("result") Optional<? extends MessageActionResult> result,
            @JsonProperty("status") Optional<? extends MessageActionStatus> status) {
        Utils.checkNotNull(buttons, "buttons");
        Utils.checkNotNull(result, "result");
        Utils.checkNotNull(status, "status");
        this.buttons = buttons;
        this.result = result;
        this.status = status;
    }
    
    public MessageAction() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<MessageButton>> buttons() {
        return (Optional<java.util.List<MessageButton>>) buttons;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MessageActionResult> result() {
        return (Optional<MessageActionResult>) result;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MessageActionStatus> status() {
        return (Optional<MessageActionStatus>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MessageAction withButtons(java.util.List<MessageButton> buttons) {
        Utils.checkNotNull(buttons, "buttons");
        this.buttons = Optional.ofNullable(buttons);
        return this;
    }

    public MessageAction withButtons(Optional<? extends java.util.List<MessageButton>> buttons) {
        Utils.checkNotNull(buttons, "buttons");
        this.buttons = buttons;
        return this;
    }

    public MessageAction withResult(MessageActionResult result) {
        Utils.checkNotNull(result, "result");
        this.result = Optional.ofNullable(result);
        return this;
    }

    public MessageAction withResult(Optional<? extends MessageActionResult> result) {
        Utils.checkNotNull(result, "result");
        this.result = result;
        return this;
    }

    public MessageAction withStatus(MessageActionStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public MessageAction withStatus(Optional<? extends MessageActionStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        MessageAction other = (MessageAction) o;
        return 
            java.util.Objects.deepEquals(this.buttons, other.buttons) &&
            java.util.Objects.deepEquals(this.result, other.result) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            buttons,
            result,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MessageAction.class,
                "buttons", buttons,
                "result", result,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<MessageButton>> buttons = Optional.empty();
 
        private Optional<? extends MessageActionResult> result = Optional.empty();
 
        private Optional<? extends MessageActionStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder buttons(java.util.List<MessageButton> buttons) {
            Utils.checkNotNull(buttons, "buttons");
            this.buttons = Optional.ofNullable(buttons);
            return this;
        }

        public Builder buttons(Optional<? extends java.util.List<MessageButton>> buttons) {
            Utils.checkNotNull(buttons, "buttons");
            this.buttons = buttons;
            return this;
        }

        public Builder result(MessageActionResult result) {
            Utils.checkNotNull(result, "result");
            this.result = Optional.ofNullable(result);
            return this;
        }

        public Builder result(Optional<? extends MessageActionResult> result) {
            Utils.checkNotNull(result, "result");
            this.result = result;
            return this;
        }

        public Builder status(MessageActionStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends MessageActionStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public MessageAction build() {
            return new MessageAction(
                buttons,
                result,
                status);
        }
    }
}

