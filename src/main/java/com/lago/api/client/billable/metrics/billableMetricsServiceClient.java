package com.lago.api.client.billable.metrics;

import com.lago.api.client.billable.metrics.endpoints.Create;
import com.lago.api.client.billable.metrics.endpoints.Destroy;
import com.lago.api.client.billable.metrics.endpoints.FindMetricGroups;
import com.lago.api.client.billable.metrics.endpoints.Get;
import com.lago.api.client.billable.metrics.endpoints.GetAll;
import com.lago.api.client.billable.metrics.endpoints.Update;
import com.lago.api.client.billable.metrics.exceptions.CreateException;
import com.lago.api.client.billable.metrics.exceptions.DestroyException;
import com.lago.api.client.billable.metrics.exceptions.FindMetricGroupsException;
import com.lago.api.client.billable.metrics.exceptions.GetAllException;
import com.lago.api.client.billable.metrics.exceptions.GetException;
import com.lago.api.client.billable.metrics.exceptions.UpdateException;
import com.lago.api.client.billable.metrics.types.BillableMetric;
import com.lago.api.client.billable.metrics.types.BillableMetrics;
import com.lago.api.client.billable.metrics.types.Groups;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class billableMetricsServiceClient {
  private final billableMetricsService service;

  private final Optional<BearerAuth> auth;

  public billableMetricsServiceClient(String url) {
    this.service = billableMetricsService.getClient(url);
    this.auth = Optional.empty();
  }

  public billableMetricsServiceClient(String url, BearerAuth auth) {
    this.service = billableMetricsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Create a new billable metric</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   * @return BillableMetric
   */
  public BillableMetric create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Return a single billable metric</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return BillableMetric
   */
  public BillableMetric get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getCode());
  }

  /**
   * <p>Update an existing billable metric by code</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return BillableMetric
   */
  public BillableMetric update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getCode(), request.getBody());
  }

  /**
   * <p>Delete a billable metric</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws DestroyException Exception that wraps all possible endpoint errors 
   * @return BillableMetric
   */
  public BillableMetric destroy(Destroy.Request request) throws DestroyException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.destroy(authValue, request.getCode());
  }

  /**
   * <p>Get all billable metrics in certain organisation</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetAllException Exception that wraps all possible endpoint errors 
   * @return BillableMetrics
   */
  public BillableMetrics getAll(GetAll.Request request) throws GetAllException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.getAll(authValue, request.getPage(), request.getPerPage());
  }

  /**
   * <p>Find all billable metric groups in certain organisation</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindMetricGroupsException Exception that wraps all possible endpoint errors 
   * @return Groups
   */
  public Groups findMetricGroups(FindMetricGroups.Request request) throws
      FindMetricGroupsException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.findMetricGroups(authValue, request.getCode(), request.getPage(), request.getPerPage());
  }
}
