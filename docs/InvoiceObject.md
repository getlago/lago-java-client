

# InvoiceObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**sequentialId** | **Integer** |  |  |
|**number** | **String** |  |  |
|**issuingDate** | **OffsetDateTime** |  |  |
|**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  |
|**currency** | **String** |  |  |
|**feesAmountCents** | **Integer** |  |  |
|**couponsAmountCents** | **Integer** |  |  |
|**creditNotesAmountCents** | **Integer** |  |  |
|**subTotalVatExcludedAmountCents** | **Integer** |  |  |
|**vatAmountCents** | **Integer** |  |  |
|**subTotalVatIncludedAmountCents** | **Integer** |  |  |
|**prepaidCreditAmountCents** | **Integer** |  |  |
|**totalAmountCents** | **Integer** |  |  |
|**versionNumber** | **Integer** |  |  |
|**amountCents** | **Integer** |  |  |
|**amountCurrency** | **String** |  |  |
|**vatAmountCurrency** | **String** |  |  |
|**creditAmountCents** | **Integer** |  |  |
|**creditAmountCurrency** | **String** |  |  |
|**totalAmountCurrency** | **String** |  |  |
|**legacy** | **Boolean** |  |  |
|**fileUrl** | **String** |  |  [optional] |
|**customer** | [**CustomerObject**](CustomerObject.md) |  |  |
|**metadata** | [**List&lt;InvoiceMetadataObject&gt;**](InvoiceMetadataObject.md) |  |  [optional] |



## Enum: InvoiceTypeEnum

| Name | Value |
|---- | -----|
| SUBSCRIPTION | &quot;subscription&quot; |
| ADD_ON | &quot;add_on&quot; |
| CREDIT | &quot;credit&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| FINALIZED | &quot;finalized&quot; |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |



