

# ChargePropertiesVolumeRangesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromValue** | **Integer** | Specifies the lower value of a tier for a &#x60;volume&#x60; charge model. It must be either 0 or the previous range&#39;s &#x60;to_value + 1&#x60; to maintain the proper sequence of values. |  |
|**toValue** | **Integer** | Specifies the highest value of a tier for a &#x60;volume&#x60; charge model. - This value must be higher than the &#x60;from_value&#x60; of the same tier. - This value must be &#x60;null&#x60; for the last tier. |  |
|**flatAmount** | **String** | The unit price, excluding tax, for a specific tier of a &#x60;volume&#x60; charge model. It is expressed as a decimal value. |  |
|**perUnitAmount** | **String** | The flat amount for a whole tier, excluding tax, for a &#x60;volume&#x60; charge model. It is expressed as a decimal value. |  |



