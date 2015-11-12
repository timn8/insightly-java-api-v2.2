package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICountry
 **/
@ApiModel(description = "APICountry")
public class APICountry   {
  
  private String COUNTRY_NAME = null;

  
  /**
   * Country Name
   **/
  @ApiModelProperty(value = "Country Name")
  @JsonProperty("COUNTRY_NAME")
  public String getCOUNTRYNAME() {
    return COUNTRY_NAME;
  }
  public void setCOUNTRYNAME(String COUNTRY_NAME) {
    this.COUNTRY_NAME = COUNTRY_NAME;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICountry {\n");
    
    sb.append("    COUNTRY_NAME: ").append(StringUtil.toIndentedString(COUNTRY_NAME)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
