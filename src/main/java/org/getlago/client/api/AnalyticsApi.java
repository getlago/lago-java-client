package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.GrossRevenues;
import org.openapitools.client.model.InvoicedUsages;
import org.openapitools.client.model.Mrrs;
import org.openapitools.client.model.OutstandingInvoices;

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
public class AnalyticsApi {
    private ApiClient apiClient;

    public AnalyticsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AnalyticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List gross revenue
     * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
     * <p><b>200</b> - Gross revenue
     * <p><b>401</b> - Unauthorized error
     * @param currency Currency of revenue analytics. Format must be ISO 4217.
     * @param externalCustomerId The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level.
     * @return GrossRevenues
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllGrossRevenuesRequestCreation(Currency currency, String externalCustomerId) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "external_customer_id", externalCustomerId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GrossRevenues> localVarReturnType = new ParameterizedTypeReference<GrossRevenues>() {};
        return apiClient.invokeAPI("/analytics/gross_revenue", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List gross revenue
     * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
     * <p><b>200</b> - Gross revenue
     * <p><b>401</b> - Unauthorized error
     * @param currency Currency of revenue analytics. Format must be ISO 4217.
     * @param externalCustomerId The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level.
     * @return GrossRevenues
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GrossRevenues> findAllGrossRevenues(Currency currency, String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<GrossRevenues> localVarReturnType = new ParameterizedTypeReference<GrossRevenues>() {};
        return findAllGrossRevenuesRequestCreation(currency, externalCustomerId).bodyToMono(localVarReturnType);
    }

    /**
     * List gross revenue
     * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
     * <p><b>200</b> - Gross revenue
     * <p><b>401</b> - Unauthorized error
     * @param currency Currency of revenue analytics. Format must be ISO 4217.
     * @param externalCustomerId The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level.
     * @return ResponseEntity&lt;GrossRevenues&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GrossRevenues>> findAllGrossRevenuesWithHttpInfo(Currency currency, String externalCustomerId) throws WebClientResponseException {
        ParameterizedTypeReference<GrossRevenues> localVarReturnType = new ParameterizedTypeReference<GrossRevenues>() {};
        return findAllGrossRevenuesRequestCreation(currency, externalCustomerId).toEntity(localVarReturnType);
    }

    /**
     * List gross revenue
     * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
     * <p><b>200</b> - Gross revenue
     * <p><b>401</b> - Unauthorized error
     * @param currency Currency of revenue analytics. Format must be ISO 4217.
     * @param externalCustomerId The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllGrossRevenuesWithResponseSpec(Currency currency, String externalCustomerId) throws WebClientResponseException {
        return findAllGrossRevenuesRequestCreation(currency, externalCustomerId);
    }
    /**
     * List usage revenue
     * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
     * <p><b>200</b> - Invoiced usage
     * <p><b>401</b> - Unauthorized error
     * @param currency The currency of invoiced usage analytics. Format must be ISO 4217.
     * @return InvoicedUsages
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllInvoicedUsagesRequestCreation(Currency currency) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<InvoicedUsages> localVarReturnType = new ParameterizedTypeReference<InvoicedUsages>() {};
        return apiClient.invokeAPI("/analytics/invoiced_usage", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List usage revenue
     * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
     * <p><b>200</b> - Invoiced usage
     * <p><b>401</b> - Unauthorized error
     * @param currency The currency of invoiced usage analytics. Format must be ISO 4217.
     * @return InvoicedUsages
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InvoicedUsages> findAllInvoicedUsages(Currency currency) throws WebClientResponseException {
        ParameterizedTypeReference<InvoicedUsages> localVarReturnType = new ParameterizedTypeReference<InvoicedUsages>() {};
        return findAllInvoicedUsagesRequestCreation(currency).bodyToMono(localVarReturnType);
    }

    /**
     * List usage revenue
     * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
     * <p><b>200</b> - Invoiced usage
     * <p><b>401</b> - Unauthorized error
     * @param currency The currency of invoiced usage analytics. Format must be ISO 4217.
     * @return ResponseEntity&lt;InvoicedUsages&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<InvoicedUsages>> findAllInvoicedUsagesWithHttpInfo(Currency currency) throws WebClientResponseException {
        ParameterizedTypeReference<InvoicedUsages> localVarReturnType = new ParameterizedTypeReference<InvoicedUsages>() {};
        return findAllInvoicedUsagesRequestCreation(currency).toEntity(localVarReturnType);
    }

    /**
     * List usage revenue
     * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
     * <p><b>200</b> - Invoiced usage
     * <p><b>401</b> - Unauthorized error
     * @param currency The currency of invoiced usage analytics. Format must be ISO 4217.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllInvoicedUsagesWithResponseSpec(Currency currency) throws WebClientResponseException {
        return findAllInvoicedUsagesRequestCreation(currency);
    }
    /**
     * List MRR
     * This endpoint is used to list MRR.
     * <p><b>200</b> - MRR
     * <p><b>401</b> - Unauthorized error
     * @param currency Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and prior to the deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next three months) as well as to fees paid in arrears (allocated to the preceding three months). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next twelve months) and for fees paid in arrears (spread over the previous twelve months). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month.
     * @param months Show data only for given number of months.
     * @return Mrrs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllMrrsRequestCreation(Currency currency, Integer months) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "months", months));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Mrrs> localVarReturnType = new ParameterizedTypeReference<Mrrs>() {};
        return apiClient.invokeAPI("/analytics/mrr", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List MRR
     * This endpoint is used to list MRR.
     * <p><b>200</b> - MRR
     * <p><b>401</b> - Unauthorized error
     * @param currency Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and prior to the deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next three months) as well as to fees paid in arrears (allocated to the preceding three months). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next twelve months) and for fees paid in arrears (spread over the previous twelve months). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month.
     * @param months Show data only for given number of months.
     * @return Mrrs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Mrrs> findAllMrrs(Currency currency, Integer months) throws WebClientResponseException {
        ParameterizedTypeReference<Mrrs> localVarReturnType = new ParameterizedTypeReference<Mrrs>() {};
        return findAllMrrsRequestCreation(currency, months).bodyToMono(localVarReturnType);
    }

    /**
     * List MRR
     * This endpoint is used to list MRR.
     * <p><b>200</b> - MRR
     * <p><b>401</b> - Unauthorized error
     * @param currency Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and prior to the deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next three months) as well as to fees paid in arrears (allocated to the preceding three months). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next twelve months) and for fees paid in arrears (spread over the previous twelve months). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month.
     * @param months Show data only for given number of months.
     * @return ResponseEntity&lt;Mrrs&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Mrrs>> findAllMrrsWithHttpInfo(Currency currency, Integer months) throws WebClientResponseException {
        ParameterizedTypeReference<Mrrs> localVarReturnType = new ParameterizedTypeReference<Mrrs>() {};
        return findAllMrrsRequestCreation(currency, months).toEntity(localVarReturnType);
    }

    /**
     * List MRR
     * This endpoint is used to list MRR.
     * <p><b>200</b> - MRR
     * <p><b>401</b> - Unauthorized error
     * @param currency Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and prior to the deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next three months) as well as to fees paid in arrears (allocated to the preceding three months). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next twelve months) and for fees paid in arrears (spread over the previous twelve months). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month.
     * @param months Show data only for given number of months.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllMrrsWithResponseSpec(Currency currency, Integer months) throws WebClientResponseException {
        return findAllMrrsRequestCreation(currency, months);
    }
    /**
     * List outstanding invoices
     * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
     * <p><b>200</b> - Outstanding invoices
     * <p><b>401</b> - Unauthorized error
     * @param currency The currency of revenue analytics. Format must be ISO 4217.
     * @return OutstandingInvoices
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllOutstandingInvoicesRequestCreation(Currency currency) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<OutstandingInvoices> localVarReturnType = new ParameterizedTypeReference<OutstandingInvoices>() {};
        return apiClient.invokeAPI("/analytics/outstanding_invoices", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List outstanding invoices
     * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
     * <p><b>200</b> - Outstanding invoices
     * <p><b>401</b> - Unauthorized error
     * @param currency The currency of revenue analytics. Format must be ISO 4217.
     * @return OutstandingInvoices
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OutstandingInvoices> findAllOutstandingInvoices(Currency currency) throws WebClientResponseException {
        ParameterizedTypeReference<OutstandingInvoices> localVarReturnType = new ParameterizedTypeReference<OutstandingInvoices>() {};
        return findAllOutstandingInvoicesRequestCreation(currency).bodyToMono(localVarReturnType);
    }

    /**
     * List outstanding invoices
     * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
     * <p><b>200</b> - Outstanding invoices
     * <p><b>401</b> - Unauthorized error
     * @param currency The currency of revenue analytics. Format must be ISO 4217.
     * @return ResponseEntity&lt;OutstandingInvoices&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<OutstandingInvoices>> findAllOutstandingInvoicesWithHttpInfo(Currency currency) throws WebClientResponseException {
        ParameterizedTypeReference<OutstandingInvoices> localVarReturnType = new ParameterizedTypeReference<OutstandingInvoices>() {};
        return findAllOutstandingInvoicesRequestCreation(currency).toEntity(localVarReturnType);
    }

    /**
     * List outstanding invoices
     * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
     * <p><b>200</b> - Outstanding invoices
     * <p><b>401</b> - Unauthorized error
     * @param currency The currency of revenue analytics. Format must be ISO 4217.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllOutstandingInvoicesWithResponseSpec(Currency currency) throws WebClientResponseException {
        return findAllOutstandingInvoicesRequestCreation(currency);
    }
}
