

# CouponObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**code** | **String** |  |  |
|**couponType** | [**CouponTypeEnum**](#CouponTypeEnum) | Coupon type |  |
|**amountCents** | **Integer** |  |  [optional] |
|**amountCurrency** | **String** |  |  [optional] |
|**reusable** | **Boolean** |  |  [optional] |
|**limitedPlans** | **Boolean** |  |  [optional] |
|**planCodes** | **List&lt;String&gt;** |  |  [optional] |
|**limitedBillableMetrics** | **Boolean** |  |  [optional] |
|**billableMetricCodes** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**percentageRate** | **BigDecimal** |  |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Frequency type |  |
|**frequencyDuration** | **Integer** |  |  [optional] |
|**expirationAt** | **OffsetDateTime** |  |  [optional] |
|**expiration** | [**ExpirationEnum**](#ExpirationEnum) | Expiration type |  |



## Enum: CouponTypeEnum

| Name | Value |
|---- | -----|
| FIXED_AMOUNT | &quot;fixed_amount&quot; |
| PERCENTAGE | &quot;percentage&quot; |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| ONCE | &quot;once&quot; |
| RECURRING | &quot;recurring&quot; |



## Enum: ExpirationEnum

| Name | Value |
|---- | -----|
| NO_EXPIRATION | &quot;no_expiration&quot; |
| TIME_LIMIT | &quot;time_limit&quot; |



