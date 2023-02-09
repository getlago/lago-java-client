package com.lago.api.client.events.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = EventInputObject.Builder.class
)
public final class EventInputObject {
  private final Optional<String> transactionId;

  private final Optional<String> externalCustomerId;

  private final Optional<String> code;

  private final Optional<Integer> timestamp;

  private final Optional<String> externalSubscriptionId;

  private final Optional<Map<String, Object>> properties;

  private int _cachedHashCode;

  EventInputObject(Optional<String> transactionId, Optional<String> externalCustomerId,
      Optional<String> code, Optional<Integer> timestamp, Optional<String> externalSubscriptionId,
      Optional<Map<String, Object>> properties) {
    this.transactionId = transactionId;
    this.externalCustomerId = externalCustomerId;
    this.code = code;
    this.timestamp = timestamp;
    this.externalSubscriptionId = externalSubscriptionId;
    this.properties = properties;
  }

  @JsonProperty("transaction_id")
  public Optional<String> getTransactionId() {
    return transactionId;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  @JsonProperty("timestamp")
  public Optional<Integer> getTimestamp() {
    return timestamp;
  }

  @JsonProperty("external_subscription_id")
  public Optional<String> getExternalSubscriptionId() {
    return externalSubscriptionId;
  }

  @JsonProperty("properties")
  public Optional<Map<String, Object>> getProperties() {
    return properties;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EventInputObject && equalTo((EventInputObject) other);
  }

  private boolean equalTo(EventInputObject other) {
    return transactionId.equals(other.transactionId) && externalCustomerId.equals(other.externalCustomerId) && code.equals(other.code) && timestamp.equals(other.timestamp) && externalSubscriptionId.equals(other.externalSubscriptionId) && properties.equals(other.properties);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.transactionId, this.externalCustomerId, this.code, this.timestamp, this.externalSubscriptionId, this.properties);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EventInputObject{" + "transactionId: " + transactionId + ", externalCustomerId: " + externalCustomerId + ", code: " + code + ", timestamp: " + timestamp + ", externalSubscriptionId: " + externalSubscriptionId + ", properties: " + properties + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> transactionId = Optional.empty();

    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<Integer> timestamp = Optional.empty();

    private Optional<String> externalSubscriptionId = Optional.empty();

    private Optional<Map<String, Object>> properties = Optional.empty();

    private Builder() {
    }

    public Builder from(EventInputObject other) {
      transactionId(other.getTransactionId());
      externalCustomerId(other.getExternalCustomerId());
      code(other.getCode());
      timestamp(other.getTimestamp());
      externalSubscriptionId(other.getExternalSubscriptionId());
      properties(other.getProperties());
      return this;
    }

    @JsonSetter(
        value = "transaction_id",
        nulls = Nulls.SKIP
    )
    public Builder transactionId(Optional<String> transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    public Builder transactionId(String transactionId) {
      this.transactionId = Optional.of(transactionId);
      return this;
    }

    @JsonSetter(
        value = "external_customer_id",
        nulls = Nulls.SKIP
    )
    public Builder externalCustomerId(Optional<String> externalCustomerId) {
      this.externalCustomerId = externalCustomerId;
      return this;
    }

    public Builder externalCustomerId(String externalCustomerId) {
      this.externalCustomerId = Optional.of(externalCustomerId);
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "timestamp",
        nulls = Nulls.SKIP
    )
    public Builder timestamp(Optional<Integer> timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder timestamp(Integer timestamp) {
      this.timestamp = Optional.of(timestamp);
      return this;
    }

    @JsonSetter(
        value = "external_subscription_id",
        nulls = Nulls.SKIP
    )
    public Builder externalSubscriptionId(Optional<String> externalSubscriptionId) {
      this.externalSubscriptionId = externalSubscriptionId;
      return this;
    }

    public Builder externalSubscriptionId(String externalSubscriptionId) {
      this.externalSubscriptionId = Optional.of(externalSubscriptionId);
      return this;
    }

    @JsonSetter(
        value = "properties",
        nulls = Nulls.SKIP
    )
    public Builder properties(Optional<Map<String, Object>> properties) {
      this.properties = properties;
      return this;
    }

    public Builder properties(Map<String, Object> properties) {
      this.properties = Optional.of(properties);
      return this;
    }

    public EventInputObject build() {
      return new EventInputObject(transactionId, externalCustomerId, code, timestamp, externalSubscriptionId, properties);
    }
  }
}
