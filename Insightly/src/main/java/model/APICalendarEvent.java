package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICalendarEvent
 **/
@ApiModel(description = "APICalendarEvent")

public class APICalendarEvent   {
  
  private Long EVENT_ID = null;
  private String TITLE = null;
  private String LOCATION = null;
  private String DETAILS = null;
  private Date START_DATE_UTC = null;
  private Date END_DATE_UTC = null;
  private Boolean ALL_DAY = null;
  private Boolean PUBLICLY_VISIBLE = null;
  private Date REMINDER_DATE_UTC = null;
  private Boolean REMINDER_SENT = null;
  private List<APIEventLink> EVENTLINKS = new ArrayList<APIEventLink>();
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;

  
  /**
   * Unique ID for event record
   **/
  @ApiModelProperty(value = "Unique ID for event record")
  @JsonProperty("EVENT_ID")
  public Long getEVENTID() {
    return EVENT_ID;
  }
  public void setEVENTID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
  }

  
  /**
   * Name or title of the event (required)
   **/
  @ApiModelProperty(required = true, value = "Name or title of the event (required)")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * Location of the event
   **/
  @ApiModelProperty(value = "Location of the event")
  @JsonProperty("LOCATION")
  public String getLOCATION() {
    return LOCATION;
  }
  public void setLOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
  }

  
  /**
   * Details of the event
   **/
  @ApiModelProperty(value = "Details of the event")
  @JsonProperty("DETAILS")
  public String getDETAILS() {
    return DETAILS;
  }
  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  
  /**
   * Start date and time of the event, as Coordinated Universal Time
   **/
  @ApiModelProperty(required = true, value = "Start date and time of the event, as Coordinated Universal Time")
  @JsonProperty("START_DATE_UTC")
  public Date getSTARTDATEUTC() {
    return START_DATE_UTC;
  }
  public void setSTARTDATEUTC(Date START_DATE_UTC) {
    this.START_DATE_UTC = START_DATE_UTC;
  }

  
  /**
   * End date and time of the event, as Coordinated Universal Time
   **/
  @ApiModelProperty(required = true, value = "End date and time of the event, as Coordinated Universal Time")
  @JsonProperty("END_DATE_UTC")
  public Date getENDDATEUTC() {
    return END_DATE_UTC;
  }
  public void setENDDATEUTC(Date END_DATE_UTC) {
    this.END_DATE_UTC = END_DATE_UTC;
  }

  
  /**
   * True, if event is an all-day event
   **/
  @ApiModelProperty(value = "True, if event is an all-day event")
  @JsonProperty("ALL_DAY")
  public Boolean getALLDAY() {
    return ALL_DAY;
  }
  public void setALLDAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
  }

  
  /**
   * True, if event is visible to others
   **/
  @ApiModelProperty(value = "True, if event is visible to others")
  @JsonProperty("PUBLICLY_VISIBLE")
  public Boolean getPUBLICLYVISIBLE() {
    return PUBLICLY_VISIBLE;
  }
  public void setPUBLICLYVISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
  }

  
  /**
   * Reminder data and time of the event, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Reminder data and time of the event, as Coordinated Universal Time")
  @JsonProperty("REMINDER_DATE_UTC")
  public Date getREMINDERDATEUTC() {
    return REMINDER_DATE_UTC;
  }
  public void setREMINDERDATEUTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
  }

  
  /**
   * True, if a reminder was sent
   **/
  @ApiModelProperty(value = "True, if a reminder was sent")
  @JsonProperty("REMINDER_SENT")
  public Boolean getREMINDERSENT() {
    return REMINDER_SENT;
  }
  public void setREMINDERSENT(Boolean REMINDER_SENT) {
    this.REMINDER_SENT = REMINDER_SENT;
  }

  
  /**
   * Set of links attached to the Event
   **/
  @ApiModelProperty(value = "Set of links attached to the Event")
  @JsonProperty("EVENTLINKS")
  public List<APIEventLink> getEVENTLINKS() {
    return EVENTLINKS;
  }
  public void setEVENTLINKS(List<APIEventLink> EVENTLINKS) {
    this.EVENTLINKS = EVENTLINKS;
  }

  
  /**
   * User ID of the event owner (must be a valid user ID)
   **/
  @ApiModelProperty(value = "User ID of the event owner (must be a valid user ID)")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time event record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time event record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time event record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time event record updated, as Coordinated Universal Time")
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
    sb.append("class APICalendarEvent {\n");
    
    sb.append("    EVENT_ID: ").append(StringUtil.toIndentedString(EVENT_ID)).append("\n");
    sb.append("    TITLE: ").append(StringUtil.toIndentedString(TITLE)).append("\n");
    sb.append("    LOCATION: ").append(StringUtil.toIndentedString(LOCATION)).append("\n");
    sb.append("    DETAILS: ").append(StringUtil.toIndentedString(DETAILS)).append("\n");
    sb.append("    START_DATE_UTC: ").append(StringUtil.toIndentedString(START_DATE_UTC)).append("\n");
    sb.append("    END_DATE_UTC: ").append(StringUtil.toIndentedString(END_DATE_UTC)).append("\n");
    sb.append("    ALL_DAY: ").append(StringUtil.toIndentedString(ALL_DAY)).append("\n");
    sb.append("    PUBLICLY_VISIBLE: ").append(StringUtil.toIndentedString(PUBLICLY_VISIBLE)).append("\n");
    sb.append("    REMINDER_DATE_UTC: ").append(StringUtil.toIndentedString(REMINDER_DATE_UTC)).append("\n");
    sb.append("    REMINDER_SENT: ").append(StringUtil.toIndentedString(REMINDER_SENT)).append("\n");
    sb.append("    EVENTLINKS: ").append(StringUtil.toIndentedString(EVENTLINKS)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
