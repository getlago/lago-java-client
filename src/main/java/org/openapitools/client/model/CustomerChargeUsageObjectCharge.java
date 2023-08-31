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
 * Object listing all the properties for a specific charge item.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class CustomerChargeUsageObjectCharge {
  public static final String SERIALIZED_NAME_LAGO_ID = "lago_id";
  @SerializedName(SERIALIZED_NAME_LAGO_ID)
  private UUID lagoId;

  /**
   * The pricing model applied to this charge. Possible values are standard, &#x60;graduated&#x60;, &#x60;percentage&#x60;, &#x60;package&#x60; or &#x60;volume&#x60;.
   */
  @JsonAdapter(ChargeModelEnum.Adapter.class)
  public enum ChargeModelEnum {
    STANDARD("standard"),
    
    GRADUATED("graduated"),
    
    PACKAGE("package"),
    
    PERCENTAGE("percentage"),
    
    VOLUME("volume");

    private String value;

    ChargeModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargeModelEnum fromValue(String value) {
      for (ChargeModelEnum b : ChargeModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChargeModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargeModelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChargeModelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHARGE_MODEL = "charge_model";
  @SerializedName(SERIALIZED_NAME_CHARGE_MODEL)
  private ChargeModelEnum chargeModel;

  public CustomerChargeUsageObjectCharge() {
  }

  public CustomerChargeUsageObjectCharge lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier assigned to the charge within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the charge’s record within the Lago system.
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  public UUID getLagoId() {
    return lagoId;
  }


  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public CustomerChargeUsageObjectCharge chargeModel(ChargeModelEnum chargeModel) {
    
    this.chargeModel = chargeModel;
    return this;
  }

   /**
   * The pricing model applied to this charge. Possible values are standard, &#x60;graduated&#x60;, &#x60;percentage&#x60;, &#x60;package&#x60; or &#x60;volume&#x60;.
   * @return chargeModel
  **/
  @javax.annotation.Nonnull
  public ChargeModelEnum getChargeModel() {
    return chargeModel;
  }


  public void setChargeModel(ChargeModelEnum chargeModel) {
    this.chargeModel = chargeModel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerChargeUsageObjectCharge customerChargeUsageObjectCharge = (CustomerChargeUsageObjectCharge) o;
    return Objects.equals(this.lagoId, customerChargeUsageObjectCharge.lagoId) &&
        Objects.equals(this.chargeModel, customerChargeUsageObjectCharge.chargeModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, chargeModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerChargeUsageObjectCharge {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
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
    openapiFields.add("charge_model");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lago_id");
    openapiRequiredFields.add("charge_model");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerChargeUsageObjectCharge
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerChargeUsageObjectCharge.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerChargeUsageObjectCharge is not found in the empty JSON string", CustomerChargeUsageObjectCharge.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerChargeUsageObjectCharge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerChargeUsageObjectCharge` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerChargeUsageObjectCharge.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("lago_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_id").toString()));
      }
      if (!jsonObj.get("charge_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_model").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerChargeUsageObjectCharge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerChargeUsageObjectCharge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerChargeUsageObjectCharge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerChargeUsageObjectCharge.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerChargeUsageObjectCharge>() {
           @Override
           public void write(JsonWriter out, CustomerChargeUsageObjectCharge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerChargeUsageObjectCharge read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerChargeUsageObjectCharge given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerChargeUsageObjectCharge
  * @throws IOException if the JSON string is invalid with respect to CustomerChargeUsageObjectCharge
  */
  public static CustomerChargeUsageObjectCharge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerChargeUsageObjectCharge.class);
  }

 /**
  * Convert an instance of CustomerChargeUsageObjectCharge to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

