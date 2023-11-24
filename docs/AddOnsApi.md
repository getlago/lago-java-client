# AddOnsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAddOn**](AddOnsApi.md#createAddOn) | **POST** /add_ons | Create an add-on |
| [**destroyAddOn**](AddOnsApi.md#destroyAddOn) | **DELETE** /add_ons/{code} | Delete an add-on |
| [**findAddOn**](AddOnsApi.md#findAddOn) | **GET** /add_ons/{code} | Retrieve an add-on |
| [**findAllAddOns**](AddOnsApi.md#findAllAddOns) | **GET** /add_ons | List all add-ons |
| [**updateAddOn**](AddOnsApi.md#updateAddOn) | **PUT** /add_ons/{code} | Update an add-on |



## createAddOn

> AddOn createAddOn(addOnCreateInput)

Create an add-on

This endpoint is used to create an add-on that can be then attached to a one-off invoice.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AddOnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddOnsApi apiInstance = new AddOnsApi(defaultClient);
        AddOnCreateInput addOnCreateInput = new AddOnCreateInput(); // AddOnCreateInput | Add-on payload
        try {
            AddOn result = apiInstance.createAddOn(addOnCreateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddOnsApi#createAddOn");
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
| **addOnCreateInput** | [**AddOnCreateInput**](AddOnCreateInput.md)| Add-on payload | |

### Return type

[**AddOn**](AddOn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add-on created |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |


## destroyAddOn

> AddOn destroyAddOn(code)

Delete an add-on

This endpoint is used to delete an existing add-on.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AddOnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddOnsApi apiInstance = new AddOnsApi(defaultClient);
        String code = "setup_fee"; // String | Unique code used to identify the add-on.
        try {
            AddOn result = apiInstance.destroyAddOn(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddOnsApi#destroyAddOn");
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
| **code** | **String**| Unique code used to identify the add-on. | |

### Return type

[**AddOn**](AddOn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add-on deleted |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## findAddOn

> AddOn findAddOn(code)

Retrieve an add-on

This endpoint is used to retrieve a specific add-on.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AddOnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddOnsApi apiInstance = new AddOnsApi(defaultClient);
        String code = "setup_fee"; // String | Unique code used to identify the add-on.
        try {
            AddOn result = apiInstance.findAddOn(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddOnsApi#findAddOn");
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
| **code** | **String**| Unique code used to identify the add-on. | |

### Return type

[**AddOn**](AddOn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add-on |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## findAllAddOns

> AddOnsPaginated findAllAddOns(page, perPage)

List all add-ons

This endpoint is used to list all existing add-ons.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AddOnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddOnsApi apiInstance = new AddOnsApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer perPage = 20; // Integer | Number of records per page.
        try {
            AddOnsPaginated result = apiInstance.findAllAddOns(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddOnsApi#findAllAddOns");
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

[**AddOnsPaginated**](AddOnsPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add-ons |  -  |
| **401** | Unauthorized error |  -  |


## updateAddOn

> AddOn updateAddOn(code, addOnUpdateInput)

Update an add-on

This endpoint is used to update an existing add-on.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AddOnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddOnsApi apiInstance = new AddOnsApi(defaultClient);
        String code = "setup_fee"; // String | Unique code used to identify the add-on.
        AddOnUpdateInput addOnUpdateInput = new AddOnUpdateInput(); // AddOnUpdateInput | Add-on payload
        try {
            AddOn result = apiInstance.updateAddOn(code, addOnUpdateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddOnsApi#updateAddOn");
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
| **code** | **String**| Unique code used to identify the add-on. | |
| **addOnUpdateInput** | [**AddOnUpdateInput**](AddOnUpdateInput.md)| Add-on payload | |

### Return type

[**AddOn**](AddOn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add-on updated |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

