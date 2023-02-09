package com.lago.api.client.plans.types;

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
    builder = Plans.Builder.class
)
public final class Plans {
  private final Optional<List<PlanObject>> plans;

  private int _cachedHashCode;

  Plans(Optional<List<PlanObject>> plans) {
    this.plans = plans;
  }

  @JsonProperty("plans")
  public Optional<List<PlanObject>> getPlans() {
    return plans;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Plans && equalTo((Plans) other);
  }

  private boolean equalTo(Plans other) {
    return plans.equals(other.plans);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.plans);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Plans{" + "plans: " + plans + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<PlanObject>> plans = Optional.empty();

    private Builder() {
    }

    public Builder from(Plans other) {
      plans(other.getPlans());
      return this;
    }

    @JsonSetter(
        value = "plans",
        nulls = Nulls.SKIP
    )
    public Builder plans(Optional<List<PlanObject>> plans) {
      this.plans = plans;
      return this;
    }

    public Builder plans(List<PlanObject> plans) {
      this.plans = Optional.of(plans);
      return this;
    }

    public Plans build() {
      return new Plans(plans);
    }
  }
}
