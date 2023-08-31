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
import org.openapitools.client.model.BillableMetricObject;
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
 * BillableMetricsPaginated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class BillableMetricsPaginated {
  public static final String SERIALIZED_NAME_BILLABLE_METRICS = "billable_metrics";
  @SerializedName(SERIALIZED_NAME_BILLABLE_METRICS)
  private List<BillableMetricObject> billableMetrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private PaginationMeta meta;

  public BillableMetricsPaginated() {
  }

  public BillableMetricsPaginated billableMetrics(List<BillableMetricObject> billableMetrics) {
    
    this.billableMetrics = billableMetrics;
    return this;
  }

  public BillableMetricsPaginated addBillableMetricsItem(BillableMetricObject billableMetricsItem) {
    if (this.billableMetrics == null) {
      this.billableMetrics = new ArrayList<>();
    }
    this.billableMetrics.add(billableMetricsItem);
    return this;
  }

   /**
   * Get billableMetrics
   * @return billableMetrics
  **/
  @javax.annotation.Nonnull
  public List<BillableMetricObject> getBillableMetrics() {
    return billableMetrics;
  }


  public void setBillableMetrics(List<BillableMetricObject> billableMetrics) {
    this.billableMetrics = billableMetrics;
  }


  public BillableMetricsPaginated meta(PaginationMeta meta) {
    
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
    BillableMetricsPaginated billableMetricsPaginated = (BillableMetricsPaginated) o;
    return Objects.equals(this.billableMetrics, billableMetricsPaginated.billableMetrics) &&
        Objects.equals(this.meta, billableMetricsPaginated.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableMetrics, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableMetricsPaginated {\n");
    sb.append("    billableMetrics: ").append(toIndentedString(billableMetrics)).append("\n");
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
    openapiFields.add("billable_metrics");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("billable_metrics");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BillableMetricsPaginated
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BillableMetricsPaginated.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillableMetricsPaginated is not found in the empty JSON string", BillableMetricsPaginated.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BillableMetricsPaginated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillableMetricsPaginated` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BillableMetricsPaginated.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("billable_metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `billable_metrics` to be an array in the JSON string but got `%s`", jsonObj.get("billable_metrics").toString()));
      }

      JsonArray jsonArraybillableMetrics = jsonObj.getAsJsonArray("billable_metrics");
      // validate the required field `billable_metrics` (array)
      for (int i = 0; i < jsonArraybillableMetrics.size(); i++) {
        BillableMetricObject.validateJsonElement(jsonArraybillableMetrics.get(i));
      };
      // validate the required field `meta`
      PaginationMeta.validateJsonElement(jsonObj.get("meta"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillableMetricsPaginated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillableMetricsPaginated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillableMetricsPaginated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillableMetricsPaginated.class));

       return (TypeAdapter<T>) new TypeAdapter<BillableMetricsPaginated>() {
           @Override
           public void write(JsonWriter out, BillableMetricsPaginated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillableMetricsPaginated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BillableMetricsPaginated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillableMetricsPaginated
  * @throws IOException if the JSON string is invalid with respect to BillableMetricsPaginated
  */
  public static BillableMetricsPaginated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillableMetricsPaginated.class);
  }

 /**
  * Convert an instance of BillableMetricsPaginated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

