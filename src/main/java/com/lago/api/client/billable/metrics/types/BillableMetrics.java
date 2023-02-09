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
    builder = BillableMetrics.Builder.class
)
public final class BillableMetrics {
  private final Optional<List<BillableMetricObject>> billableMetrics;

  private int _cachedHashCode;

  BillableMetrics(Optional<List<BillableMetricObject>> billableMetrics) {
    this.billableMetrics = billableMetrics;
  }

  @JsonProperty("billable_metrics")
  public Optional<List<BillableMetricObject>> getBillableMetrics() {
    return billableMetrics;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BillableMetrics && equalTo((BillableMetrics) other);
  }

  private boolean equalTo(BillableMetrics other) {
    return billableMetrics.equals(other.billableMetrics);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.billableMetrics);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BillableMetrics{" + "billableMetrics: " + billableMetrics + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<BillableMetricObject>> billableMetrics = Optional.empty();

    private Builder() {
    }

    public Builder from(BillableMetrics other) {
      billableMetrics(other.getBillableMetrics());
      return this;
    }

    @JsonSetter(
        value = "billable_metrics",
        nulls = Nulls.SKIP
    )
    public Builder billableMetrics(Optional<List<BillableMetricObject>> billableMetrics) {
      this.billableMetrics = billableMetrics;
      return this;
    }

    public Builder billableMetrics(List<BillableMetricObject> billableMetrics) {
      this.billableMetrics = Optional.of(billableMetrics);
      return this;
    }

    public BillableMetrics build() {
      return new BillableMetrics(billableMetrics);
    }
  }
}
