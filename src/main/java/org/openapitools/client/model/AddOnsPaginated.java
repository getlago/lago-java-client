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
import org.openapitools.client.model.AddOnObject;
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
 * AddOnsPaginated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class AddOnsPaginated {
  public static final String SERIALIZED_NAME_ADD_ONS = "add_ons";
  @SerializedName(SERIALIZED_NAME_ADD_ONS)
  private List<AddOnObject> addOns = new ArrayList<>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private PaginationMeta meta;

  public AddOnsPaginated() {
  }

  public AddOnsPaginated addOns(List<AddOnObject> addOns) {
    
    this.addOns = addOns;
    return this;
  }

  public AddOnsPaginated addAddOnsItem(AddOnObject addOnsItem) {
    if (this.addOns == null) {
      this.addOns = new ArrayList<>();
    }
    this.addOns.add(addOnsItem);
    return this;
  }

   /**
   * Get addOns
   * @return addOns
  **/
  @javax.annotation.Nonnull
  public List<AddOnObject> getAddOns() {
    return addOns;
  }


  public void setAddOns(List<AddOnObject> addOns) {
    this.addOns = addOns;
  }


  public AddOnsPaginated meta(PaginationMeta meta) {
    
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
    AddOnsPaginated addOnsPaginated = (AddOnsPaginated) o;
    return Objects.equals(this.addOns, addOnsPaginated.addOns) &&
        Objects.equals(this.meta, addOnsPaginated.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOns, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOnsPaginated {\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
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
    openapiFields.add("add_ons");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("add_ons");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddOnsPaginated
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddOnsPaginated.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddOnsPaginated is not found in the empty JSON string", AddOnsPaginated.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddOnsPaginated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddOnsPaginated` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddOnsPaginated.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("add_ons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_ons` to be an array in the JSON string but got `%s`", jsonObj.get("add_ons").toString()));
      }

      JsonArray jsonArrayaddOns = jsonObj.getAsJsonArray("add_ons");
      // validate the required field `add_ons` (array)
      for (int i = 0; i < jsonArrayaddOns.size(); i++) {
        AddOnObject.validateJsonElement(jsonArrayaddOns.get(i));
      };
      // validate the required field `meta`
      PaginationMeta.validateJsonElement(jsonObj.get("meta"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddOnsPaginated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddOnsPaginated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddOnsPaginated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddOnsPaginated.class));

       return (TypeAdapter<T>) new TypeAdapter<AddOnsPaginated>() {
           @Override
           public void write(JsonWriter out, AddOnsPaginated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddOnsPaginated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddOnsPaginated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddOnsPaginated
  * @throws IOException if the JSON string is invalid with respect to AddOnsPaginated
  */
  public static AddOnsPaginated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddOnsPaginated.class);
  }

 /**
  * Convert an instance of AddOnsPaginated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

