

# PlanObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier of the plan created by Lago. |  |
|**name** | **String** | The name of the plan. |  |
|**createdAt** | **OffsetDateTime** | The date and time when the plan was created. It is expressed in UTC format according to the ISO 8601 datetime standard. This field provides the timestamp for the exact moment when the plan was initially created. |  |
|**code** | **String** | The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance. |  |
|**interval** | [**IntervalEnum**](#IntervalEnum) | The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60; or &#x60;weekly&#x60;. |  |
|**description** | **String** | The description on the plan. |  [optional] |
|**amountCents** | **Integer** | The base cost of the plan, excluding any applicable taxes, that is billed on a recurring basis. This value is defined at 0 if your plan is a pay-as-you-go plan. |  |
|**amountCurrency** | [**Currency**](Currency.md) |  |  |
|**trialPeriod** | **BigDecimal** | The duration in days during which the base cost of the plan is offered for free. |  [optional] |
|**payInAdvance** | **Boolean** | This field determines the billing timing for the plan. When set to &#x60;true&#x60;, the base cost of the plan is due at the beginning of each billing period. Conversely, when set to &#x60;false&#x60;, the base cost of the plan is due at the end of each billing period. |  [optional] |
|**billChargesMonthly** | **Boolean** | This field, when set to &#x60;true&#x60;, enables to invoice usage-based charges on monthly basis, even if the cadence of the plan is yearly. This allows customers to pay charges overage on a monthly basis. This can be set to true only if the plan’s interval is &#x60;yearly&#x60;. |  [optional] |
|**activeSubscriptionsCount** | **Integer** | The count of active subscriptions that are currently associated with the plan. This field provides valuable information regarding the impact of deleting the plan. By checking the value of this field, you can determine the number of subscriptions that will be affected if the plan is deleted. |  |
|**draftInvoicesCount** | **Integer** | The number of draft invoices that include a subscription attached to the plan. This field provides valuable information about the impact of deleting the plan. By checking the value of this field, you can determine the number of draft invoices that will be affected if the plan is deleted. |  |
|**charges** | [**List&lt;ChargeObject&gt;**](ChargeObject.md) | Additional usage-based charges for this plan. |  [optional] |
|**taxes** | [**List&lt;TaxObject&gt;**](TaxObject.md) | All taxes applied to the plan. |  [optional] |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| QUARTERLY | &quot;quarterly&quot; |
| YEARLY | &quot;yearly&quot; |



