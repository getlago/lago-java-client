

# CustomerChargeUsageObjectCharge

Object listing all the properties for a specific charge item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the charge within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the charge’s record within the Lago system. |  |
|**chargeModel** | [**ChargeModelEnum**](#ChargeModelEnum) | The pricing model applied to this charge. Possible values are standard, &#x60;graduated&#x60;, &#x60;percentage&#x60;, &#x60;package&#x60; or &#x60;volume&#x60;. |  |



## Enum: ChargeModelEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| GRADUATED | &quot;graduated&quot; |
| PACKAGE | &quot;package&quot; |
| PERCENTAGE | &quot;percentage&quot; |
| VOLUME | &quot;volume&quot; |



