package com.lago.api.client.wallets.types;

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
    builder = WalletUpdateInputObject.Builder.class
)
public final class WalletUpdateInputObject {
  private final Optional<String> name;

  private final Optional<String> expirationAt;

  private int _cachedHashCode;

  WalletUpdateInputObject(Optional<String> name, Optional<String> expirationAt) {
    this.name = name;
    this.expirationAt = expirationAt;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("expiration_at")
  public Optional<String> getExpirationAt() {
    return expirationAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletUpdateInputObject && equalTo((WalletUpdateInputObject) other);
  }

  private boolean equalTo(WalletUpdateInputObject other) {
    return name.equals(other.name) && expirationAt.equals(other.expirationAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.expirationAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WalletUpdateInputObject{" + "name: " + name + ", expirationAt: " + expirationAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<String> expirationAt = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletUpdateInputObject other) {
      name(other.getName());
      expirationAt(other.getExpirationAt());
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
        value = "expiration_at",
        nulls = Nulls.SKIP
    )
    public Builder expirationAt(Optional<String> expirationAt) {
      this.expirationAt = expirationAt;
      return this;
    }

    public Builder expirationAt(String expirationAt) {
      this.expirationAt = Optional.of(expirationAt);
      return this;
    }

    public WalletUpdateInputObject build() {
      return new WalletUpdateInputObject(name, expirationAt);
    }
  }
}
