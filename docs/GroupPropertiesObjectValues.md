

# GroupPropertiesObjectValues


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**graduatedRanges** | [**List&lt;ChargePropertiesGraduatedRangesInner&gt;**](ChargePropertiesGraduatedRangesInner.md) | Graduated ranges, sorted from bottom to top tiers, used for a &#x60;graduated&#x60; charge model. |  [optional] |
|**graduatedPercentageRanges** | [**List&lt;ChargePropertiesGraduatedPercentageRangesInner&gt;**](ChargePropertiesGraduatedPercentageRangesInner.md) | Graduated percentage ranges, sorted from bottom to top tiers, used for a &#x60;graduated_percentage&#x60; charge model. |  [optional] |
|**amount** | **String** | - The unit price, excluding tax, for a &#x60;standard&#x60; charge model. It is expressed as a decimal value. - The amount, excluding tax, for a complete set of units in a &#x60;package&#x60; charge model. It is expressed as a decimal value. |  [optional] |
|**freeUnits** | **Integer** | The quantity of units that are provided free of charge for each billing period in a &#x60;package&#x60; charge model. This field specifies the number of units that customers can use without incurring any additional cost during each billing cycle. |  [optional] |
|**packageSize** | **Integer** | The quantity of units included in each pack or set for a &#x60;package&#x60; charge model. It indicates the number of units that are bundled together as a single package or set within the pricing structure. |  [optional] |
|**rate** | **String** | The percentage rate that is applied to the amount of each transaction for a &#x60;percentage&#x60; charge model. It is expressed as a decimal value. |  [optional] |
|**fixedAmount** | **String** | The fixed fee that is applied to each transaction for a &#x60;percentage&#x60; charge model. It is expressed as a decimal value. |  [optional] |
|**freeUnitsPerEvents** | **Integer** | The count of transactions that are not impacted by the &#x60;percentage&#x60; rate and fixed fee in a percentage charge model. This field indicates the number of transactions that are exempt from the calculation of charges based on the specified percentage rate and fixed fee. |  [optional] |
|**freeUnitsPerTotalAggregation** | **String** | The transaction amount that is not impacted by the &#x60;percentage&#x60; rate and fixed fee in a percentage charge model. This field indicates the portion of the transaction amount that is exempt from the calculation of charges based on the specified percentage rate and fixed fee. |  [optional] |
|**perTransactionMaxAmount** | **String** | Specifies the maximum allowable spending for a single transaction. Working as a transaction cap. |  [optional] |
|**perTransactionMinAmount** | **String** | Specifies the minimum allowable spending for a single transaction. Working as a transaction floor. |  [optional] |
|**volumeRanges** | [**List&lt;ChargePropertiesVolumeRangesInner&gt;**](ChargePropertiesVolumeRangesInner.md) | Volume ranges, sorted from bottom to top tiers, used for a &#x60;volume&#x60; charge model. |  [optional] |



