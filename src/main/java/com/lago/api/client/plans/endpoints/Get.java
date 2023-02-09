package com.lago.api.client.plans.endpoints;

import com.lago.api.core.BearerAuth;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class Get {
  private Get() {
  }

  public static final class Request {
    private final String code;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(String code, Optional<BearerAuth> authOverride) {
      this.code = code;
      this.authOverride = authOverride;
    }

    /**
     * @return Code of the existing plan
     */
    public String getCode() {
      return code;
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
      return code.equals(other.code) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.code, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Get.Request{" + "code: " + code + ", authOverride: " + authOverride + "}";
    }

    public static CodeStage builder() {
      return new Builder();
    }

    public interface CodeStage {
      _FinalStage code(String code);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BearerAuth> authOverride);

      _FinalStage authOverride(BearerAuth authOverride);
    }

    public static final class Builder implements CodeStage, _FinalStage {
      private String code;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        code(other.getCode());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>Code of the existing plan</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage code(String code) {
        this.code = code;
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
        return new Request(code, authOverride);
      }
    }
  }
}
