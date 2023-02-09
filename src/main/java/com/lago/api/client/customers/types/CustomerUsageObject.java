package com.lago.api.client.customers.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CustomerUsageObject.Builder.class
)
public final class CustomerUsageObject {
  private final Optional<String> fromDatetime;

  private final Optional<String> toDatetime;

  private final Optional<String> issuingDate;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<Integer> totalAmountCents;

  private final Optional<String> totalAmountCurrency;

  private final Optional<Integer> vatAmountCents;

  private final Optional<String> vatAmountCurrency;

  private final Optional<List<ChargeUsageObject>> chargesUsage;

  private int _cachedHashCode;

  CustomerUsageObject(Optional<String> fromDatetime, Optional<String> toDatetime,
      Optional<String> issuingDate, Optional<Integer> amountCents, Optional<String> amountCurrency,
      Optional<Integer> totalAmountCents, Optional<String> totalAmountCurrency,
      Optional<Integer> vatAmountCents, Optional<String> vatAmountCurrency,
      Optional<List<ChargeUsageObject>> chargesUsage) {
    this.fromDatetime = fromDatetime;
    this.toDatetime = toDatetime;
    this.issuingDate = issuingDate;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.totalAmountCents = totalAmountCents;
    this.totalAmountCurrency = totalAmountCurrency;
    this.vatAmountCents = vatAmountCents;
    this.vatAmountCurrency = vatAmountCurrency;
    this.chargesUsage = chargesUsage;
  }

  @JsonProperty("from_datetime")
  public Optional<String> getFromDatetime() {
    return fromDatetime;
  }

  @JsonProperty("to_datetime")
  public Optional<String> getToDatetime() {
    return toDatetime;
  }

