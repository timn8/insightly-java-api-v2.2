package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIActivityAssignment
 **/
@ApiModel(description = "APIActivityAssignment")
public class APIActivityAssignment   {
  
  private Long ACTIVITY_ID = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private Long ASSIGNED_TEAM_ID = null;

  
  /**
   * Unique ID for the Activity
   **/
  @ApiModelProperty(value = "Unique ID for the Activity")
  @JsonProperty("ACTIVITY_ID")
  public Long getACTIVITYID() {
    return ACTIVITY_ID;
  }
  public void setACTIVITYID(Long ACTIVITY_ID) {
    this.ACTIVITY_ID = ACTIVITY_ID;
  }

  
  /**
   * Responsible User ID. Either RESPONSIBLE_USER_ID or ASSIGNED_TEAM_ID is required
   **/
  @ApiModelProperty(value = "Responsible User ID. Either RESPONSIBLE_USER_ID or ASSIGNED_TEAM_ID is required")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * Assigned Team ID. Either ASSIGNED_TEAM_ID or RESPONSIBLE_USER_ID is required
   **/
  @ApiModelProperty(value = "Assigned Team ID. Either ASSIGNED_TEAM_ID or RESPONSIBLE_USER_ID is required")
  @JsonProperty("ASSIGNED_TEAM_ID")
  public Long getASSIGNEDTEAMID() {
    return ASSIGNED_TEAM_ID;
  }
  public void setASSIGNEDTEAMID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivityAssignment {\n");
    
    sb.append("    ACTIVITY_ID: ").append(StringUtil.toIndentedString(ACTIVITY_ID)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(StringUtil.toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    ASSIGNED_TEAM_ID: ").append(StringUtil.toIndentedString(ASSIGNED_TEAM_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
