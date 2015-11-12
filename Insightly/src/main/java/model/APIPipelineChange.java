package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * Pipeline change api object.
 **/
@ApiModel(description = "Pipeline change api object.")
public class APIPipelineChange   {
  
  private Long PIPELINE_ID = null;
  private APIPipelineStageChange PIPELINE_STAGE_CHANGE = null;

  
  /**
   * ID of the new pipeline.
   **/
  @ApiModelProperty(value = "ID of the new pipeline.")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * Initial stage of the pipeline.
   **/
  @ApiModelProperty(value = "Initial stage of the pipeline.")
  @JsonProperty("PIPELINE_STAGE_CHANGE")
  public APIPipelineStageChange getPIPELINESTAGECHANGE() {
    return PIPELINE_STAGE_CHANGE;
  }
  public void setPIPELINESTAGECHANGE(APIPipelineStageChange PIPELINE_STAGE_CHANGE) {
    this.PIPELINE_STAGE_CHANGE = PIPELINE_STAGE_CHANGE;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPipelineChange {\n");
    
    sb.append("    PIPELINE_ID: ").append(StringUtil.toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    PIPELINE_STAGE_CHANGE: ").append(StringUtil.toIndentedString(PIPELINE_STAGE_CHANGE)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
