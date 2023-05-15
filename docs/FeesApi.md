# FeesApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findAllFees**](FeesApi.md#findAllFees) | **GET** /fees | Find all fees |
| [**findFee**](FeesApi.md#findFee) | **GET** /fees/{id} | Find fee by ID |
| [**updateFee**](FeesApi.md#updateFee) | **PUT** /fees/{id} | Update an existing fee |


<a id="findAllFees"></a>
# **findAllFees**
> FeesPaginated findAllFees(page, perPage, externalCustomerId, externalSubscriptionId, currency, feeType, billableMetricCode, paymentStatus, createdAtFrom, createdAtTo, succeededAtFrom, succeededAtTo, failedAtFrom, failedAtTo, refundedAtFrom, refundedAtTo)

Find all fees

Find all fees of an organization and filter them

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FeesApi apiInstance = new FeesApi(defaultClient);
    Integer page = 2; // Integer | Number of page
    Integer perPage = 20; // Integer | Number of records per page
    String externalCustomerId = "12345"; // String | External customer ID
    String externalSubscriptionId = "12345"; // String | External subscription ID
    String currency = "EUR"; // String | Amount currency
    String feeType = "charge"; // String | Fee type
    String billableMetricCode = "bm_code"; // String | Code of the source billable metric
    String paymentStatus = "pending"; // String | Payment status
    OffsetDateTime createdAtFrom = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Creation datetime from
    OffsetDateTime createdAtTo = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Creation date to
    OffsetDateTime succeededAtFrom = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Payment succees date from
    OffsetDateTime succeededAtTo = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Payment succees date to
    OffsetDateTime failedAtFrom = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Payment failed date from
    OffsetDateTime failedAtTo = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Payment failed date to
    OffsetDateTime refundedAtFrom = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Payment refund date from
    OffsetDateTime refundedAtTo = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Payment refund date to
    try {
      FeesPaginated result = apiInstance.findAllFees(page, perPage, externalCustomerId, externalSubscriptionId, currency, feeType, billableMetricCode, paymentStatus, createdAtFrom, createdAtTo, succeededAtFrom, succeededAtTo, failedAtFrom, failedAtTo, refundedAtFrom, refundedAtTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeesApi#findAllFees");
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
| **externalSubscriptionId** | **String**| External subscription ID | [optional] |
| **currency** | **String**| Amount currency | [optional] |
| **feeType** | **String**| Fee type | [optional] [enum: charge, add_on, subscription, credit, instant_charge] |
| **billableMetricCode** | **String**| Code of the source billable metric | [optional] |
| **paymentStatus** | **String**| Payment status | [optional] [enum: pending, succeeded, failed, refunded] |
| **createdAtFrom** | **OffsetDateTime**| Creation datetime from | [optional] |
| **createdAtTo** | **OffsetDateTime**| Creation date to | [optional] |
| **succeededAtFrom** | **OffsetDateTime**| Payment succees date from | [optional] |
| **succeededAtTo** | **OffsetDateTime**| Payment succees date to | [optional] |
| **failedAtFrom** | **OffsetDateTime**| Payment failed date from | [optional] |
| **failedAtTo** | **OffsetDateTime**| Payment failed date to | [optional] |
| **refundedAtFrom** | **OffsetDateTime**| Payment refund date from | [optional] |
| **refundedAtTo** | **OffsetDateTime**| Payment refund date to | [optional] |

### Return type

[**FeesPaginated**](FeesPaginated.md)

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
| **422** | Unprocessable entity error |  -  |

<a id="findFee"></a>
# **findFee**
> FeeObject findFee(id)

Find fee by ID

Return a single fee

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FeesApi apiInstance = new FeesApi(defaultClient);
    UUID id = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | ID of the existing Lago Fee
    try {
      FeeObject result = apiInstance.findFee(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeesApi#findFee");
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
| **id** | **UUID**| ID of the existing Lago Fee | |

### Return type

[**FeeObject**](FeeObject.md)

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

<a id="updateFee"></a>
# **updateFee**
> FeeObject updateFee(id, feeUpdateInput)

Update an existing fee

Update an existing fee

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FeesApi apiInstance = new FeesApi(defaultClient);
    UUID id = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | ID of the existing Lago Fee
    FeeUpdateInput feeUpdateInput = new FeeUpdateInput(); // FeeUpdateInput | Payload to update a fee
    try {
      FeeObject result = apiInstance.updateFee(id, feeUpdateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeesApi#updateFee");
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
| **id** | **UUID**| ID of the existing Lago Fee | |
| **feeUpdateInput** | [**FeeUpdateInput**](FeeUpdateInput.md)| Payload to update a fee | [optional] |

### Return type

[**FeeObject**](FeeObject.md)

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

