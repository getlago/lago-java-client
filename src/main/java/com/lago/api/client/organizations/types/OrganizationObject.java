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
    builder = OrganizationObject.Builder.class
)
public final class OrganizationObject {
  private final Optional<String> lagoId;

  private final Optional<String> name;

  private final Optional<String> createdAt;

  private final Optional<String> webhookUrl;

  private final Optional<String> country;

  private final Optional<String> addressLine1;

  private final Optional<String> addressLine2;

  private final Optional<String> state;

  private final Optional<String> zipode;

  private final Optional<String> email;

  private final Optional<String> city;

  private final Optional<String> legalName;

  private final Optional<String> legalNumber;

  private final Optional<String> timezone;

  private final Optional<BillingConfigurationOrganization> billingConfiguration;

  private int _cachedHashCode;

  OrganizationObject(Optional<String> lagoId, Optional<String> name, Optional<String> createdAt,
      Optional<String> webhookUrl, Optional<String> country, Optional<String> addressLine1,
      Optional<String> addressLine2, Optional<String> state, Optional<String> zipode,
      Optional<String> email, Optional<String> city, Optional<String> legalName,
      Optional<String> legalNumber, Optional<String> timezone,
      Optional<BillingConfigurationOrganization> billingConfiguration) {
    this.lagoId = lagoId;
    this.name = name;
    this.createdAt = createdAt;
    this.webhookUrl = webhookUrl;
    this.country = country;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.state = state;
    this.zipode = zipode;
    this.email = email;
    this.city = city;
    this.legalName = legalName;
    this.legalNumber = legalNumber;
    this.timezone = timezone;
    this.billingConfiguration = billingConfiguration;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("webhook_url")
  public Optional<String> getWebhookUrl() {
    return webhookUrl;
  }

  @JsonProperty("country")
  public Optional<String> getCountry() {
    return country;
  }

  @JsonProperty("address_line1")
  public Optional<String> getAddressLine1() {
    return addressLine1;
  }

  @JsonProperty("address_line2")
  public Optional<String> getAddressLine2() {
    return addressLine2;
  }

  @JsonProperty("state")
  public Optional<String> getState() {
    return state;
  }

  @JsonProperty("zipode")
  public Optional<String> getZipode() {
    return zipode;
  }

  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @JsonProperty("city")
  public Optional<String> getCity() {
    return city;
  }

  @JsonProperty("legal_name")
  public Optional<String> getLegalName() {
    return legalName;
  }

  @JsonProperty("legal_number")
  public Optional<String> getLegalNumber() {
    return legalNumber;
  }

  @JsonProperty("timezone")
  public Optional<String> getTimezone() {
    return timezone;
  }

  @JsonProperty("billing_configuration")
  public Optional<BillingConfigurationOrganization> getBillingConfiguration() {
    return billingConfiguration;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OrganizationObject && equalTo((OrganizationObject) other);
  }

  private boolean equalTo(OrganizationObject other) {
    return lagoId.equals(other.lagoId) && name.equals(other.name) && createdAt.equals(other.createdAt) && webhookUrl.equals(other.webhookUrl) && country.equals(other.country) && addressLine1.equals(other.addressLine1) && addressLine2.equals(other.addressLine2) && state.equals(other.state) && zipode.equals(other.zipode) && email.equals(other.email) && city.equals(other.city) && legalName.equals(other.legalName) && legalNumber.equals(other.legalNumber) && timezone.equals(other.timezone) && billingConfiguration.equals(other.billingConfiguration);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.name, this.createdAt, this.webhookUrl, this.country, this.addressLine1, this.addressLine2, this.state, this.zipode, this.email, this.city, this.legalName, this.legalNumber, this.timezone, this.billingConfiguration);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OrganizationObject{" + "lagoId: " + lagoId + ", name: " + name + ", createdAt: " + createdAt + ", webhookUrl: " + webhookUrl + ", country: " + country + ", addressLine1: " + addressLine1 + ", addressLine2: " + addressLine2 + ", state: " + state + ", zipode: " + zipode + ", email: " + email + ", city: " + city + ", legalName: " + legalName + ", legalNumber: " + legalNumber + ", timezone: " + timezone + ", billingConfiguration: " + billingConfiguration + "}";
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

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> webhookUrl = Optional.empty();

    private Optional<String> country = Optional.empty();

    private Optional<String> addressLine1 = Optional.empty();

    private Optional<String> addressLine2 = Optional.empty();

    private Optional<String> state = Optional.empty();

    private Optional<String> zipode = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> city = Optional.empty();

    private Optional<String> legalName = Optional.empty();

    private Optional<String> legalNumber = Optional.empty();

    private Optional<String> timezone = Optional.empty();

    private Optional<BillingConfigurationOrganization> billingConfiguration = Optional.empty();

    private Builder() {
    }

    public Builder from(OrganizationObject other) {
      lagoId(other.getLagoId());
      name(other.getName());
      createdAt(other.getCreatedAt());
      webhookUrl(other.getWebhookUrl());
      country(other.getCountry());
      addressLine1(other.getAddressLine1());
      addressLine2(other.getAddressLine2());
      state(other.getState());
      zipode(other.getZipode());
      email(other.getEmail());
      city(other.getCity());
      legalName(other.getLegalName());
      legalNumber(other.getLegalNumber());
      timezone(other.getTimezone());
      billingConfiguration(other.getBillingConfiguration());
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
        value = "webhook_url",
        nulls = Nulls.SKIP
    )
    public Builder webhookUrl(Optional<String> webhookUrl) {
      this.webhookUrl = webhookUrl;
      return this;
    }

    public Builder webhookUrl(String webhookUrl) {
      this.webhookUrl = Optional.of(webhookUrl);
      return this;
    }

    @JsonSetter(
        value = "country",
        nulls = Nulls.SKIP
    )
    public Builder country(Optional<String> country) {
      this.country = country;
      return this;
    }

    public Builder country(String country) {
      this.country = Optional.of(country);
      return this;
    }

    @JsonSetter(
        value = "address_line1",
        nulls = Nulls.SKIP
    )
    public Builder addressLine1(Optional<String> addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    public Builder addressLine1(String addressLine1) {
      this.addressLine1 = Optional.of(addressLine1);
      return this;
    }

    @JsonSetter(
        value = "address_line2",
        nulls = Nulls.SKIP
    )
    public Builder addressLine2(Optional<String> addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    public Builder addressLine2(String addressLine2) {
      this.addressLine2 = Optional.of(addressLine2);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<String> state) {
      this.state = state;
      return this;
    }

    public Builder state(String state) {
      this.state = Optional.of(state);
      return this;
    }

    @JsonSetter(
        value = "zipode",
        nulls = Nulls.SKIP
    )
    public Builder zipode(Optional<String> zipode) {
      this.zipode = zipode;
      return this;
    }

    public Builder zipode(String zipode) {
      this.zipode = Optional.of(zipode);
      return this;
    }

    @JsonSetter(
        value = "email",
        nulls = Nulls.SKIP
    )
    public Builder email(Optional<String> email) {
      this.email = email;
      return this;
    }

    public Builder email(String email) {
      this.email = Optional.of(email);
      return this;
    }

    @JsonSetter(
        value = "city",
        nulls = Nulls.SKIP
    )
    public Builder city(Optional<String> city) {
      this.city = city;
      return this;
    }

    public Builder city(String city) {
      this.city = Optional.of(city);
      return this;
    }

    @JsonSetter(
        value = "legal_name",
        nulls = Nulls.SKIP
    )
    public Builder legalName(Optional<String> legalName) {
      this.legalName = legalName;
      return this;
    }

    public Builder legalName(String legalName) {
      this.legalName = Optional.of(legalName);
      return this;
    }

    @JsonSetter(
        value = "legal_number",
        nulls = Nulls.SKIP
    )
    public Builder legalNumber(Optional<String> legalNumber) {
      this.legalNumber = legalNumber;
      return this;
    }

    public Builder legalNumber(String legalNumber) {
      this.legalNumber = Optional.of(legalNumber);
      return this;
    }

    @JsonSetter(
        value = "timezone",
        nulls = Nulls.SKIP
    )
    public Builder timezone(Optional<String> timezone) {
      this.timezone = timezone;
      return this;
    }

    public Builder timezone(String timezone) {
      this.timezone = Optional.of(timezone);
      return this;
    }

    @JsonSetter(
        value = "billing_configuration",
        nulls = Nulls.SKIP
    )
    public Builder billingConfiguration(
        Optional<BillingConfigurationOrganization> billingConfiguration) {
      this.billingConfiguration = billingConfiguration;
      return this;
    }

    public Builder billingConfiguration(BillingConfigurationOrganization billingConfiguration) {
      this.billingConfiguration = Optional.of(billingConfiguration);
      return this;
    }

    public OrganizationObject build() {
      return new OrganizationObject(lagoId, name, createdAt, webhookUrl, country, addressLine1, addressLine2, state, zipode, email, city, legalName, legalNumber, timezone, billingConfiguration);
    }
  }
}
