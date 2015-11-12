package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * API instance object.
 **/
@ApiModel(description = "API instance object.")
public class APIInstance   {
  
  private String INSTANCE_NAME = null;
  private String INSTANCE_SUBDOMAIN = null;
  private String PLAN_NAME = null;

  
  /**
   * Name of your organization
   **/
  @ApiModelProperty(value = "Name of your organization")
  @JsonProperty("INSTANCE_NAME")
  public String getINSTANCENAME() {
    return INSTANCE_NAME;
  }
  public void setINSTANCENAME(String INSTANCE_NAME) {
    this.INSTANCE_NAME = INSTANCE_NAME;
  }

  
  /**
   * Sub domain of the instance
   **/
  @ApiModelProperty(value = "Sub domain of the instance")
  @JsonProperty("INSTANCE_SUBDOMAIN")
  public String getINSTANCESUBDOMAIN() {
    return INSTANCE_SUBDOMAIN;
  }
  public void setINSTANCESUBDOMAIN(String INSTANCE_SUBDOMAIN) {
    this.INSTANCE_SUBDOMAIN = INSTANCE_SUBDOMAIN;
  }

  
  /**
   * The plan that you have subscribed to
   **/
  @ApiModelProperty(value = "The plan that you have subscribed to")
  @JsonProperty("PLAN_NAME")
  public String getPLANNAME() {
    return PLAN_NAME;
  }
  public void setPLANNAME(String PLAN_NAME) {
    this.PLAN_NAME = PLAN_NAME;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIInstance {\n");
    
    sb.append("    INSTANCE_NAME: ").append(StringUtil.toIndentedString(INSTANCE_NAME)).append("\n");
    sb.append("    INSTANCE_SUBDOMAIN: ").append(StringUtil.toIndentedString(INSTANCE_SUBDOMAIN)).append("\n");
    sb.append("    PLAN_NAME: ").append(StringUtil.toIndentedString(PLAN_NAME)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
