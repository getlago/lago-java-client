

# InvoiceUpdateInputInvoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | The payment status of the invoice. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;. |  [optional] |
|**metadata** | [**List&lt;InvoiceUpdateInputInvoiceMetadataInner&gt;**](InvoiceUpdateInputInvoiceMetadataInner.md) |  |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |



