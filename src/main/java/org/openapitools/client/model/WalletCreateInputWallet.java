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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.WalletCreateInputWalletRecurringTransactionRulesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WalletCreateInputWallet
 */
@JsonPropertyOrder({
  WalletCreateInputWallet.JSON_PROPERTY_NAME,
  WalletCreateInputWallet.JSON_PROPERTY_RATE_AMOUNT,
  WalletCreateInputWallet.JSON_PROPERTY_CURRENCY,
  WalletCreateInputWallet.JSON_PROPERTY_PAID_CREDITS,
  WalletCreateInputWallet.JSON_PROPERTY_GRANTED_CREDITS,
  WalletCreateInputWallet.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  WalletCreateInputWallet.JSON_PROPERTY_EXPIRATION_AT,
  WalletCreateInputWallet.JSON_PROPERTY_RECURRING_TRANSACTION_RULES
})
@JsonTypeName("WalletCreateInput_wallet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class WalletCreateInputWallet {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RATE_AMOUNT = "rate_amount";
  private String rateAmount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_PAID_CREDITS = "paid_credits";
  private JsonNullable<String> paidCredits = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GRANTED_CREDITS = "granted_credits";
  private JsonNullable<String> grantedCredits = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private String externalCustomerId;

  public static final String JSON_PROPERTY_EXPIRATION_AT = "expiration_at";
  private JsonNullable<OffsetDateTime> expirationAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_RECURRING_TRANSACTION_RULES = "recurring_transaction_rules";
  private List<WalletCreateInputWalletRecurringTransactionRulesInner> recurringTransactionRules;

  public WalletCreateInputWallet() {
  }

  public WalletCreateInputWallet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the wallet.
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


  public WalletCreateInputWallet rateAmount(String rateAmount) {
    
    this.rateAmount = rateAmount;
    return this;
  }

   /**
   * The rate of conversion between credits and the amount in the specified currency. It indicates the ratio or factor used to convert credits into the corresponding monetary value in the currency of the transaction.
   * @return rateAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RATE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRateAmount() {
    return rateAmount;
  }


  @JsonProperty(JSON_PROPERTY_RATE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRateAmount(String rateAmount) {
    this.rateAmount = rateAmount;
  }


  public WalletCreateInputWallet currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public WalletCreateInputWallet paidCredits(String paidCredits) {
    this.paidCredits = JsonNullable.<String>of(paidCredits);
    
    return this;
  }

   /**
   * The number of paid credits. Required only if there is no granted credits.
   * @return paidCredits
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPaidCredits() {
        return paidCredits.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAID_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaidCredits_JsonNullable() {
    return paidCredits;
  }
  
  @JsonProperty(JSON_PROPERTY_PAID_CREDITS)
  public void setPaidCredits_JsonNullable(JsonNullable<String> paidCredits) {
    this.paidCredits = paidCredits;
  }

  public void setPaidCredits(String paidCredits) {
    this.paidCredits = JsonNullable.<String>of(paidCredits);
  }


  public WalletCreateInputWallet grantedCredits(String grantedCredits) {
    this.grantedCredits = JsonNullable.<String>of(grantedCredits);
    
    return this;
  }

   /**
   * The number of free granted credits. Required only if there is no paid credits.
   * @return grantedCredits
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getGrantedCredits() {
        return grantedCredits.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRANTED_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGrantedCredits_JsonNullable() {
    return grantedCredits;
  }
  
  @JsonProperty(JSON_PROPERTY_GRANTED_CREDITS)
  public void setGrantedCredits_JsonNullable(JsonNullable<String> grantedCredits) {
    this.grantedCredits = grantedCredits;
  }

  public void setGrantedCredits(String grantedCredits) {
    this.grantedCredits = JsonNullable.<String>of(grantedCredits);
  }


  public WalletCreateInputWallet externalCustomerId(String externalCustomerId) {
    
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


  public WalletCreateInputWallet expirationAt(OffsetDateTime expirationAt) {
    this.expirationAt = JsonNullable.<OffsetDateTime>of(expirationAt);
    
    return this;
  }

   /**
   * The date and time that determines when the wallet will expire. It follows the ISO 8601 datetime format and is expressed in Coordinated Universal Time (UTC).
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


  public WalletCreateInputWallet recurringTransactionRules(List<WalletCreateInputWalletRecurringTransactionRulesInner> recurringTransactionRules) {
    
    this.recurringTransactionRules = recurringTransactionRules;
    return this;
  }

  public WalletCreateInputWallet addRecurringTransactionRulesItem(WalletCreateInputWalletRecurringTransactionRulesInner recurringTransactionRulesItem) {
    if (this.recurringTransactionRules == null) {
      this.recurringTransactionRules = new ArrayList<>();
    }
    this.recurringTransactionRules.add(recurringTransactionRulesItem);
    return this;
  }

   /**
   * List of recurring transaction rules. Currently, we only allow one recurring rule per wallet.
   * @return recurringTransactionRules
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRING_TRANSACTION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WalletCreateInputWalletRecurringTransactionRulesInner> getRecurringTransactionRules() {
    return recurringTransactionRules;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_TRANSACTION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringTransactionRules(List<WalletCreateInputWalletRecurringTransactionRulesInner> recurringTransactionRules) {
    this.recurringTransactionRules = recurringTransactionRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCreateInputWallet walletCreateInputWallet = (WalletCreateInputWallet) o;
    return Objects.equals(this.name, walletCreateInputWallet.name) &&
        Objects.equals(this.rateAmount, walletCreateInputWallet.rateAmount) &&
        Objects.equals(this.currency, walletCreateInputWallet.currency) &&
        equalsNullable(this.paidCredits, walletCreateInputWallet.paidCredits) &&
        equalsNullable(this.grantedCredits, walletCreateInputWallet.grantedCredits) &&
        Objects.equals(this.externalCustomerId, walletCreateInputWallet.externalCustomerId) &&
        equalsNullable(this.expirationAt, walletCreateInputWallet.expirationAt) &&
        Objects.equals(this.recurringTransactionRules, walletCreateInputWallet.recurringTransactionRules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rateAmount, currency, hashCodeNullable(paidCredits), hashCodeNullable(grantedCredits), externalCustomerId, hashCodeNullable(expirationAt), recurringTransactionRules);
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
    sb.append("class WalletCreateInputWallet {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rateAmount: ").append(toIndentedString(rateAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paidCredits: ").append(toIndentedString(paidCredits)).append("\n");
    sb.append("    grantedCredits: ").append(toIndentedString(grantedCredits)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    expirationAt: ").append(toIndentedString(expirationAt)).append("\n");
    sb.append("    recurringTransactionRules: ").append(toIndentedString(recurringTransactionRules)).append("\n");
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

