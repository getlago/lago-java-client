package com.lago.api.client.invoices.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class InvoiceType {
  public static final InvoiceType SUBSCRIPTION = new InvoiceType(Value.SUBSCRIPTION, "subscription");

  public static final InvoiceType CREDIT = new InvoiceType(Value.CREDIT, "credit");

  public static final InvoiceType ADD_ON = new InvoiceType(Value.ADD_ON, "add_on");

  public static final InvoiceType CHARGE = new InvoiceType(Value.CHARGE, "charge");

  private final Value value;

  private final String string;

  InvoiceType(Value value, String string) {
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
      || (other instanceof InvoiceType && this.string.equals(((InvoiceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case SUBSCRIPTION:
        return visitor.visitSubscription();
      case CREDIT:
        return visitor.visitCredit();
      case ADD_ON:
        return visitor.visitAddOn();
      case CHARGE:
        return visitor.visitCharge();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static InvoiceType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "subscription":
        return SUBSCRIPTION;
      case "credit":
        return CREDIT;
      case "add_on":
        return ADD_ON;
      case "charge":
        return CHARGE;
      default:
        return new InvoiceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CHARGE,

    ADD_ON,

    SUBSCRIPTION,

    CREDIT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCharge();

    T visitAddOn();

    T visitSubscription();

    T visitCredit();

    T visitUnknown(String unknownType);
  }
}
