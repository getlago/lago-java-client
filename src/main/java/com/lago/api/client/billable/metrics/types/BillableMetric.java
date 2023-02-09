package com.lago.api.client.billable.metrics.types;

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
    builder = BillableMetric.Builder.class
)
public final class BillableMetric {
  private final Optional<BillableMetricObject> billableMetric;

  private int _cachedHashCode;

  BillableMetric(Optional<BillableMetricObject> billableMetric) {
    this.billableMetric = billableMetric;
  }

  @JsonProperty("billable_metric")
  public Optional<BillableMetricObject> getBillableMetric() {
    return billableMetric;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BillableMetric && equalTo((BillableMetric) other);
  }

  private boolean equalTo(BillableMetric other) {
    return billableMetric.equals(other.billableMetric);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.billableMetric);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BillableMetric{" + "billableMetric: " + billableMetric + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<BillableMetricObject> billableMetric = Optional.empty();

    private Builder() {
    }

    public Builder from(BillableMetric other) {
      billableMetric(other.getBillableMetric());
      return this;
    }

    @JsonSetter(
        value = "billable_metric",
        nulls = Nulls.SKIP
    )
    public Builder billableMetric(Optional<BillableMetricObject> billableMetric) {
      this.billableMetric = billableMetric;
      return this;
    }

    public Builder billableMetric(BillableMetricObject billableMetric) {
      this.billableMetric = Optional.of(billableMetric);
      return this;
    }

    public BillableMetric build() {
      return new BillableMetric(billableMetric);
    }
  }
}
