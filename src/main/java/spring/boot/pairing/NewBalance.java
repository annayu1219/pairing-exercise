package spring.boot.pairing;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Objects;

@JsonDeserialize(builder = NewBalance.Builder.class)
public class NewBalance {

    private String value;

    public NewBalance(String value) {
        this.value = value;
    }

    public static Builder builder() {
        return new Builder();
    }

    private NewBalance(Builder builder) {
        value = builder.value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewBalance that = (NewBalance) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "NewBalance{" +
                "value='" + value + '\'' +
                '}';
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {
        private String value;

        public Builder value(String val) {
            value = val;
            return this;
        }

        public NewBalance build() {
            return new NewBalance(this);
        }
    }
}
