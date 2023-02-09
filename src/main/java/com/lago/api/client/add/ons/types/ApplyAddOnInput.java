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
    builder = ApplyAddOnInput.Builder.class
)
public final class ApplyAddOnInput {
  private final Optional<AppliedAddOnInputObject> appliedAddOn;

  private int _cachedHashCode;

  ApplyAddOnInput(Optional<AppliedAddOnInputObject> appliedAddOn) {
    this.appliedAddOn = appliedAddOn;
  }

  @JsonProperty("applied_add_on")
  public Optional<AppliedAddOnInputObject> getAppliedAddOn() {
    return appliedAddOn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ApplyAddOnInput && equalTo((ApplyAddOnInput) other);
  }

  private boolean equalTo(ApplyAddOnInput other) {
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
    return "ApplyAddOnInput{" + "appliedAddOn: " + appliedAddOn + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AppliedAddOnInputObject> appliedAddOn = Optional.empty();

    private Builder() {
    }

    public Builder from(ApplyAddOnInput other) {
      appliedAddOn(other.getAppliedAddOn());
      return this;
    }

    @JsonSetter(
        value = "applied_add_on",
        nulls = Nulls.SKIP
    )
    public Builder appliedAddOn(Optional<AppliedAddOnInputObject> appliedAddOn) {
      this.appliedAddOn = appliedAddOn;
      return this;
    }

    public Builder appliedAddOn(AppliedAddOnInputObject appliedAddOn) {
      this.appliedAddOn = Optional.of(appliedAddOn);
      return this;
    }

    public ApplyAddOnInput build() {
      return new ApplyAddOnInput(appliedAddOn);
    }
  }
}
