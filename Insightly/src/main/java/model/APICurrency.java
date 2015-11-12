package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APICurrency
 **/
@ApiModel(description = "APICurrency")
public class APICurrency   {
  
  private String CURRENCY_CODE = null;
  private String CURRENCY_SYMBOL = null;

  
  /**
   * Currency Code
   **/
  @ApiModelProperty(value = "Currency Code")
  @JsonProperty("CURRENCY_CODE")
  public String getCURRENCYCODE() {
    return CURRENCY_CODE;
  }
  public void setCURRENCYCODE(String CURRENCY_CODE) {
    this.CURRENCY_CODE = CURRENCY_CODE;
  }

  
  /**
   * Currency Symbol
   **/
  @ApiModelProperty(value = "Currency Symbol")
  @JsonProperty("CURRENCY_SYMBOL")
  public String getCURRENCYSYMBOL() {
    return CURRENCY_SYMBOL;
  }
  public void setCURRENCYSYMBOL(String CURRENCY_SYMBOL) {
    this.CURRENCY_SYMBOL = CURRENCY_SYMBOL;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICurrency {\n");
    
    sb.append("    CURRENCY_CODE: ").append(StringUtil.toIndentedString(CURRENCY_CODE)).append("\n");
    sb.append("    CURRENCY_SYMBOL: ").append(StringUtil.toIndentedString(CURRENCY_SYMBOL)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
