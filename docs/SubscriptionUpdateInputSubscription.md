

# SubscriptionUpdateInputSubscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The display name of the subscription on an invoice. This field allows for customization of the subscription&#39;s name for billing purposes, especially useful when a single customer has multiple subscriptions using the same plan. |  [optional] |
|**endingAt** | **OffsetDateTime** | The effective end date of the subscription. If this field is set to null, the subscription will automatically renew. This date should be provided in ISO 8601 datetime format, and use Coordinated Universal Time (UTC). |  [optional] |
|**subscriptionAt** | **OffsetDateTime** | The start date and time of the subscription. This field can only be modified for pending subscriptions that have not yet started. This date should be provided in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). |  [optional] |
|**planOverrides** | [**PlanOverridesObject**](PlanOverridesObject.md) |  |  [optional] |



