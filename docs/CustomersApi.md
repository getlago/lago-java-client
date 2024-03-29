# CustomersApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomer**](CustomersApi.md#createCustomer) | **POST** /customers | Create a customer |
| [**deleteAppliedCoupon**](CustomersApi.md#deleteAppliedCoupon) | **DELETE** /customers/{external_customer_id}/applied_coupons/{applied_coupon_id} | Delete an applied coupon |
| [**destroyCustomer**](CustomersApi.md#destroyCustomer) | **DELETE** /customers/{external_id} | Delete a customer |
| [**findAllCustomerPastUsage**](CustomersApi.md#findAllCustomerPastUsage) | **GET** /customers/{external_customer_id}/past_usage | Retrieve customer past usage |
| [**findAllCustomers**](CustomersApi.md#findAllCustomers) | **GET** /customers | List all customers |
| [**findCustomer**](CustomersApi.md#findCustomer) | **GET** /customers/{external_id} | Retrieve a customer |
| [**findCustomerCurrentUsage**](CustomersApi.md#findCustomerCurrentUsage) | **GET** /customers/{external_customer_id}/current_usage | Retrieve customer current usage |
| [**generateCustomerCheckoutURL**](CustomersApi.md#generateCustomerCheckoutURL) | **POST** /customers/{external_customer_id}/checkout_url | Generate a Customer Payment Provider Checkout URL |
| [**getCustomerPortalUrl**](CustomersApi.md#getCustomerPortalUrl) | **GET** /customers/{external_customer_id}/portal_url | Get a customer portal URL |



## createCustomer

> Customer createCustomer(customerCreateInput)

Create a customer

This endpoint creates a new customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        CustomerCreateInput customerCreateInput = new CustomerCreateInput(); // CustomerCreateInput | Customer payload
        try {
            Customer result = apiInstance.createCustomer(customerCreateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#createCustomer");
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
| **customerCreateInput** | [**CustomerCreateInput**](CustomerCreateInput.md)| Customer payload | |

### Return type

[**Customer**](Customer.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer created or updated |  -  |
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
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | The customer external unique identifier (provided by your own application)
        UUID appliedCouponId = UUID.fromString("1a901a90-1a90-1a90-1a90-1a901a901a90"); // UUID | Unique identifier of the applied coupon, created by Lago.
        try {
            AppliedCoupon result = apiInstance.deleteAppliedCoupon(externalCustomerId, appliedCouponId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#deleteAppliedCoupon");
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


## destroyCustomer

> Customer destroyCustomer(externalId)

Delete a customer

This endpoint deletes an existing customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String externalId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | External ID of the existing customer
        try {
            Customer result = apiInstance.destroyCustomer(externalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#destroyCustomer");
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
| **externalId** | **String**| External ID of the existing customer | |

### Return type

[**Customer**](Customer.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer deleted |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## findAllCustomerPastUsage

> CustomerPastUsage findAllCustomerPastUsage(externalCustomerId, externalSubscriptionId, page, perPage, billableMetricCode, periodsCount)

Retrieve customer past usage

This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | The customer external unique identifier (provided by your own application).
        String externalSubscriptionId = "sub_1234567890"; // String | The unique identifier of the subscription within your application.
        Integer page = 1; // Integer | Page number.
        Integer perPage = 20; // Integer | Number of records per page.
        String billableMetricCode = "cpu"; // String | Billable metric code filter to apply to the charge usage
        Integer periodsCount = 5; // Integer | Number of past billing period to returns in the result
        try {
            CustomerPastUsage result = apiInstance.findAllCustomerPastUsage(externalCustomerId, externalSubscriptionId, page, perPage, billableMetricCode, periodsCount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#findAllCustomerPastUsage");
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
| **externalCustomerId** | **String**| The customer external unique identifier (provided by your own application). | |
| **externalSubscriptionId** | **String**| The unique identifier of the subscription within your application. | |
| **page** | **Integer**| Page number. | [optional] |
| **perPage** | **Integer**| Number of records per page. | [optional] |
| **billableMetricCode** | **String**| Billable metric code filter to apply to the charge usage | [optional] |
| **periodsCount** | **Integer**| Number of past billing period to returns in the result | [optional] |

### Return type

[**CustomerPastUsage**](CustomerPastUsage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer past usage |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |


## findAllCustomers

> CustomersPaginated findAllCustomers(page, perPage)

List all customers

This endpoint retrieves all existing customers.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer perPage = 20; // Integer | Number of records per page.
        try {
            CustomersPaginated result = apiInstance.findAllCustomers(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#findAllCustomers");
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

[**CustomersPaginated**](CustomersPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of customers |  -  |
| **401** | Unauthorized error |  -  |


## findCustomer

> Customer findCustomer(externalId)

Retrieve a customer

This endpoint retrieves an existing customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String externalId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | External ID of the existing customer
        try {
            Customer result = apiInstance.findCustomer(externalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#findCustomer");
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
| **externalId** | **String**| External ID of the existing customer | |

### Return type

[**Customer**](Customer.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## findCustomerCurrentUsage

> CustomerUsage findCustomerCurrentUsage(externalCustomerId, externalSubscriptionId)

Retrieve customer current usage

This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | The customer external unique identifier (provided by your own application).
        String externalSubscriptionId = "sub_1234567890"; // String | The unique identifier of the subscription within your application.
        try {
            CustomerUsage result = apiInstance.findCustomerCurrentUsage(externalCustomerId, externalSubscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#findCustomerCurrentUsage");
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
| **externalCustomerId** | **String**| The customer external unique identifier (provided by your own application). | |
| **externalSubscriptionId** | **String**| The unique identifier of the subscription within your application. | |

### Return type

[**CustomerUsage**](CustomerUsage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer usage |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |


## generateCustomerCheckoutURL

> GenerateCustomerCheckoutURL200Response generateCustomerCheckoutURL(externalCustomerId)

Generate a Customer Payment Provider Checkout URL

This endpoint regenerates the Payment Provider Checkout URL of a Customer.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | The customer external unique identifier (provided by your own application).
        try {
            GenerateCustomerCheckoutURL200Response result = apiInstance.generateCustomerCheckoutURL(externalCustomerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#generateCustomerCheckoutURL");
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
| **externalCustomerId** | **String**| The customer external unique identifier (provided by your own application). | |

### Return type

[**GenerateCustomerCheckoutURL200Response**](GenerateCustomerCheckoutURL200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer Checkout URL |  -  |
| **401** | Unauthorized error |  -  |
| **404** | Not Found error |  -  |
| **422** | Unprocessable entity error |  -  |


## getCustomerPortalUrl

> GetCustomerPortalUrl200Response getCustomerPortalUrl(externalCustomerId)

Get a customer portal URL

Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | External ID of the existing customer
        try {
            GetCustomerPortalUrl200Response result = apiInstance.getCustomerPortalUrl(externalCustomerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#getCustomerPortalUrl");
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
| **externalCustomerId** | **String**| External ID of the existing customer | |

### Return type

[**GetCustomerPortalUrl200Response**](GetCustomerPortalUrl200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portal URL |  -  |
| **401** | Unauthorized error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found error |  -  |

