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
import org.openapitools.client.model.AppliedCoupon;
import org.openapitools.client.model.AppliedCouponInput;
import org.openapitools.client.model.AppliedCouponsPaginated;
import org.openapitools.client.model.Coupon;
import org.openapitools.client.model.CouponCreateInput;
import org.openapitools.client.model.CouponUpdateInput;
import org.openapitools.client.model.CouponsPaginated;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for CouponsApi
 */
@Ignore
public class CouponsApiTest {

    private final CouponsApi api = new CouponsApi();

    
    /**
     * Apply a coupon to a customer
     *
     * This endpoint is used to apply a specific coupon to a customer, before or during a subscription.
     */
    @Test
    public void applyCouponTest()  {
        AppliedCouponInput appliedCouponInput = null;
        AppliedCoupon response = api.applyCoupon(appliedCouponInput).block();

        // TODO: test validations
    }
    
    /**
     * Create a coupon
     *
     * This endpoint is used to create a coupon that can be then attached to a customer to create a discount.
     */
    @Test
    public void createCouponTest()  {
        CouponCreateInput couponCreateInput = null;
        Coupon response = api.createCoupon(couponCreateInput).block();

        // TODO: test validations
    }
    
    /**
     * Delete an applied coupon
     *
     * This endpoint is used to delete a specific coupon that has been applied to a customer.
     */
    @Test
    public void deleteAppliedCouponTest()  {
        String externalCustomerId = null;
        UUID appliedCouponId = null;
        AppliedCoupon response = api.deleteAppliedCoupon(externalCustomerId, appliedCouponId).block();

        // TODO: test validations
    }
    
    /**
     * Delete a coupon
     *
     * This endpoint is used to delete a coupon.
     */
    @Test
    public void destroyCouponTest()  {
        String code = null;
        Coupon response = api.destroyCoupon(code).block();

        // TODO: test validations
    }
    
    /**
     * List all applied coupons
     *
     * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
     */
    @Test
    public void findAllAppliedCouponsTest()  {
        Integer page = null;
        Integer perPage = null;
        String status = null;
        String externalCustomerId = null;
        AppliedCouponsPaginated response = api.findAllAppliedCoupons(page, perPage, status, externalCustomerId).block();

        // TODO: test validations
    }
    
    /**
     * List all coupons
     *
     * This endpoint is used to list all existing coupons.
     */
    @Test
    public void findAllCouponsTest()  {
        Integer page = null;
        Integer perPage = null;
        CouponsPaginated response = api.findAllCoupons(page, perPage).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve a coupon
     *
     * This endpoint is used to retrieve a specific coupon.
     */
    @Test
    public void findCouponTest()  {
        String code = null;
        Coupon response = api.findCoupon(code).block();

        // TODO: test validations
    }
    
    /**
     * Update a coupon
     *
     * This endpoint is used to update a coupon that can be then attached to a customer to create a discount.
     */
    @Test
    public void updateCouponTest()  {
        String code = null;
        CouponUpdateInput couponUpdateInput = null;
        Coupon response = api.updateCoupon(code, couponUpdateInput).block();

        // TODO: test validations
    }
    
}
