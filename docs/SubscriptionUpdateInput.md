

# SubscriptionUpdateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | If the field is not defined and multiple &#x60;active&#x60; and &#x60;pending&#x60; subscriptions exists, Lago will update the &#x60;active&#x60; subscription. However, if you wish to update a &#x60;pending&#x60; subscription, please ensure that you include the &#x60;status&#x60; attribute with the &#x60;pending&#x60; value in your request body. |  [optional] |
|**subscription** | [**SubscriptionUpdateInputSubscription**](SubscriptionUpdateInputSubscription.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| PENDING | &quot;pending&quot; |



