

# WalletObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system. |  |
|**lagoCustomerId** | **UUID** | Unique identifier assigned to the customer within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the customer’s record within the Lago system. |  |
|**externalCustomerId** | **String** | The customer external unique identifier (provided by your own application) |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the wallet. Possible values are &#x60;active&#x60; or &#x60;terminated&#x60;. |  |
|**currency** | [**Currency**](Currency.md) |  |  |
|**name** | **String** | The name of the wallet. |  [optional] |
|**rateAmount** | **String** | The rate of conversion between credits and the amount in the specified currency. It indicates the ratio or factor used to convert credits into the corresponding monetary value in the currency of the transaction. |  |
|**creditsBalance** | **String** | The current wallet balance expressed in credits. |  |
|**balanceCents** | **Integer** | The current wallet balance expressed in cents. |  |
|**consumedCredits** | **String** | The number of consumed credits. |  |
|**createdAt** | **OffsetDateTime** | The date of the wallet creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). |  |
|**expirationAt** | **OffsetDateTime** | The date and time that determines when the wallet will expire. It follows the ISO 8601 datetime format and is expressed in Coordinated Universal Time (UTC). |  [optional] |
|**lastBalanceSyncAt** | **OffsetDateTime** | The date and time of the last balance top-up. It follows the ISO 8601 datetime format and is expressed in Coordinated Universal Time (UTC). |  [optional] |
|**lastConsumedCreditAt** | **OffsetDateTime** | The date and time of the last credits consumption. It follows the ISO 8601 datetime format and is expressed in Coordinated Universal Time (UTC). |  [optional] |
|**terminatedAt** | **OffsetDateTime** | The date of terminaison of the wallet. It follows the ISO 8601 datetime format and is expressed in Coordinated Universal Time (UTC). |  [optional] |
|**recurringTransactionRules** | [**List&lt;WalletObjectRecurringTransactionRulesInner&gt;**](WalletObjectRecurringTransactionRulesInner.md) | List of recurring transaction rules. Currently, we only allow one recurring rule per wallet. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TERMINATED | &quot;terminated&quot; |



