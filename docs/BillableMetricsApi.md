# BillableMetricsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBillableMetric**](BillableMetricsApi.md#createBillableMetric) | **POST** /billable_metrics | Create a new billable metric |
| [**destroyBillableMetric**](BillableMetricsApi.md#destroyBillableMetric) | **DELETE** /billable_metrics/{code} | Delete a billable metric |
| [**findAllBillableMetricGroups**](BillableMetricsApi.md#findAllBillableMetricGroups) | **GET** /billable_metrics/{code}/groups | Find Billable metric groups |
| [**findAllBillableMetrics**](BillableMetricsApi.md#findAllBillableMetrics) | **GET** /billable_metrics | Find Billable metrics |
| [**findBillableMetric**](BillableMetricsApi.md#findBillableMetric) | **GET** /billable_metrics/{code} | Find billable metric by code |
| [**updateBillableMetric**](BillableMetricsApi.md#updateBillableMetric) | **PUT** /billable_metrics/{code} | Update an existing billable metric |


<a id="createBillableMetric"></a>
# **createBillableMetric**
> BillableMetric createBillableMetric(billableMetricInput)

Create a new billable metric

Create a new billable metric

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
    BillableMetricInput billableMetricInput = new BillableMetricInput(); // BillableMetricInput | Billable metric payload
    try {
      BillableMetric result = apiInstance.createBillableMetric(billableMetricInput);
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
| **billableMetricInput** | [**BillableMetricInput**](BillableMetricInput.md)| Billable metric payload | |

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
| **200** | Successful response |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |

<a id="destroyBillableMetric"></a>
# **destroyBillableMetric**
> BillableMetric destroyBillableMetric(code)

Delete a billable metric

Delete a billable metric

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
    String code = "example_code"; // String | Code of the existing billable metric
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
| **code** | **String**| Code of the existing billable metric | |

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
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="findAllBillableMetricGroups"></a>
# **findAllBillableMetricGroups**
> GroupsPaginated findAllBillableMetricGroups(code, page, perPage)

Find Billable metric groups

Find all billable metric groups in certain organisation

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
    String code = "example_code"; // String | Code of the existing billable metric
    Integer page = 2; // Integer | Number of page
    Integer perPage = 20; // Integer | Number of records per page
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
| **code** | **String**| Code of the existing billable metric | |
| **page** | **Integer**| Number of page | [optional] |
| **perPage** | **Integer**| Number of records per page | [optional] |

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
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |

<a id="findAllBillableMetrics"></a>
# **findAllBillableMetrics**
> BillableMetricsPaginated findAllBillableMetrics(page, perPage)

Find Billable metrics

Find all billable metrics in certain organisation

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
    Integer page = 2; // Integer | Number of page
    Integer perPage = 20; // Integer | Number of records per page
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
| **page** | **Integer**| Number of page | [optional] |
| **perPage** | **Integer**| Number of records per page | [optional] |

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
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |

<a id="findBillableMetric"></a>
# **findBillableMetric**
> BillableMetric findBillableMetric(code)

Find billable metric by code

Return a single billable metric

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
    String code = "example_code"; // String | Code of the existing billable metric
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
| **code** | **String**| Code of the existing billable metric | |

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
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="updateBillableMetric"></a>
# **updateBillableMetric**
> BillableMetric updateBillableMetric(code, billableMetricInput)

Update an existing billable metric

Update an existing billable metric by code

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
    String code = "example_code"; // String | Code of the existing billable metric
    BillableMetricInput billableMetricInput = new BillableMetricInput(); // BillableMetricInput | Update an existing billable metric
    try {
      BillableMetric result = apiInstance.updateBillableMetric(code, billableMetricInput);
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
| **code** | **String**| Code of the existing billable metric | |
| **billableMetricInput** | [**BillableMetricInput**](BillableMetricInput.md)| Update an existing billable metric | |

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
| **200** | Successful response |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

