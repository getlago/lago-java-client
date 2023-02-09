package com.lago.api.client.events;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.events.exceptions.CreateBatchEventsException;
import com.lago.api.client.events.exceptions.CreateException;
import com.lago.api.client.events.exceptions.GetException;
import com.lago.api.client.events.types.BatchEventInput;
import com.lago.api.client.events.types.Event;
import com.lago.api.client.events.types.EventInput;
import com.lago.api.core.BearerAuth;
import com.lago.api.core.ObjectMappers;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/events")
interface eventsService {
  @POST
  @Path("")
  void create(@HeaderParam("Authorization") BearerAuth auth, EventInput body) throws
      CreateException;

  @POST
  @Path("/batch")
  void createBatchEvents(@HeaderParam("Authorization") BearerAuth auth, BatchEventInput body) throws
      CreateBatchEventsException;

  @GET
  @Path("/{id}")
  Event get(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id) throws
      GetException;

  static eventsService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new eventsServiceErrorDecoder()).target(eventsService.class, url);
  }
}
