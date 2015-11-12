package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APITag
 **/
@ApiModel(description = "APITag")
public class APITag   {
  
  private String TAG_NAME = null;

  
  /**
   * A tag name added to a contact, lead, organisation, opportunity or project
   **/
  @ApiModelProperty(value = "A tag name added to a contact, lead, organisation, opportunity or project")
  @JsonProperty("TAG_NAME")
  public String getTAGNAME() {
    return TAG_NAME;
  }
  public void setTAGNAME(String TAG_NAME) {
    this.TAG_NAME = TAG_NAME;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITag {\n");
    
    sb.append("    TAG_NAME: ").append(StringUtil.toIndentedString(TAG_NAME)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
