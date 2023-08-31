# InvoicesApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInvoice**](InvoicesApi.md#createInvoice) | **POST** /invoices | Create a one-off invoice |
| [**downloadInvoice**](InvoicesApi.md#downloadInvoice) | **POST** /invoices/{lago_id}/download | Download an invoice PDF |
| [**finalizeInvoice**](InvoicesApi.md#finalizeInvoice) | **PUT** /invoices/{lago_id}/finalize | Finalize a draft invoice |
| [**findAllInvoices**](InvoicesApi.md#findAllInvoices) | **GET** /invoices | List all invoices |
| [**findInvoice**](InvoicesApi.md#findInvoice) | **GET** /invoices/{lago_id} | Retrieve an invoice |
| [**refreshInvoice**](InvoicesApi.md#refreshInvoice) | **PUT** /invoices/{lago_id}/refresh | Refresh a draft invoice |
| [**retryPayment**](InvoicesApi.md#retryPayment) | **POST** /invoices/{lago_id}/retry_payment | Retry an invoice payment |
| [**updateInvoice**](InvoicesApi.md#updateInvoice) | **PUT** /invoices/{lago_id} | Update an invoice |


<a id="createInvoice"></a>
# **createInvoice**
> Invoice createInvoice(invoiceOneOffCreateInput)

Create a one-off invoice

This endpoint is used for issuing a one-off invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    InvoiceOneOffCreateInput invoiceOneOffCreateInput = new InvoiceOneOffCreateInput(); // InvoiceOneOffCreateInput | Invoice payload
    try {
      Invoice result = apiInstance.createInvoice(invoiceOneOffCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoice");
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
| **invoiceOneOffCreateInput** | [**InvoiceOneOffCreateInput**](InvoiceOneOffCreateInput.md)| Invoice payload | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoice created |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |

<a id="downloadInvoice"></a>
# **downloadInvoice**
> Invoice downloadInvoice(lagoId)

Download an invoice PDF

This endpoint is used for downloading a specific invoice PDF document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
    try {
      Invoice result = apiInstance.downloadInvoice(lagoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#downloadInvoice");
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
| **lagoId** | **UUID**| Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system. | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoice PDF |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="finalizeInvoice"></a>
# **finalizeInvoice**
> Invoice finalizeInvoice(lagoId)

Finalize a draft invoice

This endpoint is used for finalizing a draft invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
    try {
      Invoice result = apiInstance.finalizeInvoice(lagoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#finalizeInvoice");
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
| **lagoId** | **UUID**| Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system. | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoice finalized |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="findAllInvoices"></a>
# **findAllInvoices**
> InvoicesPaginated findAllInvoices(page, perPage, externalCustomerId, issuingDateFrom, issuingDateTo, status, paymentStatus)

List all invoices

This endpoint is used for retrievign all invoices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    Integer page = 1; // Integer | Page number.
    Integer perPage = 20; // Integer | Number of records per page.
    String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | Unique identifier assigned to the customer in your application.
    LocalDate issuingDateFrom = LocalDate.parse("Fri Jul 08 00:00:00 UTC 2022"); // LocalDate | Filter invoices starting from a specific date.
    LocalDate issuingDateTo = LocalDate.parse("Tue Aug 09 00:00:00 UTC 2022"); // LocalDate | Filter invoices up to a specific date.
    String status = "draft"; // String | Filter invoices by status. Possible values are `draft` or `finalized`.
    String paymentStatus = "pending"; // String | Filter invoices by payment status. Possible values are `pending`, `failed` or `succeeded`.
    try {
      InvoicesPaginated result = apiInstance.findAllInvoices(page, perPage, externalCustomerId, issuingDateFrom, issuingDateTo, status, paymentStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#findAllInvoices");
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
| **issuingDateFrom** | **LocalDate**| Filter invoices starting from a specific date. | [optional] |
| **issuingDateTo** | **LocalDate**| Filter invoices up to a specific date. | [optional] |
| **status** | **String**| Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;. | [optional] [enum: draft, finalized] |
| **paymentStatus** | **String**| Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;. | [optional] [enum: pending, failed, succeeded] |

### Return type

[**InvoicesPaginated**](InvoicesPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoices |  -  |
| **401** | Unauthorized error |  -  |

<a id="findInvoice"></a>
# **findInvoice**
> Invoice findInvoice(lagoId)

Retrieve an invoice

This endpoint is used for retrieving a specific invoice that has been issued.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
    try {
      Invoice result = apiInstance.findInvoice(lagoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#findInvoice");
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
| **lagoId** | **UUID**| Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system. | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoice |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="refreshInvoice"></a>
# **refreshInvoice**
> Invoice refreshInvoice(lagoId)

Refresh a draft invoice

This endpoint is used for refreshing a draft invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
    try {
      Invoice result = apiInstance.refreshInvoice(lagoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#refreshInvoice");
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
| **lagoId** | **UUID**| Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system. | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoice refreshed |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="retryPayment"></a>
# **retryPayment**
> retryPayment(lagoId)

Retry an invoice payment

This endpoint resends an invoice for collection and retry a payment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
    try {
      apiInstance.retryPayment(lagoId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#retryPayment");
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
| **lagoId** | **UUID**| Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoice payment retried |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **405** | Not Allowed error |  -  |

<a id="updateInvoice"></a>
# **updateInvoice**
> Invoice updateInvoice(lagoId, invoiceUpdateInput)

Update an invoice

This endpoint is used for updating an existing invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
    InvoiceUpdateInput invoiceUpdateInput = new InvoiceUpdateInput(); // InvoiceUpdateInput | Update an existing invoice
    try {
      Invoice result = apiInstance.updateInvoice(lagoId, invoiceUpdateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoice");
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
| **lagoId** | **UUID**| Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system. | |
| **invoiceUpdateInput** | [**InvoiceUpdateInput**](InvoiceUpdateInput.md)| Update an existing invoice | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoice updated |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

