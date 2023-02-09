package com.lago.api.client.coupons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class FrequencyType {
  public static final FrequencyType RECURRING = new FrequencyType(Value.RECURRING, "recurring");

  public static final FrequencyType ONCE = new FrequencyType(Value.ONCE, "once");

  private final Value value;

  private final String string;

  FrequencyType(Value value, String string) {
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
      || (other instanceof FrequencyType && this.string.equals(((FrequencyType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case RECURRING:
        return visitor.visitRecurring();
      case ONCE:
        return visitor.visitOnce();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static FrequencyType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "recurring":
        return RECURRING;
      case "once":
        return ONCE;
      default:
        return new FrequencyType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ONCE,

    RECURRING,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOnce();

    T visitRecurring();

    T visitUnknown(String unknownType);
  }
}
