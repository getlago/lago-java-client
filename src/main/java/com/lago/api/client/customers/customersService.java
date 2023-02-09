package com.lago.api.client.customers;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.customers.exceptions.CreateException;
import com.lago.api.client.customers.exceptions.FindException;
import com.lago.api.client.customers.exceptions.GetCurrentUsageException;
import com.lago.api.client.customers.exceptions.GetException;
import com.lago.api.client.customers.types.Customer;
import com.lago.api.client.customers.types.CustomerInput;
import com.lago.api.client.customers.types.CustomerUsage;
import com.lago.api.client.customers.types.Customers;
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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/customers")
interface customersService {
  @POST
  @Path("")
  Customer create(@HeaderParam("Authorization") BearerAuth auth, CustomerInput body) throws
      CreateException;

  @GET
  @Path("/{external_id}")
  Customer get(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("external_id") String externalId) throws GetException;

  @GET
  @Path("/{customer_external_id}/current_usage")
  CustomerUsage getCurrentUsage(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("customer_external_id") String customerExternalId,
      @QueryParam("external_subscription_id") String externalSubscriptionId) throws
      GetCurrentUsageException;

  @GET
  @Path("")
  Customers find(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage)
      throws FindException;

  static customersService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new customersServiceErrorDecoder()).target(customersService.class, url);
  }
}
