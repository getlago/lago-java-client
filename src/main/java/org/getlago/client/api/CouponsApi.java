package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.AppliedCoupon;
import org.openapitools.client.model.AppliedCouponInput;
import org.openapitools.client.model.AppliedCouponsPaginated;
import org.openapitools.client.model.Coupon;
import org.openapitools.client.model.CouponCreateInput;
import org.openapitools.client.model.CouponUpdateInput;
import org.openapitools.client.model.CouponsPaginated;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class CouponsApi {
    private ApiClient apiClient;

    public CouponsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CouponsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply a coupon to a customer
     * This endpoint is used to apply a specific coupon to a customer, before or during a subscription.
     * <p><b>200</b> - Coupon applied
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param appliedCouponInput Apply coupon payload
     * @return AppliedCoupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec applyCouponRequestCreation(AppliedCouponInput appliedCouponInput) throws WebClientResponseException {
        Object postBody = appliedCouponInput;
        // verify the required parameter 'appliedCouponInput' is set
        if (appliedCouponInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'appliedCouponInput' when calling applyCoupon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AppliedCoupon> localVarReturnType = new ParameterizedTypeReference<AppliedCoupon>() {};
        return apiClient.invokeAPI("/applied_coupons", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Apply a coupon to a customer
     * This endpoint is used to apply a specific coupon to a customer, before or during a subscription.
     * <p><b>200</b> - Coupon applied
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param appliedCouponInput Apply coupon payload
     * @return AppliedCoupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AppliedCoupon> applyCoupon(AppliedCouponInput appliedCouponInput) throws WebClientResponseException {
        ParameterizedTypeReference<AppliedCoupon> localVarReturnType = new ParameterizedTypeReference<AppliedCoupon>() {};
        return applyCouponRequestCreation(appliedCouponInput).bodyToMono(localVarReturnType);
    }

    /**
     * Apply a coupon to a customer
     * This endpoint is used to apply a specific coupon to a customer, before or during a subscription.
     * <p><b>200</b> - Coupon applied
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param appliedCouponInput Apply coupon payload
     * @return ResponseEntity&lt;AppliedCoupon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AppliedCoupon>> applyCouponWithHttpInfo(AppliedCouponInput appliedCouponInput) throws WebClientResponseException {
        ParameterizedTypeReference<AppliedCoupon> localVarReturnType = new ParameterizedTypeReference<AppliedCoupon>() {};
        return applyCouponRequestCreation(appliedCouponInput).toEntity(localVarReturnType);
    }

    /**
     * Apply a coupon to a customer
     * This endpoint is used to apply a specific coupon to a customer, before or during a subscription.
     * <p><b>200</b> - Coupon applied
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param appliedCouponInput Apply coupon payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec applyCouponWithResponseSpec(AppliedCouponInput appliedCouponInput) throws WebClientResponseException {
        return applyCouponRequestCreation(appliedCouponInput);
    }
    /**
     * Create a coupon
     * This endpoint is used to create a coupon that can be then attached to a customer to create a discount.
     * <p><b>200</b> - Coupon created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param couponCreateInput Coupon payload
     * @return Coupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createCouponRequestCreation(CouponCreateInput couponCreateInput) throws WebClientResponseException {
        Object postBody = couponCreateInput;
        // verify the required parameter 'couponCreateInput' is set
        if (couponCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'couponCreateInput' when calling createCoupon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return apiClient.invokeAPI("/coupons", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a coupon
     * This endpoint is used to create a coupon that can be then attached to a customer to create a discount.
     * <p><b>200</b> - Coupon created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param couponCreateInput Coupon payload
     * @return Coupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Coupon> createCoupon(CouponCreateInput couponCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return createCouponRequestCreation(couponCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a coupon
     * This endpoint is used to create a coupon that can be then attached to a customer to create a discount.
     * <p><b>200</b> - Coupon created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param couponCreateInput Coupon payload
     * @return ResponseEntity&lt;Coupon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Coupon>> createCouponWithHttpInfo(CouponCreateInput couponCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return createCouponRequestCreation(couponCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a coupon
     * This endpoint is used to create a coupon that can be then attached to a customer to create a discount.
     * <p><b>200</b> - Coupon created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param couponCreateInput Coupon payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createCouponWithResponseSpec(CouponCreateInput couponCreateInput) throws WebClientResponseException {
        return createCouponRequestCreation(couponCreateInput);
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
     * Delete a coupon
     * This endpoint is used to delete a coupon.
     * <p><b>200</b> - Coupon deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the coupon.
     * @return Coupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroyCouponRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling destroyCoupon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("code", code);

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

        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return apiClient.invokeAPI("/coupons/{code}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a coupon
     * This endpoint is used to delete a coupon.
     * <p><b>200</b> - Coupon deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the coupon.
     * @return Coupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Coupon> destroyCoupon(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return destroyCouponRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a coupon
     * This endpoint is used to delete a coupon.
     * <p><b>200</b> - Coupon deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the coupon.
     * @return ResponseEntity&lt;Coupon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Coupon>> destroyCouponWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return destroyCouponRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Delete a coupon
     * This endpoint is used to delete a coupon.
     * <p><b>200</b> - Coupon deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the coupon.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroyCouponWithResponseSpec(String code) throws WebClientResponseException {
        return destroyCouponRequestCreation(code);
    }
    /**
     * List all applied coupons
     * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
     * <p><b>200</b> - Applied Coupons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param status The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;.
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @return AppliedCouponsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllAppliedCouponsRequestCreation(Integer page, Integer perPage, String status, String externalCustomerId) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "external_customer_id", externalCustomerId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AppliedCouponsPaginated> localVarReturnType = new ParameterizedTypeReference<AppliedCouponsPaginated>() {};
        return apiClient.invokeAPI("/applied_coupons", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all applied coupons
     * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
     * <p><b>200</b> - Applied Coupons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param status The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;.
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @return AppliedCouponsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AppliedCouponsPaginated> findAllAppliedCoupons(Integer page, Integer perPage, String status, String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<AppliedCouponsPaginated> localVarReturnType = new ParameterizedTypeReference<AppliedCouponsPaginated>() {};
        return findAllAppliedCouponsRequestCreation(page, perPage, status, externalCustomerId).bodyToMono(localVarReturnType);
    }

    /**
     * List all applied coupons
     * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
     * <p><b>200</b> - Applied Coupons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param status The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;.
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @return ResponseEntity&lt;AppliedCouponsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AppliedCouponsPaginated>> findAllAppliedCouponsWithHttpInfo(Integer page, Integer perPage, String status, String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<AppliedCouponsPaginated> localVarReturnType = new ParameterizedTypeReference<AppliedCouponsPaginated>() {};
        return findAllAppliedCouponsRequestCreation(page, perPage, status, externalCustomerId).toEntity(localVarReturnType);
    }

    /**
     * List all applied coupons
     * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
     * <p><b>200</b> - Applied Coupons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param status The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;.
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllAppliedCouponsWithResponseSpec(Integer page, Integer perPage, String status, String externalCustomerId) throws WebClientResponseException {
        return findAllAppliedCouponsRequestCreation(page, perPage, status, externalCustomerId);
    }
    /**
     * List all coupons
     * This endpoint is used to list all existing coupons.
     * <p><b>200</b> - Coupons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return CouponsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllCouponsRequestCreation(Integer page, Integer perPage) throws WebClientResponseException {
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

        ParameterizedTypeReference<CouponsPaginated> localVarReturnType = new ParameterizedTypeReference<CouponsPaginated>() {};
        return apiClient.invokeAPI("/coupons", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all coupons
     * This endpoint is used to list all existing coupons.
     * <p><b>200</b> - Coupons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return CouponsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CouponsPaginated> findAllCoupons(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<CouponsPaginated> localVarReturnType = new ParameterizedTypeReference<CouponsPaginated>() {};
        return findAllCouponsRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * List all coupons
     * This endpoint is used to list all existing coupons.
     * <p><b>200</b> - Coupons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;CouponsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CouponsPaginated>> findAllCouponsWithHttpInfo(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<CouponsPaginated> localVarReturnType = new ParameterizedTypeReference<CouponsPaginated>() {};
        return findAllCouponsRequestCreation(page, perPage).toEntity(localVarReturnType);
    }

    /**
     * List all coupons
     * This endpoint is used to list all existing coupons.
     * <p><b>200</b> - Coupons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllCouponsWithResponseSpec(Integer page, Integer perPage) throws WebClientResponseException {
        return findAllCouponsRequestCreation(page, perPage);
    }
    /**
     * Retrieve a coupon
     * This endpoint is used to retrieve a specific coupon.
     * <p><b>200</b> - Coupon
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the coupon.
     * @return Coupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findCouponRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling findCoupon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("code", code);

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

        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return apiClient.invokeAPI("/coupons/{code}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a coupon
     * This endpoint is used to retrieve a specific coupon.
     * <p><b>200</b> - Coupon
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the coupon.
     * @return Coupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Coupon> findCoupon(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return findCouponRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a coupon
     * This endpoint is used to retrieve a specific coupon.
     * <p><b>200</b> - Coupon
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the coupon.
     * @return ResponseEntity&lt;Coupon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Coupon>> findCouponWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return findCouponRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a coupon
     * This endpoint is used to retrieve a specific coupon.
     * <p><b>200</b> - Coupon
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the coupon.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findCouponWithResponseSpec(String code) throws WebClientResponseException {
        return findCouponRequestCreation(code);
    }
    /**
     * Update a coupon
     * This endpoint is used to update a coupon that can be then attached to a customer to create a discount.
     * <p><b>200</b> - Coupon updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Unique code used to identify the coupon.
     * @param couponUpdateInput Coupon payload
     * @return Coupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateCouponRequestCreation(String code, CouponUpdateInput couponUpdateInput) throws WebClientResponseException {
        Object postBody = couponUpdateInput;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling updateCoupon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'couponUpdateInput' is set
        if (couponUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'couponUpdateInput' when calling updateCoupon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("code", code);

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

        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return apiClient.invokeAPI("/coupons/{code}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a coupon
     * This endpoint is used to update a coupon that can be then attached to a customer to create a discount.
     * <p><b>200</b> - Coupon updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Unique code used to identify the coupon.
     * @param couponUpdateInput Coupon payload
     * @return Coupon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Coupon> updateCoupon(String code, CouponUpdateInput couponUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return updateCouponRequestCreation(code, couponUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a coupon
     * This endpoint is used to update a coupon that can be then attached to a customer to create a discount.
     * <p><b>200</b> - Coupon updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Unique code used to identify the coupon.
     * @param couponUpdateInput Coupon payload
     * @return ResponseEntity&lt;Coupon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Coupon>> updateCouponWithHttpInfo(String code, CouponUpdateInput couponUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Coupon> localVarReturnType = new ParameterizedTypeReference<Coupon>() {};
        return updateCouponRequestCreation(code, couponUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a coupon
     * This endpoint is used to update a coupon that can be then attached to a customer to create a discount.
     * <p><b>200</b> - Coupon updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Unique code used to identify the coupon.
     * @param couponUpdateInput Coupon payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateCouponWithResponseSpec(String code, CouponUpdateInput couponUpdateInput) throws WebClientResponseException {
        return updateCouponRequestCreation(code, couponUpdateInput);
    }
}
