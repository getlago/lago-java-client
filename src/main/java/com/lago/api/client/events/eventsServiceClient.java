package com.lago.api.client.events;

import com.lago.api.client.events.endpoints.Create;
import com.lago.api.client.events.endpoints.CreateBatchEvents;
import com.lago.api.client.events.endpoints.Get;
import com.lago.api.client.events.exceptions.CreateBatchEventsException;
import com.lago.api.client.events.exceptions.CreateException;
import com.lago.api.client.events.exceptions.GetException;
import com.lago.api.client.events.types.Event;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class eventsServiceClient {
  private final eventsService service;

  private final Optional<BearerAuth> auth;

  public eventsServiceClient(String url) {
    this.service = eventsService.getClient(url);
    this.auth = Optional.empty();
  }

  public eventsServiceClient(String url, BearerAuth auth) {
    this.service = eventsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Create a new event</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   */
  public void create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Create batch events</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateBatchEventsException Exception that wraps all possible endpoint errors 
   */
  public void createBatchEvents(CreateBatchEvents.Request request) throws
      CreateBatchEventsException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    this.service.createBatchEvents(authValue, request.getBody());
  }

  /**
   * <p>Return a single event</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return Event
   */
  public Event get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getId());
  }
}
