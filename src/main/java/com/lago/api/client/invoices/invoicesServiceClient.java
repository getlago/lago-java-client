package com.lago.api.client.invoices;

import com.lago.api.client.invoices.endpoints.Download;
import com.lago.api.client.invoices.endpoints.Finalize;
import com.lago.api.client.invoices.endpoints.Find;
import com.lago.api.client.invoices.endpoints.Get;
import com.lago.api.client.invoices.endpoints.RefreshInvoice;
import com.lago.api.client.invoices.endpoints.RetryPayment;
import com.lago.api.client.invoices.endpoints.Update;
import com.lago.api.client.invoices.exceptions.DownloadException;
import com.lago.api.client.invoices.exceptions.FinalizeException;
import com.lago.api.client.invoices.exceptions.FindException;
import com.lago.api.client.invoices.exceptions.GetException;
import com.lago.api.client.invoices.exceptions.RefreshInvoiceException;
import com.lago.api.client.invoices.exceptions.RetryPaymentException;
import com.lago.api.client.invoices.exceptions.UpdateException;
import com.lago.api.client.invoices.types.Invoice;
import com.lago.api.client.invoices.types.Invoices;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class invoicesServiceClient {
  private final invoicesService service;

  private final Optional<BearerAuth> auth;

  public invoicesServiceClient(String url) {
    this.service = invoicesService.getClient(url);
    this.auth = Optional.empty();
  }

  public invoicesServiceClient(String url, BearerAuth auth) {
    this.service = invoicesService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Return a single invoice</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return Invoice
   */
  public Invoice get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getId());
  }

  /**
   * <p>Update an existing invoice</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return Invoice
   */
  public Invoice update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getId(), request.getBody());
  }

  /**
   * <p>Download an existing invoice</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws DownloadException Exception that wraps all possible endpoint errors 
   * @return Invoice
   */
  public Invoice download(Download.Request request) throws DownloadException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.download(authValue, request.getId());
  }

  /**
   * <p>Retry invoice payment</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws RetryPaymentException Exception that wraps all possible endpoint errors 
   */
  public void retryPayment(RetryPayment.Request request) throws RetryPaymentException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    this.service.retryPayment(authValue, request.getId());
  }

  /**
   * <p>Refresh a draft invoice</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws RefreshInvoiceException Exception that wraps all possible endpoint errors 
   * @return Invoice
   */
  public Invoice refreshInvoice(RefreshInvoice.Request request) throws RefreshInvoiceException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.refreshInvoice(authValue, request.getId());
  }

  /**
   * <p>Finalize a draft invoice</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FinalizeException Exception that wraps all possible endpoint errors 
   * @return Invoice
   */
  public Invoice finalize(Finalize.Request request) throws FinalizeException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.finalize(authValue, request.getId());
  }

  /**
   * <p>Find all invoices in certain organisation</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindException Exception that wraps all possible endpoint errors 
   * @return Invoices
   */
  public Invoices find(Find.Request request) throws FindException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.find(authValue, request.getPage(), request.getPerPage(), request.getExternalCustomerId(), request.getIssuingDateFrom(), request.getIssuingDateTo(), request.getStatus());
  }
}
