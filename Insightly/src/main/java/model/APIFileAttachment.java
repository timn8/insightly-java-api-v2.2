package model;

import insightly.StringUtil;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIFileAttachment
 **/
@ApiModel(description = "APIFileAttachment")
public class APIFileAttachment   {
  
  private Long FILE_ID = null;
  private String FILE_NAME = null;
  private String CONTENT_TYPE = null;
  private Long FILE_SIZE = null;
  private Long FILE_CATEGORY_ID = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String URL = null;
  private Long CONTACT_ID = null;
  private Long COMMENT_ID = null;
  private Long EMAIL_ID = null;
  private Long LEAD_ID = null;
  private Long NOTE_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long ORGANISATION_ID = null;
  private Long PROJECT_ID = null;

  
  /**
   * Unique ID for the File Attachment record
   **/
  @ApiModelProperty(value = "Unique ID for the File Attachment record")
  @JsonProperty("FILE_ID")
  public Long getFILEID() {
    return FILE_ID;
  }
  public void setFILEID(Long FILE_ID) {
    this.FILE_ID = FILE_ID;
  }

  
  /**
   * The name and extension of the File Attachment
   **/
  @ApiModelProperty(required = true, value = "The name and extension of the File Attachment")
  @JsonProperty("FILE_NAME")
  public String getFILENAME() {
    return FILE_NAME;
  }
  public void setFILENAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
  }

  
  /**
   * The MIME type of the File Attachment
   **/
  @ApiModelProperty(required = true, value = "The MIME type of the File Attachment")
  @JsonProperty("CONTENT_TYPE")
  public String getCONTENTTYPE() {
    return CONTENT_TYPE;
  }
  public void setCONTENTTYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
  }

  
  /**
   * The size of the File Attachment, in bytes
   **/
  @ApiModelProperty(value = "The size of the File Attachment, in bytes")
  @JsonProperty("FILE_SIZE")
  public Long getFILESIZE() {
    return FILE_SIZE;
  }
  public void setFILESIZE(Long FILE_SIZE) {
    this.FILE_SIZE = FILE_SIZE;
  }

  
  /**
   * The category of the File Attachment, if it has been assigned to one
   **/
  @ApiModelProperty(value = "The category of the File Attachment, if it has been assigned to one")
  @JsonProperty("FILE_CATEGORY_ID")
  public Long getFILECATEGORYID() {
    return FILE_CATEGORY_ID;
  }
  public void setFILECATEGORYID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
  }

  
  /**
   * The User ID of the File Attachment owner
   **/
  @ApiModelProperty(value = "The User ID of the File Attachment owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time File Attachment record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time File Attachment record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time File Attachment record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time File Attachment record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * URL of the File Attachment
   **/
  @ApiModelProperty(value = "URL of the File Attachment")
  @JsonProperty("URL")
  public String getURL() {
    return URL;
  }
  public void setURL(String URL) {
    this.URL = URL;
  }

  
  /**
   * ID of the contact the file attachment belongs to.
   **/
  @ApiModelProperty(value = "ID of the contact the file attachment belongs to.")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * ID of the comment the file attachment belongs to.
   **/
  @ApiModelProperty(value = "ID of the comment the file attachment belongs to.")
  @JsonProperty("COMMENT_ID")
  public Long getCOMMENTID() {
    return COMMENT_ID;
  }
  public void setCOMMENTID(Long COMMENT_ID) {
    this.COMMENT_ID = COMMENT_ID;
  }

  
  /**
   * ID of the email the file attachment belongs to.
   **/
  @ApiModelProperty(value = "ID of the email the file attachment belongs to.")
  @JsonProperty("EMAIL_ID")
  public Long getEMAILID() {
    return EMAIL_ID;
  }
  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  
  /**
   * ID of the lead the file attachment belongs to.
   **/
  @ApiModelProperty(value = "ID of the lead the file attachment belongs to.")
  @JsonProperty("LEAD_ID")
  public Long getLEADID() {
    return LEAD_ID;
  }
  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }

  
  /**
   * ID of the note the file attachment belongs to.
   **/
  @ApiModelProperty(value = "ID of the note the file attachment belongs to.")
  @JsonProperty("NOTE_ID")
  public Long getNOTEID() {
    return NOTE_ID;
  }
  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  
  /**
   * ID of the opportunity the file attachment belongs to.
   **/
  @ApiModelProperty(value = "ID of the opportunity the file attachment belongs to.")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * ID of the organisation the file attachment belongs to.
   **/
  @ApiModelProperty(value = "ID of the organisation the file attachment belongs to.")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * ID of the project the file attachment belongs to.
   **/
  @ApiModelProperty(value = "ID of the project the file attachment belongs to.")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFileAttachment {\n");
    
    sb.append("    FILE_ID: ").append(StringUtil.toIndentedString(FILE_ID)).append("\n");
    sb.append("    FILE_NAME: ").append(StringUtil.toIndentedString(FILE_NAME)).append("\n");
    sb.append("    CONTENT_TYPE: ").append(StringUtil.toIndentedString(CONTENT_TYPE)).append("\n");
    sb.append("    FILE_SIZE: ").append(StringUtil.toIndentedString(FILE_SIZE)).append("\n");
    sb.append("    FILE_CATEGORY_ID: ").append(StringUtil.toIndentedString(FILE_CATEGORY_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    URL: ").append(StringUtil.toIndentedString(URL)).append("\n");
    sb.append("    CONTACT_ID: ").append(StringUtil.toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    COMMENT_ID: ").append(StringUtil.toIndentedString(COMMENT_ID)).append("\n");
    sb.append("    EMAIL_ID: ").append(StringUtil.toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    LEAD_ID: ").append(StringUtil.toIndentedString(LEAD_ID)).append("\n");
    sb.append("    NOTE_ID: ").append(StringUtil.toIndentedString(NOTE_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(StringUtil.toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(StringUtil.toIndentedString(PROJECT_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
