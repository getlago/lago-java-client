# CreditNotesApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCreditNote**](CreditNotesApi.md#createCreditNote) | **POST** /credit_notes | Create a new Credit note |
| [**downloadCreditNote**](CreditNotesApi.md#downloadCreditNote) | **POST** /credit_notes/{id}/download | Download an existing credit note |
| [**findAllCreditNotes**](CreditNotesApi.md#findAllCreditNotes) | **GET** /credit_notes | Find Credit notes |
| [**findCreditNote**](CreditNotesApi.md#findCreditNote) | **GET** /credit_notes/{id} | Find credit note |
| [**updateCreditNote**](CreditNotesApi.md#updateCreditNote) | **PUT** /credit_notes/{id} | Update an existing credit note |
| [**voidCreditNote**](CreditNotesApi.md#voidCreditNote) | **PUT** /credit_notes/{id}/void | Void existing credit note |


<a id="createCreditNote"></a>
# **createCreditNote**
> CreditNote createCreditNote(creditNoteInput)

Create a new Credit note

Create a new credit note

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreditNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
    CreditNoteInput creditNoteInput = new CreditNoteInput(); // CreditNoteInput | Credit note payload
    try {
      CreditNote result = apiInstance.createCreditNote(creditNoteInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditNotesApi#createCreditNote");
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
| **creditNoteInput** | [**CreditNoteInput**](CreditNoteInput.md)| Credit note payload | |

### Return type

[**CreditNote**](CreditNote.md)

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

<a id="downloadCreditNote"></a>
# **downloadCreditNote**
> CreditNote downloadCreditNote(id)

Download an existing credit note

Download an existing credit note

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreditNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
    UUID id = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | ID of the existing Lago Credit note
    try {
      CreditNote result = apiInstance.downloadCreditNote(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditNotesApi#downloadCreditNote");
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
| **id** | **UUID**| ID of the existing Lago Credit note | |

### Return type

[**CreditNote**](CreditNote.md)

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

<a id="findAllCreditNotes"></a>
# **findAllCreditNotes**
> CreditNotes findAllCreditNotes(page, perPage, externalCustomerId)

Find Credit notes

Find all credit notes in certain organisation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreditNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
    Integer page = 2; // Integer | Number of page
    Integer perPage = 20; // Integer | Number of records per page
    String externalCustomerId = "12345"; // String | External customer ID
    try {
      CreditNotes result = apiInstance.findAllCreditNotes(page, perPage, externalCustomerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditNotesApi#findAllCreditNotes");
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

### Return type

[**CreditNotes**](CreditNotes.md)

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

<a id="findCreditNote"></a>
# **findCreditNote**
> CreditNote findCreditNote(id)

Find credit note

Return a single credit note

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreditNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
    String id = "12345"; // String | Id of the existing credit note
    try {
      CreditNote result = apiInstance.findCreditNote(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditNotesApi#findCreditNote");
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
| **id** | **String**| Id of the existing credit note | |

### Return type

[**CreditNote**](CreditNote.md)

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

<a id="updateCreditNote"></a>
# **updateCreditNote**
> CreditNote updateCreditNote(id, creditNoteUpdateInput)

Update an existing credit note

Update an existing credit note

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreditNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
    String id = "12345"; // String | Id of the existing credit note
    CreditNoteUpdateInput creditNoteUpdateInput = new CreditNoteUpdateInput(); // CreditNoteUpdateInput | Update an existing credit note
    try {
      CreditNote result = apiInstance.updateCreditNote(id, creditNoteUpdateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditNotesApi#updateCreditNote");
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
| **id** | **String**| Id of the existing credit note | |
| **creditNoteUpdateInput** | [**CreditNoteUpdateInput**](CreditNoteUpdateInput.md)| Update an existing credit note | |

### Return type

[**CreditNote**](CreditNote.md)

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

<a id="voidCreditNote"></a>
# **voidCreditNote**
> CreditNote voidCreditNote(id)

Void existing credit note

Void an existing credit note

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreditNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
    UUID id = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | ID of the existing Lago Credit note
    try {
      CreditNote result = apiInstance.voidCreditNote(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditNotesApi#voidCreditNote");
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
| **id** | **UUID**| ID of the existing Lago Credit note | |

### Return type

[**CreditNote**](CreditNote.md)

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

