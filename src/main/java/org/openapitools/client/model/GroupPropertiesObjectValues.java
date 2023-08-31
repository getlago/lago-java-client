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
import org.openapitools.client.model.ChargePropertiesGraduatedPercentageRangesInner;
import org.openapitools.client.model.ChargePropertiesGraduatedRangesInner;
import org.openapitools.client.model.ChargePropertiesVolumeRangesInner;
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
 * GroupPropertiesObjectValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:20:28.589842Z[Etc/UTC]")
public class GroupPropertiesObjectValues {
  public static final String SERIALIZED_NAME_GRADUATED_RANGES = "graduated_ranges";
  @SerializedName(SERIALIZED_NAME_GRADUATED_RANGES)
  private List<ChargePropertiesGraduatedRangesInner> graduatedRanges;

  public static final String SERIALIZED_NAME_GRADUATED_PERCENTAGE_RANGES = "graduated_percentage_ranges";
  @SerializedName(SERIALIZED_NAME_GRADUATED_PERCENTAGE_RANGES)
  private List<ChargePropertiesGraduatedPercentageRangesInner> graduatedPercentageRanges;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_FREE_UNITS = "free_units";
  @SerializedName(SERIALIZED_NAME_FREE_UNITS)
  private Integer freeUnits;

  public static final String SERIALIZED_NAME_PACKAGE_SIZE = "package_size";
  @SerializedName(SERIALIZED_NAME_PACKAGE_SIZE)
  private Integer packageSize;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_FIXED_AMOUNT = "fixed_amount";
  @SerializedName(SERIALIZED_NAME_FIXED_AMOUNT)
  private String fixedAmount;

  public static final String SERIALIZED_NAME_FREE_UNITS_PER_EVENTS = "free_units_per_events";
  @SerializedName(SERIALIZED_NAME_FREE_UNITS_PER_EVENTS)
  private Integer freeUnitsPerEvents;

  public static final String SERIALIZED_NAME_FREE_UNITS_PER_TOTAL_AGGREGATION = "free_units_per_total_aggregation";
  @SerializedName(SERIALIZED_NAME_FREE_UNITS_PER_TOTAL_AGGREGATION)
  private String freeUnitsPerTotalAggregation;

  public static final String SERIALIZED_NAME_PER_TRANSACTION_MAX_AMOUNT = "per_transaction_max_amount";
  @SerializedName(SERIALIZED_NAME_PER_TRANSACTION_MAX_AMOUNT)
  private String perTransactionMaxAmount;

  public static final String SERIALIZED_NAME_PER_TRANSACTION_MIN_AMOUNT = "per_transaction_min_amount";
  @SerializedName(SERIALIZED_NAME_PER_TRANSACTION_MIN_AMOUNT)
  private String perTransactionMinAmount;

  public static final String SERIALIZED_NAME_VOLUME_RANGES = "volume_ranges";
  @SerializedName(SERIALIZED_NAME_VOLUME_RANGES)
  private List<ChargePropertiesVolumeRangesInner> volumeRanges;

  public GroupPropertiesObjectValues() {
  }

  public GroupPropertiesObjectValues graduatedRanges(List<ChargePropertiesGraduatedRangesInner> graduatedRanges) {
    
    this.graduatedRanges = graduatedRanges;
    return this;
  }

  public GroupPropertiesObjectValues addGraduatedRangesItem(ChargePropertiesGraduatedRangesInner graduatedRangesItem) {
    if (this.graduatedRanges == null) {
      this.graduatedRanges = new ArrayList<>();
    }
    this.graduatedRanges.add(graduatedRangesItem);
    return this;
  }

   /**
   * Graduated ranges, sorted from bottom to top tiers, used for a &#x60;graduated&#x60; charge model.
   * @return graduatedRanges
  **/
  @javax.annotation.Nullable
  public List<ChargePropertiesGraduatedRangesInner> getGraduatedRanges() {
    return graduatedRanges;
  }


  public void setGraduatedRanges(List<ChargePropertiesGraduatedRangesInner> graduatedRanges) {
    this.graduatedRanges = graduatedRanges;
  }


  public GroupPropertiesObjectValues graduatedPercentageRanges(List<ChargePropertiesGraduatedPercentageRangesInner> graduatedPercentageRanges) {
    
    this.graduatedPercentageRanges = graduatedPercentageRanges;
    return this;
  }

  public GroupPropertiesObjectValues addGraduatedPercentageRangesItem(ChargePropertiesGraduatedPercentageRangesInner graduatedPercentageRangesItem) {
    if (this.graduatedPercentageRanges == null) {
      this.graduatedPercentageRanges = new ArrayList<>();
    }
    this.graduatedPercentageRanges.add(graduatedPercentageRangesItem);
    return this;
  }

