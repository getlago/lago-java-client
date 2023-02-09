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
    builder = SubscriptionUpdateInput.Builder.class
)
public final class SubscriptionUpdateInput {
  private final Optional<SubscriptionUpdateInputObject> subscription;

  private int _cachedHashCode;

  SubscriptionUpdateInput(Optional<SubscriptionUpdateInputObject> subscription) {
    this.subscription = subscription;
  }

  @JsonProperty("subscription")
  public Optional<SubscriptionUpdateInputObject> getSubscription() {
    return subscription;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SubscriptionUpdateInput && equalTo((SubscriptionUpdateInput) other);
  }

  private boolean equalTo(SubscriptionUpdateInput other) {
    return subscription.equals(other.subscription);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.subscription);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SubscriptionUpdateInput{" + "subscription: " + subscription + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SubscriptionUpdateInputObject> subscription = Optional.empty();

    private Builder() {
    }

    public Builder from(SubscriptionUpdateInput other) {
      subscription(other.getSubscription());
      return this;
    }

    @JsonSetter(
        value = "subscription",
        nulls = Nulls.SKIP
    )
    public Builder subscription(Optional<SubscriptionUpdateInputObject> subscription) {
      this.subscription = subscription;
      return this;
    }

    public Builder subscription(SubscriptionUpdateInputObject subscription) {
      this.subscription = Optional.of(subscription);
      return this;
    }

    public SubscriptionUpdateInput build() {
      return new SubscriptionUpdateInput(subscription);
    }
  }
}
