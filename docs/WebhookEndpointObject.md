

# WebhookEndpointObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lagoId** | **UUID** | Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. |  |
|**lagoOrganizationId** | **UUID** | Unique identifier assigned to the organization attached to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the organization’s record within the Lago system. |  |
|**webhookUrl** | **String** | The name of the wallet. |  |
|**signatureAlgo** | [**SignatureAlgoEnum**](#SignatureAlgoEnum) | The signature algo for the webhook. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date of the webhook endpoint creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). |  |



## Enum: SignatureAlgoEnum

| Name | Value |
|---- | -----|
| JWT | &quot;jwt&quot; |
| HMAC | &quot;hmac&quot; |



