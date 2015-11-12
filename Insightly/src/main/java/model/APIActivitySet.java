package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIActivitySet
 **/
@ApiModel(description = "APIActivitySet")
public class APIActivitySet   {
  
  private Long ACTIVITYSET_ID = null;
  private String NAME = null;
  private Boolean FOR_CONTACTS = null;
  private Boolean FOR_ORGANISATIONS = null;
  private Boolean FOR_OPPORTUNITIES = null;
  private Boolean FOR_PROJECTS = null;
  private Boolean FOR_LEADS = null;
  private Integer OWNER_USER_ID = null;
  private List<APIActivity> ACTIVITIES = new ArrayList<APIActivity>();

  
  /**
   * Unique ID for the Activity Set record.
   **/
  @ApiModelProperty(value = "Unique ID for the Activity Set record.")
  @JsonProperty("ACTIVITYSET_ID")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }
  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  
  /**
   * The name for the Activity Set.
   **/
  @ApiModelProperty(value = "The name for the Activity Set.")
  @JsonProperty("NAME")
  public String getNAME() {
    return NAME;
  }
  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Contacts.
   **/
  @ApiModelProperty(value = "Whether or not the Activity Set is assignable to Contacts.")
  @JsonProperty("FOR_CONTACTS")
  public Boolean getFORCONTACTS() {
    return FOR_CONTACTS;
  }
  public void setFORCONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Organisations.
   **/
  @ApiModelProperty(value = "Whether or not the Activity Set is assignable to Organisations.")
  @JsonProperty("FOR_ORGANISATIONS")
  public Boolean getFORORGANISATIONS() {
    return FOR_ORGANISATIONS;
  }
  public void setFORORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Opportunities.
   **/
  @ApiModelProperty(value = "Whether or not the Activity Set is assignable to Opportunities.")
  @JsonProperty("FOR_OPPORTUNITIES")
  public Boolean getFOROPPORTUNITIES() {
    return FOR_OPPORTUNITIES;
  }
  public void setFOROPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Projects.
   **/
  @ApiModelProperty(value = "Whether or not the Activity Set is assignable to Projects.")
  @JsonProperty("FOR_PROJECTS")
  public Boolean getFORPROJECTS() {
    return FOR_PROJECTS;
  }
  public void setFORPROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Leads.
   **/
  @ApiModelProperty(value = "Whether or not the Activity Set is assignable to Leads.")
  @JsonProperty("FOR_LEADS")
  public Boolean getFORLEADS() {
    return FOR_LEADS;
  }
  public void setFORLEADS(Boolean FOR_LEADS) {
    this.FOR_LEADS = FOR_LEADS;
  }

  
  /**
   * The unique ID for the Owner of the Activity.
   **/
  @ApiModelProperty(value = "The unique ID for the Owner of the Activity.")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * The list of Activities that belong to the Activity Set.
   **/
  @ApiModelProperty(value = "The list of Activities that belong to the Activity Set.")
  @JsonProperty("ACTIVITIES")
  public List<APIActivity> getACTIVITIES() {
    return ACTIVITIES;
  }
  public void setACTIVITIES(List<APIActivity> ACTIVITIES) {
    this.ACTIVITIES = ACTIVITIES;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivitySet {\n");
    
    sb.append("    ACTIVITYSET_ID: ").append(StringUtil.toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    NAME: ").append(StringUtil.toIndentedString(NAME)).append("\n");
    sb.append("    FOR_CONTACTS: ").append(StringUtil.toIndentedString(FOR_CONTACTS)).append("\n");
    sb.append("    FOR_ORGANISATIONS: ").append(StringUtil.toIndentedString(FOR_ORGANISATIONS)).append("\n");
    sb.append("    FOR_OPPORTUNITIES: ").append(StringUtil.toIndentedString(FOR_OPPORTUNITIES)).append("\n");
    sb.append("    FOR_PROJECTS: ").append(StringUtil.toIndentedString(FOR_PROJECTS)).append("\n");
    sb.append("    FOR_LEADS: ").append(StringUtil.toIndentedString(FOR_LEADS)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    ACTIVITIES: ").append(StringUtil.toIndentedString(ACTIVITIES)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
