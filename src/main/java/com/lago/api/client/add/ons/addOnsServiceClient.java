package com.lago.api.client.add.ons;

import com.lago.api.client.add.ons.endpoints.Apply;
import com.lago.api.client.add.ons.endpoints.Create;
import com.lago.api.client.add.ons.endpoints.Destroy;
import com.lago.api.client.add.ons.endpoints.Find;
import com.lago.api.client.add.ons.endpoints.Get;
import com.lago.api.client.add.ons.endpoints.Update;
import com.lago.api.client.add.ons.exceptions.ApplyException;
import com.lago.api.client.add.ons.exceptions.CreateException;
import com.lago.api.client.add.ons.exceptions.DestroyException;
import com.lago.api.client.add.ons.exceptions.FindException;
import com.lago.api.client.add.ons.exceptions.GetException;
import com.lago.api.client.add.ons.exceptions.UpdateException;
import com.lago.api.client.add.ons.types.AddOn;
import com.lago.api.client.add.ons.types.AddOns;
import com.lago.api.client.add.ons.types.AppliedAddOn;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class addOnsServiceClient {
  private final addOnsService service;

  private final Optional<BearerAuth> auth;

  public addOnsServiceClient(String url) {
    this.service = addOnsService.getClient(url);
    this.auth = Optional.empty();
  }

  public addOnsServiceClient(String url, BearerAuth auth) {
    this.service = addOnsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Create a new add-on</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   * @return AddOn
   */
  public AddOn create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Return a single add-on</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return AddOn
   */
  public AddOn get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getCode());
  }

  /**
   * <p>Update an existing add-on by code</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return AddOn
   */
  public AddOn update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getCode(), request.getBody());
  }

  /**
   * <p>Delete an add-on</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws DestroyException Exception that wraps all possible endpoint errors 
   * @return AddOn
   */
  public AddOn destroy(Destroy.Request request) throws DestroyException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.destroy(authValue, request.getCode());
  }

  /**
   * <p>Get all add-ons in certain organisation</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindException Exception that wraps all possible endpoint errors 
   * @return AddOns
   */
  public AddOns find(Find.Request request) throws FindException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.find(authValue, request.getPage(), request.getPerPage());
  }

  /**
   * <p>Apply an add-on to a customer</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws ApplyException Exception that wraps all possible endpoint errors 
   * @return AppliedAddOn
   */
  public AppliedAddOn apply(Apply.Request request) throws ApplyException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.apply(authValue, request.getBody());
  }
}
