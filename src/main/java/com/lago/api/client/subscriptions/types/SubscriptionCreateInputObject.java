package com.lago.api.client.subscriptions.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lago.api.client.commons.types.BillingTime;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SubscriptionCreateInputObject.Builder.class
)
public final class SubscriptionCreateInputObject {
  private final Optional<String> externalCustomerId;

  private final Optional<String> planCode;

  private final Optional<String> name;

  private final Optional<String> externalId;

  private final Optional<BillingTime> billingTime;

  private final Optional<String> subscriptionAt;

  private int _cachedHashCode;

  SubscriptionCreateInputObject(Optional<String> externalCustomerId, Optional<String> planCode,
      Optional<String> name, Optional<String> externalId, Optional<BillingTime> billingTime,
      Optional<String> subscriptionAt) {
    this.externalCustomerId = externalCustomerId;
    this.planCode = planCode;
    this.name = name;
    this.externalId = externalId;
    this.billingTime = billingTime;
    this.subscriptionAt = subscriptionAt;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("plan_code")
  public Optional<String> getPlanCode() {
    return planCode;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("external_id")
  public Optional<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("billing_time")
  public Optional<BillingTime> getBillingTime() {
    return billingTime;
  }

  @JsonProperty("subscription_at")
  public Optional<String> getSubscriptionAt() {
    return subscriptionAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SubscriptionCreateInputObject && equalTo((SubscriptionCreateInputObject) other);
  }

  private boolean equalTo(SubscriptionCreateInputObject other) {
    return externalCustomerId.equals(other.externalCustomerId) && planCode.equals(other.planCode) && name.equals(other.name) && externalId.equals(other.externalId) && billingTime.equals(other.billingTime) && subscriptionAt.equals(other.subscriptionAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.externalCustomerId, this.planCode, this.name, this.externalId, this.billingTime, this.subscriptionAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SubscriptionCreateInputObject{" + "externalCustomerId: " + externalCustomerId + ", planCode: " + planCode + ", name: " + name + ", externalId: " + externalId + ", billingTime: " + billingTime + ", subscriptionAt: " + subscriptionAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<String> planCode = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<BillingTime> billingTime = Optional.empty();

    private Optional<String> subscriptionAt = Optional.empty();

    private Builder() {
    }

    public Builder from(SubscriptionCreateInputObject other) {
      externalCustomerId(other.getExternalCustomerId());
      planCode(other.getPlanCode());
      name(other.getName());
      externalId(other.getExternalId());
      billingTime(other.getBillingTime());
      subscriptionAt(other.getSubscriptionAt());
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
        value = "plan_code",
        nulls = Nulls.SKIP
    )
    public Builder planCode(Optional<String> planCode) {
      this.planCode = planCode;
      return this;
    }

    public Builder planCode(String planCode) {
      this.planCode = Optional.of(planCode);
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
        value = "external_id",
        nulls = Nulls.SKIP
    )
    public Builder externalId(Optional<String> externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder externalId(String externalId) {
      this.externalId = Optional.of(externalId);
      return this;
    }

    @JsonSetter(
        value = "billing_time",
        nulls = Nulls.SKIP
    )
    public Builder billingTime(Optional<BillingTime> billingTime) {
      this.billingTime = billingTime;
      return this;
    }

    public Builder billingTime(BillingTime billingTime) {
      this.billingTime = Optional.of(billingTime);
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

    public SubscriptionCreateInputObject build() {
      return new SubscriptionCreateInputObject(externalCustomerId, planCode, name, externalId, billingTime, subscriptionAt);
    }
  }
}
