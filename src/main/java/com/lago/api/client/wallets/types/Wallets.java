package com.lago.api.client.wallets.types;

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
    builder = Wallets.Builder.class
)
public final class Wallets {
  private final Optional<List<WalletObject>> wallets;

  private int _cachedHashCode;

  Wallets(Optional<List<WalletObject>> wallets) {
    this.wallets = wallets;
  }

  @JsonProperty("wallets")
  public Optional<List<WalletObject>> getWallets() {
    return wallets;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Wallets && equalTo((Wallets) other);
  }

  private boolean equalTo(Wallets other) {
    return wallets.equals(other.wallets);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.wallets);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Wallets{" + "wallets: " + wallets + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<WalletObject>> wallets = Optional.empty();

    private Builder() {
    }

    public Builder from(Wallets other) {
      wallets(other.getWallets());
      return this;
    }

    @JsonSetter(
        value = "wallets",
        nulls = Nulls.SKIP
    )
    public Builder wallets(Optional<List<WalletObject>> wallets) {
      this.wallets = wallets;
      return this;
    }

    public Builder wallets(List<WalletObject> wallets) {
      this.wallets = Optional.of(wallets);
      return this;
    }

    public Wallets build() {
      return new Wallets(wallets);
    }
  }
}
