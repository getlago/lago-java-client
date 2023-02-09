package com.lago.api.client.credit.notes.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lago.api.client.customers.types.CustomerObject;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CreditNoteObject.Builder.class
)
public final class CreditNoteObject {
  private final Optional<String> lagoId;

  private final Optional<Integer> sequentialId;

  private final Optional<String> number;

  private final Optional<String> lagoInvoiceId;

  private final Optional<String> invoiceNumber;

  private final Optional<String> issuingDate;

  private final Optional<CreditStatus> creditStatus;

  private final Optional<RefundStatus> refundStatus;

  private final Optional<CreditReason> reason;

  private final Optional<String> description;

  private final Optional<Integer> totalAmountCents;

  private final Optional<String> totalAmountCurrency;

  private final Optional<Integer> vatAmountCents;

  private final Optional<String> vatAmountCurrency;

  private final Optional<Integer> subTotalVatExcludedAmountCents;

  private final Optional<String> subTotalVatExcludedAmountCurrency;

  private final Optional<Integer> balanceAmountCents;

  private final Optional<String> balanceAmountCurrency;

  private final Optional<Integer> creditAmountCents;

  private final Optional<String> creditAmountCurrency;

  private final Optional<Integer> refundAmountCents;

  private final Optional<String> refundAmountCurrency;

  private final Optional<String> createdAt;

  private final Optional<String> updatedAt;

  private final Optional<String> fileUrl;

  private final Optional<CustomerObject> customer;

  private final Optional<List<CreditNoteItemObject>> items;

  private int _cachedHashCode;

