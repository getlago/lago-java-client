package com.lago.api.client.wallets.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = WalletTransactionObject.Builder.class
)
public final class WalletTransactionObject {
  private final Optional<String> lagoId;

  private final Optional<String> lagoWalletId;

  private final Optional<TransactionStatus> status;

  private final Optional<TransactionType> transactionType;

  private final Optional<Double> amount;

  private final Optional<Double> creditAmount;

  private final Optional<String> settledAt;

  private final Optional<String> createdAt;

  private int _cachedHashCode;

  WalletTransactionObject(Optional<String> lagoId, Optional<String> lagoWalletId,
      Optional<TransactionStatus> status, Optional<TransactionType> transactionType,
      Optional<Double> amount, Optional<Double> creditAmount, Optional<String> settledAt,
      Optional<String> createdAt) {
    this.lagoId = lagoId;
    this.lagoWalletId = lagoWalletId;
    this.status = status;
    this.transactionType = transactionType;
    this.amount = amount;
    this.creditAmount = creditAmount;
    this.settledAt = settledAt;
    this.createdAt = createdAt;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("lago_wallet_id")
  public Optional<String> getLagoWalletId() {
    return lagoWalletId;
  }

  @JsonProperty("status")
  public Optional<TransactionStatus> getStatus() {
    return status;
  }

  @JsonProperty("transaction_type")
  public Optional<TransactionType> getTransactionType() {
    return transactionType;
  }

  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  @JsonProperty("credit_amount")
  public Optional<Double> getCreditAmount() {
    return creditAmount;
  }

  @JsonProperty("settled_at")
  public Optional<String> getSettledAt() {
    return settledAt;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletTransactionObject && equalTo((WalletTransactionObject) other);
  }

  private boolean equalTo(WalletTransactionObject other) {
    return lagoId.equals(other.lagoId) && lagoWalletId.equals(other.lagoWalletId) && status.equals(other.status) && transactionType.equals(other.transactionType) && amount.equals(other.amount) && creditAmount.equals(other.creditAmount) && settledAt.equals(other.settledAt) && createdAt.equals(other.createdAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.lagoWalletId, this.status, this.transactionType, this.amount, this.creditAmount, this.settledAt, this.createdAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WalletTransactionObject{" + "lagoId: " + lagoId + ", lagoWalletId: " + lagoWalletId + ", status: " + status + ", transactionType: " + transactionType + ", amount: " + amount + ", creditAmount: " + creditAmount + ", settledAt: " + settledAt + ", createdAt: " + createdAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> lagoWalletId = Optional.empty();

    private Optional<TransactionStatus> status = Optional.empty();

    private Optional<TransactionType> transactionType = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Optional<Double> creditAmount = Optional.empty();

    private Optional<String> settledAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletTransactionObject other) {
      lagoId(other.getLagoId());
      lagoWalletId(other.getLagoWalletId());
      status(other.getStatus());
      transactionType(other.getTransactionType());
      amount(other.getAmount());
      creditAmount(other.getCreditAmount());
      settledAt(other.getSettledAt());
      createdAt(other.getCreatedAt());
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
        value = "lago_wallet_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoWalletId(Optional<String> lagoWalletId) {
      this.lagoWalletId = lagoWalletId;
      return this;
    }

    public Builder lagoWalletId(String lagoWalletId) {
      this.lagoWalletId = Optional.of(lagoWalletId);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<TransactionStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(TransactionStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "transaction_type",
        nulls = Nulls.SKIP
    )
    public Builder transactionType(Optional<TransactionType> transactionType) {
      this.transactionType = transactionType;
      return this;
    }

    public Builder transactionType(TransactionType transactionType) {
      this.transactionType = Optional.of(transactionType);
      return this;
    }

    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public Builder amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @JsonSetter(
        value = "credit_amount",
        nulls = Nulls.SKIP
    )
    public Builder creditAmount(Optional<Double> creditAmount) {
      this.creditAmount = creditAmount;
      return this;
    }

    public Builder creditAmount(Double creditAmount) {
      this.creditAmount = Optional.of(creditAmount);
      return this;
    }

    @JsonSetter(
        value = "settled_at",
        nulls = Nulls.SKIP
    )
    public Builder settledAt(Optional<String> settledAt) {
      this.settledAt = settledAt;
      return this;
    }

    public Builder settledAt(String settledAt) {
      this.settledAt = Optional.of(settledAt);
      return this;
    }

    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    public WalletTransactionObject build() {
      return new WalletTransactionObject(lagoId, lagoWalletId, status, transactionType, amount, creditAmount, settledAt, createdAt);
    }
  }
}
