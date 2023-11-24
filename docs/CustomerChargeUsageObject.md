

# CustomerChargeUsageObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**units** | **String** | The number of units consumed by the customer for a specific charge item. |  |
|**eventsCount** | **Integer** | The quantity of usage events that have been recorded for a particular charge during the specified time period. These events may also be referred to as the number of transactions in some contexts. |  |
|**amountCents** | **Integer** | The amount in cents, tax excluded, consumed by the customer for a specific charge item. |  |
|**amountCurrency** | [**Currency**](Currency.md) |  |  |
|**charge** | [**CustomerChargeUsageObjectCharge**](CustomerChargeUsageObjectCharge.md) |  |  |
|**billableMetric** | [**CustomerChargeUsageObjectBillableMetric**](CustomerChargeUsageObjectBillableMetric.md) |  |  |
|**groups** | [**List&lt;CustomerChargeUsageObjectGroupsInner&gt;**](CustomerChargeUsageObjectGroupsInner.md) | Array of group object, representing multiple dimensions for a charge item. |  |



