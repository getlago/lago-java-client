package com.lago.api.client.subscriptions;

import com.lago.api.client.subscriptions.endpoints.Create;
import com.lago.api.client.subscriptions.endpoints.Delete;
import com.lago.api.client.subscriptions.endpoints.Find;
import com.lago.api.client.subscriptions.endpoints.Update;
import com.lago.api.client.subscriptions.exceptions.CreateException;
import com.lago.api.client.subscriptions.exceptions.DeleteException;
import com.lago.api.client.subscriptions.exceptions.FindException;
import com.lago.api.client.subscriptions.exceptions.UpdateException;
import com.lago.api.client.subscriptions.types.Subscription;
import com.lago.api.client.subscriptions.types.Subscriptions;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class subscriptionsServiceClient {
  private final subscriptionsService service;

  private final Optional<BearerAuth> auth;

  public subscriptionsServiceClient(String url) {
    this.service = subscriptionsService.getClient(url);
    this.auth = Optional.empty();
  }

  public subscriptionsServiceClient(String url, BearerAuth auth) {
    this.service = subscriptionsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Assign a plan to a customer</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   * @return Subscription
   */
  public Subscription create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Update an existing subscription by external ID</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return Subscription
   */
  public Subscription update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getExternalId(), request.getBody());
  }

  /**
   * <p>Terminate a subscription</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws DeleteException Exception that wraps all possible endpoint errors 
   * @return Subscription
   */
  public Subscription delete(Delete.Request request) throws DeleteException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.delete(authValue, request.getExternalId());
  }

  /**
   * <p>Find all suscriptions for certain customer</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindException Exception that wraps all possible endpoint errors 
   * @return Subscriptions
   */
  public Subscriptions find(Find.Request request) throws FindException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.find(authValue, request.getPage(), request.getPerPage(), request.getExternalCustomerId());
  }
}
