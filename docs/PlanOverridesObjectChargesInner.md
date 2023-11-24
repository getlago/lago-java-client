

# PlanOverridesObjectChargesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the charge created by Lago. |  [optional] |
|**billableMetricId** | **UUID** | Unique identifier of the billable metric created by Lago. |  [optional] |
|**invoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name. |  [optional] |
|**minAmountCents** | **Integer** | The minimum spending amount required for the charge, measured in cents and excluding any applicable taxes. It indicates the minimum amount that needs to be charged for each billing period. |  [optional] |
|**properties** | [**ChargeObjectProperties**](ChargeObjectProperties.md) |  |  [optional] |
|**groupProperties** | [**List&lt;PlanCreateInputPlanChargesInnerGroupPropertiesInner&gt;**](PlanCreateInputPlanChargesInnerGroupPropertiesInner.md) | All charge information, sorted by groups. |  [optional] |
|**taxCodes** | **List&lt;String&gt;** | List of unique code used to identify the taxes. |  [optional] |



