package com.lago.api.client.invoices.types;

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
    builder = CreditItem.Builder.class
)
public final class CreditItem {
  private final Optional<String> lagoId;

  private final Optional<String> type;

  private final Optional<String> code;

  private final Optional<String> name;

  private int _cachedHashCode;

  CreditItem(Optional<String> lagoId, Optional<String> type, Optional<String> code,
      Optional<String> name) {
    this.lagoId = lagoId;
    this.type = type;
    this.code = code;
    this.name = name;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
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
    return other instanceof CreditItem && equalTo((CreditItem) other);
  }

  private boolean equalTo(CreditItem other) {
    return lagoId.equals(other.lagoId) && type.equals(other.type) && code.equals(other.code) && name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.type, this.code, this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreditItem{" + "lagoId: " + lagoId + ", type: " + type + ", code: " + code + ", name: " + name + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditItem other) {
      lagoId(other.getLagoId());
      type(other.getType());
      code(other.getCode());
      name(other.getName());
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
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
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

    public CreditItem build() {
      return new CreditItem(lagoId, type, code, name);
    }
  }
}
