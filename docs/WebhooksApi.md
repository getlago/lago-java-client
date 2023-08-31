# WebhooksApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchPublicKey**](WebhooksApi.md#fetchPublicKey) | **GET** /webhooks/public_key | Retrieve webhook public key |



## fetchPublicKey

> String fetchPublicKey()

Retrieve webhook public key

This endpoint is used to retrieve the public key used to verify the webhooks signature

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            String result = apiInstance.fetchPublicKey();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#fetchPublicKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public key |  -  |
| **401** | Unauthorized error |  -  |

