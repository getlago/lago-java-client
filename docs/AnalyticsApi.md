# AnalyticsApi

All URIs are relative to *https://api.getlago.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findAllGrossRevenues**](AnalyticsApi.md#findAllGrossRevenues) | **GET** /analytics/gross_revenue | List gross revenue |
| [**findAllInvoicedUsages**](AnalyticsApi.md#findAllInvoicedUsages) | **GET** /analytics/invoiced_usage | List usage revenue |
| [**findAllMrrs**](AnalyticsApi.md#findAllMrrs) | **GET** /analytics/mrr | List MRR |
| [**findAllOutstandingInvoices**](AnalyticsApi.md#findAllOutstandingInvoices) | **GET** /analytics/outstanding_invoices | List outstanding invoices |



## findAllGrossRevenues

> GrossRevenues findAllGrossRevenues(currency, externalCustomerId)

List gross revenue

Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        Currency currency = new Currency(); // Currency | Currency of revenue analytics. Format must be ISO 4217.
        String externalCustomerId = "5eb02857-a71e-4ea2-bcf9-57d3a41bc6ba"; // String | The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level.
        try {
            GrossRevenues result = apiInstance.findAllGrossRevenues(currency, externalCustomerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#findAllGrossRevenues");
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
| **currency** | [**Currency**](.md)| Currency of revenue analytics. Format must be ISO 4217. | [optional] |
| **externalCustomerId** | **String**| The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. | [optional] |

### Return type

[**GrossRevenues**](GrossRevenues.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gross revenue |  -  |
| **401** | Unauthorized error |  -  |


## findAllInvoicedUsages

> InvoicedUsages findAllInvoicedUsages(currency)

List usage revenue

Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        Currency currency = new Currency(); // Currency | The currency of invoiced usage analytics. Format must be ISO 4217.
        try {
            InvoicedUsages result = apiInstance.findAllInvoicedUsages(currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#findAllInvoicedUsages");
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
| **currency** | [**Currency**](.md)| The currency of invoiced usage analytics. Format must be ISO 4217. | [optional] |

### Return type

[**InvoicedUsages**](InvoicedUsages.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invoiced usage |  -  |
| **401** | Unauthorized error |  -  |


## findAllMrrs

> Mrrs findAllMrrs(currency, months)

List MRR

This endpoint is used to list MRR.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        Currency currency = new Currency(); // Currency | Quantifies the revenue generated from `subscription` fees on a monthly basis. This figure is calculated post-application of applicable taxes and prior to the deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from `monthly` subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from `quarterly` subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next three months) as well as to fees paid in arrears (allocated to the preceding three months). - Revenue from `yearly` subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next twelve months) and for fees paid in arrears (spread over the previous twelve months). - Revenue from `weekly` subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month.
        Integer months = 12; // Integer | Show data only for given number of months.
        try {
            Mrrs result = apiInstance.findAllMrrs(currency, months);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#findAllMrrs");
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
| **currency** | [**Currency**](.md)| Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and prior to the deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next three months) as well as to fees paid in arrears (allocated to the preceding three months). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next twelve months) and for fees paid in arrears (spread over the previous twelve months). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month. | [optional] |
| **months** | **Integer**| Show data only for given number of months. | [optional] |

### Return type

[**Mrrs**](Mrrs.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | MRR |  -  |
| **401** | Unauthorized error |  -  |


## findAllOutstandingInvoices

> OutstandingInvoices findAllOutstandingInvoices(currency)

List outstanding invoices

Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.

### Example

```java
// Import classes:
import org.getlago.client.ApiClient;
import org.getlago.client.ApiException;
import org.getlago.client.Configuration;
import org.getlago.client.auth.*;
import org.getlago.client.models.*;
import org.getlago.client.api.AnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        Currency currency = new Currency(); // Currency | The currency of revenue analytics. Format must be ISO 4217.
        try {
            OutstandingInvoices result = apiInstance.findAllOutstandingInvoices(currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#findAllOutstandingInvoices");
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
| **currency** | [**Currency**](.md)| The currency of revenue analytics. Format must be ISO 4217. | [optional] |

### Return type

[**OutstandingInvoices**](OutstandingInvoices.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Outstanding invoices |  -  |
| **401** | Unauthorized error |  -  |

