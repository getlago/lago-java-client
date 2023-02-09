package com.lago.api.client.add.ons;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.add.ons.exceptions.ApplyException;
import com.lago.api.client.add.ons.exceptions.CreateException;
import com.lago.api.client.add.ons.exceptions.DestroyException;
import com.lago.api.client.add.ons.exceptions.FindException;
import com.lago.api.client.add.ons.exceptions.GetException;
import com.lago.api.client.add.ons.exceptions.UpdateException;
import com.lago.api.client.add.ons.types.AddOn;
import com.lago.api.client.add.ons.types.AddOnInput;
import com.lago.api.client.add.ons.types.AddOns;
import com.lago.api.client.add.ons.types.AppliedAddOn;
import com.lago.api.client.add.ons.types.ApplyAddOnInput;
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
import javax.ws.rs.DELETE;
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
@Path("")
interface addOnsService {
  @POST
  @Path("/add_ons")
  AddOn create(@HeaderParam("Authorization") BearerAuth auth, AddOnInput body) throws
      CreateException;

  @GET
  @Path("/add_ons/{code}")
  AddOn get(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code) throws
      GetException;

  @PUT
  @Path("/add_ons/{code}")
  AddOn update(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code,
      AddOnInput body) throws UpdateException;

  @DELETE
  @Path("/add_ons/{code}")
  AddOn destroy(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code)
      throws DestroyException;

  @GET
  @Path("/add_ons")
  AddOns find(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage)
      throws FindException;

  @POST
  @Path("/applied_add_ons")
  AppliedAddOn apply(@HeaderParam("Authorization") BearerAuth auth, ApplyAddOnInput body) throws
      ApplyException;

  static addOnsService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new addOnsServiceErrorDecoder()).target(addOnsService.class, url);
  }
}
