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
    builder = Customer.Builder.class
)
public final class Customer {
  private final Optional<CustomerObject> customer;

  private int _cachedHashCode;

  Customer(Optional<CustomerObject> customer) {
    this.customer = customer;
  }

  @JsonProperty("customer")
  public Optional<CustomerObject> getCustomer() {
    return customer;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Customer && equalTo((Customer) other);
  }

  private boolean equalTo(Customer other) {
    return customer.equals(other.customer);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customer);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Customer{" + "customer: " + customer + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<CustomerObject> customer = Optional.empty();

    private Builder() {
    }

    public Builder from(Customer other) {
      customer(other.getCustomer());
      return this;
    }

    @JsonSetter(
        value = "customer",
        nulls = Nulls.SKIP
    )
    public Builder customer(Optional<CustomerObject> customer) {
      this.customer = customer;
      return this;
    }

    public Builder customer(CustomerObject customer) {
      this.customer = Optional.of(customer);
      return this;
    }

    public Customer build() {
      return new Customer(customer);
    }
  }
}
