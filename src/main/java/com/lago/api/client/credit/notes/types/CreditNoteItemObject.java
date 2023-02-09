package com.lago.api.client.credit.notes.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lago.api.client.commons.types.FeeObject;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CreditNoteItemObject.Builder.class
)
public final class CreditNoteItemObject {
  private final Optional<String> lagoId;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<FeeObject> fee;

  private int _cachedHashCode;

  CreditNoteItemObject(Optional<String> lagoId, Optional<Integer> amountCents,
      Optional<String> amountCurrency, Optional<FeeObject> fee) {
    this.lagoId = lagoId;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.fee = fee;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("fee")
  public Optional<FeeObject> getFee() {
    return fee;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreditNoteItemObject && equalTo((CreditNoteItemObject) other);
  }

  private boolean equalTo(CreditNoteItemObject other) {
    return lagoId.equals(other.lagoId) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && fee.equals(other.fee);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.amountCents, this.amountCurrency, this.fee);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreditNoteItemObject{" + "lagoId: " + lagoId + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", fee: " + fee + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<FeeObject> fee = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditNoteItemObject other) {
      lagoId(other.getLagoId());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      fee(other.getFee());
      return this;
    }

    @JsonSetter(
        value = "lago_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoId(Optional<String> lagoId) {
      this.lagoId = lagoId;
      return this;
    }

    public Builder lagoId(String lagoId) {
      this.lagoId = Optional.of(lagoId);
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

    @JsonSetter(
        value = "amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder amountCurrency(Optional<String> amountCurrency) {
      this.amountCurrency = amountCurrency;
      return this;
    }

    public Builder amountCurrency(String amountCurrency) {
      this.amountCurrency = Optional.of(amountCurrency);
      return this;
    }

    @JsonSetter(
        value = "fee",
        nulls = Nulls.SKIP
    )
    public Builder fee(Optional<FeeObject> fee) {
      this.fee = fee;
      return this;
    }

    public Builder fee(FeeObject fee) {
      this.fee = Optional.of(fee);
      return this;
    }

    public CreditNoteItemObject build() {
      return new CreditNoteItemObject(lagoId, amountCents, amountCurrency, fee);
    }
  }
}
