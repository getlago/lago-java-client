package com.lago.api.client.wallets.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class TransactionStatus {
  public static final TransactionStatus SETTLED = new TransactionStatus(Value.SETTLED, "settled");

  public static final TransactionStatus PENDING = new TransactionStatus(Value.PENDING, "pending");

  private final Value value;

  private final String string;

  TransactionStatus(Value value, String string) {
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
      || (other instanceof TransactionStatus && this.string.equals(((TransactionStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case SETTLED:
        return visitor.visitSettled();
      case PENDING:
        return visitor.visitPending();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static TransactionStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "settled":
        return SETTLED;
      case "pending":
        return PENDING;
      default:
        return new TransactionStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PENDING,

    SETTLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPending();

    T visitSettled();

    T visitUnknown(String unknownType);
  }
}
