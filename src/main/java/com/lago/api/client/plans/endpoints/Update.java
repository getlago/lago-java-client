package com.lago.api.client.plans.endpoints;

import com.lago.api.client.plans.types.PlanInput;
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
    private final String code;

    private final PlanInput body;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(String code, PlanInput body, Optional<BearerAuth> authOverride) {
      this.code = code;
      this.body = body;
      this.authOverride = authOverride;
    }

    /**
     * @return Code of the existing plan
     */
    public String getCode() {
      return code;
    }

    public PlanInput getBody() {
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
      return code.equals(other.code) && body.equals(other.body) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.code, this.body, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Update.Request{" + "code: " + code + ", body: " + body + ", authOverride: " + authOverride + "}";
    }

    public static CodeStage builder() {
      return new Builder();
    }

    public interface CodeStage {
      BodyStage code(String code);

      Builder from(Request other);
    }

    public interface BodyStage {
      _FinalStage body(PlanInput body);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BearerAuth> authOverride);

      _FinalStage authOverride(BearerAuth authOverride);
    }

    public static final class Builder implements CodeStage, BodyStage, _FinalStage {
      private String code;

      private PlanInput body;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        code(other.getCode());
        body(other.getBody());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>Code of the existing plan</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public BodyStage code(String code) {
        this.code = code;
        return this;
      }

      @Override
      public _FinalStage body(PlanInput body) {
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
        return new Request(code, body, authOverride);
      }
    }
  }
}
