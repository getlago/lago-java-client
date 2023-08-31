

# TaxObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier of the tax, created by Lago. |  |
|**name** | **String** | Name of the tax. |  |
|**code** | **String** | Unique code used to identify the tax associated with the API request. |  |
|**description** | **String** | Internal description of the taxe |  [optional] |
|**rate** | **BigDecimal** | The percentage rate of the tax |  |
|**appliedToOrganization** | **Boolean** | Set to &#x60;true&#x60; if the tax is used as one of the organization&#39;s default |  |
|**addOnsCount** | **Integer** | Number of add-ons this tax is applied to. |  [optional] |
|**chargesCount** | **Integer** | Number of charges this tax is applied to. |  [optional] |
|**customersCount** | **Integer** | Number of customers this tax is applied to (directly or via the organization&#39;s default). |  |
|**plansCount** | **Integer** | Number of plans this tax is applied to. |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation date of the tax. |  |



