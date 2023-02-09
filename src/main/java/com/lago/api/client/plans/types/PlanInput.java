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
    builder = PlanInput.Builder.class
)
public final class PlanInput {
  private final Optional<PlanInputObject> plan;

  private int _cachedHashCode;

  PlanInput(Optional<PlanInputObject> plan) {
    this.plan = plan;
  }

  @JsonProperty("plan")
  public Optional<PlanInputObject> getPlan() {
    return plan;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PlanInput && equalTo((PlanInput) other);
  }

  private boolean equalTo(PlanInput other) {
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
    return "PlanInput{" + "plan: " + plan + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<PlanInputObject> plan = Optional.empty();

    private Builder() {
    }

    public Builder from(PlanInput other) {
      plan(other.getPlan());
      return this;
    }

    @JsonSetter(
        value = "plan",
        nulls = Nulls.SKIP
    )
    public Builder plan(Optional<PlanInputObject> plan) {
      this.plan = plan;
      return this;
    }

    public Builder plan(PlanInputObject plan) {
      this.plan = Optional.of(plan);
      return this;
    }

    public PlanInput build() {
      return new PlanInput(plan);
    }
  }
}
