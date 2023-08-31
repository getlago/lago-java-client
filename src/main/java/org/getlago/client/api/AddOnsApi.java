package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.AddOn;
import org.openapitools.client.model.AddOnCreateInput;
import org.openapitools.client.model.AddOnUpdateInput;
import org.openapitools.client.model.AddOnsPaginated;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.AppliedAddOn;
import org.openapitools.client.model.AppliedAddOnInput;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T15:04:44.084574Z[Etc/UTC]")
public class AddOnsApi {
    private ApiClient apiClient;

    public AddOnsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AddOnsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply an add-on to a customer
     * Apply an add-on to a customer
     * <p><b>200</b> - Add-on applied
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param appliedAddOnInput Apply add-on payload
     * @return AppliedAddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec applyAddOnRequestCreation(AppliedAddOnInput appliedAddOnInput) throws WebClientResponseException {
        Object postBody = appliedAddOnInput;
        // verify the required parameter 'appliedAddOnInput' is set
        if (appliedAddOnInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'appliedAddOnInput' when calling applyAddOn", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AppliedAddOn> localVarReturnType = new ParameterizedTypeReference<AppliedAddOn>() {};
        return apiClient.invokeAPI("/applied_add_ons", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Apply an add-on to a customer
     * Apply an add-on to a customer
     * <p><b>200</b> - Add-on applied
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param appliedAddOnInput Apply add-on payload
     * @return AppliedAddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AppliedAddOn> applyAddOn(AppliedAddOnInput appliedAddOnInput) throws WebClientResponseException {
        ParameterizedTypeReference<AppliedAddOn> localVarReturnType = new ParameterizedTypeReference<AppliedAddOn>() {};
        return applyAddOnRequestCreation(appliedAddOnInput).bodyToMono(localVarReturnType);
    }

    /**
     * Apply an add-on to a customer
     * Apply an add-on to a customer
     * <p><b>200</b> - Add-on applied
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param appliedAddOnInput Apply add-on payload
     * @return ResponseEntity&lt;AppliedAddOn&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AppliedAddOn>> applyAddOnWithHttpInfo(AppliedAddOnInput appliedAddOnInput) throws WebClientResponseException {
        ParameterizedTypeReference<AppliedAddOn> localVarReturnType = new ParameterizedTypeReference<AppliedAddOn>() {};
        return applyAddOnRequestCreation(appliedAddOnInput).toEntity(localVarReturnType);
    }

    /**
     * Apply an add-on to a customer
     * Apply an add-on to a customer
     * <p><b>200</b> - Add-on applied
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param appliedAddOnInput Apply add-on payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec applyAddOnWithResponseSpec(AppliedAddOnInput appliedAddOnInput) throws WebClientResponseException {
        return applyAddOnRequestCreation(appliedAddOnInput);
    }
    /**
     * Create an add-on
     * This endpoint is used to create an add-on that can be then attached to a one-off invoice.
     * <p><b>200</b> - Add-on created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param addOnCreateInput Add-on payload
     * @return AddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createAddOnRequestCreation(AddOnCreateInput addOnCreateInput) throws WebClientResponseException {
        Object postBody = addOnCreateInput;
        // verify the required parameter 'addOnCreateInput' is set
        if (addOnCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'addOnCreateInput' when calling createAddOn", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return apiClient.invokeAPI("/add_ons", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create an add-on
     * This endpoint is used to create an add-on that can be then attached to a one-off invoice.
     * <p><b>200</b> - Add-on created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param addOnCreateInput Add-on payload
     * @return AddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AddOn> createAddOn(AddOnCreateInput addOnCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return createAddOnRequestCreation(addOnCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create an add-on
     * This endpoint is used to create an add-on that can be then attached to a one-off invoice.
     * <p><b>200</b> - Add-on created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param addOnCreateInput Add-on payload
     * @return ResponseEntity&lt;AddOn&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AddOn>> createAddOnWithHttpInfo(AddOnCreateInput addOnCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return createAddOnRequestCreation(addOnCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create an add-on
     * This endpoint is used to create an add-on that can be then attached to a one-off invoice.
     * <p><b>200</b> - Add-on created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param addOnCreateInput Add-on payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createAddOnWithResponseSpec(AddOnCreateInput addOnCreateInput) throws WebClientResponseException {
        return createAddOnRequestCreation(addOnCreateInput);
    }
    /**
     * Delete an add-on
     * This endpoint is used to delete an existing add-on.
     * <p><b>200</b> - Add-on deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the add-on.
     * @return AddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroyAddOnRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling destroyAddOn", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return apiClient.invokeAPI("/add_ons/{code}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an add-on
     * This endpoint is used to delete an existing add-on.
     * <p><b>200</b> - Add-on deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the add-on.
     * @return AddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AddOn> destroyAddOn(String code) throws WebClientResponseException {
        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return destroyAddOnRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an add-on
     * This endpoint is used to delete an existing add-on.
     * <p><b>200</b> - Add-on deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the add-on.
     * @return ResponseEntity&lt;AddOn&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AddOn>> destroyAddOnWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return destroyAddOnRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Delete an add-on
     * This endpoint is used to delete an existing add-on.
     * <p><b>200</b> - Add-on deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the add-on.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroyAddOnWithResponseSpec(String code) throws WebClientResponseException {
        return destroyAddOnRequestCreation(code);
    }
    /**
     * Retrieve an add-on
     * This endpoint is used to retrieve a specific add-on.
     * <p><b>200</b> - Add-on
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the add-on.
     * @return AddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAddOnRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling findAddOn", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return apiClient.invokeAPI("/add_ons/{code}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve an add-on
     * This endpoint is used to retrieve a specific add-on.
     * <p><b>200</b> - Add-on
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the add-on.
     * @return AddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AddOn> findAddOn(String code) throws WebClientResponseException {
        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return findAddOnRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve an add-on
     * This endpoint is used to retrieve a specific add-on.
     * <p><b>200</b> - Add-on
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the add-on.
     * @return ResponseEntity&lt;AddOn&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AddOn>> findAddOnWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return findAddOnRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Retrieve an add-on
     * This endpoint is used to retrieve a specific add-on.
     * <p><b>200</b> - Add-on
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code Unique code used to identify the add-on.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAddOnWithResponseSpec(String code) throws WebClientResponseException {
        return findAddOnRequestCreation(code);
    }
    /**
     * List all add-ons
     * This endpoint is used to list all existing add-ons.
     * <p><b>200</b> - Add-ons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return AddOnsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllAddOnsRequestCreation(Integer page, Integer perPage) throws WebClientResponseException {
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

        ParameterizedTypeReference<AddOnsPaginated> localVarReturnType = new ParameterizedTypeReference<AddOnsPaginated>() {};
        return apiClient.invokeAPI("/add_ons", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all add-ons
     * This endpoint is used to list all existing add-ons.
     * <p><b>200</b> - Add-ons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return AddOnsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AddOnsPaginated> findAllAddOns(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<AddOnsPaginated> localVarReturnType = new ParameterizedTypeReference<AddOnsPaginated>() {};
        return findAllAddOnsRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * List all add-ons
     * This endpoint is used to list all existing add-ons.
     * <p><b>200</b> - Add-ons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;AddOnsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AddOnsPaginated>> findAllAddOnsWithHttpInfo(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<AddOnsPaginated> localVarReturnType = new ParameterizedTypeReference<AddOnsPaginated>() {};
        return findAllAddOnsRequestCreation(page, perPage).toEntity(localVarReturnType);
    }

    /**
     * List all add-ons
     * This endpoint is used to list all existing add-ons.
     * <p><b>200</b> - Add-ons
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllAddOnsWithResponseSpec(Integer page, Integer perPage) throws WebClientResponseException {
        return findAllAddOnsRequestCreation(page, perPage);
    }
    /**
     * Update an add-on
     * This endpoint is used to update an existing add-on.
     * <p><b>200</b> - Add-on updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Unique code used to identify the add-on.
     * @param addOnUpdateInput Add-on payload
     * @return AddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateAddOnRequestCreation(String code, AddOnUpdateInput addOnUpdateInput) throws WebClientResponseException {
        Object postBody = addOnUpdateInput;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling updateAddOn", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'addOnUpdateInput' is set
        if (addOnUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'addOnUpdateInput' when calling updateAddOn", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return apiClient.invokeAPI("/add_ons/{code}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update an add-on
     * This endpoint is used to update an existing add-on.
     * <p><b>200</b> - Add-on updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Unique code used to identify the add-on.
     * @param addOnUpdateInput Add-on payload
     * @return AddOn
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AddOn> updateAddOn(String code, AddOnUpdateInput addOnUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return updateAddOnRequestCreation(code, addOnUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update an add-on
     * This endpoint is used to update an existing add-on.
     * <p><b>200</b> - Add-on updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Unique code used to identify the add-on.
     * @param addOnUpdateInput Add-on payload
     * @return ResponseEntity&lt;AddOn&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AddOn>> updateAddOnWithHttpInfo(String code, AddOnUpdateInput addOnUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<AddOn> localVarReturnType = new ParameterizedTypeReference<AddOn>() {};
        return updateAddOnRequestCreation(code, addOnUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update an add-on
     * This endpoint is used to update an existing add-on.
     * <p><b>200</b> - Add-on updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code Unique code used to identify the add-on.
     * @param addOnUpdateInput Add-on payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateAddOnWithResponseSpec(String code, AddOnUpdateInput addOnUpdateInput) throws WebClientResponseException {
        return updateAddOnRequestCreation(code, addOnUpdateInput);
    }
}
