

# FeeObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** |  |  |
|**lagoGroupId** | **UUID** |  |  [optional] |
|**lagoInvoiceId** | **UUID** |  |  [optional] |
|**lagoTrueUpFeeId** | **UUID** |  |  [optional] |
|**lagoTrueUpParentFeeId** | **UUID** |  |  [optional] |
|**externalSubscriptionId** | **String** |  |  [optional] |
|**amountCents** | **Integer** |  |  |
|**amountCurrency** | **String** |  |  |
|**vatAmountCents** | **Integer** |  |  |
|**vatAmountCurrency** | **String** |  |  |
|**units** | **BigDecimal** |  |  |
|**totalAmountCents** | **Integer** |  |  [optional] |
|**totalAmountCurrency** | **String** |  |  [optional] |
|**eventsCount** | **Integer** |  |  [optional] |
|**fromDate** | **OffsetDateTime** |  |  [optional] |
|**toDate** | **OffsetDateTime** |  |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**succeededAt** | **OffsetDateTime** |  |  [optional] |
|**failedAt** | **OffsetDateTime** |  |  [optional] |
|**refundedAt** | **OffsetDateTime** |  |  [optional] |
|**item** | [**FeeObjectItem**](FeeObjectItem.md) |  |  |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |
| REFUNDED | &quot;refunded&quot; |



