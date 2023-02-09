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
    builder = WalletTransactionInputObject.Builder.class
)
public final class WalletTransactionInputObject {
  private final Optional<String> walletId;

  private final Optional<Double> paidCredits;

  private final Optional<Double> grantedCredits;

  private int _cachedHashCode;

  WalletTransactionInputObject(Optional<String> walletId, Optional<Double> paidCredits,
      Optional<Double> grantedCredits) {
    this.walletId = walletId;
    this.paidCredits = paidCredits;
    this.grantedCredits = grantedCredits;
  }

  @JsonProperty("wallet_id")
  public Optional<String> getWalletId() {
    return walletId;
  }

  @JsonProperty("paid_credits")
  public Optional<Double> getPaidCredits() {
    return paidCredits;
  }

  @JsonProperty("granted_credits")
  public Optional<Double> getGrantedCredits() {
    return grantedCredits;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WalletTransactionInputObject && equalTo((WalletTransactionInputObject) other);
  }

  private boolean equalTo(WalletTransactionInputObject other) {
    return walletId.equals(other.walletId) && paidCredits.equals(other.paidCredits) && grantedCredits.equals(other.grantedCredits);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.walletId, this.paidCredits, this.grantedCredits);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WalletTransactionInputObject{" + "walletId: " + walletId + ", paidCredits: " + paidCredits + ", grantedCredits: " + grantedCredits + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> walletId = Optional.empty();

    private Optional<Double> paidCredits = Optional.empty();

    private Optional<Double> grantedCredits = Optional.empty();

    private Builder() {
    }

    public Builder from(WalletTransactionInputObject other) {
      walletId(other.getWalletId());
      paidCredits(other.getPaidCredits());
      grantedCredits(other.getGrantedCredits());
      return this;
    }

    @JsonSetter(
        value = "wallet_id",
        nulls = Nulls.SKIP
    )
    public Builder walletId(Optional<String> walletId) {
      this.walletId = walletId;
      return this;
    }

    public Builder walletId(String walletId) {
      this.walletId = Optional.of(walletId);
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

    public WalletTransactionInputObject build() {
      return new WalletTransactionInputObject(walletId, paidCredits, grantedCredits);
    }
  }
}
