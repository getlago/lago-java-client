package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.BillableMetric;
import org.openapitools.client.model.BillableMetricCreateInput;
import org.openapitools.client.model.BillableMetricUpdateInput;
import org.openapitools.client.model.BillableMetricsPaginated;
import org.openapitools.client.model.GroupsPaginated;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class BillableMetricsApi {
    private ApiClient apiClient;

    public BillableMetricsApi() {
        this(new ApiClient());
    }

    @Autowired
    public BillableMetricsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a billable metric
     * This endpoint creates a new billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param billableMetricCreateInput Billable metric payload
     * @return BillableMetric
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createBillableMetricRequestCreation(BillableMetricCreateInput billableMetricCreateInput) throws WebClientResponseException {
        Object postBody = billableMetricCreateInput;
        // verify the required parameter 'billableMetricCreateInput' is set
        if (billableMetricCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'billableMetricCreateInput' when calling createBillableMetric", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return apiClient.invokeAPI("/billable_metrics", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a billable metric
     * This endpoint creates a new billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param billableMetricCreateInput Billable metric payload
     * @return BillableMetric
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BillableMetric> createBillableMetric(BillableMetricCreateInput billableMetricCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return createBillableMetricRequestCreation(billableMetricCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a billable metric
     * This endpoint creates a new billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param billableMetricCreateInput Billable metric payload
     * @return ResponseEntity&lt;BillableMetric&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BillableMetric>> createBillableMetricWithHttpInfo(BillableMetricCreateInput billableMetricCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return createBillableMetricRequestCreation(billableMetricCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a billable metric
     * This endpoint creates a new billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param billableMetricCreateInput Billable metric payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createBillableMetricWithResponseSpec(BillableMetricCreateInput billableMetricCreateInput) throws WebClientResponseException {
        return createBillableMetricRequestCreation(billableMetricCreateInput);
    }
    /**
     * Delete a billable metric
     * This endpoint deletes an existing billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Code of the existing billable metric.
     * @return BillableMetric
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroyBillableMetricRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling destroyBillableMetric", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return apiClient.invokeAPI("/billable_metrics/{code}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a billable metric
     * This endpoint deletes an existing billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Code of the existing billable metric.
     * @return BillableMetric
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BillableMetric> destroyBillableMetric(String code) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return destroyBillableMetricRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a billable metric
     * This endpoint deletes an existing billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Code of the existing billable metric.
     * @return ResponseEntity&lt;BillableMetric&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BillableMetric>> destroyBillableMetricWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return destroyBillableMetricRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Delete a billable metric
     * This endpoint deletes an existing billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Code of the existing billable metric.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroyBillableMetricWithResponseSpec(String code) throws WebClientResponseException {
        return destroyBillableMetricRequestCreation(code);
    }
    /**
     * Find a billable metric&#39;s groups
     * This endpoint retrieves all groups for a billable metric.
     * <p><b>200</b> - List of billable metric&#39;s groups
     * <p><b>401</b> - Unauthorized error
     * @param code Code of the existing billable metric.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return GroupsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllBillableMetricGroupsRequestCreation(String code, Integer page, Integer perPage) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling findAllBillableMetricGroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("code", code);

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

        ParameterizedTypeReference<GroupsPaginated> localVarReturnType = new ParameterizedTypeReference<GroupsPaginated>() {};
        return apiClient.invokeAPI("/billable_metrics/{code}/groups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Find a billable metric&#39;s groups
     * This endpoint retrieves all groups for a billable metric.
     * <p><b>200</b> - List of billable metric&#39;s groups
     * <p><b>401</b> - Unauthorized error
     * @param code Code of the existing billable metric.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return GroupsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GroupsPaginated> findAllBillableMetricGroups(String code, Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<GroupsPaginated> localVarReturnType = new ParameterizedTypeReference<GroupsPaginated>() {};
        return findAllBillableMetricGroupsRequestCreation(code, page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * Find a billable metric&#39;s groups
     * This endpoint retrieves all groups for a billable metric.
     * <p><b>200</b> - List of billable metric&#39;s groups
     * <p><b>401</b> - Unauthorized error
     * @param code Code of the existing billable metric.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;GroupsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GroupsPaginated>> findAllBillableMetricGroupsWithHttpInfo(String code, Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<GroupsPaginated> localVarReturnType = new ParameterizedTypeReference<GroupsPaginated>() {};
        return findAllBillableMetricGroupsRequestCreation(code, page, perPage).toEntity(localVarReturnType);
    }

    /**
     * Find a billable metric&#39;s groups
     * This endpoint retrieves all groups for a billable metric.
     * <p><b>200</b> - List of billable metric&#39;s groups
     * <p><b>401</b> - Unauthorized error
     * @param code Code of the existing billable metric.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllBillableMetricGroupsWithResponseSpec(String code, Integer page, Integer perPage) throws WebClientResponseException {
        return findAllBillableMetricGroupsRequestCreation(code, page, perPage);
    }
    /**
     * List all billable metrics
     * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
     * <p><b>200</b> - List of billable metrics
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return BillableMetricsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllBillableMetricsRequestCreation(Integer page, Integer perPage) throws WebClientResponseException {
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

        ParameterizedTypeReference<BillableMetricsPaginated> localVarReturnType = new ParameterizedTypeReference<BillableMetricsPaginated>() {};
        return apiClient.invokeAPI("/billable_metrics", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all billable metrics
     * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
     * <p><b>200</b> - List of billable metrics
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return BillableMetricsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BillableMetricsPaginated> findAllBillableMetrics(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetricsPaginated> localVarReturnType = new ParameterizedTypeReference<BillableMetricsPaginated>() {};
        return findAllBillableMetricsRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * List all billable metrics
     * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
     * <p><b>200</b> - List of billable metrics
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;BillableMetricsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BillableMetricsPaginated>> findAllBillableMetricsWithHttpInfo(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetricsPaginated> localVarReturnType = new ParameterizedTypeReference<BillableMetricsPaginated>() {};
        return findAllBillableMetricsRequestCreation(page, perPage).toEntity(localVarReturnType);
    }

    /**
     * List all billable metrics
     * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
     * <p><b>200</b> - List of billable metrics
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllBillableMetricsWithResponseSpec(Integer page, Integer perPage) throws WebClientResponseException {
        return findAllBillableMetricsRequestCreation(page, perPage);
    }
    /**
     * Retrieve a billable metric
     * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
     * <p><b>200</b> - Billable metric
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Code of the existing billable metric.
     * @return BillableMetric
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findBillableMetricRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling findBillableMetric", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return apiClient.invokeAPI("/billable_metrics/{code}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a billable metric
     * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
     * <p><b>200</b> - Billable metric
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Code of the existing billable metric.
     * @return BillableMetric
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BillableMetric> findBillableMetric(String code) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return findBillableMetricRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a billable metric
     * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
     * <p><b>200</b> - Billable metric
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Code of the existing billable metric.
     * @return ResponseEntity&lt;BillableMetric&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BillableMetric>> findBillableMetricWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return findBillableMetricRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a billable metric
     * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
     * <p><b>200</b> - Billable metric
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Code of the existing billable metric.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findBillableMetricWithResponseSpec(String code) throws WebClientResponseException {
        return findBillableMetricRequestCreation(code);
    }
    /**
     * Update a billable metric
     * This endpoint updates an existing billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Code of the existing billable metric.
     * @param billableMetricUpdateInput Billable metric payload
     * @return BillableMetric
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateBillableMetricRequestCreation(String code, BillableMetricUpdateInput billableMetricUpdateInput) throws WebClientResponseException {
        Object postBody = billableMetricUpdateInput;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling updateBillableMetric", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'billableMetricUpdateInput' is set
        if (billableMetricUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'billableMetricUpdateInput' when calling updateBillableMetric", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return apiClient.invokeAPI("/billable_metrics/{code}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a billable metric
     * This endpoint updates an existing billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Code of the existing billable metric.
     * @param billableMetricUpdateInput Billable metric payload
     * @return BillableMetric
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BillableMetric> updateBillableMetric(String code, BillableMetricUpdateInput billableMetricUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return updateBillableMetricRequestCreation(code, billableMetricUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a billable metric
     * This endpoint updates an existing billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Code of the existing billable metric.
     * @param billableMetricUpdateInput Billable metric payload
     * @return ResponseEntity&lt;BillableMetric&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BillableMetric>> updateBillableMetricWithHttpInfo(String code, BillableMetricUpdateInput billableMetricUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<BillableMetric> localVarReturnType = new ParameterizedTypeReference<BillableMetric>() {};
        return updateBillableMetricRequestCreation(code, billableMetricUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a billable metric
     * This endpoint updates an existing billable metric representing a pricing component of your application.
     * <p><b>200</b> - Billable metric updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Code of the existing billable metric.
     * @param billableMetricUpdateInput Billable metric payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateBillableMetricWithResponseSpec(String code, BillableMetricUpdateInput billableMetricUpdateInput) throws WebClientResponseException {
        return updateBillableMetricRequestCreation(code, billableMetricUpdateInput);
    }
}
