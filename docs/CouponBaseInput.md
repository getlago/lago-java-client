

# CouponBaseInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the coupon. |  [optional] |
|**code** | **String** | Unique code used to identify the coupon. |  [optional] |
|**description** | **String** | Description of the coupon. |  [optional] |
|**couponType** | [**CouponTypeEnum**](#CouponTypeEnum) | The type of the coupon. It can have two possible values: &#x60;fixed_amount&#x60; or &#x60;percentage&#x60;.  - If set to &#x60;fixed_amount&#x60;, the coupon represents a fixed amount discount. - If set to &#x60;percentage&#x60;, the coupon represents a percentage-based discount. |  [optional] |
|**amountCents** | **Integer** | The amount of the coupon in cents. This field is required only for coupon with &#x60;fixed_amount&#x60; type. |  [optional] |
|**amountCurrency** | [**Currency**](Currency.md) |  |  [optional] |
|**reusable** | **Boolean** | Indicates whether the coupon can be reused or not. If set to &#x60;true&#x60;, the coupon is reusable, meaning it can be applied multiple times to the same customer. If set to &#x60;false&#x60;, the coupon can only be used once and is not reusable. If not specified, this field is set to &#x60;true&#x60; by default. |  [optional] |
|**percentageRate** | **String** | The percentage rate of the coupon. This field is required only for coupons with a &#x60;percentage&#x60; coupon type. |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The type of frequency for the coupon. It can have three possible values: &#x60;once&#x60;, &#x60;recurring&#x60; or &#x60;forever&#x60;.  - If set to &#x60;once&#x60;, the coupon is applicable only for a single use. - If set to &#x60;recurring&#x60;, the coupon can be used multiple times for recurring billing periods. - If set to &#x60;forever&#x60;, the coupon has unlimited usage and can be applied indefinitely. |  [optional] |
|**frequencyDuration** | **Integer** | Specifies the number of billing periods to which the coupon applies. This field is required only for coupons with a &#x60;recurring&#x60; frequency type |  [optional] |
|**expiration** | [**ExpirationEnum**](#ExpirationEnum) | Specifies the type of expiration for the coupon. It can have two possible values: &#x60;time_limit&#x60; or &#x60;no_expiration&#x60;.  - If set to &#x60;time_limit&#x60;, the coupon has an expiration based on a specified time limit. - If set to &#x60;no_expiration&#x60;, the coupon does not have an expiration date and remains valid indefinitely. |  [optional] |
|**expirationAt** | **OffsetDateTime** | The expiration date and time of the coupon. This field is required only for coupons with &#x60;expiration&#x60; set to &#x60;time_limit&#x60;. The expiration date and time should be specified in UTC format according to the ISO 8601 datetime standard. It indicates the exact moment when the coupon will expire and is no longer valid. |  [optional] |
|**appliesTo** | [**CouponBaseInputAppliesTo**](CouponBaseInputAppliesTo.md) |  |  [optional] |



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



