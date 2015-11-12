package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * Pipeline stage change api object.
 **/
@ApiModel(description = "Pipeline stage change api object.")
public class APIPipelineStageChange   {
  
  private Long STAGE_ID = null;
  private APIActivitySetAssignment ACTIVITYSET_ASSIGNMENT = null;

  
  /**
   * ID of the new stage.
   **/
  @ApiModelProperty(value = "ID of the new stage.")
  @JsonProperty("STAGE_ID")
  public Long getSTAGEID() {
    return STAGE_ID;
  }
  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  
  /**
   * Assignment for the activity set associated with the stage. Must be provided if stage has an activity set.
   **/
  @ApiModelProperty(value = "Assignment for the activity set associated with the stage. Must be provided if stage has an activity set.")
  @JsonProperty("ACTIVITYSET_ASSIGNMENT")
  public APIActivitySetAssignment getACTIVITYSETASSIGNMENT() {
    return ACTIVITYSET_ASSIGNMENT;
  }
  public void setACTIVITYSETASSIGNMENT(APIActivitySetAssignment ACTIVITYSET_ASSIGNMENT) {
    this.ACTIVITYSET_ASSIGNMENT = ACTIVITYSET_ASSIGNMENT;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPipelineStageChange {\n");
    
    sb.append("    STAGE_ID: ").append(StringUtil.toIndentedString(STAGE_ID)).append("\n");
    sb.append("    ACTIVITYSET_ASSIGNMENT: ").append(StringUtil.toIndentedString(ACTIVITYSET_ASSIGNMENT)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
