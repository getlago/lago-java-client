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
 * BillingConfigurationOrganization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class BillingConfigurationOrganization {
  public static final String SERIALIZED_NAME_INVOICE_FOOTER = "invoice_footer";
  @SerializedName(SERIALIZED_NAME_INVOICE_FOOTER)
  private String invoiceFooter;

  public static final String SERIALIZED_NAME_INVOICE_GRACE_PERIOD = "invoice_grace_period";
  @SerializedName(SERIALIZED_NAME_INVOICE_GRACE_PERIOD)
  private Integer invoiceGracePeriod;

  public static final String SERIALIZED_NAME_DOCUMENT_LOCALE = "document_locale";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_LOCALE)
  private String documentLocale;

  public static final String SERIALIZED_NAME_VAT_RATE = "vat_rate";
  @SerializedName(SERIALIZED_NAME_VAT_RATE)
  private BigDecimal vatRate;

  public BillingConfigurationOrganization() {
  }

  public BillingConfigurationOrganization invoiceFooter(String invoiceFooter) {
    
    this.invoiceFooter = invoiceFooter;
    return this;
  }

   /**
   * Get invoiceFooter
   * @return invoiceFooter
  **/
  @javax.annotation.Nullable
  public String getInvoiceFooter() {
    return invoiceFooter;
  }


  public void setInvoiceFooter(String invoiceFooter) {
    this.invoiceFooter = invoiceFooter;
  }


  public BillingConfigurationOrganization invoiceGracePeriod(Integer invoiceGracePeriod) {
    
    this.invoiceGracePeriod = invoiceGracePeriod;
    return this;
  }

   /**
   * Get invoiceGracePeriod
   * @return invoiceGracePeriod
  **/
  @javax.annotation.Nullable
  public Integer getInvoiceGracePeriod() {
    return invoiceGracePeriod;
  }


  public void setInvoiceGracePeriod(Integer invoiceGracePeriod) {
    this.invoiceGracePeriod = invoiceGracePeriod;
  }


  public BillingConfigurationOrganization documentLocale(String documentLocale) {
    
    this.documentLocale = documentLocale;
    return this;
  }

   /**
   * Get documentLocale
   * @return documentLocale
  **/
  @javax.annotation.Nullable
  public String getDocumentLocale() {
    return documentLocale;
  }


  public void setDocumentLocale(String documentLocale) {
    this.documentLocale = documentLocale;
  }


  public BillingConfigurationOrganization vatRate(BigDecimal vatRate) {
    
    this.vatRate = vatRate;
    return this;
  }

   /**
   * Get vatRate
   * @return vatRate
  **/
  @javax.annotation.Nullable
  public BigDecimal getVatRate() {
    return vatRate;
  }


  public void setVatRate(BigDecimal vatRate) {
    this.vatRate = vatRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingConfigurationOrganization billingConfigurationOrganization = (BillingConfigurationOrganization) o;
    return Objects.equals(this.invoiceFooter, billingConfigurationOrganization.invoiceFooter) &&
        Objects.equals(this.invoiceGracePeriod, billingConfigurationOrganization.invoiceGracePeriod) &&
        Objects.equals(this.documentLocale, billingConfigurationOrganization.documentLocale) &&
        Objects.equals(this.vatRate, billingConfigurationOrganization.vatRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceFooter, invoiceGracePeriod, documentLocale, vatRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingConfigurationOrganization {\n");
    sb.append("    invoiceFooter: ").append(toIndentedString(invoiceFooter)).append("\n");
    sb.append("    invoiceGracePeriod: ").append(toIndentedString(invoiceGracePeriod)).append("\n");
    sb.append("    documentLocale: ").append(toIndentedString(documentLocale)).append("\n");
    sb.append("    vatRate: ").append(toIndentedString(vatRate)).append("\n");
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
    openapiFields.add("invoice_footer");
    openapiFields.add("invoice_grace_period");
    openapiFields.add("document_locale");
    openapiFields.add("vat_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BillingConfigurationOrganization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BillingConfigurationOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillingConfigurationOrganization is not found in the empty JSON string", BillingConfigurationOrganization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BillingConfigurationOrganization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillingConfigurationOrganization` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("invoice_footer") != null && !jsonObj.get("invoice_footer").isJsonNull()) && !jsonObj.get("invoice_footer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_footer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_footer").toString()));
      }
      if ((jsonObj.get("document_locale") != null && !jsonObj.get("document_locale").isJsonNull()) && !jsonObj.get("document_locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_locale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillingConfigurationOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillingConfigurationOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillingConfigurationOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillingConfigurationOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<BillingConfigurationOrganization>() {
           @Override
           public void write(JsonWriter out, BillingConfigurationOrganization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillingConfigurationOrganization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BillingConfigurationOrganization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillingConfigurationOrganization
  * @throws IOException if the JSON string is invalid with respect to BillingConfigurationOrganization
  */
  public static BillingConfigurationOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillingConfigurationOrganization.class);
  }

 /**
  * Convert an instance of BillingConfigurationOrganization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

