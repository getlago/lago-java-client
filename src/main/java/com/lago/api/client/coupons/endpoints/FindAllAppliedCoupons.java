package com.lago.api.client.coupons.endpoints;

import com.lago.api.client.coupons.types.CouponStatus;
import com.lago.api.core.BearerAuth;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class FindAllAppliedCoupons {
  private FindAllAppliedCoupons() {
  }

  public static final class Request {
    private final Optional<Integer> page;

    private final Optional<Integer> perPage;

    private final Optional<CouponStatus> status;

    private final Optional<String> externalCustomerId;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(Optional<Integer> page, Optional<Integer> perPage, Optional<CouponStatus> status,
        Optional<String> externalCustomerId, Optional<BearerAuth> authOverride) {
      this.page = page;
      this.perPage = perPage;
      this.status = status;
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
     * @return Applied coupon status
     */
    public Optional<CouponStatus> getStatus() {
      return status;
    }

    /**
     * @return External customer ID
     */
    public Optional<String> getExternalCustomerId() {
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
      return page.equals(other.page) && perPage.equals(other.perPage) && status.equals(other.status) && externalCustomerId.equals(other.externalCustomerId) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.page, this.perPage, this.status, this.externalCustomerId, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "FindAllAppliedCoupons.Request{" + "page: " + page + ", perPage: " + perPage + ", status: " + status + ", externalCustomerId: " + externalCustomerId + ", authOverride: " + authOverride + "}";
    }

    public static Builder builder() {
      return new Builder();
    }

    public static final class Builder {
      private Optional<Integer> page = Optional.empty();

      private Optional<Integer> perPage = Optional.empty();

      private Optional<CouponStatus> status = Optional.empty();

      private Optional<String> externalCustomerId = Optional.empty();

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      public Builder from(Request other) {
        page(other.getPage());
        perPage(other.getPerPage());
        status(other.getStatus());
        externalCustomerId(other.getExternalCustomerId());
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

      public Builder status(Optional<CouponStatus> status) {
        this.status = status;
        return this;
      }

      public Builder status(CouponStatus status) {
        this.status = Optional.of(status);
        return this;
      }

      public Builder externalCustomerId(Optional<String> externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
      }

      public Builder externalCustomerId(String externalCustomerId) {
        this.externalCustomerId = Optional.of(externalCustomerId);
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
        return new Request(page, perPage, status, externalCustomerId, authOverride);
      }
    }
  }
}
