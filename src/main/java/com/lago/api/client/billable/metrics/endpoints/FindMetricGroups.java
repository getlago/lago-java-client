package com.lago.api.client.billable.metrics.endpoints;

import com.lago.api.core.BearerAuth;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class FindMetricGroups {
  private FindMetricGroups() {
  }

  public static final class Request {
    private final String code;

    private final Optional<Integer> page;

    private final Optional<Integer> perPage;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(String code, Optional<Integer> page, Optional<Integer> perPage,
        Optional<BearerAuth> authOverride) {
      this.code = code;
      this.page = page;
      this.perPage = perPage;
      this.authOverride = authOverride;
    }

    /**
     * @return Code of the existing billable metric
     */
    public String getCode() {
      return code;
    }

    /**
     * @return Number of page
     */
    public Optional<Integer> getPage() {
      return page;
    }

    /**
     * @return Number of records per page
     */
    public Optional<Integer> getPerPage() {
      return perPage;
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
      return code.equals(other.code) && page.equals(other.page) && perPage.equals(other.perPage) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.code, this.page, this.perPage, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "FindMetricGroups.Request{" + "code: " + code + ", page: " + page + ", perPage: " + perPage + ", authOverride: " + authOverride + "}";
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

      _FinalStage page(Optional<Integer> page);

      _FinalStage page(Integer page);

      _FinalStage perPage(Optional<Integer> perPage);

      _FinalStage perPage(Integer perPage);

      _FinalStage authOverride(Optional<BearerAuth> authOverride);

      _FinalStage authOverride(BearerAuth authOverride);
    }

    public static final class Builder implements CodeStage, _FinalStage {
      private String code;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Optional<Integer> perPage = Optional.empty();

      private Optional<Integer> page = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        code(other.getCode());
        page(other.getPage());
        perPage(other.getPerPage());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>Code of the existing billable metric</p>
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

      /**
       * <p>Number of records per page</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage perPage(Integer perPage) {
        this.perPage = Optional.of(perPage);
        return this;
      }

      @Override
      public _FinalStage perPage(Optional<Integer> perPage) {
        this.perPage = perPage;
        return this;
      }

      /**
       * <p>Number of page</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage page(Integer page) {
        this.page = Optional.of(page);
        return this;
      }

      @Override
      public _FinalStage page(Optional<Integer> page) {
        this.page = page;
        return this;
      }

      @Override
      public Request build() {
        return new Request(code, page, perPage, authOverride);
      }
    }
  }
}
