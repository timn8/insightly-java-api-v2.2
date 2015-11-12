package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIPipelineStage
 **/
@ApiModel(description = "APIPipelineStage")
public class APIPipelineStage   {
  
  private Long PIPELINE_ID = null;
  private Long STAGE_ID = null;
  private String STAGE_NAME = null;
  private Integer STAGE_ORDER = null;
  private Long ACTIVITYSET_ID = null;
  private Long OWNER_USER_ID = null;

  
  /**
   * Unique ID for the Pipeline the Stage is participates in.
   **/
  @ApiModelProperty(value = "Unique ID for the Pipeline the Stage is participates in.")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * Unique ID for the Stage record.
   **/
  @ApiModelProperty(value = "Unique ID for the Stage record.")
  @JsonProperty("STAGE_ID")
  public Long getSTAGEID() {
    return STAGE_ID;
  }
  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  
  /**
   * Name of the Stage.
   **/
  @ApiModelProperty(value = "Name of the Stage.")
  @JsonProperty("STAGE_NAME")
  public String getSTAGENAME() {
    return STAGE_NAME;
  }
  public void setSTAGENAME(String STAGE_NAME) {
    this.STAGE_NAME = STAGE_NAME;
  }

  
  /**
   * Order of the Stage in the list of Stages for the Pipeline.
   **/
  @ApiModelProperty(value = "Order of the Stage in the list of Stages for the Pipeline.")
  @JsonProperty("STAGE_ORDER")
  public Integer getSTAGEORDER() {
    return STAGE_ORDER;
  }
  public void setSTAGEORDER(Integer STAGE_ORDER) {
    this.STAGE_ORDER = STAGE_ORDER;
  }

  
  /**
   * Optional ID of the activity set associated with the pipeline stage.
   **/
  @ApiModelProperty(value = "Optional ID of the activity set associated with the pipeline stage.")
  @JsonProperty("ACTIVITYSET_ID")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }
  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  
  /**
   * User ID of the Pipeline Stage record owner.
   **/
  @ApiModelProperty(value = "User ID of the Pipeline Stage record owner.")
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
    sb.append("class APIPipelineStage {\n");
    
    sb.append("    PIPELINE_ID: ").append(StringUtil.toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(StringUtil.toIndentedString(STAGE_ID)).append("\n");
    sb.append("    STAGE_NAME: ").append(StringUtil.toIndentedString(STAGE_NAME)).append("\n");
    sb.append("    STAGE_ORDER: ").append(StringUtil.toIndentedString(STAGE_ORDER)).append("\n");
    sb.append("    ACTIVITYSET_ID: ").append(StringUtil.toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
