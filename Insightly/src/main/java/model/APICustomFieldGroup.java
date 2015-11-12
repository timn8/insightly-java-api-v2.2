package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICustomFieldGroup
 **/
@ApiModel(description = "APICustomFieldGroup")
public class APICustomFieldGroup   {
  
  private Long GROUP_ID = null;
  private String GROUP_NAME = null;
  private String GROUP_FOR = null;
  private Integer GROUP_ORDER = null;

  
  /**
   * Unique ID for the custom field group
   **/
  @ApiModelProperty(value = "Unique ID for the custom field group")
  @JsonProperty("GROUP_ID")
  public Long getGROUPID() {
    return GROUP_ID;
  }
  public void setGROUPID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
  }

  
  /**
   * Name of the custom field group
   **/
  @ApiModelProperty(value = "Name of the custom field group")
  @JsonProperty("GROUP_NAME")
  public String getGROUPNAME() {
    return GROUP_NAME;
  }
  public void setGROUPNAME(String GROUP_NAME) {
    this.GROUP_NAME = GROUP_NAME;
  }

  
  /**
   * The type of object this group is for: Contact, Organisation, Project or Opportunity
   **/
  @ApiModelProperty(value = "The type of object this group is for: Contact, Organisation, Project or Opportunity")
  @JsonProperty("GROUP_FOR")
  public String getGROUPFOR() {
    return GROUP_FOR;
  }
  public void setGROUPFOR(String GROUP_FOR) {
    this.GROUP_FOR = GROUP_FOR;
  }

  
  /**
   * The order of the group
   **/
  @ApiModelProperty(value = "The order of the group")
  @JsonProperty("GROUP_ORDER")
  public Integer getGROUPORDER() {
    return GROUP_ORDER;
  }
  public void setGROUPORDER(Integer GROUP_ORDER) {
    this.GROUP_ORDER = GROUP_ORDER;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomFieldGroup {\n");
    
    sb.append("    GROUP_ID: ").append(StringUtil.toIndentedString(GROUP_ID)).append("\n");
    sb.append("    GROUP_NAME: ").append(StringUtil.toIndentedString(GROUP_NAME)).append("\n");
    sb.append("    GROUP_FOR: ").append(StringUtil.toIndentedString(GROUP_FOR)).append("\n");
    sb.append("    GROUP_ORDER: ").append(StringUtil.toIndentedString(GROUP_ORDER)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
