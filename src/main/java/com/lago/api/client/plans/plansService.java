package com.lago.api.client.plans;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.plans.exceptions.CreateException;
import com.lago.api.client.plans.exceptions.DestroyException;
import com.lago.api.client.plans.exceptions.FindException;
import com.lago.api.client.plans.exceptions.GetException;
import com.lago.api.client.plans.exceptions.UpdateException;
import com.lago.api.client.plans.types.Plan;
import com.lago.api.client.plans.types.PlanInput;
import com.lago.api.client.plans.types.Plans;
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
@Path("/plans")
interface plansService {
  @POST
  @Path("")
  Plan create(@HeaderParam("Authorization") BearerAuth auth, PlanInput body) throws CreateException;

  @GET
  @Path("/{code}")
  Plan get(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code) throws
      GetException;

  @PUT
  @Path("/{code}")
  Plan update(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code,
      PlanInput body) throws UpdateException;

  @DELETE
  @Path("/{code}")
  Plan destroy(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code) throws
      DestroyException;

  @GET
  @Path("")
  Plans find(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage)
      throws FindException;

  static plansService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new plansServiceErrorDecoder()).target(plansService.class, url);
  }
}
