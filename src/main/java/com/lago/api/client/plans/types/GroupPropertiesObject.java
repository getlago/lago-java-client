package com.lago.api.client.plans.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = GroupPropertiesObject.Builder.class
)
public final class GroupPropertiesObject {
  private final Optional<String> groupId;

  private final Optional<Map<String, Object>> values;

  private int _cachedHashCode;

  GroupPropertiesObject(Optional<String> groupId, Optional<Map<String, Object>> values) {
    this.groupId = groupId;
    this.values = values;
  }

  @JsonProperty("group_id")
  public Optional<String> getGroupId() {
    return groupId;
  }

  @JsonProperty("values")
  public Optional<Map<String, Object>> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GroupPropertiesObject && equalTo((GroupPropertiesObject) other);
  }

  private boolean equalTo(GroupPropertiesObject other) {
    return groupId.equals(other.groupId) && values.equals(other.values);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.groupId, this.values);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GroupPropertiesObject{" + "groupId: " + groupId + ", values: " + values + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> groupId = Optional.empty();

    private Optional<Map<String, Object>> values = Optional.empty();

    private Builder() {
    }

    public Builder from(GroupPropertiesObject other) {
      groupId(other.getGroupId());
      values(other.getValues());
      return this;
    }

    @JsonSetter(
        value = "group_id",
        nulls = Nulls.SKIP
    )
    public Builder groupId(Optional<String> groupId) {
      this.groupId = groupId;
      return this;
    }

    public Builder groupId(String groupId) {
      this.groupId = Optional.of(groupId);
      return this;
    }

    @JsonSetter(
        value = "values",
        nulls = Nulls.SKIP
    )
    public Builder values(Optional<Map<String, Object>> values) {
      this.values = values;
      return this;
    }

    public Builder values(Map<String, Object> values) {
      this.values = Optional.of(values);
      return this;
    }

    public GroupPropertiesObject build() {
      return new GroupPropertiesObject(groupId, values);
    }
  }
}
