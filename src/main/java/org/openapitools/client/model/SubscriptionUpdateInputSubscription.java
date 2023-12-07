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
import java.time.OffsetDateTime;
import org.openapitools.client.model.PlanOverridesObject;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubscriptionUpdateInputSubscription
 */
@JsonPropertyOrder({
  SubscriptionUpdateInputSubscription.JSON_PROPERTY_NAME,
  SubscriptionUpdateInputSubscription.JSON_PROPERTY_ENDING_AT,
  SubscriptionUpdateInputSubscription.JSON_PROPERTY_SUBSCRIPTION_AT,
  SubscriptionUpdateInputSubscription.JSON_PROPERTY_PLAN_OVERRIDES
})
@JsonTypeName("SubscriptionUpdateInput_subscription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class SubscriptionUpdateInputSubscription {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENDING_AT = "ending_at";
  private OffsetDateTime endingAt;

  public static final String JSON_PROPERTY_SUBSCRIPTION_AT = "subscription_at";
  private OffsetDateTime subscriptionAt;

  public static final String JSON_PROPERTY_PLAN_OVERRIDES = "plan_overrides";
  private PlanOverridesObject planOverrides;

  public SubscriptionUpdateInputSubscription() {
  }

  public SubscriptionUpdateInputSubscription name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The display name of the subscription on an invoice. This field allows for customization of the subscription&#39;s name for billing purposes, especially useful when a single customer has multiple subscriptions using the same plan.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public SubscriptionUpdateInputSubscription endingAt(OffsetDateTime endingAt) {
    
    this.endingAt = endingAt;
    return this;
  }

   /**
   * The effective end date of the subscription. If this field is set to null, the subscription will automatically renew. This date should be provided in ISO 8601 datetime format, and use Coordinated Universal Time (UTC).
   * @return endingAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndingAt() {
    return endingAt;
  }


  @JsonProperty(JSON_PROPERTY_ENDING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndingAt(OffsetDateTime endingAt) {
    this.endingAt = endingAt;
  }


  public SubscriptionUpdateInputSubscription subscriptionAt(OffsetDateTime subscriptionAt) {
    
    this.subscriptionAt = subscriptionAt;
    return this;
  }

   /**
   * The start date and time of the subscription. This field can only be modified for pending subscriptions that have not yet started. This date should be provided in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return subscriptionAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubscriptionAt() {
    return subscriptionAt;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionAt(OffsetDateTime subscriptionAt) {
    this.subscriptionAt = subscriptionAt;
  }


  public SubscriptionUpdateInputSubscription planOverrides(PlanOverridesObject planOverrides) {
    
    this.planOverrides = planOverrides;
    return this;
  }

   /**
   * Get planOverrides
   * @return planOverrides
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlanOverridesObject getPlanOverrides() {
    return planOverrides;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanOverrides(PlanOverridesObject planOverrides) {
    this.planOverrides = planOverrides;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdateInputSubscription subscriptionUpdateInputSubscription = (SubscriptionUpdateInputSubscription) o;
    return equalsNullable(this.name, subscriptionUpdateInputSubscription.name) &&
        Objects.equals(this.endingAt, subscriptionUpdateInputSubscription.endingAt) &&
        Objects.equals(this.subscriptionAt, subscriptionUpdateInputSubscription.subscriptionAt) &&
        Objects.equals(this.planOverrides, subscriptionUpdateInputSubscription.planOverrides);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), endingAt, subscriptionAt, planOverrides);
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
    sb.append("class SubscriptionUpdateInputSubscription {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endingAt: ").append(toIndentedString(endingAt)).append("\n");
    sb.append("    subscriptionAt: ").append(toIndentedString(subscriptionAt)).append("\n");
    sb.append("    planOverrides: ").append(toIndentedString(planOverrides)).append("\n");
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

