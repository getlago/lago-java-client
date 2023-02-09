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
    builder = SubscriptionCreateInput.Builder.class
)
public final class SubscriptionCreateInput {
  private final Optional<SubscriptionCreateInputObject> subscription;

  private int _cachedHashCode;

  SubscriptionCreateInput(Optional<SubscriptionCreateInputObject> subscription) {
    this.subscription = subscription;
  }

  @JsonProperty("subscription")
  public Optional<SubscriptionCreateInputObject> getSubscription() {
    return subscription;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SubscriptionCreateInput && equalTo((SubscriptionCreateInput) other);
  }

  private boolean equalTo(SubscriptionCreateInput other) {
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
    return "SubscriptionCreateInput{" + "subscription: " + subscription + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SubscriptionCreateInputObject> subscription = Optional.empty();

    private Builder() {
    }

    public Builder from(SubscriptionCreateInput other) {
      subscription(other.getSubscription());
      return this;
    }

    @JsonSetter(
        value = "subscription",
        nulls = Nulls.SKIP
    )
    public Builder subscription(Optional<SubscriptionCreateInputObject> subscription) {
      this.subscription = subscription;
      return this;
    }

    public Builder subscription(SubscriptionCreateInputObject subscription) {
      this.subscription = Optional.of(subscription);
      return this;
    }

    public SubscriptionCreateInput build() {
      return new SubscriptionCreateInput(subscription);
    }
  }
}
