package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIRelated
 **/
@ApiModel(description = "APIRelated")
public class APIRelated   {
  
  private List<APIContact> CONTACTS = new ArrayList<APIContact>();
  private List<APIOrganisation> ORGANISATIONS = new ArrayList<APIOrganisation>();
  private List<APIOpportunity> OPPORTUNITIES = new ArrayList<APIOpportunity>();
  private List<APIProject> PROJECTS = new ArrayList<APIProject>();
  private List<APINote> NOTES = new ArrayList<APINote>();
  private List<APICalendarEvent> EVENTS = new ArrayList<APICalendarEvent>();
  private List<APIEmail> EMAILS = new ArrayList<APIEmail>();
  private List<APITask> TASKS = new ArrayList<APITask>();
  private List<APIComment> COMMENTS = new ArrayList<APIComment>();
  private List<APIFileAttachment> FILE_ATTACHMENTS = new ArrayList<APIFileAttachment>();
  private APIFollow FOLLOW = null;
  private List<APILead> LEADS = new ArrayList<APILead>();

  
  /**
   * Linked Contacts
   **/
  @ApiModelProperty(value = "Linked Contacts")
  @JsonProperty("CONTACTS")
  public List<APIContact> getCONTACTS() {
    return CONTACTS;
  }
  public void setCONTACTS(List<APIContact> CONTACTS) {
    this.CONTACTS = CONTACTS;
  }

  
  /**
   * Linked Organisations
   **/
  @ApiModelProperty(value = "Linked Organisations")
  @JsonProperty("ORGANISATIONS")
  public List<APIOrganisation> getORGANISATIONS() {
    return ORGANISATIONS;
  }
  public void setORGANISATIONS(List<APIOrganisation> ORGANISATIONS) {
    this.ORGANISATIONS = ORGANISATIONS;
  }

  
  /**
   * Linked Opportunities
   **/
  @ApiModelProperty(value = "Linked Opportunities")
  @JsonProperty("OPPORTUNITIES")
  public List<APIOpportunity> getOPPORTUNITIES() {
    return OPPORTUNITIES;
  }
  public void setOPPORTUNITIES(List<APIOpportunity> OPPORTUNITIES) {
    this.OPPORTUNITIES = OPPORTUNITIES;
  }

  
  /**
   * Linked Projects
   **/
  @ApiModelProperty(value = "Linked Projects")
  @JsonProperty("PROJECTS")
  public List<APIProject> getPROJECTS() {
    return PROJECTS;
  }
  public void setPROJECTS(List<APIProject> PROJECTS) {
    this.PROJECTS = PROJECTS;
  }

  
  /**
   * Related notes
   **/
  @ApiModelProperty(value = "Related notes")
  @JsonProperty("NOTES")
  public List<APINote> getNOTES() {
    return NOTES;
  }
  public void setNOTES(List<APINote> NOTES) {
    this.NOTES = NOTES;
  }

  
  /**
   * Related events
   **/
  @ApiModelProperty(value = "Related events")
  @JsonProperty("EVENTS")
  public List<APICalendarEvent> getEVENTS() {
    return EVENTS;
  }
  public void setEVENTS(List<APICalendarEvent> EVENTS) {
    this.EVENTS = EVENTS;
  }

  
  /**
   * Related emails
   **/
  @ApiModelProperty(value = "Related emails")
  @JsonProperty("EMAILS")
  public List<APIEmail> getEMAILS() {
    return EMAILS;
  }
  public void setEMAILS(List<APIEmail> EMAILS) {
    this.EMAILS = EMAILS;
  }

  
  /**
   * Related tasks
   **/
  @ApiModelProperty(value = "Related tasks")
  @JsonProperty("TASKS")
  public List<APITask> getTASKS() {
    return TASKS;
  }
  public void setTASKS(List<APITask> TASKS) {
    this.TASKS = TASKS;
  }

  
  /**
   * Comments
   **/
  @ApiModelProperty(value = "Comments")
  @JsonProperty("COMMENTS")
  public List<APIComment> getCOMMENTS() {
    return COMMENTS;
  }
  public void setCOMMENTS(List<APIComment> COMMENTS) {
    this.COMMENTS = COMMENTS;
  }

  
  /**
   * File attachments
   **/
  @ApiModelProperty(value = "File attachments")
  @JsonProperty("FILE_ATTACHMENTS")
  public List<APIFileAttachment> getFILEATTACHMENTS() {
    return FILE_ATTACHMENTS;
  }
  public void setFILEATTACHMENTS(List<APIFileAttachment> FILE_ATTACHMENTS) {
    this.FILE_ATTACHMENTS = FILE_ATTACHMENTS;
  }

  
  /**
   * The APIFollow record
   **/
  @ApiModelProperty(value = "The APIFollow record")
  @JsonProperty("FOLLOW")
  public APIFollow getFOLLOW() {
    return FOLLOW;
  }
  public void setFOLLOW(APIFollow FOLLOW) {
    this.FOLLOW = FOLLOW;
  }

  
  /**
   * Related leads
   **/
  @ApiModelProperty(value = "Related leads")
  @JsonProperty("LEADS")
  public List<APILead> getLEADS() {
    return LEADS;
  }
  public void setLEADS(List<APILead> LEADS) {
    this.LEADS = LEADS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRelated {\n");
    
    sb.append("    CONTACTS: ").append(StringUtil.toIndentedString(CONTACTS)).append("\n");
    sb.append("    ORGANISATIONS: ").append(StringUtil.toIndentedString(ORGANISATIONS)).append("\n");
    sb.append("    OPPORTUNITIES: ").append(StringUtil.toIndentedString(OPPORTUNITIES)).append("\n");
    sb.append("    PROJECTS: ").append(StringUtil.toIndentedString(PROJECTS)).append("\n");
    sb.append("    NOTES: ").append(StringUtil.toIndentedString(NOTES)).append("\n");
    sb.append("    EVENTS: ").append(StringUtil.toIndentedString(EVENTS)).append("\n");
    sb.append("    EMAILS: ").append(StringUtil.toIndentedString(EMAILS)).append("\n");
    sb.append("    TASKS: ").append(StringUtil.toIndentedString(TASKS)).append("\n");
    sb.append("    COMMENTS: ").append(StringUtil.toIndentedString(COMMENTS)).append("\n");
    sb.append("    FILE_ATTACHMENTS: ").append(StringUtil.toIndentedString(FILE_ATTACHMENTS)).append("\n");
    sb.append("    FOLLOW: ").append(StringUtil.toIndentedString(FOLLOW)).append("\n");
    sb.append("    LEADS: ").append(StringUtil.toIndentedString(LEADS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
