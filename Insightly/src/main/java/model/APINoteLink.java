package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APINoteLink
 **/
@ApiModel(description = "APINoteLink")
public class APINoteLink   {
  
  private Long NOTE_LINK_ID = null;
  private Long NOTE_ID = null;
  private Long CONTACT_ID = null;
  private Long ORGANISATION_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long PROJECT_ID = null;
  private Long LEAD_ID = null;

  
  /**
   * Unique ID for the Note Link record
   **/
  @ApiModelProperty(value = "Unique ID for the Note Link record")
  @JsonProperty("NOTE_LINK_ID")
  public Long getNOTELINKID() {
    return NOTE_LINK_ID;
  }
  public void setNOTELINKID(Long NOTE_LINK_ID) {
    this.NOTE_LINK_ID = NOTE_LINK_ID;
  }

  
  /**
   * Unique ID of the Note record being linked
   **/
  @ApiModelProperty(value = "Unique ID of the Note record being linked")
  @JsonProperty("NOTE_ID")
  public Long getNOTEID() {
    return NOTE_ID;
  }
  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  
  /**
   * Unique ID for a Contact linked to the Note
   **/
  @ApiModelProperty(value = "Unique ID for a Contact linked to the Note")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Unique ID for an Organisation linked to the Note
   **/
  @ApiModelProperty(value = "Unique ID for an Organisation linked to the Note")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Unique ID for an Opportunity linked to the Note
   **/
  @ApiModelProperty(value = "Unique ID for an Opportunity linked to the Note")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Unique ID for a Project linked to the Note
   **/
  @ApiModelProperty(value = "Unique ID for a Project linked to the Note")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Unique ID for a Lead linked to the Note
   **/
  @ApiModelProperty(value = "Unique ID for a Lead linked to the Note")
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
    sb.append("class APINoteLink {\n");
    
    sb.append("    NOTE_LINK_ID: ").append(StringUtil.toIndentedString(NOTE_LINK_ID)).append("\n");
    sb.append("    NOTE_ID: ").append(StringUtil.toIndentedString(NOTE_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(StringUtil.toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(StringUtil.toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(StringUtil.toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    LEAD_ID: ").append(StringUtil.toIndentedString(LEAD_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
