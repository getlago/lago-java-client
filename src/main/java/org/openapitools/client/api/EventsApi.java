/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.32.0-beta
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


import org.openapitools.client.model.ApiResponseBadRequest;
import org.openapitools.client.model.ApiResponseNotFound;
import org.openapitools.client.model.ApiResponseUnauthorized;
import org.openapitools.client.model.ApiResponseUnprocessableEntity;
import org.openapitools.client.model.BatchEventInput;
import org.openapitools.client.model.Event;
import org.openapitools.client.model.EventEstimateFeesInput;
import org.openapitools.client.model.EventInput;
import org.openapitools.client.model.Fees;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EventsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApi(ApiClient apiClient) {
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
     * Build call for createBatchEvents
     * @param batchEventInput Batch events payload (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBatchEventsCall(BatchEventInput batchEventInput, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = batchEventInput;

        // create path and map variables
        String localVarPath = "/events/batch";

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
    private okhttp3.Call createBatchEventsValidateBeforeCall(BatchEventInput batchEventInput, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'batchEventInput' is set
        if (batchEventInput == null) {
            throw new ApiException("Missing the required parameter 'batchEventInput' when calling createBatchEvents(Async)");
        }

        return createBatchEventsCall(batchEventInput, _callback);

    }

    /**
     * Create batch events
     * Create batch events
     * @param batchEventInput Batch events payload (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public void createBatchEvents(BatchEventInput batchEventInput) throws ApiException {
        createBatchEventsWithHttpInfo(batchEventInput);
    }

    /**
     * Create batch events
     * Create batch events
     * @param batchEventInput Batch events payload (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> createBatchEventsWithHttpInfo(BatchEventInput batchEventInput) throws ApiException {
        okhttp3.Call localVarCall = createBatchEventsValidateBeforeCall(batchEventInput, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Create batch events (asynchronously)
     * Create batch events
     * @param batchEventInput Batch events payload (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBatchEventsAsync(BatchEventInput batchEventInput, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBatchEventsValidateBeforeCall(batchEventInput, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for createEvent
     * @param eventInput Event payload (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEventCall(EventInput eventInput, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = eventInput;

        // create path and map variables
        String localVarPath = "/events";

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
    private okhttp3.Call createEventValidateBeforeCall(EventInput eventInput, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'eventInput' is set
        if (eventInput == null) {
            throw new ApiException("Missing the required parameter 'eventInput' when calling createEvent(Async)");
        }

        return createEventCall(eventInput, _callback);

    }

    /**
     * Create a new event
     * Create a new event
     * @param eventInput Event payload (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public void createEvent(EventInput eventInput) throws ApiException {
        createEventWithHttpInfo(eventInput);
    }

    /**
     * Create a new event
     * Create a new event
     * @param eventInput Event payload (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> createEventWithHttpInfo(EventInput eventInput) throws ApiException {
        okhttp3.Call localVarCall = createEventValidateBeforeCall(eventInput, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Create a new event (asynchronously)
     * Create a new event
     * @param eventInput Event payload (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEventAsync(EventInput eventInput, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createEventValidateBeforeCall(eventInput, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for eventEstimateFees
     * @param eventEstimateFeesInput Event payload for instant fee estimate (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call eventEstimateFeesCall(EventEstimateFeesInput eventEstimateFeesInput, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = eventEstimateFeesInput;

        // create path and map variables
        String localVarPath = "/events/estimate_fees";

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
    private okhttp3.Call eventEstimateFeesValidateBeforeCall(EventEstimateFeesInput eventEstimateFeesInput, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'eventEstimateFeesInput' is set
        if (eventEstimateFeesInput == null) {
            throw new ApiException("Missing the required parameter 'eventEstimateFeesInput' when calling eventEstimateFees(Async)");
        }

        return eventEstimateFeesCall(eventEstimateFeesInput, _callback);

    }

    /**
     * Estimate fees for an instant charge
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple instant charges
     * @param eventEstimateFeesInput Event payload for instant fee estimate (required)
     * @return Fees
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public Fees eventEstimateFees(EventEstimateFeesInput eventEstimateFeesInput) throws ApiException {
        ApiResponse<Fees> localVarResp = eventEstimateFeesWithHttpInfo(eventEstimateFeesInput);
        return localVarResp.getData();
    }

    /**
     * Estimate fees for an instant charge
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple instant charges
     * @param eventEstimateFeesInput Event payload for instant fee estimate (required)
     * @return ApiResponse&lt;Fees&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Fees> eventEstimateFeesWithHttpInfo(EventEstimateFeesInput eventEstimateFeesInput) throws ApiException {
        okhttp3.Call localVarCall = eventEstimateFeesValidateBeforeCall(eventEstimateFeesInput, null);
        Type localVarReturnType = new TypeToken<Fees>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Estimate fees for an instant charge (asynchronously)
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple instant charges
     * @param eventEstimateFeesInput Event payload for instant fee estimate (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call eventEstimateFeesAsync(EventEstimateFeesInput eventEstimateFeesInput, final ApiCallback<Fees> _callback) throws ApiException {

        okhttp3.Call localVarCall = eventEstimateFeesValidateBeforeCall(eventEstimateFeesInput, _callback);
        Type localVarReturnType = new TypeToken<Fees>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findEvent
     * @param id Id of the existing transaction (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findEventCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/events/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call findEventValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findEvent(Async)");
        }

        return findEventCall(id, _callback);

    }

    /**
     * Find event by transaction ID
     * Return a single event
     * @param id Id of the existing transaction (required)
     * @return Event
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public Event findEvent(String id) throws ApiException {
        ApiResponse<Event> localVarResp = findEventWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Find event by transaction ID
     * Return a single event
     * @param id Id of the existing transaction (required)
     * @return ApiResponse&lt;Event&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Event> findEventWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = findEventValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Find event by transaction ID (asynchronously)
     * Return a single event
     * @param id Id of the existing transaction (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findEventAsync(String id, final ApiCallback<Event> _callback) throws ApiException {

        okhttp3.Call localVarCall = findEventValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
