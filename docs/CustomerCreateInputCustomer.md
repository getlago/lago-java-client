

# CustomerCreateInputCustomer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** | The customer external unique identifier (provided by your own application) |  |
|**addressLine1** | **String** | The first line of the billing address |  [optional] |
|**addressLine2** | **String** | The second line of the billing address |  [optional] |
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
|**taxCodes** | **List&lt;String&gt;** | List of unique code used to identify the taxes. |  [optional] |
|**taxIdentificationNumber** | **String** | The tax identification number of the customer |  [optional] |
|**timezone** | [**Timezone**](Timezone.md) |  |  [optional] |
|**url** | **String** | The custom website URL of the customer |  [optional] |
|**zipcode** | **String** | The zipcode of the customer&#39;s billing address |  [optional] |
|**netPaymentTerm** | **Integer** | The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized. |  [optional] |
|**billingConfiguration** | [**CustomerBillingConfiguration**](CustomerBillingConfiguration.md) |  |  [optional] |
|**metadata** | [**List&lt;CustomerCreateInputCustomerMetadataInner&gt;**](CustomerCreateInputCustomerMetadataInner.md) | Set of key-value pairs that you can attach to a customer. This can be useful for storing additional information about the customer in a structured format |  [optional] |



