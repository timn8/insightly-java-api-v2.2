package model;



import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIActivity
 **/
@ApiModel(description = "APIActivity")
public class APIActivity   {
  
  private Long ACTIVITY_ID = null;
  private Long ACTIVITYSET_ID = null;
  private String ACTIVITY_NAME = null;
  private String ACTIVITY_DETAILS = null;
  private String ACTIVITY_TYPE = null;
  private Long CATEGORY_ID = null;
  private Boolean REMINDER = null;
  private Integer REMINDER_DAYS_BEFORE_DUE = null;
  private String REMINDER_TIME = null;
  private Boolean PUBLICLY_VISIBLE = null;
  private Boolean OWNER_VISIBLE = null;
  private Integer OWNER_USER_ID = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private Long ASSIGNED_TEAM_ID = null;
  private Boolean SKIP_SUN = null;
  private Boolean SKIP_MON = null;
  private Boolean SKIP_TUE = null;
  private Boolean SKIP_WED = null;
  private Boolean SKIP_THU = null;
  private Boolean SKIP_FRI = null;
  private Boolean SKIP_SAT = null;
  private Integer DUE_DAYS_AFTER_START = null;
  private Integer DUE_DAYS_BEFORE_END = null;
  private Integer EVENT_DAYS_AFTER_START = null;
  private Integer EVENT_DAYS_BEFORE_END = null;
  private String EVENT_TIME = null;
  private Boolean ALL_DAY = null;
  private Integer DURATION = null;

  
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
   * Unique ID for the Activity Set record that this Activity belongs to
   **/
  @ApiModelProperty(value = "Unique ID for the Activity Set record that this Activity belongs to")
  @JsonProperty("ACTIVITYSET_ID")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }
  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  
  /**
   * The name for the Activity
   **/
  @ApiModelProperty(value = "The name for the Activity")
  @JsonProperty("ACTIVITY_NAME")
  public String getACTIVITYNAME() {
    return ACTIVITY_NAME;
  }
  public void setACTIVITYNAME(String ACTIVITY_NAME) {
    this.ACTIVITY_NAME = ACTIVITY_NAME;
  }

  
  /**
   * The details for the Activity
   **/
  @ApiModelProperty(value = "The details for the Activity")
  @JsonProperty("ACTIVITY_DETAILS")
  public String getACTIVITYDETAILS() {
    return ACTIVITY_DETAILS;
  }
  public void setACTIVITYDETAILS(String ACTIVITY_DETAILS) {
    this.ACTIVITY_DETAILS = ACTIVITY_DETAILS;
  }

  
  /**
   * The type of Activity
   **/
  @ApiModelProperty(value = "The type of Activity")
  @JsonProperty("ACTIVITY_TYPE")
  public String getACTIVITYTYPE() {
    return ACTIVITY_TYPE;
  }
  public void setACTIVITYTYPE(String ACTIVITY_TYPE) {
    this.ACTIVITY_TYPE = ACTIVITY_TYPE;
  }

  
  /**
   * The unique ID for the category associated with the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  @ApiModelProperty(value = "The unique ID for the category associated with the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("CATEGORY_ID")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }
  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  
  /**
   * Whether or not a reminder is set on the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  @ApiModelProperty(value = "Whether or not a reminder is set on the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("REMINDER")
  public Boolean getREMINDER() {
    return REMINDER;
  }
  public void setREMINDER(Boolean REMINDER) {
    this.REMINDER = REMINDER;
  }

  
  /**
   * Number of days before due date of the Activity a reminder will be sent out. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  @ApiModelProperty(value = "Number of days before due date of the Activity a reminder will be sent out. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("REMINDER_DAYS_BEFORE_DUE")
  public Integer getREMINDERDAYSBEFOREDUE() {
    return REMINDER_DAYS_BEFORE_DUE;
  }
  public void setREMINDERDAYSBEFOREDUE(Integer REMINDER_DAYS_BEFORE_DUE) {
    this.REMINDER_DAYS_BEFORE_DUE = REMINDER_DAYS_BEFORE_DUE;
  }

  
  /**
   * The time when a reminder will be sent out for the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  @ApiModelProperty(value = "The time when a reminder will be sent out for the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("REMINDER_TIME")
  public String getREMINDERTIME() {
    return REMINDER_TIME;
  }
  public void setREMINDERTIME(String REMINDER_TIME) {
    this.REMINDER_TIME = REMINDER_TIME;
  }

  
  /**
   * Whether the Activity is publicly visible.
   **/
  @ApiModelProperty(value = "Whether the Activity is publicly visible.")
  @JsonProperty("PUBLICLY_VISIBLE")
  public Boolean getPUBLICLYVISIBLE() {
    return PUBLICLY_VISIBLE;
  }
  public void setPUBLICLYVISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
  }

  
  /**
   * Whether the Activity is visible to the Owner.
   **/
  @ApiModelProperty(value = "Whether the Activity is visible to the Owner.")
  @JsonProperty("OWNER_VISIBLE")
  public Boolean getOWNERVISIBLE() {
    return OWNER_VISIBLE;
  }
  public void setOWNERVISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
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
   * The unique ID for the Responsible User of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  @ApiModelProperty(value = "The unique ID for the Responsible User of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * The unique ID for the Responsible Team of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  @ApiModelProperty(value = "The unique ID for the Responsible Team of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("ASSIGNED_TEAM_ID")
  public Long getASSIGNEDTEAMID() {
    return ASSIGNED_TEAM_ID;
  }
  public void setASSIGNEDTEAMID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Sunday.
   **/
  @ApiModelProperty(value = "Whether or not to skip scheduling of this Activity on a Sunday.")
  @JsonProperty("SKIP_SUN")
  public Boolean getSKIPSUN() {
    return SKIP_SUN;
  }
  public void setSKIPSUN(Boolean SKIP_SUN) {
    this.SKIP_SUN = SKIP_SUN;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Monday.
   **/
  @ApiModelProperty(value = "Whether or not to skip scheduling of this Activity on a Monday.")
  @JsonProperty("SKIP_MON")
  public Boolean getSKIPMON() {
    return SKIP_MON;
  }
  public void setSKIPMON(Boolean SKIP_MON) {
    this.SKIP_MON = SKIP_MON;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Tuesday.
   **/
  @ApiModelProperty(value = "Whether or not to skip scheduling of this Activity on a Tuesday.")
  @JsonProperty("SKIP_TUE")
  public Boolean getSKIPTUE() {
    return SKIP_TUE;
  }
  public void setSKIPTUE(Boolean SKIP_TUE) {
    this.SKIP_TUE = SKIP_TUE;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Wednesday.
   **/
  @ApiModelProperty(value = "Whether or not to skip scheduling of this Activity on a Wednesday.")
  @JsonProperty("SKIP_WED")
  public Boolean getSKIPWED() {
    return SKIP_WED;
  }
  public void setSKIPWED(Boolean SKIP_WED) {
    this.SKIP_WED = SKIP_WED;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Thursday.
   **/
  @ApiModelProperty(value = "Whether or not to skip scheduling of this Activity on a Thursday.")
  @JsonProperty("SKIP_THU")
  public Boolean getSKIPTHU() {
    return SKIP_THU;
  }
  public void setSKIPTHU(Boolean SKIP_THU) {
    this.SKIP_THU = SKIP_THU;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Friday.
   **/
  @ApiModelProperty(value = "Whether or not to skip scheduling of this Activity on a Friday.")
  @JsonProperty("SKIP_FRI")
  public Boolean getSKIPFRI() {
    return SKIP_FRI;
  }
  public void setSKIPFRI(Boolean SKIP_FRI) {
    this.SKIP_FRI = SKIP_FRI;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Saturday.
   **/
  @ApiModelProperty(value = "Whether or not to skip scheduling of this Activity on a Saturday.")
  @JsonProperty("SKIP_SAT")
  public Boolean getSKIPSAT() {
    return SKIP_SAT;
  }
  public void setSKIPSAT(Boolean SKIP_SAT) {
    this.SKIP_SAT = SKIP_SAT;
  }

  
  /**
   * Determines the due date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  @ApiModelProperty(value = "Determines the due date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("DUE_DAYS_AFTER_START")
  public Integer getDUEDAYSAFTERSTART() {
    return DUE_DAYS_AFTER_START;
  }
  public void setDUEDAYSAFTERSTART(Integer DUE_DAYS_AFTER_START) {
    this.DUE_DAYS_AFTER_START = DUE_DAYS_AFTER_START;
  }

  
  /**
   * Determines the due date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  @ApiModelProperty(value = "Determines the due date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("DUE_DAYS_BEFORE_END")
  public Integer getDUEDAYSBEFOREEND() {
    return DUE_DAYS_BEFORE_END;
  }
  public void setDUEDAYSBEFOREEND(Integer DUE_DAYS_BEFORE_END) {
    this.DUE_DAYS_BEFORE_END = DUE_DAYS_BEFORE_END;
  }

  
  /**
   * Determines the event date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  @ApiModelProperty(value = "Determines the event date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("EVENT_DAYS_AFTER_START")
  public Integer getEVENTDAYSAFTERSTART() {
    return EVENT_DAYS_AFTER_START;
  }
  public void setEVENTDAYSAFTERSTART(Integer EVENT_DAYS_AFTER_START) {
    this.EVENT_DAYS_AFTER_START = EVENT_DAYS_AFTER_START;
  }

  
  /**
   * Determines the event date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  @ApiModelProperty(value = "Determines the event date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("EVENT_DAYS_BEFORE_END")
  public Integer getEVENTDAYSBEFOREEND() {
    return EVENT_DAYS_BEFORE_END;
  }
  public void setEVENTDAYSBEFOREEND(Integer EVENT_DAYS_BEFORE_END) {
    this.EVENT_DAYS_BEFORE_END = EVENT_DAYS_BEFORE_END;
  }

  
  /**
   * The time of the event. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  @ApiModelProperty(value = "The time of the event. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("EVENT_TIME")
  public String getEVENTTIME() {
    return EVENT_TIME;
  }
  public void setEVENTTIME(String EVENT_TIME) {
    this.EVENT_TIME = EVENT_TIME;
  }

  
  /**
   * Whether or not the event is an all day event. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  @ApiModelProperty(value = "Whether or not the event is an all day event. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("ALL_DAY")
  public Boolean getALLDAY() {
    return ALL_DAY;
  }
  public void setALLDAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
  }

  
  /**
   * Duration of the event in hours. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  @ApiModelProperty(value = "Duration of the event in hours. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("DURATION")
  public Integer getDURATION() {
    return DURATION;
  }
  public void setDURATION(Integer DURATION) {
    this.DURATION = DURATION;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivity {\n");
    
    sb.append("    ACTIVITY_ID: ").append(StringUtil.toIndentedString(ACTIVITY_ID)).append("\n");
    sb.append("    ACTIVITYSET_ID: ").append(StringUtil.toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    ACTIVITY_NAME: ").append(StringUtil.toIndentedString(ACTIVITY_NAME)).append("\n");
    sb.append("    ACTIVITY_DETAILS: ").append(StringUtil.toIndentedString(ACTIVITY_DETAILS)).append("\n");
    sb.append("    ACTIVITY_TYPE: ").append(StringUtil.toIndentedString(ACTIVITY_TYPE)).append("\n");
    sb.append("    CATEGORY_ID: ").append(StringUtil.toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    REMINDER: ").append(StringUtil.toIndentedString(REMINDER)).append("\n");
    sb.append("    REMINDER_DAYS_BEFORE_DUE: ").append(StringUtil.toIndentedString(REMINDER_DAYS_BEFORE_DUE)).append("\n");
    sb.append("    REMINDER_TIME: ").append(StringUtil.toIndentedString(REMINDER_TIME)).append("\n");
    sb.append("    PUBLICLY_VISIBLE: ").append(StringUtil.toIndentedString(PUBLICLY_VISIBLE)).append("\n");
    sb.append("    OWNER_VISIBLE: ").append(StringUtil.toIndentedString(OWNER_VISIBLE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(StringUtil.toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    ASSIGNED_TEAM_ID: ").append(StringUtil.toIndentedString(ASSIGNED_TEAM_ID)).append("\n");
    sb.append("    SKIP_SUN: ").append(StringUtil.toIndentedString(SKIP_SUN)).append("\n");
    sb.append("    SKIP_MON: ").append(StringUtil.toIndentedString(SKIP_MON)).append("\n");
    sb.append("    SKIP_TUE: ").append(StringUtil.toIndentedString(SKIP_TUE)).append("\n");
    sb.append("    SKIP_WED: ").append(StringUtil.toIndentedString(SKIP_WED)).append("\n");
    sb.append("    SKIP_THU: ").append(StringUtil.toIndentedString(SKIP_THU)).append("\n");
    sb.append("    SKIP_FRI: ").append(StringUtil.toIndentedString(SKIP_FRI)).append("\n");
    sb.append("    SKIP_SAT: ").append(StringUtil.toIndentedString(SKIP_SAT)).append("\n");
    sb.append("    DUE_DAYS_AFTER_START: ").append(StringUtil.toIndentedString(DUE_DAYS_AFTER_START)).append("\n");
    sb.append("    DUE_DAYS_BEFORE_END: ").append(StringUtil.toIndentedString(DUE_DAYS_BEFORE_END)).append("\n");
    sb.append("    EVENT_DAYS_AFTER_START: ").append(StringUtil.toIndentedString(EVENT_DAYS_AFTER_START)).append("\n");
    sb.append("    EVENT_DAYS_BEFORE_END: ").append(StringUtil.toIndentedString(EVENT_DAYS_BEFORE_END)).append("\n");
    sb.append("    EVENT_TIME: ").append(StringUtil.toIndentedString(EVENT_TIME)).append("\n");
    sb.append("    ALL_DAY: ").append(StringUtil.toIndentedString(ALL_DAY)).append("\n");
    sb.append("    DURATION: ").append(StringUtil.toIndentedString(DURATION)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
