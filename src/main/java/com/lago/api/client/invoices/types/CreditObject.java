package com.lago.api.client.invoices.types;

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
    builder = CreditObject.Builder.class
)
public final class CreditObject {
  private final Optional<String> lagoId;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<CreditItem> item;

  private int _cachedHashCode;

  CreditObject(Optional<String> lagoId, Optional<Integer> amountCents,
      Optional<String> amountCurrency, Optional<CreditItem> item) {
    this.lagoId = lagoId;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.item = item;
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

  @JsonProperty("item")
  public Optional<CreditItem> getItem() {
    return item;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreditObject && equalTo((CreditObject) other);
  }

  private boolean equalTo(CreditObject other) {
    return lagoId.equals(other.lagoId) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && item.equals(other.item);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.amountCents, this.amountCurrency, this.item);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreditObject{" + "lagoId: " + lagoId + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", item: " + item + "}";
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

    private Optional<CreditItem> item = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditObject other) {
      lagoId(other.getLagoId());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      item(other.getItem());
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
        value = "item",
        nulls = Nulls.SKIP
    )
    public Builder item(Optional<CreditItem> item) {
      this.item = item;
      return this;
    }

    public Builder item(CreditItem item) {
      this.item = Optional.of(item);
      return this;
    }

    public CreditObject build() {
      return new CreditObject(lagoId, amountCents, amountCurrency, item);
    }
  }
}
