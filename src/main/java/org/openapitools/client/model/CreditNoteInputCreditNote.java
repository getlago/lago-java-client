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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.CreditNoteInputCreditNoteItemsInner;

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
 * CreditNoteInputCreditNote
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class CreditNoteInputCreditNote {
  public static final String SERIALIZED_NAME_INVOICE_ID = "invoice_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private UUID invoiceId;

  /**
   * Reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    DUPLICATED_CHARGE("duplicated_charge"),
    
    PRODUCT_UNSATISFACTORY("product_unsatisfactory"),
    
    ORDER_CHANGE("order_change"),
    
    ORDER_CANCELLATION("order_cancellation"),
    
    FRAUDULENT_CHARGE("fraudulent_charge"),
    
    OTHER("other");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREDIT_AMOUNT_CENTS = "credit_amount_cents";
  @SerializedName(SERIALIZED_NAME_CREDIT_AMOUNT_CENTS)
  private Integer creditAmountCents;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT_CENTS = "refund_amount_cents";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT_CENTS)
  private Integer refundAmountCents;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CreditNoteInputCreditNoteItemsInner> items = new ArrayList<>();

  public CreditNoteInputCreditNote() {
  }

  public CreditNoteInputCreditNote invoiceId(UUID invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @javax.annotation.Nonnull
  public UUID getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(UUID invoiceId) {
    this.invoiceId = invoiceId;
  }


  public CreditNoteInputCreditNote reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason
   * @return reason
  **/
  @javax.annotation.Nonnull
  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public CreditNoteInputCreditNote description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreditNoteInputCreditNote creditAmountCents(Integer creditAmountCents) {
    
    this.creditAmountCents = creditAmountCents;
    return this;
  }

   /**
   * Get creditAmountCents
   * @return creditAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getCreditAmountCents() {
    return creditAmountCents;
  }


  public void setCreditAmountCents(Integer creditAmountCents) {
    this.creditAmountCents = creditAmountCents;
  }


  public CreditNoteInputCreditNote refundAmountCents(Integer refundAmountCents) {
    
    this.refundAmountCents = refundAmountCents;
    return this;
  }

   /**
   * Get refundAmountCents
   * @return refundAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getRefundAmountCents() {
    return refundAmountCents;
  }


  public void setRefundAmountCents(Integer refundAmountCents) {
    this.refundAmountCents = refundAmountCents;
  }


  public CreditNoteInputCreditNote items(List<CreditNoteInputCreditNoteItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public CreditNoteInputCreditNote addItemsItem(CreditNoteInputCreditNoteItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  public List<CreditNoteInputCreditNoteItemsInner> getItems() {
    return items;
  }


  public void setItems(List<CreditNoteInputCreditNoteItemsInner> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNoteInputCreditNote creditNoteInputCreditNote = (CreditNoteInputCreditNote) o;
    return Objects.equals(this.invoiceId, creditNoteInputCreditNote.invoiceId) &&
        Objects.equals(this.reason, creditNoteInputCreditNote.reason) &&
        Objects.equals(this.description, creditNoteInputCreditNote.description) &&
        Objects.equals(this.creditAmountCents, creditNoteInputCreditNote.creditAmountCents) &&
        Objects.equals(this.refundAmountCents, creditNoteInputCreditNote.refundAmountCents) &&
        Objects.equals(this.items, creditNoteInputCreditNote.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, reason, description, creditAmountCents, refundAmountCents, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteInputCreditNote {\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creditAmountCents: ").append(toIndentedString(creditAmountCents)).append("\n");
    sb.append("    refundAmountCents: ").append(toIndentedString(refundAmountCents)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("invoice_id");
    openapiFields.add("reason");
    openapiFields.add("description");
    openapiFields.add("credit_amount_cents");
    openapiFields.add("refund_amount_cents");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoice_id");
    openapiRequiredFields.add("reason");
    openapiRequiredFields.add("credit_amount_cents");
    openapiRequiredFields.add("refund_amount_cents");
    openapiRequiredFields.add("items");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditNoteInputCreditNote
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreditNoteInputCreditNote.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditNoteInputCreditNote is not found in the empty JSON string", CreditNoteInputCreditNote.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreditNoteInputCreditNote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditNoteInputCreditNote` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditNoteInputCreditNote.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("invoice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_id").toString()));
      }
      if (!jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        CreditNoteInputCreditNoteItemsInner.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditNoteInputCreditNote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditNoteInputCreditNote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditNoteInputCreditNote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditNoteInputCreditNote.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditNoteInputCreditNote>() {
           @Override
           public void write(JsonWriter out, CreditNoteInputCreditNote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditNoteInputCreditNote read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditNoteInputCreditNote given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditNoteInputCreditNote
  * @throws IOException if the JSON string is invalid with respect to CreditNoteInputCreditNote
  */
  public static CreditNoteInputCreditNote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditNoteInputCreditNote.class);
  }

 /**
  * Convert an instance of CreditNoteInputCreditNote to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

