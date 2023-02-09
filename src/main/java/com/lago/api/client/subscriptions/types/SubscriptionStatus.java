package com.lago.api.client.subscriptions.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SubscriptionStatus {
  public static final SubscriptionStatus CANCELED = new SubscriptionStatus(Value.CANCELED, "canceled");

  public static final SubscriptionStatus TERMINATED = new SubscriptionStatus(Value.TERMINATED, "terminated");

  public static final SubscriptionStatus ACTIVE = new SubscriptionStatus(Value.ACTIVE, "active");

  public static final SubscriptionStatus PENDING = new SubscriptionStatus(Value.PENDING, "pending");

  private final Value value;

  private final String string;

  SubscriptionStatus(Value value, String string) {
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
      || (other instanceof SubscriptionStatus && this.string.equals(((SubscriptionStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CANCELED:
        return visitor.visitCanceled();
      case TERMINATED:
        return visitor.visitTerminated();
      case ACTIVE:
        return visitor.visitActive();
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
  public static SubscriptionStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "canceled":
        return CANCELED;
      case "terminated":
        return TERMINATED;
      case "active":
        return ACTIVE;
      case "pending":
        return PENDING;
      default:
        return new SubscriptionStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    PENDING,

    TERMINATED,

    CANCELED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitActive();

    T visitPending();

    T visitTerminated();

    T visitCanceled();

    T visitUnknown(String unknownType);
  }
}
