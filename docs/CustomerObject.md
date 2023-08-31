

# CustomerObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the customer within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the customer&#39;s record within the Lago system |  |
|**sequentialId** | **Integer** | The unique identifier assigned to the customer within the organization&#39;s scope. This identifier is used to track and reference the customer&#39;s order of creation within the organization&#39;s system. It ensures that each customer has a distinct &#x60;sequential_id&#x60;&#x60; associated with them, allowing for easy identification and sorting based on the order of creation |  |
|**slug** | **String** | A concise and unique identifier for the customer, formed by combining the Organization&#39;s &#x60;name&#x60;, &#x60;id&#x60;, and customer&#39;s &#x60;sequential_id&#x60; |  |
|**externalId** | **String** | The customer external unique identifier (provided by your own application) |  |
|**addressLine1** | **String** | The first line of the billing address |  [optional] |
|**addressLine2** | **String** | The second line of the billing address |  [optional] |
|**applicableTimezone** | [**Timezone**](Timezone.md) |  |  |
|**city** | **String** | The city of the customer&#39;s billing address |  [optional] |
|**country** | [**Country**](Country.md) |  |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**email** | **String** | The email of the customer |  [optional] |
|**legalName** | **String** | The legal company name of the customer |  [optional] |
|**legalNumber** | **String** | The legal company number of the customer |  [optional] |
|**logoUrl** | **String** | The logo URL of the customer |  [optional] |
|**name** | **String** | The full name of the customer |  [optional] |
|**phone** | **String** | The phone number of the customer |  [optional] |
|**state** | **String** | The state of the customer&#39;s billing address |  [optional] |
|**taxIdentificationNumber** | **String** | The tax identification number of the customer |  [optional] |
|**timezone** | [**Timezone**](Timezone.md) |  |  [optional] |
|**url** | **String** | The custom website URL of the customer |  [optional] |
|**zipcode** | **String** | The zipcode of the customer&#39;s billing address |  [optional] |
|**netPaymentTerm** | **Integer** | The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date of the customer creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). The creation_date provides a standardized and internationally recognized timestamp for when the customer object was created |  |
|**updatedAt** | **OffsetDateTime** | The date of the customer update, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). The update_date provides a standardized and internationally recognized timestamp for when the customer object was updated |  [optional] |
|**billingConfiguration** | [**CustomerBillingConfiguration**](CustomerBillingConfiguration.md) |  |  [optional] |
|**metadata** | [**List&lt;CustomerMetadata&gt;**](CustomerMetadata.md) |  |  [optional] |



