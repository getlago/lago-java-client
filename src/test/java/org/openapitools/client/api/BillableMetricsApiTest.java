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
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.BillableMetric;
import org.openapitools.client.model.BillableMetricCreateInput;
import org.openapitools.client.model.BillableMetricUpdateInput;
import org.openapitools.client.model.BillableMetricsPaginated;
import org.openapitools.client.model.GroupsPaginated;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillableMetricsApi
 */
@Disabled
public class BillableMetricsApiTest {

    private final BillableMetricsApi api = new BillableMetricsApi();

    /**
     * Create a billable metric
     *
     * This endpoint creates a new billable metric representing a pricing component of your application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBillableMetricTest() throws ApiException {
        BillableMetricCreateInput billableMetricCreateInput = null;
        BillableMetric response = api.createBillableMetric(billableMetricCreateInput);
        // TODO: test validations
    }

    /**
     * Delete a billable metric
     *
     * This endpoint deletes an existing billable metric representing a pricing component of your application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void destroyBillableMetricTest() throws ApiException {
        String code = null;
        BillableMetric response = api.destroyBillableMetric(code);
        // TODO: test validations
    }

    /**
     * Find a billable metric&#39;s groups
     *
     * This endpoint retrieves all groups for a billable metric.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllBillableMetricGroupsTest() throws ApiException {
        String code = null;
        Integer page = null;
        Integer perPage = null;
        GroupsPaginated response = api.findAllBillableMetricGroups(code, page, perPage);
        // TODO: test validations
    }

    /**
     * List all billable metrics
     *
     * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllBillableMetricsTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        BillableMetricsPaginated response = api.findAllBillableMetrics(page, perPage);
        // TODO: test validations
    }

    /**
     * Retrieve a billable metric
     *
     * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findBillableMetricTest() throws ApiException {
        String code = null;
        BillableMetric response = api.findBillableMetric(code);
        // TODO: test validations
    }

    /**
     * Update a billable metric
     *
     * This endpoint updates an existing billable metric representing a pricing component of your application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBillableMetricTest() throws ApiException {
        String code = null;
        BillableMetricUpdateInput billableMetricUpdateInput = null;
        BillableMetric response = api.updateBillableMetric(code, billableMetricUpdateInput);
        // TODO: test validations
    }

}