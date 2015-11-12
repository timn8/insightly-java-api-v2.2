package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIProject
 **/
@ApiModel(description = "APIProject")
public class APIProject   {
  
  private Long PROJECT_ID = null;
  private String PROJECT_NAME = null;
  private String STATUS = null;
  private String PROJECT_DETAILS = null;
  private Long OPPORTUNITY_ID = null;
  private Date STARTED_DATE = null;
  private Date COMPLETED_DATE = null;
  private String IMAGE_URL = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private Long CATEGORY_ID = null;
  private Long PIPELINE_ID = null;
  private Long STAGE_ID = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private List<APITag> TAGS = new ArrayList<APITag>();
  private List<APILink> LINKS = new ArrayList<APILink>();

  
  /**
   * Unique ID for the Project record
   **/
  @ApiModelProperty(value = "Unique ID for the Project record")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Name of the Project (required)
   **/
  @ApiModelProperty(required = true, value = "Name of the Project (required)")
  @JsonProperty("PROJECT_NAME")
  public String getPROJECTNAME() {
    return PROJECT_NAME;
  }
  public void setPROJECTNAME(String PROJECT_NAME) {
    this.PROJECT_NAME = PROJECT_NAME;
  }

  
  /**
   * Status: Abandoned, Cancelled, Completed, Deferred, In Progress or Not Started
   **/
  @ApiModelProperty(required = true, value = "Status: Abandoned, Cancelled, Completed, Deferred, In Progress or Not Started")
  @JsonProperty("STATUS")
  public String getSTATUS() {
    return STATUS;
  }
  public void setSTATUS(String STATUS) {
    this.STATUS = STATUS;
  }

  
  /**
   * Details of the Project
   **/
  @ApiModelProperty(value = "Details of the Project")
  @JsonProperty("PROJECT_DETAILS")
  public String getPROJECTDETAILS() {
    return PROJECT_DETAILS;
  }
  public void setPROJECTDETAILS(String PROJECT_DETAILS) {
    this.PROJECT_DETAILS = PROJECT_DETAILS;
  }

  
  /**
   * Unique ID for the Opportunity from which the Project may have been converted
   **/
  @ApiModelProperty(value = "Unique ID for the Opportunity from which the Project may have been converted")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Date Project started, in YYYY-MM-DD format
   **/
  @ApiModelProperty(value = "Date Project started, in YYYY-MM-DD format")
  @JsonProperty("STARTED_DATE")
  public Date getSTARTEDDATE() {
    return STARTED_DATE;
  }
  public void setSTARTEDDATE(Date STARTED_DATE) {
    this.STARTED_DATE = STARTED_DATE;
  }

  
  /**
   * Date Project completed, in YYYY-MM-DD format
   **/
  @ApiModelProperty(value = "Date Project completed, in YYYY-MM-DD format")
  @JsonProperty("COMPLETED_DATE")
  public Date getCOMPLETEDDATE() {
    return COMPLETED_DATE;
  }
  public void setCOMPLETEDDATE(Date COMPLETED_DATE) {
    this.COMPLETED_DATE = COMPLETED_DATE;
  }

  
  /**
   * URL of the Image for the Project
   **/
  @ApiModelProperty(value = "URL of the Image for the Project")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  
  /**
   * Responsible user ID
   **/
  @ApiModelProperty(value = "Responsible user ID")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * User ID of the Project record owner
   **/
  @ApiModelProperty(value = "User ID of the Project record owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Project record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Project record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Project record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Project record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * The Category ID of the Project, if it has been assigned to one.
   **/
  @ApiModelProperty(value = "The Category ID of the Project, if it has been assigned to one.")
  @JsonProperty("CATEGORY_ID")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }
  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  
  /**
   * The Pipeline ID that the Project is in, if it has been assigned to one
   **/
  @ApiModelProperty(value = "The Pipeline ID that the Project is in, if it has been assigned to one")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * The Stage ID of the Stage the Project is in, if it has been assigned to one
   **/
  @ApiModelProperty(value = "The Stage ID of the Stage the Project is in, if it has been assigned to one")
  @JsonProperty("STAGE_ID")
  public Long getSTAGEID() {
    return STAGE_ID;
  }
  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  
  /**
   * Visible To: Everyone, Owner, Team or Individuals
   **/
  @ApiModelProperty(value = "Visible To: Everyone, Owner, Team or Individuals")
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
   * If VISIBLE_TO is 'Individuals', a comma separated list of user IDs
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Individuals', a comma separated list of user IDs")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of Custom Fields attached to the Project
   **/
  @ApiModelProperty(value = "Set of Custom Fields attached to the Project")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of Tags attached to the Project
   **/
  @ApiModelProperty(value = "Set of Tags attached to the Project")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * Set of Links attached to the Project
   **/
  @ApiModelProperty(value = "Set of Links attached to the Project")
  @JsonProperty("LINKS")
  public List<APILink> getLINKS() {
    return LINKS;
  }
  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIProject {\n");
    
    sb.append("    PROJECT_ID: ").append(StringUtil.toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    PROJECT_NAME: ").append(StringUtil.toIndentedString(PROJECT_NAME)).append("\n");
    sb.append("    STATUS: ").append(StringUtil.toIndentedString(STATUS)).append("\n");
    sb.append("    PROJECT_DETAILS: ").append(StringUtil.toIndentedString(PROJECT_DETAILS)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    STARTED_DATE: ").append(StringUtil.toIndentedString(STARTED_DATE)).append("\n");
    sb.append("    COMPLETED_DATE: ").append(StringUtil.toIndentedString(COMPLETED_DATE)).append("\n");
    sb.append("    IMAGE_URL: ").append(StringUtil.toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(StringUtil.toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CATEGORY_ID: ").append(StringUtil.toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(StringUtil.toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(StringUtil.toIndentedString(STAGE_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(StringUtil.toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(StringUtil.toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(StringUtil.toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(StringUtil.toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    TAGS: ").append(StringUtil.toIndentedString(TAGS)).append("\n");
    sb.append("    LINKS: ").append(StringUtil.toIndentedString(LINKS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
