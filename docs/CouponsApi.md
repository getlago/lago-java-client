# CouponsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyCoupon**](CouponsApi.md#applyCoupon) | **POST** /applied_coupons | Apply a coupon to a customer |
| [**createCoupon**](CouponsApi.md#createCoupon) | **POST** /coupons | Create a coupon |
| [**deleteAppliedCoupon**](CouponsApi.md#deleteAppliedCoupon) | **DELETE** /customers/{external_customer_id}/applied_coupons/{applied_coupon_id} | Delete an applied coupon |
| [**destroyCoupon**](CouponsApi.md#destroyCoupon) | **DELETE** /coupons/{code} | Delete a coupon |
| [**findAllAppliedCoupons**](CouponsApi.md#findAllAppliedCoupons) | **GET** /applied_coupons | List all applied coupons |
| [**findAllCoupons**](CouponsApi.md#findAllCoupons) | **GET** /coupons | List all coupons |
| [**findCoupon**](CouponsApi.md#findCoupon) | **GET** /coupons/{code} | Retrieve a coupon |
| [**updateCoupon**](CouponsApi.md#updateCoupon) | **PUT** /coupons/{code} | Update a coupon |



## applyCoupon

> AppliedCoupon applyCoupon(appliedCouponInput)

Apply a coupon to a customer

This endpoint is used to apply a specific coupon to a customer, before or during a subscription.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CouponsApi;

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
| **200** | Coupon applied |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |


## createCoupon

> Coupon createCoupon(couponCreateInput)

Create a coupon

This endpoint is used to create a coupon that can be then attached to a customer to create a discount.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CouponsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        CouponCreateInput couponCreateInput = new CouponCreateInput(); // CouponCreateInput | Coupon payload
        try {
            Coupon result = apiInstance.createCoupon(couponCreateInput);
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
| **couponCreateInput** | [**CouponCreateInput**](CouponCreateInput.md)| Coupon payload | |

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
| **200** | Coupon created |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **422** | Unprocessable entity error |  -  |


## deleteAppliedCoupon

> AppliedCoupon deleteAppliedCoupon(externalCustomerId, appliedCouponId)

Delete an applied coupon

This endpoint is used to delete a specific coupon that has been applied to a customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CouponsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | The customer external unique identifier (provided by your own application)
        UUID appliedCouponId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier of the applied coupon, created by Lago.
        try {
            AppliedCoupon result = apiInstance.deleteAppliedCoupon(externalCustomerId, appliedCouponId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CouponsApi#deleteAppliedCoupon");
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
| **externalCustomerId** | **String**| The customer external unique identifier (provided by your own application) | |
| **appliedCouponId** | **UUID**| Unique identifier of the applied coupon, created by Lago. | |

### Return type

[**AppliedCoupon**](AppliedCoupon.md)

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


## destroyCoupon

> Coupon destroyCoupon(code)

Delete a coupon

This endpoint is used to delete a coupon.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CouponsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        String code = "startup_deal"; // String | Unique code used to identify the coupon.
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
| **code** | **String**| Unique code used to identify the coupon. | |

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
| **200** | Coupon deleted |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## findAllAppliedCoupons

> AppliedCouponsPaginated findAllAppliedCoupons(page, perPage, status, externalCustomerId)

List all applied coupons

This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CouponsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer perPage = 20; // Integer | Number of records per page.
        String status = "active"; // String | The status of the coupon. Can be either `active` or `terminated`.
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | The customer external unique identifier (provided by your own application)
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
| **page** | **Integer**| Page number. | [optional] |
| **perPage** | **Integer**| Number of records per page. | [optional] |
| **status** | **String**| The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;. | [optional] [enum: active, terminated] |
| **externalCustomerId** | **String**| The customer external unique identifier (provided by your own application) | [optional] |

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
| **200** | Applied Coupons |  -  |
| **401** | Unauthorized error |  -  |


## findAllCoupons

> CouponsPaginated findAllCoupons(page, perPage)

List all coupons

This endpoint is used to list all existing coupons.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CouponsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer perPage = 20; // Integer | Number of records per page.
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
| **page** | **Integer**| Page number. | [optional] |
| **perPage** | **Integer**| Number of records per page. | [optional] |

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
| **200** | Coupons |  -  |
| **401** | Unauthorized error |  -  |


## findCoupon

> Coupon findCoupon(code)

Retrieve a coupon

This endpoint is used to retrieve a specific coupon.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CouponsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        String code = "startup_deal"; // String | Unique code used to identify the coupon.
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
| **code** | **String**| Unique code used to identify the coupon. | |

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
| **200** | Coupon |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## updateCoupon

> Coupon updateCoupon(code, couponUpdateInput)

Update a coupon

This endpoint is used to update a coupon that can be then attached to a customer to create a discount.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CouponsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        String code = "startup_deal"; // String | Unique code used to identify the coupon.
        CouponUpdateInput couponUpdateInput = new CouponUpdateInput(); // CouponUpdateInput | Coupon payload
        try {
            Coupon result = apiInstance.updateCoupon(code, couponUpdateInput);
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
| **code** | **String**| Unique code used to identify the coupon. | |
| **couponUpdateInput** | [**CouponUpdateInput**](CouponUpdateInput.md)| Coupon payload | |

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
| **200** | Coupon updated |  -  |
| **400** | Bad Request error |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |

