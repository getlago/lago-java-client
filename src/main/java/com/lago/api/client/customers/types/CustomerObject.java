package com.lago.api.client.customers.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CustomerObject.Builder.class
)
public final class CustomerObject {
  private final Optional<String> lagoId;

  private final Optional<String> externalId;

  private final Optional<String> name;

  private final Optional<Integer> sequentialId;

  private final Optional<String> slug;

  private final Optional<String> createdAt;

  private final Optional<String> country;

  private final Optional<String> addressLine1;

  private final Optional<String> addressLine2;

  private final Optional<String> state;

  private final Optional<String> zipode;

  private final Optional<String> email;

  private final Optional<String> city;

  private final Optional<String> url;

  private final Optional<String> phone;

  private final Optional<String> lagoUrl;

  private final Optional<String> legalName;

  private final Optional<String> legalNumber;

  private final Optional<String> currency;

  private final Optional<String> timezone;

  private final Optional<String> applicableTimezone;

  private final Optional<Map<String, Object>> billingConfiguration;

  private int _cachedHashCode;

  CustomerObject(Optional<String> lagoId, Optional<String> externalId, Optional<String> name,
      Optional<Integer> sequentialId, Optional<String> slug, Optional<String> createdAt,
      Optional<String> country, Optional<String> addressLine1, Optional<String> addressLine2,
      Optional<String> state, Optional<String> zipode, Optional<String> email,
      Optional<String> city, Optional<String> url, Optional<String> phone, Optional<String> lagoUrl,
      Optional<String> legalName, Optional<String> legalNumber, Optional<String> currency,
      Optional<String> timezone, Optional<String> applicableTimezone,
      Optional<Map<String, Object>> billingConfiguration) {
    this.lagoId = lagoId;
    this.externalId = externalId;
    this.name = name;
    this.sequentialId = sequentialId;
    this.slug = slug;
    this.createdAt = createdAt;
    this.country = country;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.state = state;
    this.zipode = zipode;
    this.email = email;
    this.city = city;
    this.url = url;
    this.phone = phone;
    this.lagoUrl = lagoUrl;
    this.legalName = legalName;
    this.legalNumber = legalNumber;
    this.currency = currency;
    this.timezone = timezone;
    this.applicableTimezone = applicableTimezone;
    this.billingConfiguration = billingConfiguration;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("external_id")
  public Optional<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("sequential_id")
  public Optional<Integer> getSequentialId() {
    return sequentialId;
  }

  @JsonProperty("slug")
  public Optional<String> getSlug() {
    return slug;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
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

  @JsonProperty("url")
  public Optional<String> getUrl() {
    return url;
  }

  @JsonProperty("phone")
  public Optional<String> getPhone() {
    return phone;
  }

  @JsonProperty("lago_url")
  public Optional<String> getLagoUrl() {
    return lagoUrl;
  }

  @JsonProperty("legal_name")
  public Optional<String> getLegalName() {
    return legalName;
  }

  @JsonProperty("legal_number")
  public Optional<String> getLegalNumber() {
    return legalNumber;
  }

  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("timezone")
  public Optional<String> getTimezone() {
    return timezone;
  }

  @JsonProperty("applicable_timezone")
  public Optional<String> getApplicableTimezone() {
    return applicableTimezone;
  }

  @JsonProperty("billing_configuration")
  public Optional<Map<String, Object>> getBillingConfiguration() {
    return billingConfiguration;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CustomerObject && equalTo((CustomerObject) other);
  }

  private boolean equalTo(CustomerObject other) {
    return lagoId.equals(other.lagoId) && externalId.equals(other.externalId) && name.equals(other.name) && sequentialId.equals(other.sequentialId) && slug.equals(other.slug) && createdAt.equals(other.createdAt) && country.equals(other.country) && addressLine1.equals(other.addressLine1) && addressLine2.equals(other.addressLine2) && state.equals(other.state) && zipode.equals(other.zipode) && email.equals(other.email) && city.equals(other.city) && url.equals(other.url) && phone.equals(other.phone) && lagoUrl.equals(other.lagoUrl) && legalName.equals(other.legalName) && legalNumber.equals(other.legalNumber) && currency.equals(other.currency) && timezone.equals(other.timezone) && applicableTimezone.equals(other.applicableTimezone) && billingConfiguration.equals(other.billingConfiguration);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.externalId, this.name, this.sequentialId, this.slug, this.createdAt, this.country, this.addressLine1, this.addressLine2, this.state, this.zipode, this.email, this.city, this.url, this.phone, this.lagoUrl, this.legalName, this.legalNumber, this.currency, this.timezone, this.applicableTimezone, this.billingConfiguration);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CustomerObject{" + "lagoId: " + lagoId + ", externalId: " + externalId + ", name: " + name + ", sequentialId: " + sequentialId + ", slug: " + slug + ", createdAt: " + createdAt + ", country: " + country + ", addressLine1: " + addressLine1 + ", addressLine2: " + addressLine2 + ", state: " + state + ", zipode: " + zipode + ", email: " + email + ", city: " + city + ", url: " + url + ", phone: " + phone + ", lagoUrl: " + lagoUrl + ", legalName: " + legalName + ", legalNumber: " + legalNumber + ", currency: " + currency + ", timezone: " + timezone + ", applicableTimezone: " + applicableTimezone + ", billingConfiguration: " + billingConfiguration + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<Integer> sequentialId = Optional.empty();

    private Optional<String> slug = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> country = Optional.empty();

    private Optional<String> addressLine1 = Optional.empty();

    private Optional<String> addressLine2 = Optional.empty();

    private Optional<String> state = Optional.empty();

    private Optional<String> zipode = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> city = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> phone = Optional.empty();

    private Optional<String> lagoUrl = Optional.empty();

    private Optional<String> legalName = Optional.empty();

    private Optional<String> legalNumber = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> timezone = Optional.empty();

    private Optional<String> applicableTimezone = Optional.empty();

    private Optional<Map<String, Object>> billingConfiguration = Optional.empty();

    private Builder() {
    }

    public Builder from(CustomerObject other) {
      lagoId(other.getLagoId());
      externalId(other.getExternalId());
      name(other.getName());
      sequentialId(other.getSequentialId());
      slug(other.getSlug());
      createdAt(other.getCreatedAt());
      country(other.getCountry());
      addressLine1(other.getAddressLine1());
      addressLine2(other.getAddressLine2());
      state(other.getState());
      zipode(other.getZipode());
      email(other.getEmail());
      city(other.getCity());
      url(other.getUrl());
      phone(other.getPhone());
      lagoUrl(other.getLagoUrl());
      legalName(other.getLegalName());
      legalNumber(other.getLegalNumber());
      currency(other.getCurrency());
      timezone(other.getTimezone());
      applicableTimezone(other.getApplicableTimezone());
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
        value = "external_id",
        nulls = Nulls.SKIP
    )
    public Builder externalId(Optional<String> externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder externalId(String externalId) {
      this.externalId = Optional.of(externalId);
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
        value = "sequential_id",
        nulls = Nulls.SKIP
    )
    public Builder sequentialId(Optional<Integer> sequentialId) {
      this.sequentialId = sequentialId;
      return this;
    }

    public Builder sequentialId(Integer sequentialId) {
      this.sequentialId = Optional.of(sequentialId);
      return this;
    }

    @JsonSetter(
        value = "slug",
        nulls = Nulls.SKIP
    )
    public Builder slug(Optional<String> slug) {
      this.slug = slug;
      return this;
    }

    public Builder slug(String slug) {
      this.slug = Optional.of(slug);
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
        value = "url",
        nulls = Nulls.SKIP
    )
    public Builder url(Optional<String> url) {
      this.url = url;
      return this;
    }

    public Builder url(String url) {
      this.url = Optional.of(url);
      return this;
    }

    @JsonSetter(
        value = "phone",
        nulls = Nulls.SKIP
    )
    public Builder phone(Optional<String> phone) {
      this.phone = phone;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = Optional.of(phone);
      return this;
    }

    @JsonSetter(
        value = "lago_url",
        nulls = Nulls.SKIP
    )
    public Builder lagoUrl(Optional<String> lagoUrl) {
      this.lagoUrl = lagoUrl;
      return this;
    }

    public Builder lagoUrl(String lagoUrl) {
      this.lagoUrl = Optional.of(lagoUrl);
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
        value = "currency",
        nulls = Nulls.SKIP
    )
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
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
        value = "applicable_timezone",
        nulls = Nulls.SKIP
    )
    public Builder applicableTimezone(Optional<String> applicableTimezone) {
      this.applicableTimezone = applicableTimezone;
      return this;
    }

    public Builder applicableTimezone(String applicableTimezone) {
      this.applicableTimezone = Optional.of(applicableTimezone);
      return this;
    }

    @JsonSetter(
        value = "billing_configuration",
        nulls = Nulls.SKIP
    )
    public Builder billingConfiguration(Optional<Map<String, Object>> billingConfiguration) {
      this.billingConfiguration = billingConfiguration;
      return this;
    }

    public Builder billingConfiguration(Map<String, Object> billingConfiguration) {
      this.billingConfiguration = Optional.of(billingConfiguration);
      return this;
    }

    public CustomerObject build() {
      return new CustomerObject(lagoId, externalId, name, sequentialId, slug, createdAt, country, addressLine1, addressLine2, state, zipode, email, city, url, phone, lagoUrl, legalName, legalNumber, currency, timezone, applicableTimezone, billingConfiguration);
    }
  }
}
