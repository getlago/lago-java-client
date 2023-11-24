# WebhookEndpointsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhookEndpoint**](WebhookEndpointsApi.md#createWebhookEndpoint) | **POST** /webhook_endpoints | Create a webhook_endpoint |
| [**destroyWebhookEndpoint**](WebhookEndpointsApi.md#destroyWebhookEndpoint) | **DELETE** /webhook_endpoints/{lago_id} | Delete a webhook endpoint |
| [**findAllWebhookEndpoints**](WebhookEndpointsApi.md#findAllWebhookEndpoints) | **GET** /webhook_endpoints | List all webhook endpoints |
| [**findWebhookEndpoint**](WebhookEndpointsApi.md#findWebhookEndpoint) | **GET** /webhook_endpoints/{lago_id} | Retrieve a webhook endpoint |
| [**updateWebhookEndpoint**](WebhookEndpointsApi.md#updateWebhookEndpoint) | **PUT** /webhook_endpoints/{lago_id} | Update a webhook endpoint |



## createWebhookEndpoint

> WebhookEndpoint createWebhookEndpoint(webhookEndpointCreateInput)

Create a webhook_endpoint

This endpoint is used to create a webhook endpoint.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.WebhookEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
        WebhookEndpointCreateInput webhookEndpointCreateInput = new WebhookEndpointCreateInput(); // WebhookEndpointCreateInput | Webhook Endpoint payload
        try {
            WebhookEndpoint result = apiInstance.createWebhookEndpoint(webhookEndpointCreateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookEndpointsApi#createWebhookEndpoint");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookEndpointCreateInput** | [**WebhookEndpointCreateInput**](WebhookEndpointCreateInput.md)| Webhook Endpoint payload | |

### Return type

[**WebhookEndpoint**](WebhookEndpoint.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook Endpoint created |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |


## destroyWebhookEndpoint

> WebhookEndpoint destroyWebhookEndpoint(lagoId)

Delete a webhook endpoint

This endpoint is used to delete an existing webhook endpoint.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.WebhookEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
        UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint's record within the Lago system.
        try {
            WebhookEndpoint result = apiInstance.destroyWebhookEndpoint(lagoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookEndpointsApi#destroyWebhookEndpoint");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lagoId** | **UUID**| Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. | |

### Return type

[**WebhookEndpoint**](WebhookEndpoint.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook Endpoint deleted |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **405** | Not Allowed error |  -  |


## findAllWebhookEndpoints

> WebhookEndpointsPaginated findAllWebhookEndpoints(page, perPage)

List all webhook endpoints

This endpoint is used to list all webhook endpoints.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.WebhookEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer perPage = 20; // Integer | Number of records per page.
        try {
            WebhookEndpointsPaginated result = apiInstance.findAllWebhookEndpoints(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookEndpointsApi#findAllWebhookEndpoints");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Page number. | [optional] |
| **perPage** | **Integer**| Number of records per page. | [optional] |

### Return type

[**WebhookEndpointsPaginated**](WebhookEndpointsPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WebhookEndpoints |  -  |
| **401** | Unauthorized error |  -  |


## findWebhookEndpoint

> WebhookEndpoint findWebhookEndpoint(lagoId)

Retrieve a webhook endpoint

This endpoint is used to retrieve an existing webhook endpoint.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.WebhookEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
        UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint's record within the Lago system.
        try {
            WebhookEndpoint result = apiInstance.findWebhookEndpoint(lagoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookEndpointsApi#findWebhookEndpoint");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lagoId** | **UUID**| Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. | |

### Return type

[**WebhookEndpoint**](WebhookEndpoint.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WebhookEndpoint |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## updateWebhookEndpoint

> WebhookEndpoint updateWebhookEndpoint(lagoId, webhookEndpointUpdateInput)

Update a webhook endpoint

This endpoint is used to update an existing webhook endpoint.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.WebhookEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
        UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint's record within the Lago system.
        WebhookEndpointUpdateInput webhookEndpointUpdateInput = new WebhookEndpointUpdateInput(); // WebhookEndpointUpdateInput | Webhook Endpoint update payload
        try {
            WebhookEndpoint result = apiInstance.updateWebhookEndpoint(lagoId, webhookEndpointUpdateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookEndpointsApi#updateWebhookEndpoint");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lagoId** | **UUID**| Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. | |
| **webhookEndpointUpdateInput** | [**WebhookEndpointUpdateInput**](WebhookEndpointUpdateInput.md)| Webhook Endpoint update payload | |

### Return type

[**WebhookEndpoint**](WebhookEndpoint.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook Endpoint updated |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

