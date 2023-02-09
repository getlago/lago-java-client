package com.lago.api.client.coupons;

import com.lago.api.client.coupons.endpoints.Apply;
import com.lago.api.client.coupons.endpoints.Create;
import com.lago.api.client.coupons.endpoints.Destroy;
import com.lago.api.client.coupons.endpoints.Find;
import com.lago.api.client.coupons.endpoints.FindAllAppliedCoupons;
import com.lago.api.client.coupons.endpoints.Get;
import com.lago.api.client.coupons.endpoints.Update;
import com.lago.api.client.coupons.exceptions.ApplyException;
import com.lago.api.client.coupons.exceptions.CreateException;
import com.lago.api.client.coupons.exceptions.DestroyException;
import com.lago.api.client.coupons.exceptions.FindAllAppliedCouponsException;
import com.lago.api.client.coupons.exceptions.FindException;
import com.lago.api.client.coupons.exceptions.GetException;
import com.lago.api.client.coupons.exceptions.UpdateException;
import com.lago.api.client.coupons.types.AppliedCoupon;
import com.lago.api.client.coupons.types.AppliedCoupons;
import com.lago.api.client.coupons.types.Coupon;
import com.lago.api.client.coupons.types.Coupons;
import com.lago.api.core.BearerAuth;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class couponsServiceClient {
  private final couponsService service;

  private final Optional<BearerAuth> auth;

  public couponsServiceClient(String url) {
    this.service = couponsService.getClient(url);
    this.auth = Optional.empty();
  }

  public couponsServiceClient(String url, BearerAuth auth) {
    this.service = couponsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  /**
   * <p>Create a new coupon</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws CreateException Exception that wraps all possible endpoint errors 
   * @return Coupon
   */
  public Coupon create(Create.Request request) throws CreateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.create(authValue, request.getBody());
  }

  /**
   * <p>Return a single coupon</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws GetException Exception that wraps all possible endpoint errors 
   * @return Coupon
   */
  public Coupon get(Get.Request request) throws GetException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.get(authValue, request.getCode());
  }

  /**
   * <p>Update an existing coupon by code</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws UpdateException Exception that wraps all possible endpoint errors 
   * @return Coupon
   */
  public Coupon update(Update.Request request) throws UpdateException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.update(authValue, request.getCode(), request.getBody());
  }

  /**
   * <p>Delete a coupon</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws DestroyException Exception that wraps all possible endpoint errors 
   * @return Coupon
   */
  public Coupon destroy(Destroy.Request request) throws DestroyException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.destroy(authValue, request.getCode());
  }

  /**
   * <p>Find all coupons in certain organisation</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindException Exception that wraps all possible endpoint errors 
   * @return Coupons
   */
  public Coupons find(Find.Request request) throws FindException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.find(authValue, request.getPage(), request.getPerPage());
  }

  /**
   * <p>Apply a coupon to a customer</p>
   * @param request Wrapper object for the request body that includes any path parameters, query parameters, and headers
   * @throws ApplyException Exception that wraps all possible endpoint errors 
   * @return AppliedCoupon
   */
  public AppliedCoupon apply(Apply.Request request) throws ApplyException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.apply(authValue, request.getBody());
  }

  /**
   * <p>Find all applied coupons</p>
   * @param request Wrapper object that includes any path parameters, query parameters, and headers
   * @throws FindAllAppliedCouponsException Exception that wraps all possible endpoint errors 
   * @return AppliedCoupons
   */
  public AppliedCoupons findAllAppliedCoupons(FindAllAppliedCoupons.Request request) throws
      FindAllAppliedCouponsException {
    BearerAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required")));
    return this.service.findAllAppliedCoupons(authValue, request.getPage(), request.getPerPage(), request.getStatus(), request.getExternalCustomerId());
  }
}
