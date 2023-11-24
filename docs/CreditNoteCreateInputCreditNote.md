

# CreditNoteCreateInputCreditNote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceId** | **UUID** | The invoice unique identifier, created by Lago. |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the credit note creation. Possible values are &#x60;duplicated_charge&#x60;, &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60; or &#x60;other&#x60;. |  [optional] |
|**description** | **String** | The description of the credit note. |  [optional] |
|**creditAmountCents** | **Integer** | The total amount to be credited on the customer balance. |  [optional] |
|**refundAmountCents** | **Integer** | The total amount to be refunded to the customer. |  [optional] |
|**items** | [**List&lt;CreditNoteEstimateInputCreditNoteItemsInner&gt;**](CreditNoteEstimateInputCreditNoteItemsInner.md) | The list of credit note’s items. |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| DUPLICATED_CHARGE | &quot;duplicated_charge&quot; |
| PRODUCT_UNSATISFACTORY | &quot;product_unsatisfactory&quot; |
| ORDER_CHANGE | &quot;order_change&quot; |
| ORDER_CANCELLATION | &quot;order_cancellation&quot; |
| FRAUDULENT_CHARGE | &quot;fraudulent_charge&quot; |
| OTHER | &quot;other&quot; |



