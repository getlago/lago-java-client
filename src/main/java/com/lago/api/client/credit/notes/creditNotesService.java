package com.lago.api.client.credit.notes;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.credit.notes.exceptions.CreateException;
import com.lago.api.client.credit.notes.exceptions.DownloadException;
import com.lago.api.client.credit.notes.exceptions.FindException;
import com.lago.api.client.credit.notes.exceptions.GetException;
import com.lago.api.client.credit.notes.exceptions.UpdateException;
import com.lago.api.client.credit.notes.exceptions.VoidCreditNoteException;
import com.lago.api.client.credit.notes.types.CreditNote;
import com.lago.api.client.credit.notes.types.CreditNoteInput;
import com.lago.api.client.credit.notes.types.CreditNoteUpdateInput;
import com.lago.api.client.credit.notes.types.CreditNotes;
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
@Path("/credit_notes")
interface creditNotesService {
  @POST
  @Path("")
  CreditNote create(@HeaderParam("Authorization") BearerAuth auth, CreditNoteInput body) throws
      CreateException;

  @GET
  @Path("/{id}")
  CreditNote get(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id) throws
      GetException;

  @PUT
  @Path("/{id}")
  CreditNote update(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id,
      CreditNoteUpdateInput body) throws UpdateException;

  @POST
  @Path("/{id}/download")
  CreditNote download(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id)
      throws DownloadException;

  @PUT
  @Path("/{id}/void")
  CreditNote voidCreditNote(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("id") String id) throws VoidCreditNoteException;

  @GET
  @Path("")
  CreditNotes find(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage,
      @QueryParam("external_customer_id") Optional<String> externalCustomerId) throws FindException;

  static creditNotesService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new creditNotesServiceErrorDecoder()).target(creditNotesService.class, url);
  }
}
