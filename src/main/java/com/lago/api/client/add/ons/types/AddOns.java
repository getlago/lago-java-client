package com.lago.api.client.add.ons.types;

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
    builder = AddOns.Builder.class
)
public final class AddOns {
  private final Optional<List<AddOnObject>> addOns;

  private int _cachedHashCode;

  AddOns(Optional<List<AddOnObject>> addOns) {
    this.addOns = addOns;
  }

  @JsonProperty("add_ons")
  public Optional<List<AddOnObject>> getAddOns() {
    return addOns;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AddOns && equalTo((AddOns) other);
  }

  private boolean equalTo(AddOns other) {
    return addOns.equals(other.addOns);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.addOns);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AddOns{" + "addOns: " + addOns + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<AddOnObject>> addOns = Optional.empty();

    private Builder() {
    }

    public Builder from(AddOns other) {
      addOns(other.getAddOns());
      return this;
    }

    @JsonSetter(
        value = "add_ons",
        nulls = Nulls.SKIP
    )
    public Builder addOns(Optional<List<AddOnObject>> addOns) {
      this.addOns = addOns;
      return this;
    }

    public Builder addOns(List<AddOnObject> addOns) {
      this.addOns = Optional.of(addOns);
      return this;
    }

    public AddOns build() {
      return new AddOns(addOns);
    }
  }
}
