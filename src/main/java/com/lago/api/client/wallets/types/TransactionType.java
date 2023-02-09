package com.lago.api.client.wallets.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class TransactionType {
  public static final TransactionType OUTBOUND = new TransactionType(Value.OUTBOUND, "outbound");

  public static final TransactionType INBOUND = new TransactionType(Value.INBOUND, "inbound");

  private final Value value;

  private final String string;

  TransactionType(Value value, String string) {
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
      || (other instanceof TransactionType && this.string.equals(((TransactionType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case OUTBOUND:
        return visitor.visitOutbound();
      case INBOUND:
        return visitor.visitInbound();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static TransactionType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "outbound":
        return OUTBOUND;
      case "inbound":
        return INBOUND;
      default:
        return new TransactionType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INBOUND,

    OUTBOUND,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitInbound();

    T visitOutbound();

    T visitUnknown(String unknownType);
  }
}
