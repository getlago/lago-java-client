

# ChargeObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier of charge, created by Lago. |  |
|**lagoBillableMetricId** | **UUID** | Unique identifier of the billable metric created by Lago. |  |
|**billableMetricCode** | **String** | Unique code identifying a billable metric. |  |
|**invoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the charge was created. It is expressed in UTC format according to the ISO 8601 datetime standard. |  |
|**chargeModel** | [**ChargeModelEnum**](#ChargeModelEnum) | Specifies the pricing model used for the calculation of the final fee. It can be &#x60;standard&#x60;, &#x60;graduated&#x60;, &#x60;graduated_percentage&#x60;, &#x60;package&#x60;, &#x60;percentage&#x60; or &#x60;volume&#x60;. |  |
|**payInAdvance** | **Boolean** | This field determines the billing timing for this specific usage-based charge. When set to &#x60;true&#x60;, the charge is due and invoiced immediately. Conversely, when set to &#x60;false&#x60;, the charge is due and invoiced at the end of each billing period. |  [optional] |
|**invoiceable** | **Boolean** | This field specifies whether the charge should be included in a proper invoice. If set to &#x60;false&#x60;, no invoice will be issued for this charge. You can only set it to &#x60;false&#x60; when &#x60;pay_in_advance&#x60; is &#x60;true&#x60;. |  [optional] |
|**prorated** | **Boolean** | Specifies whether a charge is prorated based on the remaining number of days in the billing period or billed fully.  - If set to &#x60;true&#x60;, the charge is prorated based on the remaining days in the current billing period. - If set to &#x60;false&#x60;, the charge is billed in full. - If not defined in the request, default value is &#x60;false&#x60;. |  [optional] |
|**minAmountCents** | **Integer** | The minimum spending amount required for the charge, measured in cents and excluding any applicable taxes. It indicates the minimum amount that needs to be charged for each billing period. |  [optional] |
|**properties** | [**ChargeObjectProperties**](ChargeObjectProperties.md) |  |  [optional] |
|**groupProperties** | [**List&lt;GroupPropertiesObject&gt;**](GroupPropertiesObject.md) | All charge information, sorted by groups. |  [optional] |
|**taxes** | [**List&lt;TaxObject&gt;**](TaxObject.md) | All taxes applied to the charge. |  [optional] |



## Enum: ChargeModelEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| GRADUATED | &quot;graduated&quot; |
| GRADUATED_PERCENTAGE | &quot;graduated_percentage&quot; |
| PACKAGE | &quot;package&quot; |
| PERCENTAGE | &quot;percentage&quot; |
| VOLUME | &quot;volume&quot; |



