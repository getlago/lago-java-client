

# FeeObjectItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Billing time |  |
|**code** | **String** |  |  |
|**name** | **String** |  |  |
|**lagoItemId** | **UUID** |  |  |
|**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHARGE | &quot;charge&quot; |
| ADD_ON | &quot;add_on&quot; |
| SUBSCRIPTION | &quot;subscription&quot; |
| CREDIT | &quot;credit&quot; |



## Enum: ItemTypeEnum

| Name | Value |
|---- | -----|
| ADDON | &quot;AddOn&quot; |
| BILLABLEMETRIC | &quot;BillableMetric&quot; |
| SUBSCRIPTION | &quot;Subscription&quot; |
| WALLETTRANSACTION | &quot;WalletTransaction&quot; |