  @JsonProperty("issuing_date")
  public Optional<String> getIssuingDate() {
    return issuingDate;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("total_amount_cents")
  public Optional<Integer> getTotalAmountCents() {
    return totalAmountCents;
  }

  @JsonProperty("total_amount_currency")
  public Optional<String> getTotalAmountCurrency() {
    return totalAmountCurrency;
  }

  @JsonProperty("vat_amount_cents")
  public Optional<Integer> getVatAmountCents() {
    return vatAmountCents;
  }

  @JsonProperty("vat_amount_currency")
  public Optional<String> getVatAmountCurrency() {
    return vatAmountCurrency;
  }

  @JsonProperty("charges_usage")
  public Optional<List<ChargeUsageObject>> getChargesUsage() {
    return chargesUsage;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CustomerUsageObject && equalTo((CustomerUsageObject) other);
  }

  private boolean equalTo(CustomerUsageObject other) {
    return fromDatetime.equals(other.fromDatetime) && toDatetime.equals(other.toDatetime) && issuingDate.equals(other.issuingDate) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && totalAmountCents.equals(other.totalAmountCents) && totalAmountCurrency.equals(other.totalAmountCurrency) && vatAmountCents.equals(other.vatAmountCents) && vatAmountCurrency.equals(other.vatAmountCurrency) && chargesUsage.equals(other.chargesUsage);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.fromDatetime, this.toDatetime, this.issuingDate, this.amountCents, this.amountCurrency, this.totalAmountCents, this.totalAmountCurrency, this.vatAmountCents, this.vatAmountCurrency, this.chargesUsage);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CustomerUsageObject{" + "fromDatetime: " + fromDatetime + ", toDatetime: " + toDatetime + ", issuingDate: " + issuingDate + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", totalAmountCents: " + totalAmountCents + ", totalAmountCurrency: " + totalAmountCurrency + ", vatAmountCents: " + vatAmountCents + ", vatAmountCurrency: " + vatAmountCurrency + ", chargesUsage: " + chargesUsage + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> fromDatetime = Optional.empty();

    private Optional<String> toDatetime = Optional.empty();

    private Optional<String> issuingDate = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<Integer> totalAmountCents = Optional.empty();

    private Optional<String> totalAmountCurrency = Optional.empty();

    private Optional<Integer> vatAmountCents = Optional.empty();

    private Optional<String> vatAmountCurrency = Optional.empty();

    private Optional<List<ChargeUsageObject>> chargesUsage = Optional.empty();

    private Builder() {
    }

    public Builder from(CustomerUsageObject other) {
      fromDatetime(other.getFromDatetime());
      toDatetime(other.getToDatetime());
      issuingDate(other.getIssuingDate());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      totalAmountCents(other.getTotalAmountCents());
      totalAmountCurrency(other.getTotalAmountCurrency());
      vatAmountCents(other.getVatAmountCents());
      vatAmountCurrency(other.getVatAmountCurrency());
      chargesUsage(other.getChargesUsage());
      return this;
    }

    @JsonSetter(
        value = "from_datetime",
        nulls = Nulls.SKIP
    )
    public Builder fromDatetime(Optional<String> fromDatetime) {
      this.fromDatetime = fromDatetime;
      return this;
    }

    public Builder fromDatetime(String fromDatetime) {
      this.fromDatetime = Optional.of(fromDatetime);
      return this;
    }

    @JsonSetter(
        value = "to_datetime",
        nulls = Nulls.SKIP
    )
    public Builder toDatetime(Optional<String> toDatetime) {
      this.toDatetime = toDatetime;
      return this;
    }

    public Builder toDatetime(String toDatetime) {
      this.toDatetime = Optional.of(toDatetime);
      return this;
    }

    @JsonSetter(
        value = "issuing_date",
        nulls = Nulls.SKIP
    )
    public Builder issuingDate(Optional<String> issuingDate) {
      this.issuingDate = issuingDate;
      return this;
    }

    public Builder issuingDate(String issuingDate) {
      this.issuingDate = Optional.of(issuingDate);
      return this;
    }

    @JsonSetter(
        value = "amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder amountCents(Optional<Integer> amountCents) {
      this.amountCents = amountCents;
      return this;
    }

    public Builder amountCents(Integer amountCents) {
      this.amountCents = Optional.of(amountCents);
      return this;
    }

    @JsonSetter(
        value = "amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder amountCurrency(Optional<String> amountCurrency) {
      this.amountCurrency = amountCurrency;
      return this;
    }

    public Builder amountCurrency(String amountCurrency) {
      this.amountCurrency = Optional.of(amountCurrency);
      return this;
    }

    @JsonSetter(
        value = "total_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountCents(Optional<Integer> totalAmountCents) {
      this.totalAmountCents = totalAmountCents;
      return this;
    }

    public Builder totalAmountCents(Integer totalAmountCents) {
      this.totalAmountCents = Optional.of(totalAmountCents);
      return this;
    }

    @JsonSetter(
        value = "total_amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountCurrency(Optional<String> totalAmountCurrency) {
      this.totalAmountCurrency = totalAmountCurrency;
      return this;
    }

    public Builder totalAmountCurrency(String totalAmountCurrency) {
      this.totalAmountCurrency = Optional.of(totalAmountCurrency);
      return this;
    }

    @JsonSetter(
        value = "vat_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder vatAmountCents(Optional<Integer> vatAmountCents) {
      this.vatAmountCents = vatAmountCents;
      return this;
    }

    public Builder vatAmountCents(Integer vatAmountCents) {
      this.vatAmountCents = Optional.of(vatAmountCents);
      return this;
    }

    @JsonSetter(
        value = "vat_amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder vatAmountCurrency(Optional<String> vatAmountCurrency) {
      this.vatAmountCurrency = vatAmountCurrency;
      return this;
    }

    public Builder vatAmountCurrency(String vatAmountCurrency) {
      this.vatAmountCurrency = Optional.of(vatAmountCurrency);
      return this;
    }

    @JsonSetter(
        value = "charges_usage",
        nulls = Nulls.SKIP
    )
    public Builder chargesUsage(Optional<List<ChargeUsageObject>> chargesUsage) {
      this.chargesUsage = chargesUsage;
      return this;
    }

    public Builder chargesUsage(List<ChargeUsageObject> chargesUsage) {
      this.chargesUsage = Optional.of(chargesUsage);
      return this;
    }

    public CustomerUsageObject build() {
      return new CustomerUsageObject(fromDatetime, toDatetime, issuingDate, amountCents, amountCurrency, totalAmountCents, totalAmountCurrency, vatAmountCents, vatAmountCurrency, chargesUsage);
    }
  }
}
