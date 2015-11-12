package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICustomField
 **/
@ApiModel(description = "APICustomField")
public class APICustomField   {
  
  private String CUSTOM_FIELD_ID = null;
  private Object FIELD_VALUE = null;

  
  /**
   * The unique id of the custom field
   **/
  @ApiModelProperty(value = "The unique id of the custom field")
  @JsonProperty("CUSTOM_FIELD_ID")
  public String getCUSTOMFIELDID() {
    return CUSTOM_FIELD_ID;
  }
  public void setCUSTOMFIELDID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("FIELD_VALUE")
  public Object getFIELDVALUE() {
    return FIELD_VALUE;
  }
  public void setFIELDVALUE(Object FIELD_VALUE) {
    this.FIELD_VALUE = FIELD_VALUE;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomField {\n");
    
    sb.append("    CUSTOM_FIELD_ID: ").append(StringUtil.toIndentedString(CUSTOM_FIELD_ID)).append("\n");
    sb.append("    FIELD_VALUE: ").append(StringUtil.toIndentedString(FIELD_VALUE)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
