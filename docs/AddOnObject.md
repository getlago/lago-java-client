

# AddOnObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier of the add-on, created by Lago. |  |
|**name** | **String** | The name of the add-on. |  |
|**invoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name. |  [optional] |
|**code** | **String** | Unique code used to identify the add-on. |  |
|**amountCents** | **Integer** | The cost of the add-on in cents, excluding any applicable taxes, that is billed to a customer. By creating a one-off invoice, you will be able to override this value. |  |
|**amountCurrency** | [**Currency**](Currency.md) |  |  |
|**description** | **String** | The description of the add-on. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the add-on was created. It is expressed in UTC format according to the ISO 8601 datetime standard. This field provides the timestamp for the exact moment when the add-on was initially created. |  |
|**taxes** | [**List&lt;TaxObject&gt;**](TaxObject.md) | All taxes applied to the add-on. |  [optional] |



