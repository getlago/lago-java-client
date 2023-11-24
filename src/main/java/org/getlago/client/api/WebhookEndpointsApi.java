package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import java.util.UUID;
import org.openapitools.client.model.WebhookEndpoint;
import org.openapitools.client.model.WebhookEndpointCreateInput;
import org.openapitools.client.model.WebhookEndpointUpdateInput;
import org.openapitools.client.model.WebhookEndpointsPaginated;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class WebhookEndpointsApi {
    private ApiClient apiClient;

    public WebhookEndpointsApi() {
        this(new ApiClient());
    }

    @Autowired
    public WebhookEndpointsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a webhook_endpoint
     * This endpoint is used to create a webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param webhookEndpointCreateInput Webhook Endpoint payload
     * @return WebhookEndpoint
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createWebhookEndpointRequestCreation(WebhookEndpointCreateInput webhookEndpointCreateInput) throws WebClientResponseException {
        Object postBody = webhookEndpointCreateInput;
        // verify the required parameter 'webhookEndpointCreateInput' is set
        if (webhookEndpointCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'webhookEndpointCreateInput' when calling createWebhookEndpoint", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return apiClient.invokeAPI("/webhook_endpoints", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a webhook_endpoint
     * This endpoint is used to create a webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param webhookEndpointCreateInput Webhook Endpoint payload
     * @return WebhookEndpoint
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WebhookEndpoint> createWebhookEndpoint(WebhookEndpointCreateInput webhookEndpointCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return createWebhookEndpointRequestCreation(webhookEndpointCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a webhook_endpoint
     * This endpoint is used to create a webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param webhookEndpointCreateInput Webhook Endpoint payload
     * @return ResponseEntity&lt;WebhookEndpoint&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WebhookEndpoint>> createWebhookEndpointWithHttpInfo(WebhookEndpointCreateInput webhookEndpointCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return createWebhookEndpointRequestCreation(webhookEndpointCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a webhook_endpoint
     * This endpoint is used to create a webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param webhookEndpointCreateInput Webhook Endpoint payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createWebhookEndpointWithResponseSpec(WebhookEndpointCreateInput webhookEndpointCreateInput) throws WebClientResponseException {
        return createWebhookEndpointRequestCreation(webhookEndpointCreateInput);
    }
    /**
     * Delete a webhook endpoint
     * This endpoint is used to delete an existing webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @return WebhookEndpoint
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroyWebhookEndpointRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling destroyWebhookEndpoint", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lago_id", lagoId);

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

        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return apiClient.invokeAPI("/webhook_endpoints/{lago_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a webhook endpoint
     * This endpoint is used to delete an existing webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @return WebhookEndpoint
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WebhookEndpoint> destroyWebhookEndpoint(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return destroyWebhookEndpointRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a webhook endpoint
     * This endpoint is used to delete an existing webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @return ResponseEntity&lt;WebhookEndpoint&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WebhookEndpoint>> destroyWebhookEndpointWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return destroyWebhookEndpointRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Delete a webhook endpoint
     * This endpoint is used to delete an existing webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroyWebhookEndpointWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return destroyWebhookEndpointRequestCreation(lagoId);
    }
    /**
     * List all webhook endpoints
     * This endpoint is used to list all webhook endpoints.
     * <p><b>200</b> - WebhookEndpoints
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return WebhookEndpointsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllWebhookEndpointsRequestCreation(Integer page, Integer perPage) throws WebClientResponseException {
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

        ParameterizedTypeReference<WebhookEndpointsPaginated> localVarReturnType = new ParameterizedTypeReference<WebhookEndpointsPaginated>() {};
        return apiClient.invokeAPI("/webhook_endpoints", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all webhook endpoints
     * This endpoint is used to list all webhook endpoints.
     * <p><b>200</b> - WebhookEndpoints
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return WebhookEndpointsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WebhookEndpointsPaginated> findAllWebhookEndpoints(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpointsPaginated> localVarReturnType = new ParameterizedTypeReference<WebhookEndpointsPaginated>() {};
        return findAllWebhookEndpointsRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * List all webhook endpoints
     * This endpoint is used to list all webhook endpoints.
     * <p><b>200</b> - WebhookEndpoints
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;WebhookEndpointsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WebhookEndpointsPaginated>> findAllWebhookEndpointsWithHttpInfo(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpointsPaginated> localVarReturnType = new ParameterizedTypeReference<WebhookEndpointsPaginated>() {};
        return findAllWebhookEndpointsRequestCreation(page, perPage).toEntity(localVarReturnType);
    }

    /**
     * List all webhook endpoints
     * This endpoint is used to list all webhook endpoints.
     * <p><b>200</b> - WebhookEndpoints
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllWebhookEndpointsWithResponseSpec(Integer page, Integer perPage) throws WebClientResponseException {
        return findAllWebhookEndpointsRequestCreation(page, perPage);
    }
    /**
     * Retrieve a webhook endpoint
     * This endpoint is used to retrieve an existing webhook endpoint.
     * <p><b>200</b> - WebhookEndpoint
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @return WebhookEndpoint
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findWebhookEndpointRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling findWebhookEndpoint", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lago_id", lagoId);

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

        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return apiClient.invokeAPI("/webhook_endpoints/{lago_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a webhook endpoint
     * This endpoint is used to retrieve an existing webhook endpoint.
     * <p><b>200</b> - WebhookEndpoint
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @return WebhookEndpoint
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WebhookEndpoint> findWebhookEndpoint(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return findWebhookEndpointRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a webhook endpoint
     * This endpoint is used to retrieve an existing webhook endpoint.
     * <p><b>200</b> - WebhookEndpoint
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @return ResponseEntity&lt;WebhookEndpoint&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WebhookEndpoint>> findWebhookEndpointWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return findWebhookEndpointRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a webhook endpoint
     * This endpoint is used to retrieve an existing webhook endpoint.
     * <p><b>200</b> - WebhookEndpoint
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findWebhookEndpointWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return findWebhookEndpointRequestCreation(lagoId);
    }
    /**
     * Update a webhook endpoint
     * This endpoint is used to update an existing webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @param webhookEndpointUpdateInput Webhook Endpoint update payload
     * @return WebhookEndpoint
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateWebhookEndpointRequestCreation(UUID lagoId, WebhookEndpointUpdateInput webhookEndpointUpdateInput) throws WebClientResponseException {
        Object postBody = webhookEndpointUpdateInput;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling updateWebhookEndpoint", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'webhookEndpointUpdateInput' is set
        if (webhookEndpointUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'webhookEndpointUpdateInput' when calling updateWebhookEndpoint", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lago_id", lagoId);

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

        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return apiClient.invokeAPI("/webhook_endpoints/{lago_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a webhook endpoint
     * This endpoint is used to update an existing webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @param webhookEndpointUpdateInput Webhook Endpoint update payload
     * @return WebhookEndpoint
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WebhookEndpoint> updateWebhookEndpoint(UUID lagoId, WebhookEndpointUpdateInput webhookEndpointUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return updateWebhookEndpointRequestCreation(lagoId, webhookEndpointUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a webhook endpoint
     * This endpoint is used to update an existing webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @param webhookEndpointUpdateInput Webhook Endpoint update payload
     * @return ResponseEntity&lt;WebhookEndpoint&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WebhookEndpoint>> updateWebhookEndpointWithHttpInfo(UUID lagoId, WebhookEndpointUpdateInput webhookEndpointUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<WebhookEndpoint> localVarReturnType = new ParameterizedTypeReference<WebhookEndpoint>() {};
        return updateWebhookEndpointRequestCreation(lagoId, webhookEndpointUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a webhook endpoint
     * This endpoint is used to update an existing webhook endpoint.
     * <p><b>200</b> - Webhook Endpoint updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
     * @param webhookEndpointUpdateInput Webhook Endpoint update payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateWebhookEndpointWithResponseSpec(UUID lagoId, WebhookEndpointUpdateInput webhookEndpointUpdateInput) throws WebClientResponseException {
        return updateWebhookEndpointRequestCreation(lagoId, webhookEndpointUpdateInput);
    }
}
