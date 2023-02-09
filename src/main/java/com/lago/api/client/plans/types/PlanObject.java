package com.lago.api.client.plans.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = PlanObject.Builder.class
)
public final class PlanObject {
  private final Optional<String> lagoId;

  private final Optional<String> name;

  private final Optional<String> createdAt;

  private final Optional<String> code;

  private final Optional<PlanInterval> interval;

  private final Optional<String> description;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<Double> trialPeriod;

  private final Optional<Boolean> payInAdvance;

  private final Optional<Boolean> billChargesMonthly;

  private final Optional<List<ChargeObject>> charges;

  private int _cachedHashCode;

  PlanObject(Optional<String> lagoId, Optional<String> name, Optional<String> createdAt,
      Optional<String> code, Optional<PlanInterval> interval, Optional<String> description,
      Optional<Integer> amountCents, Optional<String> amountCurrency, Optional<Double> trialPeriod,
      Optional<Boolean> payInAdvance, Optional<Boolean> billChargesMonthly,
      Optional<List<ChargeObject>> charges) {
    this.lagoId = lagoId;
    this.name = name;
    this.createdAt = createdAt;
    this.code = code;
    this.interval = interval;
    this.description = description;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.trialPeriod = trialPeriod;
    this.payInAdvance = payInAdvance;
    this.billChargesMonthly = billChargesMonthly;
    this.charges = charges;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  @JsonProperty("interval")
  public Optional<PlanInterval> getInterval() {
    return interval;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("trial_period")
  public Optional<Double> getTrialPeriod() {
    return trialPeriod;
  }

  @JsonProperty("pay_in_advance")
  public Optional<Boolean> getPayInAdvance() {
    return payInAdvance;
  }

  @JsonProperty("bill_charges_monthly")
  public Optional<Boolean> getBillChargesMonthly() {
    return billChargesMonthly;
  }

  @JsonProperty("charges")
  public Optional<List<ChargeObject>> getCharges() {
    return charges;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PlanObject && equalTo((PlanObject) other);
  }

  private boolean equalTo(PlanObject other) {
    return lagoId.equals(other.lagoId) && name.equals(other.name) && createdAt.equals(other.createdAt) && code.equals(other.code) && interval.equals(other.interval) && description.equals(other.description) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && trialPeriod.equals(other.trialPeriod) && payInAdvance.equals(other.payInAdvance) && billChargesMonthly.equals(other.billChargesMonthly) && charges.equals(other.charges);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.name, this.createdAt, this.code, this.interval, this.description, this.amountCents, this.amountCurrency, this.trialPeriod, this.payInAdvance, this.billChargesMonthly, this.charges);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PlanObject{" + "lagoId: " + lagoId + ", name: " + name + ", createdAt: " + createdAt + ", code: " + code + ", interval: " + interval + ", description: " + description + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", trialPeriod: " + trialPeriod + ", payInAdvance: " + payInAdvance + ", billChargesMonthly: " + billChargesMonthly + ", charges: " + charges + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<PlanInterval> interval = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<Double> trialPeriod = Optional.empty();

    private Optional<Boolean> payInAdvance = Optional.empty();

    private Optional<Boolean> billChargesMonthly = Optional.empty();

    private Optional<List<ChargeObject>> charges = Optional.empty();

    private Builder() {
    }

    public Builder from(PlanObject other) {
      lagoId(other.getLagoId());
      name(other.getName());
      createdAt(other.getCreatedAt());
      code(other.getCode());
      interval(other.getInterval());
      description(other.getDescription());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      trialPeriod(other.getTrialPeriod());
      payInAdvance(other.getPayInAdvance());
      billChargesMonthly(other.getBillChargesMonthly());
      charges(other.getCharges());
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
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "interval",
        nulls = Nulls.SKIP
    )
    public Builder interval(Optional<PlanInterval> interval) {
      this.interval = interval;
      return this;
    }

    public Builder interval(PlanInterval interval) {
      this.interval = Optional.of(interval);
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
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
        value = "trial_period",
        nulls = Nulls.SKIP
    )
    public Builder trialPeriod(Optional<Double> trialPeriod) {
      this.trialPeriod = trialPeriod;
      return this;
    }

    public Builder trialPeriod(Double trialPeriod) {
      this.trialPeriod = Optional.of(trialPeriod);
      return this;
    }

    @JsonSetter(
        value = "pay_in_advance",
        nulls = Nulls.SKIP
    )
    public Builder payInAdvance(Optional<Boolean> payInAdvance) {
      this.payInAdvance = payInAdvance;
      return this;
    }

    public Builder payInAdvance(Boolean payInAdvance) {
      this.payInAdvance = Optional.of(payInAdvance);
      return this;
    }

    @JsonSetter(
        value = "bill_charges_monthly",
        nulls = Nulls.SKIP
    )
    public Builder billChargesMonthly(Optional<Boolean> billChargesMonthly) {
      this.billChargesMonthly = billChargesMonthly;
      return this;
    }

    public Builder billChargesMonthly(Boolean billChargesMonthly) {
      this.billChargesMonthly = Optional.of(billChargesMonthly);
      return this;
    }

    @JsonSetter(
        value = "charges",
        nulls = Nulls.SKIP
    )
    public Builder charges(Optional<List<ChargeObject>> charges) {
      this.charges = charges;
      return this;
    }

    public Builder charges(List<ChargeObject> charges) {
      this.charges = Optional.of(charges);
      return this;
    }

    public PlanObject build() {
      return new PlanObject(lagoId, name, createdAt, code, interval, description, amountCents, amountCurrency, trialPeriod, payInAdvance, billChargesMonthly, charges);
    }
  }
}
