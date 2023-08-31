

# CreditNoteObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | The credit note unique identifier, created by Lago. |  |
|**sequentialId** | **Integer** | The sequential identifier of the credit note, specifically scoped on the associated invoice. It provides a unique numerical identifier for the credit note within the context of the invoice. |  |
|**number** | **String** | The credit note unique number. |  |
|**lagoInvoiceId** | **UUID** | Unique identifier assigned to the invoice that the credit note belongs to |  |
|**invoiceNumber** | **String** | The invoice unique number, related to the credit note. |  |
|**issuingDate** | **LocalDate** | The date of creation of the credit note. It follows the ISO 8601 date format and provides the specific date when the credit note was created. |  |
|**creditStatus** | [**CreditStatusEnum**](#CreditStatusEnum) | The status of the credit portion of the credit note. It indicates the current state or condition of the credit amount associated with the credit note. The possible values for this field are:  - &#x60;available&#x60;: this status indicates that an amount remains available for future usage. The credit can be applied towards future transactions or invoices. - &#x60;consumed&#x60;: this status indicates that the credit amount has been fully consumed. The remaining amount is 0, indicating that the credit has been utilized in its entirety. - &#x60;voided&#x60;: this status indicates that the remaining amount of the credit cannot be used any further. The credit has been voided and is no longer available for application or redemption. |  [optional] |
|**refundStatus** | [**RefundStatusEnum**](#RefundStatusEnum) | The status of the refund portion of the credit note. It indicates the current state or condition of the refund associated with the credit note. The possible values for this field are:  - &#x60;pending&#x60;: this status indicates that the refund is pending execution. The refund request has been initiated but has not been processed or completed yet. - &#x60;succeeded&#x60;: this status indicates that the refund has been successfully executed. The refund amount has been processed and returned to the customer or the designated recipient. - &#x60;failed&#x60;: this status indicates that the refund failed to execute. The refund request encountered an error or unsuccessful processing, and the refund amount could not be returned. |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the credit note creation. Possible values are &#x60;duplicated_charge&#x60;, &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60; or &#x60;other&#x60;. |  |
|**description** | **String** | The description of the credit note. |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  |
|**totalAmountCents** | **Integer** | The total amount of the credit note, expressed in cents. |  |
|**taxesAmountCents** | **Integer** | The tax amount of the credit note, expressed in cents. |  |
|**taxesRate** | **BigDecimal** | The tax rate associated with this specific credit note. |  |
|**subTotalExcludingTaxesAmountCents** | **Integer** | The subtotal of the credit note excluding any applicable taxes, expressed in cents. |  |
|**balanceAmountCents** | **Integer** | The remaining credit note amount, expressed in cents. |  |
|**creditAmountCents** | **Integer** | The credited amount of the credit note, expressed in cents. |  |
|**refundAmountCents** | **Integer** | The refunded amount of the credit note, expressed in cents. |  |
|**couponsAdjustementAmountCents** | **Integer** | The pro-rated amount of the coupons applied to the source invoice. |  |
|**createdAt** | **OffsetDateTime** | The date when the credit note was created. It is expressed in Coordinated Universal Time (UTC). |  |
|**updatedAt** | **OffsetDateTime** | The date when the credit note was last updated. It is expressed in Coordinated Universal Time (UTC). |  |
|**fileUrl** | **String** | The PDF file of the credit note. |  [optional] |
|**items** | [**List&lt;CreditNoteItemObject&gt;**](CreditNoteItemObject.md) | Array of credit note’s items. |  [optional] |
|**appliedTaxes** | [**List&lt;CreditNoteAppliedTaxObject&gt;**](CreditNoteAppliedTaxObject.md) |  |  [optional] |



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



