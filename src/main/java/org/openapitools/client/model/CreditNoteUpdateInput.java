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
import org.openapitools.client.model.CreditNoteUpdateInputCreditNote;

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
 * CreditNoteUpdateInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:20:28.589842Z[Etc/UTC]")
public class CreditNoteUpdateInput {
  public static final String SERIALIZED_NAME_CREDIT_NOTE = "credit_note";
  @SerializedName(SERIALIZED_NAME_CREDIT_NOTE)
  private CreditNoteUpdateInputCreditNote creditNote;

  public CreditNoteUpdateInput() {
  }

  public CreditNoteUpdateInput creditNote(CreditNoteUpdateInputCreditNote creditNote) {
    
    this.creditNote = creditNote;
    return this;
  }

   /**
   * Get creditNote
   * @return creditNote
  **/
  @javax.annotation.Nonnull
  public CreditNoteUpdateInputCreditNote getCreditNote() {
    return creditNote;
  }


  public void setCreditNote(CreditNoteUpdateInputCreditNote creditNote) {
    this.creditNote = creditNote;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNoteUpdateInput creditNoteUpdateInput = (CreditNoteUpdateInput) o;
    return Objects.equals(this.creditNote, creditNoteUpdateInput.creditNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteUpdateInput {\n");
    sb.append("    creditNote: ").append(toIndentedString(creditNote)).append("\n");
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
    openapiFields.add("credit_note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("credit_note");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreditNoteUpdateInput
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreditNoteUpdateInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditNoteUpdateInput is not found in the empty JSON string", CreditNoteUpdateInput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreditNoteUpdateInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditNoteUpdateInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditNoteUpdateInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `credit_note`
      CreditNoteUpdateInputCreditNote.validateJsonElement(jsonObj.get("credit_note"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditNoteUpdateInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditNoteUpdateInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditNoteUpdateInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditNoteUpdateInput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditNoteUpdateInput>() {
           @Override
           public void write(JsonWriter out, CreditNoteUpdateInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditNoteUpdateInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditNoteUpdateInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditNoteUpdateInput
  * @throws IOException if the JSON string is invalid with respect to CreditNoteUpdateInput
  */
  public static CreditNoteUpdateInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditNoteUpdateInput.class);
  }

 /**
  * Convert an instance of CreditNoteUpdateInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

