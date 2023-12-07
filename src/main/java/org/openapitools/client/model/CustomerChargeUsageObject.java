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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.CustomerChargeUsageObjectBillableMetric;
import org.openapitools.client.model.CustomerChargeUsageObjectCharge;
import org.openapitools.client.model.CustomerChargeUsageObjectGroupsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomerChargeUsageObject
 */
@JsonPropertyOrder({
  CustomerChargeUsageObject.JSON_PROPERTY_UNITS,
  CustomerChargeUsageObject.JSON_PROPERTY_EVENTS_COUNT,
  CustomerChargeUsageObject.JSON_PROPERTY_AMOUNT_CENTS,
  CustomerChargeUsageObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  CustomerChargeUsageObject.JSON_PROPERTY_CHARGE,
  CustomerChargeUsageObject.JSON_PROPERTY_BILLABLE_METRIC,
  CustomerChargeUsageObject.JSON_PROPERTY_GROUPS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CustomerChargeUsageObject {
  public static final String JSON_PROPERTY_UNITS = "units";
  private String units;

  public static final String JSON_PROPERTY_EVENTS_COUNT = "events_count";
  private Integer eventsCount;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_CHARGE = "charge";
  private CustomerChargeUsageObjectCharge charge;

  public static final String JSON_PROPERTY_BILLABLE_METRIC = "billable_metric";
  private CustomerChargeUsageObjectBillableMetric billableMetric;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<CustomerChargeUsageObjectGroupsInner> groups = new ArrayList<>();

  public CustomerChargeUsageObject() {
  }

  public CustomerChargeUsageObject units(String units) {
    
    this.units = units;
    return this;
  }

   /**
   * The number of units consumed by the customer for a specific charge item.
   * @return units
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnits(String units) {
    this.units = units;
  }


  public CustomerChargeUsageObject eventsCount(Integer eventsCount) {
    
    this.eventsCount = eventsCount;
    return this;
  }

   /**
   * The quantity of usage events that have been recorded for a particular charge during the specified time period. These events may also be referred to as the number of transactions in some contexts.
   * @return eventsCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEventsCount() {
    return eventsCount;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventsCount(Integer eventsCount) {
    this.eventsCount = eventsCount;
  }


  public CustomerChargeUsageObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The amount in cents, tax excluded, consumed by the customer for a specific charge item.
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


  public CustomerChargeUsageObject amountCurrency(Currency amountCurrency) {
    
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


  public CustomerChargeUsageObject charge(CustomerChargeUsageObjectCharge charge) {
    
    this.charge = charge;
    return this;
  }

   /**
   * Get charge
   * @return charge
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CustomerChargeUsageObjectCharge getCharge() {
    return charge;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCharge(CustomerChargeUsageObjectCharge charge) {
    this.charge = charge;
  }


  public CustomerChargeUsageObject billableMetric(CustomerChargeUsageObjectBillableMetric billableMetric) {
    
    this.billableMetric = billableMetric;
    return this;
  }

   /**
   * Get billableMetric
   * @return billableMetric
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BILLABLE_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CustomerChargeUsageObjectBillableMetric getBillableMetric() {
    return billableMetric;
  }


  @JsonProperty(JSON_PROPERTY_BILLABLE_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBillableMetric(CustomerChargeUsageObjectBillableMetric billableMetric) {
    this.billableMetric = billableMetric;
  }


  public CustomerChargeUsageObject groups(List<CustomerChargeUsageObjectGroupsInner> groups) {
    
    this.groups = groups;
    return this;
  }

  public CustomerChargeUsageObject addGroupsItem(CustomerChargeUsageObjectGroupsInner groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Array of group object, representing multiple dimensions for a charge item.
   * @return groups
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CustomerChargeUsageObjectGroupsInner> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroups(List<CustomerChargeUsageObjectGroupsInner> groups) {
    this.groups = groups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerChargeUsageObject customerChargeUsageObject = (CustomerChargeUsageObject) o;
    return Objects.equals(this.units, customerChargeUsageObject.units) &&
        Objects.equals(this.eventsCount, customerChargeUsageObject.eventsCount) &&
        Objects.equals(this.amountCents, customerChargeUsageObject.amountCents) &&
        Objects.equals(this.amountCurrency, customerChargeUsageObject.amountCurrency) &&
        Objects.equals(this.charge, customerChargeUsageObject.charge) &&
        Objects.equals(this.billableMetric, customerChargeUsageObject.billableMetric) &&
        Objects.equals(this.groups, customerChargeUsageObject.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, eventsCount, amountCents, amountCurrency, charge, billableMetric, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerChargeUsageObject {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    billableMetric: ").append(toIndentedString(billableMetric)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

