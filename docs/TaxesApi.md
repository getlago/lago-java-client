# TaxesApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTax**](TaxesApi.md#createTax) | **POST** /taxes | Create a tax |
| [**destroyTax**](TaxesApi.md#destroyTax) | **DELETE** /taxes/{code} | Delete a tax |
| [**findAllTaxes**](TaxesApi.md#findAllTaxes) | **GET** /taxes | List all taxes |
| [**findTax**](TaxesApi.md#findTax) | **GET** /taxes/{code} | Retrieve a Tax |
| [**updateTax**](TaxesApi.md#updateTax) | **PUT** /taxes/{code} | Update a tax |



## createTax

> Tax createTax(taxCreateInput)

Create a tax

This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        TaxCreateInput taxCreateInput = new TaxCreateInput(); // TaxCreateInput | Tax creation payload
        try {
            Tax result = apiInstance.createTax(taxCreateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#createTax");
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
| **taxCreateInput** | [**TaxCreateInput**](TaxCreateInput.md)| Tax creation payload | |

### Return type

[**Tax**](Tax.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tax created |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |


## destroyTax

> Tax destroyTax(code)

Delete a tax

This endpoint is used to delete a tax.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        String code = "french_standard_vat"; // String | The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
        try {
            Tax result = apiInstance.destroyTax(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#destroyTax");
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
| **code** | **String**| The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. | |

### Return type

[**Tax**](Tax.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tax deleted |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## findAllTaxes

> TaxesPaginated findAllTaxes(page, perPage)

List all taxes

This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer perPage = 20; // Integer | Number of records per page.
        try {
            TaxesPaginated result = apiInstance.findAllTaxes(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#findAllTaxes");
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

[**TaxesPaginated**](TaxesPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Taxes |  -  |
| **401** | Unauthorized error |  -  |


## findTax

> Tax findTax(code)

Retrieve a Tax

This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        String code = "french_standard_vat"; // String | The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
        try {
            Tax result = apiInstance.findTax(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#findTax");
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
| **code** | **String**| The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. | |

### Return type

[**Tax**](Tax.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tax |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## updateTax

> Tax updateTax(code, taxUpdateInput)

Update a tax

This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        String code = "french_standard_vat"; // String | The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
        TaxUpdateInput taxUpdateInput = new TaxUpdateInput(); // TaxUpdateInput | Tax update payload
        try {
            Tax result = apiInstance.updateTax(code, taxUpdateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#updateTax");
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
| **code** | **String**| The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. | |
| **taxUpdateInput** | [**TaxUpdateInput**](TaxUpdateInput.md)| Tax update payload | |

### Return type

[**Tax**](Tax.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tax updated |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

