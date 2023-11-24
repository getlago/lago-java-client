

# CreditNoteEstimatedEstimatedCreditNote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoInvoiceId** | **UUID** | Unique identifier assigned to the invoice that the credit note belongs to |  |
|**invoiceNumber** | **String** | The invoice unique number, related to the credit note. |  |
|**currency** | [**Currency**](Currency.md) |  |  |
|**taxesAmountCents** | **Integer** | The tax amount of the credit note, expressed in cents. |  |
|**taxesRate** | **BigDecimal** | The tax rate associated with this specific credit note. |  |
|**subTotalExcludingTaxesAmountCents** | **Integer** | The subtotal of the credit note excluding any applicable taxes, expressed in cents. |  |
|**maxCreditableAmountCents** | **Integer** | The credited amount of the credit note, expressed in cents. |  |
|**maxRefundableAmountCents** | **Integer** | The refunded amount of the credit note, expressed in cents. |  |
|**couponsAdjustmentAmountCents** | **Integer** | The pro-rated amount of the coupons applied to the source invoice. |  |
|**items** | [**List&lt;CreditNoteEstimatedEstimatedCreditNoteItemsInner&gt;**](CreditNoteEstimatedEstimatedCreditNoteItemsInner.md) | Array of credit note’s items. |  |
|**appliedTaxes** | [**List&lt;CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner&gt;**](CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.md) |  |  [optional] |



