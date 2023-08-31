# CreditNotesApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCreditNote**](CreditNotesApi.md#createCreditNote) | **POST** /credit_notes | Create a credit note |
| [**downloadCreditNote**](CreditNotesApi.md#downloadCreditNote) | **POST** /credit_notes/{lago_id}/download | Download a credit note PDF |
| [**findAllCreditNotes**](CreditNotesApi.md#findAllCreditNotes) | **GET** /credit_notes | List all credit notes |
| [**findCreditNote**](CreditNotesApi.md#findCreditNote) | **GET** /credit_notes/{lago_id} | Retrieve a credit note |
| [**updateCreditNote**](CreditNotesApi.md#updateCreditNote) | **PUT** /credit_notes/{lago_id} | Update a credit note |
| [**voidCreditNote**](CreditNotesApi.md#voidCreditNote) | **PUT** /credit_notes/{lago_id}/void | Void a credit note |



## createCreditNote

> CreditNote createCreditNote(creditNoteCreateInput)

Create a credit note

This endpoint creates a new credit note.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CreditNotesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
        CreditNoteCreateInput creditNoteCreateInput = new CreditNoteCreateInput(); // CreditNoteCreateInput | Credit note payload
        try {
            CreditNote result = apiInstance.createCreditNote(creditNoteCreateInput);
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
| **creditNoteCreateInput** | [**CreditNoteCreateInput**](CreditNoteCreateInput.md)| Credit note payload | |

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
| **200** | Credit note created |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |


## downloadCreditNote

> CreditNote downloadCreditNote(lagoId)

Download a credit note PDF

This endpoint downloads the PDF of an existing credit note.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CreditNotesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
        UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | The credit note unique identifier, created by Lago.
        try {
            CreditNote result = apiInstance.downloadCreditNote(lagoId);
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
| **lagoId** | **UUID**| The credit note unique identifier, created by Lago. | |

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
| **200** | Credit note PDF |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## findAllCreditNotes

> CreditNotes findAllCreditNotes(page, perPage, externalCustomerId)

List all credit notes

This endpoint list all existing credit notes.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CreditNotesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer perPage = 20; // Integer | Number of records per page.
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | Unique identifier assigned to the customer in your application.
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
| **page** | **Integer**| Page number. | [optional] |
| **perPage** | **Integer**| Number of records per page. | [optional] |
| **externalCustomerId** | **String**| Unique identifier assigned to the customer in your application. | [optional] |

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
| **200** | Credit notes |  -  |
| **401** | Unauthorized error |  -  |


## findCreditNote

> CreditNote findCreditNote(lagoId)

Retrieve a credit note

This endpoint retrieves an existing credit note.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CreditNotesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
        String lagoId = "12345"; // String | The credit note unique identifier, created by Lago.
        try {
            CreditNote result = apiInstance.findCreditNote(lagoId);
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
| **lagoId** | **String**| The credit note unique identifier, created by Lago. | |

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
| **200** | Credit note |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## updateCreditNote

> CreditNote updateCreditNote(lagoId, creditNoteUpdateInput)

Update a credit note

This endpoint updates an existing credit note.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CreditNotesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
        String lagoId = "12345"; // String | The credit note unique identifier, created by Lago.
        CreditNoteUpdateInput creditNoteUpdateInput = new CreditNoteUpdateInput(); // CreditNoteUpdateInput | Credit note update payload
        try {
            CreditNote result = apiInstance.updateCreditNote(lagoId, creditNoteUpdateInput);
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
| **lagoId** | **String**| The credit note unique identifier, created by Lago. | |
| **creditNoteUpdateInput** | [**CreditNoteUpdateInput**](CreditNoteUpdateInput.md)| Credit note update payload | |

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
| **200** | Credit note updated |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |


## voidCreditNote

> CreditNote voidCreditNote(lagoId)

Void a credit note

This endpoint voids an existing credit note.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CreditNotesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CreditNotesApi apiInstance = new CreditNotesApi(defaultClient);
        UUID lagoId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | The credit note unique identifier, created by Lago.
        try {
            CreditNote result = apiInstance.voidCreditNote(lagoId);
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
| **lagoId** | **UUID**| The credit note unique identifier, created by Lago. | |

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
| **200** | Credit note voided |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **405** | Not Allowed error |  -  |

