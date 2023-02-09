package com.lago.api.client.invoices.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lago.api.client.commons.types.FeeObject;
import com.lago.api.client.customers.types.CustomerObject;
import com.lago.api.client.subscriptions.types.SubscriptionObject;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = InvoiceObject.Builder.class
)
public final class InvoiceObject {
  private final Optional<String> lagoId;

  private final Optional<Integer> sequentialId;

  private final Optional<String> number;

  private final Optional<String> issuingDate;

  private final Optional<InvoiceType> invoiceType;

  private final Optional<InvoiceStatus> status;

  private final Optional<PaymentStatus> paymentStatus;

  private final Optional<Integer> amountCents;

  private final Optional<String> amountCurrency;

  private final Optional<Integer> vatAmountCents;

  private final Optional<String> vatAmountCurrency;

  private final Optional<Integer> creditAmountCents;

  private final Optional<String> creditAmountCurrency;

  private final Optional<Integer> totalAmountCents;

  private final Optional<String> totalAmountCurrency;

  private final Optional<Boolean> legacy;

  private final Optional<String> fileUrl;

  private final Optional<CustomerObject> customer;

  private final Optional<List<SubscriptionObject>> subscriptions;

  private final Optional<List<FeeObject>> fees;

  private final Optional<List<CreditObject>> credits;

  private int _cachedHashCode;

  InvoiceObject(Optional<String> lagoId, Optional<Integer> sequentialId, Optional<String> number,
      Optional<String> issuingDate, Optional<InvoiceType> invoiceType,
      Optional<InvoiceStatus> status, Optional<PaymentStatus> paymentStatus,
      Optional<Integer> amountCents, Optional<String> amountCurrency,
      Optional<Integer> vatAmountCents, Optional<String> vatAmountCurrency,
      Optional<Integer> creditAmountCents, Optional<String> creditAmountCurrency,
      Optional<Integer> totalAmountCents, Optional<String> totalAmountCurrency,
      Optional<Boolean> legacy, Optional<String> fileUrl, Optional<CustomerObject> customer,
      Optional<List<SubscriptionObject>> subscriptions, Optional<List<FeeObject>> fees,
      Optional<List<CreditObject>> credits) {
    this.lagoId = lagoId;
    this.sequentialId = sequentialId;
    this.number = number;
    this.issuingDate = issuingDate;
    this.invoiceType = invoiceType;
    this.status = status;
    this.paymentStatus = paymentStatus;
    this.amountCents = amountCents;
    this.amountCurrency = amountCurrency;
    this.vatAmountCents = vatAmountCents;
    this.vatAmountCurrency = vatAmountCurrency;
    this.creditAmountCents = creditAmountCents;
    this.creditAmountCurrency = creditAmountCurrency;
    this.totalAmountCents = totalAmountCents;
    this.totalAmountCurrency = totalAmountCurrency;
    this.legacy = legacy;
    this.fileUrl = fileUrl;
    this.customer = customer;
    this.subscriptions = subscriptions;
    this.fees = fees;
    this.credits = credits;
  }

  @JsonProperty("lago_id")
  public Optional<String> getLagoId() {
    return lagoId;
  }

  @JsonProperty("sequential_id")
  public Optional<Integer> getSequentialId() {
    return sequentialId;
  }

  @JsonProperty("number")
  public Optional<String> getNumber() {
    return number;
  }

  @JsonProperty("issuing_date")
  public Optional<String> getIssuingDate() {
    return issuingDate;
  }

  @JsonProperty("invoice_type")
  public Optional<InvoiceType> getInvoiceType() {
    return invoiceType;
  }

  @JsonProperty("status")
  public Optional<InvoiceStatus> getStatus() {
    return status;
  }

  @JsonProperty("payment_status")
  public Optional<PaymentStatus> getPaymentStatus() {
    return paymentStatus;
  }

  @JsonProperty("amount_cents")
  public Optional<Integer> getAmountCents() {
    return amountCents;
  }

