package com.lago.api;

import com.lago.api.client.add.ons.addOnsServiceClient;
import com.lago.api.client.billable.metrics.billableMetricsServiceClient;
import com.lago.api.client.coupons.couponsServiceClient;
import com.lago.api.client.credit.notes.creditNotesServiceClient;
import com.lago.api.client.customers.customersServiceClient;
import com.lago.api.client.events.eventsServiceClient;
import com.lago.api.client.invoices.invoicesServiceClient;
import com.lago.api.client.organizations.organizationsServiceClient;
import com.lago.api.client.plans.plansServiceClient;
import com.lago.api.client.subscriptions.subscriptionsServiceClient;
import com.lago.api.client.wallets.walletsServiceClient;
import com.lago.api.core.BearerAuth;
import com.lago.api.core.Environment;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public final class LagoApiClient {
  private final Supplier<addOnsServiceClient> addOnsServiceClient;

  private final Supplier<billableMetricsServiceClient> billableMetricsServiceClient;

  private final Supplier<couponsServiceClient> couponsServiceClient;

  private final Supplier<creditNotesServiceClient> creditNotesServiceClient;

  private final Supplier<customersServiceClient> customersServiceClient;

  private final Supplier<eventsServiceClient> eventsServiceClient;

  private final Supplier<invoicesServiceClient> invoicesServiceClient;

  private final Supplier<organizationsServiceClient> organizationsServiceClient;

  private final Supplier<plansServiceClient> plansServiceClient;

  private final Supplier<subscriptionsServiceClient> subscriptionsServiceClient;

  private final Supplier<walletsServiceClient> walletsServiceClient;

  public LagoApiClient(BearerAuth auth) {
    this(Environment.PRODUCTION, auth);
  }

  public LagoApiClient(Environment environment, BearerAuth auth) {
    this.organizationsServiceClient = memoize(() -> new organizationsServiceClient(environment.getUrl(), auth));
    this.couponsServiceClient = memoize(() -> new couponsServiceClient(environment.getUrl(), auth));
    this.subscriptionsServiceClient = memoize(() -> new subscriptionsServiceClient(environment.getUrl(), auth));
    this.addOnsServiceClient = memoize(() -> new addOnsServiceClient(environment.getUrl(), auth));
    this.invoicesServiceClient = memoize(() -> new invoicesServiceClient(environment.getUrl(), auth));
    this.plansServiceClient = memoize(() -> new plansServiceClient(environment.getUrl(), auth));
    this.billableMetricsServiceClient = memoize(() -> new billableMetricsServiceClient(environment.getUrl(), auth));
    this.walletsServiceClient = memoize(() -> new walletsServiceClient(environment.getUrl(), auth));
    this.creditNotesServiceClient = memoize(() -> new creditNotesServiceClient(environment.getUrl(), auth));
    this.eventsServiceClient = memoize(() -> new eventsServiceClient(environment.getUrl(), auth));
    this.customersServiceClient = memoize(() -> new customersServiceClient(environment.getUrl(), auth));
  }

  public final addOnsServiceClient addOns() {
    return this.addOnsServiceClient.get();
  }

  public final billableMetricsServiceClient billableMetrics() {
    return this.billableMetricsServiceClient.get();
  }

  public final couponsServiceClient coupons() {
    return this.couponsServiceClient.get();
  }

  public final creditNotesServiceClient creditNotes() {
    return this.creditNotesServiceClient.get();
  }

  public final customersServiceClient customers() {
    return this.customersServiceClient.get();
  }

  public final eventsServiceClient events() {
    return this.eventsServiceClient.get();
  }

  public final invoicesServiceClient invoices() {
    return this.invoicesServiceClient.get();
  }

  public final organizationsServiceClient organizations() {
    return this.organizationsServiceClient.get();
  }

  public final plansServiceClient plans() {
    return this.plansServiceClient.get();
  }

  public final subscriptionsServiceClient subscriptions() {
    return this.subscriptionsServiceClient.get();
  }

  public final walletsServiceClient wallets() {
    return this.walletsServiceClient.get();
  }

  private static <T> Supplier<T> memoize(Supplier<T> delegate) {
    AtomicReference<T> value = new AtomicReference<>();
    return () ->  {
      T val = value.get();
      if (val == null) {
        val = value.updateAndGet(cur -> cur == null ? Objects.requireNonNull(delegate.get()) : cur);
      }
      return val;
    } ;
  }
}
