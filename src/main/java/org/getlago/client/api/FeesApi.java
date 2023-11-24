package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.Fee;
import org.openapitools.client.model.FeeUpdateInput;
import org.openapitools.client.model.FeesPaginated;
import java.time.OffsetDateTime;
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
public class FeesApi {
    private ApiClient apiClient;

    public FeesApi() {
        this(new ApiClient());
    }

    @Autowired
    public FeesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List all fees
     * This endpoint is used for retrieving all fees that has been issued.
     * <p><b>200</b> - Successful response
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @param externalSubscriptionId External subscription ID
     * @param currency Filter results by fee’s currency.
     * @param feeType The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;.
     * @param billableMetricCode Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types.
     * @param paymentStatus Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;.
     * @param createdAtFrom Filter results created after creation date and time in UTC.
     * @param createdAtTo Filter results created before creation date and time in UTC.
     * @param succeededAtFrom Filter results with payment success after creation date and time in UTC.
     * @param succeededAtTo Filter results with payment success after creation date and time in UTC.
     * @param failedAtFrom Filter results with payment failure after creation date and time in UTC.
     * @param failedAtTo Filter results with payment failure after creation date and time in UTC.
     * @param refundedAtFrom Filter results with payment refund after creation date and time in UTC.
     * @param refundedAtTo Filter results with payment refund after creation date and time in UTC.
     * @return FeesPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllFeesRequestCreation(Integer page, Integer perPage, String externalCustomerId, String externalSubscriptionId, Currency currency, String feeType, String billableMetricCode, String paymentStatus, OffsetDateTime createdAtFrom, OffsetDateTime createdAtTo, OffsetDateTime succeededAtFrom, OffsetDateTime succeededAtTo, OffsetDateTime failedAtFrom, OffsetDateTime failedAtTo, OffsetDateTime refundedAtFrom, OffsetDateTime refundedAtTo) throws WebClientResponseException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "external_subscription_id", externalSubscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fee_type", feeType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "billable_metric_code", billableMetricCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payment_status", paymentStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "created_at_from", createdAtFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "created_at_to", createdAtTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "succeeded_at_from", succeededAtFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "succeeded_at_to", succeededAtTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "failed_at_from", failedAtFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "failed_at_to", failedAtTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "refunded_at_from", refundedAtFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "refunded_at_to", refundedAtTo));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<FeesPaginated> localVarReturnType = new ParameterizedTypeReference<FeesPaginated>() {};
        return apiClient.invokeAPI("/fees", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all fees
     * This endpoint is used for retrieving all fees that has been issued.
     * <p><b>200</b> - Successful response
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @param externalSubscriptionId External subscription ID
     * @param currency Filter results by fee’s currency.
     * @param feeType The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;.
     * @param billableMetricCode Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types.
     * @param paymentStatus Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;.
     * @param createdAtFrom Filter results created after creation date and time in UTC.
     * @param createdAtTo Filter results created before creation date and time in UTC.
     * @param succeededAtFrom Filter results with payment success after creation date and time in UTC.
     * @param succeededAtTo Filter results with payment success after creation date and time in UTC.
     * @param failedAtFrom Filter results with payment failure after creation date and time in UTC.
     * @param failedAtTo Filter results with payment failure after creation date and time in UTC.
     * @param refundedAtFrom Filter results with payment refund after creation date and time in UTC.
     * @param refundedAtTo Filter results with payment refund after creation date and time in UTC.
     * @return FeesPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FeesPaginated> findAllFees(Integer page, Integer perPage, String externalCustomerId, String externalSubscriptionId, Currency currency, String feeType, String billableMetricCode, String paymentStatus, OffsetDateTime createdAtFrom, OffsetDateTime createdAtTo, OffsetDateTime succeededAtFrom, OffsetDateTime succeededAtTo, OffsetDateTime failedAtFrom, OffsetDateTime failedAtTo, OffsetDateTime refundedAtFrom, OffsetDateTime refundedAtTo) throws WebClientResponseException {
        ParameterizedTypeReference<FeesPaginated> localVarReturnType = new ParameterizedTypeReference<FeesPaginated>() {};
        return findAllFeesRequestCreation(page, perPage, externalCustomerId, externalSubscriptionId, currency, feeType, billableMetricCode, paymentStatus, createdAtFrom, createdAtTo, succeededAtFrom, succeededAtTo, failedAtFrom, failedAtTo, refundedAtFrom, refundedAtTo).bodyToMono(localVarReturnType);
    }

    /**
     * List all fees
     * This endpoint is used for retrieving all fees that has been issued.
     * <p><b>200</b> - Successful response
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @param externalSubscriptionId External subscription ID
     * @param currency Filter results by fee’s currency.
     * @param feeType The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;.
     * @param billableMetricCode Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types.
     * @param paymentStatus Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;.
     * @param createdAtFrom Filter results created after creation date and time in UTC.
     * @param createdAtTo Filter results created before creation date and time in UTC.
     * @param succeededAtFrom Filter results with payment success after creation date and time in UTC.
     * @param succeededAtTo Filter results with payment success after creation date and time in UTC.
     * @param failedAtFrom Filter results with payment failure after creation date and time in UTC.
     * @param failedAtTo Filter results with payment failure after creation date and time in UTC.
     * @param refundedAtFrom Filter results with payment refund after creation date and time in UTC.
     * @param refundedAtTo Filter results with payment refund after creation date and time in UTC.
     * @return ResponseEntity&lt;FeesPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<FeesPaginated>> findAllFeesWithHttpInfo(Integer page, Integer perPage, String externalCustomerId, String externalSubscriptionId, Currency currency, String feeType, String billableMetricCode, String paymentStatus, OffsetDateTime createdAtFrom, OffsetDateTime createdAtTo, OffsetDateTime succeededAtFrom, OffsetDateTime succeededAtTo, OffsetDateTime failedAtFrom, OffsetDateTime failedAtTo, OffsetDateTime refundedAtFrom, OffsetDateTime refundedAtTo) throws WebClientResponseException {
        ParameterizedTypeReference<FeesPaginated> localVarReturnType = new ParameterizedTypeReference<FeesPaginated>() {};
        return findAllFeesRequestCreation(page, perPage, externalCustomerId, externalSubscriptionId, currency, feeType, billableMetricCode, paymentStatus, createdAtFrom, createdAtTo, succeededAtFrom, succeededAtTo, failedAtFrom, failedAtTo, refundedAtFrom, refundedAtTo).toEntity(localVarReturnType);
    }

    /**
     * List all fees
     * This endpoint is used for retrieving all fees that has been issued.
     * <p><b>200</b> - Successful response
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param externalCustomerId Unique identifier assigned to the customer in your application.
     * @param externalSubscriptionId External subscription ID
     * @param currency Filter results by fee’s currency.
     * @param feeType The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;.
     * @param billableMetricCode Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types.
     * @param paymentStatus Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;.
     * @param createdAtFrom Filter results created after creation date and time in UTC.
     * @param createdAtTo Filter results created before creation date and time in UTC.
     * @param succeededAtFrom Filter results with payment success after creation date and time in UTC.
     * @param succeededAtTo Filter results with payment success after creation date and time in UTC.
     * @param failedAtFrom Filter results with payment failure after creation date and time in UTC.
     * @param failedAtTo Filter results with payment failure after creation date and time in UTC.
     * @param refundedAtFrom Filter results with payment refund after creation date and time in UTC.
     * @param refundedAtTo Filter results with payment refund after creation date and time in UTC.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllFeesWithResponseSpec(Integer page, Integer perPage, String externalCustomerId, String externalSubscriptionId, Currency currency, String feeType, String billableMetricCode, String paymentStatus, OffsetDateTime createdAtFrom, OffsetDateTime createdAtTo, OffsetDateTime succeededAtFrom, OffsetDateTime succeededAtTo, OffsetDateTime failedAtFrom, OffsetDateTime failedAtTo, OffsetDateTime refundedAtFrom, OffsetDateTime refundedAtTo) throws WebClientResponseException {
        return findAllFeesRequestCreation(page, perPage, externalCustomerId, externalSubscriptionId, currency, feeType, billableMetricCode, paymentStatus, createdAtFrom, createdAtTo, succeededAtFrom, succeededAtTo, failedAtFrom, failedAtTo, refundedAtFrom, refundedAtTo);
    }
    /**
     * Retrieve a specific fee
     * This endpoint is used for retrieving a specific fee that has been issued.
     * <p><b>200</b> - Fee
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
     * @return Fee
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findFeeRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling findFee", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Fee> localVarReturnType = new ParameterizedTypeReference<Fee>() {};
        return apiClient.invokeAPI("/fees/{lago_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a specific fee
     * This endpoint is used for retrieving a specific fee that has been issued.
     * <p><b>200</b> - Fee
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
     * @return Fee
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Fee> findFee(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Fee> localVarReturnType = new ParameterizedTypeReference<Fee>() {};
        return findFeeRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a specific fee
     * This endpoint is used for retrieving a specific fee that has been issued.
     * <p><b>200</b> - Fee
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
     * @return ResponseEntity&lt;Fee&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Fee>> findFeeWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Fee> localVarReturnType = new ParameterizedTypeReference<Fee>() {};
        return findFeeRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a specific fee
     * This endpoint is used for retrieving a specific fee that has been issued.
     * <p><b>200</b> - Fee
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findFeeWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return findFeeRequestCreation(lagoId);
    }
    /**
     * Update a fee
     * This endpoint is used for updating a specific fee that has been issued.
     * <p><b>200</b> - Fee updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
     * @param feeUpdateInput Fee payload
     * @return Fee
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateFeeRequestCreation(UUID lagoId, FeeUpdateInput feeUpdateInput) throws WebClientResponseException {
        Object postBody = feeUpdateInput;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling updateFee", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Fee> localVarReturnType = new ParameterizedTypeReference<Fee>() {};
        return apiClient.invokeAPI("/fees/{lago_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a fee
     * This endpoint is used for updating a specific fee that has been issued.
     * <p><b>200</b> - Fee updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
     * @param feeUpdateInput Fee payload
     * @return Fee
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Fee> updateFee(UUID lagoId, FeeUpdateInput feeUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Fee> localVarReturnType = new ParameterizedTypeReference<Fee>() {};
        return updateFeeRequestCreation(lagoId, feeUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a fee
     * This endpoint is used for updating a specific fee that has been issued.
     * <p><b>200</b> - Fee updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
     * @param feeUpdateInput Fee payload
     * @return ResponseEntity&lt;Fee&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Fee>> updateFeeWithHttpInfo(UUID lagoId, FeeUpdateInput feeUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Fee> localVarReturnType = new ParameterizedTypeReference<Fee>() {};
        return updateFeeRequestCreation(lagoId, feeUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a fee
     * This endpoint is used for updating a specific fee that has been issued.
     * <p><b>200</b> - Fee updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
     * @param feeUpdateInput Fee payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateFeeWithResponseSpec(UUID lagoId, FeeUpdateInput feeUpdateInput) throws WebClientResponseException {
        return updateFeeRequestCreation(lagoId, feeUpdateInput);
    }
}
