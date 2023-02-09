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
    builder = AppliedAddOnObject.Builder.class
)
public final class AppliedAddOnObject {
  private final Optional<String> lagoId;

  private final Optional<String> lagoAddOnId;

  private final Optional<String> addOnCode;

  private final Optional<String> lagoCustomerId;

  private final Optional<String> externalCustomerId;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<String> createdAt;

  private int _cachedHashCode;

  AppliedAddOnObject(Optional<String> lagoId, Optional<String> lagoAddOnId,
      Optional<String> addOnCode, Optional<String> lagoCustomerId,
      Optional<String> externalCustomerId, Optional<Integer> amountCents,
      Optional<String> amountCurrency, Optional<String> createdAt) {
    this.lagoId = lagoId;
    this.lagoAddOnId = lagoAddOnId;
    this.addOnCode = addOnCode;
    this.lagoCustomerId = lagoCustomerId;
    this.externalCustomerId = externalCustomerId;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.createdAt = createdAt;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("lago_add_on_id")
  public Optional<String> getLagoAddOnId() {
    return lagoAddOnId;
  }

  @JsonProperty("add_on_code")
  public Optional<String> getAddOnCode() {
    return addOnCode;
  }

  @JsonProperty("lago_customer_id")
  public Optional<String> getLagoCustomerId() {
    return lagoCustomerId;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppliedAddOnObject && equalTo((AppliedAddOnObject) other);
  }

  private boolean equalTo(AppliedAddOnObject other) {
    return lagoId.equals(other.lagoId) && lagoAddOnId.equals(other.lagoAddOnId) && addOnCode.equals(other.addOnCode) && lagoCustomerId.equals(other.lagoCustomerId) && externalCustomerId.equals(other.externalCustomerId) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && createdAt.equals(other.createdAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.lagoAddOnId, this.addOnCode, this.lagoCustomerId, this.externalCustomerId, this.amountCents, this.amountCurrency, this.createdAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AppliedAddOnObject{" + "lagoId: " + lagoId + ", lagoAddOnId: " + lagoAddOnId + ", addOnCode: " + addOnCode + ", lagoCustomerId: " + lagoCustomerId + ", externalCustomerId: " + externalCustomerId + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", createdAt: " + createdAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> lagoAddOnId = Optional.empty();

    private Optional<String> addOnCode = Optional.empty();

    private Optional<String> lagoCustomerId = Optional.empty();

    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Builder() {
    }

    public Builder from(AppliedAddOnObject other) {
      lagoId(other.getLagoId());
      lagoAddOnId(other.getLagoAddOnId());
      addOnCode(other.getAddOnCode());
      lagoCustomerId(other.getLagoCustomerId());
      externalCustomerId(other.getExternalCustomerId());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      createdAt(other.getCreatedAt());
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
        value = "lago_add_on_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoAddOnId(Optional<String> lagoAddOnId) {
      this.lagoAddOnId = lagoAddOnId;
      return this;
    }

    public Builder lagoAddOnId(String lagoAddOnId) {
      this.lagoAddOnId = Optional.of(lagoAddOnId);
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
        value = "lago_customer_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoCustomerId(Optional<String> lagoCustomerId) {
      this.lagoCustomerId = lagoCustomerId;
      return this;
    }

    public Builder lagoCustomerId(String lagoCustomerId) {
      this.lagoCustomerId = Optional.of(lagoCustomerId);
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
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    public AppliedAddOnObject build() {
      return new AppliedAddOnObject(lagoId, lagoAddOnId, addOnCode, lagoCustomerId, externalCustomerId, amountCents, amountCurrency, createdAt);
    }
  }
}
