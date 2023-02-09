package com.lago.api.client.add.ons.types;

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
    builder = AppliedAddOnInputObject.Builder.class
)
public final class AppliedAddOnInputObject {
  private final Optional<String> externalCustomerId;

  private final Optional<String> addOnCode;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private int _cachedHashCode;

  AppliedAddOnInputObject(Optional<String> externalCustomerId, Optional<String> addOnCode,
      Optional<Integer> amountCents, Optional<String> amountCurrency) {
    this.externalCustomerId = externalCustomerId;
    this.addOnCode = addOnCode;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("add_on_code")
  public Optional<String> getAddOnCode() {
    return addOnCode;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppliedAddOnInputObject && equalTo((AppliedAddOnInputObject) other);
  }

  private boolean equalTo(AppliedAddOnInputObject other) {
    return externalCustomerId.equals(other.externalCustomerId) && addOnCode.equals(other.addOnCode) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.externalCustomerId, this.addOnCode, this.amountCents, this.amountCurrency);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AppliedAddOnInputObject{" + "externalCustomerId: " + externalCustomerId + ", addOnCode: " + addOnCode + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<String> addOnCode = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Builder() {
    }

    public Builder from(AppliedAddOnInputObject other) {
      externalCustomerId(other.getExternalCustomerId());
      addOnCode(other.getAddOnCode());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      return this;
    }

    @JsonSetter(
        value = "external_customer_id",
        nulls = Nulls.SKIP
    )
    public Builder externalCustomerId(Optional<String> externalCustomerId) {
      this.externalCustomerId = externalCustomerId;
      return this;
    }

    public Builder externalCustomerId(String externalCustomerId) {
      this.externalCustomerId = Optional.of(externalCustomerId);
      return this;
    }

    @JsonSetter(
        value = "add_on_code",
        nulls = Nulls.SKIP
    )
    public Builder addOnCode(Optional<String> addOnCode) {
      this.addOnCode = addOnCode;
      return this;
    }

    public Builder addOnCode(String addOnCode) {
      this.addOnCode = Optional.of(addOnCode);
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

    public AppliedAddOnInputObject build() {
      return new AppliedAddOnInputObject(externalCustomerId, addOnCode, amountCents, amountCurrency);
    }
  }
}
