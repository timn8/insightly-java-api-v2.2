package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIOrganisation
 **/
@ApiModel(description = "APIOrganisation")
public class APIOrganisation   {
  
  private Long ORGANISATION_ID = null;
  private String ORGANISATION_NAME = null;
  private String BACKGROUND = null;
  private String IMAGE_URL = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private List<APIAddress> ADDRESSES = new ArrayList<APIAddress>();
  private List<APIContactInfo> CONTACTINFOS = new ArrayList<APIContactInfo>();
  private List<APIOrganisationDate> DATES = new ArrayList<APIOrganisationDate>();
  private List<APITag> TAGS = new ArrayList<APITag>();
  private List<APILink> LINKS = new ArrayList<APILink>();
  private List<APIOrganisationLink> ORGANISATIONLINKS = new ArrayList<APIOrganisationLink>();

  
  /**
   * Unique ID for the Organisation record
   **/
  @ApiModelProperty(value = "Unique ID for the Organisation record")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Name of the Organisation (required)
   **/
  @ApiModelProperty(required = true, value = "Name of the Organisation (required)")
  @JsonProperty("ORGANISATION_NAME")
  public String getORGANISATIONNAME() {
    return ORGANISATION_NAME;
  }
  public void setORGANISATIONNAME(String ORGANISATION_NAME) {
    this.ORGANISATION_NAME = ORGANISATION_NAME;
  }

  
  /**
   * Additional background information
   **/
  @ApiModelProperty(value = "Additional background information")
  @JsonProperty("BACKGROUND")
  public String getBACKGROUND() {
    return BACKGROUND;
  }
  public void setBACKGROUND(String BACKGROUND) {
    this.BACKGROUND = BACKGROUND;
  }

  
  /**
   * URL of the Image for the Organisation
   **/
  @ApiModelProperty(value = "URL of the Image for the Organisation")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  
  /**
   * User ID of the Organisation record owner
   **/
  @ApiModelProperty(value = "User ID of the Organisation record owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Organisation record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Organisation record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Organisation record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Organisation record updated, as Coordinated Universal Time")
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
   * Set of Custom Fields atttached to the Organisation
   **/
  @ApiModelProperty(value = "Set of Custom Fields atttached to the Organisation")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of Addresses attached to the Organisation
   **/
  @ApiModelProperty(value = "Set of Addresses attached to the Organisation")
  @JsonProperty("ADDRESSES")
  public List<APIAddress> getADDRESSES() {
    return ADDRESSES;
  }
  public void setADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
  }

  
  /**
   * Set of Contact Infos attached to the Organisation
   **/
  @ApiModelProperty(value = "Set of Contact Infos attached to the Organisation")
  @JsonProperty("CONTACTINFOS")
  public List<APIContactInfo> getCONTACTINFOS() {
    return CONTACTINFOS;
  }
  public void setCONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
  }

  
  /**
   * Set of Dates to Remember attached to the Organisation
   **/
  @ApiModelProperty(value = "Set of Dates to Remember attached to the Organisation")
  @JsonProperty("DATES")
  public List<APIOrganisationDate> getDATES() {
    return DATES;
  }
  public void setDATES(List<APIOrganisationDate> DATES) {
    this.DATES = DATES;
  }

  
  /**
   * Set of Tags attached to the Organisation
   **/
  @ApiModelProperty(value = "Set of Tags attached to the Organisation")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * Set of Links attached to the Organisation
   **/
  @ApiModelProperty(value = "Set of Links attached to the Organisation")
  @JsonProperty("LINKS")
  public List<APILink> getLINKS() {
    return LINKS;
  }
  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  
  /**
   * Set of Links to other Organisations attached to the Organisation
   **/
  @ApiModelProperty(value = "Set of Links to other Organisations attached to the Organisation")
  @JsonProperty("ORGANISATIONLINKS")
  public List<APIOrganisationLink> getORGANISATIONLINKS() {
    return ORGANISATIONLINKS;
  }
  public void setORGANISATIONLINKS(List<APIOrganisationLink> ORGANISATIONLINKS) {
    this.ORGANISATIONLINKS = ORGANISATIONLINKS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOrganisation {\n");
    
    sb.append("    ORGANISATION_ID: ").append(StringUtil.toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    ORGANISATION_NAME: ").append(StringUtil.toIndentedString(ORGANISATION_NAME)).append("\n");
    sb.append("    BACKGROUND: ").append(StringUtil.toIndentedString(BACKGROUND)).append("\n");
    sb.append("    IMAGE_URL: ").append(StringUtil.toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(StringUtil.toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(StringUtil.toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(StringUtil.toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(StringUtil.toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    ADDRESSES: ").append(StringUtil.toIndentedString(ADDRESSES)).append("\n");
    sb.append("    CONTACTINFOS: ").append(StringUtil.toIndentedString(CONTACTINFOS)).append("\n");
    sb.append("    DATES: ").append(StringUtil.toIndentedString(DATES)).append("\n");
    sb.append("    TAGS: ").append(StringUtil.toIndentedString(TAGS)).append("\n");
    sb.append("    LINKS: ").append(StringUtil.toIndentedString(LINKS)).append("\n");
    sb.append("    ORGANISATIONLINKS: ").append(StringUtil.toIndentedString(ORGANISATIONLINKS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
