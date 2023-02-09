package com.lago.api.client.customers.types;

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
    builder = Charge.Builder.class
)
public final class Charge {
  private final Optional<String> lagoId;

  private final Optional<ChargeModelType> chargeModel;

  private int _cachedHashCode;

  Charge(Optional<String> lagoId, Optional<ChargeModelType> chargeModel) {
    this.lagoId = lagoId;
    this.chargeModel = chargeModel;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  /**
   * @return Charge model type
   */
  @JsonProperty("charge_model")
  public Optional<ChargeModelType> getChargeModel() {
    return chargeModel;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Charge && equalTo((Charge) other);
  }

  private boolean equalTo(Charge other) {
    return lagoId.equals(other.lagoId) && chargeModel.equals(other.chargeModel);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.chargeModel);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Charge{" + "lagoId: " + lagoId + ", chargeModel: " + chargeModel + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<ChargeModelType> chargeModel = Optional.empty();

    private Builder() {
    }

    public Builder from(Charge other) {
      lagoId(other.getLagoId());
      chargeModel(other.getChargeModel());
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
        value = "charge_model",
        nulls = Nulls.SKIP
    )
    public Builder chargeModel(Optional<ChargeModelType> chargeModel) {
      this.chargeModel = chargeModel;
      return this;
    }

    public Builder chargeModel(ChargeModelType chargeModel) {
      this.chargeModel = Optional.of(chargeModel);
      return this;
    }

    public Charge build() {
      return new Charge(lagoId, chargeModel);
    }
  }
}