  @JsonProperty("amount_currency")
  public Optional<String> getAmountCurrency() {
    return amountCurrency;
  }

  @JsonProperty("vat_amount_cents")
  public Optional<Integer> getVatAmountCents() {
    return vatAmountCents;
  }

  @JsonProperty("vat_amount_currency")
  public Optional<String> getVatAmountCurrency() {
    return vatAmountCurrency;
  }

  @JsonProperty("credit_amount_cents")
  public Optional<Integer> getCreditAmountCents() {
    return creditAmountCents;
  }

  @JsonProperty("credit_amount_currency")
  public Optional<String> getCreditAmountCurrency() {
    return creditAmountCurrency;
  }

  @JsonProperty("total_amount_cents")
  public Optional<Integer> getTotalAmountCents() {
    return totalAmountCents;
  }

  @JsonProperty("total_amount_currency")
  public Optional<String> getTotalAmountCurrency() {
    return totalAmountCurrency;
  }

  @JsonProperty("legacy")
  public Optional<Boolean> getLegacy() {
    return legacy;
  }

  @JsonProperty("file_url")
  public Optional<String> getFileUrl() {
    return fileUrl;
  }

  @JsonProperty("customer")
  public Optional<CustomerObject> getCustomer() {
    return customer;
  }

  @JsonProperty("subscriptions")
  public Optional<List<SubscriptionObject>> getSubscriptions() {
    return subscriptions;
  }

  @JsonProperty("fees")
  public Optional<List<FeeObject>> getFees() {
    return fees;
  }

  @JsonProperty("credits")
  public Optional<List<CreditObject>> getCredits() {
    return credits;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoiceObject && equalTo((InvoiceObject) other);
  }

