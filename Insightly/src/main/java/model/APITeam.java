package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APITeam
 **/
@ApiModel(description = "APITeam")
public class APITeam   {
  
  private Long TEAM_ID = null;
  private String TEAM_NAME = null;
  private Boolean ANONYMOUS_TEAM = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private List<APITeamMember> TEAMMEMBERS = new ArrayList<APITeamMember>();

  
  /**
   * Unique ID for the Team record
   **/
  @ApiModelProperty(value = "Unique ID for the Team record")
  @JsonProperty("TEAM_ID")
  public Long getTEAMID() {
    return TEAM_ID;
  }
  public void setTEAMID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
  }

  
  /**
   * Name of the Team
   **/
  @ApiModelProperty(value = "Name of the Team")
  @JsonProperty("TEAM_NAME")
  public String getTEAMNAME() {
    return TEAM_NAME;
  }
  public void setTEAMNAME(String TEAM_NAME) {
    this.TEAM_NAME = TEAM_NAME;
  }

  
  /**
   * True, if this Team should not appear in the web UI
   **/
  @ApiModelProperty(value = "True, if this Team should not appear in the web UI")
  @JsonProperty("ANONYMOUS_TEAM")
  public Boolean getANONYMOUSTEAM() {
    return ANONYMOUS_TEAM;
  }
  public void setANONYMOUSTEAM(Boolean ANONYMOUS_TEAM) {
    this.ANONYMOUS_TEAM = ANONYMOUS_TEAM;
  }

  
  /**
   * Date and time Team record created, as Coorindated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Team record created, as Coorindated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Team record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Team record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Set of Team Members attached to the Team
   **/
  @ApiModelProperty(value = "Set of Team Members attached to the Team")
  @JsonProperty("TEAMMEMBERS")
  public List<APITeamMember> getTEAMMEMBERS() {
    return TEAMMEMBERS;
  }
  public void setTEAMMEMBERS(List<APITeamMember> TEAMMEMBERS) {
    this.TEAMMEMBERS = TEAMMEMBERS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITeam {\n");
    
    sb.append("    TEAM_ID: ").append(StringUtil.toIndentedString(TEAM_ID)).append("\n");
    sb.append("    TEAM_NAME: ").append(StringUtil.toIndentedString(TEAM_NAME)).append("\n");
    sb.append("    ANONYMOUS_TEAM: ").append(StringUtil.toIndentedString(ANONYMOUS_TEAM)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    TEAMMEMBERS: ").append(StringUtil.toIndentedString(TEAMMEMBERS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
