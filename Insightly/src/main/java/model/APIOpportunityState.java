package model;

import insightly.StringUtil;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIOpportunityState
 **/
@ApiModel(description = "APIOpportunityState")
public class APIOpportunityState   {
  
  private Long OPPORTUNITY_ID = null;
  private Date DATE_CHANGED_UTC = null;
  private String FOR_OPPORTUNITY_STATE = null;
  private Long STATE_REASON_ID = null;
  private String STATE_REASON = null;

  
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
   * Date and time the Opportunity State was changed, in Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time the Opportunity State was changed, in Coordinated Universal Time")
  @JsonProperty("DATE_CHANGED_UTC")
  public Date getDATECHANGEDUTC() {
    return DATE_CHANGED_UTC;
  }
  public void setDATECHANGEDUTC(Date DATE_CHANGED_UTC) {
    this.DATE_CHANGED_UTC = DATE_CHANGED_UTC;
  }

  
  /**
   * The state of the Opportunity: Abandoned, Lost, Open, Suspended, or Won
   **/
  @ApiModelProperty(value = "The state of the Opportunity: Abandoned, Lost, Open, Suspended, or Won")
  @JsonProperty("FOR_OPPORTUNITY_STATE")
  public String getFOROPPORTUNITYSTATE() {
    return FOR_OPPORTUNITY_STATE;
  }
  public void setFOROPPORTUNITYSTATE(String FOR_OPPORTUNITY_STATE) {
    this.FOR_OPPORTUNITY_STATE = FOR_OPPORTUNITY_STATE;
  }

  
  /**
   * The unique key of the Reason that the State was changed
   **/
  @ApiModelProperty(value = "The unique key of the Reason that the State was changed")
  @JsonProperty("STATE_REASON_ID")
  public Long getSTATEREASONID() {
    return STATE_REASON_ID;
  }
  public void setSTATEREASONID(Long STATE_REASON_ID) {
    this.STATE_REASON_ID = STATE_REASON_ID;
  }

  
  /**
   * Opportunity state change Reason corresponding to the STATE_REASON_ID
   **/
  @ApiModelProperty(value = "Opportunity state change Reason corresponding to the STATE_REASON_ID")
  @JsonProperty("STATE_REASON")
  public String getSTATEREASON() {
    return STATE_REASON;
  }
  public void setSTATEREASON(String STATE_REASON) {
    this.STATE_REASON = STATE_REASON;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOpportunityState {\n");
    
    sb.append("    OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    DATE_CHANGED_UTC: ").append(StringUtil.toIndentedString(DATE_CHANGED_UTC)).append("\n");
    sb.append("    FOR_OPPORTUNITY_STATE: ").append(StringUtil.toIndentedString(FOR_OPPORTUNITY_STATE)).append("\n");
    sb.append("    STATE_REASON_ID: ").append(StringUtil.toIndentedString(STATE_REASON_ID)).append("\n");
    sb.append("    STATE_REASON: ").append(StringUtil.toIndentedString(STATE_REASON)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
