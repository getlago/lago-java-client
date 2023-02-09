package com.lago.api.client.credit.notes.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class CreditReason {
  public static final CreditReason DUPLICATED_CHARGE = new CreditReason(Value.DUPLICATED_CHARGE, "duplicated_charge");

  public static final CreditReason ORDER_CHANGE = new CreditReason(Value.ORDER_CHANGE, "order_change");

  public static final CreditReason PRODUCT_UNSATISFACTORY = new CreditReason(Value.PRODUCT_UNSATISFACTORY, "product_unsatisfactory");

  public static final CreditReason OTHER = new CreditReason(Value.OTHER, "other");

  public static final CreditReason ORDER_CANCELLATION = new CreditReason(Value.ORDER_CANCELLATION, "order_cancellation");

  public static final CreditReason FRAUDULENT_CHARGE = new CreditReason(Value.FRAUDULENT_CHARGE, "fraudulent_charge");

  private final Value value;

  private final String string;

  CreditReason(Value value, String string) {
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
      || (other instanceof CreditReason && this.string.equals(((CreditReason) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case DUPLICATED_CHARGE:
        return visitor.visitDuplicatedCharge();
      case ORDER_CHANGE:
        return visitor.visitOrderChange();
      case PRODUCT_UNSATISFACTORY:
        return visitor.visitProductUnsatisfactory();
      case OTHER:
        return visitor.visitOther();
      case ORDER_CANCELLATION:
        return visitor.visitOrderCancellation();
      case FRAUDULENT_CHARGE:
        return visitor.visitFraudulentCharge();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CreditReason valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "duplicated_charge":
        return DUPLICATED_CHARGE;
      case "order_change":
        return ORDER_CHANGE;
      case "product_unsatisfactory":
        return PRODUCT_UNSATISFACTORY;
      case "other":
        return OTHER;
      case "order_cancellation":
        return ORDER_CANCELLATION;
      case "fraudulent_charge":
        return FRAUDULENT_CHARGE;
      default:
        return new CreditReason(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DUPLICATED_CHARGE,

    PRODUCT_UNSATISFACTORY,

    ORDER_CHANGE,

    ORDER_CANCELLATION,

    FRAUDULENT_CHARGE,

    OTHER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDuplicatedCharge();

    T visitProductUnsatisfactory();

    T visitOrderChange();

    T visitOrderCancellation();

    T visitFraudulentCharge();

    T visitOther();

    T visitUnknown(String unknownType);
  }
}
