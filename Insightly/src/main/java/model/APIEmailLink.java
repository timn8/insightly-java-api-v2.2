package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIEmailLink
 **/
@ApiModel(description = "APIEmailLink")
public class APIEmailLink   {
  
  private Long EMAIL_LINK_ID = null;
  private Long EMAIL_ID = null;
  private Long CONTACT_ID = null;
  private Long ORGANISATION_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long PROJECT_ID = null;
  private Long LEAD_ID = null;

  
  /**
   * UniqueID for the Email Link record
   **/
  @ApiModelProperty(value = "UniqueID for the Email Link record")
  @JsonProperty("EMAIL_LINK_ID")
  public Long getEMAILLINKID() {
    return EMAIL_LINK_ID;
  }
  public void setEMAILLINKID(Long EMAIL_LINK_ID) {
    this.EMAIL_LINK_ID = EMAIL_LINK_ID;
  }

  
  /**
   * Unique ID for the Email record being linked
   **/
  @ApiModelProperty(value = "Unique ID for the Email record being linked")
  @JsonProperty("EMAIL_ID")
  public Long getEMAILID() {
    return EMAIL_ID;
  }
  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  
  /**
   * Unique ID for a Contact linked to the Email
   **/
  @ApiModelProperty(value = "Unique ID for a Contact linked to the Email")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Unique ID for an Organisation linked to the Email
   **/
  @ApiModelProperty(value = "Unique ID for an Organisation linked to the Email")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Unique ID for an Opportunity linked to the Email
   **/
  @ApiModelProperty(value = "Unique ID for an Opportunity linked to the Email")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Unique ID for a Project linked to the Email
   **/
  @ApiModelProperty(value = "Unique ID for a Project linked to the Email")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Unique ID for a Lead linked to the Email
   **/
  @ApiModelProperty(value = "Unique ID for a Lead linked to the Email")
  @JsonProperty("LEAD_ID")
  public Long getLEADID() {
    return LEAD_ID;
  }
  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEmailLink {\n");
    
    sb.append("    EMAIL_LINK_ID: ").append(StringUtil.toIndentedString(EMAIL_LINK_ID)).append("\n");
    sb.append("    EMAIL_ID: ").append(StringUtil.toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(StringUtil.toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(StringUtil.toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(StringUtil.toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    LEAD_ID: ").append(StringUtil.toIndentedString(LEAD_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
