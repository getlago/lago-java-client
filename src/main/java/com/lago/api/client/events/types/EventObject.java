package com.lago.api.client.events.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = EventObject.Builder.class
)
public final class EventObject {
  private final Optional<String> lagoId;

  private final Optional<String> transactionId;

  private final Optional<String> lagoCustomerId;

  private final Optional<String> externalCustomerId;

  private final Optional<String> code;

  private final Optional<String> timestamp;

  private final Optional<Map<String, Object>> properties;

  private final Optional<String> lagoSubscriptionId;

  private final Optional<String> externalSubscriptionId;

  private final Optional<String> createdAt;

  private int _cachedHashCode;

  EventObject(Optional<String> lagoId, Optional<String> transactionId,
      Optional<String> lagoCustomerId, Optional<String> externalCustomerId, Optional<String> code,
      Optional<String> timestamp, Optional<Map<String, Object>> properties,
      Optional<String> lagoSubscriptionId, Optional<String> externalSubscriptionId,
      Optional<String> createdAt) {
    this.lagoId = lagoId;
    this.transactionId = transactionId;
    this.lagoCustomerId = lagoCustomerId;
    this.externalCustomerId = externalCustomerId;
    this.code = code;
    this.timestamp = timestamp;
    this.properties = properties;
    this.lagoSubscriptionId = lagoSubscriptionId;
    this.externalSubscriptionId = externalSubscriptionId;
    this.createdAt = createdAt;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("transaction_id")
  public Optional<String> getTransactionId() {
    return transactionId;
  }

  @JsonProperty("lago_customer_id")
  public Optional<String> getLagoCustomerId() {
    return lagoCustomerId;
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
  public Optional<String> getTimestamp() {
    return timestamp;
  }

  @JsonProperty("properties")
  public Optional<Map<String, Object>> getProperties() {
    return properties;
  }

  @JsonProperty("lago_subscription_id")
  public Optional<String> getLagoSubscriptionId() {
    return lagoSubscriptionId;
  }

  @JsonProperty("external_subscription_id")
  public Optional<String> getExternalSubscriptionId() {
    return externalSubscriptionId;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EventObject && equalTo((EventObject) other);
  }

  private boolean equalTo(EventObject other) {
    return lagoId.equals(other.lagoId) && transactionId.equals(other.transactionId) && lagoCustomerId.equals(other.lagoCustomerId) && externalCustomerId.equals(other.externalCustomerId) && code.equals(other.code) && timestamp.equals(other.timestamp) && properties.equals(other.properties) && lagoSubscriptionId.equals(other.lagoSubscriptionId) && externalSubscriptionId.equals(other.externalSubscriptionId) && createdAt.equals(other.createdAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.transactionId, this.lagoCustomerId, this.externalCustomerId, this.code, this.timestamp, this.properties, this.lagoSubscriptionId, this.externalSubscriptionId, this.createdAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EventObject{" + "lagoId: " + lagoId + ", transactionId: " + transactionId + ", lagoCustomerId: " + lagoCustomerId + ", externalCustomerId: " + externalCustomerId + ", code: " + code + ", timestamp: " + timestamp + ", properties: " + properties + ", lagoSubscriptionId: " + lagoSubscriptionId + ", externalSubscriptionId: " + externalSubscriptionId + ", createdAt: " + createdAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> transactionId = Optional.empty();

    private Optional<String> lagoCustomerId = Optional.empty();

    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<String> timestamp = Optional.empty();

    private Optional<Map<String, Object>> properties = Optional.empty();

    private Optional<String> lagoSubscriptionId = Optional.empty();

    private Optional<String> externalSubscriptionId = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Builder() {
    }

    public Builder from(EventObject other) {
      lagoId(other.getLagoId());
      transactionId(other.getTransactionId());
      lagoCustomerId(other.getLagoCustomerId());
      externalCustomerId(other.getExternalCustomerId());
      code(other.getCode());
      timestamp(other.getTimestamp());
      properties(other.getProperties());
      lagoSubscriptionId(other.getLagoSubscriptionId());
      externalSubscriptionId(other.getExternalSubscriptionId());
      createdAt(other.getCreatedAt());
      return this;
    }

    @JsonSetter(
        value = "lago_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoId(Optional<String> lagoId) {
      this.lagoId = lagoId;
      return this;
    }

    public Builder lagoId(String lagoId) {
      this.lagoId = Optional.of(lagoId);
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
        value = "lago_customer_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoCustomerId(Optional<String> lagoCustomerId) {
      this.lagoCustomerId = lagoCustomerId;
      return this;
    }

    public Builder lagoCustomerId(String lagoCustomerId) {
      this.lagoCustomerId = Optional.of(lagoCustomerId);
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
    public Builder timestamp(Optional<String> timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder timestamp(String timestamp) {
      this.timestamp = Optional.of(timestamp);
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

    @JsonSetter(
        value = "lago_subscription_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoSubscriptionId(Optional<String> lagoSubscriptionId) {
      this.lagoSubscriptionId = lagoSubscriptionId;
      return this;
    }

    public Builder lagoSubscriptionId(String lagoSubscriptionId) {
      this.lagoSubscriptionId = Optional.of(lagoSubscriptionId);
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
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    public EventObject build() {
      return new EventObject(lagoId, transactionId, lagoCustomerId, externalCustomerId, code, timestamp, properties, lagoSubscriptionId, externalSubscriptionId, createdAt);
    }
  }
}
