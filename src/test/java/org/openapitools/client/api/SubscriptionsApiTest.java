/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.46.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionCreateInput;
import org.openapitools.client.model.SubscriptionUpdateInput;
import org.openapitools.client.model.SubscriptionsPaginated;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsApi
 */
@Disabled
public class SubscriptionsApiTest {

    private final SubscriptionsApi api = new SubscriptionsApi();

    /**
     * Assign a plan to a customer
     *
     * This endpoint assigns a plan to a customer, creating or modifying a subscription. Ideal for initial subscriptions or plan changes (upgrades/downgrades).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSubscriptionTest() throws ApiException {
        SubscriptionCreateInput subscriptionCreateInput = null;
        Subscription response = api.createSubscription(subscriptionCreateInput);
        // TODO: test validations
    }

    /**
     * Terminate a subscription
     *
     * This endpoint allows you to terminate a subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void destroySubscriptionTest() throws ApiException {
        String externalId = null;
        String status = null;
        Subscription response = api.destroySubscription(externalId, status);
        // TODO: test validations
    }

    /**
     * List all subscriptions
     *
     * This endpoint retrieves all active subscriptions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllSubscriptionsTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        String planCode = null;
        List<String> status = null;
        SubscriptionsPaginated response = api.findAllSubscriptions(page, perPage, externalCustomerId, planCode, status);
        // TODO: test validations
    }

    /**
     * Update a subscription
     *
     * This endpoint allows you to update a subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSubscriptionTest() throws ApiException {
        String externalId = null;
        SubscriptionUpdateInput subscriptionUpdateInput = null;
        Subscription response = api.updateSubscription(externalId, subscriptionUpdateInput);
        // TODO: test validations
    }

}
