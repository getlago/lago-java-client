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
    builder = Organization.Builder.class
)
public final class Organization {
  private final Optional<OrganizationObject> organization;

  private int _cachedHashCode;

  Organization(Optional<OrganizationObject> organization) {
    this.organization = organization;
  }

  @JsonProperty("organization")
  public Optional<OrganizationObject> getOrganization() {
    return organization;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Organization && equalTo((Organization) other);
  }

  private boolean equalTo(Organization other) {
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
    return "Organization{" + "organization: " + organization + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<OrganizationObject> organization = Optional.empty();

    private Builder() {
    }

    public Builder from(Organization other) {
      organization(other.getOrganization());
      return this;
    }

    @JsonSetter(
        value = "organization",
        nulls = Nulls.SKIP
    )
    public Builder organization(Optional<OrganizationObject> organization) {
      this.organization = organization;
      return this;
    }

    public Builder organization(OrganizationObject organization) {
      this.organization = Optional.of(organization);
      return this;
    }

    public Organization build() {
      return new Organization(organization);
    }
  }
}
