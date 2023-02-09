package com.lago.api.client.coupons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class CouponType {
  public static final CouponType PERCENTAGE = new CouponType(Value.PERCENTAGE, "percentage");

  public static final CouponType FIXED_AMOUNT = new CouponType(Value.FIXED_AMOUNT, "fixed_amount");

  private final Value value;

  private final String string;

  CouponType(Value value, String string) {
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
      || (other instanceof CouponType && this.string.equals(((CouponType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PERCENTAGE:
        return visitor.visitPercentage();
      case FIXED_AMOUNT:
        return visitor.visitFixedAmount();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CouponType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "percentage":
        return PERCENTAGE;
      case "fixed_amount":
        return FIXED_AMOUNT;
      default:
        return new CouponType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FIXED_AMOUNT,

    PERCENTAGE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFixedAmount();

    T visitPercentage();

    T visitUnknown(String unknownType);
  }
}
