package com.lago.api.client.plans.types;

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
    builder = Plan.Builder.class
)
public final class Plan {
  private final Optional<PlanObject> plan;

  private int _cachedHashCode;

  Plan(Optional<PlanObject> plan) {
    this.plan = plan;
  }

  @JsonProperty("plan")
  public Optional<PlanObject> getPlan() {
    return plan;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Plan && equalTo((Plan) other);
  }

  private boolean equalTo(Plan other) {
    return plan.equals(other.plan);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.plan);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Plan{" + "plan: " + plan + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<PlanObject> plan = Optional.empty();

    private Builder() {
    }

    public Builder from(Plan other) {
      plan(other.getPlan());
      return this;
    }

    @JsonSetter(
        value = "plan",
        nulls = Nulls.SKIP
    )
    public Builder plan(Optional<PlanObject> plan) {
      this.plan = plan;
      return this;
    }

    public Builder plan(PlanObject plan) {
      this.plan = Optional.of(plan);
      return this;
    }

    public Plan build() {
      return new Plan(plan);
    }
  }
}
