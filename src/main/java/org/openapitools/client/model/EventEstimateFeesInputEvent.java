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
 * EventEstimateFeesInputEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:24:39.843670Z[Etc/UTC]")
public class EventEstimateFeesInputEvent {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID)
  private String externalCustomerId;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBSCRIPTION_ID = "external_subscription_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBSCRIPTION_ID)
  private String externalSubscriptionId;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Object properties;

  public EventEstimateFeesInputEvent() {
  }

  public EventEstimateFeesInputEvent code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code that identifies a targeted billable metric. It is essential that this code matches the &#x60;code&#x60; property of one of your active billable metrics. If the provided code does not correspond to any active billable metric, it will be ignored during the process.
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public EventEstimateFeesInputEvent externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application). This field is optional if you send the &#x60;external_subscription_id&#x60;, targeting a specific subscription.
   * @return externalCustomerId
  **/
  @javax.annotation.Nullable
  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public EventEstimateFeesInputEvent externalSubscriptionId(String externalSubscriptionId) {
    
    this.externalSubscriptionId = externalSubscriptionId;
    return this;
  }

   /**
   * The unique identifier of the subscription within your application. It is a mandatory field when the customer possesses multiple subscriptions or when the &#x60;external_customer_id&#x60; is not provided.
   * @return externalSubscriptionId
  **/
  @javax.annotation.Nullable
  public String getExternalSubscriptionId() {
    return externalSubscriptionId;
  }


  public void setExternalSubscriptionId(String externalSubscriptionId) {
    this.externalSubscriptionId = externalSubscriptionId;
  }


  public EventEstimateFeesInputEvent properties(Object properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * This field represents additional properties associated with the event, which are utilized in the calculation of the final fee. This object becomes mandatory when the targeted billable metric employs a &#x60;sum_agg&#x60;, &#x60;max_agg&#x60;, or &#x60;unique_count_agg&#x60; aggregation method. However, when using a simple &#x60;count_agg&#x60;, this object is not required.
   * @return properties
  **/
  @javax.annotation.Nullable
  public Object getProperties() {
    return properties;
  }


  public void setProperties(Object properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEstimateFeesInputEvent eventEstimateFeesInputEvent = (EventEstimateFeesInputEvent) o;
    return Objects.equals(this.code, eventEstimateFeesInputEvent.code) &&
        Objects.equals(this.externalCustomerId, eventEstimateFeesInputEvent.externalCustomerId) &&
        Objects.equals(this.externalSubscriptionId, eventEstimateFeesInputEvent.externalSubscriptionId) &&
        Objects.equals(this.properties, eventEstimateFeesInputEvent.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, externalCustomerId, externalSubscriptionId, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEstimateFeesInputEvent {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    externalSubscriptionId: ").append(toIndentedString(externalSubscriptionId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("external_customer_id");
    openapiFields.add("external_subscription_id");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventEstimateFeesInputEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventEstimateFeesInputEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventEstimateFeesInputEvent is not found in the empty JSON string", EventEstimateFeesInputEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventEstimateFeesInputEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventEstimateFeesInputEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventEstimateFeesInputEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("external_customer_id") != null && !jsonObj.get("external_customer_id").isJsonNull()) && !jsonObj.get("external_customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_customer_id").toString()));
      }
      if ((jsonObj.get("external_subscription_id") != null && !jsonObj.get("external_subscription_id").isJsonNull()) && !jsonObj.get("external_subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_subscription_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventEstimateFeesInputEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventEstimateFeesInputEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventEstimateFeesInputEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventEstimateFeesInputEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<EventEstimateFeesInputEvent>() {
           @Override
           public void write(JsonWriter out, EventEstimateFeesInputEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventEstimateFeesInputEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventEstimateFeesInputEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventEstimateFeesInputEvent
  * @throws IOException if the JSON string is invalid with respect to EventEstimateFeesInputEvent
  */
  public static EventEstimateFeesInputEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventEstimateFeesInputEvent.class);
  }

 /**
  * Convert an instance of EventEstimateFeesInputEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
