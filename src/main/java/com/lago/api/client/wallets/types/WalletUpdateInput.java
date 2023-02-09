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
    builder = WalletUpdateInput.Builder.class
)
public final class WalletUpdateInput {
  private final Optional<WalletUpdateInputObject> wallet;

  private int _cachedHashCode;

  WalletUpdateInput(Optional<WalletUpdateInputObject> wallet) {
    this.wallet = wallet;
  }

  @JsonProperty("wallet")
  public Optional<WalletUpdateInputObject> getWallet() {
    return wallet;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletUpdateInput && equalTo((WalletUpdateInput) other);
  }

  private boolean equalTo(WalletUpdateInput other) {
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
    return "WalletUpdateInput{" + "wallet: " + wallet + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<WalletUpdateInputObject> wallet = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletUpdateInput other) {
      wallet(other.getWallet());
      return this;
    }

    @JsonSetter(
        value = "wallet",
        nulls = Nulls.SKIP
    )
    public Builder wallet(Optional<WalletUpdateInputObject> wallet) {
      this.wallet = wallet;
      return this;
    }

    public Builder wallet(WalletUpdateInputObject wallet) {
      this.wallet = Optional.of(wallet);
      return this;
    }

    public WalletUpdateInput build() {
      return new WalletUpdateInput(wallet);
    }
  }
}
