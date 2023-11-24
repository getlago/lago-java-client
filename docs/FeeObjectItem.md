

# FeeObjectItem

Item attached to the fee

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;. |  |
|**code** | **String** | The code of the fee item. It can be the code of the &#x60;add-o&#x60;n, the code of the &#x60;charge&#x60;, the code of the &#x60;credit&#x60; or the code of the &#x60;subscription&#x60;. |  |
|**name** | **String** | The name of the fee item. It can be the name of the &#x60;add-on&#x60;, the name of the &#x60;charge&#x60;, the name of the &#x60;credit&#x60; or the name of the &#x60;subscription&#x60;. |  |
|**invoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name. |  [optional] |
|**groupInvoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name. |  [optional] |
|**lagoItemId** | **UUID** | Unique identifier of the fee item, created by Lago. It can be the identifier of the &#x60;add-on&#x60;, the identifier of the &#x60;charge&#x60;, the identifier of the &#x60;credit&#x60; or the identifier of the &#x60;subscription&#x60;. |  |
|**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) | The type of the fee item. Possible values are &#x60;AddOn&#x60;, &#x60;BillableMetric&#x60;, &#x60;WalletTransaction&#x60; or &#x60;Subscription&#x60;. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHARGE | &quot;charge&quot; |
| ADD_ON | &quot;add_on&quot; |
| SUBSCRIPTION | &quot;subscription&quot; |
| CREDIT | &quot;credit&quot; |



## Enum: ItemTypeEnum

| Name | Value |
|---- | -----|
| ADDON | &quot;AddOn&quot; |
| BILLABLEMETRIC | &quot;BillableMetric&quot; |
| SUBSCRIPTION | &quot;Subscription&quot; |
| WALLETTRANSACTION | &quot;WalletTransaction&quot; |



