package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APITeam_Member
 **/
@ApiModel(description = "APITeam_Member")
public class APITeamMember   {
  
  private Long PERMISSION_ID = null;
  private Long TEAM_ID = null;
  private Integer MEMBER_USER_ID = null;

  
  /**
   * Unique ID for the Team Member record
   **/
  @ApiModelProperty(value = "Unique ID for the Team Member record")
  @JsonProperty("PERMISSION_ID")
  public Long getPERMISSIONID() {
    return PERMISSION_ID;
  }
  public void setPERMISSIONID(Long PERMISSION_ID) {
    this.PERMISSION_ID = PERMISSION_ID;
  }

  
  /**
   * The unique ID for the Team the team membership record describes
   **/
  @ApiModelProperty(value = "The unique ID for the Team the team membership record describes")
  @JsonProperty("TEAM_ID")
  public Long getTEAMID() {
    return TEAM_ID;
  }
  public void setTEAMID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
  }

  
  /**
   * The unique ID for the User the team membership record describes
   **/
  @ApiModelProperty(required = true, value = "The unique ID for the User the team membership record describes")
  @JsonProperty("MEMBER_USER_ID")
  public Integer getMEMBERUSERID() {
    return MEMBER_USER_ID;
  }
  public void setMEMBERUSERID(Integer MEMBER_USER_ID) {
    this.MEMBER_USER_ID = MEMBER_USER_ID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITeamMember {\n");
    
    sb.append("    PERMISSION_ID: ").append(StringUtil.toIndentedString(PERMISSION_ID)).append("\n");
    sb.append("    TEAM_ID: ").append(StringUtil.toIndentedString(TEAM_ID)).append("\n");
    sb.append("    MEMBER_USER_ID: ").append(StringUtil.toIndentedString(MEMBER_USER_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
