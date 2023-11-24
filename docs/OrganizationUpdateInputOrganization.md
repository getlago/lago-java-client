

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
|**netPaymentTerm** | **Integer** | The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized. |  [optional] |
|**taxIdentificationNumber** | **String** | The tax identification number of your organization. |  [optional] |
|**timezone** | [**Timezone**](Timezone.md) |  |  [optional] |
|**emailSettings** | [**List&lt;EmailSettingsEnum&gt;**](#List&lt;EmailSettingsEnum&gt;) | Represents the email settings of the organization. It allows you to define which documents are sent by email. The field value determines the types of documents that trigger email notifications. Possible values for are &#x60;invoice.finalized&#x60; and &#x60;credit_note.created&#x60;. By configuring this field, you can specify whether invoices, credit notes, or both should be sent to recipients via email. |  [optional] |
|**billingConfiguration** | [**OrganizationBillingConfiguration**](OrganizationBillingConfiguration.md) |  |  [optional] |



## Enum: List&lt;EmailSettingsEnum&gt;

| Name | Value |
|---- | -----|
| INVOICE_FINALIZED | &quot;invoice.finalized&quot; |
| CREDIT_NOTE_CREATED | &quot;credit_note.created&quot; |



