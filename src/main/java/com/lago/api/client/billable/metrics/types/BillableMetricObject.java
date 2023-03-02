package com.lago.api.client.billable.metrics.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lago.api.client.commons.types.AggregationType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = BillableMetricObject.Builder.class
)
public final class BillableMetricObject {
  private final Optional<String> lagoId;

  private final Optional<String> name;

  private final Optional<String> code;

  private final Optional<String> description;

  private final Optional<String> createdAt;

  private final Optional<String> fieldName;

  private final Optional<AggregationType> aggregationType;

  private final Optional<BillableMetricGroup> group;

  private final Optional<Integer> activeSubscriptionsCount;

  private final Optional<Integer> draftInvoicesCount;

  private int _cachedHashCode;

  BillableMetricObject(Optional<String> lagoId, Optional<String> name, Optional<String> code,
      Optional<String> description, Optional<String> createdAt, Optional<String> fieldName,
      Optional<AggregationType> aggregationType, Optional<BillableMetricGroup> group,
      Optional<Integer> activeSubscriptionsCount, Optional<Integer> draftInvoicesCount) {
    this.lagoId = lagoId;
    this.name = name;
    this.code = code;
    this.description = description;
    this.createdAt = createdAt;
    this.fieldName = fieldName;
    this.aggregationType = aggregationType;
    this.group = group;
    this.activeSubscriptionsCount = activeSubscriptionsCount;
    this.draftInvoicesCount = draftInvoicesCount;
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

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
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

  @JsonProperty("active_subscriptions_count")
  public Optional<Integer> getActiveSubscriptionsCount() {
    return activeSubscriptionsCount;
  }

  @JsonProperty("draft_invoices_count")
  public Optional<Integer> getDraftInvoicesCount() {
    return draftInvoicesCount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BillableMetricObject && equalTo((BillableMetricObject) other);
  }

  private boolean equalTo(BillableMetricObject other) {
    return lagoId.equals(other.lagoId) && name.equals(other.name) && code.equals(other.code) && description.equals(other.description) && createdAt.equals(other.createdAt) && fieldName.equals(other.fieldName) && aggregationType.equals(other.aggregationType) && group.equals(other.group) && activeSubscriptionsCount.equals(other.activeSubscriptionsCount) && draftInvoicesCount.equals(other.draftInvoicesCount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.name, this.code, this.description, this.createdAt, this.fieldName, this.aggregationType, this.group, this.activeSubscriptionsCount, this.draftInvoicesCount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BillableMetricObject{" + "lagoId: " + lagoId + ", name: " + name + ", code: " + code + ", description: " + description + ", createdAt: " + createdAt + ", fieldName: " + fieldName + ", aggregationType: " + aggregationType + ", group: " + group + ", activeSubscriptionsCount: " + activeSubscriptionsCount + ", draftInvoicesCount: " + draftInvoicesCount + "}";
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

    private Optional<String> description = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> fieldName = Optional.empty();

    private Optional<AggregationType> aggregationType = Optional.empty();

    private Optional<BillableMetricGroup> group = Optional.empty();

    private Optional<Integer> activeSubscriptionsCount = Optional.empty();

    private Optional<Integer> draftInvoicesCount = Optional.empty();

    private Builder() {
    }

    public Builder from(BillableMetricObject other) {
      lagoId(other.getLagoId());
      name(other.getName());
      code(other.getCode());
      description(other.getDescription());
      createdAt(other.getCreatedAt());
      fieldName(other.getFieldName());
      aggregationType(other.getAggregationType());
      group(other.getGroup());
      activeSubscriptionsCount(other.getActiveSubscriptionsCount());
      draftInvoicesCount(other.getDraftInvoicesCount());
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

    @JsonSetter(
        value = "active_subscriptions_count",
        nulls = Nulls.SKIP
    )
    public Builder activeSubscriptionsCount(Optional<Integer> activeSubscriptionsCount) {
      this.activeSubscriptionsCount = activeSubscriptionsCount;
      return this;
    }

    public Builder activeSubscriptionsCount(Integer activeSubscriptionsCount) {
      this.activeSubscriptionsCount = Optional.of(activeSubscriptionsCount);
      return this;
    }

    @JsonSetter(
        value = "draft_invoices_count",
        nulls = Nulls.SKIP
    )
    public Builder draftInvoicesCount(Optional<Integer> draftInvoicesCount) {
      this.draftInvoicesCount = draftInvoicesCount;
      return this;
    }

    public Builder draftInvoicesCount(Integer draftInvoicesCount) {
      this.draftInvoicesCount = Optional.of(draftInvoicesCount);
      return this;
    }

    public BillableMetricObject build() {
      return new BillableMetricObject(lagoId, name, code, description, createdAt, fieldName, aggregationType, group, activeSubscriptionsCount, draftInvoicesCount);
    }
  }
}
