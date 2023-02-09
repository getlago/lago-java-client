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
    builder = AppliedCouponInputObject.Builder.class
)
public final class AppliedCouponInputObject {
  private final Optional<String> externalCustomerId;

  private final Optional<String> couponCode;

  private final Optional<FrequencyType> frequency;

  private final Optional<Integer> frequencyDuration;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<Double> percentageRate;

  private int _cachedHashCode;

  AppliedCouponInputObject(Optional<String> externalCustomerId, Optional<String> couponCode,
      Optional<FrequencyType> frequency, Optional<Integer> frequencyDuration,
      Optional<Integer> amountCents, Optional<String> amountCurrency,
      Optional<Double> percentageRate) {
    this.externalCustomerId = externalCustomerId;
    this.couponCode = couponCode;
    this.frequency = frequency;
    this.frequencyDuration = frequencyDuration;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.percentageRate = percentageRate;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("coupon_code")
  public Optional<String> getCouponCode() {
    return couponCode;
  }

  @JsonProperty("frequency")
  public Optional<FrequencyType> getFrequency() {
    return frequency;
  }

  @JsonProperty("frequency_duration")
  public Optional<Integer> getFrequencyDuration() {
    return frequencyDuration;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("percentage_rate")
  public Optional<Double> getPercentageRate() {
    return percentageRate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppliedCouponInputObject && equalTo((AppliedCouponInputObject) other);
  }

  private boolean equalTo(AppliedCouponInputObject other) {
    return externalCustomerId.equals(other.externalCustomerId) && couponCode.equals(other.couponCode) && frequency.equals(other.frequency) && frequencyDuration.equals(other.frequencyDuration) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && percentageRate.equals(other.percentageRate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.externalCustomerId, this.couponCode, this.frequency, this.frequencyDuration, this.amountCents, this.amountCurrency, this.percentageRate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AppliedCouponInputObject{" + "externalCustomerId: " + externalCustomerId + ", couponCode: " + couponCode + ", frequency: " + frequency + ", frequencyDuration: " + frequencyDuration + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", percentageRate: " + percentageRate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<String> couponCode = Optional.empty();

    private Optional<FrequencyType> frequency = Optional.empty();

    private Optional<Integer> frequencyDuration = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<Double> percentageRate = Optional.empty();

    private Builder() {
    }

    public Builder from(AppliedCouponInputObject other) {
      externalCustomerId(other.getExternalCustomerId());
      couponCode(other.getCouponCode());
      frequency(other.getFrequency());
      frequencyDuration(other.getFrequencyDuration());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      percentageRate(other.getPercentageRate());
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

    public AppliedCouponInputObject build() {
      return new AppliedCouponInputObject(externalCustomerId, couponCode, frequency, frequencyDuration, amountCents, amountCurrency, percentageRate);
    }
  }
}
