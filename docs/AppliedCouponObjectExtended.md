

# AppliedCouponObjectExtended


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**lagoCouponId** | **UUID** |  |  |
|**couponCode** | **String** |  |  |
|**lagoCustomerId** | **UUID** |  |  |
|**externalCustomerId** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status |  |
|**amountCents** | **Integer** |  |  |
|**amountCentsRemaining** | **Integer** |  |  [optional] |
|**amountCurrency** | **String** |  |  |
|**percentageRate** | **BigDecimal** |  |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Frequency type |  |
|**frequencyDuration** | **Integer** |  |  [optional] |
|**frequencyDurationRemaining** | **Integer** |  |  [optional] |
|**expirationAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**terminatedAt** | **OffsetDateTime** |  |  [optional] |
|**credits** | [**List&lt;CreditObject&gt;**](CreditObject.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TERMINATED | &quot;terminated&quot; |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| ONCE | &quot;once&quot; |
| RECURRING | &quot;recurring&quot; |



