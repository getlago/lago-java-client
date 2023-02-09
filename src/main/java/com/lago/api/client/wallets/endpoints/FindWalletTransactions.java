package com.lago.api.client.wallets.endpoints;

import com.lago.api.core.BearerAuth;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class FindWalletTransactions {
  private FindWalletTransactions() {
  }

  public static final class Request {
    private final String id;

    private final Optional<Integer> page;

    private final Optional<Integer> perPage;

    private final Optional<String> status;

    private final Optional<String> transactionType;

    private final Optional<BearerAuth> authOverride;

    private int _cachedHashCode;

    Request(String id, Optional<Integer> page, Optional<Integer> perPage, Optional<String> status,
        Optional<String> transactionType, Optional<BearerAuth> authOverride) {
      this.id = id;
      this.page = page;
      this.perPage = perPage;
      this.status = status;
      this.transactionType = transactionType;
      this.authOverride = authOverride;
    }

    /**
     * @return Lago ID of the existing wallet
     */
    public String getId() {
      return id;
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
     * @return Status (pending or settled)
     */
    public Optional<String> getStatus() {
      return status;
    }

    /**
     * @return Transaction Type (inbound or outbound)
     */
    public Optional<String> getTransactionType() {
      return transactionType;
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
      return id.equals(other.id) && page.equals(other.page) && perPage.equals(other.perPage) && status.equals(other.status) && transactionType.equals(other.transactionType) && authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.id, this.page, this.perPage, this.status, this.transactionType, this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "FindWalletTransactions.Request{" + "id: " + id + ", page: " + page + ", perPage: " + perPage + ", status: " + status + ", transactionType: " + transactionType + ", authOverride: " + authOverride + "}";
    }

    public static IdStage builder() {
      return new Builder();
    }

    public interface IdStage {
      _FinalStage id(String id);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage page(Optional<Integer> page);

      _FinalStage page(Integer page);

      _FinalStage perPage(Optional<Integer> perPage);

      _FinalStage perPage(Integer perPage);

      _FinalStage status(Optional<String> status);

      _FinalStage status(String status);

      _FinalStage transactionType(Optional<String> transactionType);

      _FinalStage transactionType(String transactionType);

      _FinalStage authOverride(Optional<BearerAuth> authOverride);

      _FinalStage authOverride(BearerAuth authOverride);
    }

    public static final class Builder implements IdStage, _FinalStage {
      private String id;

      private Optional<BearerAuth> authOverride = Optional.empty();

      private Optional<String> transactionType = Optional.empty();

      private Optional<String> status = Optional.empty();

      private Optional<Integer> perPage = Optional.empty();

      private Optional<Integer> page = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        id(other.getId());
        page(other.getPage());
        perPage(other.getPerPage());
        status(other.getStatus());
        transactionType(other.getTransactionType());
        authOverride(other.getAuthOverride());
        return this;
      }

      /**
       * <p>Lago ID of the existing wallet</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage id(String id) {
        this.id = id;
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
       * <p>Transaction Type (inbound or outbound)</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage transactionType(String transactionType) {
        this.transactionType = Optional.of(transactionType);
        return this;
      }

      @Override
      public _FinalStage transactionType(Optional<String> transactionType) {
        this.transactionType = transactionType;
        return this;
      }

      /**
       * <p>Status (pending or settled)</p>
       * @return Reference to {@code this} so that method calls can be chained together.
       */
      @Override
      public _FinalStage status(String status) {
        this.status = Optional.of(status);
        return this;
      }

      @Override
      public _FinalStage status(Optional<String> status) {
        this.status = status;
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
        return new Request(id, page, perPage, status, transactionType, authOverride);
      }
    }
  }
}
