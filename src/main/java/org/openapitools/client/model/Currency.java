/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.2-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Currency
 */
public enum Currency {
  
  AED("AED"),
  
  AFN("AFN"),
  
  ALL("ALL"),
  
  AMD("AMD"),
  
  ANG("ANG"),
  
  AOA("AOA"),
  
  ARS("ARS"),
  
  AUD("AUD"),
  
  AWG("AWG"),
  
  AZN("AZN"),
  
  BAM("BAM"),
  
  BBD("BBD"),
  
  BDT("BDT"),
  
  BGN("BGN"),
  
  BIF("BIF"),
  
  BMD("BMD"),
  
  BND("BND"),
  
  BOB("BOB"),
  
  BRL("BRL"),
  
  BSD("BSD"),
  
  BWP("BWP"),
  
  BYN("BYN"),
  
  BZD("BZD"),
  
  CAD("CAD"),
  
  CDF("CDF"),
  
  CHF("CHF"),
  
  CLF("CLF"),
  
  CLP("CLP"),
  
  CNY("CNY"),
  
  COP("COP"),
  
  CRC("CRC"),
  
  CVE("CVE"),
  
  CZK("CZK"),
  
  DJF("DJF"),
  
  DKK("DKK"),
  
  DOP("DOP"),
  
  DZD("DZD"),
  
  EGP("EGP"),
  
  ETB("ETB"),
  
  EUR("EUR"),
  
  FJD("FJD"),
  
  FKP("FKP"),
  
  GBP("GBP"),
  
  GEL("GEL"),
  
  GIP("GIP"),
  
  GMD("GMD"),
  
  GNF("GNF"),
  
  GTQ("GTQ"),
  
  GYD("GYD"),
  
  HKD("HKD"),
  
  HNL("HNL"),
  
  HRK("HRK"),
  
  HTG("HTG"),
  
  HUF("HUF"),
  
  IDR("IDR"),
  
  ILS("ILS"),
  
  INR("INR"),
  
  ISK("ISK"),
  
  JMD("JMD"),
  
  JPY("JPY"),
  
  KES("KES"),
  
  KGS("KGS"),
  
  KHR("KHR"),
  
  KMF("KMF"),
  
  KRW("KRW"),
  
  KYD("KYD"),
  
  KZT("KZT"),
  
  LAK("LAK"),
  
  LBP("LBP"),
  
  LKR("LKR"),
  
  LRD("LRD"),
  
  LSL("LSL"),
  
  MAD("MAD"),
  
  MDL("MDL"),
  
  MGA("MGA"),
  
  MKD("MKD"),
  
  MMK("MMK"),
  
  MNT("MNT"),
  
  MOP("MOP"),
  
  MRO("MRO"),
  
  MUR("MUR"),
  
  MVR("MVR"),
  
  MWK("MWK"),
  
  MXN("MXN"),
  
  MYR("MYR"),
  
  MZN("MZN"),
  
  NAD("NAD"),
  
  NGN("NGN"),
  
  NIO("NIO"),
  
  NOK("NOK"),
  
  NPR("NPR"),
  
  NZD("NZD"),
  
  PAB("PAB"),
  
  PEN("PEN"),
  
  PGK("PGK"),
  
  PHP("PHP"),
  
  PKR("PKR"),
  
  PLN("PLN"),
  
  PYG("PYG"),
  
  QAR("QAR"),
  
  RON("RON"),
  
  RSD("RSD"),
  
  RUB("RUB"),
  
  RWF("RWF"),
  
  SAR("SAR"),
  
  SBD("SBD"),
  
  SCR("SCR"),
  
  SEK("SEK"),
  
  SGD("SGD"),
  
  SHP("SHP"),
  
  SLL("SLL"),
  
  SOS("SOS"),
  
  SRD("SRD"),
  
  STD("STD"),
  
  SZL("SZL"),
  
  THB("THB"),
  
  TJS("TJS"),
  
  TOP("TOP"),
  
  TRY("TRY"),
  
  TTD("TTD"),
  
  TWD("TWD"),
  
  TZS("TZS"),
  
  UAH("UAH"),
  
  UGX("UGX"),
  
  USD("USD"),
  
  UYU("UYU"),
  
  UZS("UZS"),
  
  VND("VND"),
  
  VUV("VUV"),
  
  WST("WST"),
  
  XAF("XAF"),
  
  XCD("XCD"),
  
  XOF("XOF"),
  
  XPF("XPF"),
  
  YER("YER"),
  
  ZAR("ZAR"),
  
  ZMW("ZMW");

  private String value;

  Currency(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Currency fromValue(String value) {
    for (Currency b : Currency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

