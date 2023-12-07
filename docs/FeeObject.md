

# FeeObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system. |  [optional] |
|**lagoGroupId** | **UUID** | Unique identifier assigned to the group that the fee belongs to |  [optional] |
|**lagoInvoiceId** | **UUID** | Unique identifier assigned to the invoice that the fee belongs to |  [optional] |
|**lagoTrueUpFeeId** | **UUID** | Unique identifier assigned to the true-up fee when a minimum has been set to the charge. This identifier helps to distinguish and manage the true-up fee associated with the charge, which may be applicable when a minimum threshold or limit is set for the charge amount. |  [optional] |
|**lagoTrueUpParentFeeId** | **UUID** | Unique identifier assigned to the parent fee on which the true-up fee is assigned. This identifier establishes the relationship between the parent fee and the associated true-up fee. |  [optional] |
|**lagoSubscriptionId** | **UUID** | Unique identifier assigned to the subscription, created by Lago. This field is specifically displayed when the fee type is charge or subscription. |  [optional] |
|**lagoCustomerId** | **UUID** | Unique identifier assigned to the customer, created by Lago. This field is specifically displayed when the fee type is charge or subscription. |  [optional] |
|**externalCustomerId** | **String** | Unique identifier assigned to the customer in your application. This field is specifically displayed when the fee type is charge or subscription. |  [optional] |
|**externalSubscriptionId** | **String** | Unique identifier assigned to the subscription in your application. This field is specifically displayed when the fee type is charge or subscription. |  [optional] |
|**invoiceDisplayName** | **String** | Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name. |  [optional] |
|**amountCents** | **Integer** | The cost of this specific fee, excluding any applicable taxes. |  |
|**amountCurrency** | [**Currency**](Currency.md) |  |  |
|**taxesAmountCents** | **Integer** | The cost of the tax associated with this specific fee. |  |
|**taxesRate** | **BigDecimal** | The tax rate associated with this specific fee. |  |
|**units** | **String** | The number of units used to charge the customer. This field indicates the quantity or count of units consumed or utilized in the context of the charge. It helps in determining the basis for calculating the fee or cost associated with the usage of the service or product provided to the customer. |  |
|**preciseUnitAmount** | **String** | The unit amount of the fee per unit, with precision. |  |
|**totalAmountCents** | **Integer** | The cost of this specific fee, including any applicable taxes. |  |
|**totalAmountCurrency** | [**Currency**](Currency.md) |  |  |
|**eventsCount** | **Integer** | The number of events that have been sent and used to charge the customer. This field indicates the count or quantity of events that have been processed and considered in the charging process. |  [optional] |
|**payInAdvance** | **Boolean** | Flag that indicates whether the fee was paid in advance. It serves as a boolean value, where &#x60;true&#x60; represents that the fee was paid in advance (straightaway), and &#x60;false&#x60; indicates that the fee was not paid in arrears (at the end of the period). |  |
|**invoiceable** | **Boolean** | Flag that indicates whether the fee was included on the invoice. It serves as a boolean value, where &#x60;true&#x60; represents that the fee was included on the invoice, and &#x60;false&#x60; indicates that the fee was not included on the invoice. |  |
|**fromDate** | **OffsetDateTime** | The beginning date of the period that the fee covers. It is applicable only to &#x60;subscription&#x60; and &#x60;charge&#x60; fees. This field indicates the start date of the billing period or subscription period associated with the fee. |  [optional] |
|**toDate** | **OffsetDateTime** | The ending date of the period that the fee covers. It is applicable only to &#x60;subscription&#x60; and &#x60;charge&#x60; fees. This field indicates the end date of the billing period or subscription period associated with the fee. |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and &#x60;refunded&#x60;. |  |
|**createdAt** | **OffsetDateTime** | The date and time when the fee was created. It is provided in Coordinated Universal Time (UTC) format. |  [optional] |
|**succeededAt** | **OffsetDateTime** | The date and time when the payment for the fee was successfully processed. It is provided in Coordinated Universal Time (UTC) format. |  [optional] |
|**failedAt** | **OffsetDateTime** | The date and time when the payment for the fee failed to process. It is provided in Coordinated Universal Time (UTC) format. |  [optional] |
|**refundedAt** | **OffsetDateTime** | The date and time when the payment for the fee was refunded. It is provided in Coordinated Universal Time (UTC) format |  [optional] |
|**eventTransactionId** | **String** | Unique identifier assigned to the transaction. This field is specifically displayed when the fee type is &#x60;charge&#x60; and the payment for the fee is made in advance (&#x60;pay_in_advance&#x60; is set to &#x60;true&#x60;). |  [optional] |
|**amountDetails** | [**FeeObjectAmountDetails**](FeeObjectAmountDetails.md) |  |  [optional] |
|**item** | [**FeeObjectItem**](FeeObjectItem.md) |  |  |
|**appliedTaxes** | [**List&lt;FeeAppliedTaxObject&gt;**](FeeAppliedTaxObject.md) | List of fee applied taxes |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |
| REFUNDED | &quot;refunded&quot; |



