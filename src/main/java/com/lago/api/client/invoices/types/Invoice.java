package com.lago.api.client.invoices.types;

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
    builder = Invoice.Builder.class
)
public final class Invoice {
  private final Optional<InvoiceObject> invoice;

  private int _cachedHashCode;

  Invoice(Optional<InvoiceObject> invoice) {
    this.invoice = invoice;
  }

  @JsonProperty("invoice")
  public Optional<InvoiceObject> getInvoice() {
    return invoice;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Invoice && equalTo((Invoice) other);
  }

  private boolean equalTo(Invoice other) {
    return invoice.equals(other.invoice);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.invoice);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Invoice{" + "invoice: " + invoice + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<InvoiceObject> invoice = Optional.empty();

    private Builder() {
    }

    public Builder from(Invoice other) {
      invoice(other.getInvoice());
      return this;
    }

    @JsonSetter(
        value = "invoice",
        nulls = Nulls.SKIP
    )
    public Builder invoice(Optional<InvoiceObject> invoice) {
      this.invoice = invoice;
      return this;
    }

    public Builder invoice(InvoiceObject invoice) {
      this.invoice = Optional.of(invoice);
      return this;
    }

    public Invoice build() {
      return new Invoice(invoice);
    }
  }
}
