package com.lago.api.client.invoices.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class PaymentStatus {
  public static final PaymentStatus FAILED = new PaymentStatus(Value.FAILED, "failed");

  public static final PaymentStatus SUCCEEDED = new PaymentStatus(Value.SUCCEEDED, "succeeded");

  public static final PaymentStatus PENDING = new PaymentStatus(Value.PENDING, "pending");

  private final Value value;

  private final String string;

  PaymentStatus(Value value, String string) {
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
      || (other instanceof PaymentStatus && this.string.equals(((PaymentStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case FAILED:
        return visitor.visitFailed();
      case SUCCEEDED:
        return visitor.visitSucceeded();
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
  public static PaymentStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "failed":
        return FAILED;
      case "succeeded":
        return SUCCEEDED;
      case "pending":
        return PENDING;
      default:
        return new PaymentStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PENDING,

    SUCCEEDED,

    FAILED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPending();

    T visitSucceeded();

    T visitFailed();

    T visitUnknown(String unknownType);
  }
}
