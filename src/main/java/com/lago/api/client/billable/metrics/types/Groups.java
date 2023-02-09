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
    builder = Groups.Builder.class
)
public final class Groups {
  private final Optional<List<GroupObject>> groups;

  private int _cachedHashCode;

  Groups(Optional<List<GroupObject>> groups) {
    this.groups = groups;
  }

  @JsonProperty("groups")
  public Optional<List<GroupObject>> getGroups() {
    return groups;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Groups && equalTo((Groups) other);
  }

  private boolean equalTo(Groups other) {
    return groups.equals(other.groups);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.groups);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Groups{" + "groups: " + groups + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<GroupObject>> groups = Optional.empty();

    private Builder() {
    }

    public Builder from(Groups other) {
      groups(other.getGroups());
      return this;
    }

    @JsonSetter(
        value = "groups",
        nulls = Nulls.SKIP
    )
    public Builder groups(Optional<List<GroupObject>> groups) {
      this.groups = groups;
      return this;
    }

    public Builder groups(List<GroupObject> groups) {
      this.groups = Optional.of(groups);
      return this;
    }

    public Groups build() {
      return new Groups(groups);
    }
  }
}
