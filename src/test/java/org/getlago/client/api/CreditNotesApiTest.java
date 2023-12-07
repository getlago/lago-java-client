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
import org.openapitools.client.model.CreditNote;
import org.openapitools.client.model.CreditNoteCreateInput;
import org.openapitools.client.model.CreditNoteEstimateInput;
import org.openapitools.client.model.CreditNoteEstimated;
import org.openapitools.client.model.CreditNoteUpdateInput;
import org.openapitools.client.model.CreditNotes;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for CreditNotesApi
 */
@Ignore
public class CreditNotesApiTest {

    private final CreditNotesApi api = new CreditNotesApi();

    
    /**
     * Create a credit note
     *
     * This endpoint creates a new credit note.
     */
    @Test
    public void createCreditNoteTest()  {
        CreditNoteCreateInput creditNoteCreateInput = null;
        CreditNote response = api.createCreditNote(creditNoteCreateInput).block();

        // TODO: test validations
    }
    
    /**
     * Download a credit note PDF
     *
     * This endpoint downloads the PDF of an existing credit note.
     */
    @Test
    public void downloadCreditNoteTest()  {
        UUID lagoId = null;
        CreditNote response = api.downloadCreditNote(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * Estimate amounts for a new credit note
     *
     * This endpoint allows you to retrieve amounts for a new credit note creation.
     */
    @Test
    public void estimateCreditNoteTest()  {
        CreditNoteEstimateInput creditNoteEstimateInput = null;
        CreditNoteEstimated response = api.estimateCreditNote(creditNoteEstimateInput).block();

        // TODO: test validations
    }
    
    /**
     * List all credit notes
     *
     * This endpoint list all existing credit notes.
     */
    @Test
    public void findAllCreditNotesTest()  {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        CreditNotes response = api.findAllCreditNotes(page, perPage, externalCustomerId).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve a credit note
     *
     * This endpoint retrieves an existing credit note.
     */
    @Test
    public void findCreditNoteTest()  {
        String lagoId = null;
        CreditNote response = api.findCreditNote(lagoId).block();

        // TODO: test validations
    }
    
    /**
     * Update a credit note
     *
     * This endpoint updates an existing credit note.
     */
    @Test
    public void updateCreditNoteTest()  {
        String lagoId = null;
        CreditNoteUpdateInput creditNoteUpdateInput = null;
        CreditNote response = api.updateCreditNote(lagoId, creditNoteUpdateInput).block();

        // TODO: test validations
    }
    
    /**
     * Void a credit note
     *
     * This endpoint voids an existing credit note.
     */
    @Test
    public void voidCreditNoteTest()  {
        UUID lagoId = null;
        CreditNote response = api.voidCreditNote(lagoId).block();

        // TODO: test validations
    }
    
}
