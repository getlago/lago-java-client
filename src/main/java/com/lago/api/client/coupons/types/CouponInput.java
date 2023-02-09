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
    builder = CouponInput.Builder.class
)
public final class CouponInput {
  private final Optional<CouponInputObject> coupon;

  private int _cachedHashCode;

  CouponInput(Optional<CouponInputObject> coupon) {
    this.coupon = coupon;
  }

  @JsonProperty("coupon")
  public Optional<CouponInputObject> getCoupon() {
    return coupon;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CouponInput && equalTo((CouponInput) other);
  }

  private boolean equalTo(CouponInput other) {
    return coupon.equals(other.coupon);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.coupon);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CouponInput{" + "coupon: " + coupon + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<CouponInputObject> coupon = Optional.empty();

    private Builder() {
    }

    public Builder from(CouponInput other) {
      coupon(other.getCoupon());
      return this;
    }

    @JsonSetter(
        value = "coupon",
        nulls = Nulls.SKIP
    )
    public Builder coupon(Optional<CouponInputObject> coupon) {
      this.coupon = coupon;
      return this;
    }

    public Builder coupon(CouponInputObject coupon) {
      this.coupon = Optional.of(coupon);
      return this;
    }

    public CouponInput build() {
      return new CouponInput(coupon);
    }
  }
}
