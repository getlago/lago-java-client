package com.lago.api.client.add.ons.types;

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
    builder = AppliedAddOn.Builder.class
)
public final class AppliedAddOn {
  private final Optional<AppliedAddOnObject> appliedAddOn;

  private int _cachedHashCode;

  AppliedAddOn(Optional<AppliedAddOnObject> appliedAddOn) {
    this.appliedAddOn = appliedAddOn;
  }

  @JsonProperty("applied_add_on")
  public Optional<AppliedAddOnObject> getAppliedAddOn() {
    return appliedAddOn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppliedAddOn && equalTo((AppliedAddOn) other);
  }

  private boolean equalTo(AppliedAddOn other) {
    return appliedAddOn.equals(other.appliedAddOn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.appliedAddOn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AppliedAddOn{" + "appliedAddOn: " + appliedAddOn + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AppliedAddOnObject> appliedAddOn = Optional.empty();

    private Builder() {
    }

    public Builder from(AppliedAddOn other) {
      appliedAddOn(other.getAppliedAddOn());
      return this;
    }

    @JsonSetter(
        value = "applied_add_on",
        nulls = Nulls.SKIP
    )
    public Builder appliedAddOn(Optional<AppliedAddOnObject> appliedAddOn) {
      this.appliedAddOn = appliedAddOn;
      return this;
    }

    public Builder appliedAddOn(AppliedAddOnObject appliedAddOn) {
      this.appliedAddOn = Optional.of(appliedAddOn);
      return this;
    }

    public AppliedAddOn build() {
      return new AppliedAddOn(appliedAddOn);
    }
  }
}
