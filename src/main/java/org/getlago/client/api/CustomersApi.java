package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorForbidden;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.AppliedCoupon;
import org.openapitools.client.model.Customer;
import org.openapitools.client.model.CustomerCreateInput;
import org.openapitools.client.model.CustomerPastUsage;
import org.openapitools.client.model.CustomerUsage;
import org.openapitools.client.model.CustomersPaginated;
import org.openapitools.client.model.GenerateCustomerCheckoutURL200Response;
import org.openapitools.client.model.GetCustomerPortalUrl200Response;
import java.util.UUID;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class CustomersApi {
    private ApiClient apiClient;

    public CustomersApi() {
        this(new ApiClient());
    }

    @Autowired
    public CustomersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a customer
     * This endpoint creates a new customer.
     * <p><b>200</b> - Customer created or updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param customerCreateInput Customer payload
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createCustomerRequestCreation(CustomerCreateInput customerCreateInput) throws WebClientResponseException {
        Object postBody = customerCreateInput;
        // verify the required parameter 'customerCreateInput' is set
        if (customerCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'customerCreateInput' when calling createCustomer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/customers", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a customer
     * This endpoint creates a new customer.
     * <p><b>200</b> - Customer created or updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param customerCreateInput Customer payload
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> createCustomer(CustomerCreateInput customerCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return createCustomerRequestCreation(customerCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a customer
     * This endpoint creates a new customer.
     * <p><b>200</b> - Customer created or updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param customerCreateInput Customer payload
     * @return ResponseEntity&lt;Customer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Customer>> createCustomerWithHttpInfo(CustomerCreateInput customerCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return createCustomerRequestCreation(customerCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a customer
     * This endpoint creates a new customer.
     * <p><b>200</b> - Customer created or updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param customerCreateInput Customer payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createCustomerWithResponseSpec(CustomerCreateInput customerCreateInput) throws WebClientResponseException {
        return createCustomerRequestCreation(customerCreateInput);
    }
    /**
     * Delete an applied coupon
     * This endpoint is used to delete a specific coupon that has been applied to a customer.
     * <p><b>200</b> - Successful response
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @param appliedCouponId Unique identifier of the applied coupon, created by Lago.
     * @return AppliedCoupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteAppliedCouponRequestCreation(String externalCustomerId, UUID appliedCouponId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalCustomerId' is set
        if (externalCustomerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalCustomerId' when calling deleteAppliedCoupon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'appliedCouponId' is set
        if (appliedCouponId == null) {
            throw new WebClientResponseException("Missing the required parameter 'appliedCouponId' when calling deleteAppliedCoupon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("external_customer_id", externalCustomerId);
        pathParams.put("applied_coupon_id", appliedCouponId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AppliedCoupon> localVarReturnType = new ParameterizedTypeReference<AppliedCoupon>() {};
        return apiClient.invokeAPI("/customers/{external_customer_id}/applied_coupons/{applied_coupon_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an applied coupon
     * This endpoint is used to delete a specific coupon that has been applied to a customer.
     * <p><b>200</b> - Successful response
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @param appliedCouponId Unique identifier of the applied coupon, created by Lago.
     * @return AppliedCoupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AppliedCoupon> deleteAppliedCoupon(String externalCustomerId, UUID appliedCouponId) throws WebClientResponseException {
        ParameterizedTypeReference<AppliedCoupon> localVarReturnType = new ParameterizedTypeReference<AppliedCoupon>() {};
        return deleteAppliedCouponRequestCreation(externalCustomerId, appliedCouponId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an applied coupon
     * This endpoint is used to delete a specific coupon that has been applied to a customer.
     * <p><b>200</b> - Successful response
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @param appliedCouponId Unique identifier of the applied coupon, created by Lago.
     * @return ResponseEntity&lt;AppliedCoupon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AppliedCoupon>> deleteAppliedCouponWithHttpInfo(String externalCustomerId, UUID appliedCouponId) throws WebClientResponseException {
        ParameterizedTypeReference<AppliedCoupon> localVarReturnType = new ParameterizedTypeReference<AppliedCoupon>() {};
        return deleteAppliedCouponRequestCreation(externalCustomerId, appliedCouponId).toEntity(localVarReturnType);
    }

    /**
     * Delete an applied coupon
     * This endpoint is used to delete a specific coupon that has been applied to a customer.
     * <p><b>200</b> - Successful response
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @param appliedCouponId Unique identifier of the applied coupon, created by Lago.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteAppliedCouponWithResponseSpec(String externalCustomerId, UUID appliedCouponId) throws WebClientResponseException {
        return deleteAppliedCouponRequestCreation(externalCustomerId, appliedCouponId);
    }
    /**
     * Delete a customer
     * This endpoint deletes an existing customer.
     * <p><b>200</b> - Customer deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing customer
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroyCustomerRequestCreation(String externalId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalId' when calling destroyCustomer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("external_id", externalId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/customers/{external_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a customer
     * This endpoint deletes an existing customer.
     * <p><b>200</b> - Customer deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing customer
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> destroyCustomer(String externalId) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return destroyCustomerRequestCreation(externalId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a customer
     * This endpoint deletes an existing customer.
     * <p><b>200</b> - Customer deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing customer
     * @return ResponseEntity&lt;Customer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Customer>> destroyCustomerWithHttpInfo(String externalId) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return destroyCustomerRequestCreation(externalId).toEntity(localVarReturnType);
    }

    /**
     * Delete a customer
     * This endpoint deletes an existing customer.
     * <p><b>200</b> - Customer deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing customer
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroyCustomerWithResponseSpec(String externalId) throws WebClientResponseException {
        return destroyCustomerRequestCreation(externalId);
    }
    /**
     * Retrieve customer past usage
     * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
     * <p><b>200</b> - Customer past usage
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param externalSubscriptionId The unique identifier of the subscription within your application.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param billableMetricCode Billable metric code filter to apply to the charge usage
     * @param periodsCount Number of past billing period to returns in the result
     * @return CustomerPastUsage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllCustomerPastUsageRequestCreation(String externalCustomerId, String externalSubscriptionId, Integer page, Integer perPage, String billableMetricCode, Integer periodsCount) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalCustomerId' is set
        if (externalCustomerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalCustomerId' when calling findAllCustomerPastUsage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'externalSubscriptionId' is set
        if (externalSubscriptionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalSubscriptionId' when calling findAllCustomerPastUsage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("external_customer_id", externalCustomerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "external_subscription_id", externalSubscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "billable_metric_code", billableMetricCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "periods_count", periodsCount));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CustomerPastUsage> localVarReturnType = new ParameterizedTypeReference<CustomerPastUsage>() {};
        return apiClient.invokeAPI("/customers/{external_customer_id}/past_usage", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve customer past usage
     * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
     * <p><b>200</b> - Customer past usage
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param externalSubscriptionId The unique identifier of the subscription within your application.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param billableMetricCode Billable metric code filter to apply to the charge usage
     * @param periodsCount Number of past billing period to returns in the result
     * @return CustomerPastUsage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomerPastUsage> findAllCustomerPastUsage(String externalCustomerId, String externalSubscriptionId, Integer page, Integer perPage, String billableMetricCode, Integer periodsCount) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerPastUsage> localVarReturnType = new ParameterizedTypeReference<CustomerPastUsage>() {};
        return findAllCustomerPastUsageRequestCreation(externalCustomerId, externalSubscriptionId, page, perPage, billableMetricCode, periodsCount).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve customer past usage
     * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
     * <p><b>200</b> - Customer past usage
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param externalSubscriptionId The unique identifier of the subscription within your application.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param billableMetricCode Billable metric code filter to apply to the charge usage
     * @param periodsCount Number of past billing period to returns in the result
     * @return ResponseEntity&lt;CustomerPastUsage&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CustomerPastUsage>> findAllCustomerPastUsageWithHttpInfo(String externalCustomerId, String externalSubscriptionId, Integer page, Integer perPage, String billableMetricCode, Integer periodsCount) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerPastUsage> localVarReturnType = new ParameterizedTypeReference<CustomerPastUsage>() {};
        return findAllCustomerPastUsageRequestCreation(externalCustomerId, externalSubscriptionId, page, perPage, billableMetricCode, periodsCount).toEntity(localVarReturnType);
    }

    /**
     * Retrieve customer past usage
     * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
     * <p><b>200</b> - Customer past usage
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param externalSubscriptionId The unique identifier of the subscription within your application.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param billableMetricCode Billable metric code filter to apply to the charge usage
     * @param periodsCount Number of past billing period to returns in the result
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllCustomerPastUsageWithResponseSpec(String externalCustomerId, String externalSubscriptionId, Integer page, Integer perPage, String billableMetricCode, Integer periodsCount) throws WebClientResponseException {
        return findAllCustomerPastUsageRequestCreation(externalCustomerId, externalSubscriptionId, page, perPage, billableMetricCode, periodsCount);
    }
    /**
     * List all customers
     * This endpoint retrieves all existing customers.
     * <p><b>200</b> - List of customers
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return CustomersPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllCustomersRequestCreation(Integer page, Integer perPage) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CustomersPaginated> localVarReturnType = new ParameterizedTypeReference<CustomersPaginated>() {};
        return apiClient.invokeAPI("/customers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all customers
     * This endpoint retrieves all existing customers.
     * <p><b>200</b> - List of customers
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return CustomersPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomersPaginated> findAllCustomers(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<CustomersPaginated> localVarReturnType = new ParameterizedTypeReference<CustomersPaginated>() {};
        return findAllCustomersRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * List all customers
     * This endpoint retrieves all existing customers.
     * <p><b>200</b> - List of customers
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;CustomersPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CustomersPaginated>> findAllCustomersWithHttpInfo(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<CustomersPaginated> localVarReturnType = new ParameterizedTypeReference<CustomersPaginated>() {};
        return findAllCustomersRequestCreation(page, perPage).toEntity(localVarReturnType);
    }

    /**
     * List all customers
     * This endpoint retrieves all existing customers.
     * <p><b>200</b> - List of customers
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllCustomersWithResponseSpec(Integer page, Integer perPage) throws WebClientResponseException {
        return findAllCustomersRequestCreation(page, perPage);
    }
    /**
     * Retrieve a customer
     * This endpoint retrieves an existing customer.
     * <p><b>200</b> - Customer
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing customer
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findCustomerRequestCreation(String externalId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalId' when calling findCustomer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("external_id", externalId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/customers/{external_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a customer
     * This endpoint retrieves an existing customer.
     * <p><b>200</b> - Customer
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing customer
     * @return Customer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> findCustomer(String externalId) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return findCustomerRequestCreation(externalId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a customer
     * This endpoint retrieves an existing customer.
     * <p><b>200</b> - Customer
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing customer
     * @return ResponseEntity&lt;Customer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Customer>> findCustomerWithHttpInfo(String externalId) throws WebClientResponseException {
        ParameterizedTypeReference<Customer> localVarReturnType = new ParameterizedTypeReference<Customer>() {};
        return findCustomerRequestCreation(externalId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a customer
     * This endpoint retrieves an existing customer.
     * <p><b>200</b> - Customer
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing customer
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findCustomerWithResponseSpec(String externalId) throws WebClientResponseException {
        return findCustomerRequestCreation(externalId);
    }
    /**
     * Retrieve customer current usage
     * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
     * <p><b>200</b> - Customer usage
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param externalSubscriptionId The unique identifier of the subscription within your application.
     * @return CustomerUsage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findCustomerCurrentUsageRequestCreation(String externalCustomerId, String externalSubscriptionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalCustomerId' is set
        if (externalCustomerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalCustomerId' when calling findCustomerCurrentUsage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'externalSubscriptionId' is set
        if (externalSubscriptionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalSubscriptionId' when calling findCustomerCurrentUsage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("external_customer_id", externalCustomerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "external_subscription_id", externalSubscriptionId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CustomerUsage> localVarReturnType = new ParameterizedTypeReference<CustomerUsage>() {};
        return apiClient.invokeAPI("/customers/{external_customer_id}/current_usage", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve customer current usage
     * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
     * <p><b>200</b> - Customer usage
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param externalSubscriptionId The unique identifier of the subscription within your application.
     * @return CustomerUsage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomerUsage> findCustomerCurrentUsage(String externalCustomerId, String externalSubscriptionId) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerUsage> localVarReturnType = new ParameterizedTypeReference<CustomerUsage>() {};
        return findCustomerCurrentUsageRequestCreation(externalCustomerId, externalSubscriptionId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve customer current usage
     * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
     * <p><b>200</b> - Customer usage
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param externalSubscriptionId The unique identifier of the subscription within your application.
     * @return ResponseEntity&lt;CustomerUsage&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CustomerUsage>> findCustomerCurrentUsageWithHttpInfo(String externalCustomerId, String externalSubscriptionId) throws WebClientResponseException {
        ParameterizedTypeReference<CustomerUsage> localVarReturnType = new ParameterizedTypeReference<CustomerUsage>() {};
        return findCustomerCurrentUsageRequestCreation(externalCustomerId, externalSubscriptionId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve customer current usage
     * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
     * <p><b>200</b> - Customer usage
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param externalSubscriptionId The unique identifier of the subscription within your application.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findCustomerCurrentUsageWithResponseSpec(String externalCustomerId, String externalSubscriptionId) throws WebClientResponseException {
        return findCustomerCurrentUsageRequestCreation(externalCustomerId, externalSubscriptionId);
    }
    /**
     * Generate a Customer Payment Provider Checkout URL
     * This endpoint regenerates the Payment Provider Checkout URL of a Customer.
     * <p><b>200</b> - Customer Checkout URL
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @return GenerateCustomerCheckoutURL200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec generateCustomerCheckoutURLRequestCreation(String externalCustomerId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalCustomerId' is set
        if (externalCustomerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalCustomerId' when calling generateCustomerCheckoutURL", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("external_customer_id", externalCustomerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GenerateCustomerCheckoutURL200Response> localVarReturnType = new ParameterizedTypeReference<GenerateCustomerCheckoutURL200Response>() {};
        return apiClient.invokeAPI("/customers/{external_customer_id}/checkout_url", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a Customer Payment Provider Checkout URL
     * This endpoint regenerates the Payment Provider Checkout URL of a Customer.
     * <p><b>200</b> - Customer Checkout URL
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @return GenerateCustomerCheckoutURL200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GenerateCustomerCheckoutURL200Response> generateCustomerCheckoutURL(String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<GenerateCustomerCheckoutURL200Response> localVarReturnType = new ParameterizedTypeReference<GenerateCustomerCheckoutURL200Response>() {};
        return generateCustomerCheckoutURLRequestCreation(externalCustomerId).bodyToMono(localVarReturnType);
    }

    /**
     * Generate a Customer Payment Provider Checkout URL
     * This endpoint regenerates the Payment Provider Checkout URL of a Customer.
     * <p><b>200</b> - Customer Checkout URL
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @return ResponseEntity&lt;GenerateCustomerCheckoutURL200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GenerateCustomerCheckoutURL200Response>> generateCustomerCheckoutURLWithHttpInfo(String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<GenerateCustomerCheckoutURL200Response> localVarReturnType = new ParameterizedTypeReference<GenerateCustomerCheckoutURL200Response>() {};
        return generateCustomerCheckoutURLRequestCreation(externalCustomerId).toEntity(localVarReturnType);
    }

    /**
     * Generate a Customer Payment Provider Checkout URL
     * This endpoint regenerates the Payment Provider Checkout URL of a Customer.
     * <p><b>200</b> - Customer Checkout URL
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec generateCustomerCheckoutURLWithResponseSpec(String externalCustomerId) throws WebClientResponseException {
        return generateCustomerCheckoutURLRequestCreation(externalCustomerId);
    }
    /**
     * Get a customer portal URL
     * Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal
     * <p><b>200</b> - Portal URL
     * <p><b>401</b> - Unauthorized error
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId External ID of the existing customer
     * @return GetCustomerPortalUrl200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCustomerPortalUrlRequestCreation(String externalCustomerId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalCustomerId' is set
        if (externalCustomerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalCustomerId' when calling getCustomerPortalUrl", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("external_customer_id", externalCustomerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetCustomerPortalUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetCustomerPortalUrl200Response>() {};
        return apiClient.invokeAPI("/customers/{external_customer_id}/portal_url", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a customer portal URL
     * Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal
     * <p><b>200</b> - Portal URL
     * <p><b>401</b> - Unauthorized error
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId External ID of the existing customer
     * @return GetCustomerPortalUrl200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCustomerPortalUrl200Response> getCustomerPortalUrl(String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<GetCustomerPortalUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetCustomerPortalUrl200Response>() {};
        return getCustomerPortalUrlRequestCreation(externalCustomerId).bodyToMono(localVarReturnType);
    }

    /**
     * Get a customer portal URL
     * Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal
     * <p><b>200</b> - Portal URL
     * <p><b>401</b> - Unauthorized error
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId External ID of the existing customer
     * @return ResponseEntity&lt;GetCustomerPortalUrl200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetCustomerPortalUrl200Response>> getCustomerPortalUrlWithHttpInfo(String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<GetCustomerPortalUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetCustomerPortalUrl200Response>() {};
        return getCustomerPortalUrlRequestCreation(externalCustomerId).toEntity(localVarReturnType);
    }

    /**
     * Get a customer portal URL
     * Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal
     * <p><b>200</b> - Portal URL
     * <p><b>401</b> - Unauthorized error
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found error
     * @param externalCustomerId External ID of the existing customer
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCustomerPortalUrlWithResponseSpec(String externalCustomerId) throws WebClientResponseException {
        return getCustomerPortalUrlRequestCreation(externalCustomerId);
    }
}
