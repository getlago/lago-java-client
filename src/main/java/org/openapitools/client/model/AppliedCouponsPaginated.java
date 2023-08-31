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
import org.openapitools.client.model.AppliedCouponObjectExtended;
import org.openapitools.client.model.PaginationMeta;

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
 * AppliedCouponsPaginated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class AppliedCouponsPaginated {
  public static final String SERIALIZED_NAME_APPLIED_COUPONS = "applied_coupons";
  @SerializedName(SERIALIZED_NAME_APPLIED_COUPONS)
  private List<AppliedCouponObjectExtended> appliedCoupons = new ArrayList<>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private PaginationMeta meta;

  public AppliedCouponsPaginated() {
  }

  public AppliedCouponsPaginated appliedCoupons(List<AppliedCouponObjectExtended> appliedCoupons) {
    
    this.appliedCoupons = appliedCoupons;
    return this;
  }

  public AppliedCouponsPaginated addAppliedCouponsItem(AppliedCouponObjectExtended appliedCouponsItem) {
    if (this.appliedCoupons == null) {
      this.appliedCoupons = new ArrayList<>();
    }
    this.appliedCoupons.add(appliedCouponsItem);
    return this;
  }

   /**
   * Get appliedCoupons
   * @return appliedCoupons
  **/
  @javax.annotation.Nonnull
  public List<AppliedCouponObjectExtended> getAppliedCoupons() {
    return appliedCoupons;
  }


  public void setAppliedCoupons(List<AppliedCouponObjectExtended> appliedCoupons) {
    this.appliedCoupons = appliedCoupons;
  }


  public AppliedCouponsPaginated meta(PaginationMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  public PaginationMeta getMeta() {
    return meta;
  }


  public void setMeta(PaginationMeta meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppliedCouponsPaginated appliedCouponsPaginated = (AppliedCouponsPaginated) o;
    return Objects.equals(this.appliedCoupons, appliedCouponsPaginated.appliedCoupons) &&
        Objects.equals(this.meta, appliedCouponsPaginated.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedCoupons, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppliedCouponsPaginated {\n");
    sb.append("    appliedCoupons: ").append(toIndentedString(appliedCoupons)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("applied_coupons");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applied_coupons");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppliedCouponsPaginated
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppliedCouponsPaginated.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppliedCouponsPaginated is not found in the empty JSON string", AppliedCouponsPaginated.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppliedCouponsPaginated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppliedCouponsPaginated` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppliedCouponsPaginated.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("applied_coupons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `applied_coupons` to be an array in the JSON string but got `%s`", jsonObj.get("applied_coupons").toString()));
      }

      JsonArray jsonArrayappliedCoupons = jsonObj.getAsJsonArray("applied_coupons");
      // validate the required field `applied_coupons` (array)
      for (int i = 0; i < jsonArrayappliedCoupons.size(); i++) {
        AppliedCouponObjectExtended.validateJsonElement(jsonArrayappliedCoupons.get(i));
      };
      // validate the required field `meta`
      PaginationMeta.validateJsonElement(jsonObj.get("meta"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppliedCouponsPaginated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppliedCouponsPaginated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppliedCouponsPaginated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppliedCouponsPaginated.class));

       return (TypeAdapter<T>) new TypeAdapter<AppliedCouponsPaginated>() {
           @Override
           public void write(JsonWriter out, AppliedCouponsPaginated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppliedCouponsPaginated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppliedCouponsPaginated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppliedCouponsPaginated
  * @throws IOException if the JSON string is invalid with respect to AppliedCouponsPaginated
  */
  public static AppliedCouponsPaginated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppliedCouponsPaginated.class);
  }

 /**
  * Convert an instance of AppliedCouponsPaginated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

