package com.lago.api.client.credit.notes.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CreditNoteInputObject.Builder.class
)
public final class CreditNoteInputObject {
  private final Optional<String> invoiceId;

  private final Optional<CreditNoteReason> reason;

  private final Optional<String> description;

  private final Optional<Integer> creditAmountCents;

  private final Optional<Integer> refundAmountCents;

  private final Optional<List<CreditNoteItem>> items;

  private int _cachedHashCode;

  CreditNoteInputObject(Optional<String> invoiceId, Optional<CreditNoteReason> reason,
      Optional<String> description, Optional<Integer> creditAmountCents,
      Optional<Integer> refundAmountCents, Optional<List<CreditNoteItem>> items) {
    this.invoiceId = invoiceId;
    this.reason = reason;
    this.description = description;
    this.creditAmountCents = creditAmountCents;
    this.refundAmountCents = refundAmountCents;
    this.items = items;
  }

  @JsonProperty("invoice_id")
  public Optional<String> getInvoiceId() {
    return invoiceId;
  }

  @JsonProperty("reason")
  public Optional<CreditNoteReason> getReason() {
    return reason;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("credit_amount_cents")
  public Optional<Integer> getCreditAmountCents() {
    return creditAmountCents;
  }

  @JsonProperty("refund_amount_cents")
  public Optional<Integer> getRefundAmountCents() {
    return refundAmountCents;
  }

  @JsonProperty("items")
  public Optional<List<CreditNoteItem>> getItems() {
    return items;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreditNoteInputObject && equalTo((CreditNoteInputObject) other);
  }

  private boolean equalTo(CreditNoteInputObject other) {
    return invoiceId.equals(other.invoiceId) && reason.equals(other.reason) && description.equals(other.description) && creditAmountCents.equals(other.creditAmountCents) && refundAmountCents.equals(other.refundAmountCents) && items.equals(other.items);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.invoiceId, this.reason, this.description, this.creditAmountCents, this.refundAmountCents, this.items);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreditNoteInputObject{" + "invoiceId: " + invoiceId + ", reason: " + reason + ", description: " + description + ", creditAmountCents: " + creditAmountCents + ", refundAmountCents: " + refundAmountCents + ", items: " + items + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> invoiceId = Optional.empty();

    private Optional<CreditNoteReason> reason = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<Integer> creditAmountCents = Optional.empty();

    private Optional<Integer> refundAmountCents = Optional.empty();

    private Optional<List<CreditNoteItem>> items = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditNoteInputObject other) {
      invoiceId(other.getInvoiceId());
      reason(other.getReason());
      description(other.getDescription());
      creditAmountCents(other.getCreditAmountCents());
      refundAmountCents(other.getRefundAmountCents());
      items(other.getItems());
      return this;
    }

    @JsonSetter(
        value = "invoice_id",
        nulls = Nulls.SKIP
    )
    public Builder invoiceId(Optional<String> invoiceId) {
      this.invoiceId = invoiceId;
      return this;
    }

    public Builder invoiceId(String invoiceId) {
      this.invoiceId = Optional.of(invoiceId);
      return this;
    }

    @JsonSetter(
        value = "reason",
        nulls = Nulls.SKIP
    )
    public Builder reason(Optional<CreditNoteReason> reason) {
      this.reason = reason;
      return this;
    }

    public Builder reason(CreditNoteReason reason) {
      this.reason = Optional.of(reason);
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @JsonSetter(
        value = "credit_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder creditAmountCents(Optional<Integer> creditAmountCents) {
      this.creditAmountCents = creditAmountCents;
      return this;
    }

    public Builder creditAmountCents(Integer creditAmountCents) {
      this.creditAmountCents = Optional.of(creditAmountCents);
      return this;
    }

    @JsonSetter(
        value = "refund_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder refundAmountCents(Optional<Integer> refundAmountCents) {
      this.refundAmountCents = refundAmountCents;
      return this;
    }

    public Builder refundAmountCents(Integer refundAmountCents) {
      this.refundAmountCents = Optional.of(refundAmountCents);
      return this;
    }

    @JsonSetter(
        value = "items",
        nulls = Nulls.SKIP
    )
    public Builder items(Optional<List<CreditNoteItem>> items) {
      this.items = items;
      return this;
    }

    public Builder items(List<CreditNoteItem> items) {
      this.items = Optional.of(items);
      return this;
    }

    public CreditNoteInputObject build() {
      return new CreditNoteInputObject(invoiceId, reason, description, creditAmountCents, refundAmountCents, items);
    }
  }
}
