package com.lago.api.client.coupons.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CouponInputObject.Builder.class
)
public final class CouponInputObject {
  private final Optional<String> name;

  private final Optional<String> code;

  private final Optional<CouponType> couponType;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<Boolean> reusable;

  private final Optional<Double> percentageRate;

  private final Optional<FrequencyType> frequency;

  private final Optional<Integer> frequencyDuration;

  private final Optional<String> expirationAt;

  private final Optional<ExpirationType> expiration;

  private int _cachedHashCode;

  CouponInputObject(Optional<String> name, Optional<String> code, Optional<CouponType> couponType,
      Optional<Integer> amountCents, Optional<String> amountCurrency, Optional<Boolean> reusable,
      Optional<Double> percentageRate, Optional<FrequencyType> frequency,
      Optional<Integer> frequencyDuration, Optional<String> expirationAt,
      Optional<ExpirationType> expiration) {
    this.name = name;
    this.code = code;
    this.couponType = couponType;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.reusable = reusable;
    this.percentageRate = percentageRate;
    this.frequency = frequency;
    this.frequencyDuration = frequencyDuration;
    this.expirationAt = expirationAt;
    this.expiration = expiration;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  @JsonProperty("coupon_type")
  public Optional<CouponType> getCouponType() {
    return couponType;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("reusable")
  public Optional<Boolean> getReusable() {
    return reusable;
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

  @JsonProperty("expiration_at")
  public Optional<String> getExpirationAt() {
    return expirationAt;
  }

  @JsonProperty("expiration")
  public Optional<ExpirationType> getExpiration() {
    return expiration;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CouponInputObject && equalTo((CouponInputObject) other);
  }

  private boolean equalTo(CouponInputObject other) {
    return name.equals(other.name) && code.equals(other.code) && couponType.equals(other.couponType) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && reusable.equals(other.reusable) && percentageRate.equals(other.percentageRate) && frequency.equals(other.frequency) && frequencyDuration.equals(other.frequencyDuration) && expirationAt.equals(other.expirationAt) && expiration.equals(other.expiration);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.code, this.couponType, this.amountCents, this.amountCurrency, this.reusable, this.percentageRate, this.frequency, this.frequencyDuration, this.expirationAt, this.expiration);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CouponInputObject{" + "name: " + name + ", code: " + code + ", couponType: " + couponType + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", reusable: " + reusable + ", percentageRate: " + percentageRate + ", frequency: " + frequency + ", frequencyDuration: " + frequencyDuration + ", expirationAt: " + expirationAt + ", expiration: " + expiration + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<CouponType> couponType = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<Boolean> reusable = Optional.empty();

    private Optional<Double> percentageRate = Optional.empty();

    private Optional<FrequencyType> frequency = Optional.empty();

    private Optional<Integer> frequencyDuration = Optional.empty();

    private Optional<String> expirationAt = Optional.empty();

    private Optional<ExpirationType> expiration = Optional.empty();

    private Builder() {
    }

    public Builder from(CouponInputObject other) {
      name(other.getName());
      code(other.getCode());
      couponType(other.getCouponType());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      reusable(other.getReusable());
      percentageRate(other.getPercentageRate());
      frequency(other.getFrequency());
      frequencyDuration(other.getFrequencyDuration());
      expirationAt(other.getExpirationAt());
      expiration(other.getExpiration());
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "coupon_type",
        nulls = Nulls.SKIP
    )
    public Builder couponType(Optional<CouponType> couponType) {
      this.couponType = couponType;
      return this;
    }

    public Builder couponType(CouponType couponType) {
      this.couponType = Optional.of(couponType);
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
        value = "reusable",
        nulls = Nulls.SKIP
    )
    public Builder reusable(Optional<Boolean> reusable) {
      this.reusable = reusable;
      return this;
    }

    public Builder reusable(Boolean reusable) {
      this.reusable = Optional.of(reusable);
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
        value = "expiration",
        nulls = Nulls.SKIP
    )
    public Builder expiration(Optional<ExpirationType> expiration) {
      this.expiration = expiration;
      return this;
    }

    public Builder expiration(ExpirationType expiration) {
      this.expiration = Optional.of(expiration);
      return this;
    }

    public CouponInputObject build() {
      return new CouponInputObject(name, code, couponType, amountCents, amountCurrency, reusable, percentageRate, frequency, frequencyDuration, expirationAt, expiration);
    }
  }
}
