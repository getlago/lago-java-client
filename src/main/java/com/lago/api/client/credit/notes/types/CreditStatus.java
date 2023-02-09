package com.lago.api.client.credit.notes.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class CreditStatus {
  public static final CreditStatus AVAILABLE = new CreditStatus(Value.AVAILABLE, "available");

  public static final CreditStatus CONSUMED = new CreditStatus(Value.CONSUMED, "consumed");

  public static final CreditStatus VOIDED = new CreditStatus(Value.VOIDED, "voided");

  private final Value value;

  private final String string;

  CreditStatus(Value value, String string) {
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
      || (other instanceof CreditStatus && this.string.equals(((CreditStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case AVAILABLE:
        return visitor.visitAvailable();
      case CONSUMED:
        return visitor.visitConsumed();
      case VOIDED:
        return visitor.visitVoided();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CreditStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "available":
        return AVAILABLE;
      case "consumed":
        return CONSUMED;
      case "voided":
        return VOIDED;
      default:
        return new CreditStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AVAILABLE,

    CONSUMED,

    VOIDED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAvailable();

    T visitConsumed();

    T visitVoided();

    T visitUnknown(String unknownType);
  }
}
