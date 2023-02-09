package com.lago.api.client.plans.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class PlanInterval {
  public static final PlanInterval WEEKLY = new PlanInterval(Value.WEEKLY, "weekly");

  public static final PlanInterval YEARLY = new PlanInterval(Value.YEARLY, "yearly");

  public static final PlanInterval MONTHLY = new PlanInterval(Value.MONTHLY, "monthly");

  private final Value value;

  private final String string;

  PlanInterval(Value value, String string) {
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
      || (other instanceof PlanInterval && this.string.equals(((PlanInterval) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case WEEKLY:
        return visitor.visitWeekly();
      case YEARLY:
        return visitor.visitYearly();
      case MONTHLY:
        return visitor.visitMonthly();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static PlanInterval valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "weekly":
        return WEEKLY;
      case "yearly":
        return YEARLY;
      case "monthly":
        return MONTHLY;
      default:
        return new PlanInterval(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    WEEKLY,

    MONTHLY,

    YEARLY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitWeekly();

    T visitMonthly();

    T visitYearly();

    T visitUnknown(String unknownType);
  }
}
