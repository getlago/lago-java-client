package com.lago.api.client.plans.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lago.api.client.customers.types.ChargeModelType;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ChargeObject.Builder.class
)
public final class ChargeObject {
  private final Optional<String> lagoId;

  private final Optional<String> lagoBillableMetricId;

  private final Optional<String> createdAt;

  private final Optional<ChargeModelType> chargeModel;

  private final Optional<Map<String, Object>> properties;

  private final Optional<List<GroupPropertiesObject>> groupProperties;

  private int _cachedHashCode;

  ChargeObject(Optional<String> lagoId, Optional<String> lagoBillableMetricId,
      Optional<String> createdAt, Optional<ChargeModelType> chargeModel,
      Optional<Map<String, Object>> properties,
      Optional<List<GroupPropertiesObject>> groupProperties) {
    this.lagoId = lagoId;
    this.lagoBillableMetricId = lagoBillableMetricId;
    this.createdAt = createdAt;
    this.chargeModel = chargeModel;
    this.properties = properties;
    this.groupProperties = groupProperties;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("lago_billable_metric_id")
  public Optional<String> getLagoBillableMetricId() {
    return lagoBillableMetricId;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("charge_model")
  public Optional<ChargeModelType> getChargeModel() {
    return chargeModel;
  }

  @JsonProperty("properties")
  public Optional<Map<String, Object>> getProperties() {
    return properties;
  }

  @JsonProperty("group_properties")
  public Optional<List<GroupPropertiesObject>> getGroupProperties() {
    return groupProperties;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ChargeObject && equalTo((ChargeObject) other);
  }

  private boolean equalTo(ChargeObject other) {
    return lagoId.equals(other.lagoId) && lagoBillableMetricId.equals(other.lagoBillableMetricId) && createdAt.equals(other.createdAt) && chargeModel.equals(other.chargeModel) && properties.equals(other.properties) && groupProperties.equals(other.groupProperties);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.lagoBillableMetricId, this.createdAt, this.chargeModel, this.properties, this.groupProperties);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ChargeObject{" + "lagoId: " + lagoId + ", lagoBillableMetricId: " + lagoBillableMetricId + ", createdAt: " + createdAt + ", chargeModel: " + chargeModel + ", properties: " + properties + ", groupProperties: " + groupProperties + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> lagoBillableMetricId = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<ChargeModelType> chargeModel = Optional.empty();

    private Optional<Map<String, Object>> properties = Optional.empty();

    private Optional<List<GroupPropertiesObject>> groupProperties = Optional.empty();

    private Builder() {
    }

    public Builder from(ChargeObject other) {
      lagoId(other.getLagoId());
      lagoBillableMetricId(other.getLagoBillableMetricId());
      createdAt(other.getCreatedAt());
      chargeModel(other.getChargeModel());
      properties(other.getProperties());
      groupProperties(other.getGroupProperties());
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
        value = "lago_billable_metric_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoBillableMetricId(Optional<String> lagoBillableMetricId) {
      this.lagoBillableMetricId = lagoBillableMetricId;
      return this;
    }

    public Builder lagoBillableMetricId(String lagoBillableMetricId) {
      this.lagoBillableMetricId = Optional.of(lagoBillableMetricId);
      return this;
    }

    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @JsonSetter(
        value = "charge_model",
        nulls = Nulls.SKIP
    )
    public Builder chargeModel(Optional<ChargeModelType> chargeModel) {
      this.chargeModel = chargeModel;
      return this;
    }

    public Builder chargeModel(ChargeModelType chargeModel) {
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
    public Builder groupProperties(Optional<List<GroupPropertiesObject>> groupProperties) {
      this.groupProperties = groupProperties;
      return this;
    }

    public Builder groupProperties(List<GroupPropertiesObject> groupProperties) {
      this.groupProperties = Optional.of(groupProperties);
      return this;
    }

    public ChargeObject build() {
      return new ChargeObject(lagoId, lagoBillableMetricId, createdAt, chargeModel, properties, groupProperties);
    }
  }
}
