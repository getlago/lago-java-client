package com.lago.api.client.coupons.types;

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
    builder = AppliedCouponInput.Builder.class
)
public final class AppliedCouponInput {
  private final Optional<AppliedCouponInputObject> appliedCoupon;

  private int _cachedHashCode;

  AppliedCouponInput(Optional<AppliedCouponInputObject> appliedCoupon) {
    this.appliedCoupon = appliedCoupon;
  }

  @JsonProperty("applied_coupon")
  public Optional<AppliedCouponInputObject> getAppliedCoupon() {
    return appliedCoupon;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppliedCouponInput && equalTo((AppliedCouponInput) other);
  }

  private boolean equalTo(AppliedCouponInput other) {
    return appliedCoupon.equals(other.appliedCoupon);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.appliedCoupon);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AppliedCouponInput{" + "appliedCoupon: " + appliedCoupon + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AppliedCouponInputObject> appliedCoupon = Optional.empty();

    private Builder() {
    }

    public Builder from(AppliedCouponInput other) {
      appliedCoupon(other.getAppliedCoupon());
      return this;
    }

    @JsonSetter(
        value = "applied_coupon",
        nulls = Nulls.SKIP
    )
    public Builder appliedCoupon(Optional<AppliedCouponInputObject> appliedCoupon) {
      this.appliedCoupon = appliedCoupon;
      return this;
    }

    public Builder appliedCoupon(AppliedCouponInputObject appliedCoupon) {
      this.appliedCoupon = Optional.of(appliedCoupon);
      return this;
    }

    public AppliedCouponInput build() {
      return new AppliedCouponInput(appliedCoupon);
    }
  }
}
