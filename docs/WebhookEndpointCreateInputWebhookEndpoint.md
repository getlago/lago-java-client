

# WebhookEndpointCreateInputWebhookEndpoint


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookUrl** | **String** | The URL of the webhook endpoint. |  |
|**signatureAlgo** | [**SignatureAlgoEnum**](#SignatureAlgoEnum) | The signature used for the webhook. If no value is passed, |  [optional] |



## Enum: SignatureAlgoEnum

| Name | Value |
|---- | -----|
| JWT | &quot;jwt&quot; |
| HMAC | &quot;hmac&quot; |



