package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Invoice;
import org.openapitools.client.model.InvoiceOneOffCreateInput;
import org.openapitools.client.model.InvoiceUpdateInput;
import org.openapitools.client.model.InvoicesPaginated;
import java.time.LocalDate;
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
public class InvoicesApi {
    private ApiClient apiClient;

    public InvoicesApi() {
        this(new ApiClient());
    }

    @Autowired
    public InvoicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a one-off invoice
     * This endpoint is used for issuing a one-off invoice.
     * <p><b>200</b> - Invoice created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param invoiceOneOffCreateInput Invoice payload
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createInvoiceRequestCreation(InvoiceOneOffCreateInput invoiceOneOffCreateInput) throws WebClientResponseException {
        Object postBody = invoiceOneOffCreateInput;
        // verify the required parameter 'invoiceOneOffCreateInput' is set
        if (invoiceOneOffCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'invoiceOneOffCreateInput' when calling createInvoice", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return apiClient.invokeAPI("/invoices", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a one-off invoice
     * This endpoint is used for issuing a one-off invoice.
     * <p><b>200</b> - Invoice created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param invoiceOneOffCreateInput Invoice payload
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Invoice> createInvoice(InvoiceOneOffCreateInput invoiceOneOffCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return createInvoiceRequestCreation(invoiceOneOffCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a one-off invoice
     * This endpoint is used for issuing a one-off invoice.
     * <p><b>200</b> - Invoice created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param invoiceOneOffCreateInput Invoice payload
     * @return ResponseEntity&lt;Invoice&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Invoice>> createInvoiceWithHttpInfo(InvoiceOneOffCreateInput invoiceOneOffCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return createInvoiceRequestCreation(invoiceOneOffCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a one-off invoice
     * This endpoint is used for issuing a one-off invoice.
     * <p><b>200</b> - Invoice created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param invoiceOneOffCreateInput Invoice payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createInvoiceWithResponseSpec(InvoiceOneOffCreateInput invoiceOneOffCreateInput) throws WebClientResponseException {
        return createInvoiceRequestCreation(invoiceOneOffCreateInput);
    }
    /**
     * Download an invoice PDF
     * This endpoint is used for downloading a specific invoice PDF document.
     * <p><b>200</b> - Invoice PDF
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec downloadInvoiceRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling downloadInvoice", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return apiClient.invokeAPI("/invoices/{lago_id}/download", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Download an invoice PDF
     * This endpoint is used for downloading a specific invoice PDF document.
     * <p><b>200</b> - Invoice PDF
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Invoice> downloadInvoice(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return downloadInvoiceRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Download an invoice PDF
     * This endpoint is used for downloading a specific invoice PDF document.
     * <p><b>200</b> - Invoice PDF
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseEntity&lt;Invoice&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Invoice>> downloadInvoiceWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return downloadInvoiceRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Download an invoice PDF
     * This endpoint is used for downloading a specific invoice PDF document.
     * <p><b>200</b> - Invoice PDF
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec downloadInvoiceWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return downloadInvoiceRequestCreation(lagoId);
    }
    /**
     * Finalize a draft invoice
     * This endpoint is used for finalizing a draft invoice.
     * <p><b>200</b> - Invoice finalized
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec finalizeInvoiceRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling finalizeInvoice", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return apiClient.invokeAPI("/invoices/{lago_id}/finalize", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Finalize a draft invoice
     * This endpoint is used for finalizing a draft invoice.
     * <p><b>200</b> - Invoice finalized
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Invoice> finalizeInvoice(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return finalizeInvoiceRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Finalize a draft invoice
     * This endpoint is used for finalizing a draft invoice.
     * <p><b>200</b> - Invoice finalized
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseEntity&lt;Invoice&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Invoice>> finalizeInvoiceWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return finalizeInvoiceRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Finalize a draft invoice
     * This endpoint is used for finalizing a draft invoice.
     * <p><b>200</b> - Invoice finalized
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec finalizeInvoiceWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return finalizeInvoiceRequestCreation(lagoId);
    }
    /**
     * List all invoices
     * This endpoint is used for retrievign all invoices.
     * <p><b>200</b> - Invoices
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @param issuingDateFrom Filter invoices starting from a specific date.
     * @param issuingDateTo Filter invoices up to a specific date.
     * @param status Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;.
     * @param paymentStatus Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;.
     * @return InvoicesPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllInvoicesRequestCreation(Integer page, Integer perPage, String externalCustomerId, LocalDate issuingDateFrom, LocalDate issuingDateTo, String status, String paymentStatus) throws WebClientResponseException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issuing_date_from", issuingDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issuing_date_to", issuingDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payment_status", paymentStatus));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<InvoicesPaginated> localVarReturnType = new ParameterizedTypeReference<InvoicesPaginated>() {};
        return apiClient.invokeAPI("/invoices", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all invoices
     * This endpoint is used for retrievign all invoices.
     * <p><b>200</b> - Invoices
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @param issuingDateFrom Filter invoices starting from a specific date.
     * @param issuingDateTo Filter invoices up to a specific date.
     * @param status Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;.
     * @param paymentStatus Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;.
     * @return InvoicesPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InvoicesPaginated> findAllInvoices(Integer page, Integer perPage, String externalCustomerId, LocalDate issuingDateFrom, LocalDate issuingDateTo, String status, String paymentStatus) throws WebClientResponseException {
        ParameterizedTypeReference<InvoicesPaginated> localVarReturnType = new ParameterizedTypeReference<InvoicesPaginated>() {};
        return findAllInvoicesRequestCreation(page, perPage, externalCustomerId, issuingDateFrom, issuingDateTo, status, paymentStatus).bodyToMono(localVarReturnType);
    }

    /**
     * List all invoices
     * This endpoint is used for retrievign all invoices.
     * <p><b>200</b> - Invoices
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @param issuingDateFrom Filter invoices starting from a specific date.
     * @param issuingDateTo Filter invoices up to a specific date.
     * @param status Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;.
     * @param paymentStatus Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;.
     * @return ResponseEntity&lt;InvoicesPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<InvoicesPaginated>> findAllInvoicesWithHttpInfo(Integer page, Integer perPage, String externalCustomerId, LocalDate issuingDateFrom, LocalDate issuingDateTo, String status, String paymentStatus) throws WebClientResponseException {
        ParameterizedTypeReference<InvoicesPaginated> localVarReturnType = new ParameterizedTypeReference<InvoicesPaginated>() {};
        return findAllInvoicesRequestCreation(page, perPage, externalCustomerId, issuingDateFrom, issuingDateTo, status, paymentStatus).toEntity(localVarReturnType);
    }

    /**
     * List all invoices
     * This endpoint is used for retrievign all invoices.
     * <p><b>200</b> - Invoices
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @param issuingDateFrom Filter invoices starting from a specific date.
     * @param issuingDateTo Filter invoices up to a specific date.
     * @param status Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;.
     * @param paymentStatus Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllInvoicesWithResponseSpec(Integer page, Integer perPage, String externalCustomerId, LocalDate issuingDateFrom, LocalDate issuingDateTo, String status, String paymentStatus) throws WebClientResponseException {
        return findAllInvoicesRequestCreation(page, perPage, externalCustomerId, issuingDateFrom, issuingDateTo, status, paymentStatus);
    }
    /**
     * Retrieve an invoice
     * This endpoint is used for retrieving a specific invoice that has been issued.
     * <p><b>200</b> - Invoice
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findInvoiceRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling findInvoice", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return apiClient.invokeAPI("/invoices/{lago_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve an invoice
     * This endpoint is used for retrieving a specific invoice that has been issued.
     * <p><b>200</b> - Invoice
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Invoice> findInvoice(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return findInvoiceRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve an invoice
     * This endpoint is used for retrieving a specific invoice that has been issued.
     * <p><b>200</b> - Invoice
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseEntity&lt;Invoice&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Invoice>> findInvoiceWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return findInvoiceRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve an invoice
     * This endpoint is used for retrieving a specific invoice that has been issued.
     * <p><b>200</b> - Invoice
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findInvoiceWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return findInvoiceRequestCreation(lagoId);
    }
    /**
     * Refresh a draft invoice
     * This endpoint is used for refreshing a draft invoice.
     * <p><b>200</b> - Invoice refreshed
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec refreshInvoiceRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling refreshInvoice", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return apiClient.invokeAPI("/invoices/{lago_id}/refresh", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Refresh a draft invoice
     * This endpoint is used for refreshing a draft invoice.
     * <p><b>200</b> - Invoice refreshed
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Invoice> refreshInvoice(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return refreshInvoiceRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Refresh a draft invoice
     * This endpoint is used for refreshing a draft invoice.
     * <p><b>200</b> - Invoice refreshed
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseEntity&lt;Invoice&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Invoice>> refreshInvoiceWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return refreshInvoiceRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Refresh a draft invoice
     * This endpoint is used for refreshing a draft invoice.
     * <p><b>200</b> - Invoice refreshed
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec refreshInvoiceWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return refreshInvoiceRequestCreation(lagoId);
    }
    /**
     * Retry an invoice payment
     * This endpoint resends an invoice for collection and retry a payment.
     * <p><b>200</b> - Invoice payment retried
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec retryPaymentRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling retryPayment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/invoices/{lago_id}/retry_payment", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retry an invoice payment
     * This endpoint resends an invoice for collection and retry a payment.
     * <p><b>200</b> - Invoice payment retried
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> retryPayment(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return retryPaymentRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Retry an invoice payment
     * This endpoint resends an invoice for collection and retry a payment.
     * <p><b>200</b> - Invoice payment retried
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> retryPaymentWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return retryPaymentRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Retry an invoice payment
     * This endpoint resends an invoice for collection and retry a payment.
     * <p><b>200</b> - Invoice payment retried
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec retryPaymentWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return retryPaymentRequestCreation(lagoId);
    }
    /**
     * Update an invoice
     * This endpoint is used for updating an existing invoice.
     * <p><b>200</b> - Invoice updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @param invoiceUpdateInput Update an existing invoice
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateInvoiceRequestCreation(UUID lagoId, InvoiceUpdateInput invoiceUpdateInput) throws WebClientResponseException {
        Object postBody = invoiceUpdateInput;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling updateInvoice", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'invoiceUpdateInput' is set
        if (invoiceUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'invoiceUpdateInput' when calling updateInvoice", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return apiClient.invokeAPI("/invoices/{lago_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update an invoice
     * This endpoint is used for updating an existing invoice.
     * <p><b>200</b> - Invoice updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @param invoiceUpdateInput Update an existing invoice
     * @return Invoice
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Invoice> updateInvoice(UUID lagoId, InvoiceUpdateInput invoiceUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return updateInvoiceRequestCreation(lagoId, invoiceUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update an invoice
     * This endpoint is used for updating an existing invoice.
     * <p><b>200</b> - Invoice updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @param invoiceUpdateInput Update an existing invoice
     * @return ResponseEntity&lt;Invoice&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Invoice>> updateInvoiceWithHttpInfo(UUID lagoId, InvoiceUpdateInput invoiceUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Invoice> localVarReturnType = new ParameterizedTypeReference<Invoice>() {};
        return updateInvoiceRequestCreation(lagoId, invoiceUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update an invoice
     * This endpoint is used for updating an existing invoice.
     * <p><b>200</b> - Invoice updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice’s record within the Lago system.
     * @param invoiceUpdateInput Update an existing invoice
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateInvoiceWithResponseSpec(UUID lagoId, InvoiceUpdateInput invoiceUpdateInput) throws WebClientResponseException {
        return updateInvoiceRequestCreation(lagoId, invoiceUpdateInput);
    }
}
