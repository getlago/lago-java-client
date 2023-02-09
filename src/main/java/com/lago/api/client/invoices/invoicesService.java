package com.lago.api.client.invoices;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.invoices.exceptions.DownloadException;
import com.lago.api.client.invoices.exceptions.FinalizeException;
import com.lago.api.client.invoices.exceptions.FindException;
import com.lago.api.client.invoices.exceptions.GetException;
import com.lago.api.client.invoices.exceptions.RefreshInvoiceException;
import com.lago.api.client.invoices.exceptions.RetryPaymentException;
import com.lago.api.client.invoices.exceptions.UpdateException;
import com.lago.api.client.invoices.types.Invoice;
import com.lago.api.client.invoices.types.InvoiceInput;
import com.lago.api.client.invoices.types.InvoiceStatus;
import com.lago.api.client.invoices.types.Invoices;
import com.lago.api.core.BearerAuth;
import com.lago.api.core.ObjectMappers;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/invoices")
interface invoicesService {
  @GET
  @Path("/{id}")
  Invoice get(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id) throws
      GetException;

  @PUT
  @Path("/{id}")
  Invoice update(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id,
      InvoiceInput body) throws UpdateException;

  @POST
  @Path("/{id}/download")
  Invoice download(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id) throws
      DownloadException;

  @POST
  @Path("/{id}/retry_payment")
  void retryPayment(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id)
      throws RetryPaymentException;

  @PUT
  @Path("/{id}/refresh")
  Invoice refreshInvoice(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id)
      throws RefreshInvoiceException;

  @PUT
  @Path("/{id}/finalize")
  Invoice finalize(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id) throws
      FinalizeException;

  @GET
  @Path("")
  Invoices find(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage,
      @QueryParam("external_customer_id") Optional<String> externalCustomerId,
      @QueryParam("issuing_date_from") Optional<String> issuingDateFrom,
      @QueryParam("issuing_date_to") Optional<String> issuingDateTo,
      @QueryParam("status") Optional<InvoiceStatus> status) throws FindException;

  static invoicesService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new invoicesServiceErrorDecoder()).target(invoicesService.class, url);
  }
}
