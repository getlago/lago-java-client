package com.lago.api.client.customers.endpoints;

import com.lago.api.core.BearerAuth;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class GetCurrentUsage {
  private GetCurrentUsage() {
  }

  public static final class Request {
    private final String customerExternalId;

    private final String externalSubscriptionId;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(String customerExternalId, String externalSubscriptionId,
        Optional<BearerAuth> authOverride) {
      this.customerExternalId = customerExternalId;
      this.externalSubscriptionId = externalSubscriptionId;
      this.authOverride = authOverride;
    }

    /**
     * @return External ID of the existing customer
     */
    public String getCustomerExternalId() {
      return customerExternalId;
    }

    /**
     * @return External subscription ID
     */
    public String getExternalSubscriptionId() {
      return externalSubscriptionId;
    }

    public Optional<BearerAuth> getAuthOverride() {
      return authOverride;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return customerExternalId.equals(other.customerExternalId) && externalSubscriptionId.equals(other.externalSubscriptionId) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.customerExternalId, this.externalSubscriptionId, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "GetCurrentUsage.Request{" + "customerExternalId: " + customerExternalId + ", externalSubscriptionId: " + externalSubscriptionId + ", authOverride: " + authOverride + "}";
    }

    public static CustomerExternalIdStage builder() {
      return new Builder();
    }

    public interface CustomerExternalIdStage {
      ExternalSubscriptionIdStage customerExternalId(String customerExternalId);

      Builder from(Request other);
    }

    public interface ExternalSubscriptionIdStage {
      _FinalStage externalSubscriptionId(String externalSubscriptionId);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BearerAuth> authOverride);

      _FinalStage authOverride(BearerAuth authOverride);
    }

    public static final class Builder implements CustomerExternalIdStage, ExternalSubscriptionIdStage, _FinalStage {
      private String customerExternalId;

      private String externalSubscriptionId;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        customerExternalId(other.getCustomerExternalId());
        externalSubscriptionId(other.getExternalSubscriptionId());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>External ID of the existing customer</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public ExternalSubscriptionIdStage customerExternalId(String customerExternalId) {
        this.customerExternalId = customerExternalId;
        return this;
      }

      /**
       * <p>External subscription ID</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage externalSubscriptionId(String externalSubscriptionId) {
        this.externalSubscriptionId = externalSubscriptionId;
        return this;
      }

      @Override
      public _FinalStage authOverride(BearerAuth authOverride) {
        this.authOverride = Optional.of(authOverride);
        return this;
      }

      @Override
      public _FinalStage authOverride(Optional<BearerAuth> authOverride) {
        this.authOverride = authOverride;
        return this;
      }

      @Override
      public Request build() {
        return new Request(customerExternalId, externalSubscriptionId, authOverride);
      }
    }
  }
}
