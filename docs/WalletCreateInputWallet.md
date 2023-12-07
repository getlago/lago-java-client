

# WalletCreateInputWallet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the wallet. |  [optional] |
|**rateAmount** | **String** | The rate of conversion between credits and the amount in the specified currency. It indicates the ratio or factor used to convert credits into the corresponding monetary value in the currency of the transaction. |  |
|**currency** | [**Currency**](Currency.md) |  |  |
|**paidCredits** | **String** | The number of paid credits. Required only if there is no granted credits. |  [optional] |
|**grantedCredits** | **String** | The number of free granted credits. Required only if there is no paid credits. |  [optional] |
|**externalCustomerId** | **String** | The customer external unique identifier (provided by your own application) |  |
|**expirationAt** | **OffsetDateTime** | The date and time that determines when the wallet will expire. It follows the ISO 8601 datetime format and is expressed in Coordinated Universal Time (UTC). |  [optional] |
|**recurringTransactionRules** | [**List&lt;WalletCreateInputWalletRecurringTransactionRulesInner&gt;**](WalletCreateInputWalletRecurringTransactionRulesInner.md) | List of recurring transaction rules. Currently, we only allow one recurring rule per wallet. |  [optional] |



