

# CouponInputCoupon


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**couponType** | [**CouponTypeEnum**](#CouponTypeEnum) | Coupon type |  [optional] |
|**amountCents** | **Integer** |  |  [optional] |
|**amountCurrency** | **String** |  |  [optional] |
|**reusable** | **Boolean** |  |  [optional] |
|**percentageRate** | **BigDecimal** |  |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Frequency type |  [optional] |
|**frequencyDuration** | **Integer** |  |  [optional] |
|**expirationAt** | **OffsetDateTime** |  |  [optional] |
|**expiration** | [**ExpirationEnum**](#ExpirationEnum) | Expiration type |  [optional] |
|**appliesTo** | [**CouponInputCouponAppliesTo**](CouponInputCouponAppliesTo.md) |  |  [optional] |



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



