package com.lago.api.client.add.ons.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AddOnObject.Builder.class
)
public final class AddOnObject {
  private final Optional<String> lagoId;

  private final Optional<String> name;

  private final Optional<String> code;

  private final Optional<String> description;

  private final Optional<String> createdAt;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private int _cachedHashCode;

  AddOnObject(Optional<String> lagoId, Optional<String> name, Optional<String> code,
      Optional<String> description, Optional<String> createdAt, Optional<Integer> amountCents,
      Optional<String> amountCurrency) {
    this.lagoId = lagoId;
    this.name = name;
    this.code = code;
    this.description = description;
    this.createdAt = createdAt;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AddOnObject && equalTo((AddOnObject) other);
  }

  private boolean equalTo(AddOnObject other) {
    return lagoId.equals(other.lagoId) && name.equals(other.name) && code.equals(other.code) && description.equals(other.description) && createdAt.equals(other.createdAt) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.name, this.code, this.description, this.createdAt, this.amountCents, this.amountCurrency);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AddOnObject{" + "lagoId: " + lagoId + ", name: " + name + ", code: " + code + ", description: " + description + ", createdAt: " + createdAt + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Builder() {
    }

    public Builder from(AddOnObject other) {
      lagoId(other.getLagoId());
      name(other.getName());
      code(other.getCode());
      description(other.getDescription());
      createdAt(other.getCreatedAt());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
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
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
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
        value = "amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder amountCents(Optional<Integer> amountCents) {
      this.amountCents = amountCents;
      return this;
    }

    public Builder amountCents(Integer amountCents) {
      this.amountCents = Optional.of(amountCents);
      return this;
    }

    @JsonSetter(
        value = "amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder amountCurrency(Optional<String> amountCurrency) {
      this.amountCurrency = amountCurrency;
      return this;
    }

    public Builder amountCurrency(String amountCurrency) {
      this.amountCurrency = Optional.of(amountCurrency);
      return this;
    }

    public AddOnObject build() {
      return new AddOnObject(lagoId, name, code, description, createdAt, amountCents, amountCurrency);
    }
  }
}
