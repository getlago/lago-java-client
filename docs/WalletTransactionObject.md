

# WalletTransactionObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**lagoWalletId** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status |  |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Transaction type |  |
|**amount** | **BigDecimal** |  |  |
|**creditAmount** | **BigDecimal** |  |  |
|**settledAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



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



