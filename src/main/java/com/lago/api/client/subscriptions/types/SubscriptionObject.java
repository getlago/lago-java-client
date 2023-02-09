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
    builder = SubscriptionObject.Builder.class
)
public final class SubscriptionObject {
  private final Optional<String> lagoId;

  private final Optional<String> externalId;

  private final Optional<String> lagoCustomerId;

  private final Optional<String> externalCustomerId;

  private final Optional<String> name;

  private final Optional<String> planCode;

  private final Optional<SubscriptionStatus> status;

  private final Optional<BillingTime> billingTime;

  private final Optional<String> subscriptionAt;

  private final Optional<String> startedAt;

  private final Optional<String> terminatedAt;

  private final Optional<String> canceledAt;

  private final Optional<String> createdAt;

  private final Optional<String> previousPlanCode;

  private final Optional<String> nextPlanCode;

  private final Optional<String> downgradePlanDate;

  private int _cachedHashCode;

  SubscriptionObject(Optional<String> lagoId, Optional<String> externalId,
      Optional<String> lagoCustomerId, Optional<String> externalCustomerId, Optional<String> name,
      Optional<String> planCode, Optional<SubscriptionStatus> status,
      Optional<BillingTime> billingTime, Optional<String> subscriptionAt,
      Optional<String> startedAt, Optional<String> terminatedAt, Optional<String> canceledAt,
      Optional<String> createdAt, Optional<String> previousPlanCode, Optional<String> nextPlanCode,
      Optional<String> downgradePlanDate) {
    this.lagoId = lagoId;
    this.externalId = externalId;
    this.lagoCustomerId = lagoCustomerId;
    this.externalCustomerId = externalCustomerId;
    this.name = name;
    this.planCode = planCode;
    this.status = status;
    this.billingTime = billingTime;
    this.subscriptionAt = subscriptionAt;
    this.startedAt = startedAt;
    this.terminatedAt = terminatedAt;
    this.canceledAt = canceledAt;
    this.createdAt = createdAt;
    this.previousPlanCode = previousPlanCode;
    this.nextPlanCode = nextPlanCode;
    this.downgradePlanDate = downgradePlanDate;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("external_id")
  public Optional<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("lago_customer_id")
  public Optional<String> getLagoCustomerId() {
    return lagoCustomerId;
  }

  @JsonProperty("external_customer_id")
  public Optional<String> getExternalCustomerId() {
    return externalCustomerId;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("plan_code")
  public Optional<String> getPlanCode() {
    return planCode;
  }

  @JsonProperty("status")
  public Optional<SubscriptionStatus> getStatus() {
    return status;
  }

  @JsonProperty("billing_time")
  public Optional<BillingTime> getBillingTime() {
    return billingTime;
  }

  @JsonProperty("subscription_at")
  public Optional<String> getSubscriptionAt() {
    return subscriptionAt;
  }

  @JsonProperty("started_at")
  public Optional<String> getStartedAt() {
    return startedAt;
  }

  @JsonProperty("terminated_at")
  public Optional<String> getTerminatedAt() {
    return terminatedAt;
  }

  @JsonProperty("canceled_at")
  public Optional<String> getCanceledAt() {
    return canceledAt;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("previous_plan_code")
  public Optional<String> getPreviousPlanCode() {
    return previousPlanCode;
  }

  @JsonProperty("next_plan_code")
  public Optional<String> getNextPlanCode() {
    return nextPlanCode;
  }

  @JsonProperty("downgrade_plan_date")
  public Optional<String> getDowngradePlanDate() {
    return downgradePlanDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SubscriptionObject && equalTo((SubscriptionObject) other);
  }

  private boolean equalTo(SubscriptionObject other) {
    return lagoId.equals(other.lagoId) && externalId.equals(other.externalId) && lagoCustomerId.equals(other.lagoCustomerId) && externalCustomerId.equals(other.externalCustomerId) && name.equals(other.name) && planCode.equals(other.planCode) && status.equals(other.status) && billingTime.equals(other.billingTime) && subscriptionAt.equals(other.subscriptionAt) && startedAt.equals(other.startedAt) && terminatedAt.equals(other.terminatedAt) && canceledAt.equals(other.canceledAt) && createdAt.equals(other.createdAt) && previousPlanCode.equals(other.previousPlanCode) && nextPlanCode.equals(other.nextPlanCode) && downgradePlanDate.equals(other.downgradePlanDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.externalId, this.lagoCustomerId, this.externalCustomerId, this.name, this.planCode, this.status, this.billingTime, this.subscriptionAt, this.startedAt, this.terminatedAt, this.canceledAt, this.createdAt, this.previousPlanCode, this.nextPlanCode, this.downgradePlanDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SubscriptionObject{" + "lagoId: " + lagoId + ", externalId: " + externalId + ", lagoCustomerId: " + lagoCustomerId + ", externalCustomerId: " + externalCustomerId + ", name: " + name + ", planCode: " + planCode + ", status: " + status + ", billingTime: " + billingTime + ", subscriptionAt: " + subscriptionAt + ", startedAt: " + startedAt + ", terminatedAt: " + terminatedAt + ", canceledAt: " + canceledAt + ", createdAt: " + createdAt + ", previousPlanCode: " + previousPlanCode + ", nextPlanCode: " + nextPlanCode + ", downgradePlanDate: " + downgradePlanDate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> lagoCustomerId = Optional.empty();

    private Optional<String> externalCustomerId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> planCode = Optional.empty();

    private Optional<SubscriptionStatus> status = Optional.empty();

    private Optional<BillingTime> billingTime = Optional.empty();

    private Optional<String> subscriptionAt = Optional.empty();

    private Optional<String> startedAt = Optional.empty();

    private Optional<String> terminatedAt = Optional.empty();

    private Optional<String> canceledAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> previousPlanCode = Optional.empty();

    private Optional<String> nextPlanCode = Optional.empty();

    private Optional<String> downgradePlanDate = Optional.empty();

    private Builder() {
    }

    public Builder from(SubscriptionObject other) {
      lagoId(other.getLagoId());
      externalId(other.getExternalId());
      lagoCustomerId(other.getLagoCustomerId());
      externalCustomerId(other.getExternalCustomerId());
      name(other.getName());
      planCode(other.getPlanCode());
      status(other.getStatus());
      billingTime(other.getBillingTime());
      subscriptionAt(other.getSubscriptionAt());
      startedAt(other.getStartedAt());
      terminatedAt(other.getTerminatedAt());
      canceledAt(other.getCanceledAt());
      createdAt(other.getCreatedAt());
      previousPlanCode(other.getPreviousPlanCode());
      nextPlanCode(other.getNextPlanCode());
      downgradePlanDate(other.getDowngradePlanDate());
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
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<SubscriptionStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(SubscriptionStatus status) {
      this.status = Optional.of(status);
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

    @JsonSetter(
        value = "started_at",
        nulls = Nulls.SKIP
    )
    public Builder startedAt(Optional<String> startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    public Builder startedAt(String startedAt) {
      this.startedAt = Optional.of(startedAt);
      return this;
    }

    @JsonSetter(
        value = "terminated_at",
        nulls = Nulls.SKIP
    )
    public Builder terminatedAt(Optional<String> terminatedAt) {
      this.terminatedAt = terminatedAt;
      return this;
    }

    public Builder terminatedAt(String terminatedAt) {
      this.terminatedAt = Optional.of(terminatedAt);
      return this;
    }

    @JsonSetter(
        value = "canceled_at",
        nulls = Nulls.SKIP
    )
    public Builder canceledAt(Optional<String> canceledAt) {
      this.canceledAt = canceledAt;
      return this;
    }

    public Builder canceledAt(String canceledAt) {
      this.canceledAt = Optional.of(canceledAt);
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

    @JsonSetter(
        value = "previous_plan_code",
        nulls = Nulls.SKIP
    )
    public Builder previousPlanCode(Optional<String> previousPlanCode) {
      this.previousPlanCode = previousPlanCode;
      return this;
    }

    public Builder previousPlanCode(String previousPlanCode) {
      this.previousPlanCode = Optional.of(previousPlanCode);
      return this;
    }

    @JsonSetter(
        value = "next_plan_code",
        nulls = Nulls.SKIP
    )
    public Builder nextPlanCode(Optional<String> nextPlanCode) {
      this.nextPlanCode = nextPlanCode;
      return this;
    }

    public Builder nextPlanCode(String nextPlanCode) {
      this.nextPlanCode = Optional.of(nextPlanCode);
      return this;
    }

    @JsonSetter(
        value = "downgrade_plan_date",
        nulls = Nulls.SKIP
    )
    public Builder downgradePlanDate(Optional<String> downgradePlanDate) {
      this.downgradePlanDate = downgradePlanDate;
      return this;
    }

    public Builder downgradePlanDate(String downgradePlanDate) {
      this.downgradePlanDate = Optional.of(downgradePlanDate);
      return this;
    }

    public SubscriptionObject build() {
      return new SubscriptionObject(lagoId, externalId, lagoCustomerId, externalCustomerId, name, planCode, status, billingTime, subscriptionAt, startedAt, terminatedAt, canceledAt, createdAt, previousPlanCode, nextPlanCode, downgradePlanDate);
    }
  }
}
