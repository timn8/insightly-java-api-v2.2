package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIAddress
 **/
@ApiModel(description = "APIAddress")
public class APIAddress   {
  
  private Long ADDRESS_ID = null;
  private String ADDRESS_TYPE = null;
  private String STREET = null;
  private String CITY = null;
  private String STATE = null;
  private String POSTCODE = null;
  private String COUNTRY = null;

  
  /**
   * Unique key of the address record
   **/
  @ApiModelProperty(value = "Unique key of the address record")
  @JsonProperty("ADDRESS_ID")
  public Long getADDRESSID() {
    return ADDRESS_ID;
  }
  public void setADDRESSID(Long ADDRESS_ID) {
    this.ADDRESS_ID = ADDRESS_ID;
  }

  
  /**
   * Address Type
   **/
  @ApiModelProperty(required = true, value = "Address Type")
  @JsonProperty("ADDRESS_TYPE")
  public String getADDRESSTYPE() {
    return ADDRESS_TYPE;
  }
  public void setADDRESSTYPE(String ADDRESS_TYPE) {
    this.ADDRESS_TYPE = ADDRESS_TYPE;
  }

  
  /**
   * Street number and name of address
   **/
  @ApiModelProperty(value = "Street number and name of address")
  @JsonProperty("STREET")
  public String getSTREET() {
    return STREET;
  }
  public void setSTREET(String STREET) {
    this.STREET = STREET;
  }

  
  /**
   * City
   **/
  @ApiModelProperty(value = "City")
  @JsonProperty("CITY")
  public String getCITY() {
    return CITY;
  }
  public void setCITY(String CITY) {
    this.CITY = CITY;
  }

  
  /**
   * State/Province
   **/
  @ApiModelProperty(value = "State/Province")
  @JsonProperty("STATE")
  public String getSTATE() {
    return STATE;
  }
  public void setSTATE(String STATE) {
    this.STATE = STATE;
  }

  
  /**
   * Zip or postal code
   **/
  @ApiModelProperty(value = "Zip or postal code")
  @JsonProperty("POSTCODE")
  public String getPOSTCODE() {
    return POSTCODE;
  }
  public void setPOSTCODE(String POSTCODE) {
    this.POSTCODE = POSTCODE;
  }

  
  /**
   * Country, see Countries resource for options
   **/
  @ApiModelProperty(value = "Country, see Countries resource for options")
  @JsonProperty("COUNTRY")
  public String getCOUNTRY() {
    return COUNTRY;
  }
  public void setCOUNTRY(String COUNTRY) {
    this.COUNTRY = COUNTRY;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIAddress {\n");
    
    sb.append("    ADDRESS_ID: ").append(StringUtil.toIndentedString(ADDRESS_ID)).append("\n");
    sb.append("    ADDRESS_TYPE: ").append(StringUtil.toIndentedString(ADDRESS_TYPE)).append("\n");
    sb.append("    STREET: ").append(StringUtil.toIndentedString(STREET)).append("\n");
    sb.append("    CITY: ").append(StringUtil.toIndentedString(CITY)).append("\n");
    sb.append("    STATE: ").append(StringUtil.toIndentedString(STATE)).append("\n");
    sb.append("    POSTCODE: ").append(StringUtil.toIndentedString(POSTCODE)).append("\n");
    sb.append("    COUNTRY: ").append(StringUtil.toIndentedString(COUNTRY)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
