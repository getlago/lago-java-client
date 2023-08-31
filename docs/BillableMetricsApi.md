# BillableMetricsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBillableMetric**](BillableMetricsApi.md#createBillableMetric) | **POST** /billable_metrics | Create a billable metric |
| [**destroyBillableMetric**](BillableMetricsApi.md#destroyBillableMetric) | **DELETE** /billable_metrics/{code} | Delete a billable metric |
| [**findAllBillableMetricGroups**](BillableMetricsApi.md#findAllBillableMetricGroups) | **GET** /billable_metrics/{code}/groups | Find a billable metric&#39;s groups |
| [**findAllBillableMetrics**](BillableMetricsApi.md#findAllBillableMetrics) | **GET** /billable_metrics | List all billable metrics |
| [**findBillableMetric**](BillableMetricsApi.md#findBillableMetric) | **GET** /billable_metrics/{code} | Retrieve a billable metric |
| [**updateBillableMetric**](BillableMetricsApi.md#updateBillableMetric) | **PUT** /billable_metrics/{code} | Update a billable metric |


<a id="createBillableMetric"></a>
# **createBillableMetric**
> BillableMetric createBillableMetric(billableMetricCreateInput)

Create a billable metric

This endpoint creates a new billable metric representing a pricing component of your application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BillableMetricsApi apiInstance = new BillableMetricsApi(defaultClient);
    BillableMetricCreateInput billableMetricCreateInput = new BillableMetricCreateInput(); // BillableMetricCreateInput | Billable metric payload
    try {
      BillableMetric result = apiInstance.createBillableMetric(billableMetricCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableMetricsApi#createBillableMetric");
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
| **billableMetricCreateInput** | [**BillableMetricCreateInput**](BillableMetricCreateInput.md)| Billable metric payload | |

### Return type

[**BillableMetric**](BillableMetric.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Billable metric created |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |

<a id="destroyBillableMetric"></a>
# **destroyBillableMetric**
> BillableMetric destroyBillableMetric(code)

Delete a billable metric

This endpoint deletes an existing billable metric representing a pricing component of your application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BillableMetricsApi apiInstance = new BillableMetricsApi(defaultClient);
    String code = "storage"; // String | Code of the existing billable metric.
    try {
      BillableMetric result = apiInstance.destroyBillableMetric(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableMetricsApi#destroyBillableMetric");
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
| **code** | **String**| Code of the existing billable metric. | |

### Return type

[**BillableMetric**](BillableMetric.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Billable metric deleted |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="findAllBillableMetricGroups"></a>
# **findAllBillableMetricGroups**
> GroupsPaginated findAllBillableMetricGroups(code, page, perPage)

Find a billable metric&#39;s groups

This endpoint retrieves all groups for a billable metric.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BillableMetricsApi apiInstance = new BillableMetricsApi(defaultClient);
    String code = "example_code"; // String | Code of the existing billable metric.
    Integer page = 1; // Integer | Page number.
    Integer perPage = 20; // Integer | Number of records per page.
    try {
      GroupsPaginated result = apiInstance.findAllBillableMetricGroups(code, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableMetricsApi#findAllBillableMetricGroups");
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
| **code** | **String**| Code of the existing billable metric. | |
| **page** | **Integer**| Page number. | [optional] |
| **perPage** | **Integer**| Number of records per page. | [optional] |

### Return type

[**GroupsPaginated**](GroupsPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of billable metric&#39;s groups |  -  |
| **401** | Unauthorized error |  -  |

<a id="findAllBillableMetrics"></a>
# **findAllBillableMetrics**
> BillableMetricsPaginated findAllBillableMetrics(page, perPage)

List all billable metrics

This endpoint retrieves all existing billable metrics that represent pricing components of your application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BillableMetricsApi apiInstance = new BillableMetricsApi(defaultClient);
    Integer page = 1; // Integer | Page number.
    Integer perPage = 20; // Integer | Number of records per page.
    try {
      BillableMetricsPaginated result = apiInstance.findAllBillableMetrics(page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableMetricsApi#findAllBillableMetrics");
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

[**BillableMetricsPaginated**](BillableMetricsPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of billable metrics |  -  |
| **401** | Unauthorized error |  -  |

<a id="findBillableMetric"></a>
# **findBillableMetric**
> BillableMetric findBillableMetric(code)

Retrieve a billable metric

This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BillableMetricsApi apiInstance = new BillableMetricsApi(defaultClient);
    String code = "storage"; // String | Code of the existing billable metric.
    try {
      BillableMetric result = apiInstance.findBillableMetric(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableMetricsApi#findBillableMetric");
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
| **code** | **String**| Code of the existing billable metric. | |

### Return type

[**BillableMetric**](BillableMetric.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Billable metric |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="updateBillableMetric"></a>
# **updateBillableMetric**
> BillableMetric updateBillableMetric(code, billableMetricUpdateInput)

Update a billable metric

This endpoint updates an existing billable metric representing a pricing component of your application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BillableMetricsApi apiInstance = new BillableMetricsApi(defaultClient);
    String code = "storage"; // String | Code of the existing billable metric.
    BillableMetricUpdateInput billableMetricUpdateInput = new BillableMetricUpdateInput(); // BillableMetricUpdateInput | Billable metric payload
    try {
      BillableMetric result = apiInstance.updateBillableMetric(code, billableMetricUpdateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableMetricsApi#updateBillableMetric");
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
| **code** | **String**| Code of the existing billable metric. | |
| **billableMetricUpdateInput** | [**BillableMetricUpdateInput**](BillableMetricUpdateInput.md)| Billable metric payload | |

### Return type

[**BillableMetric**](BillableMetric.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Billable metric updated |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

