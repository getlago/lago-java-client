package com.lago.api.client.subscriptions.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SubscriptionUpdateInputObject.Builder.class
)
public final class SubscriptionUpdateInputObject {
  private final Optional<String> name;

  private final Optional<String> subscriptionAt;

  private int _cachedHashCode;

  SubscriptionUpdateInputObject(Optional<String> name, Optional<String> subscriptionAt) {
    this.name = name;
    this.subscriptionAt = subscriptionAt;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("subscription_at")
  public Optional<String> getSubscriptionAt() {
    return subscriptionAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SubscriptionUpdateInputObject && equalTo((SubscriptionUpdateInputObject) other);
  }

  private boolean equalTo(SubscriptionUpdateInputObject other) {
    return name.equals(other.name) && subscriptionAt.equals(other.subscriptionAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.subscriptionAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SubscriptionUpdateInputObject{" + "name: " + name + ", subscriptionAt: " + subscriptionAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<String> subscriptionAt = Optional.empty();

    private Builder() {
    }

    public Builder from(SubscriptionUpdateInputObject other) {
      name(other.getName());
      subscriptionAt(other.getSubscriptionAt());
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "subscription_at",
        nulls = Nulls.SKIP
    )
    public Builder subscriptionAt(Optional<String> subscriptionAt) {
      this.subscriptionAt = subscriptionAt;
      return this;
    }

    public Builder subscriptionAt(String subscriptionAt) {
      this.subscriptionAt = Optional.of(subscriptionAt);
      return this;
    }

    public SubscriptionUpdateInputObject build() {
      return new SubscriptionUpdateInputObject(name, subscriptionAt);
    }
  }
}
