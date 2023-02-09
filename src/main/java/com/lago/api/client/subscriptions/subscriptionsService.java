package com.lago.api.client.subscriptions;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.subscriptions.exceptions.CreateException;
import com.lago.api.client.subscriptions.exceptions.DeleteException;
import com.lago.api.client.subscriptions.exceptions.FindException;
import com.lago.api.client.subscriptions.exceptions.UpdateException;
import com.lago.api.client.subscriptions.types.Subscription;
import com.lago.api.client.subscriptions.types.SubscriptionCreateInput;
import com.lago.api.client.subscriptions.types.SubscriptionUpdateInput;
import com.lago.api.client.subscriptions.types.Subscriptions;
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
@Path("/subscriptions")
interface subscriptionsService {
  @POST
  @Path("")
  Subscription create(@HeaderParam("Authorization") BearerAuth auth, SubscriptionCreateInput body)
      throws CreateException;

  @PUT
  @Path("/{external_id}")
  Subscription update(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("external_id") String externalId, SubscriptionUpdateInput body) throws
      UpdateException;

  @DELETE
  @Path("/{external_id}")
  Subscription delete(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("external_id") String externalId) throws DeleteException;

  @GET
  @Path("")
  Subscriptions find(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage,
      @QueryParam("external_customer_id") String externalCustomerId) throws FindException;

  static subscriptionsService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new subscriptionsServiceErrorDecoder()).target(subscriptionsService.class, url);
  }
}
