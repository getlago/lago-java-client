

# AppliedCouponInputAppliedCoupon


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalCustomerId** | **String** | The customer external unique identifier (provided by your own application) |  |
|**couponCode** | **String** | Unique code used to identify the coupon. |  |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The type of frequency for the coupon. It can have three possible values: &#x60;once&#x60;, &#x60;recurring&#x60; or &#x60;forever&#x60;.  - If set to &#x60;once&#x60;, the coupon is applicable only for a single use. - If set to &#x60;recurring&#x60;, the coupon can be used multiple times for recurring billing periods. - If set to &#x60;forever&#x60;, the coupon has unlimited usage and can be applied indefinitely. |  [optional] |
|**frequencyDuration** | **Integer** | Specifies the number of billing periods to which the coupon applies. This field is required only for coupons with a &#x60;recurring&#x60; frequency type |  [optional] |
|**amountCents** | **Integer** | The amount of the coupon in cents. This field is required only for coupon with &#x60;fixed_amount&#x60; type. |  [optional] |
|**amountCurrency** | [**Currency**](Currency.md) |  |  [optional] |
|**percentageRate** | **String** | The percentage rate of the coupon. This field is required only for coupons with a &#x60;percentage&#x60; coupon type. |  [optional] |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| ONCE | &quot;once&quot; |
| RECURRING | &quot;recurring&quot; |



