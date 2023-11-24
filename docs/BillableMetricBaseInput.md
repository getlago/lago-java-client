

# BillableMetricBaseInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the billable metric. |  [optional] |
|**code** | **String** | Unique code used to identify the billable metric associated with the API request. This code associates each event with the correct metric. |  [optional] |
|**description** | **String** | Internal description of the billable metric. |  [optional] |
|**recurring** | **Boolean** | Defines if the billable metric is persisted billing period over billing period.  - If set to &#x60;true&#x60;: the accumulated number of units calculated from the previous billing period is persisted to the next billing period. - If set to &#x60;false&#x60;: the accumulated number of units is reset to 0 at the end of the billing period. - If not defined in the request, default value is &#x60;false&#x60;. |  [optional] |
|**fieldName** | **String** | Property of the billable metric used for aggregating usage data. This field is not required for &#x60;count_agg&#x60;. |  [optional] |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | Aggregation method used to compute usage for this billable metric. |  [optional] |
|**weightedInterval** | [**WeightedIntervalEnum**](#WeightedIntervalEnum) | Parameter exclusively utilized in conjunction with the &#x60;weighted_sum&#x60; aggregation type. It serves to adjust the aggregation result by assigning weights and proration to the result based on time intervals. When this field is not provided, the default time interval is assumed to be in &#x60;seconds&#x60;. |  [optional] |
|**group** | [**BillableMetricGroup**](BillableMetricGroup.md) |  |  [optional] |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| COUNT_AGG | &quot;count_agg&quot; |
| SUM_AGG | &quot;sum_agg&quot; |
| MAX_AGG | &quot;max_agg&quot; |
| UNIQUE_COUNT_AGG | &quot;unique_count_agg&quot; |
| WEIGHTED_SUM_AGG | &quot;weighted_sum_agg&quot; |
| LATEST_AGG | &quot;latest_agg&quot; |



## Enum: WeightedIntervalEnum

| Name | Value |
|---- | -----|
| SECONDS | &quot;seconds&quot; |



