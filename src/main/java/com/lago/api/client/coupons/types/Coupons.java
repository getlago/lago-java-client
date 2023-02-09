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
    builder = Coupons.Builder.class
)
public final class Coupons {
  private final Optional<List<CouponObject>> coupons;

  private int _cachedHashCode;

  Coupons(Optional<List<CouponObject>> coupons) {
    this.coupons = coupons;
  }

  @JsonProperty("coupons")
  public Optional<List<CouponObject>> getCoupons() {
    return coupons;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Coupons && equalTo((Coupons) other);
  }

  private boolean equalTo(Coupons other) {
    return coupons.equals(other.coupons);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.coupons);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Coupons{" + "coupons: " + coupons + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<CouponObject>> coupons = Optional.empty();

    private Builder() {
    }

    public Builder from(Coupons other) {
      coupons(other.getCoupons());
      return this;
    }

    @JsonSetter(
        value = "coupons",
        nulls = Nulls.SKIP
    )
    public Builder coupons(Optional<List<CouponObject>> coupons) {
      this.coupons = coupons;
      return this;
    }

    public Builder coupons(List<CouponObject> coupons) {
      this.coupons = Optional.of(coupons);
      return this;
    }

    public Coupons build() {
      return new Coupons(coupons);
    }
  }
}
