package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIPipeline
 **/
@ApiModel(description = "APIPipeline")
public class APIPipeline   {
  
  private Long PIPELINE_ID = null;
  private String PIPELINE_NAME = null;
  private Boolean FOR_OPPORTUNITIES = null;
  private Boolean FOR_PROJECTS = null;
  private Long OWNER_USER_ID = null;

  
  /**
   * Unique ID for the Pipeline record.
   **/
  @ApiModelProperty(value = "Unique ID for the Pipeline record.")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * Name of the Pipeline.
   **/
  @ApiModelProperty(value = "Name of the Pipeline.")
  @JsonProperty("PIPELINE_NAME")
  public String getPIPELINENAME() {
    return PIPELINE_NAME;
  }
  public void setPIPELINENAME(String PIPELINE_NAME) {
    this.PIPELINE_NAME = PIPELINE_NAME;
  }

  
  /**
   * True if the Pipeline is available for Opportunity records.
   **/
  @ApiModelProperty(value = "True if the Pipeline is available for Opportunity records.")
  @JsonProperty("FOR_OPPORTUNITIES")
  public Boolean getFOROPPORTUNITIES() {
    return FOR_OPPORTUNITIES;
  }
  public void setFOROPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
  }

  
  /**
   * True if the Pipeline is available for Project records.
   **/
  @ApiModelProperty(value = "True if the Pipeline is available for Project records.")
  @JsonProperty("FOR_PROJECTS")
  public Boolean getFORPROJECTS() {
    return FOR_PROJECTS;
  }
  public void setFORPROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
  }

  
  /**
   * User ID of the Pipeline record owner.
   **/
  @ApiModelProperty(value = "User ID of the Pipeline record owner.")
  @JsonProperty("OWNER_USER_ID")
  public Long getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Long OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPipeline {\n");
    
    sb.append("    PIPELINE_ID: ").append(StringUtil.toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    PIPELINE_NAME: ").append(StringUtil.toIndentedString(PIPELINE_NAME)).append("\n");
    sb.append("    FOR_OPPORTUNITIES: ").append(StringUtil.toIndentedString(FOR_OPPORTUNITIES)).append("\n");
    sb.append("    FOR_PROJECTS: ").append(StringUtil.toIndentedString(FOR_PROJECTS)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
