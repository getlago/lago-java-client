

# PlanOverridesObject

Based plan overrides.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amountCents** | **Integer** | The base cost of the plan, excluding any applicable taxes, that is billed on a recurring basis. This value is defined at 0 if your plan is a pay-as-you-go plan. |  [optional] |
|**amountCurrency** | [**Currency**](Currency.md) |  |  [optional] |
|**description** | **String** | The description on the plan. |  [optional] |
|**invoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the plan will be used as the default display name. |  [optional] |
|**name** | **String** | The name of the plan. |  [optional] |
|**taxCodes** | **List&lt;String&gt;** | List of unique code used to identify the taxes. |  [optional] |
|**trialPeriod** | **BigDecimal** | The duration in days during which the base cost of the plan is offered for free. |  [optional] |
|**charges** | [**List&lt;PlanOverridesObjectChargesInner&gt;**](PlanOverridesObjectChargesInner.md) | Additional usage-based charges for this plan. |  [optional] |



