/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.46.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.CreateWebhookEndpoint200Response;
import org.openapitools.client.model.CreateWebhookEndpointRequest;
import org.openapitools.client.model.FindAllWebhookEndpoints200Response;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhookEndpointsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WebhookEndpointsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookEndpointsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createWebhookEndpoint
     * @param createWebhookEndpointRequest Webhook Endpoint payload (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createWebhookEndpointCall(CreateWebhookEndpointRequest createWebhookEndpointRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createWebhookEndpointRequest;

        // create path and map variables
        String localVarPath = "/webhook_endpoints";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createWebhookEndpointValidateBeforeCall(CreateWebhookEndpointRequest createWebhookEndpointRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createWebhookEndpointRequest' is set
        if (createWebhookEndpointRequest == null) {
            throw new ApiException("Missing the required parameter 'createWebhookEndpointRequest' when calling createWebhookEndpoint(Async)");
        }

        return createWebhookEndpointCall(createWebhookEndpointRequest, _callback);

    }

    /**
     * Create a webhook_endpoint
     * This endpoint is used to create a webhook endpoint.
     * @param createWebhookEndpointRequest Webhook Endpoint payload (required)
     * @return CreateWebhookEndpoint200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public CreateWebhookEndpoint200Response createWebhookEndpoint(CreateWebhookEndpointRequest createWebhookEndpointRequest) throws ApiException {
        ApiResponse<CreateWebhookEndpoint200Response> localVarResp = createWebhookEndpointWithHttpInfo(createWebhookEndpointRequest);
        return localVarResp.getData();
    }

    /**
     * Create a webhook_endpoint
     * This endpoint is used to create a webhook endpoint.
     * @param createWebhookEndpointRequest Webhook Endpoint payload (required)
     * @return ApiResponse&lt;CreateWebhookEndpoint200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateWebhookEndpoint200Response> createWebhookEndpointWithHttpInfo(CreateWebhookEndpointRequest createWebhookEndpointRequest) throws ApiException {
        okhttp3.Call localVarCall = createWebhookEndpointValidateBeforeCall(createWebhookEndpointRequest, null);
        Type localVarReturnType = new TypeToken<CreateWebhookEndpoint200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a webhook_endpoint (asynchronously)
     * This endpoint is used to create a webhook endpoint.
     * @param createWebhookEndpointRequest Webhook Endpoint payload (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createWebhookEndpointAsync(CreateWebhookEndpointRequest createWebhookEndpointRequest, final ApiCallback<CreateWebhookEndpoint200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createWebhookEndpointValidateBeforeCall(createWebhookEndpointRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateWebhookEndpoint200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for destroyWebhookEndpoint
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Not Allowed error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyWebhookEndpointCall(UUID lagoId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhook_endpoints/{lago_id}"
            .replace("{" + "lago_id" + "}", localVarApiClient.escapeString(lagoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call destroyWebhookEndpointValidateBeforeCall(UUID lagoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new ApiException("Missing the required parameter 'lagoId' when calling destroyWebhookEndpoint(Async)");
        }

        return destroyWebhookEndpointCall(lagoId, _callback);

    }

    /**
     * Delete a webhook endpoint
     * This endpoint is used to delete an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Not Allowed error </td><td>  -  </td></tr>
     </table>
     */
    public Object destroyWebhookEndpoint(UUID lagoId) throws ApiException {
        ApiResponse<Object> localVarResp = destroyWebhookEndpointWithHttpInfo(lagoId);
        return localVarResp.getData();
    }

    /**
     * Delete a webhook endpoint
     * This endpoint is used to delete an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Not Allowed error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> destroyWebhookEndpointWithHttpInfo(UUID lagoId) throws ApiException {
        okhttp3.Call localVarCall = destroyWebhookEndpointValidateBeforeCall(lagoId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a webhook endpoint (asynchronously)
     * This endpoint is used to delete an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Not Allowed error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyWebhookEndpointAsync(UUID lagoId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = destroyWebhookEndpointValidateBeforeCall(lagoId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findAllWebhookEndpoints
     * @param page Page number. (optional)
     * @param perPage Number of records per page. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> WebhookEndpoints </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findAllWebhookEndpointsCall(Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhook_endpoints";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findAllWebhookEndpointsValidateBeforeCall(Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        return findAllWebhookEndpointsCall(page, perPage, _callback);

    }

    /**
     * List all webhook endpoints
     * This endpoint is used to list all webhook endpoints.
     * @param page Page number. (optional)
     * @param perPage Number of records per page. (optional)
     * @return FindAllWebhookEndpoints200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> WebhookEndpoints </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
     </table>
     */
    public FindAllWebhookEndpoints200Response findAllWebhookEndpoints(Integer page, Integer perPage) throws ApiException {
        ApiResponse<FindAllWebhookEndpoints200Response> localVarResp = findAllWebhookEndpointsWithHttpInfo(page, perPage);
        return localVarResp.getData();
    }

    /**
     * List all webhook endpoints
     * This endpoint is used to list all webhook endpoints.
     * @param page Page number. (optional)
     * @param perPage Number of records per page. (optional)
     * @return ApiResponse&lt;FindAllWebhookEndpoints200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> WebhookEndpoints </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FindAllWebhookEndpoints200Response> findAllWebhookEndpointsWithHttpInfo(Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = findAllWebhookEndpointsValidateBeforeCall(page, perPage, null);
        Type localVarReturnType = new TypeToken<FindAllWebhookEndpoints200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all webhook endpoints (asynchronously)
     * This endpoint is used to list all webhook endpoints.
     * @param page Page number. (optional)
     * @param perPage Number of records per page. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> WebhookEndpoints </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findAllWebhookEndpointsAsync(Integer page, Integer perPage, final ApiCallback<FindAllWebhookEndpoints200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = findAllWebhookEndpointsValidateBeforeCall(page, perPage, _callback);
        Type localVarReturnType = new TypeToken<FindAllWebhookEndpoints200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findWebhookEndpoint
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> WebhookEndpoint </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findWebhookEndpointCall(UUID lagoId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhook_endpoints/{lago_id}"
            .replace("{" + "lago_id" + "}", localVarApiClient.escapeString(lagoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findWebhookEndpointValidateBeforeCall(UUID lagoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new ApiException("Missing the required parameter 'lagoId' when calling findWebhookEndpoint(Async)");
        }

        return findWebhookEndpointCall(lagoId, _callback);

    }

    /**
     * Retrieve a webhook endpoint
     * This endpoint is used to retrieve an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> WebhookEndpoint </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public Object findWebhookEndpoint(UUID lagoId) throws ApiException {
        ApiResponse<Object> localVarResp = findWebhookEndpointWithHttpInfo(lagoId);
        return localVarResp.getData();
    }

    /**
     * Retrieve a webhook endpoint
     * This endpoint is used to retrieve an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> WebhookEndpoint </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> findWebhookEndpointWithHttpInfo(UUID lagoId) throws ApiException {
        okhttp3.Call localVarCall = findWebhookEndpointValidateBeforeCall(lagoId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a webhook endpoint (asynchronously)
     * This endpoint is used to retrieve an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> WebhookEndpoint </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findWebhookEndpointAsync(UUID lagoId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = findWebhookEndpointValidateBeforeCall(lagoId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateWebhookEndpoint
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @param createWebhookEndpointRequest Webhook Endpoint update payload (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateWebhookEndpointCall(UUID lagoId, CreateWebhookEndpointRequest createWebhookEndpointRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createWebhookEndpointRequest;

        // create path and map variables
        String localVarPath = "/webhook_endpoints/{lago_id}"
            .replace("{" + "lago_id" + "}", localVarApiClient.escapeString(lagoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateWebhookEndpointValidateBeforeCall(UUID lagoId, CreateWebhookEndpointRequest createWebhookEndpointRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new ApiException("Missing the required parameter 'lagoId' when calling updateWebhookEndpoint(Async)");
        }

        // verify the required parameter 'createWebhookEndpointRequest' is set
        if (createWebhookEndpointRequest == null) {
            throw new ApiException("Missing the required parameter 'createWebhookEndpointRequest' when calling updateWebhookEndpoint(Async)");
        }

        return updateWebhookEndpointCall(lagoId, createWebhookEndpointRequest, _callback);

    }

    /**
     * Update a webhook endpoint
     * This endpoint is used to update an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @param createWebhookEndpointRequest Webhook Endpoint update payload (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public Object updateWebhookEndpoint(UUID lagoId, CreateWebhookEndpointRequest createWebhookEndpointRequest) throws ApiException {
        ApiResponse<Object> localVarResp = updateWebhookEndpointWithHttpInfo(lagoId, createWebhookEndpointRequest);
        return localVarResp.getData();
    }

    /**
     * Update a webhook endpoint
     * This endpoint is used to update an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @param createWebhookEndpointRequest Webhook Endpoint update payload (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> updateWebhookEndpointWithHttpInfo(UUID lagoId, CreateWebhookEndpointRequest createWebhookEndpointRequest) throws ApiException {
        okhttp3.Call localVarCall = updateWebhookEndpointValidateBeforeCall(lagoId, createWebhookEndpointRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a webhook endpoint (asynchronously)
     * This endpoint is used to update an existing webhook endpoint.
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
     * @param createWebhookEndpointRequest Webhook Endpoint update payload (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook Endpoint updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateWebhookEndpointAsync(UUID lagoId, CreateWebhookEndpointRequest createWebhookEndpointRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateWebhookEndpointValidateBeforeCall(lagoId, createWebhookEndpointRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
