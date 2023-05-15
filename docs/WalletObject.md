

# WalletObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**lagoCustomerId** | **UUID** |  |  |
|**externalCustomerId** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status |  |
|**currency** | **String** |  |  |
|**name** | **String** |  |  [optional] |
|**rateAmount** | **BigDecimal** |  |  |
|**creditsBalance** | **BigDecimal** |  |  |
|**balance** | **BigDecimal** |  |  |
|**balanceCents** | **Integer** |  |  |
|**consumedCredits** | **BigDecimal** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**expirationAt** | **OffsetDateTime** |  |  [optional] |
|**lastBalanceSyncAt** | **OffsetDateTime** |  |  [optional] |
|**lastConsumedCreditAt** | **OffsetDateTime** |  |  [optional] |
|**terminatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TERMINATED | &quot;terminated&quot; |



