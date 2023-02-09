package com.lago.api.client.coupons;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.coupons.exceptions.ApplyException;
import com.lago.api.client.coupons.exceptions.CreateException;
import com.lago.api.client.coupons.exceptions.DestroyException;
import com.lago.api.client.coupons.exceptions.FindAllAppliedCouponsException;
import com.lago.api.client.coupons.exceptions.FindException;
import com.lago.api.client.coupons.exceptions.GetException;
import com.lago.api.client.coupons.exceptions.UpdateException;
import com.lago.api.client.coupons.types.AppliedCoupon;
import com.lago.api.client.coupons.types.AppliedCouponInput;
import com.lago.api.client.coupons.types.AppliedCoupons;
import com.lago.api.client.coupons.types.Coupon;
import com.lago.api.client.coupons.types.CouponInput;
import com.lago.api.client.coupons.types.CouponStatus;
import com.lago.api.client.coupons.types.Coupons;
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
interface couponsService {
  @POST
  @Path("/coupons")
  Coupon create(@HeaderParam("Authorization") BearerAuth auth, CouponInput body) throws
      CreateException;

  @GET
  @Path("/coupons/{code}")
  Coupon get(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code) throws
      GetException;

  @PUT
  @Path("/coupons/{code}")
  Coupon update(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code,
      CouponInput body) throws UpdateException;

  @DELETE
  @Path("/coupons/{code}")
  Coupon destroy(@HeaderParam("Authorization") BearerAuth auth, @PathParam("code") String code)
      throws DestroyException;

  @GET
  @Path("/coupons")
  Coupons find(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage)
      throws FindException;

  @POST
  @Path("/applied_coupons")
  AppliedCoupon apply(@HeaderParam("Authorization") BearerAuth auth, AppliedCouponInput body) throws
      ApplyException;

  @GET
  @Path("/applied_coupons")
  AppliedCoupons findAllAppliedCoupons(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage,
      @QueryParam("status") Optional<CouponStatus> status,
      @QueryParam("external_customer_id") Optional<String> externalCustomerId) throws
      FindAllAppliedCouponsException;

  static couponsService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new couponsServiceErrorDecoder()).target(couponsService.class, url);
  }
}
