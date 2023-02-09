package com.lago.api.client.credit.notes.types;

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
    builder = CreditNotes.Builder.class
)
public final class CreditNotes {
  private final Optional<List<CreditNoteObject>> creditNotes;

  private int _cachedHashCode;

  CreditNotes(Optional<List<CreditNoteObject>> creditNotes) {
    this.creditNotes = creditNotes;
  }

  @JsonProperty("credit_notes")
  public Optional<List<CreditNoteObject>> getCreditNotes() {
    return creditNotes;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreditNotes && equalTo((CreditNotes) other);
  }

  private boolean equalTo(CreditNotes other) {
    return creditNotes.equals(other.creditNotes);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creditNotes);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreditNotes{" + "creditNotes: " + creditNotes + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<CreditNoteObject>> creditNotes = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditNotes other) {
      creditNotes(other.getCreditNotes());
      return this;
    }

    @JsonSetter(
        value = "credit_notes",
        nulls = Nulls.SKIP
    )
    public Builder creditNotes(Optional<List<CreditNoteObject>> creditNotes) {
      this.creditNotes = creditNotes;
      return this;
    }

    public Builder creditNotes(List<CreditNoteObject> creditNotes) {
      this.creditNotes = Optional.of(creditNotes);
      return this;
    }

    public CreditNotes build() {
      return new CreditNotes(creditNotes);
    }
  }
}
