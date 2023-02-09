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
    builder = Coupon.Builder.class
)
public final class Coupon {
  private final Optional<CouponObject> coupon;

  private int _cachedHashCode;

  Coupon(Optional<CouponObject> coupon) {
    this.coupon = coupon;
  }

  @JsonProperty("coupon")
  public Optional<CouponObject> getCoupon() {
    return coupon;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Coupon && equalTo((Coupon) other);
  }

  private boolean equalTo(Coupon other) {
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
    return "Coupon{" + "coupon: " + coupon + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<CouponObject> coupon = Optional.empty();

    private Builder() {
    }

    public Builder from(Coupon other) {
      coupon(other.getCoupon());
      return this;
    }

    @JsonSetter(
        value = "coupon",
        nulls = Nulls.SKIP
    )
    public Builder coupon(Optional<CouponObject> coupon) {
      this.coupon = coupon;
      return this;
    }

    public Builder coupon(CouponObject coupon) {
      this.coupon = Optional.of(coupon);
      return this;
    }

    public Coupon build() {
      return new Coupon(coupon);
    }
  }
}
