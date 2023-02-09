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
    builder = AddOnInput.Builder.class
)
public final class AddOnInput {
  private final Optional<AddOnInputObject> addOn;

  private int _cachedHashCode;

  AddOnInput(Optional<AddOnInputObject> addOn) {
    this.addOn = addOn;
  }

  @JsonProperty("add_on")
  public Optional<AddOnInputObject> getAddOn() {
    return addOn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AddOnInput && equalTo((AddOnInput) other);
  }

  private boolean equalTo(AddOnInput other) {
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
    return "AddOnInput{" + "addOn: " + addOn + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AddOnInputObject> addOn = Optional.empty();

    private Builder() {
    }

    public Builder from(AddOnInput other) {
      addOn(other.getAddOn());
      return this;
    }

    @JsonSetter(
        value = "add_on",
        nulls = Nulls.SKIP
    )
    public Builder addOn(Optional<AddOnInputObject> addOn) {
      this.addOn = addOn;
      return this;
    }

    public Builder addOn(AddOnInputObject addOn) {
      this.addOn = Optional.of(addOn);
      return this;
    }

    public AddOnInput build() {
      return new AddOnInput(addOn);
    }
  }
}
