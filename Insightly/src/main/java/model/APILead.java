package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APILead
 **/
@ApiModel(description = "APILead")
public class APILead   {
  
  private Long LEAD_ID = null;
  private String SALUTATION = null;
  private String TITLE = null;
  private String FIRST_NAME = null;
  private String LAST_NAME = null;
  private String ORGANIZATION_NAME = null;
  private String PHONE_NUMBER = null;
  private String MOBILE_PHONE_NUMBER = null;
  private String FAX_NUMBER = null;
  private String EMAIL_ADDRESS = null;
  private String WEBSITE_URL = null;
  private Long OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private Boolean CONVERTED = null;
  private Date CONVERTED_DATE_UTC = null;
  private Long CONVERTED_CONTACT_ID = null;
  private Long CONVERTED_ORGANIZATION_ID = null;
  private Long CONVERTED_OPPORTUNITY_ID = null;
  private String VISIBLE_TO = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private String INDUSTRY = null;
  private Long LEAD_STATUS_ID = null;
  private Long LEAD_SOURCE_ID = null;
  private Long VISIBLE_TEAM_ID = null;
  private Integer EMPLOYEE_COUNT = null;
  private Integer LEAD_RATING = null;
  private String LEAD_DESCRIPTION = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private String ADDRESS_STREET = null;
  private String ADDRESS_CITY = null;
  private String ADDRESS_STATE = null;
  private String ADDRESS_POSTCODE = null;
  private String ADDRESS_COUNTRY = null;
  private List<APITag> TAGS = new ArrayList<APITag>();
  private String IMAGE_URL = null;

  
  /**
   * Unique ID for the Lead record
   **/
  @ApiModelProperty(value = "Unique ID for the Lead record")
  @JsonProperty("LEAD_ID")
  public Long getLEADID() {
    return LEAD_ID;
  }
  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }

  
  /**
   * Salutation
   **/
  @ApiModelProperty(value = "Salutation")
  @JsonProperty("SALUTATION")
  public String getSALUTATION() {
    return SALUTATION;
  }
  public void setSALUTATION(String SALUTATION) {
    this.SALUTATION = SALUTATION;
  }

  
  /**
   * Salutation
   **/
  @ApiModelProperty(value = "Salutation")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * First/Given Name
   **/
  @ApiModelProperty(value = "First/Given Name")
  @JsonProperty("FIRST_NAME")
  public String getFIRSTNAME() {
    return FIRST_NAME;
  }
  public void setFIRSTNAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  
  /**
   * Last/Family/Surname of the Lead
   **/
  @ApiModelProperty(required = true, value = "Last/Family/Surname of the Lead")
  @JsonProperty("LAST_NAME")
  public String getLASTNAME() {
    return LAST_NAME;
  }
  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  
  /**
   * Organisation Name
   **/
  @ApiModelProperty(value = "Organisation Name")
  @JsonProperty("ORGANIZATION_NAME")
  public String getORGANIZATIONNAME() {
    return ORGANIZATION_NAME;
  }
  public void setORGANIZATIONNAME(String ORGANIZATION_NAME) {
    this.ORGANIZATION_NAME = ORGANIZATION_NAME;
  }

  
  /**
   * Phone Number
   **/
  @ApiModelProperty(value = "Phone Number")
  @JsonProperty("PHONE_NUMBER")
  public String getPHONENUMBER() {
    return PHONE_NUMBER;
  }
  public void setPHONENUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
  }

  
  /**
   * Mobile Phone Number
   **/
  @ApiModelProperty(value = "Mobile Phone Number")
  @JsonProperty("MOBILE_PHONE_NUMBER")
  public String getMOBILEPHONENUMBER() {
    return MOBILE_PHONE_NUMBER;
  }
  public void setMOBILEPHONENUMBER(String MOBILE_PHONE_NUMBER) {
    this.MOBILE_PHONE_NUMBER = MOBILE_PHONE_NUMBER;
  }

  
  /**
   * Fax Number
   **/
  @ApiModelProperty(value = "Fax Number")
  @JsonProperty("FAX_NUMBER")
  public String getFAXNUMBER() {
    return FAX_NUMBER;
  }
  public void setFAXNUMBER(String FAX_NUMBER) {
    this.FAX_NUMBER = FAX_NUMBER;
  }

  
  /**
   * Email Address
   **/
  @ApiModelProperty(value = "Email Address")
  @JsonProperty("EMAIL_ADDRESS")
  public String getEMAILADDRESS() {
    return EMAIL_ADDRESS;
  }
  public void setEMAILADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
  }

  
  /**
   * Website URL Address
   **/
  @ApiModelProperty(value = "Website URL Address")
  @JsonProperty("WEBSITE_URL")
  public String getWEBSITEURL() {
    return WEBSITE_URL;
  }
  public void setWEBSITEURL(String WEBSITE_URL) {
    this.WEBSITE_URL = WEBSITE_URL;
  }

  
  /**
   * User ID of the Lead owner
   **/
  @ApiModelProperty(value = "User ID of the Lead owner")
  @JsonProperty("OWNER_USER_ID")
  public Long getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Long OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Lead record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Lead record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Lead record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Lead record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * IsConverted Lead
   **/
  @ApiModelProperty(value = "IsConverted Lead")
  @JsonProperty("CONVERTED")
  public Boolean getCONVERTED() {
    return CONVERTED;
  }
  public void setCONVERTED(Boolean CONVERTED) {
    this.CONVERTED = CONVERTED;
  }

  
  /**
   * Date and time Lead record Converted, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Lead record Converted, as Coordinated Universal Time")
  @JsonProperty("CONVERTED_DATE_UTC")
  public Date getCONVERTEDDATEUTC() {
    return CONVERTED_DATE_UTC;
  }
  public void setCONVERTEDDATEUTC(Date CONVERTED_DATE_UTC) {
    this.CONVERTED_DATE_UTC = CONVERTED_DATE_UTC;
  }

  
  /**
   * The Contact ID resulted from a Lead conversion process to Opportunity
   **/
  @ApiModelProperty(value = "The Contact ID resulted from a Lead conversion process to Opportunity")
  @JsonProperty("CONVERTED_CONTACT_ID")
  public Long getCONVERTEDCONTACTID() {
    return CONVERTED_CONTACT_ID;
  }
  public void setCONVERTEDCONTACTID(Long CONVERTED_CONTACT_ID) {
    this.CONVERTED_CONTACT_ID = CONVERTED_CONTACT_ID;
  }

  
  /**
   * The Opportunity ID resulted from a Lead conversion process
   **/
  @ApiModelProperty(value = "The Opportunity ID resulted from a Lead conversion process")
  @JsonProperty("CONVERTED_ORGANIZATION_ID")
  public Long getCONVERTEDORGANIZATIONID() {
    return CONVERTED_ORGANIZATION_ID;
  }
  public void setCONVERTEDORGANIZATIONID(Long CONVERTED_ORGANIZATION_ID) {
    this.CONVERTED_ORGANIZATION_ID = CONVERTED_ORGANIZATION_ID;
  }

  
  /**
   * The Opportunity ID resulted from a Lead conversion process
   **/
  @ApiModelProperty(value = "The Opportunity ID resulted from a Lead conversion process")
  @JsonProperty("CONVERTED_OPPORTUNITY_ID")
  public Long getCONVERTEDOPPORTUNITYID() {
    return CONVERTED_OPPORTUNITY_ID;
  }
  public void setCONVERTEDOPPORTUNITYID(Long CONVERTED_OPPORTUNITY_ID) {
    this.CONVERTED_OPPORTUNITY_ID = CONVERTED_OPPORTUNITY_ID;
  }

  
  /**
   * Visible To
   **/
  @ApiModelProperty(value = "Visible To")
  @JsonProperty("VISIBLE_TO")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }
  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  
  /**
   * Responsible User's ID.
   **/
  @ApiModelProperty(value = "Responsible User's ID.")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * Visible To
   **/
  @ApiModelProperty(value = "Visible To")
  @JsonProperty("INDUSTRY")
  public String getINDUSTRY() {
    return INDUSTRY;
  }
  public void setINDUSTRY(String INDUSTRY) {
    this.INDUSTRY = INDUSTRY;
  }

  
  /**
   * Lead Statuses which will be having a value pair of (status and status type) i.e. (Contacted, OPEN) or (Converted, CLOSED)
   **/
  @ApiModelProperty(value = "Lead Statuses which will be having a value pair of (status and status type) i.e. (Contacted, OPEN) or (Converted, CLOSED)")
  @JsonProperty("LEAD_STATUS_ID")
  public Long getLEADSTATUSID() {
    return LEAD_STATUS_ID;
  }
  public void setLEADSTATUSID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
  }

  
  /**
   * Lead Source i.e. web, phone etc
   **/
  @ApiModelProperty(value = "Lead Source i.e. web, phone etc")
  @JsonProperty("LEAD_SOURCE_ID")
  public Long getLEADSOURCEID() {
    return LEAD_SOURCE_ID;
  }
  public void setLEADSOURCEID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
  }

  
  /**
   * If VISIBLE_TO is 'Team', then this should be a TEAM_ID
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Team', then this should be a TEAM_ID")
  @JsonProperty("VISIBLE_TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }
  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  
  /**
   * Employee count for the lead's organization
   **/
  @ApiModelProperty(value = "Employee count for the lead's organization")
  @JsonProperty("EMPLOYEE_COUNT")
  public Integer getEMPLOYEECOUNT() {
    return EMPLOYEE_COUNT;
  }
  public void setEMPLOYEECOUNT(Integer EMPLOYEE_COUNT) {
    this.EMPLOYEE_COUNT = EMPLOYEE_COUNT;
  }

  
  /**
   * Lead's Rating
   **/
  @ApiModelProperty(value = "Lead's Rating")
  @JsonProperty("LEAD_RATING")
  public Integer getLEADRATING() {
    return LEAD_RATING;
  }
  public void setLEADRATING(Integer LEAD_RATING) {
    this.LEAD_RATING = LEAD_RATING;
  }

  
  /**
   * Lead's Description
   **/
  @ApiModelProperty(value = "Lead's Description")
  @JsonProperty("LEAD_DESCRIPTION")
  public String getLEADDESCRIPTION() {
    return LEAD_DESCRIPTION;
  }
  public void setLEADDESCRIPTION(String LEAD_DESCRIPTION) {
    this.LEAD_DESCRIPTION = LEAD_DESCRIPTION;
  }

  
  /**
   * If VISIBLE_TO is 'Individuals, this should be a comma separated list of user IDs
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Individuals, this should be a comma separated list of user IDs")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of custom fields attached to the Lead
   **/
  @ApiModelProperty(value = "Set of custom fields attached to the Lead")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of addresses attached to the Lead
   **/
  @ApiModelProperty(value = "Set of addresses attached to the Lead")
  @JsonProperty("ADDRESS_STREET")
  public String getADDRESSSTREET() {
    return ADDRESS_STREET;
  }
  public void setADDRESSSTREET(String ADDRESS_STREET) {
    this.ADDRESS_STREET = ADDRESS_STREET;
  }

  
  /**
   * Address street attached to the Lead
   **/
  @ApiModelProperty(value = "Address street attached to the Lead")
  @JsonProperty("ADDRESS_CITY")
  public String getADDRESSCITY() {
    return ADDRESS_CITY;
  }
  public void setADDRESSCITY(String ADDRESS_CITY) {
    this.ADDRESS_CITY = ADDRESS_CITY;
  }

  
  /**
   * Address state attached to the Lead
   **/
  @ApiModelProperty(value = "Address state attached to the Lead")
  @JsonProperty("ADDRESS_STATE")
  public String getADDRESSSTATE() {
    return ADDRESS_STATE;
  }
  public void setADDRESSSTATE(String ADDRESS_STATE) {
    this.ADDRESS_STATE = ADDRESS_STATE;
  }

  
  /**
   * Address postal code attached to the Lead
   **/
  @ApiModelProperty(value = "Address postal code attached to the Lead")
  @JsonProperty("ADDRESS_POSTCODE")
  public String getADDRESSPOSTCODE() {
    return ADDRESS_POSTCODE;
  }
  public void setADDRESSPOSTCODE(String ADDRESS_POSTCODE) {
    this.ADDRESS_POSTCODE = ADDRESS_POSTCODE;
  }

  
  /**
   * Address country attached to the Lead
   **/
  @ApiModelProperty(value = "Address country attached to the Lead")
  @JsonProperty("ADDRESS_COUNTRY")
  public String getADDRESSCOUNTRY() {
    return ADDRESS_COUNTRY;
  }
  public void setADDRESSCOUNTRY(String ADDRESS_COUNTRY) {
    this.ADDRESS_COUNTRY = ADDRESS_COUNTRY;
  }

  
  /**
   * Set of tags attached to the Lead
   **/
  @ApiModelProperty(value = "Set of tags attached to the Lead")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * URL of the Image for the Lead
   **/
  @ApiModelProperty(value = "URL of the Image for the Lead")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILead {\n");
    
    sb.append("    LEAD_ID: ").append(StringUtil.toIndentedString(LEAD_ID)).append("\n");
    sb.append("    SALUTATION: ").append(StringUtil.toIndentedString(SALUTATION)).append("\n");
    sb.append("    TITLE: ").append(StringUtil.toIndentedString(TITLE)).append("\n");
    sb.append("    FIRST_NAME: ").append(StringUtil.toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    LAST_NAME: ").append(StringUtil.toIndentedString(LAST_NAME)).append("\n");
    sb.append("    ORGANIZATION_NAME: ").append(StringUtil.toIndentedString(ORGANIZATION_NAME)).append("\n");
    sb.append("    PHONE_NUMBER: ").append(StringUtil.toIndentedString(PHONE_NUMBER)).append("\n");
    sb.append("    MOBILE_PHONE_NUMBER: ").append(StringUtil.toIndentedString(MOBILE_PHONE_NUMBER)).append("\n");
    sb.append("    FAX_NUMBER: ").append(StringUtil.toIndentedString(FAX_NUMBER)).append("\n");
    sb.append("    EMAIL_ADDRESS: ").append(StringUtil.toIndentedString(EMAIL_ADDRESS)).append("\n");
    sb.append("    WEBSITE_URL: ").append(StringUtil.toIndentedString(WEBSITE_URL)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CONVERTED: ").append(StringUtil.toIndentedString(CONVERTED)).append("\n");
    sb.append("    CONVERTED_DATE_UTC: ").append(StringUtil.toIndentedString(CONVERTED_DATE_UTC)).append("\n");
    sb.append("    CONVERTED_CONTACT_ID: ").append(StringUtil.toIndentedString(CONVERTED_CONTACT_ID)).append("\n");
    sb.append("    CONVERTED_ORGANIZATION_ID: ").append(StringUtil.toIndentedString(CONVERTED_ORGANIZATION_ID)).append("\n");
    sb.append("    CONVERTED_OPPORTUNITY_ID: ").append(StringUtil.toIndentedString(CONVERTED_OPPORTUNITY_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(StringUtil.toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(StringUtil.toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    INDUSTRY: ").append(StringUtil.toIndentedString(INDUSTRY)).append("\n");
    sb.append("    LEAD_STATUS_ID: ").append(StringUtil.toIndentedString(LEAD_STATUS_ID)).append("\n");
    sb.append("    LEAD_SOURCE_ID: ").append(StringUtil.toIndentedString(LEAD_SOURCE_ID)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(StringUtil.toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    EMPLOYEE_COUNT: ").append(StringUtil.toIndentedString(EMPLOYEE_COUNT)).append("\n");
    sb.append("    LEAD_RATING: ").append(StringUtil.toIndentedString(LEAD_RATING)).append("\n");
    sb.append("    LEAD_DESCRIPTION: ").append(StringUtil.toIndentedString(LEAD_DESCRIPTION)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(StringUtil.toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(StringUtil.toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    ADDRESS_STREET: ").append(StringUtil.toIndentedString(ADDRESS_STREET)).append("\n");
    sb.append("    ADDRESS_CITY: ").append(StringUtil.toIndentedString(ADDRESS_CITY)).append("\n");
    sb.append("    ADDRESS_STATE: ").append(StringUtil.toIndentedString(ADDRESS_STATE)).append("\n");
    sb.append("    ADDRESS_POSTCODE: ").append(StringUtil.toIndentedString(ADDRESS_POSTCODE)).append("\n");
    sb.append("    ADDRESS_COUNTRY: ").append(StringUtil.toIndentedString(ADDRESS_COUNTRY)).append("\n");
    sb.append("    TAGS: ").append(StringUtil.toIndentedString(TAGS)).append("\n");
    sb.append("    IMAGE_URL: ").append(StringUtil.toIndentedString(IMAGE_URL)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
