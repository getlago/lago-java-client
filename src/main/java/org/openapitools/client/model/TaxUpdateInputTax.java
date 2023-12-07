/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.2-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TaxUpdateInputTax
 */
@JsonPropertyOrder({
  TaxUpdateInputTax.JSON_PROPERTY_NAME,
  TaxUpdateInputTax.JSON_PROPERTY_CODE,
  TaxUpdateInputTax.JSON_PROPERTY_RATE,
  TaxUpdateInputTax.JSON_PROPERTY_DESCRIPTION,
  TaxUpdateInputTax.JSON_PROPERTY_APPLIED_TO_ORGANIZATION
})
@JsonTypeName("TaxUpdateInput_tax")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class TaxUpdateInputTax {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_RATE = "rate";
  private String rate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APPLIED_TO_ORGANIZATION = "applied_to_organization";
  private Boolean appliedToOrganization;

  public TaxUpdateInputTax() {
  }

  public TaxUpdateInputTax name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the tax.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TaxUpdateInputTax code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Unique code used to identify the tax associated with the API request.
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public TaxUpdateInputTax rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * The percentage rate of the tax
   * @return rate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(String rate) {
    this.rate = rate;
  }


  public TaxUpdateInputTax description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * Internal description of the taxe
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public TaxUpdateInputTax appliedToOrganization(Boolean appliedToOrganization) {
    
    this.appliedToOrganization = appliedToOrganization;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if the tax is used as one of the organization&#39;s default
   * @return appliedToOrganization
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_TO_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAppliedToOrganization() {
    return appliedToOrganization;
  }


  @JsonProperty(JSON_PROPERTY_APPLIED_TO_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppliedToOrganization(Boolean appliedToOrganization) {
    this.appliedToOrganization = appliedToOrganization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxUpdateInputTax taxUpdateInputTax = (TaxUpdateInputTax) o;
    return Objects.equals(this.name, taxUpdateInputTax.name) &&
        Objects.equals(this.code, taxUpdateInputTax.code) &&
        Objects.equals(this.rate, taxUpdateInputTax.rate) &&
        equalsNullable(this.description, taxUpdateInputTax.description) &&
        Objects.equals(this.appliedToOrganization, taxUpdateInputTax.appliedToOrganization);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, rate, hashCodeNullable(description), appliedToOrganization);
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
    sb.append("class TaxUpdateInputTax {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    appliedToOrganization: ").append(toIndentedString(appliedToOrganization)).append("\n");
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

}

