package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICustomFieldMetadata
 **/
@ApiModel(description = "APICustomFieldMetadata")
public class APICustomFieldMetadata   {
  
  private String CUSTOM_FIELD_ID = null;
  private Long ORDER_ID = null;
  private String FIELD_FOR = null;
  private String FIELD_NAME = null;
  private String FIELD_TYPE = null;
  private String FIELD_HELP_TEXT = null;
  private Object DEFAULT_VALUE = null;
  private Long GROUP_ID = null;
  private Boolean EDITABLE = null;
  private Boolean VISIBLE = null;
  private List<APICustomFieldOption> CUSTOM_FIELD_OPTIONS = new ArrayList<APICustomFieldOption>();

  
  /**
   * Unique ID for the custom field record
   **/
  @ApiModelProperty(required = true, value = "Unique ID for the custom field record")
  @JsonProperty("CUSTOM_FIELD_ID")
  public String getCUSTOMFIELDID() {
    return CUSTOM_FIELD_ID;
  }
  public void setCUSTOMFIELDID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
  }

  
  /**
   * ORDER_ID is required
   **/
  @ApiModelProperty(required = true, value = "ORDER_ID is required")
  @JsonProperty("ORDER_ID")
  public Long getORDERID() {
    return ORDER_ID;
  }
  public void setORDERID(Long ORDER_ID) {
    this.ORDER_ID = ORDER_ID;
  }

  
  /**
   * The type of object this custom field is for: Contact, Organisation, Project or Opportunity
   **/
  @ApiModelProperty(required = true, value = "The type of object this custom field is for: Contact, Organisation, Project or Opportunity")
  @JsonProperty("FIELD_FOR")
  public String getFIELDFOR() {
    return FIELD_FOR;
  }
  public void setFIELDFOR(String FIELD_FOR) {
    this.FIELD_FOR = FIELD_FOR;
  }

  
  /**
   * The name of the custom field
   **/
  @ApiModelProperty(required = true, value = "The name of the custom field")
  @JsonProperty("FIELD_NAME")
  public String getFIELDNAME() {
    return FIELD_NAME;
  }
  public void setFIELDNAME(String FIELD_NAME) {
    this.FIELD_NAME = FIELD_NAME;
  }

  
  /**
   * The type of data this custom field holds: text, date or dropdown
   **/
  @ApiModelProperty(required = true, value = "The type of data this custom field holds: text, date or dropdown")
  @JsonProperty("FIELD_TYPE")
  public String getFIELDTYPE() {
    return FIELD_TYPE;
  }
  public void setFIELDTYPE(String FIELD_TYPE) {
    this.FIELD_TYPE = FIELD_TYPE;
  }

  
  /**
   * Help text that appears next to the custom field in the UI.
   **/
  @ApiModelProperty(value = "Help text that appears next to the custom field in the UI.")
  @JsonProperty("FIELD_HELP_TEXT")
  public String getFIELDHELPTEXT() {
    return FIELD_HELP_TEXT;
  }
  public void setFIELDHELPTEXT(String FIELD_HELP_TEXT) {
    this.FIELD_HELP_TEXT = FIELD_HELP_TEXT;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("DEFAULT_VALUE")
  public Object getDEFAULTVALUE() {
    return DEFAULT_VALUE;
  }
  public void setDEFAULTVALUE(Object DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
  }

  
  /**
   * Unique key of the custom field group
   **/
  @ApiModelProperty(value = "Unique key of the custom field group")
  @JsonProperty("GROUP_ID")
  public Long getGROUPID() {
    return GROUP_ID;
  }
  public void setGROUPID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
  }

  
  /**
   * Whether or not the field is editable
   **/
  @ApiModelProperty(value = "Whether or not the field is editable")
  @JsonProperty("EDITABLE")
  public Boolean getEDITABLE() {
    return EDITABLE;
  }
  public void setEDITABLE(Boolean EDITABLE) {
    this.EDITABLE = EDITABLE;
  }

  
  /**
   * Whether or not the field is visible
   **/
  @ApiModelProperty(value = "Whether or not the field is visible")
  @JsonProperty("VISIBLE")
  public Boolean getVISIBLE() {
    return VISIBLE;
  }
  public void setVISIBLE(Boolean VISIBLE) {
    this.VISIBLE = VISIBLE;
  }

  
  /**
   * A list of option values for a dropdown Custom Field
   **/
  @ApiModelProperty(value = "A list of option values for a dropdown Custom Field")
  @JsonProperty("CUSTOM_FIELD_OPTIONS")
  public List<APICustomFieldOption> getCUSTOMFIELDOPTIONS() {
    return CUSTOM_FIELD_OPTIONS;
  }
  public void setCUSTOMFIELDOPTIONS(List<APICustomFieldOption> CUSTOM_FIELD_OPTIONS) {
    this.CUSTOM_FIELD_OPTIONS = CUSTOM_FIELD_OPTIONS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomFieldMetadata {\n");
    
    sb.append("    CUSTOM_FIELD_ID: ").append(StringUtil.toIndentedString(CUSTOM_FIELD_ID)).append("\n");
    sb.append("    ORDER_ID: ").append(StringUtil.toIndentedString(ORDER_ID)).append("\n");
    sb.append("    FIELD_FOR: ").append(StringUtil.toIndentedString(FIELD_FOR)).append("\n");
    sb.append("    FIELD_NAME: ").append(StringUtil.toIndentedString(FIELD_NAME)).append("\n");
    sb.append("    FIELD_TYPE: ").append(StringUtil.toIndentedString(FIELD_TYPE)).append("\n");
    sb.append("    FIELD_HELP_TEXT: ").append(StringUtil.toIndentedString(FIELD_HELP_TEXT)).append("\n");
    sb.append("    DEFAULT_VALUE: ").append(StringUtil.toIndentedString(DEFAULT_VALUE)).append("\n");
    sb.append("    GROUP_ID: ").append(StringUtil.toIndentedString(GROUP_ID)).append("\n");
    sb.append("    EDITABLE: ").append(StringUtil.toIndentedString(EDITABLE)).append("\n");
    sb.append("    VISIBLE: ").append(StringUtil.toIndentedString(VISIBLE)).append("\n");
    sb.append("    CUSTOM_FIELD_OPTIONS: ").append(StringUtil.toIndentedString(CUSTOM_FIELD_OPTIONS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
