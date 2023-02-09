package com.lago.api.client.customers.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Group.Builder.class
)
public final class Group {
  private final Optional<String> lagoId;

  private final Optional<String> key;

  private final Optional<String> value;

  private final Optional<Double> units;

  private final Optional<Integer> amountCents;

  private int _cachedHashCode;

  Group(Optional<String> lagoId, Optional<String> key, Optional<String> value,
      Optional<Double> units, Optional<Integer> amountCents) {
    this.lagoId = lagoId;
    this.key = key;
    this.value = value;
    this.units = units;
    this.amountCents = amountCents;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("key")
  public Optional<String> getKey() {
    return key;
  }

  @JsonProperty("value")
  public Optional<String> getValue() {
    return value;
  }

  @JsonProperty("units")
  public Optional<Double> getUnits() {
    return units;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Group && equalTo((Group) other);
  }

  private boolean equalTo(Group other) {
    return lagoId.equals(other.lagoId) && key.equals(other.key) && value.equals(other.value) && units.equals(other.units) && amountCents.equals(other.amountCents);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.key, this.value, this.units, this.amountCents);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Group{" + "lagoId: " + lagoId + ", key: " + key + ", value: " + value + ", units: " + units + ", amountCents: " + amountCents + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> key = Optional.empty();

    private Optional<String> value = Optional.empty();

    private Optional<Double> units = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Builder() {
    }

    public Builder from(Group other) {
      lagoId(other.getLagoId());
      key(other.getKey());
      value(other.getValue());
      units(other.getUnits());
      amountCents(other.getAmountCents());
      return this;
    }

    @JsonSetter(
        value = "lago_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoId(Optional<String> lagoId) {
      this.lagoId = lagoId;
      return this;
    }

    public Builder lagoId(String lagoId) {
      this.lagoId = Optional.of(lagoId);
      return this;
    }

    @JsonSetter(
        value = "key",
        nulls = Nulls.SKIP
    )
    public Builder key(Optional<String> key) {
      this.key = key;
      return this;
    }

    public Builder key(String key) {
      this.key = Optional.of(key);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<String> value) {
      this.value = value;
      return this;
    }

    public Builder value(String value) {
      this.value = Optional.of(value);
      return this;
    }

    @JsonSetter(
        value = "units",
        nulls = Nulls.SKIP
    )
    public Builder units(Optional<Double> units) {
      this.units = units;
      return this;
    }

    public Builder units(Double units) {
      this.units = Optional.of(units);
      return this;
    }

    @JsonSetter(
        value = "amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder amountCents(Optional<Integer> amountCents) {
      this.amountCents = amountCents;
      return this;
    }

    public Builder amountCents(Integer amountCents) {
      this.amountCents = Optional.of(amountCents);
      return this;
    }

    public Group build() {
      return new Group(lagoId, key, value, units, amountCents);
    }
  }
}
