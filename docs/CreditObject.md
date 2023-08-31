

# CreditObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the credit within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the credit’s item record within the Lago system. |  |
|**amountCents** | **Integer** | The amount of credit associated with the invoice, expressed in cents. |  |
|**amountCurrency** | [**Currency**](Currency.md) |  |  |
|**beforeTaxes** | **Boolean** | Indicates whether the credit is applied on the amount before taxes (coupons) or after taxes (credit notes). This flag helps determine the order in which credits are applied to the invoice calculation |  |
|**item** | [**CreditObjectItem**](CreditObjectItem.md) |  |  |
|**invoice** | [**CreditObjectInvoice**](CreditObjectInvoice.md) |  |  |



