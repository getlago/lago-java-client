package com.lago.api.client.organizations.types;

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
    builder = OrganizationInput.Builder.class
)
public final class OrganizationInput {
  private final Optional<OrganizationInputObject> organization;

  private int _cachedHashCode;

  OrganizationInput(Optional<OrganizationInputObject> organization) {
    this.organization = organization;
  }

  @JsonProperty("organization")
  public Optional<OrganizationInputObject> getOrganization() {
    return organization;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OrganizationInput && equalTo((OrganizationInput) other);
  }

  private boolean equalTo(OrganizationInput other) {
    return organization.equals(other.organization);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.organization);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OrganizationInput{" + "organization: " + organization + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<OrganizationInputObject> organization = Optional.empty();

    private Builder() {
    }

    public Builder from(OrganizationInput other) {
      organization(other.getOrganization());
      return this;
    }

    @JsonSetter(
        value = "organization",
        nulls = Nulls.SKIP
    )
    public Builder organization(Optional<OrganizationInputObject> organization) {
      this.organization = organization;
      return this;
    }

    public Builder organization(OrganizationInputObject organization) {
      this.organization = Optional.of(organization);
      return this;
    }

    public OrganizationInput build() {
      return new OrganizationInput(organization);
    }
  }
}
