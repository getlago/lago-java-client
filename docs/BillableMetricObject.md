

# BillableMetricObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**code** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**fieldName** | **String** |  |  [optional] |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | Aggregation type |  |
|**group** | [**BillableMetricGroup**](BillableMetricGroup.md) |  |  [optional] |
|**activeSubscriptionsCount** | **Integer** |  |  |
|**draftInvoicesCount** | **Integer** |  |  |
|**plansCount** | **Integer** |  |  |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| COUNT_AGG | &quot;count_agg&quot; |
| SUM_AGG | &quot;sum_agg&quot; |
| MAX_AGG | &quot;max_agg&quot; |
| UNIQUE_COUNT_AGG | &quot;unique_count_agg&quot; |
| RECURRING_COUNT_AGG | &quot;recurring_count_agg&quot; |



