package com.lago.api.client.customers.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lago.api.client.commons.types.AggregationType;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ChargeBillableMetric.Builder.class
)
public final class ChargeBillableMetric {
  private final Optional<String> lagoId;

  private final Optional<String> name;

  private final Optional<String> code;

  private final Optional<AggregationType> aggregationType;

  private int _cachedHashCode;

  ChargeBillableMetric(Optional<String> lagoId, Optional<String> name, Optional<String> code,
      Optional<AggregationType> aggregationType) {
    this.lagoId = lagoId;
    this.name = name;
    this.code = code;
    this.aggregationType = aggregationType;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  @JsonProperty("aggregation_type")
  public Optional<AggregationType> getAggregationType() {
    return aggregationType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ChargeBillableMetric && equalTo((ChargeBillableMetric) other);
  }

  private boolean equalTo(ChargeBillableMetric other) {
    return lagoId.equals(other.lagoId) && name.equals(other.name) && code.equals(other.code) && aggregationType.equals(other.aggregationType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.name, this.code, this.aggregationType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ChargeBillableMetric{" + "lagoId: " + lagoId + ", name: " + name + ", code: " + code + ", aggregationType: " + aggregationType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<AggregationType> aggregationType = Optional.empty();

    private Builder() {
    }

    public Builder from(ChargeBillableMetric other) {
      lagoId(other.getLagoId());
      name(other.getName());
      code(other.getCode());
      aggregationType(other.getAggregationType());
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
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "aggregation_type",
        nulls = Nulls.SKIP
    )
    public Builder aggregationType(Optional<AggregationType> aggregationType) {
      this.aggregationType = aggregationType;
      return this;
    }

    public Builder aggregationType(AggregationType aggregationType) {
      this.aggregationType = Optional.of(aggregationType);
      return this;
    }

    public ChargeBillableMetric build() {
      return new ChargeBillableMetric(lagoId, name, code, aggregationType);
    }
  }
}
