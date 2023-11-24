/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.CreditNoteEstimatedEstimatedCreditNote;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditNoteEstimated
 */
@JsonPropertyOrder({
  CreditNoteEstimated.JSON_PROPERTY_ESTIMATED_CREDIT_NOTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class CreditNoteEstimated {
  public static final String JSON_PROPERTY_ESTIMATED_CREDIT_NOTE = "estimated_credit_note";
  private CreditNoteEstimatedEstimatedCreditNote estimatedCreditNote;

  public CreditNoteEstimated() {
  }

  public CreditNoteEstimated estimatedCreditNote(CreditNoteEstimatedEstimatedCreditNote estimatedCreditNote) {
    
    this.estimatedCreditNote = estimatedCreditNote;
    return this;
  }

   /**
   * Get estimatedCreditNote
   * @return estimatedCreditNote
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ESTIMATED_CREDIT_NOTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreditNoteEstimatedEstimatedCreditNote getEstimatedCreditNote() {
    return estimatedCreditNote;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_CREDIT_NOTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstimatedCreditNote(CreditNoteEstimatedEstimatedCreditNote estimatedCreditNote) {
    this.estimatedCreditNote = estimatedCreditNote;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNoteEstimated creditNoteEstimated = (CreditNoteEstimated) o;
    return Objects.equals(this.estimatedCreditNote, creditNoteEstimated.estimatedCreditNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedCreditNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteEstimated {\n");
    sb.append("    estimatedCreditNote: ").append(toIndentedString(estimatedCreditNote)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

