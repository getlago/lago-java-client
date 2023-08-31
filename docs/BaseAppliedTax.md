

# BaseAppliedTax


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier of the applied tax, created by Lago. |  [optional] |
|**lagoTaxId** | **UUID** | Unique identifier of the tax, created by Lago. |  [optional] |
|**taxName** | **String** | Name of the tax. |  [optional] |
|**taxCode** | **String** | Unique code used to identify the tax associated with the API request. |  [optional] |
|**taxRate** | **BigDecimal** | The percentage rate of the tax |  [optional] |
|**taxDescription** | **String** | Internal description of the taxe |  [optional] |
|**amountCents** | **Integer** | Amount of the tax |  [optional] |
|**amountCurrency** | [**Currency**](Currency.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the applied tax was created. It is expressed in UTC format according to the ISO 8601 datetime standard. This field provides the timestamp for the exact moment when the applied tax was initially created. |  [optional] |



