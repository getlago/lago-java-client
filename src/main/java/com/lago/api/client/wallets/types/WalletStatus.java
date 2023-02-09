package com.lago.api.client.wallets.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class WalletStatus {
  public static final WalletStatus TERMINATED = new WalletStatus(Value.TERMINATED, "terminated");

  public static final WalletStatus ACTIVE = new WalletStatus(Value.ACTIVE, "active");

  private final Value value;

  private final String string;

  WalletStatus(Value value, String string) {
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
      || (other instanceof WalletStatus && this.string.equals(((WalletStatus) other).string));
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
  public static WalletStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "terminated":
        return TERMINATED;
      case "active":
        return ACTIVE;
      default:
        return new WalletStatus(Value.UNKNOWN, upperCasedValue);
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
