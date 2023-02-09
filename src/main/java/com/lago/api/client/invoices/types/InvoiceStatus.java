package com.lago.api.client.invoices.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class InvoiceStatus {
  public static final InvoiceStatus FINALIZED = new InvoiceStatus(Value.FINALIZED, "finalized");

  public static final InvoiceStatus DRAFT = new InvoiceStatus(Value.DRAFT, "draft");

  private final Value value;

  private final String string;

  InvoiceStatus(Value value, String string) {
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
      || (other instanceof InvoiceStatus && this.string.equals(((InvoiceStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case FINALIZED:
        return visitor.visitFinalized();
      case DRAFT:
        return visitor.visitDraft();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static InvoiceStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "finalized":
        return FINALIZED;
      case "draft":
        return DRAFT;
      default:
        return new InvoiceStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DRAFT,

    FINALIZED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDraft();

    T visitFinalized();

    T visitUnknown(String unknownType);
  }
}
