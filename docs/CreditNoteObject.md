

# CreditNoteObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**sequentialId** | **Integer** |  |  |
|**number** | **String** |  |  |
|**lagoInvoiceId** | **UUID** |  |  |
|**invoiceNumber** | **String** |  |  |
|**issuingDate** | **OffsetDateTime** |  |  |
|**creditStatus** | [**CreditStatusEnum**](#CreditStatusEnum) | Credit status |  [optional] |
|**refundStatus** | [**RefundStatusEnum**](#RefundStatusEnum) | Refund status |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Reason |  |
|**description** | **String** |  |  [optional] |
|**currency** | **String** |  |  |
|**totalAmountCents** | **Integer** |  |  |
|**totalAmountCurrency** | **String** |  |  |
|**vatAmountCents** | **Integer** |  |  |
|**vatAmountCurrency** | **String** |  |  |
|**subTotalVatExcludedAmountCents** | **Integer** |  |  |
|**subTotalVatExcludedAmountCurrency** | **String** |  |  |
|**balanceAmountCents** | **Integer** |  |  |
|**balanceAmountCurrency** | **String** |  |  |
|**creditAmountCents** | **Integer** |  |  |
|**creditAmountCurrency** | **String** |  |  |
|**refundAmountCents** | **Integer** |  |  |
|**refundAmountCurrency** | **String** |  |  |
|**couponsAdjustementAmountCents** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**fileUrl** | **String** |  |  [optional] |
|**items** | [**List&lt;CreditNoteItemObject&gt;**](CreditNoteItemObject.md) |  |  [optional] |



## Enum: CreditStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| CONSUMED | &quot;consumed&quot; |
| VOIDED | &quot;voided&quot; |



## Enum: RefundStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| DUPLICATED_CHARGE | &quot;duplicated_charge&quot; |
| PRODUCT_UNSATISFACTORY | &quot;product_unsatisfactory&quot; |
| ORDER_CHANGE | &quot;order_change&quot; |
| ORDER_CANCELLATION | &quot;order_cancellation&quot; |
| FRAUDULENT_CHARGE | &quot;fraudulent_charge&quot; |
| OTHER | &quot;other&quot; |



