package com.lago.api.client.organizations;

import com.lago.api.client.organizations.endpoints.Update;
import com.lago.api.client.organizations.exceptions.UpdateException;
import com.lago.api.client.organizations.types.Organization;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class organizationsServiceClient {
  private final organizationsService service;

  private final Optional<BearerAuth> auth;

  public organizationsServiceClient(String url) {
    this.service = organizationsService.getClient(url);
    this.auth = Optional.empty();
  }

  public organizationsServiceClient(String url, BearerAuth auth) {
    this.service = organizationsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Update an existing organization</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return Organization
   */
  public Organization update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getBody());
  }
}
