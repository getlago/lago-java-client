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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.ChargeObject;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.TaxObject;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlanObject
 */
@JsonPropertyOrder({
  PlanObject.JSON_PROPERTY_LAGO_ID,
  PlanObject.JSON_PROPERTY_NAME,
  PlanObject.JSON_PROPERTY_CREATED_AT,
  PlanObject.JSON_PROPERTY_CODE,
  PlanObject.JSON_PROPERTY_INTERVAL,
  PlanObject.JSON_PROPERTY_DESCRIPTION,
  PlanObject.JSON_PROPERTY_AMOUNT_CENTS,
  PlanObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  PlanObject.JSON_PROPERTY_TRIAL_PERIOD,
  PlanObject.JSON_PROPERTY_PAY_IN_ADVANCE,
  PlanObject.JSON_PROPERTY_BILL_CHARGES_MONTHLY,
  PlanObject.JSON_PROPERTY_ACTIVE_SUBSCRIPTIONS_COUNT,
  PlanObject.JSON_PROPERTY_DRAFT_INVOICES_COUNT,
  PlanObject.JSON_PROPERTY_CHARGES,
  PlanObject.JSON_PROPERTY_TAXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T15:04:44.084574Z[Etc/UTC]")
public class PlanObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  /**
   * The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60; or &#x60;weekly&#x60;.
   */
  public enum IntervalEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    YEARLY("yearly");

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IntervalEnum fromValue(String value) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private IntervalEnum interval;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_TRIAL_PERIOD = "trial_period";
  private BigDecimal trialPeriod;

  public static final String JSON_PROPERTY_PAY_IN_ADVANCE = "pay_in_advance";
  private Boolean payInAdvance;

  public static final String JSON_PROPERTY_BILL_CHARGES_MONTHLY = "bill_charges_monthly";
  private JsonNullable<Boolean> billChargesMonthly = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ACTIVE_SUBSCRIPTIONS_COUNT = "active_subscriptions_count";
  private Integer activeSubscriptionsCount;

  public static final String JSON_PROPERTY_DRAFT_INVOICES_COUNT = "draft_invoices_count";
  private Integer draftInvoicesCount;

  public static final String JSON_PROPERTY_CHARGES = "charges";
  private List<ChargeObject> charges;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  private List<TaxObject> taxes;

  public PlanObject() {
  }

  public PlanObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier of the plan created by Lago.
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


  public PlanObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the plan.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public PlanObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the plan was created. It is expressed in UTC format according to the ISO 8601 datetime standard. This field provides the timestamp for the exact moment when the plan was initially created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PlanObject code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public PlanObject interval(IntervalEnum interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60; or &#x60;weekly&#x60;.
   * @return interval
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IntervalEnum getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }


  public PlanObject description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description on the plan.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PlanObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The base cost of the plan, excluding any applicable taxes, that is billed on a recurring basis. This value is defined at 0 if your plan is a pay-as-you-go plan.
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


  public PlanObject amountCurrency(Currency amountCurrency) {
    
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


  public PlanObject trialPeriod(BigDecimal trialPeriod) {
    
    this.trialPeriod = trialPeriod;
    return this;
  }

   /**
   * The duration in days during which the base cost of the plan is offered for free.
   * @return trialPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTrialPeriod() {
    return trialPeriod;
  }


  @JsonProperty(JSON_PROPERTY_TRIAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrialPeriod(BigDecimal trialPeriod) {
    this.trialPeriod = trialPeriod;
  }


  public PlanObject payInAdvance(Boolean payInAdvance) {
    
    this.payInAdvance = payInAdvance;
    return this;
  }

   /**
   * This field determines the billing timing for the plan. When set to &#x60;true&#x60;, the base cost of the plan is due at the beginning of each billing period. Conversely, when set to &#x60;false&#x60;, the base cost of the plan is due at the end of each billing period.
   * @return payInAdvance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAY_IN_ADVANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPayInAdvance() {
    return payInAdvance;
  }


  @JsonProperty(JSON_PROPERTY_PAY_IN_ADVANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayInAdvance(Boolean payInAdvance) {
    this.payInAdvance = payInAdvance;
  }


  public PlanObject billChargesMonthly(Boolean billChargesMonthly) {
    this.billChargesMonthly = JsonNullable.<Boolean>of(billChargesMonthly);
    
    return this;
  }

   /**
   * This field, when set to &#x60;true&#x60;, enables to invoice usage-based charges on monthly basis, even if the cadence of the plan is yearly. This allows customers to pay charges overage on a monthly basis. This can be set to true only if the plan’s interval is &#x60;yearly&#x60;.
   * @return billChargesMonthly
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getBillChargesMonthly() {
        return billChargesMonthly.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILL_CHARGES_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getBillChargesMonthly_JsonNullable() {
    return billChargesMonthly;
  }
  
  @JsonProperty(JSON_PROPERTY_BILL_CHARGES_MONTHLY)
  public void setBillChargesMonthly_JsonNullable(JsonNullable<Boolean> billChargesMonthly) {
    this.billChargesMonthly = billChargesMonthly;
  }

  public void setBillChargesMonthly(Boolean billChargesMonthly) {
    this.billChargesMonthly = JsonNullable.<Boolean>of(billChargesMonthly);
  }


  public PlanObject activeSubscriptionsCount(Integer activeSubscriptionsCount) {
    
    this.activeSubscriptionsCount = activeSubscriptionsCount;
    return this;
  }

   /**
   * The count of active subscriptions that are currently associated with the plan. This field provides valuable information regarding the impact of deleting the plan. By checking the value of this field, you can determine the number of subscriptions that will be affected if the plan is deleted.
   * @return activeSubscriptionsCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTIVE_SUBSCRIPTIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getActiveSubscriptionsCount() {
    return activeSubscriptionsCount;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_SUBSCRIPTIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActiveSubscriptionsCount(Integer activeSubscriptionsCount) {
    this.activeSubscriptionsCount = activeSubscriptionsCount;
  }


  public PlanObject draftInvoicesCount(Integer draftInvoicesCount) {
    
    this.draftInvoicesCount = draftInvoicesCount;
    return this;
  }

   /**
   * The number of draft invoices that include a subscription attached to the plan. This field provides valuable information about the impact of deleting the plan. By checking the value of this field, you can determine the number of draft invoices that will be affected if the plan is deleted.
   * @return draftInvoicesCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DRAFT_INVOICES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDraftInvoicesCount() {
    return draftInvoicesCount;
  }


  @JsonProperty(JSON_PROPERTY_DRAFT_INVOICES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDraftInvoicesCount(Integer draftInvoicesCount) {
    this.draftInvoicesCount = draftInvoicesCount;
  }


  public PlanObject charges(List<ChargeObject> charges) {
    
    this.charges = charges;
    return this;
  }

  public PlanObject addChargesItem(ChargeObject chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

   /**
   * Additional usage-based charges for this plan.
   * @return charges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChargeObject> getCharges() {
    return charges;
  }


  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharges(List<ChargeObject> charges) {
    this.charges = charges;
  }


  public PlanObject taxes(List<TaxObject> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public PlanObject addTaxesItem(TaxObject taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * All taxes applied to the plan.
   * @return taxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaxObject> getTaxes() {
    return taxes;
  }


  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxes(List<TaxObject> taxes) {
    this.taxes = taxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanObject planObject = (PlanObject) o;
    return Objects.equals(this.lagoId, planObject.lagoId) &&
        Objects.equals(this.name, planObject.name) &&
        Objects.equals(this.createdAt, planObject.createdAt) &&
        Objects.equals(this.code, planObject.code) &&
        Objects.equals(this.interval, planObject.interval) &&
        Objects.equals(this.description, planObject.description) &&
        Objects.equals(this.amountCents, planObject.amountCents) &&
        Objects.equals(this.amountCurrency, planObject.amountCurrency) &&
        Objects.equals(this.trialPeriod, planObject.trialPeriod) &&
        Objects.equals(this.payInAdvance, planObject.payInAdvance) &&
        equalsNullable(this.billChargesMonthly, planObject.billChargesMonthly) &&
        Objects.equals(this.activeSubscriptionsCount, planObject.activeSubscriptionsCount) &&
        Objects.equals(this.draftInvoicesCount, planObject.draftInvoicesCount) &&
        Objects.equals(this.charges, planObject.charges) &&
        Objects.equals(this.taxes, planObject.taxes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, name, createdAt, code, interval, description, amountCents, amountCurrency, trialPeriod, payInAdvance, hashCodeNullable(billChargesMonthly), activeSubscriptionsCount, draftInvoicesCount, charges, taxes);
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
    sb.append("class PlanObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    trialPeriod: ").append(toIndentedString(trialPeriod)).append("\n");
    sb.append("    payInAdvance: ").append(toIndentedString(payInAdvance)).append("\n");
    sb.append("    billChargesMonthly: ").append(toIndentedString(billChargesMonthly)).append("\n");
    sb.append("    activeSubscriptionsCount: ").append(toIndentedString(activeSubscriptionsCount)).append("\n");
    sb.append("    draftInvoicesCount: ").append(toIndentedString(draftInvoicesCount)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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