  private boolean equalTo(InvoiceObject other) {
    return lagoId.equals(other.lagoId) && sequentialId.equals(other.sequentialId) && number.equals(other.number) && issuingDate.equals(other.issuingDate) && invoiceType.equals(other.invoiceType) && status.equals(other.status) && paymentStatus.equals(other.paymentStatus) && amountCents.equals(other.amountCents) && amountCurrency.equals(other.amountCurrency) && vatAmountCents.equals(other.vatAmountCents) && vatAmountCurrency.equals(other.vatAmountCurrency) && creditAmountCents.equals(other.creditAmountCents) && creditAmountCurrency.equals(other.creditAmountCurrency) && totalAmountCents.equals(other.totalAmountCents) && totalAmountCurrency.equals(other.totalAmountCurrency) && legacy.equals(other.legacy) && fileUrl.equals(other.fileUrl) && customer.equals(other.customer) && subscriptions.equals(other.subscriptions) && fees.equals(other.fees) && credits.equals(other.credits);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.sequentialId, this.number, this.issuingDate, this.invoiceType, this.status, this.paymentStatus, this.amountCents, this.amountCurrency, this.vatAmountCents, this.vatAmountCurrency, this.creditAmountCents, this.creditAmountCurrency, this.totalAmountCents, this.totalAmountCurrency, this.legacy, this.fileUrl, this.customer, this.subscriptions, this.fees, this.credits);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoiceObject{" + "lagoId: " + lagoId + ", sequentialId: " + sequentialId + ", number: " + number + ", issuingDate: " + issuingDate + ", invoiceType: " + invoiceType + ", status: " + status + ", paymentStatus: " + paymentStatus + ", amountCents: " + amountCents + ", amountCurrency: " + amountCurrency + ", vatAmountCents: " + vatAmountCents + ", vatAmountCurrency: " + vatAmountCurrency + ", creditAmountCents: " + creditAmountCents + ", creditAmountCurrency: " + creditAmountCurrency + ", totalAmountCents: " + totalAmountCents + ", totalAmountCurrency: " + totalAmountCurrency + ", legacy: " + legacy + ", fileUrl: " + fileUrl + ", customer: " + customer + ", subscriptions: " + subscriptions + ", fees: " + fees + ", credits: " + credits + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> lagoId = Optional.empty();

    private Optional<Integer> sequentialId = Optional.empty();

    private Optional<String> number = Optional.empty();

    private Optional<String> issuingDate = Optional.empty();

    private Optional<InvoiceType> invoiceType = Optional.empty();

    private Optional<InvoiceStatus> status = Optional.empty();

    private Optional<PaymentStatus> paymentStatus = Optional.empty();

    private Optional<Integer> amountCents = Optional.empty();

    private Optional<String> amountCurrency = Optional.empty();

    private Optional<Integer> vatAmountCents = Optional.empty();

    private Optional<String> vatAmountCurrency = Optional.empty();

    private Optional<Integer> creditAmountCents = Optional.empty();

    private Optional<String> creditAmountCurrency = Optional.empty();

    private Optional<Integer> totalAmountCents = Optional.empty();

    private Optional<String> totalAmountCurrency = Optional.empty();

    private Optional<Boolean> legacy = Optional.empty();

    private Optional<String> fileUrl = Optional.empty();

    private Optional<CustomerObject> customer = Optional.empty();

    private Optional<List<SubscriptionObject>> subscriptions = Optional.empty();

    private Optional<List<FeeObject>> fees = Optional.empty();

    private Optional<List<CreditObject>> credits = Optional.empty();

    private Builder() {
    }

    public Builder from(InvoiceObject other) {
      lagoId(other.getLagoId());
      sequentialId(other.getSequentialId());
      number(other.getNumber());
      issuingDate(other.getIssuingDate());
      invoiceType(other.getInvoiceType());
      status(other.getStatus());
      paymentStatus(other.getPaymentStatus());
      amountCents(other.getAmountCents());
      amountCurrency(other.getAmountCurrency());
      vatAmountCents(other.getVatAmountCents());
      vatAmountCurrency(other.getVatAmountCurrency());
      creditAmountCents(other.getCreditAmountCents());
      creditAmountCurrency(other.getCreditAmountCurrency());
      totalAmountCents(other.getTotalAmountCents());
      totalAmountCurrency(other.getTotalAmountCurrency());
      legacy(other.getLegacy());
      fileUrl(other.getFileUrl());
      customer(other.getCustomer());
      subscriptions(other.getSubscriptions());
      fees(other.getFees());
      credits(other.getCredits());
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
        value = "number",
        nulls = Nulls.SKIP
    )
    public Builder number(Optional<String> number) {
      this.number = number;
      return this;
    }

    public Builder number(String number) {
      this.number = Optional.of(number);
      return this;
    }

    @JsonSetter(
        value = "issuing_date",
        nulls = Nulls.SKIP
    )
    public Builder issuingDate(Optional<String> issuingDate) {
      this.issuingDate = issuingDate;
      return this;
    }

    public Builder issuingDate(String issuingDate) {
      this.issuingDate = Optional.of(issuingDate);
      return this;
    }

    @JsonSetter(
        value = "invoice_type",
        nulls = Nulls.SKIP
    )
    public Builder invoiceType(Optional<InvoiceType> invoiceType) {
      this.invoiceType = invoiceType;
      return this;
    }

    public Builder invoiceType(InvoiceType invoiceType) {
      this.invoiceType = Optional.of(invoiceType);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<InvoiceStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(InvoiceStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "payment_status",
        nulls = Nulls.SKIP
    )
    public Builder paymentStatus(Optional<PaymentStatus> paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
    }

    public Builder paymentStatus(PaymentStatus paymentStatus) {
      this.paymentStatus = Optional.of(paymentStatus);
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

    @JsonSetter(
        value = "vat_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder vatAmountCents(Optional<Integer> vatAmountCents) {
      this.vatAmountCents = vatAmountCents;
      return this;
    }

    public Builder vatAmountCents(Integer vatAmountCents) {
      this.vatAmountCents = Optional.of(vatAmountCents);
      return this;
    }

    @JsonSetter(
        value = "vat_amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder vatAmountCurrency(Optional<String> vatAmountCurrency) {
      this.vatAmountCurrency = vatAmountCurrency;
      return this;
    }

    public Builder vatAmountCurrency(String vatAmountCurrency) {
      this.vatAmountCurrency = Optional.of(vatAmountCurrency);
      return this;
    }

    @JsonSetter(
        value = "credit_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder creditAmountCents(Optional<Integer> creditAmountCents) {
      this.creditAmountCents = creditAmountCents;
      return this;
    }

    public Builder creditAmountCents(Integer creditAmountCents) {
      this.creditAmountCents = Optional.of(creditAmountCents);
      return this;
    }

    @JsonSetter(
        value = "credit_amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder creditAmountCurrency(Optional<String> creditAmountCurrency) {
      this.creditAmountCurrency = creditAmountCurrency;
      return this;
    }

    public Builder creditAmountCurrency(String creditAmountCurrency) {
      this.creditAmountCurrency = Optional.of(creditAmountCurrency);
      return this;
    }

    @JsonSetter(
        value = "total_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountCents(Optional<Integer> totalAmountCents) {
      this.totalAmountCents = totalAmountCents;
      return this;
    }

    public Builder totalAmountCents(Integer totalAmountCents) {
      this.totalAmountCents = Optional.of(totalAmountCents);
      return this;
    }

    @JsonSetter(
        value = "total_amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountCurrency(Optional<String> totalAmountCurrency) {
      this.totalAmountCurrency = totalAmountCurrency;
      return this;
    }

    public Builder totalAmountCurrency(String totalAmountCurrency) {
      this.totalAmountCurrency = Optional.of(totalAmountCurrency);
      return this;
    }

    @JsonSetter(
        value = "legacy",
        nulls = Nulls.SKIP
    )
    public Builder legacy(Optional<Boolean> legacy) {
      this.legacy = legacy;
      return this;
    }

    public Builder legacy(Boolean legacy) {
      this.legacy = Optional.of(legacy);
      return this;
    }

    @JsonSetter(
        value = "file_url",
        nulls = Nulls.SKIP
    )
    public Builder fileUrl(Optional<String> fileUrl) {
      this.fileUrl = fileUrl;
      return this;
    }

    public Builder fileUrl(String fileUrl) {
      this.fileUrl = Optional.of(fileUrl);
      return this;
    }

    @JsonSetter(
        value = "customer",
        nulls = Nulls.SKIP
    )
    public Builder customer(Optional<CustomerObject> customer) {
      this.customer = customer;
      return this;
    }

    public Builder customer(CustomerObject customer) {
      this.customer = Optional.of(customer);
      return this;
    }

    @JsonSetter(
        value = "subscriptions",
        nulls = Nulls.SKIP
    )
    public Builder subscriptions(Optional<List<SubscriptionObject>> subscriptions) {
      this.subscriptions = subscriptions;
      return this;
    }

    public Builder subscriptions(List<SubscriptionObject> subscriptions) {
      this.subscriptions = Optional.of(subscriptions);
      return this;
    }

    @JsonSetter(
        value = "fees",
        nulls = Nulls.SKIP
    )
    public Builder fees(Optional<List<FeeObject>> fees) {
      this.fees = fees;
      return this;
    }

    public Builder fees(List<FeeObject> fees) {
      this.fees = Optional.of(fees);
      return this;
    }

    @JsonSetter(
        value = "credits",
        nulls = Nulls.SKIP
    )
    public Builder credits(Optional<List<CreditObject>> credits) {
      this.credits = credits;
      return this;
    }

    public Builder credits(List<CreditObject> credits) {
      this.credits = Optional.of(credits);
      return this;
    }

    public InvoiceObject build() {
      return new InvoiceObject(lagoId, sequentialId, number, issuingDate, invoiceType, status, paymentStatus, amountCents, amountCurrency, vatAmountCents, vatAmountCurrency, creditAmountCents, creditAmountCurrency, totalAmountCents, totalAmountCurrency, legacy, fileUrl, customer, subscriptions, fees, credits);
    }
  }
}
