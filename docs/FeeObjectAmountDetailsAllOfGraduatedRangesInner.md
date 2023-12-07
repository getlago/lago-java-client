

# FeeObjectAmountDetailsAllOfGraduatedRangesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**units** | **String** | Total units received in Lago. |  |
|**fromValue** | **Integer** | Lower value of a tier. It is either 0 or the previous range&#39;s &#x60;to_value + 1&#x60;. |  |
|**toValue** | **Integer** | Highest value of a tier. - This value is higher than the from_value of the same tier. - This value is null for the last tier. |  |
|**flatUnitAmount** | **String** | Flat unit amount within a specified tier. |  |
|**perUnitAmount** | **String** | Amount per unit within a specified tier. |  |
|**perUnitTotalAmount** | **String** | Total amount of received units to be charged within a specified tier. |  |
|**totalWithFlatAmount** | **String** | Total amount to be charged for a specific tier, taking into account the flat_unit_amount and the per_unit_total_amount. |  |



