# AddOnsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyAddOn**](AddOnsApi.md#applyAddOn) | **POST** /applied_add_ons | Apply an add-on to a customer |
| [**createAddOn**](AddOnsApi.md#createAddOn) | **POST** /add_ons | Create a new add-on |
| [**destroyAddOn**](AddOnsApi.md#destroyAddOn) | **DELETE** /add_ons/{code} | Delete an add-on |
| [**findAddOn**](AddOnsApi.md#findAddOn) | **GET** /add_ons/{code} | Find add-on by code |
| [**findAllAddOns**](AddOnsApi.md#findAllAddOns) | **GET** /add_ons | Find add-ons |
| [**updateAddOn**](AddOnsApi.md#updateAddOn) | **PUT** /add_ons/{code} | Update an existing add-on |


<a id="applyAddOn"></a>
# **applyAddOn**
> AppliedAddOn applyAddOn(appliedAddOnInput)

Apply an add-on to a customer

Apply an add-on to a customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    AppliedAddOnInput appliedAddOnInput = new AppliedAddOnInput(); // AppliedAddOnInput | Apply add-on payload
    try {
      AppliedAddOn result = apiInstance.applyAddOn(appliedAddOnInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddOnsApi#applyAddOn");
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
| **appliedAddOnInput** | [**AppliedAddOnInput**](AppliedAddOnInput.md)| Apply add-on payload | |

### Return type

[**AppliedAddOn**](AppliedAddOn.md)

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

<a id="createAddOn"></a>
# **createAddOn**
> AddOn createAddOn(addOnInput)

Create a new add-on

Create a new add-on

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    AddOnInput addOnInput = new AddOnInput(); // AddOnInput | Add-on payload
    try {
      AddOn result = apiInstance.createAddOn(addOnInput);
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
| **addOnInput** | [**AddOnInput**](AddOnInput.md)| Add-on payload | |

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
| **200** | Successful response |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |

<a id="destroyAddOn"></a>
# **destroyAddOn**
> AddOn destroyAddOn(code)

Delete an add-on

Delete an add-on

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    String code = "example_code"; // String | Code of the existing add-on
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
| **code** | **String**| Code of the existing add-on | |

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
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="findAddOn"></a>
# **findAddOn**
> AddOn findAddOn(code)

Find add-on by code

Return a single add-on

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    String code = "example_code"; // String | Code of the existing add-on
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
| **code** | **String**| Code of the existing add-on | |

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
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |

<a id="findAllAddOns"></a>
# **findAllAddOns**
> AddOnsPaginated findAllAddOns(page, perPage)

Find add-ons

Find all add-ons in certain organisation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    Integer page = 2; // Integer | Number of page
    Integer perPage = 20; // Integer | Number of records per page
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
| **page** | **Integer**| Number of page | [optional] |
| **perPage** | **Integer**| Number of records per page | [optional] |

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
| **200** | Successful response |  -  |
| **401** | Unauthorized error |  -  |

<a id="updateAddOn"></a>
# **updateAddOn**
> AddOn updateAddOn(code, addOnInput)

Update an existing add-on

Update an existing add-on by code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    String code = "example_code"; // String | Code of the existing add-on
    AddOnInput addOnInput = new AddOnInput(); // AddOnInput | Update an existing add-on
    try {
      AddOn result = apiInstance.updateAddOn(code, addOnInput);
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
| **code** | **String**| Code of the existing add-on | |
| **addOnInput** | [**AddOnInput**](AddOnInput.md)| Update an existing add-on | |

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
| **200** | Successful response |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

