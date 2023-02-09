package com.lago.api.client.commons.types;

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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = FeeObject.Builder.class
)
public final class FeeObject {
  private final Optional<String> lagoId;

  private final Optional<String> lagoGroupId;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<Integer> vatAmountCents;

  private final Optional<String> vatAmountCurrency;

  private final Optional<Double> units;

  private final Optional<Integer> eventsCount;

  private final Optional<FeeItem> item;

  private int _cachedHashCode;

  FeeObject(Optional<String> lagoId, Optional<String> lagoGroupId, Optional<Integer> amountCents,
      Optional<String> amountCurrency, Optional<Integer> vatAmountCents,
      Optional<String> vatAmountCurrency, Optional<Double> units, Optional<Integer> eventsCount,
      Optional<FeeItem> item) {
    this.lagoId = lagoId;
    this.lagoGroupId = lagoGroupId;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.vatAmountCents = vatAmountCents;
    this.vatAmountCurrency = vatAmountCurrency;
    this.units = units;
    this.eventsCount = eventsCount;
    this.item = item;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("lago_group_id")
  public Optional<String> getLagoGroupId() {
    return lagoGroupId;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("vat_amount_cents")
  public Optional<Integer> getVatAmountCents() {
    return vatAmountCents;
  }

  @JsonProperty("vat_amount_currency")
  public Optional<String> getVatAmountCurrency() {
    return vatAmountCurrency;
  }

  @JsonProperty("units")
  public Optional<Double> getUnits() {
    return units;
  }

  @JsonProperty("events_count")
  public Optional<Integer> getEventsCount() {
    return eventsCount;
  }

  @JsonProperty("item")
  public Optional<FeeItem> getItem() {
    return item;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FeeObject && equalTo((FeeObject) other);
  }

  private boolean equalTo(FeeObject other) {
    return lagoId.equals(other.lagoId) && lagoGroupId.equals(other.lagoGroupId) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && vatAmountCents.equals(other.vatAmountCents) && vatAmountCurrency.equals(other.vatAmountCurrency) && units.equals(other.units) && eventsCount.equals(other.eventsCount) && item.equals(other.item);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.lagoGroupId, this.amountCents, this.amountCurrency, this.vatAmountCents, this.vatAmountCurrency, this.units, this.eventsCount, this.item);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FeeObject{" + "lagoId: " + lagoId + ", lagoGroupId: " + lagoGroupId + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", vatAmountCents: " + vatAmountCents + ", vatAmountCurrency: " + vatAmountCurrency + ", units: " + units + ", eventsCount: " + eventsCount + ", item: " + item + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> lagoGroupId = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<Integer> vatAmountCents = Optional.empty();

    private Optional<String> vatAmountCurrency = Optional.empty();

    private Optional<Double> units = Optional.empty();

    private Optional<Integer> eventsCount = Optional.empty();

    private Optional<FeeItem> item = Optional.empty();

    private Builder() {
    }

    public Builder from(FeeObject other) {
      lagoId(other.getLagoId());
      lagoGroupId(other.getLagoGroupId());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      vatAmountCents(other.getVatAmountCents());
      vatAmountCurrency(other.getVatAmountCurrency());
      units(other.getUnits());
      eventsCount(other.getEventsCount());
      item(other.getItem());
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
        value = "lago_group_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoGroupId(Optional<String> lagoGroupId) {
      this.lagoGroupId = lagoGroupId;
      return this;
    }

    public Builder lagoGroupId(String lagoGroupId) {
      this.lagoGroupId = Optional.of(lagoGroupId);
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
        value = "events_count",
        nulls = Nulls.SKIP
    )
    public Builder eventsCount(Optional<Integer> eventsCount) {
      this.eventsCount = eventsCount;
      return this;
    }

    public Builder eventsCount(Integer eventsCount) {
      this.eventsCount = Optional.of(eventsCount);
      return this;
    }

    @JsonSetter(
        value = "item",
        nulls = Nulls.SKIP
    )
    public Builder item(Optional<FeeItem> item) {
      this.item = item;
      return this;
    }

    public Builder item(FeeItem item) {
      this.item = Optional.of(item);
      return this;
    }

    public FeeObject build() {
      return new FeeObject(lagoId, lagoGroupId, amountCents, amountCurrency, vatAmountCents, vatAmountCurrency, units, eventsCount, item);
    }
  }
}
