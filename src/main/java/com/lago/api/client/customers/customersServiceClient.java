package com.lago.api.client.customers;

import com.lago.api.client.customers.endpoints.Create;
import com.lago.api.client.customers.endpoints.Find;
import com.lago.api.client.customers.endpoints.Get;
import com.lago.api.client.customers.endpoints.GetCurrentUsage;
import com.lago.api.client.customers.exceptions.CreateException;
import com.lago.api.client.customers.exceptions.FindException;
import com.lago.api.client.customers.exceptions.GetCurrentUsageException;
import com.lago.api.client.customers.exceptions.GetException;
import com.lago.api.client.customers.types.Customer;
import com.lago.api.client.customers.types.CustomerUsage;
import com.lago.api.client.customers.types.Customers;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class customersServiceClient {
  private final customersService service;

  private final Optional<BearerAuth> auth;

  public customersServiceClient(String url) {
    this.service = customersService.getClient(url);
    this.auth = Optional.empty();
  }

  public customersServiceClient(String url, BearerAuth auth) {
    this.service = customersService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Create a new customer</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   * @return Customer
   */
  public Customer create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Return a single customer</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return Customer
   */
  public Customer get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getExternalId());
  }

  /**
   * <p>Return a customer current usage</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetCurrentUsageException Exception that wraps all possible endpoint errors 
   * @return CustomerUsage
   */
  public CustomerUsage getCurrentUsage(GetCurrentUsage.Request request) throws
      GetCurrentUsageException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.getCurrentUsage(authValue, request.getCustomerExternalId(), request.getExternalSubscriptionId());
  }

  /**
   * <p>Find all customers in certain organisation</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindException Exception that wraps all possible endpoint errors 
   * @return Customers
   */
  public Customers find(Find.Request request) throws FindException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.find(authValue, request.getPage(), request.getPerPage());
  }
}
