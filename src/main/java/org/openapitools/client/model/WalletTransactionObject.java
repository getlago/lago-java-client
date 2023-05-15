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
import java.time.OffsetDateTime;
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
 * WalletTransactionObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class WalletTransactionObject {
  public static final String SERIALIZED_NAME_LAGO_ID = "lago_id";
  @SerializedName(SERIALIZED_NAME_LAGO_ID)
  private UUID lagoId;

  public static final String SERIALIZED_NAME_LAGO_WALLET_ID = "lago_wallet_id";
  @SerializedName(SERIALIZED_NAME_LAGO_WALLET_ID)
  private UUID lagoWalletId;

  /**
   * Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    SETTLED("settled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * Transaction type
   */
  @JsonAdapter(TransactionTypeEnum.Adapter.class)
  public enum TransactionTypeEnum {
    INBOUND("inbound"),
    
    OUTBOUND("outbound");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionTypeEnum fromValue(String value) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransactionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionTypeEnum transactionType;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CREDIT_AMOUNT = "credit_amount";
  @SerializedName(SERIALIZED_NAME_CREDIT_AMOUNT)
  private BigDecimal creditAmount;

  public static final String SERIALIZED_NAME_SETTLED_AT = "settled_at";
  @SerializedName(SERIALIZED_NAME_SETTLED_AT)
  private OffsetDateTime settledAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public WalletTransactionObject() {
  }

  public WalletTransactionObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Get lagoId
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  public UUID getLagoId() {
    return lagoId;
  }


  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public WalletTransactionObject lagoWalletId(UUID lagoWalletId) {
    
    this.lagoWalletId = lagoWalletId;
    return this;
  }

   /**
   * Get lagoWalletId
   * @return lagoWalletId
  **/
  @javax.annotation.Nonnull
  public UUID getLagoWalletId() {
    return lagoWalletId;
  }


  public void setLagoWalletId(UUID lagoWalletId) {
    this.lagoWalletId = lagoWalletId;
  }


  public WalletTransactionObject status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WalletTransactionObject transactionType(TransactionTypeEnum transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Transaction type
   * @return transactionType
  **/
  @javax.annotation.Nonnull
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }


  public WalletTransactionObject amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public WalletTransactionObject creditAmount(BigDecimal creditAmount) {
    
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * Get creditAmount
   * @return creditAmount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getCreditAmount() {
    return creditAmount;
  }


  public void setCreditAmount(BigDecimal creditAmount) {
    this.creditAmount = creditAmount;
  }


  public WalletTransactionObject settledAt(OffsetDateTime settledAt) {
    
    this.settledAt = settledAt;
    return this;
  }

   /**
   * Get settledAt
   * @return settledAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSettledAt() {
    return settledAt;
  }


  public void setSettledAt(OffsetDateTime settledAt) {
    this.settledAt = settledAt;
  }


  public WalletTransactionObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionObject walletTransactionObject = (WalletTransactionObject) o;
    return Objects.equals(this.lagoId, walletTransactionObject.lagoId) &&
        Objects.equals(this.lagoWalletId, walletTransactionObject.lagoWalletId) &&
        Objects.equals(this.status, walletTransactionObject.status) &&
        Objects.equals(this.transactionType, walletTransactionObject.transactionType) &&
        Objects.equals(this.amount, walletTransactionObject.amount) &&
        Objects.equals(this.creditAmount, walletTransactionObject.creditAmount) &&
        Objects.equals(this.settledAt, walletTransactionObject.settledAt) &&
        Objects.equals(this.createdAt, walletTransactionObject.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, lagoWalletId, status, transactionType, amount, creditAmount, settledAt, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    lagoWalletId: ").append(toIndentedString(lagoWalletId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    settledAt: ").append(toIndentedString(settledAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("lago_wallet_id");
    openapiFields.add("status");
    openapiFields.add("transaction_type");
    openapiFields.add("amount");
    openapiFields.add("credit_amount");
    openapiFields.add("settled_at");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lago_id");
    openapiRequiredFields.add("lago_wallet_id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("transaction_type");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("credit_amount");
    openapiRequiredFields.add("created_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WalletTransactionObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WalletTransactionObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WalletTransactionObject is not found in the empty JSON string", WalletTransactionObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WalletTransactionObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WalletTransactionObject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WalletTransactionObject.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("lago_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_id").toString()));
      }
      if (!jsonObj.get("lago_wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_wallet_id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("transaction_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WalletTransactionObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WalletTransactionObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WalletTransactionObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WalletTransactionObject.class));

       return (TypeAdapter<T>) new TypeAdapter<WalletTransactionObject>() {
           @Override
           public void write(JsonWriter out, WalletTransactionObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WalletTransactionObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WalletTransactionObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WalletTransactionObject
  * @throws IOException if the JSON string is invalid with respect to WalletTransactionObject
  */
  public static WalletTransactionObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WalletTransactionObject.class);
  }

 /**
  * Convert an instance of WalletTransactionObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

