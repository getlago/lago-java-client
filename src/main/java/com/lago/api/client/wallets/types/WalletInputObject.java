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
    builder = WalletInputObject.Builder.class
)
public final class WalletInputObject {
  private final Optional<String> name;

  private final Optional<Double> rateAmount;

  private final Optional<String> currency;

  private final Optional<Double> paidCredits;

  private final Optional<Double> grantedCredits;

  private final Optional<String> externalCustomerId;

  private final Optional<String> expirationAt;

  private int _cachedHashCode;

  WalletInputObject(Optional<String> name, Optional<Double> rateAmount, Optional<String> currency,
      Optional<Double> paidCredits, Optional<Double> grantedCredits,
      Optional<String> externalCustomerId, Optional<String> expirationAt) {
    this.name = name;
    this.rateAmount = rateAmount;
    this.currency = currency;
    this.paidCredits = paidCredits;
    this.grantedCredits = grantedCredits;
    this.externalCustomerId = externalCustomerId;
    this.expirationAt = expirationAt;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("rate_amount")
  public Optional<Double> getRateAmount() {
    return rateAmount;
  }

  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("paid_credits")
  public Optional<Double> getPaidCredits() {
    return paidCredits;
  }

  @JsonProperty("granted_credits")
  public Optional<Double> getGrantedCredits() {
    return grantedCredits;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("expiration_at")
  public Optional<String> getExpirationAt() {
    return expirationAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletInputObject && equalTo((WalletInputObject) other);
  }

  private boolean equalTo(WalletInputObject other) {
    return name.equals(other.name) && rateAmount.equals(other.rateAmount) && currency.equals(other.currency) && paidCredits.equals(other.paidCredits) && grantedCredits.equals(other.grantedCredits) && externalCustomerId.equals(other.externalCustomerId) && expirationAt.equals(other.expirationAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.rateAmount, this.currency, this.paidCredits, this.grantedCredits, this.externalCustomerId, this.expirationAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WalletInputObject{" + "name: " + name + ", rateAmount: " + rateAmount + ", currency: " + currency + ", paidCredits: " + paidCredits + ", grantedCredits: " + grantedCredits + ", externalCustomerId: " + externalCustomerId + ", expirationAt: " + expirationAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<Double> rateAmount = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<Double> paidCredits = Optional.empty();

    private Optional<Double> grantedCredits = Optional.empty();

    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<String> expirationAt = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletInputObject other) {
      name(other.getName());
      rateAmount(other.getRateAmount());
      currency(other.getCurrency());
      paidCredits(other.getPaidCredits());
      grantedCredits(other.getGrantedCredits());
      externalCustomerId(other.getExternalCustomerId());
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
        value = "paid_credits",
        nulls = Nulls.SKIP
    )
    public Builder paidCredits(Optional<Double> paidCredits) {
      this.paidCredits = paidCredits;
      return this;
    }

    public Builder paidCredits(Double paidCredits) {
      this.paidCredits = Optional.of(paidCredits);
      return this;
    }

    @JsonSetter(
        value = "granted_credits",
        nulls = Nulls.SKIP
    )
    public Builder grantedCredits(Optional<Double> grantedCredits) {
      this.grantedCredits = grantedCredits;
      return this;
    }

    public Builder grantedCredits(Double grantedCredits) {
      this.grantedCredits = Optional.of(grantedCredits);
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

    public WalletInputObject build() {
      return new WalletInputObject(name, rateAmount, currency, paidCredits, grantedCredits, externalCustomerId, expirationAt);
    }
  }
}
