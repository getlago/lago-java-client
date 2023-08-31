

# BillableMetricCreateInputBillableMetric


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the billable metric. |  |
|**code** | **String** | Unique code used to identify the billable metric associated with the API request. This code associates each event with the correct metric. |  |
|**description** | **String** | Internal description of the billable metric. |  [optional] |
|**recurring** | **Boolean** | Defines if the billable metric is persisted billing period over billing period.  - If set to &#x60;true&#x60;: the accumulated number of units calculated from the previous billing period is persisted to the next billing period. - If set to &#x60;false&#x60;: the accumulated number of units is reset to 0 at the end of the billing period. - If not defined in the request, default value is &#x60;false&#x60;. |  [optional] |
|**fieldName** | **String** | Property of the billable metric used for aggregating usage data. This field is not required for &#x60;count_agg&#x60;. |  [optional] |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | Aggregation method used to compute usage for this billable metric. Possible values are &#x60;count_agg&#x60;, &#x60;sum_agg&#x60;, &#x60;max_agg&#x60; or &#x60;unique_count_agg&#x60;. |  |
|**group** | [**BillableMetricGroup**](BillableMetricGroup.md) |  |  [optional] |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| COUNT_AGG | &quot;count_agg&quot; |
| SUM_AGG | &quot;sum_agg&quot; |
| MAX_AGG | &quot;max_agg&quot; |
| UNIQUE_COUNT_AGG | &quot;unique_count_agg&quot; |



