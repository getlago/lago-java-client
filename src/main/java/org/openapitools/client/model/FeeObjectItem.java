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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Item attached to the fee
 */
@JsonPropertyOrder({
  FeeObjectItem.JSON_PROPERTY_TYPE,
  FeeObjectItem.JSON_PROPERTY_CODE,
  FeeObjectItem.JSON_PROPERTY_NAME,
  FeeObjectItem.JSON_PROPERTY_INVOICE_DISPLAY_NAME,
  FeeObjectItem.JSON_PROPERTY_GROUP_INVOICE_DISPLAY_NAME,
  FeeObjectItem.JSON_PROPERTY_LAGO_ITEM_ID,
  FeeObjectItem.JSON_PROPERTY_ITEM_TYPE
})
@JsonTypeName("FeeObject_item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class FeeObjectItem {
  /**
   * The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;.
   */
  public enum TypeEnum {
    CHARGE("charge"),
    
    ADD_ON("add_on"),
    
    SUBSCRIPTION("subscription"),
    
    CREDIT("credit");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INVOICE_DISPLAY_NAME = "invoice_display_name";
  private String invoiceDisplayName;

  public static final String JSON_PROPERTY_GROUP_INVOICE_DISPLAY_NAME = "group_invoice_display_name";
  private String groupInvoiceDisplayName;

  public static final String JSON_PROPERTY_LAGO_ITEM_ID = "lago_item_id";
  private UUID lagoItemId;

  /**
   * The type of the fee item. Possible values are &#x60;AddOn&#x60;, &#x60;BillableMetric&#x60;, &#x60;WalletTransaction&#x60; or &#x60;Subscription&#x60;.
   */
  public enum ItemTypeEnum {
    ADDON("AddOn"),
    
    BILLABLEMETRIC("BillableMetric"),
    
    SUBSCRIPTION("Subscription"),
    
    WALLETTRANSACTION("WalletTransaction");

    private String value;

    ItemTypeEnum(String value) {
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
    public static ItemTypeEnum fromValue(String value) {
      for (ItemTypeEnum b : ItemTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ITEM_TYPE = "item_type";
  private ItemTypeEnum itemType;

  public FeeObjectItem() {
  }

  public FeeObjectItem type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public FeeObjectItem code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code of the fee item. It can be the code of the &#x60;add-o&#x60;n, the code of the &#x60;charge&#x60;, the code of the &#x60;credit&#x60; or the code of the &#x60;subscription&#x60;.
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public FeeObjectItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the fee item. It can be the name of the &#x60;add-on&#x60;, the name of the &#x60;charge&#x60;, the name of the &#x60;credit&#x60; or the name of the &#x60;subscription&#x60;.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public FeeObjectItem invoiceDisplayName(String invoiceDisplayName) {
    
    this.invoiceDisplayName = invoiceDisplayName;
    return this;
  }

   /**
   * Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name.
   * @return invoiceDisplayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDisplayName() {
    return invoiceDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDisplayName(String invoiceDisplayName) {
    this.invoiceDisplayName = invoiceDisplayName;
  }


  public FeeObjectItem groupInvoiceDisplayName(String groupInvoiceDisplayName) {
    
    this.groupInvoiceDisplayName = groupInvoiceDisplayName;
    return this;
  }

   /**
   * Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name.
   * @return groupInvoiceDisplayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_INVOICE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupInvoiceDisplayName() {
    return groupInvoiceDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_INVOICE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupInvoiceDisplayName(String groupInvoiceDisplayName) {
    this.groupInvoiceDisplayName = groupInvoiceDisplayName;
  }


  public FeeObjectItem lagoItemId(UUID lagoItemId) {
    
    this.lagoItemId = lagoItemId;
    return this;
  }

   /**
   * Unique identifier of the fee item, created by Lago. It can be the identifier of the &#x60;add-on&#x60;, the identifier of the &#x60;charge&#x60;, the identifier of the &#x60;credit&#x60; or the identifier of the &#x60;subscription&#x60;.
   * @return lagoItemId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoItemId() {
    return lagoItemId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoItemId(UUID lagoItemId) {
    this.lagoItemId = lagoItemId;
  }


  public FeeObjectItem itemType(ItemTypeEnum itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * The type of the fee item. Possible values are &#x60;AddOn&#x60;, &#x60;BillableMetric&#x60;, &#x60;WalletTransaction&#x60; or &#x60;Subscription&#x60;.
   * @return itemType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ItemTypeEnum getItemType() {
    return itemType;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeObjectItem feeObjectItem = (FeeObjectItem) o;
    return Objects.equals(this.type, feeObjectItem.type) &&
        Objects.equals(this.code, feeObjectItem.code) &&
        Objects.equals(this.name, feeObjectItem.name) &&
        Objects.equals(this.invoiceDisplayName, feeObjectItem.invoiceDisplayName) &&
        Objects.equals(this.groupInvoiceDisplayName, feeObjectItem.groupInvoiceDisplayName) &&
        Objects.equals(this.lagoItemId, feeObjectItem.lagoItemId) &&
        Objects.equals(this.itemType, feeObjectItem.itemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, name, invoiceDisplayName, groupInvoiceDisplayName, lagoItemId, itemType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeObjectItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    invoiceDisplayName: ").append(toIndentedString(invoiceDisplayName)).append("\n");
    sb.append("    groupInvoiceDisplayName: ").append(toIndentedString(groupInvoiceDisplayName)).append("\n");
    sb.append("    lagoItemId: ").append(toIndentedString(lagoItemId)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
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

