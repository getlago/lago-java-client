

# PlanCreateInputPlan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the plan. |  [optional] |
|**invoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the plan will be used as the default display name. |  [optional] |
|**code** | **String** | The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance. |  [optional] |
|**interval** | [**IntervalEnum**](#IntervalEnum) | The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60;, or &#x60;weekly&#x60;. |  [optional] |
|**description** | **String** | The description on the plan. |  [optional] |
|**amountCents** | **Integer** | The base cost of the plan, excluding any applicable taxes, that is billed on a recurring basis. This value is defined at 0 if your plan is a pay-as-you-go plan. |  [optional] |
|**amountCurrency** | [**Currency**](Currency.md) |  |  [optional] |
|**trialPeriod** | **BigDecimal** | The duration in days during which the base cost of the plan is offered for free. |  [optional] |
|**payInAdvance** | **Boolean** | This field determines the billing timing for the plan. When set to &#x60;true&#x60;, the base cost of the plan is due at the beginning of each billing period. Conversely, when set to &#x60;false&#x60;, the base cost of the plan is due at the end of each billing period. |  [optional] |
|**billChargesMonthly** | **Boolean** | This field, when set to &#x60;true&#x60;, enables to invoice usage-based charges on monthly basis, even if the cadence of the plan is yearly. This allows customers to pay charges overage on a monthly basis. This can be set to true only if the plan’s interval is &#x60;yearly&#x60;. |  [optional] |
|**taxCodes** | **List&lt;String&gt;** | List of unique code used to identify the taxes. |  [optional] |
|**charges** | [**List&lt;PlanCreateInputPlanChargesInner&gt;**](PlanCreateInputPlanChargesInner.md) | Additional usage-based charges for this plan. |  [optional] |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| QUARTERLY | &quot;quarterly&quot; |
| YEARLY | &quot;yearly&quot; |



