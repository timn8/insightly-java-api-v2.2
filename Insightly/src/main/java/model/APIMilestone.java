package model;

import insightly.StringUtil;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * Project milestone API object.
 **/
@ApiModel(description = "Project milestone API object.")
public class APIMilestone   {
  
  private Long MILESTONE_ID = null;
  private Long PROJECT_ID = null;
  private String TITLE = null;
  private Date DUE_DATE = null;
  private Boolean COMPLETED = null;
  private Date COMPLETED_DATE_UTC = null;
  private Long RESPONSIBLE_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;

  
  /**
   * Unique ID for the Milestone record.
   **/
  @ApiModelProperty(value = "Unique ID for the Milestone record.")
  @JsonProperty("MILESTONE_ID")
  public Long getMILESTONEID() {
    return MILESTONE_ID;
  }
  public void setMILESTONEID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
  }

  
  /**
   * Unique ID for the Project record the milestone is assigned to.
   **/
  @ApiModelProperty(value = "Unique ID for the Project record the milestone is assigned to.")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Title of the milestone.
   **/
  @ApiModelProperty(value = "Title of the milestone.")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * Date when milestone is due.
   **/
  @ApiModelProperty(value = "Date when milestone is due.")
  @JsonProperty("DUE_DATE")
  public Date getDUEDATE() {
    return DUE_DATE;
  }
  public void setDUEDATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
  }

  
  /**
   * True if milestone is completed.
   **/
  @ApiModelProperty(value = "True if milestone is completed.")
  @JsonProperty("COMPLETED")
  public Boolean getCOMPLETED() {
    return COMPLETED;
  }
  public void setCOMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
  }

  
  /**
   * Date and time when the milestone was completed (Coordinated Universal Time).
   **/
  @ApiModelProperty(value = "Date and time when the milestone was completed (Coordinated Universal Time).")
  @JsonProperty("COMPLETED_DATE_UTC")
  public Date getCOMPLETEDDATEUTC() {
    return COMPLETED_DATE_UTC;
  }
  public void setCOMPLETEDDATEUTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
  }

  
  /**
   * ID of the user that is responsible for the milestone.
   **/
  @ApiModelProperty(value = "ID of the user that is responsible for the milestone.")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Long getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Long RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * Date and time the Milestone record was created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time the Milestone record was created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time the Milestone record was updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time the Milestone record was updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIMilestone {\n");
    
    sb.append("    MILESTONE_ID: ").append(StringUtil.toIndentedString(MILESTONE_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(StringUtil.toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    TITLE: ").append(StringUtil.toIndentedString(TITLE)).append("\n");
    sb.append("    DUE_DATE: ").append(StringUtil.toIndentedString(DUE_DATE)).append("\n");
    sb.append("    COMPLETED: ").append(StringUtil.toIndentedString(COMPLETED)).append("\n");
    sb.append("    COMPLETED_DATE_UTC: ").append(StringUtil.toIndentedString(COMPLETED_DATE_UTC)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(StringUtil.toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
