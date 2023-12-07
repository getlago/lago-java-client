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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * .
 */
@JsonPropertyOrder({
  GenerateCustomerCheckoutURL200Response.JSON_PROPERTY_LAGO_CUSTOMER_ID,
  GenerateCustomerCheckoutURL200Response.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  GenerateCustomerCheckoutURL200Response.JSON_PROPERTY_PAYMENT_PROVIDER,
  GenerateCustomerCheckoutURL200Response.JSON_PROPERTY_CHECKOUT_URL
})
@JsonTypeName("generateCustomerCheckoutURL_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class GenerateCustomerCheckoutURL200Response {
  public static final String JSON_PROPERTY_LAGO_CUSTOMER_ID = "lago_customer_id";
  private String lagoCustomerId;

  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private String externalCustomerId;

  public static final String JSON_PROPERTY_PAYMENT_PROVIDER = "payment_provider";
  private String paymentProvider;

  public static final String JSON_PROPERTY_CHECKOUT_URL = "checkout_url";
  private String checkoutUrl;

  public GenerateCustomerCheckoutURL200Response() {
  }

  public GenerateCustomerCheckoutURL200Response lagoCustomerId(String lagoCustomerId) {
    
    this.lagoCustomerId = lagoCustomerId;
    return this;
  }

   /**
   * Unique identifier assigned to the customer within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the customer&#39;s record within the Lago system
   * @return lagoCustomerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAGO_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLagoCustomerId() {
    return lagoCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLagoCustomerId(String lagoCustomerId) {
    this.lagoCustomerId = lagoCustomerId;
  }


  public GenerateCustomerCheckoutURL200Response externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application)
   * @return externalCustomerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public GenerateCustomerCheckoutURL200Response paymentProvider(String paymentProvider) {
    
    this.paymentProvider = paymentProvider;
    return this;
  }

   /**
   * The Payment Provider name linked to the Customer.
   * @return paymentProvider
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentProvider() {
    return paymentProvider;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProvider(String paymentProvider) {
    this.paymentProvider = paymentProvider;
  }


  public GenerateCustomerCheckoutURL200Response checkoutUrl(String checkoutUrl) {
    
    this.checkoutUrl = checkoutUrl;
    return this;
  }

   /**
   * The new generated Payment Provider Checkout URL for the Customer.
   * @return checkoutUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutUrl() {
    return checkoutUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateCustomerCheckoutURL200Response generateCustomerCheckoutURL200Response = (GenerateCustomerCheckoutURL200Response) o;
    return Objects.equals(this.lagoCustomerId, generateCustomerCheckoutURL200Response.lagoCustomerId) &&
        Objects.equals(this.externalCustomerId, generateCustomerCheckoutURL200Response.externalCustomerId) &&
        Objects.equals(this.paymentProvider, generateCustomerCheckoutURL200Response.paymentProvider) &&
        Objects.equals(this.checkoutUrl, generateCustomerCheckoutURL200Response.checkoutUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoCustomerId, externalCustomerId, paymentProvider, checkoutUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateCustomerCheckoutURL200Response {\n");
    sb.append("    lagoCustomerId: ").append(toIndentedString(lagoCustomerId)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    paymentProvider: ").append(toIndentedString(paymentProvider)).append("\n");
    sb.append("    checkoutUrl: ").append(toIndentedString(checkoutUrl)).append("\n");
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

