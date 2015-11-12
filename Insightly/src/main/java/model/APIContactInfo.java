package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIContactInfo
 **/
@ApiModel(description = "APIContactInfo")
public class APIContactInfo   {
  
  private Long CONTACT_INFO_ID = null;
  private String TYPE = null;
  private String SUBTYPE = null;
  private String LABEL = null;
  private String DETAIL = null;

  
  /**
   * Unique key of the Contact Info record
   **/
  @ApiModelProperty(value = "Unique key of the Contact Info record")
  @JsonProperty("CONTACT_INFO_ID")
  public Long getCONTACTINFOID() {
    return CONTACT_INFO_ID;
  }
  public void setCONTACTINFOID(Long CONTACT_INFO_ID) {
    this.CONTACT_INFO_ID = CONTACT_INFO_ID;
  }

  
  /**
   * Type of Contact Info
   **/
  @ApiModelProperty(required = true, value = "Type of Contact Info")
  @JsonProperty("TYPE")
  public String getTYPE() {
    return TYPE;
  }
  public void setTYPE(String TYPE) {
    this.TYPE = TYPE;
  }

  
  /**
   * Subtype of Contact Info
   **/
  @ApiModelProperty(value = "Subtype of Contact Info")
  @JsonProperty("SUBTYPE")
  public String getSUBTYPE() {
    return SUBTYPE;
  }
  public void setSUBTYPE(String SUBTYPE) {
    this.SUBTYPE = SUBTYPE;
  }

  
  /**
   * Label
   **/
  @ApiModelProperty(value = "Label")
  @JsonProperty("LABEL")
  public String getLABEL() {
    return LABEL;
  }
  public void setLABEL(String LABEL) {
    this.LABEL = LABEL;
  }

  
  /**
   * Detail of the Contact Info
   **/
  @ApiModelProperty(required = true, value = "Detail of the Contact Info")
  @JsonProperty("DETAIL")
  public String getDETAIL() {
    return DETAIL;
  }
  public void setDETAIL(String DETAIL) {
    this.DETAIL = DETAIL;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContactInfo {\n");
    
    sb.append("    CONTACT_INFO_ID: ").append(insightly.StringUtil.toIndentedString(CONTACT_INFO_ID)).append("\n");
    sb.append("    TYPE: ").append(StringUtil.toIndentedString(TYPE)).append("\n");
    sb.append("    SUBTYPE: ").append(StringUtil.toIndentedString(SUBTYPE)).append("\n");
    sb.append("    LABEL: ").append(StringUtil.toIndentedString(LABEL)).append("\n");
    sb.append("    DETAIL: ").append(StringUtil.toIndentedString(DETAIL)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
