package com.lago.api.client.plans.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class ChargeModel {
  public static final ChargeModel PERCENTAGE = new ChargeModel(Value.PERCENTAGE, "percentage");

  public static final ChargeModel STANDARD = new ChargeModel(Value.STANDARD, "standard");

  public static final ChargeModel PACKAGE = new ChargeModel(Value.PACKAGE, "package");

  public static final ChargeModel VOLUME = new ChargeModel(Value.VOLUME, "volume");

  public static final ChargeModel GRADUATED = new ChargeModel(Value.GRADUATED, "graduated");

  private final Value value;

  private final String string;

  ChargeModel(Value value, String string) {
    this.value = value;
    this.string = string;
  }

  public Value getEnumValue() {
    return value;
  }

  @Override
  @JsonValue
  public String toString() {
    return this.string;
  }

  @Override
  public boolean equals(Object other) {
    return (this == other) 
      || (other instanceof ChargeModel && this.string.equals(((ChargeModel) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PERCENTAGE:
        return visitor.visitPercentage();
      case STANDARD:
        return visitor.visitStandard();
      case PACKAGE:
        return visitor.visitPackage();
      case VOLUME:
        return visitor.visitVolume();
      case GRADUATED:
        return visitor.visitGraduated();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ChargeModel valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "percentage":
        return PERCENTAGE;
      case "standard":
        return STANDARD;
      case "package":
        return PACKAGE;
      case "volume":
        return VOLUME;
      case "graduated":
        return GRADUATED;
      default:
        return new ChargeModel(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    STANDARD,

    GRADUATED,

    PACKAGE,

    PERCENTAGE,

    VOLUME,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitStandard();

    T visitGraduated();

    T visitPackage();

    T visitPercentage();

    T visitVolume();

    T visitUnknown(String unknownType);
  }
}
