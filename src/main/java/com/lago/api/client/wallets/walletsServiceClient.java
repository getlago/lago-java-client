package com.lago.api.client.wallets;

import com.lago.api.client.wallets.endpoints.Create;
import com.lago.api.client.wallets.endpoints.CreateWalletTransaction;
import com.lago.api.client.wallets.endpoints.Destroy;
import com.lago.api.client.wallets.endpoints.Find;
import com.lago.api.client.wallets.endpoints.FindWalletTransactions;
import com.lago.api.client.wallets.endpoints.Get;
import com.lago.api.client.wallets.endpoints.Update;
import com.lago.api.client.wallets.exceptions.CreateException;
import com.lago.api.client.wallets.exceptions.CreateWalletTransactionException;
import com.lago.api.client.wallets.exceptions.DestroyException;
import com.lago.api.client.wallets.exceptions.FindException;
import com.lago.api.client.wallets.exceptions.FindWalletTransactionsException;
import com.lago.api.client.wallets.exceptions.GetException;
import com.lago.api.client.wallets.exceptions.UpdateException;
import com.lago.api.client.wallets.types.Wallet;
import com.lago.api.client.wallets.types.WalletTransactions;
import com.lago.api.client.wallets.types.Wallets;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class walletsServiceClient {
  private final walletsService service;

  private final Optional<BearerAuth> auth;

  public walletsServiceClient(String url) {
    this.service = walletsService.getClient(url);
    this.auth = Optional.empty();
  }

  public walletsServiceClient(String url, BearerAuth auth) {
    this.service = walletsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Create a new wallet</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   * @return Wallet
   */
  public Wallet create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Return a wallet</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return Wallet
   */
  public Wallet get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getId());
  }

  /**
   * <p>Update an existing wallet</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return Wallet
   */
  public Wallet update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getId(), request.getBody());
  }

  /**
   * <p>Delete a wallet</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws DestroyException Exception that wraps all possible endpoint errors 
   * @return Wallet
   */
  public Wallet destroy(Destroy.Request request) throws DestroyException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.destroy(authValue, request.getId());
  }

  /**
   * <p>Find all wallets for certain customer</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindException Exception that wraps all possible endpoint errors 
   * @return Wallets
   */
  public Wallets find(Find.Request request) throws FindException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.find(authValue, request.getPage(), request.getPerPage(), request.getExternalCustomerId());
  }

  /**
   * <p>Create a new wallet transaction</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateWalletTransactionException Exception that wraps all possible endpoint errors 
   * @return WalletTransactions
   */
  public WalletTransactions createWalletTransaction(CreateWalletTransaction.Request request) throws
      CreateWalletTransactionException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.createWalletTransaction(authValue, request.getBody());
  }

  /**
   * <p>Find all wallet transactions for certain wallet</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindWalletTransactionsException Exception that wraps all possible endpoint errors 
   * @return WalletTransactions
   */
  public WalletTransactions findWalletTransactions(FindWalletTransactions.Request request) throws
      FindWalletTransactionsException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.findWalletTransactions(authValue, request.getId(), request.getPage(), request.getPerPage(), request.getStatus(), request.getTransactionType());
  }
}
