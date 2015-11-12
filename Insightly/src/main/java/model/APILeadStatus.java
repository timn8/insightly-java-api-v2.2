package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICategory
 **/
@ApiModel(description = "APICategory")
public class APILeadStatus   {
  
  private Long LEAD_STATUS_ID = null;
  private String LEAD_STATUS = null;
  private Boolean DEFAULT_STATUS = null;
  private Integer STATUS_TYPE = null;
  private Integer FIELD_ORDER = null;

  
  /**
   * Unique ID for the current Lead Status
   **/
  @ApiModelProperty(value = "Unique ID for the current Lead Status")
  @JsonProperty("LEAD_STATUS_ID")
  public Long getLEADSTATUSID() {
    return LEAD_STATUS_ID;
  }
  public void setLEADSTATUSID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
  }

  
  /**
   * Lead Status value
   **/
  @ApiModelProperty(required = true, value = "Lead Status value")
  @JsonProperty("LEAD_STATUS")
  public String getLEADSTATUS() {
    return LEAD_STATUS;
  }
  public void setLEADSTATUS(String LEAD_STATUS) {
    this.LEAD_STATUS = LEAD_STATUS;
  }

  
  /**
   * checks or sets the current Lead source for being the default value
   **/
  @ApiModelProperty(value = "checks or sets the current Lead source for being the default value")
  @JsonProperty("DEFAULT_STATUS")
  public Boolean getDEFAULTSTATUS() {
    return DEFAULT_STATUS;
  }
  public void setDEFAULTSTATUS(Boolean DEFAULT_STATUS) {
    this.DEFAULT_STATUS = DEFAULT_STATUS;
  }

  
  /**
   * Status type indicating Lead Status (either open or close)
   **/
  @ApiModelProperty(value = "Status type indicating Lead Status (either open or close)")
  @JsonProperty("STATUS_TYPE")
  public Integer getSTATUSTYPE() {
    return STATUS_TYPE;
  }
  public void setSTATUSTYPE(Integer STATUS_TYPE) {
    this.STATUS_TYPE = STATUS_TYPE;
  }

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILeadStatus {\n");
    
    sb.append("    LEAD_STATUS_ID: ").append(StringUtil.toIndentedString(LEAD_STATUS_ID)).append("\n");
    sb.append("    LEAD_STATUS: ").append(StringUtil.toIndentedString(LEAD_STATUS)).append("\n");
    sb.append("    DEFAULT_STATUS: ").append(StringUtil.toIndentedString(DEFAULT_STATUS)).append("\n");
    sb.append("    STATUS_TYPE: ").append(StringUtil.toIndentedString(STATUS_TYPE)).append("\n");
    sb.append("    FIELD_ORDER: ").append(StringUtil.toIndentedString(FIELD_ORDER)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
