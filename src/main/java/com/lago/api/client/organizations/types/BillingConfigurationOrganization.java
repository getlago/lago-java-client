package com.lago.api.client.organizations.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = BillingConfigurationOrganization.Builder.class
)
public final class BillingConfigurationOrganization {
  private final Optional<String> invoiceFooter;

  private final Optional<Integer> invoiceGracePeriod;

  private final Optional<Double> vatRate;

  private int _cachedHashCode;

  BillingConfigurationOrganization(Optional<String> invoiceFooter,
      Optional<Integer> invoiceGracePeriod, Optional<Double> vatRate) {
    this.invoiceFooter = invoiceFooter;
    this.invoiceGracePeriod = invoiceGracePeriod;
    this.vatRate = vatRate;
  }

  @JsonProperty("invoice_footer")
  public Optional<String> getInvoiceFooter() {
    return invoiceFooter;
  }

  @JsonProperty("invoice_grace_period")
  public Optional<Integer> getInvoiceGracePeriod() {
    return invoiceGracePeriod;
  }

  @JsonProperty("vat_rate")
  public Optional<Double> getVatRate() {
    return vatRate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BillingConfigurationOrganization && equalTo((BillingConfigurationOrganization) other);
  }

  private boolean equalTo(BillingConfigurationOrganization other) {
    return invoiceFooter.equals(other.invoiceFooter) && invoiceGracePeriod.equals(other.invoiceGracePeriod) && vatRate.equals(other.vatRate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.invoiceFooter, this.invoiceGracePeriod, this.vatRate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BillingConfigurationOrganization{" + "invoiceFooter: " + invoiceFooter + ", invoiceGracePeriod: " + invoiceGracePeriod + ", vatRate: " + vatRate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> invoiceFooter = Optional.empty();

    private Optional<Integer> invoiceGracePeriod = Optional.empty();

    private Optional<Double> vatRate = Optional.empty();

    private Builder() {
    }

    public Builder from(BillingConfigurationOrganization other) {
      invoiceFooter(other.getInvoiceFooter());
      invoiceGracePeriod(other.getInvoiceGracePeriod());
      vatRate(other.getVatRate());
      return this;
    }

    @JsonSetter(
        value = "invoice_footer",
        nulls = Nulls.SKIP
    )
    public Builder invoiceFooter(Optional<String> invoiceFooter) {
      this.invoiceFooter = invoiceFooter;
      return this;
    }

    public Builder invoiceFooter(String invoiceFooter) {
      this.invoiceFooter = Optional.of(invoiceFooter);
      return this;
    }

    @JsonSetter(
        value = "invoice_grace_period",
        nulls = Nulls.SKIP
    )
    public Builder invoiceGracePeriod(Optional<Integer> invoiceGracePeriod) {
      this.invoiceGracePeriod = invoiceGracePeriod;
      return this;
    }

    public Builder invoiceGracePeriod(Integer invoiceGracePeriod) {
      this.invoiceGracePeriod = Optional.of(invoiceGracePeriod);
      return this;
    }

    @JsonSetter(
        value = "vat_rate",
        nulls = Nulls.SKIP
    )
    public Builder vatRate(Optional<Double> vatRate) {
      this.vatRate = vatRate;
      return this;
    }

    public Builder vatRate(Double vatRate) {
      this.vatRate = Optional.of(vatRate);
      return this;
    }

    public BillingConfigurationOrganization build() {
      return new BillingConfigurationOrganization(invoiceFooter, invoiceGracePeriod, vatRate);
    }
  }
}
