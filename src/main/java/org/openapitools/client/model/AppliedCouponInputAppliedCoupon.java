/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.32.0-beta
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
 * AppliedCouponInputAppliedCoupon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class AppliedCouponInputAppliedCoupon {
  public static final String SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID)
  private String externalCustomerId;

  public static final String SERIALIZED_NAME_COUPON_CODE = "coupon_code";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  /**
   * Frequency type
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    ONCE("once"),
    
    RECURRING("recurring");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_FREQUENCY_DURATION = "frequency_duration";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_DURATION)
  private Integer frequencyDuration;

  public static final String SERIALIZED_NAME_AMOUNT_CENTS = "amount_cents";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CENTS)
  private Integer amountCents;

  public static final String SERIALIZED_NAME_AMOUNT_CURRENCY = "amount_currency";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CURRENCY)
  private String amountCurrency;

  public static final String SERIALIZED_NAME_PERCENTAGE_RATE = "percentage_rate";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_RATE)
  private BigDecimal percentageRate;

  public AppliedCouponInputAppliedCoupon() {
  }

  public AppliedCouponInputAppliedCoupon externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * Get externalCustomerId
   * @return externalCustomerId
  **/
  @javax.annotation.Nonnull
  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public AppliedCouponInputAppliedCoupon couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Get couponCode
   * @return couponCode
  **/
  @javax.annotation.Nonnull
  public String getCouponCode() {
    return couponCode;
  }


  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public AppliedCouponInputAppliedCoupon frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Frequency type
   * @return frequency
  **/
  @javax.annotation.Nullable
  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public AppliedCouponInputAppliedCoupon frequencyDuration(Integer frequencyDuration) {
    
    this.frequencyDuration = frequencyDuration;
    return this;
  }

   /**
   * Get frequencyDuration
   * @return frequencyDuration
  **/
  @javax.annotation.Nullable
  public Integer getFrequencyDuration() {
    return frequencyDuration;
  }


  public void setFrequencyDuration(Integer frequencyDuration) {
    this.frequencyDuration = frequencyDuration;
  }


  public AppliedCouponInputAppliedCoupon amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * Get amountCents
   * @return amountCents
  **/
  @javax.annotation.Nullable
  public Integer getAmountCents() {
    return amountCents;
  }


  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public AppliedCouponInputAppliedCoupon amountCurrency(String amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nullable
  public String getAmountCurrency() {
    return amountCurrency;
  }


  public void setAmountCurrency(String amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public AppliedCouponInputAppliedCoupon percentageRate(BigDecimal percentageRate) {
    
    this.percentageRate = percentageRate;
    return this;
  }

   /**
   * Get percentageRate
   * @return percentageRate
  **/
  @javax.annotation.Nullable
  public BigDecimal getPercentageRate() {
    return percentageRate;
  }


  public void setPercentageRate(BigDecimal percentageRate) {
    this.percentageRate = percentageRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppliedCouponInputAppliedCoupon appliedCouponInputAppliedCoupon = (AppliedCouponInputAppliedCoupon) o;
    return Objects.equals(this.externalCustomerId, appliedCouponInputAppliedCoupon.externalCustomerId) &&
        Objects.equals(this.couponCode, appliedCouponInputAppliedCoupon.couponCode) &&
        Objects.equals(this.frequency, appliedCouponInputAppliedCoupon.frequency) &&
        Objects.equals(this.frequencyDuration, appliedCouponInputAppliedCoupon.frequencyDuration) &&
        Objects.equals(this.amountCents, appliedCouponInputAppliedCoupon.amountCents) &&
        Objects.equals(this.amountCurrency, appliedCouponInputAppliedCoupon.amountCurrency) &&
        Objects.equals(this.percentageRate, appliedCouponInputAppliedCoupon.percentageRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalCustomerId, couponCode, frequency, frequencyDuration, amountCents, amountCurrency, percentageRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppliedCouponInputAppliedCoupon {\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyDuration: ").append(toIndentedString(frequencyDuration)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    percentageRate: ").append(toIndentedString(percentageRate)).append("\n");
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
    openapiFields.add("coupon_code");
    openapiFields.add("frequency");
    openapiFields.add("frequency_duration");
    openapiFields.add("amount_cents");
    openapiFields.add("amount_currency");
    openapiFields.add("percentage_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_customer_id");
    openapiRequiredFields.add("coupon_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppliedCouponInputAppliedCoupon
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppliedCouponInputAppliedCoupon.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppliedCouponInputAppliedCoupon is not found in the empty JSON string", AppliedCouponInputAppliedCoupon.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppliedCouponInputAppliedCoupon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppliedCouponInputAppliedCoupon` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppliedCouponInputAppliedCoupon.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("external_customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_customer_id").toString()));
      }
      if (!jsonObj.get("coupon_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupon_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupon_code").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("amount_currency") != null && !jsonObj.get("amount_currency").isJsonNull()) && !jsonObj.get("amount_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppliedCouponInputAppliedCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppliedCouponInputAppliedCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppliedCouponInputAppliedCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppliedCouponInputAppliedCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<AppliedCouponInputAppliedCoupon>() {
           @Override
           public void write(JsonWriter out, AppliedCouponInputAppliedCoupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppliedCouponInputAppliedCoupon read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppliedCouponInputAppliedCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppliedCouponInputAppliedCoupon
  * @throws IOException if the JSON string is invalid with respect to AppliedCouponInputAppliedCoupon
  */
  public static AppliedCouponInputAppliedCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppliedCouponInputAppliedCoupon.class);
  }

 /**
  * Convert an instance of AppliedCouponInputAppliedCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

