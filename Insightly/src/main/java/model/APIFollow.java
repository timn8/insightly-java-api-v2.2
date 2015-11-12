package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIFollow
 **/
@ApiModel(description = "APIFollow")
public class APIFollow   {
  
  private Boolean FOLLOWING = null;

  
  /**
   * Whether or not a user is following a contact, organisation, opportunity or project
   **/
  @ApiModelProperty(value = "Whether or not a user is following a contact, organisation, opportunity or project")
  @JsonProperty("FOLLOWING")
  public Boolean getFOLLOWING() {
    return FOLLOWING;
  }
  public void setFOLLOWING(Boolean FOLLOWING) {
    this.FOLLOWING = FOLLOWING;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFollow {\n");
    
    sb.append("    FOLLOWING: ").append(StringUtil.toIndentedString(FOLLOWING)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
