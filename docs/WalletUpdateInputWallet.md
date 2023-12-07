

# WalletUpdateInputWallet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the wallet. |  [optional] |
|**expirationAt** | **OffsetDateTime** | The date and time that determines when the wallet will expire. It follows the ISO 8601 datetime format and is expressed in Coordinated Universal Time (UTC). |  [optional] |
|**recurringTransactionRules** | [**List&lt;WalletUpdateInputWalletRecurringTransactionRulesInner&gt;**](WalletUpdateInputWalletRecurringTransactionRulesInner.md) | List of recurring transaction rules. Currently, we only allow one recurring rule per wallet. |  [optional] |



