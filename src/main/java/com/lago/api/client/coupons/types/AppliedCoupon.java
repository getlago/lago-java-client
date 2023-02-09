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
    builder = AppliedCoupon.Builder.class
)
public final class AppliedCoupon {
  private final Optional<AppliedCouponObject> appliedCoupon;

  private int _cachedHashCode;

  AppliedCoupon(Optional<AppliedCouponObject> appliedCoupon) {
    this.appliedCoupon = appliedCoupon;
  }

  @JsonProperty("applied_coupon")
  public Optional<AppliedCouponObject> getAppliedCoupon() {
    return appliedCoupon;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppliedCoupon && equalTo((AppliedCoupon) other);
  }

  private boolean equalTo(AppliedCoupon other) {
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
    return "AppliedCoupon{" + "appliedCoupon: " + appliedCoupon + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AppliedCouponObject> appliedCoupon = Optional.empty();

    private Builder() {
    }

    public Builder from(AppliedCoupon other) {
      appliedCoupon(other.getAppliedCoupon());
      return this;
    }

    @JsonSetter(
        value = "applied_coupon",
        nulls = Nulls.SKIP
    )
    public Builder appliedCoupon(Optional<AppliedCouponObject> appliedCoupon) {
      this.appliedCoupon = appliedCoupon;
      return this;
    }

    public Builder appliedCoupon(AppliedCouponObject appliedCoupon) {
      this.appliedCoupon = Optional.of(appliedCoupon);
      return this;
    }

    public AppliedCoupon build() {
      return new AppliedCoupon(appliedCoupon);
    }
  }
}
