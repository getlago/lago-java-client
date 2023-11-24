

# CustomerChargeUsageObjectGroupsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the group within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the group record within the Lago system. |  [optional] |
|**key** | **String** | The group key, only returned for groups with two dimensions. |  [optional] |
|**value** | **String** | The group value. |  [optional] |
|**units** | **String** | The number of units consumed for a specific group related to a charge item. |  [optional] |
|**eventsCount** | **Integer** | The quantity of usage events that have been recorded for a particular charge during the specified time period. These events may also be referred to as the number of transactions in some contexts. |  [optional] |
|**amountCents** | **Integer** | The amount in cents, tax excluded, consumed for a specific group related to a charge item. |  [optional] |



