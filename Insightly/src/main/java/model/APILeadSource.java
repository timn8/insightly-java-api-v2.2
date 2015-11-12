package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICategory
 **/
@ApiModel(description = "APICategory")
public class APILeadSource   {
  
  private Integer FIELD_ORDER = null;
  private String LEAD_SOURCE = null;
  private Boolean DEFAULT_VALUE = null;
  private Long LEAD_SOURCE_ID = null;

  
  /**
   * Field Order used to retrive list sorted
   **/
  @ApiModelProperty(value = "Field Order used to retrive list sorted")
  @JsonProperty("FIELD_ORDER")
  public Integer getFIELDORDER() {
    return FIELD_ORDER;
  }
  public void setFIELDORDER(Integer FIELD_ORDER) {
    this.FIELD_ORDER = FIELD_ORDER;
  }

  
  /**
   * Lead Source value
   **/
  @ApiModelProperty(required = true, value = "Lead Source value")
  @JsonProperty("LEAD_SOURCE")
  public String getLEADSOURCE() {
    return LEAD_SOURCE;
  }
  public void setLEADSOURCE(String LEAD_SOURCE) {
    this.LEAD_SOURCE = LEAD_SOURCE;
  }

  
  /**
   * checks or sets the current Lead source for being the default value
   **/
  @ApiModelProperty(value = "checks or sets the current Lead source for being the default value")
  @JsonProperty("DEFAULT_VALUE")
  public Boolean getDEFAULTVALUE() {
    return DEFAULT_VALUE;
  }
  public void setDEFAULTVALUE(Boolean DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
  }

  
  /**
   * Unique ID for the current Lead Source
   **/
  @ApiModelProperty(value = "Unique ID for the current Lead Source")
  @JsonProperty("LEAD_SOURCE_ID")
  public Long getLEADSOURCEID() {
    return LEAD_SOURCE_ID;
  }
  public void setLEADSOURCEID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILeadSource {\n");
    
    sb.append("    FIELD_ORDER: ").append(StringUtil.toIndentedString(FIELD_ORDER)).append("\n");
    sb.append("    LEAD_SOURCE: ").append(StringUtil.toIndentedString(LEAD_SOURCE)).append("\n");
    sb.append("    DEFAULT_VALUE: ").append(StringUtil.toIndentedString(DEFAULT_VALUE)).append("\n");
    sb.append("    LEAD_SOURCE_ID: ").append(StringUtil.toIndentedString(LEAD_SOURCE_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
