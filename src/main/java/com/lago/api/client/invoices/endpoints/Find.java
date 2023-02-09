package com.lago.api.client.invoices.endpoints;

import com.lago.api.client.invoices.types.InvoiceStatus;
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

    private final Optional<String> externalCustomerId;

    private final Optional<String> issuingDateFrom;

    private final Optional<String> issuingDateTo;

    private final Optional<InvoiceStatus> status;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(Optional<Integer> page, Optional<Integer> perPage, Optional<String> externalCustomerId,
        Optional<String> issuingDateFrom, Optional<String> issuingDateTo,
        Optional<InvoiceStatus> status, Optional<BearerAuth> authOverride) {
      this.page = page;
      this.perPage = perPage;
      this.externalCustomerId = externalCustomerId;
      this.issuingDateFrom = issuingDateFrom;
      this.issuingDateTo = issuingDateTo;
      this.status = status;
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

    public Optional<String> getExternalCustomerId() {
      return externalCustomerId;
    }

    public Optional<String> getIssuingDateFrom() {
      return issuingDateFrom;
    }

    public Optional<String> getIssuingDateTo() {
      return issuingDateTo;
    }

    public Optional<InvoiceStatus> getStatus() {
      return status;
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
      return page.equals(other.page) && perPage.equals(other.perPage) && externalCustomerId.equals(other.externalCustomerId) && issuingDateFrom.equals(other.issuingDateFrom) && issuingDateTo.equals(other.issuingDateTo) && status.equals(other.status) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.page, this.perPage, this.externalCustomerId, this.issuingDateFrom, this.issuingDateTo, this.status, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Find.Request{" + "page: " + page + ", perPage: " + perPage + ", externalCustomerId: " + externalCustomerId + ", issuingDateFrom: " + issuingDateFrom + ", issuingDateTo: " + issuingDateTo + ", status: " + status + ", authOverride: " + authOverride + "}";
    }

    public static Builder builder() {
      return new Builder();
    }

    public static final class Builder {
      private Optional<Integer> page = Optional.empty();

      private Optional<Integer> perPage = Optional.empty();

      private Optional<String> externalCustomerId = Optional.empty();

      private Optional<String> issuingDateFrom = Optional.empty();

      private Optional<String> issuingDateTo = Optional.empty();

      private Optional<InvoiceStatus> status = Optional.empty();

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Builder() {
      }

      public Builder from(Request other) {
        page(other.getPage());
        perPage(other.getPerPage());
        externalCustomerId(other.getExternalCustomerId());
        issuingDateFrom(other.getIssuingDateFrom());
        issuingDateTo(other.getIssuingDateTo());
        status(other.getStatus());
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

      public Builder externalCustomerId(Optional<String> externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
      }

      public Builder externalCustomerId(String externalCustomerId) {
        this.externalCustomerId = Optional.of(externalCustomerId);
        return this;
      }

      public Builder issuingDateFrom(Optional<String> issuingDateFrom) {
        this.issuingDateFrom = issuingDateFrom;
        return this;
      }

      public Builder issuingDateFrom(String issuingDateFrom) {
        this.issuingDateFrom = Optional.of(issuingDateFrom);
        return this;
      }

      public Builder issuingDateTo(Optional<String> issuingDateTo) {
        this.issuingDateTo = issuingDateTo;
        return this;
      }

      public Builder issuingDateTo(String issuingDateTo) {
        this.issuingDateTo = Optional.of(issuingDateTo);
        return this;
      }

      public Builder status(Optional<InvoiceStatus> status) {
        this.status = status;
        return this;
      }

      public Builder status(InvoiceStatus status) {
        this.status = Optional.of(status);
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
        return new Request(page, perPage, externalCustomerId, issuingDateFrom, issuingDateTo, status, authOverride);
      }
    }
  }
}
