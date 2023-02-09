package com.lago.api.client.customers.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class ChargeModelType {
  public static final ChargeModelType PERCENTAGE = new ChargeModelType(Value.PERCENTAGE, "percentage");

  public static final ChargeModelType STANDARD = new ChargeModelType(Value.STANDARD, "standard");

  public static final ChargeModelType PACKAGE = new ChargeModelType(Value.PACKAGE, "package");

  public static final ChargeModelType VOLUME = new ChargeModelType(Value.VOLUME, "volume");

  public static final ChargeModelType GRADUATED = new ChargeModelType(Value.GRADUATED, "graduated");

  private final Value value;

  private final String string;

  ChargeModelType(Value value, String string) {
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
      || (other instanceof ChargeModelType && this.string.equals(((ChargeModelType) other).string));
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
  public static ChargeModelType valueOf(String value) {
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
        return new ChargeModelType(Value.UNKNOWN, upperCasedValue);
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
