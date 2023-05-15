# SubscriptionsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /subscriptions | Assign a plan to a customer |
| [**destroySubscription**](SubscriptionsApi.md#destroySubscription) | **DELETE** /subscriptions/{external_id} | Terminate a subscription |
| [**findAllSubscriptions**](SubscriptionsApi.md#findAllSubscriptions) | **GET** /subscriptions | Find subscriptions |
| [**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **PUT** /subscriptions/{external_id} | Update an existing subscription |


<a id="createSubscription"></a>
# **createSubscription**
> Subscription createSubscription(subscriptionCreateInput)

Assign a plan to a customer

Assign a plan to a customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    SubscriptionCreateInput subscriptionCreateInput = new SubscriptionCreateInput(); // SubscriptionCreateInput | Subscription payload
    try {
      Subscription result = apiInstance.createSubscription(subscriptionCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#createSubscription");
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
| **subscriptionCreateInput** | [**SubscriptionCreateInput**](SubscriptionCreateInput.md)| Subscription payload | |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

<a id="destroySubscription"></a>
# **destroySubscription**
> Subscription destroySubscription(externalId)

Terminate a subscription

Terminate a subscription

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String externalId = "example_id"; // String | External ID of the existing subscription
    try {
      Subscription result = apiInstance.destroySubscription(externalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#destroySubscription");
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
| **externalId** | **String**| External ID of the existing subscription | |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **405** | Not Allowed error |  -  |

<a id="findAllSubscriptions"></a>
# **findAllSubscriptions**
> SubscriptionsPaginated findAllSubscriptions(page, perPage, externalCustomerId, planCode)

Find subscriptions

Find all suscriptions for certain customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    Integer page = 2; // Integer | Number of page
    Integer perPage = 20; // Integer | Number of records per page
    String externalCustomerId = "12345"; // String | External customer ID
    String planCode = "example_code"; // String | Code of the plan attached to the subscription
    try {
      SubscriptionsPaginated result = apiInstance.findAllSubscriptions(page, perPage, externalCustomerId, planCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#findAllSubscriptions");
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
| **page** | **Integer**| Number of page | [optional] |
| **perPage** | **Integer**| Number of records per page | [optional] |
| **externalCustomerId** | **String**| External customer ID | [optional] |
| **planCode** | **String**| Code of the plan attached to the subscription | [optional] |

### Return type

[**SubscriptionsPaginated**](SubscriptionsPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="updateSubscription"></a>
# **updateSubscription**
> Subscription updateSubscription(externalId, subscriptionUpdateInput)

Update an existing subscription

Update an existing subscription by external ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String externalId = "example_id"; // String | External ID of the existing subscription
    SubscriptionUpdateInput subscriptionUpdateInput = new SubscriptionUpdateInput(); // SubscriptionUpdateInput | Update an existing subscription
    try {
      Subscription result = apiInstance.updateSubscription(externalId, subscriptionUpdateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#updateSubscription");
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
| **externalId** | **String**| External ID of the existing subscription | |
| **subscriptionUpdateInput** | [**SubscriptionUpdateInput**](SubscriptionUpdateInput.md)| Update an existing subscription | |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