   /**
   * Graduated percentage ranges, sorted from bottom to top tiers, used for a &#x60;graduated_percentage&#x60; charge model.
   * @return graduatedPercentageRanges
  **/
  @javax.annotation.Nullable
  public List<ChargePropertiesGraduatedPercentageRangesInner> getGraduatedPercentageRanges() {
    return graduatedPercentageRanges;
  }


  public void setGraduatedPercentageRanges(List<ChargePropertiesGraduatedPercentageRangesInner> graduatedPercentageRanges) {
    this.graduatedPercentageRanges = graduatedPercentageRanges;
  }


  public GroupPropertiesObjectValues amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * - The unit price, excluding tax, for a &#x60;standard&#x60; charge model. It is expressed as a decimal value. - The amount, excluding tax, for a complete set of units in a &#x60;package&#x60; charge model. It is expressed as a decimal value.
   * @return amount
  **/
  @javax.annotation.Nullable
  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GroupPropertiesObjectValues freeUnits(Integer freeUnits) {
    
    this.freeUnits = freeUnits;
    return this;
  }

   /**
   * The quantity of units that are provided free of charge for each billing period in a &#x60;package&#x60; charge model. This field specifies the number of units that customers can use without incurring any additional cost during each billing cycle.
   * @return freeUnits
  **/
  @javax.annotation.Nullable
  public Integer getFreeUnits() {
    return freeUnits;
  }


  public void setFreeUnits(Integer freeUnits) {
    this.freeUnits = freeUnits;
  }


  public GroupPropertiesObjectValues packageSize(Integer packageSize) {
    
    this.packageSize = packageSize;
    return this;
  }

   /**
   * The quantity of units included in each pack or set for a &#x60;package&#x60; charge model. It indicates the number of units that are bundled together as a single package or set within the pricing structure.
   * @return packageSize
  **/
  @javax.annotation.Nullable
  public Integer getPackageSize() {
    return packageSize;
  }


  public void setPackageSize(Integer packageSize) {
    this.packageSize = packageSize;
  }


  public GroupPropertiesObjectValues rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * The percentage rate that is applied to the amount of each transaction for a &#x60;percentage&#x60; charge model. It is expressed as a decimal value.
   * @return rate
  **/
  @javax.annotation.Nullable
  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public GroupPropertiesObjectValues fixedAmount(String fixedAmount) {
    
    this.fixedAmount = fixedAmount;
    return this;
  }

   /**
   * The fixed fee that is applied to each transaction for a &#x60;percentage&#x60; charge model. It is expressed as a decimal value.
   * @return fixedAmount
  **/
  @javax.annotation.Nullable
  public String getFixedAmount() {
    return fixedAmount;
  }


  public void setFixedAmount(String fixedAmount) {
    this.fixedAmount = fixedAmount;
  }


  public GroupPropertiesObjectValues freeUnitsPerEvents(Integer freeUnitsPerEvents) {
    
    this.freeUnitsPerEvents = freeUnitsPerEvents;
    return this;
  }

   /**
   * The count of transactions that are not impacted by the &#x60;percentage&#x60; rate and fixed fee in a percentage charge model. This field indicates the number of transactions that are exempt from the calculation of charges based on the specified percentage rate and fixed fee.
   * @return freeUnitsPerEvents
  **/
  @javax.annotation.Nullable
  public Integer getFreeUnitsPerEvents() {
    return freeUnitsPerEvents;
  }


  public void setFreeUnitsPerEvents(Integer freeUnitsPerEvents) {
    this.freeUnitsPerEvents = freeUnitsPerEvents;
  }


  public GroupPropertiesObjectValues freeUnitsPerTotalAggregation(String freeUnitsPerTotalAggregation) {
    
    this.freeUnitsPerTotalAggregation = freeUnitsPerTotalAggregation;
    return this;
  }

   /**
   * The transaction amount that is not impacted by the &#x60;percentage&#x60; rate and fixed fee in a percentage charge model. This field indicates the portion of the transaction amount that is exempt from the calculation of charges based on the specified percentage rate and fixed fee.
   * @return freeUnitsPerTotalAggregation
  **/
  @javax.annotation.Nullable
  public String getFreeUnitsPerTotalAggregation() {
    return freeUnitsPerTotalAggregation;
  }


  public void setFreeUnitsPerTotalAggregation(String freeUnitsPerTotalAggregation) {
    this.freeUnitsPerTotalAggregation = freeUnitsPerTotalAggregation;
  }


