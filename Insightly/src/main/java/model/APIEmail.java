package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIEmail
 **/
@ApiModel(description = "APIEmail")
public class APIEmail   {
  
  private Long EMAIL_ID = null;
  private String GMAIL_MESSAGE_ID = null;
  private Date EMAIL_DATE_UTC = null;
  private String EMAIL_FROM = null;
  private String EMAIL_TO = null;
  private String EMAIL_CC = null;
  private String SUBJECT = null;
  private String BODY = null;
  private String FORMAT = null;
  private Long SIZE = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APIEmailLink> EMAILLINKS = new ArrayList<APIEmailLink>();
  private List<APITag> TAGS = new ArrayList<APITag>();

  
  /**
   * Unique ID for the email record
   **/
  @ApiModelProperty(value = "Unique ID for the email record")
  @JsonProperty("EMAIL_ID")
  public Long getEMAILID() {
    return EMAIL_ID;
  }
  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  
  /**
   * Unique key of the Gmail message
   **/
  @ApiModelProperty(value = "Unique key of the Gmail message")
  @JsonProperty("GMAIL_MESSAGE_ID")
  public String getGMAILMESSAGEID() {
    return GMAIL_MESSAGE_ID;
  }
  public void setGMAILMESSAGEID(String GMAIL_MESSAGE_ID) {
    this.GMAIL_MESSAGE_ID = GMAIL_MESSAGE_ID;
  }

  
  /**
   * Date and time email sent, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time email sent, as Coordinated Universal Time")
  @JsonProperty("EMAIL_DATE_UTC")
  public Date getEMAILDATEUTC() {
    return EMAIL_DATE_UTC;
  }
  public void setEMAILDATEUTC(Date EMAIL_DATE_UTC) {
    this.EMAIL_DATE_UTC = EMAIL_DATE_UTC;
  }

  
  /**
   * From address of the email
   **/
  @ApiModelProperty(value = "From address of the email")
  @JsonProperty("EMAIL_FROM")
  public String getEMAILFROM() {
    return EMAIL_FROM;
  }
  public void setEMAILFROM(String EMAIL_FROM) {
    this.EMAIL_FROM = EMAIL_FROM;
  }

  
  /**
   * To addresses of the email
   **/
  @ApiModelProperty(value = "To addresses of the email")
  @JsonProperty("EMAIL_TO")
  public String getEMAILTO() {
    return EMAIL_TO;
  }
  public void setEMAILTO(String EMAIL_TO) {
    this.EMAIL_TO = EMAIL_TO;
  }

  
  /**
   * CC addresses of the email
   **/
  @ApiModelProperty(value = "CC addresses of the email")
  @JsonProperty("EMAIL_CC")
  public String getEMAILCC() {
    return EMAIL_CC;
  }
  public void setEMAILCC(String EMAIL_CC) {
    this.EMAIL_CC = EMAIL_CC;
  }

  
  /**
   * Subject of the Email
   **/
  @ApiModelProperty(value = "Subject of the Email")
  @JsonProperty("SUBJECT")
  public String getSUBJECT() {
    return SUBJECT;
  }
  public void setSUBJECT(String SUBJECT) {
    this.SUBJECT = SUBJECT;
  }

  
  /**
   * The body, or an extract of it, of the email
   **/
  @ApiModelProperty(value = "The body, or an extract of it, of the email")
  @JsonProperty("BODY")
  public String getBODY() {
    return BODY;
  }
  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  
  /**
   * Format of the email: text or html
   **/
  @ApiModelProperty(value = "Format of the email: text or html")
  @JsonProperty("FORMAT")
  public String getFORMAT() {
    return FORMAT;
  }
  public void setFORMAT(String FORMAT) {
    this.FORMAT = FORMAT;
  }

  
  /**
   * The size of the email, in bytes
   **/
  @ApiModelProperty(value = "The size of the email, in bytes")
  @JsonProperty("SIZE")
  public Long getSIZE() {
    return SIZE;
  }
  public void setSIZE(Long SIZE) {
    this.SIZE = SIZE;
  }

  
  /**
   * Insightly User ID of the email owner
   **/
  @ApiModelProperty(value = "Insightly User ID of the email owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Email record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Email record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
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
   * Set of links attached to the Email
   **/
  @ApiModelProperty(value = "Set of links attached to the Email")
  @JsonProperty("EMAILLINKS")
  public List<APIEmailLink> getEMAILLINKS() {
    return EMAILLINKS;
  }
  public void setEMAILLINKS(List<APIEmailLink> EMAILLINKS) {
    this.EMAILLINKS = EMAILLINKS;
  }

  
  /**
   * Set of tags attached to the Email
   **/
  @ApiModelProperty(value = "Set of tags attached to the Email")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEmail {\n");
    
    sb.append("    EMAIL_ID: ").append(StringUtil.toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    GMAIL_MESSAGE_ID: ").append(StringUtil.toIndentedString(GMAIL_MESSAGE_ID)).append("\n");
    sb.append("    EMAIL_DATE_UTC: ").append(StringUtil.toIndentedString(EMAIL_DATE_UTC)).append("\n");
    sb.append("    EMAIL_FROM: ").append(StringUtil.toIndentedString(EMAIL_FROM)).append("\n");
    sb.append("    EMAIL_TO: ").append(StringUtil.toIndentedString(EMAIL_TO)).append("\n");
    sb.append("    EMAIL_CC: ").append(StringUtil.toIndentedString(EMAIL_CC)).append("\n");
    sb.append("    SUBJECT: ").append(StringUtil.toIndentedString(SUBJECT)).append("\n");
    sb.append("    BODY: ").append(StringUtil.toIndentedString(BODY)).append("\n");
    sb.append("    FORMAT: ").append(StringUtil.toIndentedString(FORMAT)).append("\n");
    sb.append("    SIZE: ").append(StringUtil.toIndentedString(SIZE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(StringUtil.toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(StringUtil.toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(StringUtil.toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    EMAILLINKS: ").append(StringUtil.toIndentedString(EMAILLINKS)).append("\n");
    sb.append("    TAGS: ").append(StringUtil.toIndentedString(TAGS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
