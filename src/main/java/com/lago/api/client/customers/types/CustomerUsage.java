package com.lago.api.client.customers.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CustomerUsage.Builder.class
)
public final class CustomerUsage {
  private final Optional<CustomerUsageObject> customerUsage;

  private int _cachedHashCode;

  CustomerUsage(Optional<CustomerUsageObject> customerUsage) {
    this.customerUsage = customerUsage;
  }

  @JsonProperty("customer_usage")
  public Optional<CustomerUsageObject> getCustomerUsage() {
    return customerUsage;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CustomerUsage && equalTo((CustomerUsage) other);
  }

  private boolean equalTo(CustomerUsage other) {
    return customerUsage.equals(other.customerUsage);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customerUsage);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CustomerUsage{" + "customerUsage: " + customerUsage + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<CustomerUsageObject> customerUsage = Optional.empty();

    private Builder() {
    }

    public Builder from(CustomerUsage other) {
      customerUsage(other.getCustomerUsage());
      return this;
    }

    @JsonSetter(
        value = "customer_usage",
        nulls = Nulls.SKIP
    )
    public Builder customerUsage(Optional<CustomerUsageObject> customerUsage) {
      this.customerUsage = customerUsage;
      return this;
    }

    public Builder customerUsage(CustomerUsageObject customerUsage) {
      this.customerUsage = Optional.of(customerUsage);
      return this;
    }

    public CustomerUsage build() {
      return new CustomerUsage(customerUsage);
    }
  }
}