  public GroupPropertiesObjectValues perTransactionMaxAmount(String perTransactionMaxAmount) {
    
    this.perTransactionMaxAmount = perTransactionMaxAmount;
    return this;
  }

   /**
   * Specifies the maximum allowable spending for a single transaction. Working as a transaction cap.
   * @return perTransactionMaxAmount
  **/
  @javax.annotation.Nullable
  public String getPerTransactionMaxAmount() {
    return perTransactionMaxAmount;
  }


  public void setPerTransactionMaxAmount(String perTransactionMaxAmount) {
    this.perTransactionMaxAmount = perTransactionMaxAmount;
  }


  public GroupPropertiesObjectValues perTransactionMinAmount(String perTransactionMinAmount) {
    
    this.perTransactionMinAmount = perTransactionMinAmount;
    return this;
  }

   /**
   * Specifies the minimum allowable spending for a single transaction. Working as a transaction floor.
   * @return perTransactionMinAmount
  **/
  @javax.annotation.Nullable
  public String getPerTransactionMinAmount() {
    return perTransactionMinAmount;
  }


  public void setPerTransactionMinAmount(String perTransactionMinAmount) {
    this.perTransactionMinAmount = perTransactionMinAmount;
  }


  public GroupPropertiesObjectValues volumeRanges(List<ChargePropertiesVolumeRangesInner> volumeRanges) {
    
    this.volumeRanges = volumeRanges;
    return this;
  }

  public GroupPropertiesObjectValues addVolumeRangesItem(ChargePropertiesVolumeRangesInner volumeRangesItem) {
    if (this.volumeRanges == null) {
      this.volumeRanges = new ArrayList<>();
    }
    this.volumeRanges.add(volumeRangesItem);
    return this;
  }

   /**
   * Volume ranges, sorted from bottom to top tiers, used for a &#x60;volume&#x60; charge model.
   * @return volumeRanges
  **/
  @javax.annotation.Nullable
  public List<ChargePropertiesVolumeRangesInner> getVolumeRanges() {
    return volumeRanges;
  }


