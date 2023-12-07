/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.2-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.openapitools.client.model.CreditObjectInvoice;
import org.openapitools.client.model.CreditObjectItem;
import org.openapitools.client.model.Currency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditObject
 */
@JsonPropertyOrder({
  CreditObject.JSON_PROPERTY_LAGO_ID,
  CreditObject.JSON_PROPERTY_AMOUNT_CENTS,
  CreditObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  CreditObject.JSON_PROPERTY_BEFORE_TAXES,
  CreditObject.JSON_PROPERTY_ITEM,
  CreditObject.JSON_PROPERTY_INVOICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CreditObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_BEFORE_TAXES = "before_taxes";
  private Boolean beforeTaxes;

  public static final String JSON_PROPERTY_ITEM = "item";
  private CreditObjectItem item;

  public static final String JSON_PROPERTY_INVOICE = "invoice";
  private CreditObjectInvoice invoice;

  public CreditObject() {
  }

  public CreditObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier assigned to the credit within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the credit’s item record within the Lago system.
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoId() {
    return lagoId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public CreditObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The amount of credit associated with the invoice, expressed in cents.
   * @return amountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmountCents() {
    return amountCents;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public CreditObject amountCurrency(Currency amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getAmountCurrency() {
    return amountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountCurrency(Currency amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public CreditObject beforeTaxes(Boolean beforeTaxes) {
    
    this.beforeTaxes = beforeTaxes;
    return this;
  }

   /**
   * Indicates whether the credit is applied on the amount before taxes (coupons) or after taxes (credit notes). This flag helps determine the order in which credits are applied to the invoice calculation
   * @return beforeTaxes
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BEFORE_TAXES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getBeforeTaxes() {
    return beforeTaxes;
  }


  @JsonProperty(JSON_PROPERTY_BEFORE_TAXES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeforeTaxes(Boolean beforeTaxes) {
    this.beforeTaxes = beforeTaxes;
  }


  public CreditObject item(CreditObjectItem item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreditObjectItem getItem() {
    return item;
  }


  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItem(CreditObjectItem item) {
    this.item = item;
  }


  public CreditObject invoice(CreditObjectInvoice invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreditObjectInvoice getInvoice() {
    return invoice;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoice(CreditObjectInvoice invoice) {
    this.invoice = invoice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditObject creditObject = (CreditObject) o;
    return Objects.equals(this.lagoId, creditObject.lagoId) &&
        Objects.equals(this.amountCents, creditObject.amountCents) &&
        Objects.equals(this.amountCurrency, creditObject.amountCurrency) &&
        Objects.equals(this.beforeTaxes, creditObject.beforeTaxes) &&
        Objects.equals(this.item, creditObject.item) &&
        Objects.equals(this.invoice, creditObject.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, amountCents, amountCurrency, beforeTaxes, item, invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    beforeTaxes: ").append(toIndentedString(beforeTaxes)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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

}

