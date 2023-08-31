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
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Tax;
import org.openapitools.client.model.TaxCreateInput;
import org.openapitools.client.model.TaxUpdateInput;
import org.openapitools.client.model.TaxesPaginated;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TaxesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaxesApi(ApiClient apiClient) {
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
     * Build call for createTax
     * @param taxCreateInput Tax creation payload (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTaxCall(TaxCreateInput taxCreateInput, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = taxCreateInput;

        // create path and map variables
        String localVarPath = "/taxes";

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
    private okhttp3.Call createTaxValidateBeforeCall(TaxCreateInput taxCreateInput, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'taxCreateInput' is set
        if (taxCreateInput == null) {
            throw new ApiException("Missing the required parameter 'taxCreateInput' when calling createTax(Async)");
        }

        return createTaxCall(taxCreateInput, _callback);

    }

    /**
     * Create a tax
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param taxCreateInput Tax creation payload (required)
     * @return Tax
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public Tax createTax(TaxCreateInput taxCreateInput) throws ApiException {
        ApiResponse<Tax> localVarResp = createTaxWithHttpInfo(taxCreateInput);
        return localVarResp.getData();
    }

    /**
     * Create a tax
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param taxCreateInput Tax creation payload (required)
     * @return ApiResponse&lt;Tax&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tax> createTaxWithHttpInfo(TaxCreateInput taxCreateInput) throws ApiException {
        okhttp3.Call localVarCall = createTaxValidateBeforeCall(taxCreateInput, null);
        Type localVarReturnType = new TypeToken<Tax>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a tax (asynchronously)
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param taxCreateInput Tax creation payload (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTaxAsync(TaxCreateInput taxCreateInput, final ApiCallback<Tax> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTaxValidateBeforeCall(taxCreateInput, _callback);
        Type localVarReturnType = new TypeToken<Tax>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for destroyTax
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyTaxCall(String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/taxes/{code}"
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call destroyTaxValidateBeforeCall(String code, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling destroyTax(Async)");
        }

        return destroyTaxCall(code, _callback);

    }

    /**
     * Delete a tax
     * This endpoint is used to delete a tax.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @return Tax
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public Tax destroyTax(String code) throws ApiException {
        ApiResponse<Tax> localVarResp = destroyTaxWithHttpInfo(code);
        return localVarResp.getData();
    }

    /**
     * Delete a tax
     * This endpoint is used to delete a tax.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @return ApiResponse&lt;Tax&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tax> destroyTaxWithHttpInfo(String code) throws ApiException {
        okhttp3.Call localVarCall = destroyTaxValidateBeforeCall(code, null);
        Type localVarReturnType = new TypeToken<Tax>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a tax (asynchronously)
     * This endpoint is used to delete a tax.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyTaxAsync(String code, final ApiCallback<Tax> _callback) throws ApiException {

        okhttp3.Call localVarCall = destroyTaxValidateBeforeCall(code, _callback);
        Type localVarReturnType = new TypeToken<Tax>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findAllTaxes
     * @param page Page number. (optional)
     * @param perPage Number of records per page. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Taxes </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findAllTaxesCall(Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/taxes";

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
    private okhttp3.Call findAllTaxesValidateBeforeCall(Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        return findAllTaxesCall(page, perPage, _callback);

    }

    /**
     * List all taxes
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param page Page number. (optional)
     * @param perPage Number of records per page. (optional)
     * @return TaxesPaginated
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Taxes </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
     </table>
     */
    public TaxesPaginated findAllTaxes(Integer page, Integer perPage) throws ApiException {
        ApiResponse<TaxesPaginated> localVarResp = findAllTaxesWithHttpInfo(page, perPage);
        return localVarResp.getData();
    }

    /**
     * List all taxes
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param page Page number. (optional)
     * @param perPage Number of records per page. (optional)
     * @return ApiResponse&lt;TaxesPaginated&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Taxes </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaxesPaginated> findAllTaxesWithHttpInfo(Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = findAllTaxesValidateBeforeCall(page, perPage, null);
        Type localVarReturnType = new TypeToken<TaxesPaginated>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all taxes (asynchronously)
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param page Page number. (optional)
     * @param perPage Number of records per page. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Taxes </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findAllTaxesAsync(Integer page, Integer perPage, final ApiCallback<TaxesPaginated> _callback) throws ApiException {

        okhttp3.Call localVarCall = findAllTaxesValidateBeforeCall(page, perPage, _callback);
        Type localVarReturnType = new TypeToken<TaxesPaginated>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findTax
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findTaxCall(String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/taxes/{code}"
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call findTaxValidateBeforeCall(String code, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling findTax(Async)");
        }

        return findTaxCall(code, _callback);

    }

    /**
     * Retrieve a Tax
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @return Tax
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public Tax findTax(String code) throws ApiException {
        ApiResponse<Tax> localVarResp = findTaxWithHttpInfo(code);
        return localVarResp.getData();
    }

    /**
     * Retrieve a Tax
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @return ApiResponse&lt;Tax&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tax> findTaxWithHttpInfo(String code) throws ApiException {
        okhttp3.Call localVarCall = findTaxValidateBeforeCall(code, null);
        Type localVarReturnType = new TypeToken<Tax>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a Tax (asynchronously)
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findTaxAsync(String code, final ApiCallback<Tax> _callback) throws ApiException {

        okhttp3.Call localVarCall = findTaxValidateBeforeCall(code, _callback);
        Type localVarReturnType = new TypeToken<Tax>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateTax
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @param taxUpdateInput Tax update payload (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTaxCall(String code, TaxUpdateInput taxUpdateInput, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = taxUpdateInput;

        // create path and map variables
        String localVarPath = "/taxes/{code}"
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call updateTaxValidateBeforeCall(String code, TaxUpdateInput taxUpdateInput, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateTax(Async)");
        }

        // verify the required parameter 'taxUpdateInput' is set
        if (taxUpdateInput == null) {
            throw new ApiException("Missing the required parameter 'taxUpdateInput' when calling updateTax(Async)");
        }

        return updateTaxCall(code, taxUpdateInput, _callback);

    }

    /**
     * Update a tax
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @param taxUpdateInput Tax update payload (required)
     * @return Tax
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public Tax updateTax(String code, TaxUpdateInput taxUpdateInput) throws ApiException {
        ApiResponse<Tax> localVarResp = updateTaxWithHttpInfo(code, taxUpdateInput);
        return localVarResp.getData();
    }

    /**
     * Update a tax
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @param taxUpdateInput Tax update payload (required)
     * @return ApiResponse&lt;Tax&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tax> updateTaxWithHttpInfo(String code, TaxUpdateInput taxUpdateInput) throws ApiException {
        okhttp3.Call localVarCall = updateTaxValidateBeforeCall(code, taxUpdateInput, null);
        Type localVarReturnType = new TypeToken<Tax>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a tax (asynchronously)
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
     * @param taxUpdateInput Tax update payload (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found error </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTaxAsync(String code, TaxUpdateInput taxUpdateInput, final ApiCallback<Tax> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTaxValidateBeforeCall(code, taxUpdateInput, _callback);
        Type localVarReturnType = new TypeToken<Tax>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
