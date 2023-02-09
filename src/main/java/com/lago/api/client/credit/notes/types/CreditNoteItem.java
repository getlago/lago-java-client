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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CreditNoteItem.Builder.class
)
public final class CreditNoteItem {
  private final Optional<String> feeId;

  private final Optional<Integer> amountCents;

  private int _cachedHashCode;

  CreditNoteItem(Optional<String> feeId, Optional<Integer> amountCents) {
    this.feeId = feeId;
    this.amountCents = amountCents;
  }

  @JsonProperty("fee_id")
  public Optional<String> getFeeId() {
    return feeId;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreditNoteItem && equalTo((CreditNoteItem) other);
  }

  private boolean equalTo(CreditNoteItem other) {
    return feeId.equals(other.feeId) && amountCents.equals(other.amountCents);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.feeId, this.amountCents);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreditNoteItem{" + "feeId: " + feeId + ", amountCents: " + amountCents + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> feeId = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditNoteItem other) {
      feeId(other.getFeeId());
      amountCents(other.getAmountCents());
      return this;
    }

    @JsonSetter(
        value = "fee_id",
        nulls = Nulls.SKIP
    )
    public Builder feeId(Optional<String> feeId) {
      this.feeId = feeId;
      return this;
    }

    public Builder feeId(String feeId) {
      this.feeId = Optional.of(feeId);
      return this;
    }

    @JsonSetter(
        value = "amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder amountCents(Optional<Integer> amountCents) {
      this.amountCents = amountCents;
      return this;
    }

    public Builder amountCents(Integer amountCents) {
      this.amountCents = Optional.of(amountCents);
      return this;
    }

    public CreditNoteItem build() {
      return new CreditNoteItem(feeId, amountCents);
    }
  }
}
