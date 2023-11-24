

# EventObjectProperties

This field represents additional properties associated with the event, which are utilized in the calculation of the final fee. This object becomes mandatory when the targeted billable metric employs a `sum_agg`, `max_agg`, or `unique_count_agg` aggregation method. However, when using a simple `count_agg`, this object is not required.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | The &#x60;operation_type&#x60; field is only necessary when adding or removing a specific unit when the targeted billable metric adopts a &#x60;unique_count_agg&#x60; aggregation method. In other cases, the &#x60;operation_type&#x60; field is not required. The valid values for the &#x60;operation_type&#x60; field are &#x60;add&#x60; or &#x60;remove&#x60;, which indicate whether the unit is being added or removed from the unique count aggregation, respectively. |  [optional] |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |



