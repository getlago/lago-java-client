package com.lago.api.client.customers.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ChargeUsageObject.Builder.class
)
public final class ChargeUsageObject {
  private final Optional<Double> units;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<Charge> charge;

  private final Optional<ChargeBillableMetric> billableMetric;

  private final Optional<List<Group>> groups;

  private int _cachedHashCode;

  ChargeUsageObject(Optional<Double> units, Optional<Integer> amountCents,
      Optional<String> amountCurrency, Optional<Charge> charge,
      Optional<ChargeBillableMetric> billableMetric, Optional<List<Group>> groups) {
    this.units = units;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.charge = charge;
    this.billableMetric = billableMetric;
    this.groups = groups;
  }

  @JsonProperty("units")
  public Optional<Double> getUnits() {
    return units;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("charge")
  public Optional<Charge> getCharge() {
    return charge;
  }

  @JsonProperty("billable_metric")
  public Optional<ChargeBillableMetric> getBillableMetric() {
    return billableMetric;
  }

  @JsonProperty("groups")
  public Optional<List<Group>> getGroups() {
    return groups;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ChargeUsageObject && equalTo((ChargeUsageObject) other);
  }

  private boolean equalTo(ChargeUsageObject other) {
    return units.equals(other.units) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && charge.equals(other.charge) && billableMetric.equals(other.billableMetric) && groups.equals(other.groups);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.units, this.amountCents, this.amountCurrency, this.charge, this.billableMetric, this.groups);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ChargeUsageObject{" + "units: " + units + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", charge: " + charge + ", billableMetric: " + billableMetric + ", groups: " + groups + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> units = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<Charge> charge = Optional.empty();

    private Optional<ChargeBillableMetric> billableMetric = Optional.empty();

    private Optional<List<Group>> groups = Optional.empty();

    private Builder() {
    }

    public Builder from(ChargeUsageObject other) {
      units(other.getUnits());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      charge(other.getCharge());
      billableMetric(other.getBillableMetric());
      groups(other.getGroups());
      return this;
    }

    @JsonSetter(
        value = "units",
        nulls = Nulls.SKIP
    )
    public Builder units(Optional<Double> units) {
      this.units = units;
      return this;
    }

    public Builder units(Double units) {
      this.units = Optional.of(units);
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
        value = "charge",
        nulls = Nulls.SKIP
    )
    public Builder charge(Optional<Charge> charge) {
      this.charge = charge;
      return this;
    }

    public Builder charge(Charge charge) {
      this.charge = Optional.of(charge);
      return this;
    }

    @JsonSetter(
        value = "billable_metric",
        nulls = Nulls.SKIP
    )
    public Builder billableMetric(Optional<ChargeBillableMetric> billableMetric) {
      this.billableMetric = billableMetric;
      return this;
    }

    public Builder billableMetric(ChargeBillableMetric billableMetric) {
      this.billableMetric = Optional.of(billableMetric);
      return this;
    }

    @JsonSetter(
        value = "groups",
        nulls = Nulls.SKIP
    )
    public Builder groups(Optional<List<Group>> groups) {
      this.groups = groups;
      return this;
    }

    public Builder groups(List<Group> groups) {
      this.groups = Optional.of(groups);
      return this;
    }

    public ChargeUsageObject build() {
      return new ChargeUsageObject(units, amountCents, amountCurrency, charge, billableMetric, groups);
    }
  }
}
