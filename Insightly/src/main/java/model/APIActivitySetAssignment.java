package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIActivitySetAssignment
 **/
@ApiModel(description = "APIActivitySetAssignment")
public class APIActivitySetAssignment   {
  
  private Long ACTIVITYSET_ID = null;
  private Date START_DATE = null;
  private Date END_DATE = null;
  private List<APIActivityAssignment> ACTIVITY_ASSIGNMENTS = new ArrayList<APIActivityAssignment>();

  
  /**
   * Unique ID for the Activity Set
   **/
  @ApiModelProperty(value = "Unique ID for the Activity Set")
  @JsonProperty("ACTIVITYSET_ID")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }
  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  
  /**
   * Start Date for the Activity Set
   **/
  @ApiModelProperty(value = "Start Date for the Activity Set")
  @JsonProperty("START_DATE")
  public Date getSTARTDATE() {
    return START_DATE;
  }
  public void setSTARTDATE(Date START_DATE) {
    this.START_DATE = START_DATE;
  }

  
  /**
   * End Date for the Activity Set. If activity set contains activities with end date specification then END_DATE is required
   **/
  @ApiModelProperty(value = "End Date for the Activity Set. If activity set contains activities with end date specification then END_DATE is required")
  @JsonProperty("END_DATE")
  public Date getENDDATE() {
    return END_DATE;
  }
  public void setENDDATE(Date END_DATE) {
    this.END_DATE = END_DATE;
  }

  
  /**
   * List of Activity Assignments. Only needed for Task Activities that have not been pre-assigned when configuring the Activity Set.
   **/
  @ApiModelProperty(value = "List of Activity Assignments. Only needed for Task Activities that have not been pre-assigned when configuring the Activity Set.")
  @JsonProperty("ACTIVITY_ASSIGNMENTS")
  public List<APIActivityAssignment> getACTIVITYASSIGNMENTS() {
    return ACTIVITY_ASSIGNMENTS;
  }
  public void setACTIVITYASSIGNMENTS(List<APIActivityAssignment> ACTIVITY_ASSIGNMENTS) {
    this.ACTIVITY_ASSIGNMENTS = ACTIVITY_ASSIGNMENTS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivitySetAssignment {\n");
    
    sb.append("    ACTIVITYSET_ID: ").append(StringUtil.toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    START_DATE: ").append(StringUtil.toIndentedString(START_DATE)).append("\n");
    sb.append("    END_DATE: ").append(StringUtil.toIndentedString(END_DATE)).append("\n");
    sb.append("    ACTIVITY_ASSIGNMENTS: ").append(StringUtil.toIndentedString(ACTIVITY_ASSIGNMENTS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
