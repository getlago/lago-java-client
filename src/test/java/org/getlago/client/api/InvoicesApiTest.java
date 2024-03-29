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
import org.openapitools.client.model.Invoice;
import org.openapitools.client.model.InvoiceOneOffCreateInput;
import org.openapitools.client.model.InvoiceUpdateInput;
import org.openapitools.client.model.InvoicesPaginated;
import java.time.LocalDate;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for InvoicesApi
 */
@Ignore
public class InvoicesApiTest {

    private final InvoicesApi api = new InvoicesApi();

    
    /**
     * Create a one-off invoice
     *
     * This endpoint is used for issuing a one-off invoice.
     */
    @Test
    public void createInvoiceTest()  {
        InvoiceOneOffCreateInput invoiceOneOffCreateInput = null;
        Invoice response = api.createInvoice(invoiceOneOffCreateInput).block();

        // TODO: test validations
    }
    
    /**
     * Download an invoice PDF
     *
     * This endpoint is used for downloading a specific invoice PDF document.
     */
    @Test
    public void downloadInvoiceTest()  {
        UUID lagoId = null;
        Invoice response = api.downloadInvoice(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * Finalize a draft invoice
     *
     * This endpoint is used for finalizing a draft invoice.
     */
    @Test
    public void finalizeInvoiceTest()  {
        UUID lagoId = null;
        Invoice response = api.finalizeInvoice(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * List all invoices
     *
     * This endpoint is used for retrievign all invoices.
     */
    @Test
    public void findAllInvoicesTest()  {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        LocalDate issuingDateFrom = null;
        LocalDate issuingDateTo = null;
        String status = null;
        String paymentStatus = null;
        InvoicesPaginated response = api.findAllInvoices(page, perPage, externalCustomerId, issuingDateFrom, issuingDateTo, status, paymentStatus).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve an invoice
     *
     * This endpoint is used for retrieving a specific invoice that has been issued.
     */
    @Test
    public void findInvoiceTest()  {
        UUID lagoId = null;
        Invoice response = api.findInvoice(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * Refresh a draft invoice
     *
     * This endpoint is used for refreshing a draft invoice.
     */
    @Test
    public void refreshInvoiceTest()  {
        UUID lagoId = null;
        Invoice response = api.refreshInvoice(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * Retry an invoice payment
     *
     * This endpoint resends an invoice for collection and retry a payment.
     */
    @Test
    public void retryPaymentTest()  {
        UUID lagoId = null;
        api.retryPayment(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * Update an invoice
     *
     * This endpoint is used for updating an existing invoice.
     */
    @Test
    public void updateInvoiceTest()  {
        UUID lagoId = null;
        InvoiceUpdateInput invoiceUpdateInput = null;
        Invoice response = api.updateInvoice(lagoId, invoiceUpdateInput).block();

        // TODO: test validations
    }
    
}
