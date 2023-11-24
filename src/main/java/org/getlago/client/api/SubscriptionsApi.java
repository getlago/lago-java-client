package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionCreateInput;
import org.openapitools.client.model.SubscriptionUpdateInput;
import org.openapitools.client.model.SubscriptionsPaginated;

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
public class SubscriptionsApi {
    private ApiClient apiClient;

    public SubscriptionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Assign a plan to a customer
     * This endpoint assigns a plan to a customer, creating or modifying a subscription. Ideal for initial subscriptions or plan changes (upgrades/downgrades).
     * <p><b>200</b> - Subscription created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param subscriptionCreateInput Subscription payload
     * @return Subscription
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createSubscriptionRequestCreation(SubscriptionCreateInput subscriptionCreateInput) throws WebClientResponseException {
        Object postBody = subscriptionCreateInput;
        // verify the required parameter 'subscriptionCreateInput' is set
        if (subscriptionCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'subscriptionCreateInput' when calling createSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return apiClient.invokeAPI("/subscriptions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Assign a plan to a customer
     * This endpoint assigns a plan to a customer, creating or modifying a subscription. Ideal for initial subscriptions or plan changes (upgrades/downgrades).
     * <p><b>200</b> - Subscription created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param subscriptionCreateInput Subscription payload
     * @return Subscription
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Subscription> createSubscription(SubscriptionCreateInput subscriptionCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return createSubscriptionRequestCreation(subscriptionCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Assign a plan to a customer
     * This endpoint assigns a plan to a customer, creating or modifying a subscription. Ideal for initial subscriptions or plan changes (upgrades/downgrades).
     * <p><b>200</b> - Subscription created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param subscriptionCreateInput Subscription payload
     * @return ResponseEntity&lt;Subscription&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Subscription>> createSubscriptionWithHttpInfo(SubscriptionCreateInput subscriptionCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return createSubscriptionRequestCreation(subscriptionCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Assign a plan to a customer
     * This endpoint assigns a plan to a customer, creating or modifying a subscription. Ideal for initial subscriptions or plan changes (upgrades/downgrades).
     * <p><b>200</b> - Subscription created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param subscriptionCreateInput Subscription payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createSubscriptionWithResponseSpec(SubscriptionCreateInput subscriptionCreateInput) throws WebClientResponseException {
        return createSubscriptionRequestCreation(subscriptionCreateInput);
    }
    /**
     * Terminate a subscription
     * This endpoint allows you to terminate a subscription.
     * <p><b>200</b> - Subscription terminated
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param externalId External ID of the existing subscription
     * @param status If the field is not defined, Lago will terminate only &#x60;active&#x60; subscriptions. However, if you wish to cancel a &#x60;pending&#x60; subscription, please ensure that you include &#x60;status&#x3D;pending&#x60; in your request.
     * @return Subscription
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroySubscriptionRequestCreation(String externalId, String status) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalId' when calling destroySubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("external_id", externalId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return apiClient.invokeAPI("/subscriptions/{external_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Terminate a subscription
     * This endpoint allows you to terminate a subscription.
     * <p><b>200</b> - Subscription terminated
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param externalId External ID of the existing subscription
     * @param status If the field is not defined, Lago will terminate only &#x60;active&#x60; subscriptions. However, if you wish to cancel a &#x60;pending&#x60; subscription, please ensure that you include &#x60;status&#x3D;pending&#x60; in your request.
     * @return Subscription
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Subscription> destroySubscription(String externalId, String status) throws WebClientResponseException {
        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return destroySubscriptionRequestCreation(externalId, status).bodyToMono(localVarReturnType);
    }

    /**
     * Terminate a subscription
     * This endpoint allows you to terminate a subscription.
     * <p><b>200</b> - Subscription terminated
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param externalId External ID of the existing subscription
     * @param status If the field is not defined, Lago will terminate only &#x60;active&#x60; subscriptions. However, if you wish to cancel a &#x60;pending&#x60; subscription, please ensure that you include &#x60;status&#x3D;pending&#x60; in your request.
     * @return ResponseEntity&lt;Subscription&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Subscription>> destroySubscriptionWithHttpInfo(String externalId, String status) throws WebClientResponseException {
        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return destroySubscriptionRequestCreation(externalId, status).toEntity(localVarReturnType);
    }

    /**
     * Terminate a subscription
     * This endpoint allows you to terminate a subscription.
     * <p><b>200</b> - Subscription terminated
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param externalId External ID of the existing subscription
     * @param status If the field is not defined, Lago will terminate only &#x60;active&#x60; subscriptions. However, if you wish to cancel a &#x60;pending&#x60; subscription, please ensure that you include &#x60;status&#x3D;pending&#x60; in your request.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroySubscriptionWithResponseSpec(String externalId, String status) throws WebClientResponseException {
        return destroySubscriptionRequestCreation(externalId, status);
    }
    /**
     * List all subscriptions
     * This endpoint retrieves all active subscriptions.
     * <p><b>200</b> - List of subscriptions
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @param planCode The unique code representing the plan to be attached to the customer. This code must correspond to the code property of one of the active plans.
     * @param status If the field is not defined, Lago will return only &#x60;active&#x60; subscriptions. However, if you wish to fetch subscriptions by different status you can define them in a status[] query param. Available filter values: &#x60;pending&#x60;, &#x60;canceled&#x60;, &#x60;terminated&#x60;, &#x60;active&#x60;.
     * @return SubscriptionsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllSubscriptionsRequestCreation(Integer page, Integer perPage, String externalCustomerId, String planCode, List<String> status) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "external_customer_id", externalCustomerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "plan_code", planCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<SubscriptionsPaginated> localVarReturnType = new ParameterizedTypeReference<SubscriptionsPaginated>() {};
        return apiClient.invokeAPI("/subscriptions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all subscriptions
     * This endpoint retrieves all active subscriptions.
     * <p><b>200</b> - List of subscriptions
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @param planCode The unique code representing the plan to be attached to the customer. This code must correspond to the code property of one of the active plans.
     * @param status If the field is not defined, Lago will return only &#x60;active&#x60; subscriptions. However, if you wish to fetch subscriptions by different status you can define them in a status[] query param. Available filter values: &#x60;pending&#x60;, &#x60;canceled&#x60;, &#x60;terminated&#x60;, &#x60;active&#x60;.
     * @return SubscriptionsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SubscriptionsPaginated> findAllSubscriptions(Integer page, Integer perPage, String externalCustomerId, String planCode, List<String> status) throws WebClientResponseException {
        ParameterizedTypeReference<SubscriptionsPaginated> localVarReturnType = new ParameterizedTypeReference<SubscriptionsPaginated>() {};
        return findAllSubscriptionsRequestCreation(page, perPage, externalCustomerId, planCode, status).bodyToMono(localVarReturnType);
    }

    /**
     * List all subscriptions
     * This endpoint retrieves all active subscriptions.
     * <p><b>200</b> - List of subscriptions
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @param planCode The unique code representing the plan to be attached to the customer. This code must correspond to the code property of one of the active plans.
     * @param status If the field is not defined, Lago will return only &#x60;active&#x60; subscriptions. However, if you wish to fetch subscriptions by different status you can define them in a status[] query param. Available filter values: &#x60;pending&#x60;, &#x60;canceled&#x60;, &#x60;terminated&#x60;, &#x60;active&#x60;.
     * @return ResponseEntity&lt;SubscriptionsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SubscriptionsPaginated>> findAllSubscriptionsWithHttpInfo(Integer page, Integer perPage, String externalCustomerId, String planCode, List<String> status) throws WebClientResponseException {
        ParameterizedTypeReference<SubscriptionsPaginated> localVarReturnType = new ParameterizedTypeReference<SubscriptionsPaginated>() {};
        return findAllSubscriptionsRequestCreation(page, perPage, externalCustomerId, planCode, status).toEntity(localVarReturnType);
    }

    /**
     * List all subscriptions
     * This endpoint retrieves all active subscriptions.
     * <p><b>200</b> - List of subscriptions
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId The customer external unique identifier (provided by your own application)
     * @param planCode The unique code representing the plan to be attached to the customer. This code must correspond to the code property of one of the active plans.
     * @param status If the field is not defined, Lago will return only &#x60;active&#x60; subscriptions. However, if you wish to fetch subscriptions by different status you can define them in a status[] query param. Available filter values: &#x60;pending&#x60;, &#x60;canceled&#x60;, &#x60;terminated&#x60;, &#x60;active&#x60;.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllSubscriptionsWithResponseSpec(Integer page, Integer perPage, String externalCustomerId, String planCode, List<String> status) throws WebClientResponseException {
        return findAllSubscriptionsRequestCreation(page, perPage, externalCustomerId, planCode, status);
    }
    /**
     * Retrieve a subscription
     * This endpoint retrieves a specific subscription.
     * <p><b>200</b> - Subscription
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing subscription
     * @return Subscription
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findSubscriptionRequestCreation(String externalId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalId' when calling findSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return apiClient.invokeAPI("/subscriptions/{external_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a subscription
     * This endpoint retrieves a specific subscription.
     * <p><b>200</b> - Subscription
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing subscription
     * @return Subscription
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Subscription> findSubscription(String externalId) throws WebClientResponseException {
        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return findSubscriptionRequestCreation(externalId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a subscription
     * This endpoint retrieves a specific subscription.
     * <p><b>200</b> - Subscription
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing subscription
     * @return ResponseEntity&lt;Subscription&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Subscription>> findSubscriptionWithHttpInfo(String externalId) throws WebClientResponseException {
        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return findSubscriptionRequestCreation(externalId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a subscription
     * This endpoint retrieves a specific subscription.
     * <p><b>200</b> - Subscription
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param externalId External ID of the existing subscription
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findSubscriptionWithResponseSpec(String externalId) throws WebClientResponseException {
        return findSubscriptionRequestCreation(externalId);
    }
    /**
     * Update a subscription
     * This endpoint allows you to update a subscription.
     * <p><b>200</b> - Subscription updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalId External ID of the existing subscription
     * @param subscriptionUpdateInput Update an existing subscription
     * @return Subscription
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateSubscriptionRequestCreation(String externalId, SubscriptionUpdateInput subscriptionUpdateInput) throws WebClientResponseException {
        Object postBody = subscriptionUpdateInput;
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalId' when calling updateSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'subscriptionUpdateInput' is set
        if (subscriptionUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'subscriptionUpdateInput' when calling updateSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return apiClient.invokeAPI("/subscriptions/{external_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a subscription
     * This endpoint allows you to update a subscription.
     * <p><b>200</b> - Subscription updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalId External ID of the existing subscription
     * @param subscriptionUpdateInput Update an existing subscription
     * @return Subscription
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Subscription> updateSubscription(String externalId, SubscriptionUpdateInput subscriptionUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return updateSubscriptionRequestCreation(externalId, subscriptionUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a subscription
     * This endpoint allows you to update a subscription.
     * <p><b>200</b> - Subscription updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalId External ID of the existing subscription
     * @param subscriptionUpdateInput Update an existing subscription
     * @return ResponseEntity&lt;Subscription&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Subscription>> updateSubscriptionWithHttpInfo(String externalId, SubscriptionUpdateInput subscriptionUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Subscription> localVarReturnType = new ParameterizedTypeReference<Subscription>() {};
        return updateSubscriptionRequestCreation(externalId, subscriptionUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a subscription
     * This endpoint allows you to update a subscription.
     * <p><b>200</b> - Subscription updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param externalId External ID of the existing subscription
     * @param subscriptionUpdateInput Update an existing subscription
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateSubscriptionWithResponseSpec(String externalId, SubscriptionUpdateInput subscriptionUpdateInput) throws WebClientResponseException {
        return updateSubscriptionRequestCreation(externalId, subscriptionUpdateInput);
    }
}
