package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APINote
 **/
@ApiModel(description = "APINote")
public class APINote   {
  
  private Long NOTE_ID = null;
  private String TITLE = null;
  private String BODY = null;
  private Long LINK_SUBJECT_ID = null;
  private String LINK_SUBJECT_TYPE = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APINoteLink> NOTELINKS = new ArrayList<APINoteLink>();

  
  /**
   * Unique ID for the Note record
   **/
  @ApiModelProperty(value = "Unique ID for the Note record")
  @JsonProperty("NOTE_ID")
  public Long getNOTEID() {
    return NOTE_ID;
  }
  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  
  /**
   * Title of the Note (required)
   **/
  @ApiModelProperty(required = true, value = "Title of the Note (required)")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * Body of the Note
   **/
  @ApiModelProperty(value = "Body of the Note")
  @JsonProperty("BODY")
  public String getBODY() {
    return BODY;
  }
  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  
  /**
   * ID of the Contact, Organisation, Opportunity or Project the Note is linked to
   **/
  @ApiModelProperty(required = true, value = "ID of the Contact, Organisation, Opportunity or Project the Note is linked to")
  @JsonProperty("LINK_SUBJECT_ID")
  public Long getLINKSUBJECTID() {
    return LINK_SUBJECT_ID;
  }
  public void setLINKSUBJECTID(Long LINK_SUBJECT_ID) {
    this.LINK_SUBJECT_ID = LINK_SUBJECT_ID;
  }

  
  /**
   * Link subject type: CONTACT, ORGANISATION, OPPORTUNITY or PROJECT
   **/
  @ApiModelProperty(required = true, value = "Link subject type: CONTACT, ORGANISATION, OPPORTUNITY or PROJECT")
  @JsonProperty("LINK_SUBJECT_TYPE")
  public String getLINKSUBJECTTYPE() {
    return LINK_SUBJECT_TYPE;
  }
  public void setLINKSUBJECTTYPE(String LINK_SUBJECT_TYPE) {
    this.LINK_SUBJECT_TYPE = LINK_SUBJECT_TYPE;
  }

  
  /**
   * User ID of the Note owner
   **/
  @ApiModelProperty(value = "User ID of the Note owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Note record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Note record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Note record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Note record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Visible To: Everyone, Team, Owner or Individuals
   **/
  @ApiModelProperty(value = "Visible To: Everyone, Team, Owner or Individuals")
  @JsonProperty("VISIBLE_TO")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }
  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  
  /**
   * If VISIBLE_TO is 'Team', the TEAM_ID
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Team', the TEAM_ID")
  @JsonProperty("VISIBLE_TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }
  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  
  /**
   * If VISIBLE_TO is 'Individuals', a comma separated list of User IDs
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Individuals', a comma separated list of User IDs")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of Links attached to the Note
   **/
  @ApiModelProperty(value = "Set of Links attached to the Note")
  @JsonProperty("NOTELINKS")
  public List<APINoteLink> getNOTELINKS() {
    return NOTELINKS;
  }
  public void setNOTELINKS(List<APINoteLink> NOTELINKS) {
    this.NOTELINKS = NOTELINKS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APINote {\n");
    
    sb.append("    NOTE_ID: ").append(StringUtil.toIndentedString(NOTE_ID)).append("\n");
    sb.append("    TITLE: ").append(StringUtil.toIndentedString(TITLE)).append("\n");
    sb.append("    BODY: ").append(StringUtil.toIndentedString(BODY)).append("\n");
    sb.append("    LINK_SUBJECT_ID: ").append(StringUtil.toIndentedString(LINK_SUBJECT_ID)).append("\n");
    sb.append("    LINK_SUBJECT_TYPE: ").append(StringUtil.toIndentedString(LINK_SUBJECT_TYPE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(StringUtil.toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(StringUtil.toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(StringUtil.toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    NOTELINKS: ").append(StringUtil.toIndentedString(NOTELINKS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
