

# PlanInputPlan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**interval** | [**IntervalEnum**](#IntervalEnum) | Plan interval |  [optional] |
|**description** | **String** |  |  [optional] |
|**amountCents** | **Integer** |  |  [optional] |
|**amountCurrency** | **String** |  |  [optional] |
|**trialPeriod** | **BigDecimal** |  |  [optional] |
|**payInAdvance** | **Boolean** |  |  [optional] |
|**billChargesMonthly** | **Boolean** |  |  [optional] |
|**charges** | [**List&lt;PlanInputPlanChargesInner&gt;**](PlanInputPlanChargesInner.md) |  |  [optional] |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| YEARLY | &quot;yearly&quot; |



