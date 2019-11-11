package spring.boot.pairing;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Objects;

@JsonDeserialize(builder = PaymentRequest.Builder.class)
public class PaymentRequest {
    private String value;

    public PaymentRequest(String value) {
        this.value = value;
    }

    private PaymentRequest(Builder builder) {
        value = builder.value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentRequest that = (PaymentRequest) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {
        private String value;

        public PaymentRequest.Builder value(String val) {
            value = val;
            return this;
        }

        public PaymentRequest build() {
            return new PaymentRequest(this);
        }
    }
}
