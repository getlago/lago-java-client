/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.46.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.CreditNoteAppliedTaxObject;
import org.openapitools.client.model.CreditNoteItemObject;
import org.openapitools.client.model.Currency;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreditNoteObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class CreditNoteObject {
  public static final String SERIALIZED_NAME_LAGO_ID = "lago_id";
  @SerializedName(SERIALIZED_NAME_LAGO_ID)
  private UUID lagoId;

  public static final String SERIALIZED_NAME_SEQUENTIAL_ID = "sequential_id";
  @SerializedName(SERIALIZED_NAME_SEQUENTIAL_ID)
  private Integer sequentialId;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_LAGO_INVOICE_ID = "lago_invoice_id";
  @SerializedName(SERIALIZED_NAME_LAGO_INVOICE_ID)
  private UUID lagoInvoiceId;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoice_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_ISSUING_DATE = "issuing_date";
  @SerializedName(SERIALIZED_NAME_ISSUING_DATE)
  private LocalDate issuingDate;

  /**
   * The status of the credit portion of the credit note. It indicates the current state or condition of the credit amount associated with the credit note. The possible values for this field are:  - &#x60;available&#x60;: this status indicates that an amount remains available for future usage. The credit can be applied towards future transactions or invoices. - &#x60;consumed&#x60;: this status indicates that the credit amount has been fully consumed. The remaining amount is 0, indicating that the credit has been utilized in its entirety. - &#x60;voided&#x60;: this status indicates that the remaining amount of the credit cannot be used any further. The credit has been voided and is no longer available for application or redemption.
   */
  @JsonAdapter(CreditStatusEnum.Adapter.class)
  public enum CreditStatusEnum {
    AVAILABLE("available"),
    
    CONSUMED("consumed"),
    
    VOIDED("voided");

    private String value;

    CreditStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreditStatusEnum fromValue(String value) {
      for (CreditStatusEnum b : CreditStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CreditStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreditStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreditStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CreditStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CREDIT_STATUS = "credit_status";
  @SerializedName(SERIALIZED_NAME_CREDIT_STATUS)
  private CreditStatusEnum creditStatus;

  /**
   * The status of the refund portion of the credit note. It indicates the current state or condition of the refund associated with the credit note. The possible values for this field are:  - &#x60;pending&#x60;: this status indicates that the refund is pending execution. The refund request has been initiated but has not been processed or completed yet. - &#x60;succeeded&#x60;: this status indicates that the refund has been successfully executed. The refund amount has been processed and returned to the customer or the designated recipient. - &#x60;failed&#x60;: this status indicates that the refund failed to execute. The refund request encountered an error or unsuccessful processing, and the refund amount could not be returned.
   */
  @JsonAdapter(RefundStatusEnum.Adapter.class)
  public enum RefundStatusEnum {
    PENDING("pending"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

    private String value;

    RefundStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefundStatusEnum fromValue(String value) {
      for (RefundStatusEnum b : RefundStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RefundStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefundStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefundStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefundStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFUND_STATUS = "refund_status";
  @SerializedName(SERIALIZED_NAME_REFUND_STATUS)
  private RefundStatusEnum refundStatus;

  /**
   * The reason of the credit note creation. Possible values are &#x60;duplicated_charge&#x60;, &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60; or &#x60;other&#x60;.
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    DUPLICATED_CHARGE("duplicated_charge"),
    
    PRODUCT_UNSATISFACTORY("product_unsatisfactory"),
    
    ORDER_CHANGE("order_change"),
    
    ORDER_CANCELLATION("order_cancellation"),
    
    FRAUDULENT_CHARGE("fraudulent_charge"),
    
    OTHER("other");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT_CENTS = "total_amount_cents";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT_CENTS)
  private Integer totalAmountCents;

  public static final String SERIALIZED_NAME_TAXES_AMOUNT_CENTS = "taxes_amount_cents";
  @SerializedName(SERIALIZED_NAME_TAXES_AMOUNT_CENTS)
  private Integer taxesAmountCents;

  public static final String SERIALIZED_NAME_TAXES_RATE = "taxes_rate";
  @SerializedName(SERIALIZED_NAME_TAXES_RATE)
  private BigDecimal taxesRate;

  public static final String SERIALIZED_NAME_SUB_TOTAL_EXCLUDING_TAXES_AMOUNT_CENTS = "sub_total_excluding_taxes_amount_cents";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL_EXCLUDING_TAXES_AMOUNT_CENTS)
  private Integer subTotalExcludingTaxesAmountCents;

  public static final String SERIALIZED_NAME_BALANCE_AMOUNT_CENTS = "balance_amount_cents";
  @SerializedName(SERIALIZED_NAME_BALANCE_AMOUNT_CENTS)
  private Integer balanceAmountCents;

  public static final String SERIALIZED_NAME_CREDIT_AMOUNT_CENTS = "credit_amount_cents";
  @SerializedName(SERIALIZED_NAME_CREDIT_AMOUNT_CENTS)
  private Integer creditAmountCents;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT_CENTS = "refund_amount_cents";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT_CENTS)
  private Integer refundAmountCents;

  public static final String SERIALIZED_NAME_COUPONS_ADJUSTEMENT_AMOUNT_CENTS = "coupons_adjustement_amount_cents";
  @SerializedName(SERIALIZED_NAME_COUPONS_ADJUSTEMENT_AMOUNT_CENTS)
  private Integer couponsAdjustementAmountCents;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_FILE_URL = "file_url";
  @SerializedName(SERIALIZED_NAME_FILE_URL)
  private String fileUrl;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CreditNoteItemObject> items;

  public static final String SERIALIZED_NAME_APPLIED_TAXES = "applied_taxes";
  @SerializedName(SERIALIZED_NAME_APPLIED_TAXES)
  private List<CreditNoteAppliedTaxObject> appliedTaxes;

  public CreditNoteObject() {
  }

  public CreditNoteObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * The credit note unique identifier, created by Lago.
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  public UUID getLagoId() {
    return lagoId;
  }


  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public CreditNoteObject sequentialId(Integer sequentialId) {
    
    this.sequentialId = sequentialId;
    return this;
  }

   /**
   * The sequential identifier of the credit note, specifically scoped on the associated invoice. It provides a unique numerical identifier for the credit note within the context of the invoice.
   * @return sequentialId
  **/
  @javax.annotation.Nonnull
  public Integer getSequentialId() {
    return sequentialId;
  }


  public void setSequentialId(Integer sequentialId) {
    this.sequentialId = sequentialId;
  }


  public CreditNoteObject number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The credit note unique number.
   * @return number
  **/
  @javax.annotation.Nonnull
  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public CreditNoteObject lagoInvoiceId(UUID lagoInvoiceId) {
    
    this.lagoInvoiceId = lagoInvoiceId;
    return this;
  }

   /**
   * Unique identifier assigned to the invoice that the credit note belongs to
   * @return lagoInvoiceId
  **/
  @javax.annotation.Nonnull
  public UUID getLagoInvoiceId() {
    return lagoInvoiceId;
  }


  public void setLagoInvoiceId(UUID lagoInvoiceId) {
    this.lagoInvoiceId = lagoInvoiceId;
  }


  public CreditNoteObject invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * The invoice unique number, related to the credit note.
   * @return invoiceNumber
  **/
  @javax.annotation.Nonnull
  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public CreditNoteObject issuingDate(LocalDate issuingDate) {
    
    this.issuingDate = issuingDate;
    return this;
  }

   /**
   * The date of creation of the credit note. It follows the ISO 8601 date format and provides the specific date when the credit note was created.
   * @return issuingDate
  **/
  @javax.annotation.Nonnull
  public LocalDate getIssuingDate() {
    return issuingDate;
  }


  public void setIssuingDate(LocalDate issuingDate) {
    this.issuingDate = issuingDate;
  }


  public CreditNoteObject creditStatus(CreditStatusEnum creditStatus) {
    
    this.creditStatus = creditStatus;
    return this;
  }

   /**
   * The status of the credit portion of the credit note. It indicates the current state or condition of the credit amount associated with the credit note. The possible values for this field are:  - &#x60;available&#x60;: this status indicates that an amount remains available for future usage. The credit can be applied towards future transactions or invoices. - &#x60;consumed&#x60;: this status indicates that the credit amount has been fully consumed. The remaining amount is 0, indicating that the credit has been utilized in its entirety. - &#x60;voided&#x60;: this status indicates that the remaining amount of the credit cannot be used any further. The credit has been voided and is no longer available for application or redemption.
   * @return creditStatus
  **/
  @javax.annotation.Nullable
  public CreditStatusEnum getCreditStatus() {
    return creditStatus;
  }


  public void setCreditStatus(CreditStatusEnum creditStatus) {
    this.creditStatus = creditStatus;
  }


  public CreditNoteObject refundStatus(RefundStatusEnum refundStatus) {
    
    this.refundStatus = refundStatus;
    return this;
  }

   /**
   * The status of the refund portion of the credit note. It indicates the current state or condition of the refund associated with the credit note. The possible values for this field are:  - &#x60;pending&#x60;: this status indicates that the refund is pending execution. The refund request has been initiated but has not been processed or completed yet. - &#x60;succeeded&#x60;: this status indicates that the refund has been successfully executed. The refund amount has been processed and returned to the customer or the designated recipient. - &#x60;failed&#x60;: this status indicates that the refund failed to execute. The refund request encountered an error or unsuccessful processing, and the refund amount could not be returned.
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  public RefundStatusEnum getRefundStatus() {
    return refundStatus;
  }


  public void setRefundStatus(RefundStatusEnum refundStatus) {
    this.refundStatus = refundStatus;
  }


  public CreditNoteObject reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the credit note creation. Possible values are &#x60;duplicated_charge&#x60;, &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60; or &#x60;other&#x60;.
   * @return reason
  **/
  @javax.annotation.Nonnull
  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public CreditNoteObject description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the credit note.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreditNoteObject currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public CreditNoteObject totalAmountCents(Integer totalAmountCents) {
    
    this.totalAmountCents = totalAmountCents;
    return this;
  }

   /**
   * The total amount of the credit note, expressed in cents.
   * @return totalAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getTotalAmountCents() {
    return totalAmountCents;
  }


  public void setTotalAmountCents(Integer totalAmountCents) {
    this.totalAmountCents = totalAmountCents;
  }


  public CreditNoteObject taxesAmountCents(Integer taxesAmountCents) {
    
    this.taxesAmountCents = taxesAmountCents;
    return this;
  }

   /**
   * The tax amount of the credit note, expressed in cents.
   * @return taxesAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getTaxesAmountCents() {
    return taxesAmountCents;
  }


  public void setTaxesAmountCents(Integer taxesAmountCents) {
    this.taxesAmountCents = taxesAmountCents;
  }


  public CreditNoteObject taxesRate(BigDecimal taxesRate) {
    
    this.taxesRate = taxesRate;
    return this;
  }

   /**
   * The tax rate associated with this specific credit note.
   * @return taxesRate
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTaxesRate() {
    return taxesRate;
  }


  public void setTaxesRate(BigDecimal taxesRate) {
    this.taxesRate = taxesRate;
  }


  public CreditNoteObject subTotalExcludingTaxesAmountCents(Integer subTotalExcludingTaxesAmountCents) {
    
    this.subTotalExcludingTaxesAmountCents = subTotalExcludingTaxesAmountCents;
    return this;
  }

   /**
   * The subtotal of the credit note excluding any applicable taxes, expressed in cents.
   * @return subTotalExcludingTaxesAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getSubTotalExcludingTaxesAmountCents() {
    return subTotalExcludingTaxesAmountCents;
  }


  public void setSubTotalExcludingTaxesAmountCents(Integer subTotalExcludingTaxesAmountCents) {
    this.subTotalExcludingTaxesAmountCents = subTotalExcludingTaxesAmountCents;
  }


  public CreditNoteObject balanceAmountCents(Integer balanceAmountCents) {
    
    this.balanceAmountCents = balanceAmountCents;
    return this;
  }

   /**
   * The remaining credit note amount, expressed in cents.
   * @return balanceAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getBalanceAmountCents() {
    return balanceAmountCents;
  }


  public void setBalanceAmountCents(Integer balanceAmountCents) {
    this.balanceAmountCents = balanceAmountCents;
  }


  public CreditNoteObject creditAmountCents(Integer creditAmountCents) {
    
    this.creditAmountCents = creditAmountCents;
    return this;
  }

   /**
   * The credited amount of the credit note, expressed in cents.
   * @return creditAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getCreditAmountCents() {
    return creditAmountCents;
  }


  public void setCreditAmountCents(Integer creditAmountCents) {
    this.creditAmountCents = creditAmountCents;
  }


  public CreditNoteObject refundAmountCents(Integer refundAmountCents) {
    
    this.refundAmountCents = refundAmountCents;
    return this;
  }

   /**
   * The refunded amount of the credit note, expressed in cents.
   * @return refundAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getRefundAmountCents() {
    return refundAmountCents;
  }


  public void setRefundAmountCents(Integer refundAmountCents) {
    this.refundAmountCents = refundAmountCents;
  }


  public CreditNoteObject couponsAdjustementAmountCents(Integer couponsAdjustementAmountCents) {
    
    this.couponsAdjustementAmountCents = couponsAdjustementAmountCents;
    return this;
  }

   /**
   * The pro-rated amount of the coupons applied to the source invoice.
   * @return couponsAdjustementAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getCouponsAdjustementAmountCents() {
    return couponsAdjustementAmountCents;
  }


  public void setCouponsAdjustementAmountCents(Integer couponsAdjustementAmountCents) {
    this.couponsAdjustementAmountCents = couponsAdjustementAmountCents;
  }


  public CreditNoteObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date when the credit note was created. It is expressed in Coordinated Universal Time (UTC).
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreditNoteObject updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date when the credit note was last updated. It is expressed in Coordinated Universal Time (UTC).
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreditNoteObject fileUrl(String fileUrl) {
    
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * The PDF file of the credit note.
   * @return fileUrl
  **/
  @javax.annotation.Nullable
  public String getFileUrl() {
    return fileUrl;
  }


  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  public CreditNoteObject items(List<CreditNoteItemObject> items) {
    
    this.items = items;
    return this;
  }

  public CreditNoteObject addItemsItem(CreditNoteItemObject itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of credit note’s items.
   * @return items
  **/
  @javax.annotation.Nullable
  public List<CreditNoteItemObject> getItems() {
    return items;
  }


  public void setItems(List<CreditNoteItemObject> items) {
    this.items = items;
  }


  public CreditNoteObject appliedTaxes(List<CreditNoteAppliedTaxObject> appliedTaxes) {
    
    this.appliedTaxes = appliedTaxes;
    return this;
  }

  public CreditNoteObject addAppliedTaxesItem(CreditNoteAppliedTaxObject appliedTaxesItem) {
    if (this.appliedTaxes == null) {
      this.appliedTaxes = new ArrayList<>();
    }
    this.appliedTaxes.add(appliedTaxesItem);
    return this;
  }

   /**
   * Get appliedTaxes
   * @return appliedTaxes
  **/
  @javax.annotation.Nullable
  public List<CreditNoteAppliedTaxObject> getAppliedTaxes() {
    return appliedTaxes;
  }


  public void setAppliedTaxes(List<CreditNoteAppliedTaxObject> appliedTaxes) {
    this.appliedTaxes = appliedTaxes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNoteObject creditNoteObject = (CreditNoteObject) o;
    return Objects.equals(this.lagoId, creditNoteObject.lagoId) &&
        Objects.equals(this.sequentialId, creditNoteObject.sequentialId) &&
        Objects.equals(this.number, creditNoteObject.number) &&
        Objects.equals(this.lagoInvoiceId, creditNoteObject.lagoInvoiceId) &&
        Objects.equals(this.invoiceNumber, creditNoteObject.invoiceNumber) &&
        Objects.equals(this.issuingDate, creditNoteObject.issuingDate) &&
        Objects.equals(this.creditStatus, creditNoteObject.creditStatus) &&
        Objects.equals(this.refundStatus, creditNoteObject.refundStatus) &&
        Objects.equals(this.reason, creditNoteObject.reason) &&
        Objects.equals(this.description, creditNoteObject.description) &&
        Objects.equals(this.currency, creditNoteObject.currency) &&
        Objects.equals(this.totalAmountCents, creditNoteObject.totalAmountCents) &&
        Objects.equals(this.taxesAmountCents, creditNoteObject.taxesAmountCents) &&
        Objects.equals(this.taxesRate, creditNoteObject.taxesRate) &&
        Objects.equals(this.subTotalExcludingTaxesAmountCents, creditNoteObject.subTotalExcludingTaxesAmountCents) &&
        Objects.equals(this.balanceAmountCents, creditNoteObject.balanceAmountCents) &&
        Objects.equals(this.creditAmountCents, creditNoteObject.creditAmountCents) &&
        Objects.equals(this.refundAmountCents, creditNoteObject.refundAmountCents) &&
        Objects.equals(this.couponsAdjustementAmountCents, creditNoteObject.couponsAdjustementAmountCents) &&
        Objects.equals(this.createdAt, creditNoteObject.createdAt) &&
        Objects.equals(this.updatedAt, creditNoteObject.updatedAt) &&
        Objects.equals(this.fileUrl, creditNoteObject.fileUrl) &&
        Objects.equals(this.items, creditNoteObject.items) &&
        Objects.equals(this.appliedTaxes, creditNoteObject.appliedTaxes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, sequentialId, number, lagoInvoiceId, invoiceNumber, issuingDate, creditStatus, refundStatus, reason, description, currency, totalAmountCents, taxesAmountCents, taxesRate, subTotalExcludingTaxesAmountCents, balanceAmountCents, creditAmountCents, refundAmountCents, couponsAdjustementAmountCents, createdAt, updatedAt, fileUrl, items, appliedTaxes);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    sequentialId: ").append(toIndentedString(sequentialId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    lagoInvoiceId: ").append(toIndentedString(lagoInvoiceId)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    issuingDate: ").append(toIndentedString(issuingDate)).append("\n");
    sb.append("    creditStatus: ").append(toIndentedString(creditStatus)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalAmountCents: ").append(toIndentedString(totalAmountCents)).append("\n");
    sb.append("    taxesAmountCents: ").append(toIndentedString(taxesAmountCents)).append("\n");
    sb.append("    taxesRate: ").append(toIndentedString(taxesRate)).append("\n");
    sb.append("    subTotalExcludingTaxesAmountCents: ").append(toIndentedString(subTotalExcludingTaxesAmountCents)).append("\n");
    sb.append("    balanceAmountCents: ").append(toIndentedString(balanceAmountCents)).append("\n");
    sb.append("    creditAmountCents: ").append(toIndentedString(creditAmountCents)).append("\n");
    sb.append("    refundAmountCents: ").append(toIndentedString(refundAmountCents)).append("\n");
    sb.append("    couponsAdjustementAmountCents: ").append(toIndentedString(couponsAdjustementAmountCents)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    appliedTaxes: ").append(toIndentedString(appliedTaxes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("lago_id");
    openapiFields.add("sequential_id");
    openapiFields.add("number");
    openapiFields.add("lago_invoice_id");
    openapiFields.add("invoice_number");
    openapiFields.add("issuing_date");
    openapiFields.add("credit_status");
    openapiFields.add("refund_status");
    openapiFields.add("reason");
    openapiFields.add("description");
    openapiFields.add("currency");
    openapiFields.add("total_amount_cents");
    openapiFields.add("taxes_amount_cents");
    openapiFields.add("taxes_rate");
    openapiFields.add("sub_total_excluding_taxes_amount_cents");
    openapiFields.add("balance_amount_cents");
    openapiFields.add("credit_amount_cents");
    openapiFields.add("refund_amount_cents");
    openapiFields.add("coupons_adjustement_amount_cents");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("file_url");
    openapiFields.add("items");
    openapiFields.add("applied_taxes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lago_id");
    openapiRequiredFields.add("sequential_id");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("lago_invoice_id");
    openapiRequiredFields.add("invoice_number");
    openapiRequiredFields.add("issuing_date");
    openapiRequiredFields.add("reason");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("total_amount_cents");
    openapiRequiredFields.add("taxes_amount_cents");
    openapiRequiredFields.add("taxes_rate");
    openapiRequiredFields.add("sub_total_excluding_taxes_amount_cents");
    openapiRequiredFields.add("balance_amount_cents");
    openapiRequiredFields.add("credit_amount_cents");
    openapiRequiredFields.add("refund_amount_cents");
    openapiRequiredFields.add("coupons_adjustement_amount_cents");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreditNoteObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreditNoteObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditNoteObject is not found in the empty JSON string", CreditNoteObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreditNoteObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditNoteObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditNoteObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("lago_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_id").toString()));
      }
      if (!jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if (!jsonObj.get("lago_invoice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_invoice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_invoice_id").toString()));
      }
      if (!jsonObj.get("invoice_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_number").toString()));
      }
      if ((jsonObj.get("credit_status") != null && !jsonObj.get("credit_status").isJsonNull()) && !jsonObj.get("credit_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_status").toString()));
      }
      if ((jsonObj.get("refund_status") != null && !jsonObj.get("refund_status").isJsonNull()) && !jsonObj.get("refund_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_status").toString()));
      }
      if (!jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `currency`
      Currency.validateJsonElement(jsonObj.get("currency"));
      if ((jsonObj.get("file_url") != null && !jsonObj.get("file_url").isJsonNull()) && !jsonObj.get("file_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_url").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            CreditNoteItemObject.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      if (jsonObj.get("applied_taxes") != null && !jsonObj.get("applied_taxes").isJsonNull()) {
        JsonArray jsonArrayappliedTaxes = jsonObj.getAsJsonArray("applied_taxes");
        if (jsonArrayappliedTaxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("applied_taxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `applied_taxes` to be an array in the JSON string but got `%s`", jsonObj.get("applied_taxes").toString()));
          }

          // validate the optional field `applied_taxes` (array)
          for (int i = 0; i < jsonArrayappliedTaxes.size(); i++) {
            CreditNoteAppliedTaxObject.validateJsonElement(jsonArrayappliedTaxes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditNoteObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditNoteObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditNoteObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditNoteObject.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditNoteObject>() {
           @Override
           public void write(JsonWriter out, CreditNoteObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditNoteObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditNoteObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditNoteObject
  * @throws IOException if the JSON string is invalid with respect to CreditNoteObject
  */
  public static CreditNoteObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditNoteObject.class);
  }

 /**
  * Convert an instance of CreditNoteObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

