package com.lago.api.client.organizations;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.organizations.exceptions.UpdateException;
import com.lago.api.client.organizations.types.Organization;
import com.lago.api.client.organizations.types.OrganizationInput;
import com.lago.api.core.BearerAuth;
import com.lago.api.core.ObjectMappers;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/organizations")
interface organizationsService {
  @PUT
  @Path("")
  Organization update(@HeaderParam("Authorization") BearerAuth auth, OrganizationInput body) throws
      UpdateException;

  static organizationsService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new organizationsServiceErrorDecoder()).target(organizationsService.class, url);
  }
}
