

# OutstandingInvoiceObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**month** | **String** | Identifies the month to analyze revenue. |  |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | The payment status of the invoices. |  [optional] |
|**invoicesCount** | **Integer** | Contains invoices count. |  |
|**amountCents** | **Integer** | The total amount of revenue for a period, expressed in cents. |  |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |



