package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.CreditNote;
import org.openapitools.client.model.CreditNoteCreateInput;
import org.openapitools.client.model.CreditNoteEstimateInput;
import org.openapitools.client.model.CreditNoteEstimated;
import org.openapitools.client.model.CreditNoteUpdateInput;
import org.openapitools.client.model.CreditNotes;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class CreditNotesApi {
    private ApiClient apiClient;

    public CreditNotesApi() {
        this(new ApiClient());
    }

    @Autowired
    public CreditNotesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a credit note
     * This endpoint creates a new credit note.
     * <p><b>200</b> - Credit note created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param creditNoteCreateInput Credit note payload
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createCreditNoteRequestCreation(CreditNoteCreateInput creditNoteCreateInput) throws WebClientResponseException {
        Object postBody = creditNoteCreateInput;
        // verify the required parameter 'creditNoteCreateInput' is set
        if (creditNoteCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'creditNoteCreateInput' when calling createCreditNote", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return apiClient.invokeAPI("/credit_notes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a credit note
     * This endpoint creates a new credit note.
     * <p><b>200</b> - Credit note created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param creditNoteCreateInput Credit note payload
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreditNote> createCreditNote(CreditNoteCreateInput creditNoteCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return createCreditNoteRequestCreation(creditNoteCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a credit note
     * This endpoint creates a new credit note.
     * <p><b>200</b> - Credit note created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param creditNoteCreateInput Credit note payload
     * @return ResponseEntity&lt;CreditNote&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreditNote>> createCreditNoteWithHttpInfo(CreditNoteCreateInput creditNoteCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return createCreditNoteRequestCreation(creditNoteCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a credit note
     * This endpoint creates a new credit note.
     * <p><b>200</b> - Credit note created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param creditNoteCreateInput Credit note payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createCreditNoteWithResponseSpec(CreditNoteCreateInput creditNoteCreateInput) throws WebClientResponseException {
        return createCreditNoteRequestCreation(creditNoteCreateInput);
    }
    /**
     * Download a credit note PDF
     * This endpoint downloads the PDF of an existing credit note.
     * <p><b>200</b> - Credit note PDF
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec downloadCreditNoteRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling downloadCreditNote", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return apiClient.invokeAPI("/credit_notes/{lago_id}/download", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Download a credit note PDF
     * This endpoint downloads the PDF of an existing credit note.
     * <p><b>200</b> - Credit note PDF
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreditNote> downloadCreditNote(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return downloadCreditNoteRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Download a credit note PDF
     * This endpoint downloads the PDF of an existing credit note.
     * <p><b>200</b> - Credit note PDF
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return ResponseEntity&lt;CreditNote&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreditNote>> downloadCreditNoteWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return downloadCreditNoteRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Download a credit note PDF
     * This endpoint downloads the PDF of an existing credit note.
     * <p><b>200</b> - Credit note PDF
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec downloadCreditNoteWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return downloadCreditNoteRequestCreation(lagoId);
    }
    /**
     * Estimate amounts for a new credit note
     * This endpoint allows you to retrieve amounts for a new credit note creation.
     * <p><b>200</b> - Credit note amounts
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param creditNoteEstimateInput Credit note estimate payload
     * @return CreditNoteEstimated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec estimateCreditNoteRequestCreation(CreditNoteEstimateInput creditNoteEstimateInput) throws WebClientResponseException {
        Object postBody = creditNoteEstimateInput;
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

        ParameterizedTypeReference<CreditNoteEstimated> localVarReturnType = new ParameterizedTypeReference<CreditNoteEstimated>() {};
        return apiClient.invokeAPI("/credit_notes/estimate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Estimate amounts for a new credit note
     * This endpoint allows you to retrieve amounts for a new credit note creation.
     * <p><b>200</b> - Credit note amounts
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param creditNoteEstimateInput Credit note estimate payload
     * @return CreditNoteEstimated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreditNoteEstimated> estimateCreditNote(CreditNoteEstimateInput creditNoteEstimateInput) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNoteEstimated> localVarReturnType = new ParameterizedTypeReference<CreditNoteEstimated>() {};
        return estimateCreditNoteRequestCreation(creditNoteEstimateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Estimate amounts for a new credit note
     * This endpoint allows you to retrieve amounts for a new credit note creation.
     * <p><b>200</b> - Credit note amounts
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param creditNoteEstimateInput Credit note estimate payload
     * @return ResponseEntity&lt;CreditNoteEstimated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreditNoteEstimated>> estimateCreditNoteWithHttpInfo(CreditNoteEstimateInput creditNoteEstimateInput) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNoteEstimated> localVarReturnType = new ParameterizedTypeReference<CreditNoteEstimated>() {};
        return estimateCreditNoteRequestCreation(creditNoteEstimateInput).toEntity(localVarReturnType);
    }

    /**
     * Estimate amounts for a new credit note
     * This endpoint allows you to retrieve amounts for a new credit note creation.
     * <p><b>200</b> - Credit note amounts
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param creditNoteEstimateInput Credit note estimate payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec estimateCreditNoteWithResponseSpec(CreditNoteEstimateInput creditNoteEstimateInput) throws WebClientResponseException {
        return estimateCreditNoteRequestCreation(creditNoteEstimateInput);
    }
    /**
     * List all credit notes
     * This endpoint list all existing credit notes.
     * <p><b>200</b> - Credit notes
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @return CreditNotes
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllCreditNotesRequestCreation(Integer page, Integer perPage, String externalCustomerId) throws WebClientResponseException {
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CreditNotes> localVarReturnType = new ParameterizedTypeReference<CreditNotes>() {};
        return apiClient.invokeAPI("/credit_notes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all credit notes
     * This endpoint list all existing credit notes.
     * <p><b>200</b> - Credit notes
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @return CreditNotes
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreditNotes> findAllCreditNotes(Integer page, Integer perPage, String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNotes> localVarReturnType = new ParameterizedTypeReference<CreditNotes>() {};
        return findAllCreditNotesRequestCreation(page, perPage, externalCustomerId).bodyToMono(localVarReturnType);
    }

    /**
     * List all credit notes
     * This endpoint list all existing credit notes.
     * <p><b>200</b> - Credit notes
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @return ResponseEntity&lt;CreditNotes&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreditNotes>> findAllCreditNotesWithHttpInfo(Integer page, Integer perPage, String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNotes> localVarReturnType = new ParameterizedTypeReference<CreditNotes>() {};
        return findAllCreditNotesRequestCreation(page, perPage, externalCustomerId).toEntity(localVarReturnType);
    }

    /**
     * List all credit notes
     * This endpoint list all existing credit notes.
     * <p><b>200</b> - Credit notes
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllCreditNotesWithResponseSpec(Integer page, Integer perPage, String externalCustomerId) throws WebClientResponseException {
        return findAllCreditNotesRequestCreation(page, perPage, externalCustomerId);
    }
    /**
     * Retrieve a credit note
     * This endpoint retrieves an existing credit note.
     * <p><b>200</b> - Credit note
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findCreditNoteRequestCreation(String lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling findCreditNote", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return apiClient.invokeAPI("/credit_notes/{lago_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a credit note
     * This endpoint retrieves an existing credit note.
     * <p><b>200</b> - Credit note
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreditNote> findCreditNote(String lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return findCreditNoteRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a credit note
     * This endpoint retrieves an existing credit note.
     * <p><b>200</b> - Credit note
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return ResponseEntity&lt;CreditNote&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreditNote>> findCreditNoteWithHttpInfo(String lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return findCreditNoteRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a credit note
     * This endpoint retrieves an existing credit note.
     * <p><b>200</b> - Credit note
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findCreditNoteWithResponseSpec(String lagoId) throws WebClientResponseException {
        return findCreditNoteRequestCreation(lagoId);
    }
    /**
     * Update a credit note
     * This endpoint updates an existing credit note.
     * <p><b>200</b> - Credit note updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @param creditNoteUpdateInput Credit note update payload
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateCreditNoteRequestCreation(String lagoId, CreditNoteUpdateInput creditNoteUpdateInput) throws WebClientResponseException {
        Object postBody = creditNoteUpdateInput;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling updateCreditNote", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'creditNoteUpdateInput' is set
        if (creditNoteUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'creditNoteUpdateInput' when calling updateCreditNote", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return apiClient.invokeAPI("/credit_notes/{lago_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a credit note
     * This endpoint updates an existing credit note.
     * <p><b>200</b> - Credit note updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @param creditNoteUpdateInput Credit note update payload
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreditNote> updateCreditNote(String lagoId, CreditNoteUpdateInput creditNoteUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return updateCreditNoteRequestCreation(lagoId, creditNoteUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a credit note
     * This endpoint updates an existing credit note.
     * <p><b>200</b> - Credit note updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @param creditNoteUpdateInput Credit note update payload
     * @return ResponseEntity&lt;CreditNote&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreditNote>> updateCreditNoteWithHttpInfo(String lagoId, CreditNoteUpdateInput creditNoteUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return updateCreditNoteRequestCreation(lagoId, creditNoteUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a credit note
     * This endpoint updates an existing credit note.
     * <p><b>200</b> - Credit note updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @param creditNoteUpdateInput Credit note update payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateCreditNoteWithResponseSpec(String lagoId, CreditNoteUpdateInput creditNoteUpdateInput) throws WebClientResponseException {
        return updateCreditNoteRequestCreation(lagoId, creditNoteUpdateInput);
    }
    /**
     * Void a credit note
     * This endpoint voids an existing credit note.
     * <p><b>200</b> - Credit note voided
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec voidCreditNoteRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling voidCreditNote", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return apiClient.invokeAPI("/credit_notes/{lago_id}/void", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Void a credit note
     * This endpoint voids an existing credit note.
     * <p><b>200</b> - Credit note voided
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return CreditNote
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreditNote> voidCreditNote(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return voidCreditNoteRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Void a credit note
     * This endpoint voids an existing credit note.
     * <p><b>200</b> - Credit note voided
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return ResponseEntity&lt;CreditNote&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CreditNote>> voidCreditNoteWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<CreditNote> localVarReturnType = new ParameterizedTypeReference<CreditNote>() {};
        return voidCreditNoteRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Void a credit note
     * This endpoint voids an existing credit note.
     * <p><b>200</b> - Credit note voided
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId The credit note unique identifier, created by Lago.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec voidCreditNoteWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return voidCreditNoteRequestCreation(lagoId);
    }
}
