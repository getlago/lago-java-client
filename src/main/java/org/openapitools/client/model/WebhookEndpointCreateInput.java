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
import org.openapitools.client.model.WebhookEndpointCreateInputWebhookEndpoint;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WebhookEndpointCreateInput
 */
@JsonPropertyOrder({
  WebhookEndpointCreateInput.JSON_PROPERTY_WEBHOOK_ENDPOINT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class WebhookEndpointCreateInput {
  public static final String JSON_PROPERTY_WEBHOOK_ENDPOINT = "webhook_endpoint";
  private WebhookEndpointCreateInputWebhookEndpoint webhookEndpoint;

  public WebhookEndpointCreateInput() {
  }

  public WebhookEndpointCreateInput webhookEndpoint(WebhookEndpointCreateInputWebhookEndpoint webhookEndpoint) {
    
    this.webhookEndpoint = webhookEndpoint;
    return this;
  }

   /**
   * Get webhookEndpoint
   * @return webhookEndpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOK_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookEndpointCreateInputWebhookEndpoint getWebhookEndpoint() {
    return webhookEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookEndpoint(WebhookEndpointCreateInputWebhookEndpoint webhookEndpoint) {
    this.webhookEndpoint = webhookEndpoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEndpointCreateInput webhookEndpointCreateInput = (WebhookEndpointCreateInput) o;
    return Objects.equals(this.webhookEndpoint, webhookEndpointCreateInput.webhookEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEndpointCreateInput {\n");
    sb.append("    webhookEndpoint: ").append(toIndentedString(webhookEndpoint)).append("\n");
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
