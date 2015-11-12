package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * Information about a followed record.
 **/
@ApiModel(description = "Information about a followed record.")
public class APIUserFollow   {
  
  private String RECORD_TYPE = null;
  private Long RECORD_ID = null;

  
  /**
   * Type of the followed record. One of the following: EMAIL, NOTE, TASK, CONTACT, ORGANISATION, PROJECT, OPPORTUNITY, LEAD.
   **/
  @ApiModelProperty(value = "Type of the followed record. One of the following: EMAIL, NOTE, TASK, CONTACT, ORGANISATION, PROJECT, OPPORTUNITY, LEAD.")
  @JsonProperty("RECORD_TYPE")
  public String getRECORDTYPE() {
    return RECORD_TYPE;
  }
  public void setRECORDTYPE(String RECORD_TYPE) {
    this.RECORD_TYPE = RECORD_TYPE;
  }

  
  /**
   * ID of the followed record.
   **/
  @ApiModelProperty(value = "ID of the followed record.")
  @JsonProperty("RECORD_ID")
  public Long getRECORDID() {
    return RECORD_ID;
  }
  public void setRECORDID(Long RECORD_ID) {
    this.RECORD_ID = RECORD_ID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIUserFollow {\n");
    
    sb.append("    RECORD_TYPE: ").append(StringUtil.toIndentedString(RECORD_TYPE)).append("\n");
    sb.append("    RECORD_ID: ").append(StringUtil.toIndentedString(RECORD_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
