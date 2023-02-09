package com.lago.api.client.wallets;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.lago.api.client.wallets.exceptions.CreateException;
import com.lago.api.client.wallets.exceptions.CreateWalletTransactionException;
import com.lago.api.client.wallets.exceptions.DestroyException;
import com.lago.api.client.wallets.exceptions.FindException;
import com.lago.api.client.wallets.exceptions.FindWalletTransactionsException;
import com.lago.api.client.wallets.exceptions.GetException;
import com.lago.api.client.wallets.exceptions.UpdateException;
import com.lago.api.client.wallets.types.Wallet;
import com.lago.api.client.wallets.types.WalletInput;
import com.lago.api.client.wallets.types.WalletTransactionInput;
import com.lago.api.client.wallets.types.WalletTransactions;
import com.lago.api.client.wallets.types.WalletUpdateInput;
import com.lago.api.client.wallets.types.Wallets;
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
interface walletsService {
  @POST
  @Path("/wallets")
  Wallet create(@HeaderParam("Authorization") BearerAuth auth, WalletInput body) throws
      CreateException;

  @GET
  @Path("/wallets/{id}")
  Wallet get(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id) throws
      GetException;

  @PUT
  @Path("/wallets/{id}")
  Wallet update(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id,
      WalletUpdateInput body) throws UpdateException;

  @DELETE
  @Path("/wallets/{id}")
  Wallet destroy(@HeaderParam("Authorization") BearerAuth auth, @PathParam("id") String id) throws
      DestroyException;

  @GET
  @Path("/wallets")
  Wallets find(@HeaderParam("Authorization") BearerAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage,
      @QueryParam("external_customer_id") String externalCustomerId) throws FindException;

  @POST
  @Path("/wallet_transactions")
  WalletTransactions createWalletTransaction(@HeaderParam("Authorization") BearerAuth auth,
      WalletTransactionInput body) throws CreateWalletTransactionException;

  @GET
  @Path("/wallets/{id}/wallet_transactions")
  WalletTransactions findWalletTransactions(@HeaderParam("Authorization") BearerAuth auth,
      @PathParam("id") String id, @QueryParam("page") Optional<Integer> page,
      @QueryParam("per_page") Optional<Integer> perPage,
      @QueryParam("status") Optional<String> status,
      @QueryParam("transaction_type") Optional<String> transactionType) throws
      FindWalletTransactionsException;

  static walletsService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new walletsServiceErrorDecoder()).target(walletsService.class, url);
  }
}
