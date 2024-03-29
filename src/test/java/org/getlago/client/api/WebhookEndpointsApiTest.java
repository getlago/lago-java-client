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
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import java.util.UUID;
import org.openapitools.client.model.WebhookEndpoint;
import org.openapitools.client.model.WebhookEndpointCreateInput;
import org.openapitools.client.model.WebhookEndpointUpdateInput;
import org.openapitools.client.model.WebhookEndpointsPaginated;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for WebhookEndpointsApi
 */
@Ignore
public class WebhookEndpointsApiTest {

    private final WebhookEndpointsApi api = new WebhookEndpointsApi();

    
    /**
     * Create a webhook_endpoint
     *
     * This endpoint is used to create a webhook endpoint.
     */
    @Test
    public void createWebhookEndpointTest()  {
        WebhookEndpointCreateInput webhookEndpointCreateInput = null;
        WebhookEndpoint response = api.createWebhookEndpoint(webhookEndpointCreateInput).block();

        // TODO: test validations
    }
    
    /**
     * Delete a webhook endpoint
     *
     * This endpoint is used to delete an existing webhook endpoint.
     */
    @Test
    public void destroyWebhookEndpointTest()  {
        UUID lagoId = null;
        WebhookEndpoint response = api.destroyWebhookEndpoint(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * List all webhook endpoints
     *
     * This endpoint is used to list all webhook endpoints.
     */
    @Test
    public void findAllWebhookEndpointsTest()  {
        Integer page = null;
        Integer perPage = null;
        WebhookEndpointsPaginated response = api.findAllWebhookEndpoints(page, perPage).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve a webhook endpoint
     *
     * This endpoint is used to retrieve an existing webhook endpoint.
     */
    @Test
    public void findWebhookEndpointTest()  {
        UUID lagoId = null;
        WebhookEndpoint response = api.findWebhookEndpoint(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * Update a webhook endpoint
     *
     * This endpoint is used to update an existing webhook endpoint.
     */
    @Test
    public void updateWebhookEndpointTest()  {
        UUID lagoId = null;
        WebhookEndpointUpdateInput webhookEndpointUpdateInput = null;
        WebhookEndpoint response = api.updateWebhookEndpoint(lagoId, webhookEndpointUpdateInput).block();

        // TODO: test validations
    }
    
}
