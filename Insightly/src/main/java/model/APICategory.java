package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICategory
 **/
@ApiModel(description = "APICategory")
public class APICategory   {
  
  private Long CATEGORY_ID = null;
  private String CATEGORY_NAME = null;
  private Boolean ACTIVE = null;
  private String BACKGROUND_COLOR = null;

  
  /**
   * Unique ID for the category record
   **/
  @ApiModelProperty(value = "Unique ID for the category record")
  @JsonProperty("CATEGORY_ID")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }
  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  
  /**
   * Name of the Category
   **/
  @ApiModelProperty(required = true, value = "Name of the Category")
  @JsonProperty("CATEGORY_NAME")
  public String getCATEGORYNAME() {
    return CATEGORY_NAME;
  }
  public void setCATEGORYNAME(String CATEGORY_NAME) {
    this.CATEGORY_NAME = CATEGORY_NAME;
  }

  
  /**
   * True, if the Category is active
   **/
  @ApiModelProperty(value = "True, if the Category is active")
  @JsonProperty("ACTIVE")
  public Boolean getACTIVE() {
    return ACTIVE;
  }
  public void setACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  
  /**
   * The background color that will be displayed in the UI, in hex RGB, e.g. FF4A00 for Insightly orange
   **/
  @ApiModelProperty(required = true, value = "The background color that will be displayed in the UI, in hex RGB, e.g. FF4A00 for Insightly orange")
  @JsonProperty("BACKGROUND_COLOR")
  public String getBACKGROUNDCOLOR() {
    return BACKGROUND_COLOR;
  }
  public void setBACKGROUNDCOLOR(String BACKGROUND_COLOR) {
    this.BACKGROUND_COLOR = BACKGROUND_COLOR;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICategory {\n");
    
    sb.append("    CATEGORY_ID: ").append(StringUtil.toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    CATEGORY_NAME: ").append(StringUtil.toIndentedString(CATEGORY_NAME)).append("\n");
    sb.append("    ACTIVE: ").append(StringUtil.toIndentedString(ACTIVE)).append("\n");
    sb.append("    BACKGROUND_COLOR: ").append(StringUtil.toIndentedString(BACKGROUND_COLOR)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