  public void setVolumeRanges(List<ChargePropertiesVolumeRangesInner> volumeRanges) {
    this.volumeRanges = volumeRanges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupPropertiesObjectValues groupPropertiesObjectValues = (GroupPropertiesObjectValues) o;
    return Objects.equals(this.graduatedRanges, groupPropertiesObjectValues.graduatedRanges) &&
        Objects.equals(this.graduatedPercentageRanges, groupPropertiesObjectValues.graduatedPercentageRanges) &&
        Objects.equals(this.amount, groupPropertiesObjectValues.amount) &&
        Objects.equals(this.freeUnits, groupPropertiesObjectValues.freeUnits) &&
        Objects.equals(this.packageSize, groupPropertiesObjectValues.packageSize) &&
        Objects.equals(this.rate, groupPropertiesObjectValues.rate) &&
        Objects.equals(this.fixedAmount, groupPropertiesObjectValues.fixedAmount) &&
        Objects.equals(this.freeUnitsPerEvents, groupPropertiesObjectValues.freeUnitsPerEvents) &&
        Objects.equals(this.freeUnitsPerTotalAggregation, groupPropertiesObjectValues.freeUnitsPerTotalAggregation) &&
        Objects.equals(this.perTransactionMaxAmount, groupPropertiesObjectValues.perTransactionMaxAmount) &&
        Objects.equals(this.perTransactionMinAmount, groupPropertiesObjectValues.perTransactionMinAmount) &&
        Objects.equals(this.volumeRanges, groupPropertiesObjectValues.volumeRanges);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(graduatedRanges, graduatedPercentageRanges, amount, freeUnits, packageSize, rate, fixedAmount, freeUnitsPerEvents, freeUnitsPerTotalAggregation, perTransactionMaxAmount, perTransactionMinAmount, volumeRanges);
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
    sb.append("class GroupPropertiesObjectValues {\n");
    sb.append("    graduatedRanges: ").append(toIndentedString(graduatedRanges)).append("\n");
    sb.append("    graduatedPercentageRanges: ").append(toIndentedString(graduatedPercentageRanges)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    freeUnits: ").append(toIndentedString(freeUnits)).append("\n");
    sb.append("    packageSize: ").append(toIndentedString(packageSize)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    freeUnitsPerEvents: ").append(toIndentedString(freeUnitsPerEvents)).append("\n");
    sb.append("    freeUnitsPerTotalAggregation: ").append(toIndentedString(freeUnitsPerTotalAggregation)).append("\n");
    sb.append("    perTransactionMaxAmount: ").append(toIndentedString(perTransactionMaxAmount)).append("\n");
    sb.append("    perTransactionMinAmount: ").append(toIndentedString(perTransactionMinAmount)).append("\n");
    sb.append("    volumeRanges: ").append(toIndentedString(volumeRanges)).append("\n");
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
    openapiFields.add("graduated_ranges");
    openapiFields.add("graduated_percentage_ranges");
    openapiFields.add("amount");
    openapiFields.add("free_units");
    openapiFields.add("package_size");
    openapiFields.add("rate");
    openapiFields.add("fixed_amount");
    openapiFields.add("free_units_per_events");
    openapiFields.add("free_units_per_total_aggregation");
    openapiFields.add("per_transaction_max_amount");
    openapiFields.add("per_transaction_min_amount");
    openapiFields.add("volume_ranges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupPropertiesObjectValues
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupPropertiesObjectValues.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupPropertiesObjectValues is not found in the empty JSON string", GroupPropertiesObjectValues.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupPropertiesObjectValues.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupPropertiesObjectValues` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("graduated_ranges") != null && !jsonObj.get("graduated_ranges").isJsonNull()) {
        JsonArray jsonArraygraduatedRanges = jsonObj.getAsJsonArray("graduated_ranges");
        if (jsonArraygraduatedRanges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("graduated_ranges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `graduated_ranges` to be an array in the JSON string but got `%s`", jsonObj.get("graduated_ranges").toString()));
          }

          // validate the optional field `graduated_ranges` (array)
          for (int i = 0; i < jsonArraygraduatedRanges.size(); i++) {
            ChargePropertiesGraduatedRangesInner.validateJsonElement(jsonArraygraduatedRanges.get(i));
          };
        }
      }
      if (jsonObj.get("graduated_percentage_ranges") != null && !jsonObj.get("graduated_percentage_ranges").isJsonNull()) {
        JsonArray jsonArraygraduatedPercentageRanges = jsonObj.getAsJsonArray("graduated_percentage_ranges");
        if (jsonArraygraduatedPercentageRanges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("graduated_percentage_ranges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `graduated_percentage_ranges` to be an array in the JSON string but got `%s`", jsonObj.get("graduated_percentage_ranges").toString()));
          }

          // validate the optional field `graduated_percentage_ranges` (array)
          for (int i = 0; i < jsonArraygraduatedPercentageRanges.size(); i++) {
            ChargePropertiesGraduatedPercentageRangesInner.validateJsonElement(jsonArraygraduatedPercentageRanges.get(i));
          };
        }
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonNull()) && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if ((jsonObj.get("fixed_amount") != null && !jsonObj.get("fixed_amount").isJsonNull()) && !jsonObj.get("fixed_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fixed_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fixed_amount").toString()));
      }
      if ((jsonObj.get("free_units_per_total_aggregation") != null && !jsonObj.get("free_units_per_total_aggregation").isJsonNull()) && !jsonObj.get("free_units_per_total_aggregation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `free_units_per_total_aggregation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("free_units_per_total_aggregation").toString()));
      }
      if ((jsonObj.get("per_transaction_max_amount") != null && !jsonObj.get("per_transaction_max_amount").isJsonNull()) && !jsonObj.get("per_transaction_max_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `per_transaction_max_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("per_transaction_max_amount").toString()));
      }
      if ((jsonObj.get("per_transaction_min_amount") != null && !jsonObj.get("per_transaction_min_amount").isJsonNull()) && !jsonObj.get("per_transaction_min_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `per_transaction_min_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("per_transaction_min_amount").toString()));
      }
      if (jsonObj.get("volume_ranges") != null && !jsonObj.get("volume_ranges").isJsonNull()) {
        JsonArray jsonArrayvolumeRanges = jsonObj.getAsJsonArray("volume_ranges");
        if (jsonArrayvolumeRanges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volume_ranges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volume_ranges` to be an array in the JSON string but got `%s`", jsonObj.get("volume_ranges").toString()));
          }

          // validate the optional field `volume_ranges` (array)
          for (int i = 0; i < jsonArrayvolumeRanges.size(); i++) {
            ChargePropertiesVolumeRangesInner.validateJsonElement(jsonArrayvolumeRanges.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupPropertiesObjectValues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupPropertiesObjectValues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupPropertiesObjectValues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupPropertiesObjectValues.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupPropertiesObjectValues>() {
           @Override
           public void write(JsonWriter out, GroupPropertiesObjectValues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupPropertiesObjectValues read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupPropertiesObjectValues given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupPropertiesObjectValues
  * @throws IOException if the JSON string is invalid with respect to GroupPropertiesObjectValues
  */
  public static GroupPropertiesObjectValues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupPropertiesObjectValues.class);
  }

 /**
  * Convert an instance of GroupPropertiesObjectValues to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

