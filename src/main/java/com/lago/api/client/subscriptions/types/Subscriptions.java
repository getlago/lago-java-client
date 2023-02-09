package com.lago.api.client.subscriptions.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Subscriptions.Builder.class
)
public final class Subscriptions {
  private final Optional<List<SubscriptionObject>> subscriptions;

  private int _cachedHashCode;

  Subscriptions(Optional<List<SubscriptionObject>> subscriptions) {
    this.subscriptions = subscriptions;
  }

  @JsonProperty("subscriptions")
  public Optional<List<SubscriptionObject>> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Subscriptions && equalTo((Subscriptions) other);
  }

  private boolean equalTo(Subscriptions other) {
    return subscriptions.equals(other.subscriptions);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.subscriptions);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Subscriptions{" + "subscriptions: " + subscriptions + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<SubscriptionObject>> subscriptions = Optional.empty();

    private Builder() {
    }

    public Builder from(Subscriptions other) {
      subscriptions(other.getSubscriptions());
      return this;
    }

    @JsonSetter(
        value = "subscriptions",
        nulls = Nulls.SKIP
    )
    public Builder subscriptions(Optional<List<SubscriptionObject>> subscriptions) {
      this.subscriptions = subscriptions;
      return this;
    }

    public Builder subscriptions(List<SubscriptionObject> subscriptions) {
      this.subscriptions = Optional.of(subscriptions);
      return this;
    }

    public Subscriptions build() {
      return new Subscriptions(subscriptions);
    }
  }
}
