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
    builder = WalletObject.Builder.class
)
public final class WalletObject {
  private final Optional<String> lagoId;

  private final Optional<String> lagoCustomerId;

  private final Optional<String> externalCustomerId;

  private final Optional<WalletStatus> status;

  private final Optional<String> currency;

  private final Optional<String> name;

  private final Optional<Double> rateAmount;

  private final Optional<Double> creditsBalance;

  private final Optional<Double> balance;

  private final Optional<Double> consumedCredits;

  private final Optional<String> createdAt;

  private final Optional<String> expirationAt;

  private final Optional<String> lastBalanceSyncAt;

  private final Optional<String> lastConsumedCreditAt;

  private final Optional<String> terminatedAt;

  private int _cachedHashCode;

  WalletObject(Optional<String> lagoId, Optional<String> lagoCustomerId,
      Optional<String> externalCustomerId, Optional<WalletStatus> status, Optional<String> currency,
      Optional<String> name, Optional<Double> rateAmount, Optional<Double> creditsBalance,
      Optional<Double> balance, Optional<Double> consumedCredits, Optional<String> createdAt,
      Optional<String> expirationAt, Optional<String> lastBalanceSyncAt,
      Optional<String> lastConsumedCreditAt, Optional<String> terminatedAt) {
    this.lagoId = lagoId;
    this.lagoCustomerId = lagoCustomerId;
    this.externalCustomerId = externalCustomerId;
    this.status = status;
    this.currency = currency;
    this.name = name;
    this.rateAmount = rateAmount;
    this.creditsBalance = creditsBalance;
    this.balance = balance;
    this.consumedCredits = consumedCredits;
    this.createdAt = createdAt;
    this.expirationAt = expirationAt;
    this.lastBalanceSyncAt = lastBalanceSyncAt;
    this.lastConsumedCreditAt = lastConsumedCreditAt;
    this.terminatedAt = terminatedAt;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("lago_customer_id")
  public Optional<String> getLagoCustomerId() {
    return lagoCustomerId;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("status")
  public Optional<WalletStatus> getStatus() {
    return status;
  }

  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("rate_amount")
  public Optional<Double> getRateAmount() {
    return rateAmount;
  }

  @JsonProperty("credits_balance")
  public Optional<Double> getCreditsBalance() {
    return creditsBalance;
  }

  @JsonProperty("balance")
  public Optional<Double> getBalance() {
    return balance;
  }

  @JsonProperty("consumed_credits")
  public Optional<Double> getConsumedCredits() {
    return consumedCredits;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("expiration_at")
  public Optional<String> getExpirationAt() {
    return expirationAt;
  }

  @JsonProperty("last_balance_sync_at")
  public Optional<String> getLastBalanceSyncAt() {
    return lastBalanceSyncAt;
  }

  @JsonProperty("last_consumed_credit_at")
  public Optional<String> getLastConsumedCreditAt() {
    return lastConsumedCreditAt;
  }

  @JsonProperty("terminated_at")
  public Optional<String> getTerminatedAt() {
    return terminatedAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletObject && equalTo((WalletObject) other);
  }

  private boolean equalTo(WalletObject other) {
    return lagoId.equals(other.lagoId) && lagoCustomerId.equals(other.lagoCustomerId) && externalCustomerId.equals(other.externalCustomerId) && status.equals(other.status) && currency.equals(other.currency) && name.equals(other.name) && rateAmount.equals(other.rateAmount) && creditsBalance.equals(other.creditsBalance) && balance.equals(other.balance) && consumedCredits.equals(other.consumedCredits) && createdAt.equals(other.createdAt) && expirationAt.equals(other.expirationAt) && lastBalanceSyncAt.equals(other.lastBalanceSyncAt) && lastConsumedCreditAt.equals(other.lastConsumedCreditAt) && terminatedAt.equals(other.terminatedAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.lagoCustomerId, this.externalCustomerId, this.status, this.currency, this.name, this.rateAmount, this.creditsBalance, this.balance, this.consumedCredits, this.createdAt, this.expirationAt, this.lastBalanceSyncAt, this.lastConsumedCreditAt, this.terminatedAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WalletObject{" + "lagoId: " + lagoId + ", lagoCustomerId: " + lagoCustomerId + ", externalCustomerId: " + externalCustomerId + ", status: " + status + ", currency: " + currency + ", name: " + name + ", rateAmount: " + rateAmount + ", creditsBalance: " + creditsBalance + ", balance: " + balance + ", consumedCredits: " + consumedCredits + ", createdAt: " + createdAt + ", expirationAt: " + expirationAt + ", lastBalanceSyncAt: " + lastBalanceSyncAt + ", lastConsumedCreditAt: " + lastConsumedCreditAt + ", terminatedAt: " + terminatedAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> lagoCustomerId = Optional.empty();

    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<WalletStatus> status = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<Double> rateAmount = Optional.empty();

    private Optional<Double> creditsBalance = Optional.empty();

    private Optional<Double> balance = Optional.empty();

    private Optional<Double> consumedCredits = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> expirationAt = Optional.empty();

    private Optional<String> lastBalanceSyncAt = Optional.empty();

    private Optional<String> lastConsumedCreditAt = Optional.empty();

    private Optional<String> terminatedAt = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletObject other) {
      lagoId(other.getLagoId());
      lagoCustomerId(other.getLagoCustomerId());
      externalCustomerId(other.getExternalCustomerId());
      status(other.getStatus());
      currency(other.getCurrency());
      name(other.getName());
      rateAmount(other.getRateAmount());
      creditsBalance(other.getCreditsBalance());
      balance(other.getBalance());
      consumedCredits(other.getConsumedCredits());
      createdAt(other.getCreatedAt());
      expirationAt(other.getExpirationAt());
      lastBalanceSyncAt(other.getLastBalanceSyncAt());
      lastConsumedCreditAt(other.getLastConsumedCreditAt());
      terminatedAt(other.getTerminatedAt());
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
        value = "lago_customer_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoCustomerId(Optional<String> lagoCustomerId) {
      this.lagoCustomerId = lagoCustomerId;
      return this;
    }

    public Builder lagoCustomerId(String lagoCustomerId) {
      this.lagoCustomerId = Optional.of(lagoCustomerId);
      return this;
    }

    @JsonSetter(
        value = "external_customer_id",
        nulls = Nulls.SKIP
    )
    public Builder externalCustomerId(Optional<String> externalCustomerId) {
      this.externalCustomerId = externalCustomerId;
      return this;
    }

    public Builder externalCustomerId(String externalCustomerId) {
      this.externalCustomerId = Optional.of(externalCustomerId);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<WalletStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(WalletStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
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
        value = "rate_amount",
        nulls = Nulls.SKIP
    )
    public Builder rateAmount(Optional<Double> rateAmount) {
      this.rateAmount = rateAmount;
      return this;
    }

    public Builder rateAmount(Double rateAmount) {
      this.rateAmount = Optional.of(rateAmount);
      return this;
    }

    @JsonSetter(
        value = "credits_balance",
        nulls = Nulls.SKIP
    )
    public Builder creditsBalance(Optional<Double> creditsBalance) {
      this.creditsBalance = creditsBalance;
      return this;
    }

    public Builder creditsBalance(Double creditsBalance) {
      this.creditsBalance = Optional.of(creditsBalance);
      return this;
    }

    @JsonSetter(
        value = "balance",
        nulls = Nulls.SKIP
    )
    public Builder balance(Optional<Double> balance) {
      this.balance = balance;
      return this;
    }

    public Builder balance(Double balance) {
      this.balance = Optional.of(balance);
      return this;
    }

    @JsonSetter(
        value = "consumed_credits",
        nulls = Nulls.SKIP
    )
    public Builder consumedCredits(Optional<Double> consumedCredits) {
      this.consumedCredits = consumedCredits;
      return this;
    }

    public Builder consumedCredits(Double consumedCredits) {
      this.consumedCredits = Optional.of(consumedCredits);
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

    @JsonSetter(
        value = "last_balance_sync_at",
        nulls = Nulls.SKIP
    )
    public Builder lastBalanceSyncAt(Optional<String> lastBalanceSyncAt) {
      this.lastBalanceSyncAt = lastBalanceSyncAt;
      return this;
    }

    public Builder lastBalanceSyncAt(String lastBalanceSyncAt) {
      this.lastBalanceSyncAt = Optional.of(lastBalanceSyncAt);
      return this;
    }

    @JsonSetter(
        value = "last_consumed_credit_at",
        nulls = Nulls.SKIP
    )
    public Builder lastConsumedCreditAt(Optional<String> lastConsumedCreditAt) {
      this.lastConsumedCreditAt = lastConsumedCreditAt;
      return this;
    }

    public Builder lastConsumedCreditAt(String lastConsumedCreditAt) {
      this.lastConsumedCreditAt = Optional.of(lastConsumedCreditAt);
      return this;
    }

    @JsonSetter(
        value = "terminated_at",
        nulls = Nulls.SKIP
    )
    public Builder terminatedAt(Optional<String> terminatedAt) {
      this.terminatedAt = terminatedAt;
      return this;
    }

    public Builder terminatedAt(String terminatedAt) {
      this.terminatedAt = Optional.of(terminatedAt);
      return this;
    }

    public WalletObject build() {
      return new WalletObject(lagoId, lagoCustomerId, externalCustomerId, status, currency, name, rateAmount, creditsBalance, balance, consumedCredits, createdAt, expirationAt, lastBalanceSyncAt, lastConsumedCreditAt, terminatedAt);
    }
  }
}
