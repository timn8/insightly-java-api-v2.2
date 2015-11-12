package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIOpportunity
 **/
@ApiModel(description = "APIOpportunity")
public class APIOpportunity   {
  
  private Long OPPORTUNITY_ID = null;
  private String OPPORTUNITY_NAME = null;
  private String OPPORTUNITY_DETAILS = null;
  private Integer PROBABILITY = null;
  private String BID_CURRENCY = null;
  private Long BID_AMOUNT = null;
  private String BID_TYPE = null;
  private Integer BID_DURATION = null;
  private Long OPPORTUNITY_VALUE = null;
  private Date FORECAST_CLOSE_DATE = null;
  private Date ACTUAL_CLOSE_DATE = null;
  private Long CATEGORY_ID = null;
  private Long PIPELINE_ID = null;
  private Long STAGE_ID = null;
  private String OPPORTUNITY_STATE = null;
  private Long OPPORTUNITY_STATE_REASON_ID = null;
  private String IMAGE_URL = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private List<APITag> TAGS = new ArrayList<APITag>();
  private List<APILink> LINKS = new ArrayList<APILink>();

  
  /**
   * Unique ID for the Opportunity record
   **/
  @ApiModelProperty(value = "Unique ID for the Opportunity record")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Name of the Opportunity
   **/
  @ApiModelProperty(value = "Name of the Opportunity")
  @JsonProperty("OPPORTUNITY_NAME")
  public String getOPPORTUNITYNAME() {
    return OPPORTUNITY_NAME;
  }
  public void setOPPORTUNITYNAME(String OPPORTUNITY_NAME) {
    this.OPPORTUNITY_NAME = OPPORTUNITY_NAME;
  }

  
  /**
   * Opportunity details
   **/
  @ApiModelProperty(value = "Opportunity details")
  @JsonProperty("OPPORTUNITY_DETAILS")
  public String getOPPORTUNITYDETAILS() {
    return OPPORTUNITY_DETAILS;
  }
  public void setOPPORTUNITYDETAILS(String OPPORTUNITY_DETAILS) {
    this.OPPORTUNITY_DETAILS = OPPORTUNITY_DETAILS;
  }

  
  /**
   * Percentage probability of winning the Opportunity, as an integer value from 0 to 100
   **/
  @ApiModelProperty(value = "Percentage probability of winning the Opportunity, as an integer value from 0 to 100")
  @JsonProperty("PROBABILITY")
  public Integer getPROBABILITY() {
    return PROBABILITY;
  }
  public void setPROBABILITY(Integer PROBABILITY) {
    this.PROBABILITY = PROBABILITY;
  }

  
  /**
   * Three character code for a currency
   **/
  @ApiModelProperty(value = "Three character code for a currency")
  @JsonProperty("BID_CURRENCY")
  public String getBIDCURRENCY() {
    return BID_CURRENCY;
  }
  public void setBIDCURRENCY(String BID_CURRENCY) {
    this.BID_CURRENCY = BID_CURRENCY;
  }

  
  /**
   * Potential value of the Opportunity, as an integer value
   **/
  @ApiModelProperty(value = "Potential value of the Opportunity, as an integer value")
  @JsonProperty("BID_AMOUNT")
  public Long getBIDAMOUNT() {
    return BID_AMOUNT;
  }
  public void setBIDAMOUNT(Long BID_AMOUNT) {
    this.BID_AMOUNT = BID_AMOUNT;
  }

  
  /**
   * Type of bid for the Opportunity: Fixed Bid, Per Hour, Per Day, Per Week, Per Month or Per Year
   **/
  @ApiModelProperty(value = "Type of bid for the Opportunity: Fixed Bid, Per Hour, Per Day, Per Week, Per Month or Per Year")
  @JsonProperty("BID_TYPE")
  public String getBIDTYPE() {
    return BID_TYPE;
  }
  public void setBIDTYPE(String BID_TYPE) {
    this.BID_TYPE = BID_TYPE;
  }

  
  /**
   * Duration of the bid of the Opportunity, if per hour/day/etc as an integer value
   **/
  @ApiModelProperty(value = "Duration of the bid of the Opportunity, if per hour/day/etc as an integer value")
  @JsonProperty("BID_DURATION")
  public Integer getBIDDURATION() {
    return BID_DURATION;
  }
  public void setBIDDURATION(Integer BID_DURATION) {
    this.BID_DURATION = BID_DURATION;
  }

  
  /**
   * Total value of the Opportunity, calculated based on BID_AMOUNT, BID_TYPE and BID_DURATION. This is a read-only field.
   **/
  @ApiModelProperty(value = "Total value of the Opportunity, calculated based on BID_AMOUNT, BID_TYPE and BID_DURATION. This is a read-only field.")
  @JsonProperty("OPPORTUNITY_VALUE")
  public Long getOPPORTUNITYVALUE() {
    return OPPORTUNITY_VALUE;
  }
  public void setOPPORTUNITYVALUE(Long OPPORTUNITY_VALUE) {
    this.OPPORTUNITY_VALUE = OPPORTUNITY_VALUE;
  }

  
  /**
   * Forecast close date of the Opportunity, in YYYY-MM-DD format
   **/
  @ApiModelProperty(value = "Forecast close date of the Opportunity, in YYYY-MM-DD format")
  @JsonProperty("FORECAST_CLOSE_DATE")
  public Date getFORECASTCLOSEDATE() {
    return FORECAST_CLOSE_DATE;
  }
  public void setFORECASTCLOSEDATE(Date FORECAST_CLOSE_DATE) {
    this.FORECAST_CLOSE_DATE = FORECAST_CLOSE_DATE;
  }

  
  /**
   * Actual close date of the Opportunity, in YYYY-MM-DD format
   **/
  @ApiModelProperty(value = "Actual close date of the Opportunity, in YYYY-MM-DD format")
  @JsonProperty("ACTUAL_CLOSE_DATE")
  public Date getACTUALCLOSEDATE() {
    return ACTUAL_CLOSE_DATE;
  }
  public void setACTUALCLOSEDATE(Date ACTUAL_CLOSE_DATE) {
    this.ACTUAL_CLOSE_DATE = ACTUAL_CLOSE_DATE;
  }

  
  /**
   * The Category ID of the Opportunity, if it has been assigned to one
   **/
  @ApiModelProperty(value = "The Category ID of the Opportunity, if it has been assigned to one")
  @JsonProperty("CATEGORY_ID")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }
  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  
  /**
   * The Pipeline ID that the Opportunity is in, if it has been assigned to one
   **/
  @ApiModelProperty(value = "The Pipeline ID that the Opportunity is in, if it has been assigned to one")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * The Stage ID of the Stage that the Opportunity is in, if it has been assigned to one
   **/
  @ApiModelProperty(value = "The Stage ID of the Stage that the Opportunity is in, if it has been assigned to one")
  @JsonProperty("STAGE_ID")
  public Long getSTAGEID() {
    return STAGE_ID;
  }
  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  
  /**
   * Opportunity State (required): Open, Abandoned, Lost, Suspended, Won
   **/
  @ApiModelProperty(required = true, value = "Opportunity State (required): Open, Abandoned, Lost, Suspended, Won")
  @JsonProperty("OPPORTUNITY_STATE")
  public String getOPPORTUNITYSTATE() {
    return OPPORTUNITY_STATE;
  }
  public void setOPPORTUNITYSTATE(String OPPORTUNITY_STATE) {
    this.OPPORTUNITY_STATE = OPPORTUNITY_STATE;
  }

  
  /**
   * Opportunity State Reason ID. Optional, if specified this field must have a valid State Reason ID.
   **/
  @ApiModelProperty(value = "Opportunity State Reason ID. Optional, if specified this field must have a valid State Reason ID.")
  @JsonProperty("OPPORTUNITY_STATE_REASON_ID")
  public Long getOPPORTUNITYSTATEREASONID() {
    return OPPORTUNITY_STATE_REASON_ID;
  }
  public void setOPPORTUNITYSTATEREASONID(Long OPPORTUNITY_STATE_REASON_ID) {
    this.OPPORTUNITY_STATE_REASON_ID = OPPORTUNITY_STATE_REASON_ID;
  }

  
  /**
   * URL of the Image for the Opportunity
   **/
  @ApiModelProperty(value = "URL of the Image for the Opportunity")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  
  /**
   * ID of the responsible user for the Opportunity
   **/
  @ApiModelProperty(value = "ID of the responsible user for the Opportunity")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * User ID of the record owner
   **/
  @ApiModelProperty(value = "User ID of the record owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Opportunity record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Opportunity record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Opportunity record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Opportunity record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Visible To: Everyone, Owner, Team or Individuals
   **/
  @ApiModelProperty(value = "Visible To: Everyone, Owner, Team or Individuals")
  @JsonProperty("VISIBLE_TO")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }
  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  
  /**
   * If VISIBLE_TO is 'Team', the TEAM_ID
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Team', the TEAM_ID")
  @JsonProperty("VISIBLE_TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }
  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  
  /**
   * If VISIBLE_TO is 'Individuals', a comma separated list of User IDs
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Individuals', a comma separated list of User IDs")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of Custom Fields attached to the Opportunity
   **/
  @ApiModelProperty(value = "Set of Custom Fields attached to the Opportunity")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of Tags attached to the Opportunity
   **/
  @ApiModelProperty(value = "Set of Tags attached to the Opportunity")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * Set of Links attached to the Opportunity
   **/
  @ApiModelProperty(value = "Set of Links attached to the Opportunity")
  @JsonProperty("LINKS")
  public List<APILink> getLINKS() {
    return LINKS;
  }
  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOpportunity {\n");
    
    sb.append("    OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    OPPORTUNITY_NAME: ").append(StringUtil.toIndentedString(OPPORTUNITY_NAME)).append("\n");
    sb.append("    OPPORTUNITY_DETAILS: ").append(StringUtil.toIndentedString(OPPORTUNITY_DETAILS)).append("\n");
    sb.append("    PROBABILITY: ").append(StringUtil.toIndentedString(PROBABILITY)).append("\n");
    sb.append("    BID_CURRENCY: ").append(StringUtil.toIndentedString(BID_CURRENCY)).append("\n");
    sb.append("    BID_AMOUNT: ").append(StringUtil.toIndentedString(BID_AMOUNT)).append("\n");
    sb.append("    BID_TYPE: ").append(StringUtil.toIndentedString(BID_TYPE)).append("\n");
    sb.append("    BID_DURATION: ").append(StringUtil.toIndentedString(BID_DURATION)).append("\n");
    sb.append("    OPPORTUNITY_VALUE: ").append(StringUtil.toIndentedString(OPPORTUNITY_VALUE)).append("\n");
    sb.append("    FORECAST_CLOSE_DATE: ").append(StringUtil.toIndentedString(FORECAST_CLOSE_DATE)).append("\n");
    sb.append("    ACTUAL_CLOSE_DATE: ").append(StringUtil.toIndentedString(ACTUAL_CLOSE_DATE)).append("\n");
    sb.append("    CATEGORY_ID: ").append(StringUtil.toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(StringUtil.toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(StringUtil.toIndentedString(STAGE_ID)).append("\n");
    sb.append("    OPPORTUNITY_STATE: ").append(StringUtil.toIndentedString(OPPORTUNITY_STATE)).append("\n");
    sb.append("    OPPORTUNITY_STATE_REASON_ID: ").append(StringUtil.toIndentedString(OPPORTUNITY_STATE_REASON_ID)).append("\n");
    sb.append("    IMAGE_URL: ").append(StringUtil.toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(StringUtil.toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(StringUtil.toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(StringUtil.toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(StringUtil.toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(StringUtil.toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    TAGS: ").append(StringUtil.toIndentedString(TAGS)).append("\n");
    sb.append("    LINKS: ").append(StringUtil.toIndentedString(LINKS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
