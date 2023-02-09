package com.lago.api.client.coupons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class ExpirationType {
  public static final ExpirationType TIME_LIMIT = new ExpirationType(Value.TIME_LIMIT, "time_limit");

  public static final ExpirationType NO_EXPIRATION = new ExpirationType(Value.NO_EXPIRATION, "no_expiration");

  private final Value value;

  private final String string;

  ExpirationType(Value value, String string) {
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
      || (other instanceof ExpirationType && this.string.equals(((ExpirationType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case TIME_LIMIT:
        return visitor.visitTimeLimit();
      case NO_EXPIRATION:
        return visitor.visitNoExpiration();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ExpirationType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "time_limit":
        return TIME_LIMIT;
      case "no_expiration":
        return NO_EXPIRATION;
      default:
        return new ExpirationType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    NO_EXPIRATION,

    TIME_LIMIT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitNoExpiration();

    T visitTimeLimit();

    T visitUnknown(String unknownType);
  }
}
