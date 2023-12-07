/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.2-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.getlago.client.api;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Event;
import org.openapitools.client.model.EventBatchInput;
import org.openapitools.client.model.EventEstimateFeesInput;
import org.openapitools.client.model.EventInput;
import org.openapitools.client.model.Fees;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for EventsApi
 */
@Ignore
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * Batch multiple events
     *
     * This endpoint is used for transmitting a batch of usage measurement events to multiple subscriptions for a single customer.
     */
    @Test
    public void createBatchEventsTest()  {
        EventBatchInput eventBatchInput = null;
        api.createBatchEvents(eventBatchInput).block();

        // TODO: test validations
    }
    
    /**
     * Send usage events
     *
     * This endpoint is used for transmitting usage measurement events to either a designated customer or a specific subscription.
     */
    @Test
    public void createEventTest()  {
        EventInput eventInput = null;
        Event response = api.createEvent(eventInput).block();

        // TODO: test validations
    }
    
    /**
     * Estimate fees for a pay in advance charge
     *
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple pay in advance charges
     */
    @Test
    public void eventEstimateFeesTest()  {
        EventEstimateFeesInput eventEstimateFeesInput = null;
        Fees response = api.eventEstimateFees(eventEstimateFeesInput).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve a specific event
     *
     * This endpoint is used for retrieving a specific usage measurement event that has been sent to a customer or a subscription.
     */
    @Test
    public void findEventTest()  {
        String transactionId = null;
        Event response = api.findEvent(transactionId).block();

        // TODO: test validations
    }
    
}
