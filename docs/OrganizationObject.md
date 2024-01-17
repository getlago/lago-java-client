

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
|**defaultCurrency** | [**Currency**](Currency.md) |  |  [optional] |
|**addressLine1** | **String** | The first line of your organization’s billing address. |  [optional] |
|**addressLine2** | **String** | The second line of your organization’s billing address. |  [optional] |
|**state** | **String** | The state of your organization’s billing address. |  [optional] |
|**zipcode** | **String** | The zipcode of your organization’s billing address. |  [optional] |
|**email** | **String** | The email address of your organization used to bill your customers. |  [optional] |
|**city** | **String** | The city of your organization’s billing address. |  [optional] |
|**legalName** | **String** | The legal name of your organization. |  [optional] |
|**legalNumber** | **String** | The legal number of your organization. |  [optional] |
|**documentNumbering** | [**DocumentNumberingEnum**](#DocumentNumberingEnum) | This parameter configures the method of incrementing invoice numbers for your customers.  - &#x60;per_customer&#x60;: Invoice numbers are incremented individually for each customer. This means every customer will have their own unique sequence of invoice numbers, separate from other customers. It ensures that each customer&#39;s invoice numbers follow a distinct and isolated numbering pattern. - &#x60;per_organization&#x60;: Invoice number incrementation is made across your entire organization. Rather than individual sequences for each customer, all invoices within the organization follow a single, unified numbering system. This creates a continuous and organization-wide sequence for all invoice numbers. Invoices are incremented per month (dynamic value used is YYYYMM), and invoice numbers are reset at the end of each month.  The default value for &#x60;document_numbering&#x60; is set to &#x60;per_customer&#x60;, meaning that, unless changed, invoice numbers will increment uniquely for each customer. |  |
|**documentNumberPrefix** | **String** | Sets the prefix for invoices and credit notes. Default is the first three letters of your organization name plus the last four digits of your organization ID. Customizable within 1-10 characters, and automatically capitalized by Lago. |  |
|**netPaymentTerm** | **Integer** | The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized. |  [optional] |
|**taxIdentificationNumber** | **String** | The tax identification number of your organization. |  [optional] |
|**timezone** | [**Timezone**](Timezone.md) |  |  [optional] |
|**billingConfiguration** | [**OrganizationBillingConfiguration**](OrganizationBillingConfiguration.md) |  |  |
|**taxes** | [**List&lt;TaxObject&gt;**](TaxObject.md) | List of default organization taxes |  [optional] |



## Enum: DocumentNumberingEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;per_customer&quot; |
| ORGANIZATION | &quot;per_organization&quot; |



