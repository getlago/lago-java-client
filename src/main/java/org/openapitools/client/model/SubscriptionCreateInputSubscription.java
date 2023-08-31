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
import java.time.OffsetDateTime;

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
 * SubscriptionCreateInputSubscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class SubscriptionCreateInputSubscription {
  public static final String SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID)
  private String externalCustomerId;

  public static final String SERIALIZED_NAME_PLAN_CODE = "plan_code";
  @SerializedName(SERIALIZED_NAME_PLAN_CODE)
  private String planCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  /**
   * The billing time for the subscription, which can be set as either &#x60;anniversary&#x60; or &#x60;calendar&#x60;. If not explicitly provided, it will default to &#x60;calendar&#x60;. The billing time determines the timing of recurring billing cycles for the subscription. By specifying &#x60;anniversary&#x60;, the billing cycle will be based on the specific date the subscription started (billed fully), while &#x60;calendar&#x60; sets the billing cycle at the first day of the week/month/year (billed with proration).
   */
  @JsonAdapter(BillingTimeEnum.Adapter.class)
  public enum BillingTimeEnum {
    CALENDAR("calendar"),
    
    ANNIVERSARY("anniversary");

    private String value;

    BillingTimeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BillingTimeEnum fromValue(String value) {
      for (BillingTimeEnum b : BillingTimeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BillingTimeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BillingTimeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BillingTimeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BillingTimeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BILLING_TIME = "billing_time";
  @SerializedName(SERIALIZED_NAME_BILLING_TIME)
  private BillingTimeEnum billingTime;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_AT = "subscription_at";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_AT)
  private OffsetDateTime subscriptionAt;

  public SubscriptionCreateInputSubscription() {
  }

  public SubscriptionCreateInputSubscription externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application)
   * @return externalCustomerId
  **/
  @javax.annotation.Nonnull
  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public SubscriptionCreateInputSubscription planCode(String planCode) {
    
    this.planCode = planCode;
    return this;
  }

   /**
   * The unique code representing the plan to be attached to the customer. This code must correspond to the &#x60;code&#x60; property of one of the active plans.
   * @return planCode
  **/
  @javax.annotation.Nonnull
  public String getPlanCode() {
    return planCode;
  }


  public void setPlanCode(String planCode) {
    this.planCode = planCode;
  }


  public SubscriptionCreateInputSubscription name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The display name of the subscription on an invoice. This field allows for customization of the subscription&#39;s name for billing purposes, especially useful when a single customer has multiple subscriptions using the same plan.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SubscriptionCreateInputSubscription externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The unique external identifier for the subscription. This identifier serves as an idempotency key, ensuring that each subscription is unique.
   * @return externalId
  **/
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public SubscriptionCreateInputSubscription billingTime(BillingTimeEnum billingTime) {
    
    this.billingTime = billingTime;
    return this;
  }

   /**
   * The billing time for the subscription, which can be set as either &#x60;anniversary&#x60; or &#x60;calendar&#x60;. If not explicitly provided, it will default to &#x60;calendar&#x60;. The billing time determines the timing of recurring billing cycles for the subscription. By specifying &#x60;anniversary&#x60;, the billing cycle will be based on the specific date the subscription started (billed fully), while &#x60;calendar&#x60; sets the billing cycle at the first day of the week/month/year (billed with proration).
   * @return billingTime
  **/
  @javax.annotation.Nullable
  public BillingTimeEnum getBillingTime() {
    return billingTime;
  }


  public void setBillingTime(BillingTimeEnum billingTime) {
    this.billingTime = billingTime;
  }


  public SubscriptionCreateInputSubscription subscriptionAt(OffsetDateTime subscriptionAt) {
    
    this.subscriptionAt = subscriptionAt;
    return this;
  }

   /**
   * The start date for the subscription, allowing for the creation of subscriptions that can begin in the past or future. Please note that it cannot be used to update the start date of a pending subscription or schedule an upgrade/downgrade. The start_date should be provided in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return subscriptionAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSubscriptionAt() {
    return subscriptionAt;
  }


  public void setSubscriptionAt(OffsetDateTime subscriptionAt) {
    this.subscriptionAt = subscriptionAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCreateInputSubscription subscriptionCreateInputSubscription = (SubscriptionCreateInputSubscription) o;
    return Objects.equals(this.externalCustomerId, subscriptionCreateInputSubscription.externalCustomerId) &&
        Objects.equals(this.planCode, subscriptionCreateInputSubscription.planCode) &&
        Objects.equals(this.name, subscriptionCreateInputSubscription.name) &&
        Objects.equals(this.externalId, subscriptionCreateInputSubscription.externalId) &&
        Objects.equals(this.billingTime, subscriptionCreateInputSubscription.billingTime) &&
        Objects.equals(this.subscriptionAt, subscriptionCreateInputSubscription.subscriptionAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalCustomerId, planCode, name, externalId, billingTime, subscriptionAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCreateInputSubscription {\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    planCode: ").append(toIndentedString(planCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    billingTime: ").append(toIndentedString(billingTime)).append("\n");
    sb.append("    subscriptionAt: ").append(toIndentedString(subscriptionAt)).append("\n");
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
    openapiFields.add("external_customer_id");
    openapiFields.add("plan_code");
    openapiFields.add("name");
    openapiFields.add("external_id");
    openapiFields.add("billing_time");
    openapiFields.add("subscription_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_customer_id");
    openapiRequiredFields.add("plan_code");
    openapiRequiredFields.add("external_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionCreateInputSubscription
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubscriptionCreateInputSubscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionCreateInputSubscription is not found in the empty JSON string", SubscriptionCreateInputSubscription.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionCreateInputSubscription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionCreateInputSubscription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionCreateInputSubscription.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("external_customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_customer_id").toString()));
      }
      if (!jsonObj.get("plan_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_code").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("billing_time") != null && !jsonObj.get("billing_time").isJsonNull()) && !jsonObj.get("billing_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionCreateInputSubscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionCreateInputSubscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionCreateInputSubscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionCreateInputSubscription.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionCreateInputSubscription>() {
           @Override
           public void write(JsonWriter out, SubscriptionCreateInputSubscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionCreateInputSubscription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionCreateInputSubscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionCreateInputSubscription
  * @throws IOException if the JSON string is invalid with respect to SubscriptionCreateInputSubscription
  */
  public static SubscriptionCreateInputSubscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionCreateInputSubscription.class);
  }

 /**
  * Convert an instance of SubscriptionCreateInputSubscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
