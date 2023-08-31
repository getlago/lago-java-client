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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.PlanCreateInputPlanChargesInner;
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
 * PlanCreateInputPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class PlanCreateInputPlan {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  /**
   * The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60;, or &#x60;weekly&#x60;.
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

  public static final String SERIALIZED_NAME_TAX_CODES = "tax_codes";
  @SerializedName(SERIALIZED_NAME_TAX_CODES)
  private List<String> taxCodes;

  public static final String SERIALIZED_NAME_CHARGES = "charges";
  @SerializedName(SERIALIZED_NAME_CHARGES)
  private List<PlanCreateInputPlanChargesInner> charges;

  public PlanCreateInputPlan() {
  }

  public PlanCreateInputPlan name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the plan.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PlanCreateInputPlan code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public PlanCreateInputPlan interval(IntervalEnum interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60;, or &#x60;weekly&#x60;.
   * @return interval
  **/
  @javax.annotation.Nullable
  public IntervalEnum getInterval() {
    return interval;
  }


  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }


  public PlanCreateInputPlan description(String description) {
    
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


  public PlanCreateInputPlan amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The base cost of the plan, excluding any applicable taxes, that is billed on a recurring basis. This value is defined at 0 if your plan is a pay-as-you-go plan.
   * @return amountCents
  **/
  @javax.annotation.Nullable
  public Integer getAmountCents() {
    return amountCents;
  }


  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public PlanCreateInputPlan amountCurrency(Currency amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nullable
  public Currency getAmountCurrency() {
    return amountCurrency;
  }


  public void setAmountCurrency(Currency amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public PlanCreateInputPlan trialPeriod(BigDecimal trialPeriod) {
    
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


  public PlanCreateInputPlan payInAdvance(Boolean payInAdvance) {
    
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


  public PlanCreateInputPlan billChargesMonthly(Boolean billChargesMonthly) {
    
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


  public PlanCreateInputPlan taxCodes(List<String> taxCodes) {
    
    this.taxCodes = taxCodes;
    return this;
  }

  public PlanCreateInputPlan addTaxCodesItem(String taxCodesItem) {
    if (this.taxCodes == null) {
      this.taxCodes = new ArrayList<>();
    }
    this.taxCodes.add(taxCodesItem);
    return this;
  }

   /**
   * List of unique code used to identify the taxes.
   * @return taxCodes
  **/
  @javax.annotation.Nullable
  public List<String> getTaxCodes() {
    return taxCodes;
  }


  public void setTaxCodes(List<String> taxCodes) {
    this.taxCodes = taxCodes;
  }


  public PlanCreateInputPlan charges(List<PlanCreateInputPlanChargesInner> charges) {
    
    this.charges = charges;
    return this;
  }

  public PlanCreateInputPlan addChargesItem(PlanCreateInputPlanChargesInner chargesItem) {
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
  public List<PlanCreateInputPlanChargesInner> getCharges() {
    return charges;
  }


  public void setCharges(List<PlanCreateInputPlanChargesInner> charges) {
    this.charges = charges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanCreateInputPlan planCreateInputPlan = (PlanCreateInputPlan) o;
    return Objects.equals(this.name, planCreateInputPlan.name) &&
        Objects.equals(this.code, planCreateInputPlan.code) &&
        Objects.equals(this.interval, planCreateInputPlan.interval) &&
        Objects.equals(this.description, planCreateInputPlan.description) &&
        Objects.equals(this.amountCents, planCreateInputPlan.amountCents) &&
        Objects.equals(this.amountCurrency, planCreateInputPlan.amountCurrency) &&
        Objects.equals(this.trialPeriod, planCreateInputPlan.trialPeriod) &&
        Objects.equals(this.payInAdvance, planCreateInputPlan.payInAdvance) &&
        Objects.equals(this.billChargesMonthly, planCreateInputPlan.billChargesMonthly) &&
        Objects.equals(this.taxCodes, planCreateInputPlan.taxCodes) &&
        Objects.equals(this.charges, planCreateInputPlan.charges);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, interval, description, amountCents, amountCurrency, trialPeriod, payInAdvance, billChargesMonthly, taxCodes, charges);
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
    sb.append("class PlanCreateInputPlan {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    trialPeriod: ").append(toIndentedString(trialPeriod)).append("\n");
    sb.append("    payInAdvance: ").append(toIndentedString(payInAdvance)).append("\n");
    sb.append("    billChargesMonthly: ").append(toIndentedString(billChargesMonthly)).append("\n");
    sb.append("    taxCodes: ").append(toIndentedString(taxCodes)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("interval");
    openapiFields.add("description");
    openapiFields.add("amount_cents");
    openapiFields.add("amount_currency");
    openapiFields.add("trial_period");
    openapiFields.add("pay_in_advance");
    openapiFields.add("bill_charges_monthly");
    openapiFields.add("tax_codes");
    openapiFields.add("charges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlanCreateInputPlan
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlanCreateInputPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlanCreateInputPlan is not found in the empty JSON string", PlanCreateInputPlan.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlanCreateInputPlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlanCreateInputPlan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) && !jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `amount_currency`
      if (jsonObj.get("amount_currency") != null && !jsonObj.get("amount_currency").isJsonNull()) {
        Currency.validateJsonElement(jsonObj.get("amount_currency"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tax_codes") != null && !jsonObj.get("tax_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_codes` to be an array in the JSON string but got `%s`", jsonObj.get("tax_codes").toString()));
      }
      if (jsonObj.get("charges") != null && !jsonObj.get("charges").isJsonNull()) {
        JsonArray jsonArraycharges = jsonObj.getAsJsonArray("charges");
        if (jsonArraycharges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("charges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `charges` to be an array in the JSON string but got `%s`", jsonObj.get("charges").toString()));
          }

          // validate the optional field `charges` (array)
          for (int i = 0; i < jsonArraycharges.size(); i++) {
            PlanCreateInputPlanChargesInner.validateJsonElement(jsonArraycharges.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlanCreateInputPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlanCreateInputPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlanCreateInputPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlanCreateInputPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<PlanCreateInputPlan>() {
           @Override
           public void write(JsonWriter out, PlanCreateInputPlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlanCreateInputPlan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlanCreateInputPlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlanCreateInputPlan
  * @throws IOException if the JSON string is invalid with respect to PlanCreateInputPlan
  */
  public static PlanCreateInputPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlanCreateInputPlan.class);
  }

 /**
  * Convert an instance of PlanCreateInputPlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

