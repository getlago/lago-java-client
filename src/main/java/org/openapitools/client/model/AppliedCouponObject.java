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
import java.util.UUID;
import org.openapitools.client.model.Currency;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AppliedCouponObject
 */
@JsonPropertyOrder({
  AppliedCouponObject.JSON_PROPERTY_LAGO_ID,
  AppliedCouponObject.JSON_PROPERTY_LAGO_COUPON_ID,
  AppliedCouponObject.JSON_PROPERTY_COUPON_CODE,
  AppliedCouponObject.JSON_PROPERTY_COUPON_NAME,
  AppliedCouponObject.JSON_PROPERTY_LAGO_CUSTOMER_ID,
  AppliedCouponObject.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  AppliedCouponObject.JSON_PROPERTY_STATUS,
  AppliedCouponObject.JSON_PROPERTY_AMOUNT_CENTS,
  AppliedCouponObject.JSON_PROPERTY_AMOUNT_CENTS_REMAINING,
  AppliedCouponObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  AppliedCouponObject.JSON_PROPERTY_PERCENTAGE_RATE,
  AppliedCouponObject.JSON_PROPERTY_FREQUENCY,
  AppliedCouponObject.JSON_PROPERTY_FREQUENCY_DURATION,
  AppliedCouponObject.JSON_PROPERTY_FREQUENCY_DURATION_REMAINING,
  AppliedCouponObject.JSON_PROPERTY_EXPIRATION_AT,
  AppliedCouponObject.JSON_PROPERTY_CREATED_AT,
  AppliedCouponObject.JSON_PROPERTY_TERMINATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class AppliedCouponObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_LAGO_COUPON_ID = "lago_coupon_id";
  private UUID lagoCouponId;

  public static final String JSON_PROPERTY_COUPON_CODE = "coupon_code";
  private String couponCode;

  public static final String JSON_PROPERTY_COUPON_NAME = "coupon_name";
  private String couponName;

  public static final String JSON_PROPERTY_LAGO_CUSTOMER_ID = "lago_customer_id";
  private UUID lagoCustomerId;

  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private String externalCustomerId;

  /**
   * The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    TERMINATED("terminated");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private JsonNullable<Integer> amountCents = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_AMOUNT_CENTS_REMAINING = "amount_cents_remaining";
  private JsonNullable<Integer> amountCentsRemaining = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_PERCENTAGE_RATE = "percentage_rate";
  private JsonNullable<String> percentageRate = JsonNullable.<String>undefined();

  /**
   * The type of frequency for the coupon. It can have three possible values: &#x60;once&#x60;, &#x60;recurring&#x60; or &#x60;forever&#x60;.  - If set to &#x60;once&#x60;, the coupon is applicable only for a single use. - If set to &#x60;recurring&#x60;, the coupon can be used multiple times for recurring billing periods. - If set to &#x60;forever&#x60;, the coupon has unlimited usage and can be applied indefinitely.
   */
  public enum FrequencyEnum {
    ONCE("once"),
    
    RECURRING("recurring");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private FrequencyEnum frequency;

  public static final String JSON_PROPERTY_FREQUENCY_DURATION = "frequency_duration";
  private JsonNullable<Integer> frequencyDuration = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FREQUENCY_DURATION_REMAINING = "frequency_duration_remaining";
  private JsonNullable<Integer> frequencyDurationRemaining = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_EXPIRATION_AT = "expiration_at";
  private JsonNullable<OffsetDateTime> expirationAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_TERMINATED_AT = "terminated_at";
  private JsonNullable<OffsetDateTime> terminatedAt = JsonNullable.<OffsetDateTime>undefined();

  public AppliedCouponObject() {
  }

  public AppliedCouponObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier of the applied coupon, created by Lago.
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoId() {
    return lagoId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public AppliedCouponObject lagoCouponId(UUID lagoCouponId) {
    
    this.lagoCouponId = lagoCouponId;
    return this;
  }

   /**
   * Unique identifier of the coupon, created by Lago.
   * @return lagoCouponId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_COUPON_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoCouponId() {
    return lagoCouponId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_COUPON_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoCouponId(UUID lagoCouponId) {
    this.lagoCouponId = lagoCouponId;
  }


  public AppliedCouponObject couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Unique code used to identify the coupon.
   * @return couponCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUPON_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCouponCode() {
    return couponCode;
  }


  @JsonProperty(JSON_PROPERTY_COUPON_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public AppliedCouponObject couponName(String couponName) {
    
    this.couponName = couponName;
    return this;
  }

   /**
   * The name of the coupon.
   * @return couponName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUPON_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCouponName() {
    return couponName;
  }


  @JsonProperty(JSON_PROPERTY_COUPON_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public AppliedCouponObject lagoCustomerId(UUID lagoCustomerId) {
    
    this.lagoCustomerId = lagoCustomerId;
    return this;
  }

   /**
   * Unique identifier of the customer, created by Lago.
   * @return lagoCustomerId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoCustomerId() {
    return lagoCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoCustomerId(UUID lagoCustomerId) {
    this.lagoCustomerId = lagoCustomerId;
  }


  public AppliedCouponObject externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application)
   * @return externalCustomerId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public AppliedCouponObject status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;.
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public AppliedCouponObject amountCents(Integer amountCents) {
    this.amountCents = JsonNullable.<Integer>of(amountCents);
    
    return this;
  }

   /**
   * The amount of the coupon in cents. This field is required only for coupon with &#x60;fixed_amount&#x60; type.
   * @return amountCents
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getAmountCents() {
        return amountCents.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAmountCents_JsonNullable() {
    return amountCents;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  public void setAmountCents_JsonNullable(JsonNullable<Integer> amountCents) {
    this.amountCents = amountCents;
  }

  public void setAmountCents(Integer amountCents) {
    this.amountCents = JsonNullable.<Integer>of(amountCents);
  }


  public AppliedCouponObject amountCentsRemaining(Integer amountCentsRemaining) {
    this.amountCentsRemaining = JsonNullable.<Integer>of(amountCentsRemaining);
    
    return this;
  }

   /**
   * The remaining amount in cents for a &#x60;fixed_amount&#x60; coupon with a frequency set to &#x60;once&#x60;. This field indicates the remaining balance or value that can still be utilized from the coupon.
   * @return amountCentsRemaining
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getAmountCentsRemaining() {
        return amountCentsRemaining.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS_REMAINING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAmountCentsRemaining_JsonNullable() {
    return amountCentsRemaining;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS_REMAINING)
  public void setAmountCentsRemaining_JsonNullable(JsonNullable<Integer> amountCentsRemaining) {
    this.amountCentsRemaining = amountCentsRemaining;
  }

  public void setAmountCentsRemaining(Integer amountCentsRemaining) {
    this.amountCentsRemaining = JsonNullable.<Integer>of(amountCentsRemaining);
  }


  public AppliedCouponObject amountCurrency(Currency amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getAmountCurrency() {
    return amountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountCurrency(Currency amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public AppliedCouponObject percentageRate(String percentageRate) {
    this.percentageRate = JsonNullable.<String>of(percentageRate);
    
    return this;
  }

   /**
   * The percentage rate of the coupon. This field is required only for coupons with a &#x60;percentage&#x60; coupon type.
   * @return percentageRate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPercentageRate() {
        return percentageRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERCENTAGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPercentageRate_JsonNullable() {
    return percentageRate;
  }
  
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_RATE)
  public void setPercentageRate_JsonNullable(JsonNullable<String> percentageRate) {
    this.percentageRate = percentageRate;
  }

  public void setPercentageRate(String percentageRate) {
    this.percentageRate = JsonNullable.<String>of(percentageRate);
  }


  public AppliedCouponObject frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The type of frequency for the coupon. It can have three possible values: &#x60;once&#x60;, &#x60;recurring&#x60; or &#x60;forever&#x60;.  - If set to &#x60;once&#x60;, the coupon is applicable only for a single use. - If set to &#x60;recurring&#x60;, the coupon can be used multiple times for recurring billing periods. - If set to &#x60;forever&#x60;, the coupon has unlimited usage and can be applied indefinitely.
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public AppliedCouponObject frequencyDuration(Integer frequencyDuration) {
    this.frequencyDuration = JsonNullable.<Integer>of(frequencyDuration);
    
    return this;
  }

   /**
   * Specifies the number of billing periods to which the coupon applies. This field is required only for coupons with a &#x60;recurring&#x60; frequency type
   * @return frequencyDuration
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getFrequencyDuration() {
        return frequencyDuration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FREQUENCY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFrequencyDuration_JsonNullable() {
    return frequencyDuration;
  }
  
  @JsonProperty(JSON_PROPERTY_FREQUENCY_DURATION)
  public void setFrequencyDuration_JsonNullable(JsonNullable<Integer> frequencyDuration) {
    this.frequencyDuration = frequencyDuration;
  }

  public void setFrequencyDuration(Integer frequencyDuration) {
    this.frequencyDuration = JsonNullable.<Integer>of(frequencyDuration);
  }


  public AppliedCouponObject frequencyDurationRemaining(Integer frequencyDurationRemaining) {
    this.frequencyDurationRemaining = JsonNullable.<Integer>of(frequencyDurationRemaining);
    
    return this;
  }

   /**
   * The remaining number of billing periods to which the coupon is applicable. This field determines the remaining usage or availability of the coupon based on the remaining billing periods.
   * @return frequencyDurationRemaining
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getFrequencyDurationRemaining() {
        return frequencyDurationRemaining.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FREQUENCY_DURATION_REMAINING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFrequencyDurationRemaining_JsonNullable() {
    return frequencyDurationRemaining;
  }
  
  @JsonProperty(JSON_PROPERTY_FREQUENCY_DURATION_REMAINING)
  public void setFrequencyDurationRemaining_JsonNullable(JsonNullable<Integer> frequencyDurationRemaining) {
    this.frequencyDurationRemaining = frequencyDurationRemaining;
  }

  public void setFrequencyDurationRemaining(Integer frequencyDurationRemaining) {
    this.frequencyDurationRemaining = JsonNullable.<Integer>of(frequencyDurationRemaining);
  }


  public AppliedCouponObject expirationAt(OffsetDateTime expirationAt) {
    this.expirationAt = JsonNullable.<OffsetDateTime>of(expirationAt);
    
    return this;
  }

   /**
   * The date and time after which the coupon will stop applying to customer&#39;s invoices. Once the expiration date is reached, the coupon will no longer be applicable, and any further invoices generated for the customer will not include the coupon discount.
   * @return expirationAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getExpirationAt() {
        return expirationAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRATION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getExpirationAt_JsonNullable() {
    return expirationAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRATION_AT)
  public void setExpirationAt_JsonNullable(JsonNullable<OffsetDateTime> expirationAt) {
    this.expirationAt = expirationAt;
  }

  public void setExpirationAt(OffsetDateTime expirationAt) {
    this.expirationAt = JsonNullable.<OffsetDateTime>of(expirationAt);
  }


  public AppliedCouponObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the coupon was assigned to a customer. It is expressed in UTC format according to the ISO 8601 datetime standard.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AppliedCouponObject terminatedAt(OffsetDateTime terminatedAt) {
    this.terminatedAt = JsonNullable.<OffsetDateTime>of(terminatedAt);
    
    return this;
  }

   /**
   * This field indicates the specific moment when the coupon amount is fully utilized or when the coupon is removed from the customer&#39;s coupon list. It is expressed in UTC format according to the ISO 8601 datetime standard.
   * @return terminatedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getTerminatedAt() {
        return terminatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TERMINATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getTerminatedAt_JsonNullable() {
    return terminatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_TERMINATED_AT)
  public void setTerminatedAt_JsonNullable(JsonNullable<OffsetDateTime> terminatedAt) {
    this.terminatedAt = terminatedAt;
  }

  public void setTerminatedAt(OffsetDateTime terminatedAt) {
    this.terminatedAt = JsonNullable.<OffsetDateTime>of(terminatedAt);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppliedCouponObject appliedCouponObject = (AppliedCouponObject) o;
    return Objects.equals(this.lagoId, appliedCouponObject.lagoId) &&
        Objects.equals(this.lagoCouponId, appliedCouponObject.lagoCouponId) &&
        Objects.equals(this.couponCode, appliedCouponObject.couponCode) &&
        Objects.equals(this.couponName, appliedCouponObject.couponName) &&
        Objects.equals(this.lagoCustomerId, appliedCouponObject.lagoCustomerId) &&
        Objects.equals(this.externalCustomerId, appliedCouponObject.externalCustomerId) &&
        Objects.equals(this.status, appliedCouponObject.status) &&
        equalsNullable(this.amountCents, appliedCouponObject.amountCents) &&
        equalsNullable(this.amountCentsRemaining, appliedCouponObject.amountCentsRemaining) &&
        Objects.equals(this.amountCurrency, appliedCouponObject.amountCurrency) &&
        equalsNullable(this.percentageRate, appliedCouponObject.percentageRate) &&
        Objects.equals(this.frequency, appliedCouponObject.frequency) &&
        equalsNullable(this.frequencyDuration, appliedCouponObject.frequencyDuration) &&
        equalsNullable(this.frequencyDurationRemaining, appliedCouponObject.frequencyDurationRemaining) &&
        equalsNullable(this.expirationAt, appliedCouponObject.expirationAt) &&
        Objects.equals(this.createdAt, appliedCouponObject.createdAt) &&
        equalsNullable(this.terminatedAt, appliedCouponObject.terminatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, lagoCouponId, couponCode, couponName, lagoCustomerId, externalCustomerId, status, hashCodeNullable(amountCents), hashCodeNullable(amountCentsRemaining), amountCurrency, hashCodeNullable(percentageRate), frequency, hashCodeNullable(frequencyDuration), hashCodeNullable(frequencyDurationRemaining), hashCodeNullable(expirationAt), createdAt, hashCodeNullable(terminatedAt));
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
    sb.append("class AppliedCouponObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    lagoCouponId: ").append(toIndentedString(lagoCouponId)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    couponName: ").append(toIndentedString(couponName)).append("\n");
    sb.append("    lagoCustomerId: ").append(toIndentedString(lagoCustomerId)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCentsRemaining: ").append(toIndentedString(amountCentsRemaining)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    percentageRate: ").append(toIndentedString(percentageRate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyDuration: ").append(toIndentedString(frequencyDuration)).append("\n");
    sb.append("    frequencyDurationRemaining: ").append(toIndentedString(frequencyDurationRemaining)).append("\n");
    sb.append("    expirationAt: ").append(toIndentedString(expirationAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    terminatedAt: ").append(toIndentedString(terminatedAt)).append("\n");
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

