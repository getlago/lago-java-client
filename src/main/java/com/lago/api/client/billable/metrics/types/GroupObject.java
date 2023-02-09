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
    builder = GroupObject.Builder.class
)
public final class GroupObject {
  private final Optional<String> key;

  private final Optional<String> value;

  private final Optional<String> lagoId;

  private int _cachedHashCode;

  GroupObject(Optional<String> key, Optional<String> value, Optional<String> lagoId) {
    this.key = key;
    this.value = value;
    this.lagoId = lagoId;
  }

  @JsonProperty("key")
  public Optional<String> getKey() {
    return key;
  }

  @JsonProperty("value")
  public Optional<String> getValue() {
    return value;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GroupObject && equalTo((GroupObject) other);
  }

  private boolean equalTo(GroupObject other) {
    return key.equals(other.key) && value.equals(other.value) && lagoId.equals(other.lagoId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.key, this.value, this.lagoId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GroupObject{" + "key: " + key + ", value: " + value + ", lagoId: " + lagoId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> key = Optional.empty();

    private Optional<String> value = Optional.empty();

    private Optional<String> lagoId = Optional.empty();

    private Builder() {
    }

    public Builder from(GroupObject other) {
      key(other.getKey());
      value(other.getValue());
      lagoId(other.getLagoId());
      return this;
    }

    @JsonSetter(
        value = "key",
        nulls = Nulls.SKIP
    )
    public Builder key(Optional<String> key) {
      this.key = key;
      return this;
    }

    public Builder key(String key) {
      this.key = Optional.of(key);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<String> value) {
      this.value = value;
      return this;
    }

    public Builder value(String value) {
      this.value = Optional.of(value);
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

    public GroupObject build() {
      return new GroupObject(key, value, lagoId);
    }
  }
}
