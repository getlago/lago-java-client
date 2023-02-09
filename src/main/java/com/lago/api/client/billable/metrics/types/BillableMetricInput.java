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
    builder = BillableMetricInput.Builder.class
)
public final class BillableMetricInput {
  private final Optional<BillableMetricInputObject> billableMetric;

  private int _cachedHashCode;

  BillableMetricInput(Optional<BillableMetricInputObject> billableMetric) {
    this.billableMetric = billableMetric;
  }

  @JsonProperty("billable_metric")
  public Optional<BillableMetricInputObject> getBillableMetric() {
    return billableMetric;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BillableMetricInput && equalTo((BillableMetricInput) other);
  }

  private boolean equalTo(BillableMetricInput other) {
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
    return "BillableMetricInput{" + "billableMetric: " + billableMetric + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<BillableMetricInputObject> billableMetric = Optional.empty();

    private Builder() {
    }

    public Builder from(BillableMetricInput other) {
      billableMetric(other.getBillableMetric());
      return this;
    }

    @JsonSetter(
        value = "billable_metric",
        nulls = Nulls.SKIP
    )
    public Builder billableMetric(Optional<BillableMetricInputObject> billableMetric) {
      this.billableMetric = billableMetric;
      return this;
    }

    public Builder billableMetric(BillableMetricInputObject billableMetric) {
      this.billableMetric = Optional.of(billableMetric);
      return this;
    }

    public BillableMetricInput build() {
      return new BillableMetricInput(billableMetric);
    }
  }
}
