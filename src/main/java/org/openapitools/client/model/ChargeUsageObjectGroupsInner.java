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
import java.util.UUID;

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
 * ChargeUsageObjectGroupsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class ChargeUsageObjectGroupsInner {
  public static final String SERIALIZED_NAME_LAGO_ID = "lago_id";
  @SerializedName(SERIALIZED_NAME_LAGO_ID)
  private UUID lagoId;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private BigDecimal units;

  public static final String SERIALIZED_NAME_AMOUNT_CENTS = "amount_cents";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CENTS)
  private Integer amountCents;

  public ChargeUsageObjectGroupsInner() {
  }

  public ChargeUsageObjectGroupsInner lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Get lagoId
   * @return lagoId
  **/
  @javax.annotation.Nullable
  public UUID getLagoId() {
    return lagoId;
  }


  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public ChargeUsageObjectGroupsInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ChargeUsageObjectGroupsInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ChargeUsageObjectGroupsInner units(BigDecimal units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  public BigDecimal getUnits() {
    return units;
  }


  public void setUnits(BigDecimal units) {
    this.units = units;
  }


  public ChargeUsageObjectGroupsInner amountCents(Integer amountCents) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeUsageObjectGroupsInner chargeUsageObjectGroupsInner = (ChargeUsageObjectGroupsInner) o;
    return Objects.equals(this.lagoId, chargeUsageObjectGroupsInner.lagoId) &&
        Objects.equals(this.key, chargeUsageObjectGroupsInner.key) &&
        Objects.equals(this.value, chargeUsageObjectGroupsInner.value) &&
        Objects.equals(this.units, chargeUsageObjectGroupsInner.units) &&
        Objects.equals(this.amountCents, chargeUsageObjectGroupsInner.amountCents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, key, value, units, amountCents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeUsageObjectGroupsInner {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("value");
    openapiFields.add("units");
    openapiFields.add("amount_cents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChargeUsageObjectGroupsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChargeUsageObjectGroupsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargeUsageObjectGroupsInner is not found in the empty JSON string", ChargeUsageObjectGroupsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChargeUsageObjectGroupsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChargeUsageObjectGroupsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("lago_id") != null && !jsonObj.get("lago_id").isJsonNull()) && !jsonObj.get("lago_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargeUsageObjectGroupsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargeUsageObjectGroupsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargeUsageObjectGroupsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargeUsageObjectGroupsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargeUsageObjectGroupsInner>() {
           @Override
           public void write(JsonWriter out, ChargeUsageObjectGroupsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargeUsageObjectGroupsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChargeUsageObjectGroupsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeUsageObjectGroupsInner
  * @throws IOException if the JSON string is invalid with respect to ChargeUsageObjectGroupsInner
  */
  public static ChargeUsageObjectGroupsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeUsageObjectGroupsInner.class);
  }

 /**
  * Convert an instance of ChargeUsageObjectGroupsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

