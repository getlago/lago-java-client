package com.lago.api.client.events.types;

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
    builder = BatchEventInput.Builder.class
)
public final class BatchEventInput {
  private final Optional<BatchEventInputObject> event;

  private int _cachedHashCode;

  BatchEventInput(Optional<BatchEventInputObject> event) {
    this.event = event;
  }

  @JsonProperty("event")
  public Optional<BatchEventInputObject> getEvent() {
    return event;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BatchEventInput && equalTo((BatchEventInput) other);
  }

  private boolean equalTo(BatchEventInput other) {
    return event.equals(other.event);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.event);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BatchEventInput{" + "event: " + event + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<BatchEventInputObject> event = Optional.empty();

    private Builder() {
    }

    public Builder from(BatchEventInput other) {
      event(other.getEvent());
      return this;
    }

    @JsonSetter(
        value = "event",
        nulls = Nulls.SKIP
    )
    public Builder event(Optional<BatchEventInputObject> event) {
      this.event = event;
      return this;
    }

    public Builder event(BatchEventInputObject event) {
      this.event = Optional.of(event);
      return this;
    }

    public BatchEventInput build() {
      return new BatchEventInput(event);
    }
  }
}
