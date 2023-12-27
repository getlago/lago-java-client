

# FeeObjectAmountDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**graduatedRanges** | [**List&lt;FeeObjectAmountDetailsAllOfGraduatedRangesInner&gt;**](FeeObjectAmountDetailsAllOfGraduatedRangesInner.md) | Graduated ranges, used for a &#x60;graduated&#x60; charge model. |  [optional] |
|**graduatedPercentageRanges** | [**List&lt;FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner&gt;**](FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner.md) | Graduated percentage ranges, used for a &#x60;graduated_percentage&#x60; charge model. |  [optional] |
|**freeUnits** | **String** | The quantity of units that are provided free of charge for each billing period in a &#x60;package&#x60; charge model. |  [optional] |
|**paidUnits** | **String** | The quantity of units that are not provided free of charge for each billing period in a &#x60;package&#x60; charge model. |  [optional] |
|**perPackageSize** | **Integer** | The quantity of units included, defined for Package or Percentage charge model. |  [optional] |
|**perPackageUnitAmount** | **String** | Total amount to charge for received paid_units, defined for Package or Percentage charge model. |  [optional] |
|**units** | **String** | The total units received in Lago for the Percentage charge model. |  [optional] |
|**freeEvents** | **Integer** | Total number of free events allowed for the Percentage charge model. |  [optional] |
|**rate** | **String** | Percentage rate applied for the Percentage charge model. |  [optional] |
|**perUnitTotalAmount** | **String** | Total amount of received units to be charged for the Percentage charge model. |  [optional] |
|**paidEvents** | **Integer** | Total number of paid events for the Percentage charge model. |  [optional] |
|**fixedFeeUnitAmount** | **String** | Fixed fee unit price per received paid_event for the Percentage charge model. |  [optional] |
|**fixedFeeTotalAmount** | **String** | Total amount to charge for received paid_events for the Percentage charge model. |  [optional] |
|**minMaxAdjustmentTotalAmount** | **String** | Total adjustment amount linked to minimum and maximum spending per transaction for the Percentage charge model. |  [optional] |
|**volumeRanges** | [**List&lt;FeeObjectAmountDetailsAllOfVolumeRangesInner&gt;**](FeeObjectAmountDetailsAllOfVolumeRangesInner.md) | Volume ranges, used for a &#x60;volume&#x60; charge model. |  [optional] |



