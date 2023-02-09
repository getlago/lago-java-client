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
    builder = CreditNoteInput.Builder.class
)
public final class CreditNoteInput {
  private final Optional<CreditNoteInputObject> creditNote;

  private int _cachedHashCode;

  CreditNoteInput(Optional<CreditNoteInputObject> creditNote) {
    this.creditNote = creditNote;
  }

  @JsonProperty("credit_note")
  public Optional<CreditNoteInputObject> getCreditNote() {
    return creditNote;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreditNoteInput && equalTo((CreditNoteInput) other);
  }

  private boolean equalTo(CreditNoteInput other) {
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
    return "CreditNoteInput{" + "creditNote: " + creditNote + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<CreditNoteInputObject> creditNote = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditNoteInput other) {
      creditNote(other.getCreditNote());
      return this;
    }

    @JsonSetter(
        value = "credit_note",
        nulls = Nulls.SKIP
    )
    public Builder creditNote(Optional<CreditNoteInputObject> creditNote) {
      this.creditNote = creditNote;
      return this;
    }

    public Builder creditNote(CreditNoteInputObject creditNote) {
      this.creditNote = Optional.of(creditNote);
      return this;
    }

    public CreditNoteInput build() {
      return new CreditNoteInput(creditNote);
    }
  }
}
