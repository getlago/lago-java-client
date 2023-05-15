

# PlanInputPlanChargesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**billableMetricId** | **UUID** |  |  [optional] |
|**chargeModel** | [**ChargeModelEnum**](#ChargeModelEnum) | Charge model type |  [optional] |
|**instant** | **Boolean** |  |  [optional] |
|**minAmountCents** | **Integer** |  |  [optional] |
|**properties** | **Object** |  |  [optional] |
|**groupProperties** | [**List&lt;PlanInputPlanChargesInnerGroupPropertiesInner&gt;**](PlanInputPlanChargesInnerGroupPropertiesInner.md) |  |  [optional] |



## Enum: ChargeModelEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| GRADUATED | &quot;graduated&quot; |
| PACKAGE | &quot;package&quot; |
| PERCENTAGE | &quot;percentage&quot; |
| VOLUME | &quot;volume&quot; |



