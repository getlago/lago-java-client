

# ChargeObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**lagoBillableMetricId** | **UUID** |  |  |
|**billableMetricCode** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**chargeModel** | [**ChargeModelEnum**](#ChargeModelEnum) | Charge model type |  |
|**instant** | **Boolean** |  |  [optional] |
|**minAmountCents** | **Integer** |  |  [optional] |
|**properties** | **Object** |  |  [optional] |
|**groupProperties** | [**List&lt;GroupPropertiesObject&gt;**](GroupPropertiesObject.md) |  |  [optional] |



## Enum: ChargeModelEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| GRADUATED | &quot;graduated&quot; |
| PACKAGE | &quot;package&quot; |
| PERCENTAGE | &quot;percentage&quot; |
| VOLUME | &quot;volume&quot; |



