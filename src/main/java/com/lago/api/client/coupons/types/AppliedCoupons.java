package com.lago.api.client.coupons.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AppliedCoupons.Builder.class
)
public final class AppliedCoupons {
  private final Optional<List<AppliedCouponObject>> appliedCoupons;

  private int _cachedHashCode;

  AppliedCoupons(Optional<List<AppliedCouponObject>> appliedCoupons) {
    this.appliedCoupons = appliedCoupons;
  }

  @JsonProperty("applied_coupons")
  public Optional<List<AppliedCouponObject>> getAppliedCoupons() {
    return appliedCoupons;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppliedCoupons && equalTo((AppliedCoupons) other);
  }

  private boolean equalTo(AppliedCoupons other) {
    return appliedCoupons.equals(other.appliedCoupons);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.appliedCoupons);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AppliedCoupons{" + "appliedCoupons: " + appliedCoupons + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<AppliedCouponObject>> appliedCoupons = Optional.empty();

    private Builder() {
    }

    public Builder from(AppliedCoupons other) {
      appliedCoupons(other.getAppliedCoupons());
      return this;
    }

    @JsonSetter(
        value = "applied_coupons",
        nulls = Nulls.SKIP
    )
    public Builder appliedCoupons(Optional<List<AppliedCouponObject>> appliedCoupons) {
      this.appliedCoupons = appliedCoupons;
      return this;
    }

    public Builder appliedCoupons(List<AppliedCouponObject> appliedCoupons) {
      this.appliedCoupons = Optional.of(appliedCoupons);
      return this;
    }

    public AppliedCoupons build() {
      return new AppliedCoupons(appliedCoupons);
    }
  }
}
