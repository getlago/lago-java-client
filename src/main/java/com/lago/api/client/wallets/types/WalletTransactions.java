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
    builder = WalletTransactions.Builder.class
)
public final class WalletTransactions {
  private final Optional<List<WalletTransactionObject>> walletTransactions;

  private int _cachedHashCode;

  WalletTransactions(Optional<List<WalletTransactionObject>> walletTransactions) {
    this.walletTransactions = walletTransactions;
  }

  @JsonProperty("wallet_transactions")
  public Optional<List<WalletTransactionObject>> getWalletTransactions() {
    return walletTransactions;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletTransactions && equalTo((WalletTransactions) other);
  }

  private boolean equalTo(WalletTransactions other) {
    return walletTransactions.equals(other.walletTransactions);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.walletTransactions);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WalletTransactions{" + "walletTransactions: " + walletTransactions + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<WalletTransactionObject>> walletTransactions = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletTransactions other) {
      walletTransactions(other.getWalletTransactions());
      return this;
    }

    @JsonSetter(
        value = "wallet_transactions",
        nulls = Nulls.SKIP
    )
    public Builder walletTransactions(Optional<List<WalletTransactionObject>> walletTransactions) {
      this.walletTransactions = walletTransactions;
      return this;
    }

    public Builder walletTransactions(List<WalletTransactionObject> walletTransactions) {
      this.walletTransactions = Optional.of(walletTransactions);
      return this;
    }

    public WalletTransactions build() {
      return new WalletTransactions(walletTransactions);
    }
  }
}
