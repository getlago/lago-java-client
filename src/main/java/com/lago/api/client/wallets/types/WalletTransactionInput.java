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
    builder = WalletTransactionInput.Builder.class
)
public final class WalletTransactionInput {
  private final Optional<WalletTransactionInputObject> walletTransaction;

  private int _cachedHashCode;

  WalletTransactionInput(Optional<WalletTransactionInputObject> walletTransaction) {
    this.walletTransaction = walletTransaction;
  }

  @JsonProperty("wallet_transaction")
  public Optional<WalletTransactionInputObject> getWalletTransaction() {
    return walletTransaction;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletTransactionInput && equalTo((WalletTransactionInput) other);
  }

  private boolean equalTo(WalletTransactionInput other) {
    return walletTransaction.equals(other.walletTransaction);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.walletTransaction);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WalletTransactionInput{" + "walletTransaction: " + walletTransaction + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<WalletTransactionInputObject> walletTransaction = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletTransactionInput other) {
      walletTransaction(other.getWalletTransaction());
      return this;
    }

    @JsonSetter(
        value = "wallet_transaction",
        nulls = Nulls.SKIP
    )
    public Builder walletTransaction(Optional<WalletTransactionInputObject> walletTransaction) {
      this.walletTransaction = walletTransaction;
      return this;
    }

    public Builder walletTransaction(WalletTransactionInputObject walletTransaction) {
      this.walletTransaction = Optional.of(walletTransaction);
      return this;
    }

    public WalletTransactionInput build() {
      return new WalletTransactionInput(walletTransaction);
    }
  }
}
