package com.lago.api.client.plans.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Charges.Builder.class
)
public final class Charges {
  private final Optional<String> id;

  private final Optional<String> billableMetricId;

  private final Optional<ChargeModel> chargeModel;

  private final Optional<Map<String, Object>> properties;

  private final Optional<List<GroupProperties>> groupProperties;

  private int _cachedHashCode;

  Charges(Optional<String> id, Optional<String> billableMetricId, Optional<ChargeModel> chargeModel,
      Optional<Map<String, Object>> properties, Optional<List<GroupProperties>> groupProperties) {
    this.id = id;
    this.billableMetricId = billableMetricId;
    this.chargeModel = chargeModel;
    this.properties = properties;
    this.groupProperties = groupProperties;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("billable_metric_id")
  public Optional<String> getBillableMetricId() {
    return billableMetricId;
  }

  @JsonProperty("charge_model")
  public Optional<ChargeModel> getChargeModel() {
    return chargeModel;
  }

  @JsonProperty("properties")
  public Optional<Map<String, Object>> getProperties() {
    return properties;
  }

  @JsonProperty("group_properties")
  public Optional<List<GroupProperties>> getGroupProperties() {
    return groupProperties;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Charges && equalTo((Charges) other);
  }

  private boolean equalTo(Charges other) {
    return id.equals(other.id) && billableMetricId.equals(other.billableMetricId) && chargeModel.equals(other.chargeModel) && properties.equals(other.properties) && groupProperties.equals(other.groupProperties);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.billableMetricId, this.chargeModel, this.properties, this.groupProperties);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Charges{" + "id: " + id + ", billableMetricId: " + billableMetricId + ", chargeModel: " + chargeModel + ", properties: " + properties + ", groupProperties: " + groupProperties + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> billableMetricId = Optional.empty();

    private Optional<ChargeModel> chargeModel = Optional.empty();

    private Optional<Map<String, Object>> properties = Optional.empty();

    private Optional<List<GroupProperties>> groupProperties = Optional.empty();

    private Builder() {
    }

    public Builder from(Charges other) {
      id(other.getId());
      billableMetricId(other.getBillableMetricId());
      chargeModel(other.getChargeModel());
      properties(other.getProperties());
      groupProperties(other.getGroupProperties());
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "billable_metric_id",
        nulls = Nulls.SKIP
    )
    public Builder billableMetricId(Optional<String> billableMetricId) {
      this.billableMetricId = billableMetricId;
      return this;
    }

    public Builder billableMetricId(String billableMetricId) {
      this.billableMetricId = Optional.of(billableMetricId);
      return this;
    }

    @JsonSetter(
        value = "charge_model",
        nulls = Nulls.SKIP
    )
    public Builder chargeModel(Optional<ChargeModel> chargeModel) {
      this.chargeModel = chargeModel;
      return this;
    }

    public Builder chargeModel(ChargeModel chargeModel) {
      this.chargeModel = Optional.of(chargeModel);
      return this;
    }

    @JsonSetter(
        value = "properties",
        nulls = Nulls.SKIP
    )
    public Builder properties(Optional<Map<String, Object>> properties) {
      this.properties = properties;
      return this;
    }

    public Builder properties(Map<String, Object> properties) {
      this.properties = Optional.of(properties);
      return this;
    }

    @JsonSetter(
        value = "group_properties",
        nulls = Nulls.SKIP
    )
    public Builder groupProperties(Optional<List<GroupProperties>> groupProperties) {
      this.groupProperties = groupProperties;
      return this;
    }

    public Builder groupProperties(List<GroupProperties> groupProperties) {
      this.groupProperties = Optional.of(groupProperties);
      return this;
    }

    public Charges build() {
      return new Charges(id, billableMetricId, chargeModel, properties, groupProperties);
    }
  }
}
