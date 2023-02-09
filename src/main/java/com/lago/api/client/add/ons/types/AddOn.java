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
    builder = AddOn.Builder.class
)
public final class AddOn {
  private final Optional<AddOnObject> addOn;

  private int _cachedHashCode;

  AddOn(Optional<AddOnObject> addOn) {
    this.addOn = addOn;
  }

  @JsonProperty("add_on")
  public Optional<AddOnObject> getAddOn() {
    return addOn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AddOn && equalTo((AddOn) other);
  }

  private boolean equalTo(AddOn other) {
    return addOn.equals(other.addOn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.addOn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AddOn{" + "addOn: " + addOn + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AddOnObject> addOn = Optional.empty();

    private Builder() {
    }

    public Builder from(AddOn other) {
      addOn(other.getAddOn());
      return this;
    }

    @JsonSetter(
        value = "add_on",
        nulls = Nulls.SKIP
    )
    public Builder addOn(Optional<AddOnObject> addOn) {
      this.addOn = addOn;
      return this;
    }

    public Builder addOn(AddOnObject addOn) {
      this.addOn = Optional.of(addOn);
      return this;
    }

    public AddOn build() {
      return new AddOn(addOn);
    }
  }
}
