

# CreditObjectItem

The item attached to the credit.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoItemId** | **UUID** | Unique identifier assigned to the credit item within the Lago application. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of credit applied. Possible values are &#x60;coupon&#x60; or &#x60;credit_note&#x60;. |  |
|**code** | **String** | The code of the credit applied. It can be the code of the coupon attached to the credit or the credit note&#39;s number. |  |
|**name** | **String** | The name of the credit applied. It can be the name of the coupon attached to the credit or the initial invoice&#39;s number linked to the credit note. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COUPON | &quot;coupon&quot; |
| CREDIT_NOTE | &quot;credit_note&quot; |



