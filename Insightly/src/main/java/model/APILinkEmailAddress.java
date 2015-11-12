package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * API object for a link email address.
 **/
@ApiModel(description = "API object for a link email address.")
public class APILinkEmailAddress   {
  
  private String EMAIL = null;

  
  /**
   * Email address.
   **/
  @ApiModelProperty(value = "Email address.")
  @JsonProperty("EMAIL")
  public String getEMAIL() {
    return EMAIL;
  }
  public void setEMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILinkEmailAddress {\n");
    
    sb.append("    EMAIL: ").append(StringUtil.toIndentedString(EMAIL)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