  CreditNoteObject(Optional<String> lagoId, Optional<Integer> sequentialId, Optional<String> number,
      Optional<String> lagoInvoiceId, Optional<String> invoiceNumber, Optional<String> issuingDate,
      Optional<CreditStatus> creditStatus, Optional<RefundStatus> refundStatus,
      Optional<CreditReason> reason, Optional<String> description,
      Optional<Integer> totalAmountCents, Optional<String> totalAmountCurrency,
      Optional<Integer> vatAmountCents, Optional<String> vatAmountCurrency,
      Optional<Integer> subTotalVatExcludedAmountCents,
      Optional<String> subTotalVatExcludedAmountCurrency, Optional<Integer> balanceAmountCents,
      Optional<String> balanceAmountCurrency, Optional<Integer> creditAmountCents,
      Optional<String> creditAmountCurrency, Optional<Integer> refundAmountCents,
      Optional<String> refundAmountCurrency, Optional<String> createdAt, Optional<String> updatedAt,
      Optional<String> fileUrl, Optional<CustomerObject> customer,
      Optional<List<CreditNoteItemObject>> items) {
    this.lagoId = lagoId;
    this.sequentialId = sequentialId;
    this.number = number;
    this.lagoInvoiceId = lagoInvoiceId;
    this.invoiceNumber = invoiceNumber;
    this.issuingDate = issuingDate;
    this.creditStatus = creditStatus;
    this.refundStatus = refundStatus;
    this.reason = reason;
    this.description = description;
    this.totalAmountCents = totalAmountCents;
    this.totalAmountCurrency = totalAmountCurrency;
    this.vatAmountCents = vatAmountCents;
    this.vatAmountCurrency = vatAmountCurrency;
    this.subTotalVatExcludedAmountCents = subTotalVatExcludedAmountCents;
    this.subTotalVatExcludedAmountCurrency = subTotalVatExcludedAmountCurrency;
    this.balanceAmountCents = balanceAmountCents;
    this.balanceAmountCurrency = balanceAmountCurrency;
    this.creditAmountCents = creditAmountCents;
    this.creditAmountCurrency = creditAmountCurrency;
    this.refundAmountCents = refundAmountCents;
    this.refundAmountCurrency = refundAmountCurrency;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.fileUrl = fileUrl;
    this.customer = customer;
    this.items = items;
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

  @JsonProperty("lago_invoice_id")
  public Optional<String> getLagoInvoiceId() {
    return lagoInvoiceId;
  }

  @JsonProperty("invoice_number")
  public Optional<String> getInvoiceNumber() {
    return invoiceNumber;
  }

  @JsonProperty("issuing_date")
  public Optional<String> getIssuingDate() {
    return issuingDate;
  }

  @JsonProperty("credit_status")
  public Optional<CreditStatus> getCreditStatus() {
    return creditStatus;
  }

  @JsonProperty("refund_status")
  public Optional<RefundStatus> getRefundStatus() {
    return refundStatus;
  }

  @JsonProperty("reason")
  public Optional<CreditReason> getReason() {
    return reason;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("total_amount_cents")
  public Optional<Integer> getTotalAmountCents() {
    return totalAmountCents;
  }

  @JsonProperty("total_amount_currency")
  public Optional<String> getTotalAmountCurrency() {
    return totalAmountCurrency;
  }

  @JsonProperty("vat_amount_cents")
  public Optional<Integer> getVatAmountCents() {
    return vatAmountCents;
  }

  @JsonProperty("vat_amount_currency")
  public Optional<String> getVatAmountCurrency() {
    return vatAmountCurrency;
  }

  @JsonProperty("sub_total_vat_excluded_amount_cents")
  public Optional<Integer> getSubTotalVatExcludedAmountCents() {
    return subTotalVatExcludedAmountCents;
  }

  @JsonProperty("sub_total_vat_excluded_amount_currency")
  public Optional<String> getSubTotalVatExcludedAmountCurrency() {
    return subTotalVatExcludedAmountCurrency;
  }

  @JsonProperty("balance_amount_cents")
  public Optional<Integer> getBalanceAmountCents() {
    return balanceAmountCents;
  }

  @JsonProperty("balance_amount_currency")
  public Optional<String> getBalanceAmountCurrency() {
    return balanceAmountCurrency;
  }

  @JsonProperty("credit_amount_cents")
  public Optional<Integer> getCreditAmountCents() {
    return creditAmountCents;
  }

  @JsonProperty("credit_amount_currency")
  public Optional<String> getCreditAmountCurrency() {
    return creditAmountCurrency;
  }

  @JsonProperty("refund_amount_cents")
  public Optional<Integer> getRefundAmountCents() {
    return refundAmountCents;
  }

  @JsonProperty("refund_amount_currency")
  public Optional<String> getRefundAmountCurrency() {
    return refundAmountCurrency;
  }

  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("updated_at")
  public Optional<String> getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("file_url")
  public Optional<String> getFileUrl() {
    return fileUrl;
  }

  @JsonProperty("customer")
  public Optional<CustomerObject> getCustomer() {
    return customer;
  }

  @JsonProperty("items")
  public Optional<List<CreditNoteItemObject>> getItems() {
    return items;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreditNoteObject && equalTo((CreditNoteObject) other);
  }

  private boolean equalTo(CreditNoteObject other) {
    return lagoId.equals(other.lagoId) && sequentialId.equals(other.sequentialId) && number.equals(other.number) && lagoInvoiceId.equals(other.lagoInvoiceId) && invoiceNumber.equals(other.invoiceNumber) && issuingDate.equals(other.issuingDate) && creditStatus.equals(other.creditStatus) && refundStatus.equals(other.refundStatus) && reason.equals(other.reason) && description.equals(other.description) && totalAmountCents.equals(other.totalAmountCents) && totalAmountCurrency.equals(other.totalAmountCurrency) && vatAmountCents.equals(other.vatAmountCents) && vatAmountCurrency.equals(other.vatAmountCurrency) && subTotalVatExcludedAmountCents.equals(other.subTotalVatExcludedAmountCents) && subTotalVatExcludedAmountCurrency.equals(other.subTotalVatExcludedAmountCurrency) && balanceAmountCents.equals(other.balanceAmountCents) && balanceAmountCurrency.equals(other.balanceAmountCurrency) && creditAmountCents.equals(other.creditAmountCents) && creditAmountCurrency.equals(other.creditAmountCurrency) && refundAmountCents.equals(other.refundAmountCents) && refundAmountCurrency.equals(other.refundAmountCurrency) && createdAt.equals(other.createdAt) && updatedAt.equals(other.updatedAt) && fileUrl.equals(other.fileUrl) && customer.equals(other.customer) && items.equals(other.items);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.lagoId, this.sequentialId, this.number, this.lagoInvoiceId, this.invoiceNumber, this.issuingDate, this.creditStatus, this.refundStatus, this.reason, this.description, this.totalAmountCents, this.totalAmountCurrency, this.vatAmountCents, this.vatAmountCurrency, this.subTotalVatExcludedAmountCents, this.subTotalVatExcludedAmountCurrency, this.balanceAmountCents, this.balanceAmountCurrency, this.creditAmountCents, this.creditAmountCurrency, this.refundAmountCents, this.refundAmountCurrency, this.createdAt, this.updatedAt, this.fileUrl, this.customer, this.items);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreditNoteObject{" + "lagoId: " + lagoId + ", sequentialId: " + sequentialId + ", number: " + number + ", lagoInvoiceId: " + lagoInvoiceId + ", invoiceNumber: " + invoiceNumber + ", issuingDate: " + issuingDate + ", creditStatus: " + creditStatus + ", refundStatus: " + refundStatus + ", reason: " + reason + ", description: " + description + ", totalAmountCents: " + totalAmountCents + ", totalAmountCurrency: " + totalAmountCurrency + ", vatAmountCents: " + vatAmountCents + ", vatAmountCurrency: " + vatAmountCurrency + ", subTotalVatExcludedAmountCents: " + subTotalVatExcludedAmountCents + ", subTotalVatExcludedAmountCurrency: " + subTotalVatExcludedAmountCurrency + ", balanceAmountCents: " + balanceAmountCents + ", balanceAmountCurrency: " + balanceAmountCurrency + ", creditAmountCents: " + creditAmountCents + ", creditAmountCurrency: " + creditAmountCurrency + ", refundAmountCents: " + refundAmountCents + ", refundAmountCurrency: " + refundAmountCurrency + ", createdAt: " + createdAt + ", updatedAt: " + updatedAt + ", fileUrl: " + fileUrl + ", customer: " + customer + ", items: " + items + "}";
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

    private Optional<String> lagoInvoiceId = Optional.empty();

    private Optional<String> invoiceNumber = Optional.empty();

    private Optional<String> issuingDate = Optional.empty();

    private Optional<CreditStatus> creditStatus = Optional.empty();

    private Optional<RefundStatus> refundStatus = Optional.empty();

    private Optional<CreditReason> reason = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<Integer> totalAmountCents = Optional.empty();

    private Optional<String> totalAmountCurrency = Optional.empty();

    private Optional<Integer> vatAmountCents = Optional.empty();

    private Optional<String> vatAmountCurrency = Optional.empty();

    private Optional<Integer> subTotalVatExcludedAmountCents = Optional.empty();

    private Optional<String> subTotalVatExcludedAmountCurrency = Optional.empty();

    private Optional<Integer> balanceAmountCents = Optional.empty();

    private Optional<String> balanceAmountCurrency = Optional.empty();

    private Optional<Integer> creditAmountCents = Optional.empty();

    private Optional<String> creditAmountCurrency = Optional.empty();

    private Optional<Integer> refundAmountCents = Optional.empty();

    private Optional<String> refundAmountCurrency = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    private Optional<String> fileUrl = Optional.empty();

    private Optional<CustomerObject> customer = Optional.empty();

    private Optional<List<CreditNoteItemObject>> items = Optional.empty();

    private Builder() {
    }

    public Builder from(CreditNoteObject other) {
      lagoId(other.getLagoId());
      sequentialId(other.getSequentialId());
      number(other.getNumber());
      lagoInvoiceId(other.getLagoInvoiceId());
      invoiceNumber(other.getInvoiceNumber());
      issuingDate(other.getIssuingDate());
      creditStatus(other.getCreditStatus());
      refundStatus(other.getRefundStatus());
      reason(other.getReason());
      description(other.getDescription());
      totalAmountCents(other.getTotalAmountCents());
      totalAmountCurrency(other.getTotalAmountCurrency());
      vatAmountCents(other.getVatAmountCents());
      vatAmountCurrency(other.getVatAmountCurrency());
      subTotalVatExcludedAmountCents(other.getSubTotalVatExcludedAmountCents());
      subTotalVatExcludedAmountCurrency(other.getSubTotalVatExcludedAmountCurrency());
      balanceAmountCents(other.getBalanceAmountCents());
      balanceAmountCurrency(other.getBalanceAmountCurrency());
      creditAmountCents(other.getCreditAmountCents());
      creditAmountCurrency(other.getCreditAmountCurrency());
      refundAmountCents(other.getRefundAmountCents());
      refundAmountCurrency(other.getRefundAmountCurrency());
      createdAt(other.getCreatedAt());
      updatedAt(other.getUpdatedAt());
      fileUrl(other.getFileUrl());
      customer(other.getCustomer());
      items(other.getItems());
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
        value = "lago_invoice_id",
        nulls = Nulls.SKIP
    )
    public Builder lagoInvoiceId(Optional<String> lagoInvoiceId) {
      this.lagoInvoiceId = lagoInvoiceId;
      return this;
    }

    public Builder lagoInvoiceId(String lagoInvoiceId) {
      this.lagoInvoiceId = Optional.of(lagoInvoiceId);
      return this;
    }

    @JsonSetter(
        value = "invoice_number",
        nulls = Nulls.SKIP
    )
    public Builder invoiceNumber(Optional<String> invoiceNumber) {
      this.invoiceNumber = invoiceNumber;
      return this;
    }

    public Builder invoiceNumber(String invoiceNumber) {
      this.invoiceNumber = Optional.of(invoiceNumber);
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
        value = "credit_status",
        nulls = Nulls.SKIP
    )
    public Builder creditStatus(Optional<CreditStatus> creditStatus) {
      this.creditStatus = creditStatus;
      return this;
    }

    public Builder creditStatus(CreditStatus creditStatus) {
      this.creditStatus = Optional.of(creditStatus);
      return this;
    }

    @JsonSetter(
        value = "refund_status",
        nulls = Nulls.SKIP
    )
    public Builder refundStatus(Optional<RefundStatus> refundStatus) {
      this.refundStatus = refundStatus;
      return this;
    }

    public Builder refundStatus(RefundStatus refundStatus) {
      this.refundStatus = Optional.of(refundStatus);
      return this;
    }

    @JsonSetter(
        value = "reason",
        nulls = Nulls.SKIP
    )
    public Builder reason(Optional<CreditReason> reason) {
      this.reason = reason;
      return this;
    }

    public Builder reason(CreditReason reason) {
      this.reason = Optional.of(reason);
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
        value = "sub_total_vat_excluded_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder subTotalVatExcludedAmountCents(
        Optional<Integer> subTotalVatExcludedAmountCents) {
      this.subTotalVatExcludedAmountCents = subTotalVatExcludedAmountCents;
      return this;
    }

    public Builder subTotalVatExcludedAmountCents(Integer subTotalVatExcludedAmountCents) {
      this.subTotalVatExcludedAmountCents = Optional.of(subTotalVatExcludedAmountCents);
      return this;
    }

    @JsonSetter(
        value = "sub_total_vat_excluded_amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder subTotalVatExcludedAmountCurrency(
        Optional<String> subTotalVatExcludedAmountCurrency) {
      this.subTotalVatExcludedAmountCurrency = subTotalVatExcludedAmountCurrency;
      return this;
    }

    public Builder subTotalVatExcludedAmountCurrency(String subTotalVatExcludedAmountCurrency) {
      this.subTotalVatExcludedAmountCurrency = Optional.of(subTotalVatExcludedAmountCurrency);
      return this;
    }

    @JsonSetter(
        value = "balance_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder balanceAmountCents(Optional<Integer> balanceAmountCents) {
      this.balanceAmountCents = balanceAmountCents;
      return this;
    }

    public Builder balanceAmountCents(Integer balanceAmountCents) {
      this.balanceAmountCents = Optional.of(balanceAmountCents);
      return this;
    }

    @JsonSetter(
        value = "balance_amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder balanceAmountCurrency(Optional<String> balanceAmountCurrency) {
      this.balanceAmountCurrency = balanceAmountCurrency;
      return this;
    }

    public Builder balanceAmountCurrency(String balanceAmountCurrency) {
      this.balanceAmountCurrency = Optional.of(balanceAmountCurrency);
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
        value = "refund_amount_cents",
        nulls = Nulls.SKIP
    )
    public Builder refundAmountCents(Optional<Integer> refundAmountCents) {
      this.refundAmountCents = refundAmountCents;
      return this;
    }

    public Builder refundAmountCents(Integer refundAmountCents) {
      this.refundAmountCents = Optional.of(refundAmountCents);
      return this;
    }

    @JsonSetter(
        value = "refund_amount_currency",
        nulls = Nulls.SKIP
    )
    public Builder refundAmountCurrency(Optional<String> refundAmountCurrency) {
      this.refundAmountCurrency = refundAmountCurrency;
      return this;
    }

    public Builder refundAmountCurrency(String refundAmountCurrency) {
      this.refundAmountCurrency = Optional.of(refundAmountCurrency);
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
        value = "updated_at",
        nulls = Nulls.SKIP
    )
    public Builder updatedAt(Optional<String> updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    public Builder updatedAt(String updatedAt) {
      this.updatedAt = Optional.of(updatedAt);
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
        value = "items",
        nulls = Nulls.SKIP
    )
    public Builder items(Optional<List<CreditNoteItemObject>> items) {
      this.items = items;
      return this;
    }

    public Builder items(List<CreditNoteItemObject> items) {
      this.items = Optional.of(items);
      return this;
    }

    public CreditNoteObject build() {
      return new CreditNoteObject(lagoId, sequentialId, number, lagoInvoiceId, invoiceNumber, issuingDate, creditStatus, refundStatus, reason, description, totalAmountCents, totalAmountCurrency, vatAmountCents, vatAmountCurrency, subTotalVatExcludedAmountCents, subTotalVatExcludedAmountCurrency, balanceAmountCents, balanceAmountCurrency, creditAmountCents, creditAmountCurrency, refundAmountCents, refundAmountCurrency, createdAt, updatedAt, fileUrl, customer, items);
    }
  }
}
