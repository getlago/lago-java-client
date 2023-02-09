package com.lago.api.client.credit.notes.types;

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
    builder = CreditNote.Builder.class
)
public final class CreditNote {
  private final Optional<CreditNoteObject> creditNote;

  private int _cachedHashCode;

  CreditNote(Optional<CreditNoteObject> creditNote) {
    this.creditNote = creditNote;
  }

  @JsonProperty("credit_note")
  public Optional<CreditNoteObject> getCreditNote() {
    return creditNote;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreditNote && equalTo((CreditNote) other);
  }

  private boolean equalTo(CreditNote other) {
    return creditNote.equals(other.creditNote);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creditNote);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreditNote{" + "creditNote: " + creditNote + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<CreditNoteObject> creditNote = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditNote other) {
      creditNote(other.getCreditNote());
      return this;
    }

    @JsonSetter(
        value = "credit_note",
        nulls = Nulls.SKIP
    )
    public Builder creditNote(Optional<CreditNoteObject> creditNote) {
      this.creditNote = creditNote;
      return this;
    }

    public Builder creditNote(CreditNoteObject creditNote) {
      this.creditNote = Optional.of(creditNote);
      return this;
    }

    public CreditNote build() {
      return new CreditNote(creditNote);
    }
  }
}
