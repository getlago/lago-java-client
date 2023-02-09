package com.lago.api.client.commons.types;

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
    builder = FeeItem.Builder.class
)
public final class FeeItem {
  private final Optional<BillingTime> type;

  private final Optional<String> code;

  private final Optional<String> name;

  private int _cachedHashCode;

  FeeItem(Optional<BillingTime> type, Optional<String> code, Optional<String> name) {
    this.type = type;
    this.code = code;
    this.name = name;
  }

  @JsonProperty("type")
  public Optional<BillingTime> getType() {
    return type;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FeeItem && equalTo((FeeItem) other);
  }

  private boolean equalTo(FeeItem other) {
    return type.equals(other.type) && code.equals(other.code) && name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.code, this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FeeItem{" + "type: " + type + ", code: " + code + ", name: " + name + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<BillingTime> type = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Builder() {
    }

    public Builder from(FeeItem other) {
      type(other.getType());
      code(other.getCode());
      name(other.getName());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<BillingTime> type) {
      this.type = type;
      return this;
    }

    public Builder type(BillingTime type) {
      this.type = Optional.of(type);
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

    public FeeItem build() {
      return new FeeItem(type, code, name);
    }
  }
}
