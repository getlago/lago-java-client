package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Tax;
import org.openapitools.client.model.TaxCreateInput;
import org.openapitools.client.model.TaxUpdateInput;
import org.openapitools.client.model.TaxesPaginated;

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
public class TaxesApi {
    private ApiClient apiClient;

    public TaxesApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaxesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a tax
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Tax created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param taxCreateInput Tax creation payload
     * @return Tax
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createTaxRequestCreation(TaxCreateInput taxCreateInput) throws WebClientResponseException {
        Object postBody = taxCreateInput;
        // verify the required parameter 'taxCreateInput' is set
        if (taxCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'taxCreateInput' when calling createTax", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return apiClient.invokeAPI("/taxes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a tax
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Tax created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param taxCreateInput Tax creation payload
     * @return Tax
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Tax> createTax(TaxCreateInput taxCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return createTaxRequestCreation(taxCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a tax
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Tax created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param taxCreateInput Tax creation payload
     * @return ResponseEntity&lt;Tax&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Tax>> createTaxWithHttpInfo(TaxCreateInput taxCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return createTaxRequestCreation(taxCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a tax
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Tax created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param taxCreateInput Tax creation payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createTaxWithResponseSpec(TaxCreateInput taxCreateInput) throws WebClientResponseException {
        return createTaxRequestCreation(taxCreateInput);
    }
    /**
     * Delete a tax
     * This endpoint is used to delete a tax.
     * <p><b>200</b> - Tax deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @return Tax
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroyTaxRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling destroyTax", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return apiClient.invokeAPI("/taxes/{code}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a tax
     * This endpoint is used to delete a tax.
     * <p><b>200</b> - Tax deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @return Tax
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Tax> destroyTax(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return destroyTaxRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a tax
     * This endpoint is used to delete a tax.
     * <p><b>200</b> - Tax deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @return ResponseEntity&lt;Tax&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Tax>> destroyTaxWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return destroyTaxRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Delete a tax
     * This endpoint is used to delete a tax.
     * <p><b>200</b> - Tax deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroyTaxWithResponseSpec(String code) throws WebClientResponseException {
        return destroyTaxRequestCreation(code);
    }
    /**
     * List all taxes
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Taxes
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return TaxesPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllTaxesRequestCreation(Integer page, Integer perPage) throws WebClientResponseException {
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

        ParameterizedTypeReference<TaxesPaginated> localVarReturnType = new ParameterizedTypeReference<TaxesPaginated>() {};
        return apiClient.invokeAPI("/taxes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all taxes
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Taxes
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return TaxesPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaxesPaginated> findAllTaxes(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<TaxesPaginated> localVarReturnType = new ParameterizedTypeReference<TaxesPaginated>() {};
        return findAllTaxesRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * List all taxes
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Taxes
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;TaxesPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TaxesPaginated>> findAllTaxesWithHttpInfo(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<TaxesPaginated> localVarReturnType = new ParameterizedTypeReference<TaxesPaginated>() {};
        return findAllTaxesRequestCreation(page, perPage).toEntity(localVarReturnType);
    }

    /**
     * List all taxes
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Taxes
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllTaxesWithResponseSpec(Integer page, Integer perPage) throws WebClientResponseException {
        return findAllTaxesRequestCreation(page, perPage);
    }
    /**
     * Retrieve a Tax
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     * <p><b>200</b> - Tax
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @return Tax
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findTaxRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling findTax", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return apiClient.invokeAPI("/taxes/{code}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a Tax
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     * <p><b>200</b> - Tax
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @return Tax
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Tax> findTax(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return findTaxRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a Tax
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     * <p><b>200</b> - Tax
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @return ResponseEntity&lt;Tax&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Tax>> findTaxWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return findTaxRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a Tax
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     * <p><b>200</b> - Tax
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findTaxWithResponseSpec(String code) throws WebClientResponseException {
        return findTaxRequestCreation(code);
    }
    /**
     * Update a tax
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Tax updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @param taxUpdateInput Tax update payload
     * @return Tax
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateTaxRequestCreation(String code, TaxUpdateInput taxUpdateInput) throws WebClientResponseException {
        Object postBody = taxUpdateInput;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling updateTax", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taxUpdateInput' is set
        if (taxUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'taxUpdateInput' when calling updateTax", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return apiClient.invokeAPI("/taxes/{code}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a tax
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Tax updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @param taxUpdateInput Tax update payload
     * @return Tax
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Tax> updateTax(String code, TaxUpdateInput taxUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return updateTaxRequestCreation(code, taxUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a tax
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Tax updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @param taxUpdateInput Tax update payload
     * @return ResponseEntity&lt;Tax&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Tax>> updateTaxWithHttpInfo(String code, TaxUpdateInput taxUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Tax> localVarReturnType = new ParameterizedTypeReference<Tax>() {};
        return updateTaxRequestCreation(code, taxUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a tax
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     * <p><b>200</b> - Tax updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes.
     * @param taxUpdateInput Tax update payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateTaxWithResponseSpec(String code, TaxUpdateInput taxUpdateInput) throws WebClientResponseException {
        return updateTaxRequestCreation(code, taxUpdateInput);
    }
}
