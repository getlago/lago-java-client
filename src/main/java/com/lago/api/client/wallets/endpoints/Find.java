package com.lago.api.client.wallets.endpoints;

import com.lago.api.core.BearerAuth;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class Find {
  private Find() {
  }

  public static final class Request {
    private final Optional<Integer> page;

    private final Optional<Integer> perPage;

    private final String externalCustomerId;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(Optional<Integer> page, Optional<Integer> perPage, String externalCustomerId,
        Optional<BearerAuth> authOverride) {
      this.page = page;
      this.perPage = perPage;
      this.externalCustomerId = externalCustomerId;
      this.authOverride = authOverride;
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

    /**
     * @return External customer ID
     */
    public String getExternalCustomerId() {
      return externalCustomerId;
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
      return page.equals(other.page) && perPage.equals(other.perPage) && externalCustomerId.equals(other.externalCustomerId) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.page, this.perPage, this.externalCustomerId, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Find.Request{" + "page: " + page + ", perPage: " + perPage + ", externalCustomerId: " + externalCustomerId + ", authOverride: " + authOverride + "}";
    }

    public static ExternalCustomerIdStage builder() {
      return new Builder();
    }

    public interface ExternalCustomerIdStage {
      _FinalStage externalCustomerId(String externalCustomerId);

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

    public static final class Builder implements ExternalCustomerIdStage, _FinalStage {
      private String externalCustomerId;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Optional<Integer> perPage = Optional.empty();

      private Optional<Integer> page = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        page(other.getPage());
        perPage(other.getPerPage());
        externalCustomerId(other.getExternalCustomerId());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>External customer ID</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage externalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
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
        return new Request(page, perPage, externalCustomerId, authOverride);
      }
    }
  }
}
