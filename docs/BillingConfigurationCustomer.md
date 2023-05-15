

# BillingConfigurationCustomer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceGracePeriod** | **Integer** |  |  [optional] |
|**paymentProvider** | [**PaymentProviderEnum**](#PaymentProviderEnum) | Payment provider type |  [optional] |
|**providerCustomerId** | **String** |  |  [optional] |
|**syncWithProvider** | **Boolean** |  |  [optional] |
|**documentLocale** | **String** |  |  [optional] |
|**vatRate** | **BigDecimal** |  |  [optional] |



## Enum: PaymentProviderEnum

| Name | Value |
|---- | -----|
| STRIPE | &quot;stripe&quot; |
| GOCARDLESS | &quot;gocardless&quot; |



