

# WalletTransactionObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the wallet transaction within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet transaction’s record within the Lago system. |  |
|**lagoWalletId** | **UUID** | Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;. |  |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | The type of transaction. Possible values are &#x60;inbound&#x60; (increasing the balance) or &#x60;outbound&#x60; (decreasing the balance). |  |
|**amount** | **String** | The amount of credits based on the rate and the currency. |  |
|**creditAmount** | **String** | The number of credits used in the wallet transaction. |  |
|**settledAt** | **OffsetDateTime** | The date when wallet transaction is settled, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). |  [optional] |
|**createdAt** | **OffsetDateTime** | The date of the wallet transaction creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SETTLED | &quot;settled&quot; |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |



