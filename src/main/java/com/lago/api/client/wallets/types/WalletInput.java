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
    builder = WalletInput.Builder.class
)
public final class WalletInput {
  private final Optional<WalletInputObject> wallet;

  private int _cachedHashCode;

  WalletInput(Optional<WalletInputObject> wallet) {
    this.wallet = wallet;
  }

  @JsonProperty("wallet")
  public Optional<WalletInputObject> getWallet() {
    return wallet;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletInput && equalTo((WalletInput) other);
  }

  private boolean equalTo(WalletInput other) {
    return wallet.equals(other.wallet);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.wallet);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WalletInput{" + "wallet: " + wallet + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<WalletInputObject> wallet = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletInput other) {
      wallet(other.getWallet());
      return this;
    }

    @JsonSetter(
        value = "wallet",
        nulls = Nulls.SKIP
    )
    public Builder wallet(Optional<WalletInputObject> wallet) {
      this.wallet = wallet;
      return this;
    }

    public Builder wallet(WalletInputObject wallet) {
      this.wallet = Optional.of(wallet);
      return this;
    }

    public WalletInput build() {
      return new WalletInput(wallet);
    }
  }
}
