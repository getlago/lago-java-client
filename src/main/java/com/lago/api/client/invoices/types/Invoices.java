package com.lago.api.client.invoices.types;

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
    builder = Invoices.Builder.class
)
public final class Invoices {
  private final Optional<List<InvoiceObject>> invoices;

  private int _cachedHashCode;

  Invoices(Optional<List<InvoiceObject>> invoices) {
    this.invoices = invoices;
  }

  @JsonProperty("invoices")
  public Optional<List<InvoiceObject>> getInvoices() {
    return invoices;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Invoices && equalTo((Invoices) other);
  }

  private boolean equalTo(Invoices other) {
    return invoices.equals(other.invoices);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.invoices);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Invoices{" + "invoices: " + invoices + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<InvoiceObject>> invoices = Optional.empty();

    private Builder() {
    }

    public Builder from(Invoices other) {
      invoices(other.getInvoices());
      return this;
    }

    @JsonSetter(
        value = "invoices",
        nulls = Nulls.SKIP
    )
    public Builder invoices(Optional<List<InvoiceObject>> invoices) {
      this.invoices = invoices;
      return this;
    }

    public Builder invoices(List<InvoiceObject> invoices) {
      this.invoices = Optional.of(invoices);
      return this;
    }

    public Invoices build() {
      return new Invoices(invoices);
    }
  }
}
