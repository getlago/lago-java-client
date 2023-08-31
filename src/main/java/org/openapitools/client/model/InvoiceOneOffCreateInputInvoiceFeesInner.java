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
import java.util.ArrayList;
import java.util.List;
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
 * InvoiceOneOffCreateInputInvoiceFeesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class InvoiceOneOffCreateInputInvoiceFeesInner {
  public static final String SERIALIZED_NAME_ADD_ON_CODE = "add_on_code";
  @SerializedName(SERIALIZED_NAME_ADD_ON_CODE)
  private String addOnCode;

  public static final String SERIALIZED_NAME_UNIT_AMOUNT_CENTS = "unit_amount_cents";
  @SerializedName(SERIALIZED_NAME_UNIT_AMOUNT_CENTS)
  private Integer unitAmountCents;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private String units;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAX_CODES = "tax_codes";
  @SerializedName(SERIALIZED_NAME_TAX_CODES)
  private List<String> taxCodes;

  public InvoiceOneOffCreateInputInvoiceFeesInner() {
  }

  public InvoiceOneOffCreateInputInvoiceFeesInner addOnCode(String addOnCode) {
    
    this.addOnCode = addOnCode;
    return this;
  }

   /**
   * The code of the add-on used as invoice item.
   * @return addOnCode
  **/
  @javax.annotation.Nonnull
  public String getAddOnCode() {
    return addOnCode;
  }


  public void setAddOnCode(String addOnCode) {
    this.addOnCode = addOnCode;
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner unitAmountCents(Integer unitAmountCents) {
    
    this.unitAmountCents = unitAmountCents;
    return this;
  }

   /**
   * The amount of the fee per unit, expressed in cents. By default, the amount of the add-on is used.
   * @return unitAmountCents
  **/
  @javax.annotation.Nullable
  public Integer getUnitAmountCents() {
    return unitAmountCents;
  }


  public void setUnitAmountCents(Integer unitAmountCents) {
    this.unitAmountCents = unitAmountCents;
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner units(String units) {
    
    this.units = units;
    return this;
  }

   /**
   * The quantity of units associated with the fee. By default, only 1 unit is added to the invoice.
   * @return units
  **/
  @javax.annotation.Nullable
  public String getUnits() {
    return units;
  }


  public void setUnits(String units) {
    this.units = units;
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * This is a description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner taxCodes(List<String> taxCodes) {
    
    this.taxCodes = taxCodes;
    return this;
  }

  public InvoiceOneOffCreateInputInvoiceFeesInner addTaxCodesItem(String taxCodesItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceOneOffCreateInputInvoiceFeesInner invoiceOneOffCreateInputInvoiceFeesInner = (InvoiceOneOffCreateInputInvoiceFeesInner) o;
    return Objects.equals(this.addOnCode, invoiceOneOffCreateInputInvoiceFeesInner.addOnCode) &&
        Objects.equals(this.unitAmountCents, invoiceOneOffCreateInputInvoiceFeesInner.unitAmountCents) &&
        Objects.equals(this.units, invoiceOneOffCreateInputInvoiceFeesInner.units) &&
        Objects.equals(this.description, invoiceOneOffCreateInputInvoiceFeesInner.description) &&
        Objects.equals(this.taxCodes, invoiceOneOffCreateInputInvoiceFeesInner.taxCodes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOnCode, unitAmountCents, units, description, taxCodes);
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
    sb.append("class InvoiceOneOffCreateInputInvoiceFeesInner {\n");
    sb.append("    addOnCode: ").append(toIndentedString(addOnCode)).append("\n");
    sb.append("    unitAmountCents: ").append(toIndentedString(unitAmountCents)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    taxCodes: ").append(toIndentedString(taxCodes)).append("\n");
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
    openapiFields.add("add_on_code");
    openapiFields.add("unit_amount_cents");
    openapiFields.add("units");
    openapiFields.add("description");
    openapiFields.add("tax_codes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("add_on_code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceOneOffCreateInputInvoiceFeesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceOneOffCreateInputInvoiceFeesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceOneOffCreateInputInvoiceFeesInner is not found in the empty JSON string", InvoiceOneOffCreateInputInvoiceFeesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceOneOffCreateInputInvoiceFeesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceOneOffCreateInputInvoiceFeesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceOneOffCreateInputInvoiceFeesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("add_on_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_on_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("add_on_code").toString()));
      }
      if ((jsonObj.get("units") != null && !jsonObj.get("units").isJsonNull()) && !jsonObj.get("units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("units").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tax_codes") != null && !jsonObj.get("tax_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_codes` to be an array in the JSON string but got `%s`", jsonObj.get("tax_codes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceOneOffCreateInputInvoiceFeesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceOneOffCreateInputInvoiceFeesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceOneOffCreateInputInvoiceFeesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceOneOffCreateInputInvoiceFeesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceOneOffCreateInputInvoiceFeesInner>() {
           @Override
           public void write(JsonWriter out, InvoiceOneOffCreateInputInvoiceFeesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceOneOffCreateInputInvoiceFeesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceOneOffCreateInputInvoiceFeesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceOneOffCreateInputInvoiceFeesInner
  * @throws IOException if the JSON string is invalid with respect to InvoiceOneOffCreateInputInvoiceFeesInner
  */
  public static InvoiceOneOffCreateInputInvoiceFeesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceOneOffCreateInputInvoiceFeesInner.class);
  }

 /**
  * Convert an instance of InvoiceOneOffCreateInputInvoiceFeesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
