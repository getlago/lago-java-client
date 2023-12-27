

# OrganizationUpdateInputOrganization


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookUrl** | **String** | The URL of your newest updated webhook endpoint. This URL allows your organization to receive important messages, notifications, or data from the Lago system. By configuring your webhook endpoint to this URL, you can ensure that your organization stays informed and receives relevant information in a timely manner. |  [optional] |
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
|**documentNumbering** | [**DocumentNumberingEnum**](#DocumentNumberingEnum) | This parameter configures the method of incrementing invoice numbers for your customers.  - &#x60;per_customer&#x60;: Invoice numbers are incremented individually for each customer. This means every customer will have their own unique sequence of invoice numbers, separate from other customers. It ensures that each customer&#39;s invoice numbers follow a distinct and isolated numbering pattern. - &#x60;per_organization&#x60;: Invoice number incrementation is made across your entire organization. Rather than individual sequences for each customer, all invoices within the organization follow a single, unified numbering system. This creates a continuous and organization-wide sequence for all invoice numbers. Invoices are incremented per month (dynamic value used is YYYYMM), and invoice numbers are reset at the end of each month.  The default value for &#x60;document_numbering&#x60; is set to &#x60;per_customer&#x60;, meaning that, unless changed, invoice numbers will increment uniquely for each customer. |  [optional] |
|**documentNumberPrefix** | **String** | Sets the prefix for invoices and credit notes. Default is the first three letters of your organization name plus the last four digits of your organization ID. Customizable within 1-10 characters, and automatically capitalized by Lago. |  [optional] |
|**netPaymentTerm** | **Integer** | The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized. |  [optional] |
|**taxIdentificationNumber** | **String** | The tax identification number of your organization. |  [optional] |
|**timezone** | [**Timezone**](Timezone.md) |  |  [optional] |
|**emailSettings** | [**List&lt;EmailSettingsEnum&gt;**](#List&lt;EmailSettingsEnum&gt;) | Represents the email settings of the organization. It allows you to define which documents are sent by email. The field value determines the types of documents that trigger email notifications. Possible values for are &#x60;invoice.finalized&#x60; and &#x60;credit_note.created&#x60;. By configuring this field, you can specify whether invoices, credit notes, or both should be sent to recipients via email. |  [optional] |
|**billingConfiguration** | [**OrganizationBillingConfiguration**](OrganizationBillingConfiguration.md) |  |  [optional] |



## Enum: DocumentNumberingEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;per_customer&quot; |
| ORGANIZATION | &quot;per_organization&quot; |



## Enum: List&lt;EmailSettingsEnum&gt;

| Name | Value |
|---- | -----|
| INVOICE_FINALIZED | &quot;invoice.finalized&quot; |
| CREDIT_NOTE_CREATED | &quot;credit_note.created&quot; |



