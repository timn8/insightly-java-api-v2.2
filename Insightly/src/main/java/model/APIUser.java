package model;

import insightly.StringUtil;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIUser
 **/
@ApiModel(description = "APIUser")
public class APIUser   {
  
  private Long USER_ID = null;
  private Long CONTACT_ID = null;
  private String FIRST_NAME = null;
  private String LAST_NAME = null;
  private String TIMEZONE_ID = null;
  private String EMAIL_ADDRESS = null;
  private String EMAIL_DROPBOX_IDENTIFIER = null;
  private Boolean ADMINISTRATOR = null;
  private Boolean ACCOUNT_OWNER = null;
  private Boolean ACTIVE = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String USER_CURRENCY = null;
  private String CONTACT_DISPLAY = null;
  private String CONTACT_ORDER = null;
  private Integer TASK_WEEK_START = null;
  private Long INSTANCE_ID = null;

  
  /**
   * Unique ID for the user record
   **/
  @ApiModelProperty(value = "Unique ID for the user record")
  @JsonProperty("USER_ID")
  public Long getUSERID() {
    return USER_ID;
  }
  public void setUSERID(Long USER_ID) {
    this.USER_ID = USER_ID;
  }

  
  /**
   * Unique ID for the Contact record corresponding to the User
   **/
  @ApiModelProperty(value = "Unique ID for the Contact record corresponding to the User")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * First name
   **/
  @ApiModelProperty(value = "First name")
  @JsonProperty("FIRST_NAME")
  public String getFIRSTNAME() {
    return FIRST_NAME;
  }
  public void setFIRSTNAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  
  /**
   * Last name
   **/
  @ApiModelProperty(value = "Last name")
  @JsonProperty("LAST_NAME")
  public String getLASTNAME() {
    return LAST_NAME;
  }
  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  
  /**
   * Timezone ID as set by the User in the User's regional settings
   **/
  @ApiModelProperty(value = "Timezone ID as set by the User in the User's regional settings")
  @JsonProperty("TIMEZONE_ID")
  public String getTIMEZONEID() {
    return TIMEZONE_ID;
  }
  public void setTIMEZONEID(String TIMEZONE_ID) {
    this.TIMEZONE_ID = TIMEZONE_ID;
  }

  
  /**
   * User's email address
   **/
  @ApiModelProperty(value = "User's email address")
  @JsonProperty("EMAIL_ADDRESS")
  public String getEMAILADDRESS() {
    return EMAIL_ADDRESS;
  }
  public void setEMAILADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
  }

  
  /**
   * Identifier of the User's personal email box, shown in the User's email mailbox setting
   **/
  @ApiModelProperty(value = "Identifier of the User's personal email box, shown in the User's email mailbox setting")
  @JsonProperty("EMAIL_DROPBOX_IDENTIFIER")
  public String getEMAILDROPBOXIDENTIFIER() {
    return EMAIL_DROPBOX_IDENTIFIER;
  }
  public void setEMAILDROPBOXIDENTIFIER(String EMAIL_DROPBOX_IDENTIFIER) {
    this.EMAIL_DROPBOX_IDENTIFIER = EMAIL_DROPBOX_IDENTIFIER;
  }

  
  /**
   * True, if the User is an Administrator for the Insightly instance
   **/
  @ApiModelProperty(value = "True, if the User is an Administrator for the Insightly instance")
  @JsonProperty("ADMINISTRATOR")
  public Boolean getADMINISTRATOR() {
    return ADMINISTRATOR;
  }
  public void setADMINISTRATOR(Boolean ADMINISTRATOR) {
    this.ADMINISTRATOR = ADMINISTRATOR;
  }

  
  /**
   * True, if the User is the Account owner for the Insightly instance
   **/
  @ApiModelProperty(value = "True, if the User is the Account owner for the Insightly instance")
  @JsonProperty("ACCOUNT_OWNER")
  public Boolean getACCOUNTOWNER() {
    return ACCOUNT_OWNER;
  }
  public void setACCOUNTOWNER(Boolean ACCOUNT_OWNER) {
    this.ACCOUNT_OWNER = ACCOUNT_OWNER;
  }

  
  /**
   * True, if the account is active
   **/
  @ApiModelProperty(value = "True, if the account is active")
  @JsonProperty("ACTIVE")
  public Boolean getACTIVE() {
    return ACTIVE;
  }
  public void setACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  
  /**
   * Date and time User record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time User record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time User record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time User record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * User's regional setting for Currency
   **/
  @ApiModelProperty(value = "User's regional setting for Currency")
  @JsonProperty("USER_CURRENCY")
  public String getUSERCURRENCY() {
    return USER_CURRENCY;
  }
  public void setUSERCURRENCY(String USER_CURRENCY) {
    this.USER_CURRENCY = USER_CURRENCY;
  }

  
  /**
   * User's setting for Contact List display
   **/
  @ApiModelProperty(value = "User's setting for Contact List display")
  @JsonProperty("CONTACT_DISPLAY")
  public String getCONTACTDISPLAY() {
    return CONTACT_DISPLAY;
  }
  public void setCONTACTDISPLAY(String CONTACT_DISPLAY) {
    this.CONTACT_DISPLAY = CONTACT_DISPLAY;
  }

  
  /**
   * User's settting for Contact List order
   **/
  @ApiModelProperty(value = "User's settting for Contact List order")
  @JsonProperty("CONTACT_ORDER")
  public String getCONTACTORDER() {
    return CONTACT_ORDER;
  }
  public void setCONTACTORDER(String CONTACT_ORDER) {
    this.CONTACT_ORDER = CONTACT_ORDER;
  }

  
  /**
   * User's start day of week
   **/
  @ApiModelProperty(value = "User's start day of week")
  @JsonProperty("TASK_WEEK_START")
  public Integer getTASKWEEKSTART() {
    return TASK_WEEK_START;
  }
  public void setTASKWEEKSTART(Integer TASK_WEEK_START) {
    this.TASK_WEEK_START = TASK_WEEK_START;
  }

  
  /**
   * Unique key of the Instance/Account record
   **/
  @ApiModelProperty(value = "Unique key of the Instance/Account record")
  @JsonProperty("INSTANCE_ID")
  public Long getINSTANCEID() {
    return INSTANCE_ID;
  }
  public void setINSTANCEID(Long INSTANCE_ID) {
    this.INSTANCE_ID = INSTANCE_ID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIUser {\n");
    
    sb.append("    USER_ID: ").append(StringUtil.toIndentedString(USER_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(StringUtil.toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    FIRST_NAME: ").append(StringUtil.toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    LAST_NAME: ").append(StringUtil.toIndentedString(LAST_NAME)).append("\n");
    sb.append("    TIMEZONE_ID: ").append(StringUtil.toIndentedString(TIMEZONE_ID)).append("\n");
    sb.append("    EMAIL_ADDRESS: ").append(StringUtil.toIndentedString(EMAIL_ADDRESS)).append("\n");
    sb.append("    EMAIL_DROPBOX_IDENTIFIER: ").append(StringUtil.toIndentedString(EMAIL_DROPBOX_IDENTIFIER)).append("\n");
    sb.append("    ADMINISTRATOR: ").append(StringUtil.toIndentedString(ADMINISTRATOR)).append("\n");
    sb.append("    ACCOUNT_OWNER: ").append(StringUtil.toIndentedString(ACCOUNT_OWNER)).append("\n");
    sb.append("    ACTIVE: ").append(StringUtil.toIndentedString(ACTIVE)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    USER_CURRENCY: ").append(StringUtil.toIndentedString(USER_CURRENCY)).append("\n");
    sb.append("    CONTACT_DISPLAY: ").append(StringUtil.toIndentedString(CONTACT_DISPLAY)).append("\n");
    sb.append("    CONTACT_ORDER: ").append(StringUtil.toIndentedString(CONTACT_ORDER)).append("\n");
    sb.append("    TASK_WEEK_START: ").append(StringUtil.toIndentedString(TASK_WEEK_START)).append("\n");
    sb.append("    INSTANCE_ID: ").append(StringUtil.toIndentedString(INSTANCE_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
