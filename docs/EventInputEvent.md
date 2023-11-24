

# EventInputEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | This field represents a unique identifier for the event. It is crucial for ensuring idempotency, meaning that each event can be uniquely identified and processed without causing any unintended side effects. |  |
|**externalCustomerId** | **String** | The customer external unique identifier (provided by your own application). This field is optional if you send the &#x60;external_subscription_id&#x60;, targeting a specific subscription. |  [optional] |
|**externalSubscriptionId** | **String** | The unique identifier of the subscription within your application. It is a mandatory field when the customer possesses multiple subscriptions or when the &#x60;external_customer_id&#x60; is not provided. |  [optional] |
|**code** | **String** | The code that identifies a targeted billable metric. It is essential that this code matches the &#x60;code&#x60; property of one of your active billable metrics. If the provided code does not correspond to any active billable metric, it will be ignored during the process. |  |
|**timestamp** | [**EventInputEventTimestamp**](EventInputEventTimestamp.md) |  |  [optional] |
|**properties** | **Map&lt;String, String&gt;** | This field represents additional properties associated with the event, which are utilized in the calculation of the final fee. This object becomes mandatory when the targeted billable metric employs a &#x60;sum_agg&#x60;, &#x60;max_agg&#x60;, or &#x60;unique_count_agg&#x60; aggregation method. However, when using a simple &#x60;count_agg&#x60;, this object is not required. |  [optional] |



