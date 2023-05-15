

# PlanObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**code** | **String** |  |  |
|**interval** | [**IntervalEnum**](#IntervalEnum) | Plan interval |  |
|**description** | **String** |  |  [optional] |
|**amountCents** | **Integer** |  |  |
|**amountCurrency** | **String** |  |  |
|**trialPeriod** | **BigDecimal** |  |  [optional] |
|**payInAdvance** | **Boolean** |  |  [optional] |
|**billChargesMonthly** | **Boolean** |  |  [optional] |
|**activeSubscriptionsCount** | **Integer** |  |  |
|**draftInvoicesCount** | **Integer** |  |  |
|**charges** | [**List&lt;ChargeObject&gt;**](ChargeObject.md) |  |  [optional] |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| YEARLY | &quot;yearly&quot; |



