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
    builder = Event.Builder.class
)
public final class Event {
  private final Optional<EventObject> event;

  private int _cachedHashCode;

  Event(Optional<EventObject> event) {
    this.event = event;
  }

  @JsonProperty("event")
  public Optional<EventObject> getEvent() {
    return event;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Event && equalTo((Event) other);
  }

  private boolean equalTo(Event other) {
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
    return "Event{" + "event: " + event + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<EventObject> event = Optional.empty();

    private Builder() {
    }

    public Builder from(Event other) {
      event(other.getEvent());
      return this;
    }

    @JsonSetter(
        value = "event",
        nulls = Nulls.SKIP
    )
    public Builder event(Optional<EventObject> event) {
      this.event = event;
      return this;
    }

    public Builder event(EventObject event) {
      this.event = Optional.of(event);
      return this;
    }

    public Event build() {
      return new Event(event);
    }
  }
}
