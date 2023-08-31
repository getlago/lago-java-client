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
import org.openapitools.client.model.EventBatchInputEventProperties;

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
 * EventBatchInputEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:20:28.589842Z[Etc/UTC]")
public class EventBatchInputEvent {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID)
  private String externalCustomerId;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBSCRIPTION_IDS = "external_subscription_ids";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBSCRIPTION_IDS)
  private List<String> externalSubscriptionIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private EventBatchInputEventProperties properties;

  public EventBatchInputEvent() {
  }

  public EventBatchInputEvent transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * This field represents a unique identifier for the event. It is crucial for ensuring idempotency, meaning that each event can be uniquely identified and processed without causing any unintended side effects.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public EventBatchInputEvent externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application). This field is optional if you send the &#x60;external_subscription_ids&#x60;, targeting a specific subscription.
   * @return externalCustomerId
  **/
  @javax.annotation.Nullable
  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public EventBatchInputEvent externalSubscriptionIds(List<String> externalSubscriptionIds) {
    
    this.externalSubscriptionIds = externalSubscriptionIds;
    return this;
  }

  public EventBatchInputEvent addExternalSubscriptionIdsItem(String externalSubscriptionIdsItem) {
    if (this.externalSubscriptionIds == null) {
      this.externalSubscriptionIds = new ArrayList<>();
    }
    this.externalSubscriptionIds.add(externalSubscriptionIdsItem);
    return this;
  }

   /**
   * Array of unique identifiers of the targeted subscriptions within your application.
   * @return externalSubscriptionIds
  **/
  @javax.annotation.Nonnull
  public List<String> getExternalSubscriptionIds() {
    return externalSubscriptionIds;
  }


  public void setExternalSubscriptionIds(List<String> externalSubscriptionIds) {
    this.externalSubscriptionIds = externalSubscriptionIds;
  }


  public EventBatchInputEvent code(String code) {
    
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


  public EventBatchInputEvent timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * This field captures the Unix timestamp in seconds indicating the occurrence of the event in Coordinated Universal Time (UTC). If this timestamp is not provided, the API will automatically set it to the time of event reception.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public EventBatchInputEvent properties(EventBatchInputEventProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  public EventBatchInputEventProperties getProperties() {
    return properties;
  }


  public void setProperties(EventBatchInputEventProperties properties) {
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
    EventBatchInputEvent eventBatchInputEvent = (EventBatchInputEvent) o;
    return Objects.equals(this.transactionId, eventBatchInputEvent.transactionId) &&
        Objects.equals(this.externalCustomerId, eventBatchInputEvent.externalCustomerId) &&
        Objects.equals(this.externalSubscriptionIds, eventBatchInputEvent.externalSubscriptionIds) &&
        Objects.equals(this.code, eventBatchInputEvent.code) &&
        Objects.equals(this.timestamp, eventBatchInputEvent.timestamp) &&
        Objects.equals(this.properties, eventBatchInputEvent.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, externalCustomerId, externalSubscriptionIds, code, timestamp, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventBatchInputEvent {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    externalSubscriptionIds: ").append(toIndentedString(externalSubscriptionIds)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("transaction_id");
    openapiFields.add("external_customer_id");
    openapiFields.add("external_subscription_ids");
    openapiFields.add("code");
    openapiFields.add("timestamp");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transaction_id");
    openapiRequiredFields.add("external_subscription_ids");
    openapiRequiredFields.add("code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventBatchInputEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventBatchInputEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventBatchInputEvent is not found in the empty JSON string", EventBatchInputEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventBatchInputEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventBatchInputEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventBatchInputEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
      if ((jsonObj.get("external_customer_id") != null && !jsonObj.get("external_customer_id").isJsonNull()) && !jsonObj.get("external_customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_customer_id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("external_subscription_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("external_subscription_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_subscription_ids` to be an array in the JSON string but got `%s`", jsonObj.get("external_subscription_ids").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventBatchInputEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventBatchInputEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventBatchInputEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventBatchInputEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<EventBatchInputEvent>() {
           @Override
           public void write(JsonWriter out, EventBatchInputEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventBatchInputEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventBatchInputEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventBatchInputEvent
  * @throws IOException if the JSON string is invalid with respect to EventBatchInputEvent
  */
  public static EventBatchInputEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventBatchInputEvent.class);
  }

 /**
  * Convert an instance of EventBatchInputEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

