package com.lago.api.client.coupons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class CouponStatus {
  public static final CouponStatus TERMINATED = new CouponStatus(Value.TERMINATED, "terminated");

  public static final CouponStatus ACTIVE = new CouponStatus(Value.ACTIVE, "active");

  private final Value value;

  private final String string;

  CouponStatus(Value value, String string) {
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
      || (other instanceof CouponStatus && this.string.equals(((CouponStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case TERMINATED:
        return visitor.visitTerminated();
      case ACTIVE:
        return visitor.visitActive();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CouponStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "terminated":
        return TERMINATED;
      case "active":
        return ACTIVE;
      default:
        return new CouponStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    TERMINATED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitActive();

    T visitTerminated();

    T visitUnknown(String unknownType);
  }
}
