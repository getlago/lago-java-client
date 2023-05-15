

# BillableMetricInputBillableMetric


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**fieldName** | **String** |  |  [optional] |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | Aggregation type |  [optional] |
|**group** | [**BillableMetricGroup**](BillableMetricGroup.md) |  |  [optional] |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| COUNT_AGG | &quot;count_agg&quot; |
| SUM_AGG | &quot;sum_agg&quot; |
| MAX_AGG | &quot;max_agg&quot; |
| UNIQUE_COUNT_AGG | &quot;unique_count_agg&quot; |
| RECURRING_COUNT_AGG | &quot;recurring_count_agg&quot; |



