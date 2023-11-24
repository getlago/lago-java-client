

# CustomerUsageObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromDatetime** | **OffsetDateTime** | The lower bound of the billing period, expressed in the ISO 8601 datetime format in Coordinated Universal Time (UTC). |  |
|**toDatetime** | **OffsetDateTime** | The upper bound of the billing period, expressed in the ISO 8601 datetime format in Coordinated Universal Time (UTC). |  |
|**issuingDate** | **OffsetDateTime** | The date of creation of the invoice. |  |
|**lagoInvoiceId** | **UUID** | A unique identifier associated with the invoice related to this particular usage record. |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**amountCents** | **Integer** | The amount in cents, tax excluded. |  |
|**taxesAmountCents** | **Integer** | The tax amount in cents. |  |
|**totalAmountCents** | **Integer** | The total amount in cents, tax included. |  |
|**chargesUsage** | [**List&lt;CustomerChargeUsageObject&gt;**](CustomerChargeUsageObject.md) | Array of charges that comprise the current usage. It contains detailed information about individual charge items associated with the usage. |  |



