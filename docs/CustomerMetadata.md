

# CustomerMetadata

Set of key-value pairs that you can attach to a customer. This can be useful for storing additional information about the customer in a structured format

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | A unique identifier for the customer metadata object in the Lago application. Can be used to update a key-value pair |  |
|**key** | **String** | The metadata object key |  |
|**value** | **String** | The metadata object value |  |
|**displayInInvoice** | **Boolean** | Determines whether the item or information should be displayed in the invoice. If set to true, the item or information will be included and visible in the generated invoice. If set to false, the item or information will be excluded and not displayed in the invoice. |  |
|**createdAt** | **OffsetDateTime** | The date of the metadata object creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). The creation_date provides a standardized and internationally recognized timestamp for when the metadata object was created |  |



