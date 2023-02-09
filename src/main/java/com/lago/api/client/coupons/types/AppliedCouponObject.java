package com.lago.api.client.coupons.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AppliedCouponObject.Builder.class
)
public final class AppliedCouponObject {
  private final Optional<String> lagoId;

  private final Optional<String> lagoCouponId;

  private final Optional<String> couponCode;

  private final Optional<String> lagoCustomerId;

  private final Optional<String> externalCustomerId;

  private final Optional<CouponStatus> status;

  private final Optional<Integer> amountCents;

  private final Optional<Integer> amountCentsRemaining;

  private final Optional<String> amountCurrency;

  private final Optional<Double> percentageRate;

  private final Optional<FrequencyType> frequency;

  private final Optional<Integer> frequencyDuration;

  private final Optional<Integer> frequencyDurationRemaining;

  private final Optional<String> expirationAt;

  private final Optional<String> createdAt;

  private final Optional<String> terminatedAt;

  private int _cachedHashCode;

  AppliedCouponObject(Optional<String> lagoId, Optional<String> lagoCouponId,
      Optional<String> couponCode, Optional<String> lagoCustomerId,
      Optional<String> externalCustomerId, Optional<CouponStatus> status,
      Optional<Integer> amountCents, Optional<Integer> amountCentsRemaining,
      Optional<String> amountCurrency, Optional<Double> percentageRate,
      Optional<FrequencyType> frequency, Optional<Integer> frequencyDuration,
      Optional<Integer> frequencyDurationRemaining, Optional<String> expirationAt,
      Optional<String> createdAt, Optional<String> terminatedAt) {
    this.lagoId = lagoId;
    this.lagoCouponId = lagoCouponId;
    this.couponCode = couponCode;
    this.lagoCustomerId = lagoCustomerId;
    this.externalCustomerId = externalCustomerId;
    this.status = status;
    this.amountCents = amountCents;
    this.amountCentsRemaining = amountCentsRemaining;
    this.amountCurrency = amountCurrency;
    this.percentageRate = percentageRate;
    this.frequency = frequency;
    this.frequencyDuration = frequencyDuration;
    this.frequencyDurationRemaining = frequencyDurationRemaining;
    this.expirationAt = expirationAt;
    this.createdAt = createdAt;
    this.terminatedAt = terminatedAt;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("lago_coupon_id")
  public Optional<String> getLagoCouponId() {
    return lagoCouponId;
  }

  @JsonProperty("coupon_code")
  public Optional<String> getCouponCode() {
    return couponCode;
  }

  @JsonProperty("lago_customer_id")
  public Optional<String> getLagoCustomerId() {
    return lagoCustomerId;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("status")
  public Optional<CouponStatus> getStatus() {
    return status;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_cents_remaining")
  public Optional<Integer> getAmountCentsRemaining() {
    return amountCentsRemaining;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("percentage_rate")
  public Optional<Double> getPercentageRate() {
    return percentageRate;
  }

  @JsonProperty("frequency")
  public Optional<FrequencyType> getFrequency() {
    return frequency;
  }

  @JsonProperty("frequency_duration")
  public Optional<Integer> getFrequencyDuration() {
    return frequencyDuration;
  }

  @JsonProperty("frequency_duration_remaining")
  public Optional<Integer> getFrequencyDurationRemaining() {
    return frequencyDurationRemaining;
  }

  @JsonProperty("expiration_at")
  public Optional<String> getExpirationAt() {
    return expirationAt;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("terminated_at")
  public Optional<String> getTerminatedAt() {
    return terminatedAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppliedCouponObject && equalTo((AppliedCouponObject) other);
  }

  private boolean equalTo(AppliedCouponObject other) {
    return lagoId.equals(other.lagoId) && lagoCouponId.equals(other.lagoCouponId) && couponCode.equals(other.couponCode) && lagoCustomerId.equals(other.lagoCustomerId) && externalCustomerId.equals(other.externalCustomerId) && status.equals(other.status) && amountCents.equals(other.amountCents) && amountCentsRemaining.equals(other.amountCentsRemaining) && amountCurrency.equals(other.amountCurrency) && percentageRate.equals(other.percentageRate) && frequency.equals(other.frequency) && frequencyDuration.equals(other.frequencyDuration) && frequencyDurationRemaining.equals(other.frequencyDurationRemaining) && expirationAt.equals(other.expirationAt) && createdAt.equals(other.createdAt) && terminatedAt.equals(other.terminatedAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.lagoCouponId, this.couponCode, this.lagoCustomerId, this.externalCustomerId, this.status, this.amountCents, this.amountCentsRemaining, this.amountCurrency, this.percentageRate, this.frequency, this.frequencyDuration, this.frequencyDurationRemaining, this.expirationAt, this.createdAt, this.terminatedAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AppliedCouponObject{" + "lagoId: " + lagoId + ", lagoCouponId: " + lagoCouponId + ", couponCode: " + couponCode + ", lagoCustomerId: " + lagoCustomerId + ", externalCustomerId: " + externalCustomerId + ", status: " + status + ", amountCents: " + amountCents + ", amountCentsRemaining: " + amountCentsRemaining + ", amountCurrency: " + amountCurrency + ", percentageRate: " + percentageRate + ", frequency: " + frequency + ", frequencyDuration: " + frequencyDuration + ", frequencyDurationRemaining: " + frequencyDurationRemaining + ", expirationAt: " + expirationAt + ", createdAt: " + createdAt + ", terminatedAt: " + terminatedAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> lagoCouponId = Optional.empty();

    private Optional<String> couponCode = Optional.empty();

    private Optional<String> lagoCustomerId = Optional.empty();

    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<CouponStatus> status = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<Integer> amountCentsRemaining = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<Double> percentageRate = Optional.empty();

    private Optional<FrequencyType> frequency = Optional.empty();

    private Optional<Integer> frequencyDuration = Optional.empty();

    private Optional<Integer> frequencyDurationRemaining = Optional.empty();

    private Optional<String> expirationAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> terminatedAt = Optional.empty();

    private Builder() {
    }

    public Builder from(AppliedCouponObject other) {
      lagoId(other.getLagoId());
      lagoCouponId(other.getLagoCouponId());
      couponCode(other.getCouponCode());
      lagoCustomerId(other.getLagoCustomerId());
      externalCustomerId(other.getExternalCustomerId());
      status(other.getStatus());
      amountCents(other.getAmountCents());
      amountCentsRemaining(other.getAmountCentsRemaining());
      amountCurrency(other.getAmountCurrency());
      percentageRate(other.getPercentageRate());
      frequency(other.getFrequency());
      frequencyDuration(other.getFrequencyDuration());
      frequencyDurationRemaining(other.getFrequencyDurationRemaining());
      expirationAt(other.getExpirationAt());
      createdAt(other.getCreatedAt());
      terminatedAt(other.getTerminatedAt());
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
        value = "lago_coupon_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoCouponId(Optional<String> lagoCouponId) {
      this.lagoCouponId = lagoCouponId;
      return this;
    }

    public Builder lagoCouponId(String lagoCouponId) {
      this.lagoCouponId = Optional.of(lagoCouponId);
      return this;
    }

    @JsonSetter(
        value = "coupon_code",
        nulls = Nulls.SKIP
    )
    public Builder couponCode(Optional<String> couponCode) {
      this.couponCode = couponCode;
      return this;
    }

    public Builder couponCode(String couponCode) {
      this.couponCode = Optional.of(couponCode);
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
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<CouponStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(CouponStatus status) {
      this.status = Optional.of(status);
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
        value = "amount_cents_remaining",
        nulls = Nulls.SKIP
    )
    public Builder amountCentsRemaining(Optional<Integer> amountCentsRemaining) {
      this.amountCentsRemaining = amountCentsRemaining;
      return this;
    }

    public Builder amountCentsRemaining(Integer amountCentsRemaining) {
      this.amountCentsRemaining = Optional.of(amountCentsRemaining);
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
        value = "percentage_rate",
        nulls = Nulls.SKIP
    )
    public Builder percentageRate(Optional<Double> percentageRate) {
      this.percentageRate = percentageRate;
      return this;
    }

    public Builder percentageRate(Double percentageRate) {
      this.percentageRate = Optional.of(percentageRate);
      return this;
    }

    @JsonSetter(
        value = "frequency",
        nulls = Nulls.SKIP
    )
    public Builder frequency(Optional<FrequencyType> frequency) {
      this.frequency = frequency;
      return this;
    }

    public Builder frequency(FrequencyType frequency) {
      this.frequency = Optional.of(frequency);
      return this;
    }

    @JsonSetter(
        value = "frequency_duration",
        nulls = Nulls.SKIP
    )
    public Builder frequencyDuration(Optional<Integer> frequencyDuration) {
      this.frequencyDuration = frequencyDuration;
      return this;
    }

    public Builder frequencyDuration(Integer frequencyDuration) {
      this.frequencyDuration = Optional.of(frequencyDuration);
      return this;
    }

    @JsonSetter(
        value = "frequency_duration_remaining",
        nulls = Nulls.SKIP
    )
    public Builder frequencyDurationRemaining(Optional<Integer> frequencyDurationRemaining) {
      this.frequencyDurationRemaining = frequencyDurationRemaining;
      return this;
    }

    public Builder frequencyDurationRemaining(Integer frequencyDurationRemaining) {
      this.frequencyDurationRemaining = Optional.of(frequencyDurationRemaining);
      return this;
    }

    @JsonSetter(
        value = "expiration_at",
        nulls = Nulls.SKIP
    )
    public Builder expirationAt(Optional<String> expirationAt) {
      this.expirationAt = expirationAt;
      return this;
    }

    public Builder expirationAt(String expirationAt) {
      this.expirationAt = Optional.of(expirationAt);
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

    @JsonSetter(
        value = "terminated_at",
        nulls = Nulls.SKIP
    )
    public Builder terminatedAt(Optional<String> terminatedAt) {
      this.terminatedAt = terminatedAt;
      return this;
    }

    public Builder terminatedAt(String terminatedAt) {
      this.terminatedAt = Optional.of(terminatedAt);
      return this;
    }

    public AppliedCouponObject build() {
      return new AppliedCouponObject(lagoId, lagoCouponId, couponCode, lagoCustomerId, externalCustomerId, status, amountCents, amountCentsRemaining, amountCurrency, percentageRate, frequency, frequencyDuration, frequencyDurationRemaining, expirationAt, createdAt, terminatedAt);
    }
  }
}
