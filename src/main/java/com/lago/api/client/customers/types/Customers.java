package com.lago.api.client.customers.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Customers.Builder.class
)
public final class Customers {
  private final Optional<List<CustomerObject>> customers;

  private int _cachedHashCode;

  Customers(Optional<List<CustomerObject>> customers) {
    this.customers = customers;
  }

  @JsonProperty("customers")
  public Optional<List<CustomerObject>> getCustomers() {
    return customers;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Customers && equalTo((Customers) other);
  }

  private boolean equalTo(Customers other) {
    return customers.equals(other.customers);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customers);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Customers{" + "customers: " + customers + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<CustomerObject>> customers = Optional.empty();

    private Builder() {
    }

    public Builder from(Customers other) {
      customers(other.getCustomers());
      return this;
    }

    @JsonSetter(
        value = "customers",
        nulls = Nulls.SKIP
    )
    public Builder customers(Optional<List<CustomerObject>> customers) {
      this.customers = customers;
      return this;
    }

    public Builder customers(List<CustomerObject> customers) {
      this.customers = Optional.of(customers);
      return this;
    }

    public Customers build() {
      return new Customers(customers);
    }
  }
}
