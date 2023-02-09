package com.lago.api.client.subscriptions.endpoints;

import com.lago.api.core.BearerAuth;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class Delete {
  private Delete() {
  }

  public static final class Request {
    private final String externalId;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(String externalId, Optional<BearerAuth> authOverride) {
      this.externalId = externalId;
      this.authOverride = authOverride;
    }

    /**
     * @return External ID of the existing subscription
     */
    public String getExternalId() {
      return externalId;
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
      return externalId.equals(other.externalId) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.externalId, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Delete.Request{" + "externalId: " + externalId + ", authOverride: " + authOverride + "}";
    }

    public static ExternalIdStage builder() {
      return new Builder();
    }

    public interface ExternalIdStage {
      _FinalStage externalId(String externalId);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BearerAuth> authOverride);

      _FinalStage authOverride(BearerAuth authOverride);
    }

    public static final class Builder implements ExternalIdStage, _FinalStage {
      private String externalId;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        externalId(other.getExternalId());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>External ID of the existing subscription</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage externalId(String externalId) {
        this.externalId = externalId;
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
        return new Request(externalId, authOverride);
      }
    }
  }
}
