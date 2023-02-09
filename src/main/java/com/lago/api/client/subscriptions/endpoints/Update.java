package com.lago.api.client.subscriptions.endpoints;

import com.lago.api.client.subscriptions.types.SubscriptionUpdateInput;
import com.lago.api.core.BearerAuth;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class Update {
  private Update() {
  }

  public static final class Request {
    private final String externalId;

    private final SubscriptionUpdateInput body;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(String externalId, SubscriptionUpdateInput body, Optional<BearerAuth> authOverride) {
      this.externalId = externalId;
      this.body = body;
      this.authOverride = authOverride;
    }

    /**
     * @return External ID of the existing subscription
     */
    public String getExternalId() {
      return externalId;
    }

    public SubscriptionUpdateInput getBody() {
      return body;
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
      return externalId.equals(other.externalId) && body.equals(other.body) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.externalId, this.body, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Update.Request{" + "externalId: " + externalId + ", body: " + body + ", authOverride: " + authOverride + "}";
    }

    public static ExternalIdStage builder() {
      return new Builder();
    }

    public interface ExternalIdStage {
      BodyStage externalId(String externalId);

      Builder from(Request other);
    }

    public interface BodyStage {
      _FinalStage body(SubscriptionUpdateInput body);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BearerAuth> authOverride);

      _FinalStage authOverride(BearerAuth authOverride);
    }

    public static final class Builder implements ExternalIdStage, BodyStage, _FinalStage {
      private String externalId;

      private SubscriptionUpdateInput body;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        externalId(other.getExternalId());
        body(other.getBody());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>External ID of the existing subscription</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public BodyStage externalId(String externalId) {
        this.externalId = externalId;
        return this;
      }

      @Override
      public _FinalStage body(SubscriptionUpdateInput body) {
        this.body = body;
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
        return new Request(externalId, body, authOverride);
      }
    }
  }
}
