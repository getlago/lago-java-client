package com.lago.api.client.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class BillingTime {
  public static final BillingTime ANNIVERSARY = new BillingTime(Value.ANNIVERSARY, "anniversary");

  public static final BillingTime CALENDAR = new BillingTime(Value.CALENDAR, "calendar");

  private final Value value;

  private final String string;

  BillingTime(Value value, String string) {
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
      || (other instanceof BillingTime && this.string.equals(((BillingTime) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case ANNIVERSARY:
        return visitor.visitAnniversary();
      case CALENDAR:
        return visitor.visitCalendar();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static BillingTime valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "anniversary":
        return ANNIVERSARY;
      case "calendar":
        return CALENDAR;
      default:
        return new BillingTime(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CALENDAR,

    ANNIVERSARY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCalendar();

    T visitAnniversary();

    T visitUnknown(String unknownType);
  }
}
