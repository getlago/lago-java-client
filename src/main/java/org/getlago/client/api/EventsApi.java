package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Event;
import org.openapitools.client.model.EventBatchInput;
import org.openapitools.client.model.EventEstimateFeesInput;
import org.openapitools.client.model.EventInput;
import org.openapitools.client.model.Fees;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class EventsApi {
    private ApiClient apiClient;

    public EventsApi() {
        this(new ApiClient());
    }

    @Autowired
    public EventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Batch multiple events
     * This endpoint is used for transmitting a batch of usage measurement events to multiple subscriptions for a single customer.
     * <p><b>200</b> - Event received
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventBatchInput Batch events payload
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec createBatchEventsRequestCreation(EventBatchInput eventBatchInput) throws WebClientResponseException {
        Object postBody = eventBatchInput;
        // verify the required parameter 'eventBatchInput' is set
        if (eventBatchInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'eventBatchInput' when calling createBatchEvents", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/events/batch", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Batch multiple events
     * This endpoint is used for transmitting a batch of usage measurement events to multiple subscriptions for a single customer.
     * <p><b>200</b> - Event received
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventBatchInput Batch events payload
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> createBatchEvents(EventBatchInput eventBatchInput) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return createBatchEventsRequestCreation(eventBatchInput).bodyToMono(localVarReturnType);
    }

    /**
     * Batch multiple events
     * This endpoint is used for transmitting a batch of usage measurement events to multiple subscriptions for a single customer.
     * <p><b>200</b> - Event received
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventBatchInput Batch events payload
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> createBatchEventsWithHttpInfo(EventBatchInput eventBatchInput) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return createBatchEventsRequestCreation(eventBatchInput).toEntity(localVarReturnType);
    }

    /**
     * Batch multiple events
     * This endpoint is used for transmitting a batch of usage measurement events to multiple subscriptions for a single customer.
     * <p><b>200</b> - Event received
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventBatchInput Batch events payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createBatchEventsWithResponseSpec(EventBatchInput eventBatchInput) throws WebClientResponseException {
        return createBatchEventsRequestCreation(eventBatchInput);
    }
    /**
     * Send usage events
     * This endpoint is used for transmitting usage measurement events to either a designated customer or a specific subscription.
     * <p><b>200</b> - Event
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventInput Event payload
     * @return Event
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createEventRequestCreation(EventInput eventInput) throws WebClientResponseException {
        Object postBody = eventInput;
        // verify the required parameter 'eventInput' is set
        if (eventInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'eventInput' when calling createEvent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return apiClient.invokeAPI("/events", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Send usage events
     * This endpoint is used for transmitting usage measurement events to either a designated customer or a specific subscription.
     * <p><b>200</b> - Event
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventInput Event payload
     * @return Event
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Event> createEvent(EventInput eventInput) throws WebClientResponseException {
        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return createEventRequestCreation(eventInput).bodyToMono(localVarReturnType);
    }

    /**
     * Send usage events
     * This endpoint is used for transmitting usage measurement events to either a designated customer or a specific subscription.
     * <p><b>200</b> - Event
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventInput Event payload
     * @return ResponseEntity&lt;Event&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Event>> createEventWithHttpInfo(EventInput eventInput) throws WebClientResponseException {
        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return createEventRequestCreation(eventInput).toEntity(localVarReturnType);
    }

    /**
     * Send usage events
     * This endpoint is used for transmitting usage measurement events to either a designated customer or a specific subscription.
     * <p><b>200</b> - Event
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventInput Event payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createEventWithResponseSpec(EventInput eventInput) throws WebClientResponseException {
        return createEventRequestCreation(eventInput);
    }
    /**
     * Estimate fees for a pay in advance charge
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple pay in advance charges
     * <p><b>200</b> - Fees estimate
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventEstimateFeesInput Event estimate payload
     * @return Fees
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec eventEstimateFeesRequestCreation(EventEstimateFeesInput eventEstimateFeesInput) throws WebClientResponseException {
        Object postBody = eventEstimateFeesInput;
        // verify the required parameter 'eventEstimateFeesInput' is set
        if (eventEstimateFeesInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'eventEstimateFeesInput' when calling eventEstimateFees", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Fees> localVarReturnType = new ParameterizedTypeReference<Fees>() {};
        return apiClient.invokeAPI("/events/estimate_fees", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Estimate fees for a pay in advance charge
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple pay in advance charges
     * <p><b>200</b> - Fees estimate
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventEstimateFeesInput Event estimate payload
     * @return Fees
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Fees> eventEstimateFees(EventEstimateFeesInput eventEstimateFeesInput) throws WebClientResponseException {
        ParameterizedTypeReference<Fees> localVarReturnType = new ParameterizedTypeReference<Fees>() {};
        return eventEstimateFeesRequestCreation(eventEstimateFeesInput).bodyToMono(localVarReturnType);
    }

    /**
     * Estimate fees for a pay in advance charge
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple pay in advance charges
     * <p><b>200</b> - Fees estimate
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventEstimateFeesInput Event estimate payload
     * @return ResponseEntity&lt;Fees&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Fees>> eventEstimateFeesWithHttpInfo(EventEstimateFeesInput eventEstimateFeesInput) throws WebClientResponseException {
        ParameterizedTypeReference<Fees> localVarReturnType = new ParameterizedTypeReference<Fees>() {};
        return eventEstimateFeesRequestCreation(eventEstimateFeesInput).toEntity(localVarReturnType);
    }

    /**
     * Estimate fees for a pay in advance charge
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple pay in advance charges
     * <p><b>200</b> - Fees estimate
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param eventEstimateFeesInput Event estimate payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec eventEstimateFeesWithResponseSpec(EventEstimateFeesInput eventEstimateFeesInput) throws WebClientResponseException {
        return eventEstimateFeesRequestCreation(eventEstimateFeesInput);
    }
    /**
     * Retrieve a specific event
     * This endpoint is used for retrieving a specific usage measurement event that has been sent to a customer or a subscription.
     * <p><b>200</b> - Event
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param transactionId This field represents the unique identifier sent for this specific event.
     * @return Event
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findEventRequestCreation(String transactionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'transactionId' when calling findEvent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("transaction_id", transactionId);

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

        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return apiClient.invokeAPI("/events/{transaction_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a specific event
     * This endpoint is used for retrieving a specific usage measurement event that has been sent to a customer or a subscription.
     * <p><b>200</b> - Event
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param transactionId This field represents the unique identifier sent for this specific event.
     * @return Event
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Event> findEvent(String transactionId) throws WebClientResponseException {
        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return findEventRequestCreation(transactionId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a specific event
     * This endpoint is used for retrieving a specific usage measurement event that has been sent to a customer or a subscription.
     * <p><b>200</b> - Event
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param transactionId This field represents the unique identifier sent for this specific event.
     * @return ResponseEntity&lt;Event&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Event>> findEventWithHttpInfo(String transactionId) throws WebClientResponseException {
        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return findEventRequestCreation(transactionId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a specific event
     * This endpoint is used for retrieving a specific usage measurement event that has been sent to a customer or a subscription.
     * <p><b>200</b> - Event
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param transactionId This field represents the unique identifier sent for this specific event.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findEventWithResponseSpec(String transactionId) throws WebClientResponseException {
        return findEventRequestCreation(transactionId);
    }
}
