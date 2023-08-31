

# CustomerChargeUsageObjectBillableMetric

The related billable metric object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the billable metric within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the billable metric’s record within the Lago system. |  |
|**name** | **String** | The name of the billable metric used for this charge. |  |
|**code** | **String** | The code of the billable metric used for this charge. |  |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | The aggregation type of the billable metric used for this charge. Possible values are &#x60;count_agg&#x60;, &#x60;sum_agg&#x60;, &#x60;max_agg&#x60; or &#x60;unique_count_agg&#x60;. |  |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| COUNT_AGG | &quot;count_agg&quot; |
| SUM_AGG | &quot;sum_agg&quot; |
| MAX_AGG | &quot;max_agg&quot; |
| UNIQUE_COUNT_AGG | &quot;unique_count_agg&quot; |



