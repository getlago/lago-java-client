# CouponsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyCoupon**](CouponsApi.md#applyCoupon) | **POST** /applied_coupons | Apply a coupon to a customer |
| [**createCoupon**](CouponsApi.md#createCoupon) | **POST** /coupons | Create a new coupon |
| [**destroyCoupon**](CouponsApi.md#destroyCoupon) | **DELETE** /coupons/{code} | Delete a coupon |
| [**findAllAppliedCoupons**](CouponsApi.md#findAllAppliedCoupons) | **GET** /applied_coupons | Find Applied Coupons |
| [**findAllCoupons**](CouponsApi.md#findAllCoupons) | **GET** /coupons | Find Coupons |
| [**findCoupon**](CouponsApi.md#findCoupon) | **GET** /coupons/{code} | Find coupon by code |
| [**updateCoupon**](CouponsApi.md#updateCoupon) | **PUT** /coupons/{code} | Update an existing coupon |


<a id="applyCoupon"></a>
# **applyCoupon**
> AppliedCoupon applyCoupon(appliedCouponInput)

Apply a coupon to a customer

Apply a coupon to a customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponsApi apiInstance = new CouponsApi(defaultClient);
    AppliedCouponInput appliedCouponInput = new AppliedCouponInput(); // AppliedCouponInput | Apply coupon payload
    try {
      AppliedCoupon result = apiInstance.applyCoupon(appliedCouponInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#applyCoupon");
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
| **appliedCouponInput** | [**AppliedCouponInput**](AppliedCouponInput.md)| Apply coupon payload | |

### Return type

[**AppliedCoupon**](AppliedCoupon.md)

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

<a id="createCoupon"></a>
# **createCoupon**
> Coupon createCoupon(couponInput)

Create a new coupon

Create a new coupon

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponsApi apiInstance = new CouponsApi(defaultClient);
    CouponInput couponInput = new CouponInput(); // CouponInput | Coupon payload
    try {
      Coupon result = apiInstance.createCoupon(couponInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#createCoupon");
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
| **couponInput** | [**CouponInput**](CouponInput.md)| Coupon payload | |

### Return type

[**Coupon**](Coupon.md)

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

<a id="destroyCoupon"></a>
# **destroyCoupon**
> Coupon destroyCoupon(code)

Delete a coupon

Delete a coupon

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponsApi apiInstance = new CouponsApi(defaultClient);
    String code = "example_code"; // String | Code of the existing coupon
    try {
      Coupon result = apiInstance.destroyCoupon(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#destroyCoupon");
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
| **code** | **String**| Code of the existing coupon | |

### Return type

[**Coupon**](Coupon.md)

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

<a id="findAllAppliedCoupons"></a>
# **findAllAppliedCoupons**
> AppliedCouponsPaginated findAllAppliedCoupons(page, perPage, status, externalCustomerId)

Find Applied Coupons

Find all applied coupons

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponsApi apiInstance = new CouponsApi(defaultClient);
    Integer page = 2; // Integer | Number of page
    Integer perPage = 20; // Integer | Number of records per page
    String status = "active"; // String | Applied coupon status
    String externalCustomerId = "12345"; // String | External customer ID
    try {
      AppliedCouponsPaginated result = apiInstance.findAllAppliedCoupons(page, perPage, status, externalCustomerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#findAllAppliedCoupons");
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
| **status** | **String**| Applied coupon status | [optional] [enum: active, terminated] |
| **externalCustomerId** | **String**| External customer ID | [optional] |

### Return type

[**AppliedCouponsPaginated**](AppliedCouponsPaginated.md)

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

<a id="findAllCoupons"></a>
# **findAllCoupons**
> CouponsPaginated findAllCoupons(page, perPage)

Find Coupons

Find all coupons in certain organisation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponsApi apiInstance = new CouponsApi(defaultClient);
    Integer page = 2; // Integer | Number of page
    Integer perPage = 20; // Integer | Number of records per page
    try {
      CouponsPaginated result = apiInstance.findAllCoupons(page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#findAllCoupons");
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

[**CouponsPaginated**](CouponsPaginated.md)

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

<a id="findCoupon"></a>
# **findCoupon**
> Coupon findCoupon(code)

Find coupon by code

Return a single coupon

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponsApi apiInstance = new CouponsApi(defaultClient);
    String code = "example_code"; // String | Code of the existing coupon
    try {
      Coupon result = apiInstance.findCoupon(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#findCoupon");
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
| **code** | **String**| Code of the existing coupon | |

### Return type

[**Coupon**](Coupon.md)

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

<a id="updateCoupon"></a>
# **updateCoupon**
> Coupon updateCoupon(code, couponInput)

Update an existing coupon

Update an existing coupon by code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.getlago.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponsApi apiInstance = new CouponsApi(defaultClient);
    String code = "example_code"; // String | Code of the existing coupon
    CouponInput couponInput = new CouponInput(); // CouponInput | Update an existing coupon
    try {
      Coupon result = apiInstance.updateCoupon(code, couponInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#updateCoupon");
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
| **code** | **String**| Code of the existing coupon | |
| **couponInput** | [**CouponInput**](CouponInput.md)| Update an existing coupon | |

### Return type

[**Coupon**](Coupon.md)

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

