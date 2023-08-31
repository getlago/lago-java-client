

# CustomerBillingConfiguration

Configuration specific to the payment provider, utilized for billing the customer. This object contains settings and parameters necessary for processing payments and invoicing the customer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceGracePeriod** | **Integer** | The grace period, expressed in days, for the invoice. This period refers to the additional time granted to the customer beyond the invoice due date to adjust usage and line items |  [optional] |
|**paymentProvider** | [**PaymentProviderEnum**](#PaymentProviderEnum) | The payment provider utilized to initiate payments for invoices issued by Lago. Accepted values: &#x60;stripe&#x60;, &#x60;adyen&#x60;, &#x60;gocardless&#x60; or null. This field is required if you intend to assign a &#x60;provider_customer_id&#x60;. |  [optional] |
|**providerCustomerId** | **String** | The customer ID within the payment provider&#39;s system. If this field is not provided, Lago has the option to create a new customer record within the payment provider&#39;s system on behalf of the customer |  [optional] |
|**sync** | **Boolean** | Set this field to &#x60;true&#x60; if you want to create the customer in the payment provider synchronously with the customer creation process in Lago. This option is applicable only when the &#x60;provider_customer_id&#x60; is &#x60;null&#x60; and the customer is automatically created in the payment provider through Lago. By default, the value is set to &#x60;false&#x60; |  [optional] |
|**syncWithProvider** | **Boolean** | Set this field to &#x60;true&#x60; if you want to create a customer record in the payment provider&#39;s system. This option is applicable only when the &#x60;provider_customer_id&#x60; is null and the &#x60;sync_with_provider&#x60; field is set to &#x60;true&#x60;. By default, the value is set to &#x60;false&#x60; |  [optional] |
|**documentLocale** | **String** | The document locale, specified in the ISO 639-1 format. This field represents the language or locale used for the documents issued by Lago |  [optional] |
|**providerPaymentMethods** | **List&lt;String&gt;** | Specifies the available payment methods that can be used for this customer when &#x60;payment_provider&#x60; is set to &#x60;stripe&#x60;. The &#x60;provider_payment_methods&#x60; field is an array that allows multiple payment options to be defined. If this field is not explicitly set, all the payment methods are selected. For now, possible values are &#x60;card&#x60; and &#x60;sepa_debit&#x60;. |  [optional] |



## Enum: PaymentProviderEnum

| Name | Value |
|---- | -----|
| STRIPE | &quot;stripe&quot; |
| ADYEN | &quot;adyen&quot; |
| GOCARDLESS | &quot;gocardless&quot; |



