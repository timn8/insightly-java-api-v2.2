package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICustomFieldOption
 **/
@ApiModel(description = "APICustomFieldOption")
public class APICustomFieldOption   {
  
  private Integer OPTION_ID = null;
  private String OPTION_VALUE = null;
  private Boolean OPTION_DEFAULT = null;

  
  /**
   * OPTION_ID
   **/
  @ApiModelProperty(value = "OPTION_ID")
  @JsonProperty("OPTION_ID")
  public Integer getOPTIONID() {
    return OPTION_ID;
  }
  public void setOPTIONID(Integer OPTION_ID) {
    this.OPTION_ID = OPTION_ID;
  }

  
  /**
   * An option value for a dropdown Custom Field
   **/
  @ApiModelProperty(required = true, value = "An option value for a dropdown Custom Field")
  @JsonProperty("OPTION_VALUE")
  public String getOPTIONVALUE() {
    return OPTION_VALUE;
  }
  public void setOPTIONVALUE(String OPTION_VALUE) {
    this.OPTION_VALUE = OPTION_VALUE;
  }

  
  /**
   * True, if the option value should be the default
   **/
  @ApiModelProperty(required = true, value = "True, if the option value should be the default")
  @JsonProperty("OPTION_DEFAULT")
  public Boolean getOPTIONDEFAULT() {
    return OPTION_DEFAULT;
  }
  public void setOPTIONDEFAULT(Boolean OPTION_DEFAULT) {
    this.OPTION_DEFAULT = OPTION_DEFAULT;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomFieldOption {\n");
    
    sb.append("    OPTION_ID: ").append(StringUtil.toIndentedString(OPTION_ID)).append("\n");
    sb.append("    OPTION_VALUE: ").append(StringUtil.toIndentedString(OPTION_VALUE)).append("\n");
    sb.append("    OPTION_DEFAULT: ").append(StringUtil.toIndentedString(OPTION_DEFAULT)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
