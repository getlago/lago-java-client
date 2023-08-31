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
import org.openapitools.client.model.ApiErrorForbidden;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.AppliedCoupon;
import org.openapitools.client.model.Customer;
import org.openapitools.client.model.CustomerCreateInput;
import org.openapitools.client.model.CustomerUsage;
import org.openapitools.client.model.CustomersPaginated;
import org.openapitools.client.model.GetCustomerPortalUrl200Response;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomersApi
 */
@Disabled
public class CustomersApiTest {

    private final CustomersApi api = new CustomersApi();

    /**
     * Create a customer
     *
     * This endpoint creates a new customer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomerTest() throws ApiException {
        CustomerCreateInput customerCreateInput = null;
        Customer response = api.createCustomer(customerCreateInput);
        // TODO: test validations
    }

    /**
     * Delete an applied coupon
     *
     * This endpoint is used to delete a specific coupon that has been applied to a customer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAppliedCouponTest() throws ApiException {
        String externalCustomerId = null;
        UUID appliedCouponId = null;
        AppliedCoupon response = api.deleteAppliedCoupon(externalCustomerId, appliedCouponId);
        // TODO: test validations
    }

    /**
     * Delete a customer
     *
     * This endpoint deletes an existing customer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void destroyCustomerTest() throws ApiException {
        String externalId = null;
        Customer response = api.destroyCustomer(externalId);
        // TODO: test validations
    }

    /**
     * List all customers
     *
     * This endpoint retrieves all existing customers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllCustomersTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        CustomersPaginated response = api.findAllCustomers(page, perPage);
        // TODO: test validations
    }

    /**
     * Retrieve a customer
     *
     * This endpoint retrieves an existing customer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findCustomerTest() throws ApiException {
        String externalId = null;
        Customer response = api.findCustomer(externalId);
        // TODO: test validations
    }

    /**
     * Retrieve customer current usage
     *
     * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findCustomerCurrentUsageTest() throws ApiException {
        String externalCustomerId = null;
        String externalSubscriptionId = null;
        CustomerUsage response = api.findCustomerCurrentUsage(externalCustomerId, externalSubscriptionId);
        // TODO: test validations
    }

    /**
     * Get a customer portal URL
     *
     * Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerPortalUrlTest() throws ApiException {
        String externalCustomerId = null;
        GetCustomerPortalUrl200Response response = api.getCustomerPortalUrl(externalCustomerId);
        // TODO: test validations
    }

}