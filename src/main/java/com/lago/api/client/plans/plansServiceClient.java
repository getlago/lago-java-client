package com.lago.api.client.plans;

import com.lago.api.client.plans.endpoints.Create;
import com.lago.api.client.plans.endpoints.Destroy;
import com.lago.api.client.plans.endpoints.Find;
import com.lago.api.client.plans.endpoints.Get;
import com.lago.api.client.plans.endpoints.Update;
import com.lago.api.client.plans.exceptions.CreateException;
import com.lago.api.client.plans.exceptions.DestroyException;
import com.lago.api.client.plans.exceptions.FindException;
import com.lago.api.client.plans.exceptions.GetException;
import com.lago.api.client.plans.exceptions.UpdateException;
import com.lago.api.client.plans.types.Plan;
import com.lago.api.client.plans.types.Plans;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class plansServiceClient {
  private final plansService service;

  private final Optional<BearerAuth> auth;

  public plansServiceClient(String url) {
    this.service = plansService.getClient(url);
    this.auth = Optional.empty();
  }

  public plansServiceClient(String url, BearerAuth auth) {
    this.service = plansService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Create a new plan</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   * @return Plan
   */
  public Plan create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Return a single plan</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return Plan
   */
  public Plan get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getCode());
  }

  /**
   * <p>Update an existing plan by code</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return Plan
   */
  public Plan update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getCode(), request.getBody());
  }

  /**
   * <p>Delete a plan</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws DestroyException Exception that wraps all possible endpoint errors 
   * @return Plan
   */
  public Plan destroy(Destroy.Request request) throws DestroyException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.destroy(authValue, request.getCode());
  }

  /**
   * <p>Find all plans in certain organisation</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindException Exception that wraps all possible endpoint errors 
   * @return Plans
   */
  public Plans find(Find.Request request) throws FindException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.find(authValue, request.getPage(), request.getPerPage());
  }
}
