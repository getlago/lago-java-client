package com.lago.api.client.billable.metrics;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.billable.metrics.exceptions.CreateException;
import com.lago.api.client.billable.metrics.exceptions.DestroyException;
import com.lago.api.client.billable.metrics.exceptions.FindMetricGroupsException;
import com.lago.api.client.billable.metrics.exceptions.GetAllException;
import com.lago.api.client.billable.metrics.exceptions.GetException;
import com.lago.api.client.billable.metrics.exceptions.UpdateException;
import com.lago.api.client.billable.metrics.types.BillableMetric;
import com.lago.api.client.billable.metrics.types.BillableMetricInput;
import com.lago.api.client.billable.metrics.types.BillableMetrics;
import com.lago.api.client.billable.metrics.types.Groups;
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
@Path("/billable_metrics")
interface billableMetricsService {
  @POST
  @Path("")
  BillableMetric create(@HeaderParam("Authorization") BearerAuth auth, BillableMetricInput body)
      throws CreateException;

  @GET
  @Path("/{code}")
  BillableMetric get(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code)
      throws GetException;

  @PUT
  @Path("/{code}")
  BillableMetric update(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("code") String code, BillableMetricInput body) throws UpdateException;

  @DELETE
  @Path("/{code}")
  BillableMetric destroy(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("code") String code) throws DestroyException;

  @GET
  @Path("")
  BillableMetrics getAll(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage)
      throws GetAllException;

  @GET
  @Path("/{code}/groups")
  Groups findMetricGroups(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("code") String code, @QueryParam("page") Optional<Integer> page,
      @QueryParam("per_page") Optional<Integer> perPage) throws FindMetricGroupsException;

  static billableMetricsService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new billableMetricsServiceErrorDecoder()).target(billableMetricsService.class, url);
  }
}
