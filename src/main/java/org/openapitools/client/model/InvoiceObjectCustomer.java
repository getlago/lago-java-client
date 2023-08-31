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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.CustomerBillingConfiguration;
import org.openapitools.client.model.CustomerMetadata;
import org.openapitools.client.model.Timezone;
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
 * InvoiceObjectCustomer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:20:28.589842Z[Etc/UTC]")
public class InvoiceObjectCustomer {
  public static final String SERIALIZED_NAME_LAGO_ID = "lago_id";
  @SerializedName(SERIALIZED_NAME_LAGO_ID)
  private UUID lagoId;

  public static final String SERIALIZED_NAME_SEQUENTIAL_ID = "sequential_id";
  @SerializedName(SERIALIZED_NAME_SEQUENTIAL_ID)
  private Integer sequentialId;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_APPLICABLE_TIMEZONE = "applicable_timezone";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_TIMEZONE)
  private Timezone applicableTimezone;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_LEGAL_NUMBER = "legal_number";
  @SerializedName(SERIALIZED_NAME_LEGAL_NUMBER)
  private String legalNumber;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TAX_IDENTIFICATION_NUMBER = "tax_identification_number";
  @SerializedName(SERIALIZED_NAME_TAX_IDENTIFICATION_NUMBER)
  private String taxIdentificationNumber;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private Timezone timezone;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ZIPCODE = "zipcode";
  @SerializedName(SERIALIZED_NAME_ZIPCODE)
  private String zipcode;

  public static final String SERIALIZED_NAME_NET_PAYMENT_TERM = "net_payment_term";
  @SerializedName(SERIALIZED_NAME_NET_PAYMENT_TERM)
  private Integer netPaymentTerm;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_BILLING_CONFIGURATION = "billing_configuration";
  @SerializedName(SERIALIZED_NAME_BILLING_CONFIGURATION)
  private CustomerBillingConfiguration billingConfiguration;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<CustomerMetadata> metadata;

  public InvoiceObjectCustomer() {
  }

  public InvoiceObjectCustomer lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier assigned to the customer within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the customer&#39;s record within the Lago system
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  public UUID getLagoId() {
    return lagoId;
  }


  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public InvoiceObjectCustomer sequentialId(Integer sequentialId) {
    
    this.sequentialId = sequentialId;
    return this;
  }

   /**
   * The unique identifier assigned to the customer within the organization&#39;s scope. This identifier is used to track and reference the customer&#39;s order of creation within the organization&#39;s system. It ensures that each customer has a distinct &#x60;sequential_id&#x60;&#x60; associated with them, allowing for easy identification and sorting based on the order of creation
   * @return sequentialId
  **/
  @javax.annotation.Nonnull
  public Integer getSequentialId() {
    return sequentialId;
  }


  public void setSequentialId(Integer sequentialId) {
    this.sequentialId = sequentialId;
  }


  public InvoiceObjectCustomer slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * A concise and unique identifier for the customer, formed by combining the Organization&#39;s &#x60;name&#x60;, &#x60;id&#x60;, and customer&#39;s &#x60;sequential_id&#x60;
   * @return slug
  **/
  @javax.annotation.Nonnull
  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public InvoiceObjectCustomer externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application)
   * @return externalId
  **/
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public InvoiceObjectCustomer addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the billing address
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public InvoiceObjectCustomer addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the billing address
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public InvoiceObjectCustomer applicableTimezone(Timezone applicableTimezone) {
    
    this.applicableTimezone = applicableTimezone;
    return this;
  }

   /**
   * Get applicableTimezone
   * @return applicableTimezone
  **/
  @javax.annotation.Nonnull
  public Timezone getApplicableTimezone() {
    return applicableTimezone;
  }


  public void setApplicableTimezone(Timezone applicableTimezone) {
    this.applicableTimezone = applicableTimezone;
  }


  public InvoiceObjectCustomer city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city of the customer&#39;s billing address
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public InvoiceObjectCustomer country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public Country getCountry() {
    return country;
  }


  public void setCountry(Country country) {
    this.country = country;
  }


  public InvoiceObjectCustomer currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public InvoiceObjectCustomer email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email of the customer
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public InvoiceObjectCustomer legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The legal company name of the customer
   * @return legalName
  **/
  @javax.annotation.Nullable
  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public InvoiceObjectCustomer legalNumber(String legalNumber) {
    
    this.legalNumber = legalNumber;
    return this;
  }

   /**
   * The legal company number of the customer
   * @return legalNumber
  **/
  @javax.annotation.Nullable
  public String getLegalNumber() {
    return legalNumber;
  }


  public void setLegalNumber(String legalNumber) {
    this.legalNumber = legalNumber;
  }


  public InvoiceObjectCustomer logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The logo URL of the customer
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public InvoiceObjectCustomer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The full name of the customer
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InvoiceObjectCustomer phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * The phone number of the customer
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public InvoiceObjectCustomer state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the customer&#39;s billing address
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public InvoiceObjectCustomer taxIdentificationNumber(String taxIdentificationNumber) {
    
    this.taxIdentificationNumber = taxIdentificationNumber;
    return this;
  }

   /**
   * The tax identification number of the customer
   * @return taxIdentificationNumber
  **/
  @javax.annotation.Nullable
  public String getTaxIdentificationNumber() {
    return taxIdentificationNumber;
  }


  public void setTaxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
  }


  public InvoiceObjectCustomer timezone(Timezone timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  public Timezone getTimezone() {
    return timezone;
  }


  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }


  public InvoiceObjectCustomer url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The custom website URL of the customer
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public InvoiceObjectCustomer zipcode(String zipcode) {
    
    this.zipcode = zipcode;
    return this;
  }

   /**
   * The zipcode of the customer&#39;s billing address
   * @return zipcode
  **/
  @javax.annotation.Nullable
  public String getZipcode() {
    return zipcode;
  }


  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }


  public InvoiceObjectCustomer netPaymentTerm(Integer netPaymentTerm) {
    
    this.netPaymentTerm = netPaymentTerm;
    return this;
  }

   /**
   * The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized.
   * @return netPaymentTerm
  **/
  @javax.annotation.Nullable
  public Integer getNetPaymentTerm() {
    return netPaymentTerm;
  }


  public void setNetPaymentTerm(Integer netPaymentTerm) {
    this.netPaymentTerm = netPaymentTerm;
  }


  public InvoiceObjectCustomer createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date of the customer creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). The creation_date provides a standardized and internationally recognized timestamp for when the customer object was created
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public InvoiceObjectCustomer updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date of the customer update, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). The update_date provides a standardized and internationally recognized timestamp for when the customer object was updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public InvoiceObjectCustomer billingConfiguration(CustomerBillingConfiguration billingConfiguration) {
    
    this.billingConfiguration = billingConfiguration;
    return this;
  }

   /**
   * Get billingConfiguration
   * @return billingConfiguration
  **/
  @javax.annotation.Nullable
  public CustomerBillingConfiguration getBillingConfiguration() {
    return billingConfiguration;
  }


  public void setBillingConfiguration(CustomerBillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
  }


  public InvoiceObjectCustomer metadata(List<CustomerMetadata> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public InvoiceObjectCustomer addMetadataItem(CustomerMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public List<CustomerMetadata> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<CustomerMetadata> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceObjectCustomer invoiceObjectCustomer = (InvoiceObjectCustomer) o;
    return Objects.equals(this.lagoId, invoiceObjectCustomer.lagoId) &&
        Objects.equals(this.sequentialId, invoiceObjectCustomer.sequentialId) &&
        Objects.equals(this.slug, invoiceObjectCustomer.slug) &&
        Objects.equals(this.externalId, invoiceObjectCustomer.externalId) &&
        Objects.equals(this.addressLine1, invoiceObjectCustomer.addressLine1) &&
        Objects.equals(this.addressLine2, invoiceObjectCustomer.addressLine2) &&
        Objects.equals(this.applicableTimezone, invoiceObjectCustomer.applicableTimezone) &&
        Objects.equals(this.city, invoiceObjectCustomer.city) &&
        Objects.equals(this.country, invoiceObjectCustomer.country) &&
        Objects.equals(this.currency, invoiceObjectCustomer.currency) &&
        Objects.equals(this.email, invoiceObjectCustomer.email) &&
        Objects.equals(this.legalName, invoiceObjectCustomer.legalName) &&
        Objects.equals(this.legalNumber, invoiceObjectCustomer.legalNumber) &&
        Objects.equals(this.logoUrl, invoiceObjectCustomer.logoUrl) &&
        Objects.equals(this.name, invoiceObjectCustomer.name) &&
        Objects.equals(this.phone, invoiceObjectCustomer.phone) &&
        Objects.equals(this.state, invoiceObjectCustomer.state) &&
        Objects.equals(this.taxIdentificationNumber, invoiceObjectCustomer.taxIdentificationNumber) &&
        Objects.equals(this.timezone, invoiceObjectCustomer.timezone) &&
        Objects.equals(this.url, invoiceObjectCustomer.url) &&
        Objects.equals(this.zipcode, invoiceObjectCustomer.zipcode) &&
        Objects.equals(this.netPaymentTerm, invoiceObjectCustomer.netPaymentTerm) &&
        Objects.equals(this.createdAt, invoiceObjectCustomer.createdAt) &&
        Objects.equals(this.updatedAt, invoiceObjectCustomer.updatedAt) &&
        Objects.equals(this.billingConfiguration, invoiceObjectCustomer.billingConfiguration) &&
        Objects.equals(this.metadata, invoiceObjectCustomer.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, sequentialId, slug, externalId, addressLine1, addressLine2, applicableTimezone, city, country, currency, email, legalName, legalNumber, logoUrl, name, phone, state, taxIdentificationNumber, timezone, url, zipcode, netPaymentTerm, createdAt, updatedAt, billingConfiguration, metadata);
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
    sb.append("class InvoiceObjectCustomer {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    sequentialId: ").append(toIndentedString(sequentialId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    applicableTimezone: ").append(toIndentedString(applicableTimezone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    legalNumber: ").append(toIndentedString(legalNumber)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taxIdentificationNumber: ").append(toIndentedString(taxIdentificationNumber)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    netPaymentTerm: ").append(toIndentedString(netPaymentTerm)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    billingConfiguration: ").append(toIndentedString(billingConfiguration)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("sequential_id");
    openapiFields.add("slug");
    openapiFields.add("external_id");
    openapiFields.add("address_line1");
    openapiFields.add("address_line2");
    openapiFields.add("applicable_timezone");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("currency");
    openapiFields.add("email");
    openapiFields.add("legal_name");
    openapiFields.add("legal_number");
    openapiFields.add("logo_url");
    openapiFields.add("name");
    openapiFields.add("phone");
    openapiFields.add("state");
    openapiFields.add("tax_identification_number");
    openapiFields.add("timezone");
    openapiFields.add("url");
    openapiFields.add("zipcode");
    openapiFields.add("net_payment_term");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("billing_configuration");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lago_id");
    openapiRequiredFields.add("sequential_id");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("external_id");
    openapiRequiredFields.add("applicable_timezone");
    openapiRequiredFields.add("created_at");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceObjectCustomer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceObjectCustomer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceObjectCustomer is not found in the empty JSON string", InvoiceObjectCustomer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceObjectCustomer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceObjectCustomer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceObjectCustomer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("lago_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_id").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("address_line1") != null && !jsonObj.get("address_line1").isJsonNull()) && !jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      if ((jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonNull()) && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      // validate the required field `applicable_timezone`
      Timezone.validateJsonElement(jsonObj.get("applicable_timezone"));
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      // validate the optional field `country`
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) {
        Country.validateJsonElement(jsonObj.get("country"));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        Currency.validateJsonElement(jsonObj.get("currency"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("legal_name") != null && !jsonObj.get("legal_name").isJsonNull()) && !jsonObj.get("legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name").toString()));
      }
      if ((jsonObj.get("legal_number") != null && !jsonObj.get("legal_number").isJsonNull()) && !jsonObj.get("legal_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_number").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("tax_identification_number") != null && !jsonObj.get("tax_identification_number").isJsonNull()) && !jsonObj.get("tax_identification_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_identification_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_identification_number").toString()));
      }
      // validate the optional field `timezone`
      if (jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) {
        Timezone.validateJsonElement(jsonObj.get("timezone"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("zipcode") != null && !jsonObj.get("zipcode").isJsonNull()) && !jsonObj.get("zipcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipcode").toString()));
      }
      // validate the optional field `billing_configuration`
      if (jsonObj.get("billing_configuration") != null && !jsonObj.get("billing_configuration").isJsonNull()) {
        CustomerBillingConfiguration.validateJsonElement(jsonObj.get("billing_configuration"));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            CustomerMetadata.validateJsonElement(jsonArraymetadata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceObjectCustomer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceObjectCustomer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceObjectCustomer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceObjectCustomer.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceObjectCustomer>() {
           @Override
           public void write(JsonWriter out, InvoiceObjectCustomer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceObjectCustomer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceObjectCustomer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceObjectCustomer
  * @throws IOException if the JSON string is invalid with respect to InvoiceObjectCustomer
  */
  public static InvoiceObjectCustomer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceObjectCustomer.class);
  }

 /**
  * Convert an instance of InvoiceObjectCustomer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

