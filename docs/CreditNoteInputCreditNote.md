

# CreditNoteInputCreditNote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceId** | **UUID** |  |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Reason |  |
|**description** | **String** |  |  [optional] |
|**creditAmountCents** | **Integer** |  |  |
|**refundAmountCents** | **Integer** |  |  |
|**items** | [**List&lt;CreditNoteInputCreditNoteItemsInner&gt;**](CreditNoteInputCreditNoteItemsInner.md) |  |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| DUPLICATED_CHARGE | &quot;duplicated_charge&quot; |
| PRODUCT_UNSATISFACTORY | &quot;product_unsatisfactory&quot; |
| ORDER_CHANGE | &quot;order_change&quot; |
| ORDER_CANCELLATION | &quot;order_cancellation&quot; |
| FRAUDULENT_CHARGE | &quot;fraudulent_charge&quot; |
| OTHER | &quot;other&quot; |



