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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.ChargeObject;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.TaxObject;
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
 * PlanObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class PlanObject {
  public static final String SERIALIZED_NAME_LAGO_ID = "lago_id";
  @SerializedName(SERIALIZED_NAME_LAGO_ID)
  private UUID lagoId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  /**
   * The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60; or &#x60;weekly&#x60;.
   */
  @JsonAdapter(IntervalEnum.Adapter.class)
  public enum IntervalEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    YEARLY("yearly");

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntervalEnum fromValue(String value) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntervalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private IntervalEnum interval;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT_CENTS = "amount_cents";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CENTS)
  private Integer amountCents;

  public static final String SERIALIZED_NAME_AMOUNT_CURRENCY = "amount_currency";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CURRENCY)
  private Currency amountCurrency;

  public static final String SERIALIZED_NAME_TRIAL_PERIOD = "trial_period";
  @SerializedName(SERIALIZED_NAME_TRIAL_PERIOD)
  private BigDecimal trialPeriod;

  public static final String SERIALIZED_NAME_PAY_IN_ADVANCE = "pay_in_advance";
  @SerializedName(SERIALIZED_NAME_PAY_IN_ADVANCE)
  private Boolean payInAdvance;

  public static final String SERIALIZED_NAME_BILL_CHARGES_MONTHLY = "bill_charges_monthly";
  @SerializedName(SERIALIZED_NAME_BILL_CHARGES_MONTHLY)
  private Boolean billChargesMonthly;

  public static final String SERIALIZED_NAME_ACTIVE_SUBSCRIPTIONS_COUNT = "active_subscriptions_count";
  @SerializedName(SERIALIZED_NAME_ACTIVE_SUBSCRIPTIONS_COUNT)
  private Integer activeSubscriptionsCount;

  public static final String SERIALIZED_NAME_DRAFT_INVOICES_COUNT = "draft_invoices_count";
  @SerializedName(SERIALIZED_NAME_DRAFT_INVOICES_COUNT)
  private Integer draftInvoicesCount;

  public static final String SERIALIZED_NAME_CHARGES = "charges";
  @SerializedName(SERIALIZED_NAME_CHARGES)
  private List<ChargeObject> charges;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
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
  public UUID getLagoId() {
    return lagoId;
  }


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
  public String getName() {
    return name;
  }


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
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


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
  public String getCode() {
    return code;
  }


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
  public IntervalEnum getInterval() {
    return interval;
  }


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
  public String getDescription() {
    return description;
  }


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
  public Integer getAmountCents() {
    return amountCents;
  }


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
  public Currency getAmountCurrency() {
    return amountCurrency;
  }


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
  public BigDecimal getTrialPeriod() {
    return trialPeriod;
  }


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
  public Boolean getPayInAdvance() {
    return payInAdvance;
  }


  public void setPayInAdvance(Boolean payInAdvance) {
    this.payInAdvance = payInAdvance;
  }


  public PlanObject billChargesMonthly(Boolean billChargesMonthly) {
    
    this.billChargesMonthly = billChargesMonthly;
    return this;
  }

   /**
   * This field, when set to &#x60;true&#x60;, enables to invoice usage-based charges on monthly basis, even if the cadence of the plan is yearly. This allows customers to pay charges overage on a monthly basis. This can be set to true only if the plan’s interval is &#x60;yearly&#x60;.
   * @return billChargesMonthly
  **/
  @javax.annotation.Nullable
  public Boolean getBillChargesMonthly() {
    return billChargesMonthly;
  }


  public void setBillChargesMonthly(Boolean billChargesMonthly) {
    this.billChargesMonthly = billChargesMonthly;
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
  public Integer getActiveSubscriptionsCount() {
    return activeSubscriptionsCount;
  }


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
  public Integer getDraftInvoicesCount() {
    return draftInvoicesCount;
  }


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
  public List<ChargeObject> getCharges() {
    return charges;
  }


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
  public List<TaxObject> getTaxes() {
    return taxes;
  }


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
        Objects.equals(this.billChargesMonthly, planObject.billChargesMonthly) &&
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
    return Objects.hash(lagoId, name, createdAt, code, interval, description, amountCents, amountCurrency, trialPeriod, payInAdvance, billChargesMonthly, activeSubscriptionsCount, draftInvoicesCount, charges, taxes);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("lago_id");
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("code");
    openapiFields.add("interval");
    openapiFields.add("description");
    openapiFields.add("amount_cents");
    openapiFields.add("amount_currency");
    openapiFields.add("trial_period");
    openapiFields.add("pay_in_advance");
    openapiFields.add("bill_charges_monthly");
    openapiFields.add("active_subscriptions_count");
    openapiFields.add("draft_invoices_count");
    openapiFields.add("charges");
    openapiFields.add("taxes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lago_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("amount_cents");
    openapiRequiredFields.add("amount_currency");
    openapiRequiredFields.add("active_subscriptions_count");
    openapiRequiredFields.add("draft_invoices_count");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlanObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlanObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlanObject is not found in the empty JSON string", PlanObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlanObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlanObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlanObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("lago_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `amount_currency`
      Currency.validateJsonElement(jsonObj.get("amount_currency"));
      if (jsonObj.get("charges") != null && !jsonObj.get("charges").isJsonNull()) {
        JsonArray jsonArraycharges = jsonObj.getAsJsonArray("charges");
        if (jsonArraycharges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("charges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `charges` to be an array in the JSON string but got `%s`", jsonObj.get("charges").toString()));
          }

          // validate the optional field `charges` (array)
          for (int i = 0; i < jsonArraycharges.size(); i++) {
            ChargeObject.validateJsonElement(jsonArraycharges.get(i));
          };
        }
      }
      if (jsonObj.get("taxes") != null && !jsonObj.get("taxes").isJsonNull()) {
        JsonArray jsonArraytaxes = jsonObj.getAsJsonArray("taxes");
        if (jsonArraytaxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taxes` to be an array in the JSON string but got `%s`", jsonObj.get("taxes").toString()));
          }

          // validate the optional field `taxes` (array)
          for (int i = 0; i < jsonArraytaxes.size(); i++) {
            TaxObject.validateJsonElement(jsonArraytaxes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlanObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlanObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlanObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlanObject.class));

       return (TypeAdapter<T>) new TypeAdapter<PlanObject>() {
           @Override
           public void write(JsonWriter out, PlanObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlanObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlanObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlanObject
  * @throws IOException if the JSON string is invalid with respect to PlanObject
  */
  public static PlanObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlanObject.class);
  }

 /**
  * Convert an instance of PlanObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
