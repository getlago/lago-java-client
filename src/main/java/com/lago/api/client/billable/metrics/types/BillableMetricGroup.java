package com.lago.api.client.billable.metrics.types;

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
    builder = BillableMetricGroup.Builder.class
)
public final class BillableMetricGroup {
  private final Optional<String> key;

  private final Optional<List<Object>> values;

  private int _cachedHashCode;

  BillableMetricGroup(Optional<String> key, Optional<List<Object>> values) {
    this.key = key;
    this.values = values;
  }

  @JsonProperty("key")
  public Optional<String> getKey() {
    return key;
  }

  @JsonProperty("values")
  public Optional<List<Object>> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BillableMetricGroup && equalTo((BillableMetricGroup) other);
  }

  private boolean equalTo(BillableMetricGroup other) {
    return key.equals(other.key) && values.equals(other.values);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.key, this.values);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BillableMetricGroup{" + "key: " + key + ", values: " + values + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> key = Optional.empty();

    private Optional<List<Object>> values = Optional.empty();

    private Builder() {
    }

    public Builder from(BillableMetricGroup other) {
      key(other.getKey());
      values(other.getValues());
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
        value = "values",
        nulls = Nulls.SKIP
    )
    public Builder values(Optional<List<Object>> values) {
      this.values = values;
      return this;
    }

    public Builder values(List<Object> values) {
      this.values = Optional.of(values);
      return this;
    }

    public BillableMetricGroup build() {
      return new BillableMetricGroup(key, values);
    }
  }
}
