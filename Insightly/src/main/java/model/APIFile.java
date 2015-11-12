package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * Container for an uploaded file
 **/
@ApiModel(description = "Container for an uploaded file")
public class APIFile   {
  
  private String FILE_NAME = null;
  private String CONTENT_TYPE = null;
  private Long FILE_CATEGORY_ID = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFile {\n");
    
    sb.append("    FILE_NAME: ").append(StringUtil.toIndentedString(FILE_NAME)).append("\n");
    sb.append("    CONTENT_TYPE: ").append(StringUtil.toIndentedString(CONTENT_TYPE)).append("\n");
    sb.append("    FILE_CATEGORY_ID: ").append(StringUtil.toIndentedString(FILE_CATEGORY_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
