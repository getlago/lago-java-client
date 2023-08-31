

# OrganizationObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the organization within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the organization&#39;s record within the Lago system |  |
|**name** | **String** | The name of your organization. |  |
|**createdAt** | **OffsetDateTime** | The date of creation of your organization, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). |  |
|**webhookUrl** | **String** | The URL of your newest updated webhook endpoint. This URL allows your organization to receive important messages, notifications, or data from the Lago system. By configuring your webhook endpoint to this URL, you can ensure that your organization stays informed and receives relevant information in a timely manner. |  [optional] |
|**webhookUrls** | **List&lt;String&gt;** | The array containing your webhooks URLs. |  [optional] |
|**country** | [**Country**](Country.md) |  |  [optional] |
|**addressLine1** | **String** | The first line of your organization’s billing address. |  [optional] |
|**addressLine2** | **String** | The second line of your organization’s billing address. |  [optional] |
|**state** | **String** | The state of your organization’s billing address. |  [optional] |
|**zipcode** | **String** | The zipcode of your organization’s billing address. |  [optional] |
|**email** | **String** | The email address of your organization used to bill your customers. |  [optional] |
|**city** | **String** | The city of your organization’s billing address. |  [optional] |
|**legalName** | **String** | The legal name of your organization. |  [optional] |
|**legalNumber** | **String** | The legal number of your organization. |  [optional] |
|**netPaymentTerm** | **Integer** | The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized. |  [optional] |
|**taxIdentificationNumber** | **String** | The tax identification number of your organization. |  [optional] |
|**timezone** | [**Timezone**](Timezone.md) |  |  [optional] |
|**billingConfiguration** | [**OrganizationBillingConfiguration**](OrganizationBillingConfiguration.md) |  |  |
|**taxes** | [**List&lt;TaxObject&gt;**](TaxObject.md) | List of default organization taxes |  [optional] |



