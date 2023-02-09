package com.lago.api.client.billable.metrics.types;

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
    builder = BillableMetricInputObject.Builder.class
)
public final class BillableMetricInputObject {
  private final Optional<String> name;

  private final Optional<String> code;

  private final Optional<String> description;

  private final Optional<String> fieldName;

  private final Optional<AggregationType> aggregationType;

  private final Optional<BillableMetricGroup> group;

  private int _cachedHashCode;

  BillableMetricInputObject(Optional<String> name, Optional<String> code,
      Optional<String> description, Optional<String> fieldName,
      Optional<AggregationType> aggregationType, Optional<BillableMetricGroup> group) {
    this.name = name;
    this.code = code;
    this.description = description;
    this.fieldName = fieldName;
    this.aggregationType = aggregationType;
    this.group = group;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("field_name")
  public Optional<String> getFieldName() {
    return fieldName;
  }

  @JsonProperty("aggregation_type")
  public Optional<AggregationType> getAggregationType() {
    return aggregationType;
  }

  @JsonProperty("group")
  public Optional<BillableMetricGroup> getGroup() {
    return group;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BillableMetricInputObject && equalTo((BillableMetricInputObject) other);
  }

  private boolean equalTo(BillableMetricInputObject other) {
    return name.equals(other.name) && code.equals(other.code) && description.equals(other.description) && fieldName.equals(other.fieldName) && aggregationType.equals(other.aggregationType) && group.equals(other.group);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.code, this.description, this.fieldName, this.aggregationType, this.group);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BillableMetricInputObject{" + "name: " + name + ", code: " + code + ", description: " + description + ", fieldName: " + fieldName + ", aggregationType: " + aggregationType + ", group: " + group + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> fieldName = Optional.empty();

    private Optional<AggregationType> aggregationType = Optional.empty();

    private Optional<BillableMetricGroup> group = Optional.empty();

    private Builder() {
    }

    public Builder from(BillableMetricInputObject other) {
      name(other.getName());
      code(other.getCode());
      description(other.getDescription());
      fieldName(other.getFieldName());
      aggregationType(other.getAggregationType());
      group(other.getGroup());
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
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @JsonSetter(
        value = "field_name",
        nulls = Nulls.SKIP
    )
    public Builder fieldName(Optional<String> fieldName) {
      this.fieldName = fieldName;
      return this;
    }

    public Builder fieldName(String fieldName) {
      this.fieldName = Optional.of(fieldName);
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

    @JsonSetter(
        value = "group",
        nulls = Nulls.SKIP
    )
    public Builder group(Optional<BillableMetricGroup> group) {
      this.group = group;
      return this;
    }

    public Builder group(BillableMetricGroup group) {
      this.group = Optional.of(group);
      return this;
    }

    public BillableMetricInputObject build() {
      return new BillableMetricInputObject(name, code, description, fieldName, aggregationType, group);
    }
  }
}
