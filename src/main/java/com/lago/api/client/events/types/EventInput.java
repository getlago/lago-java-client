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
    builder = EventInput.Builder.class
)
public final class EventInput {
  private final Optional<EventInputObject> event;

  private int _cachedHashCode;

  EventInput(Optional<EventInputObject> event) {
    this.event = event;
  }

  @JsonProperty("event")
  public Optional<EventInputObject> getEvent() {
    return event;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EventInput && equalTo((EventInput) other);
  }

  private boolean equalTo(EventInput other) {
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
    return "EventInput{" + "event: " + event + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<EventInputObject> event = Optional.empty();

    private Builder() {
    }

    public Builder from(EventInput other) {
      event(other.getEvent());
      return this;
    }

    @JsonSetter(
        value = "event",
        nulls = Nulls.SKIP
    )
    public Builder event(Optional<EventInputObject> event) {
      this.event = event;
      return this;
    }

    public Builder event(EventInputObject event) {
      this.event = Optional.of(event);
      return this;
    }

    public EventInput build() {
      return new EventInput(event);
    }
  }
}
