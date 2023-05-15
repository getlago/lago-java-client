

# SubscriptionObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**externalId** | **String** |  |  |
|**lagoCustomerId** | **UUID** |  |  |
|**externalCustomerId** | **String** |  |  |
|**name** | **String** |  |  [optional] |
|**planCode** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Subscription status |  |
|**billingTime** | [**BillingTimeEnum**](#BillingTimeEnum) | Billing time |  |
|**subscriptionAt** | **OffsetDateTime** |  |  |
|**startedAt** | **OffsetDateTime** |  |  |
|**terminatedAt** | **OffsetDateTime** |  |  [optional] |
|**canceledAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**previousPlanCode** | **String** |  |  [optional] |
|**nextPlanCode** | **String** |  |  [optional] |
|**downgradePlanDate** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| PENDING | &quot;pending&quot; |
| TERMINATED | &quot;terminated&quot; |
| CANCELED | &quot;canceled&quot; |



## Enum: BillingTimeEnum

| Name | Value |
|---- | -----|
| CALENDAR | &quot;calendar&quot; |
| ANNIVERSARY | &quot;anniversary&quot; |



