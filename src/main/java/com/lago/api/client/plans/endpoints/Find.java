package com.lago.api.client.plans.endpoints;

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

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(Optional<Integer> page, Optional<Integer> perPage, Optional<BearerAuth> authOverride) {
      this.page = page;
      this.perPage = perPage;
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

    public Optional<BearerAuth> getAuthOverride() {
      return authOverride;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return page.equals(other.page) && perPage.equals(other.perPage) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.page, this.perPage, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Find.Request{" + "page: " + page + ", perPage: " + perPage + ", authOverride: " + authOverride + "}";
    }

    public static Builder builder() {
      return new Builder();
    }

    public static final class Builder {
      private Optional<Integer> page = Optional.empty();

      private Optional<Integer> perPage = Optional.empty();

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      public Builder from(Request other) {
        page(other.getPage());
        perPage(other.getPerPage());
        authOverride(other.getAuthOverride());
        return this;
      }

      public Builder page(Optional<Integer> page) {
        this.page = page;
        return this;
      }

      public Builder page(Integer page) {
        this.page = Optional.of(page);
        return this;
      }

      public Builder perPage(Optional<Integer> perPage) {
        this.perPage = perPage;
        return this;
      }

      public Builder perPage(Integer perPage) {
        this.perPage = Optional.of(perPage);
        return this;
      }

      public Builder authOverride(Optional<BearerAuth> authOverride) {
        this.authOverride = authOverride;
        return this;
      }

      public Builder authOverride(BearerAuth authOverride) {
        this.authOverride = Optional.of(authOverride);
        return this;
      }

      public Request build() {
        return new Request(page, perPage, authOverride);
      }
    }
  }
}
