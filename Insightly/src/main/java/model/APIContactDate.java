package model;

import insightly.StringUtil;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIContactDate
 **/
@ApiModel(description = "APIContactDate")
public class APIContactDate   {
  
  private Long DATE_ID = null;
  private String OCCASION_NAME = null;
  private Date OCCASION_DATE = null;
  private Boolean REPEAT_YEARLY = null;
  private Boolean CREATE_TASK_YEARLY = null;

  
  /**
   * Unique ID for the contact date record
   **/
  @ApiModelProperty(value = "Unique ID for the contact date record")
  @JsonProperty("DATE_ID")
  public Long getDATEID() {
    return DATE_ID;
  }
  public void setDATEID(Long DATE_ID) {
    this.DATE_ID = DATE_ID;
  }

  
  /**
   * Occasion name of the Contact Date (e.g. Birthday, Hire Date, etc)
   **/
  @ApiModelProperty(value = "Occasion name of the Contact Date (e.g. Birthday, Hire Date, etc)")
  @JsonProperty("OCCASION_NAME")
  public String getOCCASIONNAME() {
    return OCCASION_NAME;
  }
  public void setOCCASIONNAME(String OCCASION_NAME) {
    this.OCCASION_NAME = OCCASION_NAME;
  }

  
  /**
   * Occasion Date of the Contact Date, in YYYY-MM-DD HH:MM:SS format
   **/
  @ApiModelProperty(value = "Occasion Date of the Contact Date, in YYYY-MM-DD HH:MM:SS format")
  @JsonProperty("OCCASION_DATE")
  public Date getOCCASIONDATE() {
    return OCCASION_DATE;
  }
  public void setOCCASIONDATE(Date OCCASION_DATE) {
    this.OCCASION_DATE = OCCASION_DATE;
  }

  
  /**
   * True, if Occasion occurs each year
   **/
  @ApiModelProperty(value = "True, if Occasion occurs each year")
  @JsonProperty("REPEAT_YEARLY")
  public Boolean getREPEATYEARLY() {
    return REPEAT_YEARLY;
  }
  public void setREPEATYEARLY(Boolean REPEAT_YEARLY) {
    this.REPEAT_YEARLY = REPEAT_YEARLY;
  }

  
  /**
   * True to create a reminder each year
   **/
  @ApiModelProperty(value = "True to create a reminder each year")
  @JsonProperty("CREATE_TASK_YEARLY")
  public Boolean getCREATETASKYEARLY() {
    return CREATE_TASK_YEARLY;
  }
  public void setCREATETASKYEARLY(Boolean CREATE_TASK_YEARLY) {
    this.CREATE_TASK_YEARLY = CREATE_TASK_YEARLY;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContactDate {\n");
    
    sb.append("    DATE_ID: ").append(StringUtil.toIndentedString(DATE_ID)).append("\n");
    sb.append("    OCCASION_NAME: ").append(StringUtil.toIndentedString(OCCASION_NAME)).append("\n");
    sb.append("    OCCASION_DATE: ").append(StringUtil.toIndentedString(OCCASION_DATE)).append("\n");
    sb.append("    REPEAT_YEARLY: ").append(StringUtil.toIndentedString(REPEAT_YEARLY)).append("\n");
    sb.append("    CREATE_TASK_YEARLY: ").append(StringUtil.toIndentedString(CREATE_TASK_YEARLY)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
