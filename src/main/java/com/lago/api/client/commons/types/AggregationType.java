package com.lago.api.client.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AggregationType {
  public static final AggregationType MAX_AGG = new AggregationType(Value.MAX_AGG, "max_agg");

  public static final AggregationType SUM_AGG = new AggregationType(Value.SUM_AGG, "sum_agg");

  public static final AggregationType UNIQUE_COUNT_AGG = new AggregationType(Value.UNIQUE_COUNT_AGG, "unique_count_agg");

  public static final AggregationType COUNT_AGG = new AggregationType(Value.COUNT_AGG, "count_agg");

  public static final AggregationType RECURRING_COUNT_AGG = new AggregationType(Value.RECURRING_COUNT_AGG, "recurring_count_agg");

  private final Value value;

  private final String string;

  AggregationType(Value value, String string) {
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
      || (other instanceof AggregationType && this.string.equals(((AggregationType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case MAX_AGG:
        return visitor.visitMaxAgg();
      case SUM_AGG:
        return visitor.visitSumAgg();
      case UNIQUE_COUNT_AGG:
        return visitor.visitUniqueCountAgg();
      case COUNT_AGG:
        return visitor.visitCountAgg();
      case RECURRING_COUNT_AGG:
        return visitor.visitRecurringCountAgg();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AggregationType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "max_agg":
        return MAX_AGG;
      case "sum_agg":
        return SUM_AGG;
      case "unique_count_agg":
        return UNIQUE_COUNT_AGG;
      case "count_agg":
        return COUNT_AGG;
      case "recurring_count_agg":
        return RECURRING_COUNT_AGG;
      default:
        return new AggregationType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    COUNT_AGG,

    SUM_AGG,

    MAX_AGG,

    UNIQUE_COUNT_AGG,

    RECURRING_COUNT_AGG,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCountAgg();

    T visitSumAgg();

    T visitMaxAgg();

    T visitUniqueCountAgg();

    T visitRecurringCountAgg();

    T visitUnknown(String unknownType);
  }
}
