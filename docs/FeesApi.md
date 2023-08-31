# FeesApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findAllFees**](FeesApi.md#findAllFees) | **GET** /fees | List all fees |
| [**findFee**](FeesApi.md#findFee) | **GET** /fees/{lago_id} | Retrieve a specific fee |
| [**updateFee**](FeesApi.md#updateFee) | **PUT** /fees/{lago_id} | Update a fee |


<a id="findAllFees"></a>
# **findAllFees**
> FeesPaginated findAllFees(page, perPage, externalCustomerId, externalSubscriptionId, currency, feeType, billableMetricCode, paymentStatus, createdAtFrom, createdAtTo, succeededAtFrom, succeededAtTo, failedAtFrom, failedAtTo, refundedAtFrom, refundedAtTo)

List all fees

This endpoint is used for retrieving all fees that has been issued.

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
    Integer page = 1; // Integer | Page number.
    Integer perPage = 20; // Integer | Number of records per page.
    String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | Unique identifier assigned to the customer in your application.
    String externalSubscriptionId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | External subscription ID
    Currency currency = new Currency(); // Currency | Filter results by fee’s currency.
    String feeType = "charge"; // String | The fee type. Possible values are `add-on`, `charge`, `credit` or `subscription`.
    String billableMetricCode = "bm_code"; // String | Filter results by the `code` of the billable metric attached to the fee. Only applies to `charge` types.
    String paymentStatus = "pending"; // String | Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are `pending`, `succeeded`, `failed` and refunded`.
    OffsetDateTime createdAtFrom = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Filter results created after creation date and time in UTC.
    OffsetDateTime createdAtTo = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Filter results created before creation date and time in UTC.
    OffsetDateTime succeededAtFrom = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Filter results with payment success after creation date and time in UTC.
    OffsetDateTime succeededAtTo = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Filter results with payment success after creation date and time in UTC.
    OffsetDateTime failedAtFrom = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Filter results with payment failure after creation date and time in UTC.
    OffsetDateTime failedAtTo = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Filter results with payment failure after creation date and time in UTC.
    OffsetDateTime refundedAtFrom = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Filter results with payment refund after creation date and time in UTC.
    OffsetDateTime refundedAtTo = OffsetDateTime.parse("2023-03-28T12:21:51Z"); // OffsetDateTime | Filter results with payment refund after creation date and time in UTC.
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
| **page** | **Integer**| Page number. | [optional] |
| **perPage** | **Integer**| Number of records per page. | [optional] |
| **externalCustomerId** | **String**| Unique identifier assigned to the customer in your application. | [optional] |
| **externalSubscriptionId** | **String**| External subscription ID | [optional] |
| **currency** | [**Currency**](.md)| Filter results by fee’s currency. | [optional] |
| **feeType** | **String**| The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;. | [optional] [enum: charge, add_on, subscription, credit, instant_charge] |
| **billableMetricCode** | **String**| Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types. | [optional] |
| **paymentStatus** | **String**| Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;. | [optional] [enum: pending, succeeded, failed, refunded] |
| **createdAtFrom** | **OffsetDateTime**| Filter results created after creation date and time in UTC. | [optional] |
| **createdAtTo** | **OffsetDateTime**| Filter results created before creation date and time in UTC. | [optional] |
| **succeededAtFrom** | **OffsetDateTime**| Filter results with payment success after creation date and time in UTC. | [optional] |
| **succeededAtTo** | **OffsetDateTime**| Filter results with payment success after creation date and time in UTC. | [optional] |
| **failedAtFrom** | **OffsetDateTime**| Filter results with payment failure after creation date and time in UTC. | [optional] |
| **failedAtTo** | **OffsetDateTime**| Filter results with payment failure after creation date and time in UTC. | [optional] |
| **refundedAtFrom** | **OffsetDateTime**| Filter results with payment refund after creation date and time in UTC. | [optional] |
| **refundedAtTo** | **OffsetDateTime**| Filter results with payment refund after creation date and time in UTC. | [optional] |

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
> Fee findFee(lagoId)

Retrieve a specific fee

This endpoint is used for retrieving a specific fee that has been issued.

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
    UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
    try {
      Fee result = apiInstance.findFee(lagoId);
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
| **lagoId** | **UUID**| Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system. | |

### Return type

[**Fee**](Fee.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fee |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="updateFee"></a>
# **updateFee**
> Fee updateFee(lagoId, feeUpdateInput)

Update a fee

This endpoint is used for updating a specific fee that has been issued.

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
    UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
    FeeUpdateInput feeUpdateInput = new FeeUpdateInput(); // FeeUpdateInput | Fee payload
    try {
      Fee result = apiInstance.updateFee(lagoId, feeUpdateInput);
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
| **lagoId** | **UUID**| Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system. | |
| **feeUpdateInput** | [**FeeUpdateInput**](FeeUpdateInput.md)| Fee payload | [optional] |

### Return type

[**Fee**](Fee.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fee updated |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

