package model;

import insightly.StringUtil;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIComment
 **/
@ApiModel(description = "APIComment")
public class APIComment   {
  
  private Long COMMENT_ID = null;
  private String BODY = null;
  private Integer OWNER_USER_ID = null;
  private Long NOTE_ID = null;
  private Long EMAIL_ID = null;
  private Long TASK_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;

  
  /**
   * Unique ID for the Comment record.
   **/
  @ApiModelProperty(value = "Unique ID for the Comment record.")
  @JsonProperty("COMMENT_ID")
  public Long getCOMMENTID() {
    return COMMENT_ID;
  }
  public void setCOMMENTID(Long COMMENT_ID) {
    this.COMMENT_ID = COMMENT_ID;
  }

  
  /**
   * Text of the Comment.
   **/
  @ApiModelProperty(value = "Text of the Comment.")
  @JsonProperty("BODY")
  public String getBODY() {
    return BODY;
  }
  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  
  /**
   * User ID of the Owner of the Comment.
   **/
  @ApiModelProperty(value = "User ID of the Owner of the Comment.")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * ID of the note the comment belongs to.
   **/
  @ApiModelProperty(value = "ID of the note the comment belongs to.")
  @JsonProperty("NOTE_ID")
  public Long getNOTEID() {
    return NOTE_ID;
  }
  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  
  /**
   * ID of the email the comment belongs to.
   **/
  @ApiModelProperty(value = "ID of the email the comment belongs to.")
  @JsonProperty("EMAIL_ID")
  public Long getEMAILID() {
    return EMAIL_ID;
  }
  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  
  /**
   * ID of the task the comment belongs to.
   **/
  @ApiModelProperty(value = "ID of the task the comment belongs to.")
  @JsonProperty("TASK_ID")
  public Long getTASKID() {
    return TASK_ID;
  }
  public void setTASKID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
  }

  
  /**
   * Date and Time Comment Created as Coordinated Universal Time.
   **/
  @ApiModelProperty(value = "Date and Time Comment Created as Coordinated Universal Time.")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and Time Comment Updated as Coordinated Universal Time.
   **/
  @ApiModelProperty(value = "Date and Time Comment Updated as Coordinated Universal Time.")
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
    sb.append("class APIComment {\n");
    
    sb.append("    COMMENT_ID: ").append(StringUtil.toIndentedString(COMMENT_ID)).append("\n");
    sb.append("    BODY: ").append(StringUtil.toIndentedString(BODY)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    NOTE_ID: ").append(StringUtil.toIndentedString(NOTE_ID)).append("\n");
    sb.append("    EMAIL_ID: ").append(StringUtil.toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    TASK_ID: ").append(StringUtil.toIndentedString(TASK_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
