package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APILink
 **/
@ApiModel(description = "APILink")
public class APILink   {
  
  private Long LINK_ID = null;
  private Long CONTACT_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long ORGANISATION_ID = null;
  private Long PROJECT_ID = null;
  private Long SECOND_PROJECT_ID = null;
  private Long SECOND_OPPORTUNITY_ID = null;
  private String ROLE = null;
  private String DETAILS = null;

  
  /**
   * Unique ID for the Link record
   **/
  @ApiModelProperty(value = "Unique ID for the Link record")
  @JsonProperty("LINK_ID")
  public Long getLINKID() {
    return LINK_ID;
  }
  public void setLINKID(Long LINK_ID) {
    this.LINK_ID = LINK_ID;
  }

  
  /**
   * Unique ID for a Contact on one side of the Relationship, must be a CONTACT_ID
   **/
  @ApiModelProperty(value = "Unique ID for a Contact on one side of the Relationship, must be a CONTACT_ID")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Unique ID for an Opportunity on one side of the Relationship, must be an OPPORTUNITY_ID
   **/
  @ApiModelProperty(value = "Unique ID for an Opportunity on one side of the Relationship, must be an OPPORTUNITY_ID")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Unique ID for an Organisation on one side of the Relationship, must be an ORGANISATION_ID
   **/
  @ApiModelProperty(value = "Unique ID for an Organisation on one side of the Relationship, must be an ORGANISATION_ID")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Unique ID for a Project on one side of the Relationship
   **/
  @ApiModelProperty(value = "Unique ID for a Project on one side of the Relationship")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Unique ID for a second Project on one side of the Relationship
   **/
  @ApiModelProperty(value = "Unique ID for a second Project on one side of the Relationship")
  @JsonProperty("SECOND_PROJECT_ID")
  public Long getSECONDPROJECTID() {
    return SECOND_PROJECT_ID;
  }
  public void setSECONDPROJECTID(Long SECOND_PROJECT_ID) {
    this.SECOND_PROJECT_ID = SECOND_PROJECT_ID;
  }

  
  /**
   * Unique ID for a second Opportunity on one side of the Relationship
   **/
  @ApiModelProperty(value = "Unique ID for a second Opportunity on one side of the Relationship")
  @JsonProperty("SECOND_OPPORTUNITY_ID")
  public Long getSECONDOPPORTUNITYID() {
    return SECOND_OPPORTUNITY_ID;
  }
  public void setSECONDOPPORTUNITYID(Long SECOND_OPPORTUNITY_ID) {
    this.SECOND_OPPORTUNITY_ID = SECOND_OPPORTUNITY_ID;
  }

  
  /**
   * Description of the Relationship between the linked objects
   **/
  @ApiModelProperty(value = "Description of the Relationship between the linked objects")
  @JsonProperty("ROLE")
  public String getROLE() {
    return ROLE;
  }
  public void setROLE(String ROLE) {
    this.ROLE = ROLE;
  }

  
  /**
   * Details of the Link
   **/
  @ApiModelProperty(value = "Details of the Link")
  @JsonProperty("DETAILS")
  public String getDETAILS() {
    return DETAILS;
  }
  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILink {\n");
    
    sb.append("    LINK_ID: ").append(StringUtil.toIndentedString(LINK_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(StringUtil.toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(StringUtil.toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(StringUtil.toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    SECOND_PROJECT_ID: ").append(StringUtil.toIndentedString(SECOND_PROJECT_ID)).append("\n");
    sb.append("    SECOND_OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(SECOND_OPPORTUNITY_ID)).append("\n");
    sb.append("    ROLE: ").append(StringUtil.toIndentedString(ROLE)).append("\n");
    sb.append("    DETAILS: ").append(StringUtil.toIndentedString(DETAILS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
