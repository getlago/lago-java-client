package com.lago.api.client.credit.notes;

import com.lago.api.client.credit.notes.endpoints.Create;
import com.lago.api.client.credit.notes.endpoints.Download;
import com.lago.api.client.credit.notes.endpoints.Find;
import com.lago.api.client.credit.notes.endpoints.Get;
import com.lago.api.client.credit.notes.endpoints.Update;
import com.lago.api.client.credit.notes.endpoints.VoidCreditNote;
import com.lago.api.client.credit.notes.exceptions.CreateException;
import com.lago.api.client.credit.notes.exceptions.DownloadException;
import com.lago.api.client.credit.notes.exceptions.FindException;
import com.lago.api.client.credit.notes.exceptions.GetException;
import com.lago.api.client.credit.notes.exceptions.UpdateException;
import com.lago.api.client.credit.notes.exceptions.VoidCreditNoteException;
import com.lago.api.client.credit.notes.types.CreditNote;
import com.lago.api.client.credit.notes.types.CreditNotes;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class creditNotesServiceClient {
  private final creditNotesService service;

  private final Optional<BearerAuth> auth;

  public creditNotesServiceClient(String url) {
    this.service = creditNotesService.getClient(url);
    this.auth = Optional.empty();
  }

  public creditNotesServiceClient(String url, BearerAuth auth) {
    this.service = creditNotesService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Create a new credit note</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   * @return CreditNote
   */
  public CreditNote create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Return a single credit note</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return CreditNote
   */
  public CreditNote get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getId());
  }

  /**
   * <p>Update an existing credit note</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return CreditNote
   */
  public CreditNote update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getId(), request.getBody());
  }

  /**
   * <p>Download an existing credit note</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws DownloadException Exception that wraps all possible endpoint errors 
   * @return CreditNote
   */
  public CreditNote download(Download.Request request) throws DownloadException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.download(authValue, request.getId());
  }

  /**
   * <p>Void an existing credit note</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws VoidCreditNoteException Exception that wraps all possible endpoint errors 
   * @return CreditNote
   */
  public CreditNote voidCreditNote(VoidCreditNote.Request request) throws VoidCreditNoteException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.voidCreditNote(authValue, request.getId());
  }

  /**
   * <p>Find all credit notes in certain organisation</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindException Exception that wraps all possible endpoint errors 
   * @return CreditNotes
   */
  public CreditNotes find(Find.Request request) throws FindException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.find(authValue, request.getPage(), request.getPerPage(), request.getExternalCustomerId());
  }
}
