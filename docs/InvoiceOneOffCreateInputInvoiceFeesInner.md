

# InvoiceOneOffCreateInputInvoiceFeesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addOnCode** | **String** | The code of the add-on used as invoice item. |  |
|**invoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name. |  [optional] |
|**unitAmountCents** | **Integer** | The amount of the fee per unit, expressed in cents. By default, the amount of the add-on is used. |  [optional] |
|**units** | **String** | The quantity of units associated with the fee. By default, only 1 unit is added to the invoice. |  [optional] |
|**description** | **String** | This is a description |  [optional] |
|**taxCodes** | **List&lt;String&gt;** | List of unique code used to identify the taxes. |  [optional] |



