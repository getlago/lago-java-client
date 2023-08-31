

# AppliedAddOnObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier of the applied add-on created by Lago. |  |
|**lagoAddOnId** | **UUID** | Unique identifier of the add-on created by Lago. |  |
|**addOnCode** | **String** | Unique code used to identify the add-on. |  |
|**lagoCustomerId** | **UUID** | Unique identifier of the customer created by Lago. |  |
|**externalCustomerId** | **String** | The customer external unique identifier (provided by your own application) |  |
|**amountCents** | **Integer** | The cost of the add-on in cents, excluding any applicable taxes, that is billed to a customer. By creating a one-off invoice, you will be able to override this value. |  |
|**amountCurrency** | [**Currency**](Currency.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |



